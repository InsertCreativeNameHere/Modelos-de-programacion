while(True):
    lista = []
    numeros = []
    entrada = input()
    if(entrada == "0"):
        break;
    entrada = list(entrada)
    
    for x in range(0,len(entrada)):
        if(entrada[x] == " " or entrada[x] == "“" or entrada[x]=="”"):
            continue
        numeros.append(entrada[x])    
    
    generacion = []
    generacion.append(numeros[0])
    
    for i in range(0,int(numeros[len(numeros) - 1])+1):
        mayor = False
        menor = False
        lista.append(generacion)
        generacion = []
        if( i == int(numeros[len(numeros) - 1])+1):
            break;
        for j  in range (i,len(numeros)):
            if(mayor and menor):
                break
            if(numeros[i] > numeros[j] and mayor == False):
                generacion.append(int(numeros[j]))
                mayor = True
            if(numeros[i] < numeros[j] and menor == False):
                generacion.append(int(numeros[j]))
                menor = True
    suma = 0
    for k in range (0,len(lista[int(numeros[len(numeros) - 1])])):
        suma = int(lista[int(numeros[len(numeros) - 1])][k]) + suma
        
    print(suma)