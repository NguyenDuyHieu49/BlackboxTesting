#include <iostream>
using namespace std;

int main() {
    int a,b;
    cin >> a >> b;

    if(a<0 || b<0){
        cout << "Du lieu khong hop le";
        return 0;
    }

    while(b!=0){
        int t = b;
        b = a % b;
        a = t;
    }

    cout << "UCLN = " << a;

    return 0;
}