#include <iostream>
#include <stdio.h>
#include <math.h>

using namespace std;

int main(int argc, char** argv) {
	
	float J;
	float K;
	double resultado;
	double total_uno, total_dos;
	
	
	while(cin>>J && cin>>K){	
		if(J==0&&K==0){
			exit(0);
		}		
		K=(K/100);
		resultado=((pow((J/2),2))-(pow(K,2)))/(2*K);
		
		total_uno = floor(resultado);
		total_dos = ceil((resultado - total_uno)*10);
		cout << total_uno << "," << total_dos << endl;
		//cout<<resultado<<endl;
	}
	
	return 0;
}
