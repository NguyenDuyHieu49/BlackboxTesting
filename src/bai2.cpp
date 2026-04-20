//bai 2
#include <iostream>
using namespace std;

int main() {
    float a, b;
    cin >> a >> b;

    if(a <= 0 || b <= 0) {
        cout << "Du lieu khong hop le";
    } else {
        cout << "Dien tich = " << a*b;
    }

    return 0;