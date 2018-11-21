#include <iostream>
using namespace std;
int main() {
	int sum=2;
	int next=0,first=1,second=2;
	while(!(next>20))
	{  
	    next=first+second;
	    first=second;
	    second=next;
	    if(next%2==0)sum+=next;
	}
	cout<<sum;
	return 0;
}
