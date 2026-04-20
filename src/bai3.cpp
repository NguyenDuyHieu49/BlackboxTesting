//bai 3
#include <iostream>
#include <cmath>
using namespace std;

int main() {
    float a,b,c;
    cin >> a >> b >> c;

    if(a == 0) {
        if(b == 0) {
            if(c == 0)
                cout << "Vo so nghiem";
            else
                cout << "Vo nghiem";
        }
        else
            cout << "Nghiem: " << -c/b;
    }
    else {
        float delta = b*b - 4*a*c;

        if(delta < 0)
            cout << "Vo nghiem";
        else if(delta == 0)
            cout << "Nghiem kep: " << -b/(2*a);
        else {
            float x1 = (-b + sqrt(delta))/(2*a);
            float x2 = (-b - sqrt(delta))/(2*a);

            cout << "x1 = " << x1 << endl;
            cout << "x2 = " << x2;
        }
    }

    return 0;
}