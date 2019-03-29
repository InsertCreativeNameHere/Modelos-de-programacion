import tweepy
import numpy as np
import pandas as pd
import statistics as st
import matplotlib.pyplot as plt

auth = tweepy.OAuthHandler("jM4TxvKzLDE1azj2BMkQyhC1V", "gXFbOV79L9bodjlUingPAdy3cqPwdT7Y5KmvFUnaE8xLeKPWw4")
auth.set_access_token("2801160593-Od19h2hBhZCtmkbpc2EkCDToNtlsmrYE6EUySDt", "xnwlxQSRlieD35SbdwKoaKBVvBycu1HXMqUJBfIwao2Nh")

api = tweepy.API(auth)

numero_de_tweets=5000
busqueda="Bogota"

buscados = []
ultimo_tweet = -1

while len(buscados) < numero_de_tweets:
    cuenta = numero_de_tweets - len(buscados)
    nuevos = api.search(q=busqueda,count=cuenta, max_id=str(ultimo_tweet - 1), show_user = False, tweet_mode='extended')
    if not nuevos:
        break
    buscados.extend(nuevos)
    ultimo_tweet = nuevos[-1].id

texto = []
fuente = []
texto2 = []

for tweets in buscados:
    texto.append(tweets.full_text)
    fuente.append(tweets.source)
    texto2.extend(tweets.full_text)

t1 = np.asarray(texto)
f1 = np.asarray(fuente)
t2 = np.asarray(texto2)

m = []
j = 0
k = 0
for i in range(t1.size + f1.size):
    if i%2 == 0:
        m.append(t1[j])
        j = j+1
    else:
        m.append(f1[k])
        k = k+1

m1 = np.reshape(m,(5000,2))
hashtags = []
counter=0

#encuentra todos los hashtags
for i in range(t2.size):
    if(t2[i] == "#"):
       for j in range (i,t2.size):
           if(t2[j] == ' ' or t2[j] =='.' or t2[j] =='@' or t2[j] ==','or t2[j]==':'):
               hashtag = ''.join(t2[i:j])
               hashtags.append(hashtag)
               i=j
               break

#cuenta la cantidad de veces que sale cada hashtag
hashtags2 = []
numhash = []
count = 0
for i in range(len(hashtags)):
    repetido = False;
    seleccionado = hashtags[i]
    for j in range(len(hashtags2)):
        if seleccionado == hashtags2[j]:
            repetido = True;
            break;
    if(repetido == False):
        for k in range(i,len(hashtags)):
            if seleccionado == hashtags[k]:
                count = count + 1
        numhash.append(count)
        hashtags2.append(seleccionado)
    count = 0

h = []
j = 0
k = 0
for i in range(len(numhash) * 2):
    if i%2 == 0:
        h.append(hashtags2[j])
        j = j+1
    else:
        h.append(numhash[k])
        k = k+1

h1 = np.reshape(h,(len(numhash),2))
hashtagsdf = pd.DataFrame(data=h1, columns=["Hashtag","Cant"])

mediahash = len(hashtags)/len(hashtags2)
medianahash = st.median_grouped(numhash)
modahash = st.mode(hashtags)
hashtagsdf.Cant = hashtagsdf.Cant.astype(float)

top5 = [-1,-2,-3,-4,-5]
for i in range(5):
    maximotemp = hashtagsdf['Cant'][(hashtagsdf['Cant'] != top5[0]) & (hashtagsdf['Cant'] != top5[1]) & (hashtagsdf['Cant'] != top5[2]) & (hashtagsdf['Cant'] != top5[3]) & (hashtagsdf['Cant'] != top5[3]) & (hashtagsdf['Cant'] != top5[4])].max()
    top5[i] = maximotemp

porcentajehash = []
for i in range(5):
    v = (top5[i] * 100)/(top5[0] + top5[1] + top5[2] + top5[3] +top5[4] )
    porcentajehash.append(v)
    
titulos = hashtagsdf['Hashtag'][hashtagsdf['Cant'] == top5[0]].to_string(index= False),hashtagsdf['Hashtag'][hashtagsdf['Cant'] == top5[1]].to_string(index= False),hashtagsdf['Hashtag'][hashtagsdf['Cant'] == top5[2]].to_string(index= False),hashtagsdf['Hashtag'][hashtagsdf['Cant'] == top5[3]].to_string(index= False),hashtagsdf['Hashtag'][hashtagsdf['Cant'] == top5[4]].to_string(index= False)    
tamaños = [top5[0],top5[1],top5[2],top5[3],top5[4]]
explode = (0,0,0,0,0)

fig1, ax1 = plt.subplots()
ax1.pie(tamaños,explode=explode,labels=titulos, autopct='%1.1f%%',
        shadow=True, startangle=90)
ax1.axis('equal')

plt.show()
print("La media de la cantidad de tweets por hashtag es: ", mediahash)
print("La mediana de la cantidad de tweets por hashtag es: ", medianahash)
print("El Hashtag mas usado fue: ", modahash)

personas=[]
numper = []
for i in range(t2.size):
    if(t2[i] == "@"):
       for j in range (i,t2.size):
           if(t2[j] == ' ' or t2[j] =='.' or t2[j] =='#' or t2[j] ==','or t2[j]==':'):
               user = ''.join(t2[i:j])
               for k in range (len(personas)):
                   if (user == personas[k]):
                       counter=counter+1
               if (counter==0):
                   personas.append(user)
               else:
                   numper.append(counter)
               counter=0
               i=j
               break
#Cuenta la cantidad de veces que se etiqueta un usuario   
personas2 = []
numper = []
count = 0
for i in range(len(personas)):
    repetido = False;
    seleccionado = personas[i]
    for j in range(len(personas2)):
        if seleccionado == personas2[j]:
            repetido = True;
            break;
    if(repetido == False):
        for k in range(i,len(personas)):
            if seleccionado == personas[k]:
                count = count + 1
        numper.append(count)
        personas2.append(seleccionado)
    count = 0

h = []
j = 0
k = 0
for i in range(len(numper) * 2):
    if i%2 == 0:
        h.append(personas2[j])
        j = j+1
    else:
        h.append(numper[k])
        k = k+1

h1 = np.reshape(h,(len(numper),2))
personasdf = pd.DataFrame(data=h1, columns=["Usuario","Cant"])

mediaper = len(personas)/len(personas2)
medianaper = st.median_grouped(numper)
modaper = st.mode(personas)
personasdf.Cant = personasdf.Cant.astype(float)

top5 = [-1,-2,-3,-4,-5]
for i in range(5):
    maximotemp = personasdf['Cant'][(personasdf['Cant'] != top5[0]) & (personasdf['Cant'] != top5[1]) & (personasdf['Cant'] != top5[2]) & (personasdf['Cant'] != top5[3]) & (personasdf['Cant'] != top5[3]) & (personasdf['Cant'] != top5[4])].max()
    top5[i] = maximotemp

porcentajeper = []
for i in range(5):
    v = (top5[i] * 100)/(top5[0] + top5[1] + top5[2] + top5[3] +top5[4] )
    porcentajeper.append(v)
    
titulos = personasdf['Usuario'][personasdf['Cant'] == top5[0]].to_string(index= False),personasdf['Usuario'][personasdf['Cant'] == top5[1]].to_string(index= False),personasdf['Usuario'][personasdf['Cant'] == top5[2]].to_string(index= False),personasdf['Usuario'][personasdf['Cant'] == top5[3]].to_string(index= False),personasdf['Usuario'][personasdf['Cant'] == top5[4]].to_string(index= False)    
tamaños = [top5[0],top5[1],top5[2],top5[3],top5[4]]
explode = (0,0,0,0,0)

fig2, ax2 = plt.subplots()
ax2.pie(tamaños,explode=explode,labels=titulos, autopct='%1.1f%%',
        shadow=True, startangle=90)
ax2.axis('equal')

plt.show()
print("La media de la cantidad de tweets por Usuario es: ", mediaper)
print("La mediana de la cantidad de tweets por Usuario es: ", medianaper)
print("El Usuario mas nombrado fue: ", modaper)

