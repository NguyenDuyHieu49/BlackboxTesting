#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    if(n <= 0) {
        cout << "Du lieu khong hop le";
        return 0;
    }

    int sum = 0;

    for(int i=1;i<=n;i++){
        if(i%2==0)
            sum -= i;
        else
            sum += i;
    }

    cout << sum;

    return 0;
}