#include<iostream>
using namespace std;
int main(){
    int a[]={1,2,3,4,5,6,7,8,9,10};
        cout << "Enter the number you want to search :: ";
        int num,flag=0;
        cin >> num;
        for(int i=0;i<sizeof(a);i++){
            if(a[i]==num){
                cout << "Number found at index number " << i ;
                flag=1;
            }
        }
        if(flag==0)
        cout << "Number not found";
    return 0;
}