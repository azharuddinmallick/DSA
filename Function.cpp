#include<iostream>
using namespace std;

void printName(string name){
    cout << name;
}
int main(){
    string name;
    cin >> name;
    printName(name);
    return 0;
}