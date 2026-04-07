#include<bits/stdc++.h>
using namespace std ;

int main(){
    vector<int> arr = {1,1,0,1,0,1};
    int count = 0;
    for (int a : arr){
        if (a == 1) count++ ;
    }
    cout << count << endl;
    return 0;
}