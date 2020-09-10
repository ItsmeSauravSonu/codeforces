#include <iostream>
using namespace std;
int n, sum = 0;
string str, s[1001];
int main() {
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> str;
        if (str[0] == 'O' && str[1] == 'O' && sum == 0) {
            str[0] = '+';
            str[1] = '+';
            sum = 1;
        } else if (str[3] == 'O' && str[4] == 'O'&& sum == 0) {
            str[3] = '+';
            str[4] = '+';
            sum = 1;
        }
        s[i] = str;
    }
    if (sum == 1) {
        cout << "YES" << endl;
        for (int i = 0; i < n; i++) {
            cout << s[i] << endl;
        }
    } else {
        cout << "NO";
    }
}