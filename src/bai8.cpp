#include <iostream>
using namespace std;

long long giaithua(int n){
    long long gt = 1;
    for(int i=1;i<=n;i++)
        gt *= i;

    return gt;
}

int main(){
    int n;
    cin >> n;

    if(n <= 0){
        cout << "Du lieu khong hop le";
        return 0;
    }

    long long sum = 0;

    for(int i=1;i<=n;i++)
        sum += giaithua(i);

    cout << sum;

    return 0;
}