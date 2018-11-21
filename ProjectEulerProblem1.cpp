#include <iostream>
using namespace std;
int main() {
	int sumthree=0;
	int sumfive=0,sumfifteen=0;
	for(int i=3;i<1000;i=i+3)
	{sumthree+=i;}
	for(int i=5;i<1000;i=i+5)
	{sumfive+=i;if(i%15==0)sumfifteen+=i;}
	sumfive+=sumthree;
	cout<<sumfive-sumfifteen;
	return 0;
}
