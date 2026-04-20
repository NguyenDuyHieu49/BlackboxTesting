#include <iostream>
using namespace std;

int main() {
    int thang, nam;
    cin >> thang >> nam;

    if(thang < 1 || thang > 12) {
        cout << "Du lieu khong hop le";
        return 0;
    }

    switch(thang) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            cout << "31 ngay";
            break;

        case 4: case 6: case 9: case 11:
            cout << "30 ngay";
            break;

        case 2:
            if((nam%400==0) || (nam%4==0 && nam%100!=0))
                cout << "29 ngay";
            else
                cout << "28 ngay";
    }

    return 0;
}