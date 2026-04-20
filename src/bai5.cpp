#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    if(n < 2) {
        cout << "Khong phai so nguyen to";
        return 0;
    }

    for(int i=2;i*i<=n;i++){
        if(n%i==0){
            cout << "Khong phai so nguyen to";
            return 0;
        }
    }

    cout << "La so nguyen to";
    return 0;
}