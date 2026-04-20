//bai 1
#include <iostream>
using namespace std;

int main() {
    float a, b;
    cout << "Nhap chieu dai: ";
    cin >> a;
    cout << "Nhap chieu rong: ";
    cin >> b;

    if(a <= 0 || b <= 0) {
        cout << "Du lieu khong hop le";
    } else {
        cout << "Chu vi = " << 2*(a+b);
    }

    return 0;
}