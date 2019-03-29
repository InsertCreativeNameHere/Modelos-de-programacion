//AUTOR: BETAPANDERETA
#include<iostream>
#include<math.h>
//# define PI           3.14159265358979323846  /* pi */		Constantes útiles, funciones trascendentes
//# define e		2.71828182845904523536	/* e */
using namespace std;

int main()
{
	int n;
	double a,b,Dx,Fxo,Fx,Fx2,Fx4,A,a2,a3,At;
	
	cout<<"Digite a: \t";cin>>a;
	cout<<"Digite b: \t";cin>>b;
	cout<<"Digite n: \t";cin>>n;
	double num[n+1],num3[n+1],num4[n+1];
	
	if( n%2==0)//Evalua si n es par, de lo contrario, no se podrá ejecutar Simpson
	{	
		Dx=(b-a)/n;
		cout<<"DeltaX= "<<Dx<<"\n\n";
		num[0] = a;
		cout<<"X0:"<<num[0]<<"\t";
		Fxo=13*sqrt(tan(num[0]));
		cout<<"F(x0):"<<Fxo<<"\t"<<"\n\n";
		
		for (int i=1; i<=n; i++)
		{	
			num[i]=num[i-1]+Dx;					
			cout<<"X"<<i<<":"<<num[i]<<"\t";
			Fx=13*sqrt(tan(num[i]));			
			cout<<"F(x"<<i<<"):"<<Fx<<"\t";

			if(i%2!=0&& i!=n)				
			{
				num3[i]=Fx2=Fx*2;				
				cout<<"2*F(X"<<i<<"): "<<Fx2<<"\t";
			}
			if(i%2==0 && i!=n)
			{
				num4[i]=Fx4=Fx*4;				/
				cout<<"4*F(X"<<i<<"): "<<Fx4<<"\t";
			}
			
			a2=num3[i]+=num3[i-1];				
			a3=num4[i]+=num4[i-1];				
			A=a2+a3;							
			cout<<"\n\n";
		}
		At=(Dx/3)*(A+Fx+Fxo);					
		
		cout<<"El area aproximada de la region acotada por la curva"  ", y las rectas x= "<<a<<" y x= "<<b<<"\tes: "<<At<<"\tUnidades cuadradas\n\n";	                    	
	}
	system("pause");
}
