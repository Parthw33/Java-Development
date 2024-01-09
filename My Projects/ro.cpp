#include <bits/stdc++.h>

using namespace std;

string convertTime(string s) {
    int h = stoi(s.substr(0,2));
    int m = stoi(s.substr(3,2));
    int sec = stoi(s.substr(6,2));
    string ampm = s.substr(8,2);  
    string r;  
    if(ampm=="PM" && h!=12){
        h+=12;
        if(m<10 && sec<10 && m==0 || sec==0){
            r= to_string(h)+":0"+to_string(m)+":0"+to_string(sec);
        }
    }
    if(ampm=="AM" && h==12){
        h=0;if(m<10 && sec<10 && m==0 || sec==0){
            r= to_string(h)+":0"+to_string(m)+":"+to_string(sec);
        }
    }
    return r;
}

int main() {
    // Your code here
    string s;
    s= "11:01:00AM";
    cout << convertTime(s) << endl;

    return 0;
}
