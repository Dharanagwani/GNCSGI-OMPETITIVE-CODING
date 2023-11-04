# GNCSGI-OMPETITIVE-CODING
#include <iostream>
using namespace std;

int main() {
	int N,X;
	cin>>N>>X;
	int A[N],B[N];
 cout<<"Enter freshness value of items: ";
	for(int i=0;i<N;i++){
	    cin>>A[i];
	}
  cout<<"Enter cost of items:";
	for(int i=0;i<N;i++){
	    cin>>B[i];
	}
	int sum=0;
	for(int i=0;i<N;i++){
	    if(A[i]>=X){
	        sum=sum+B[i];
	    }
	}
	cout<<"Total cost is "<<sum;
	return 0;
}

