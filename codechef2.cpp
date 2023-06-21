#include <iostream>
using namespace std;

//Ques 1. Distinct Palindrome
void dist(long long int n, long long int x){
    long long int half = n/2;
    
    string s;
    
    if(n%2 == 0){
        if(x>half){
            cout<<-1;
            return;
        }
        char y = 'a';
        for(int i=0; i<x; i++){
            s.push_back(y);
            y++;
        }
        if(x<half){
            long long int diff = half - x;
            for(int i=0; i<diff; i++){
                s.push_back('a');
            }
        }
        string k;
        int z = 0;
        for(int i=s.size()-1; i>=0; i--){
            k.push_back(s[i]);
            z++;
        }
        string m = s + k;
        cout<<m;
        return;
    }
    
    if(n%2 != 0){
        if((x-1) > half){
            cout<<-1;
            return;
        }
        if(x == 1){
            string s;
        char y = 'a';
        for(int i=0; i<n; i++){
            s.push_back(y);
        }
        cout<<s;
        return;
        }
        string s;
        char y = 'a';
        for(int i=0; i<x-1; i++){
            s.push_back(y);
            y++;
        }
        if(x-1< half){
            long long int diff = half - (x- 1);
            for(int i=0; i<diff; i++){
                s.push_back('a');
            }
        }
        string k;
        int z = 0;
        for(int i= s.size()-1; i>= 0; i--){
            k.push_back(s[i]);
            z++;
        }
        s.push_back(y);
        string m = s+k;
        cout<<m;
        return;
    }
}

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	   long long int n,x;
	    cin>>n>>x;
	     if(x>26){
	         cout<<-1<<endl;
	     }else{
	         dist(n,x);
	         cout<<endl;
	     }
	}
	return 0;
}

//Ques 2. Isolation Centers

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    int n, q;
	    cin>>n>>q;
        string s;
        cin>>s;
        int c;
        sort(s.begin(), s.end());
        for(int i=0; i<q; i++){
            int ans = 0;
            int cnt = 1;
            cin>>c;
            for(int j=0; j<s.length(); j++){
                if(s[j] == s[j+1]){
                    cnt++;
                    }else{
                        if(cnt>c){
                            ans = ans+(cnt-c);
                        }
                        cnt = 1;
                    }
            }
                cout<<ans<<endl;
            }
        }
	return 0;
}

//Ques 3. Is this priority or parity!

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    long long int n, k;
	    cin>>n>>k;
	    if(n == 1 || k == 1){
	        if(n%2 == 0){
	            cout<<"EVEN"<<endl;
	        }else{
	            cout<<"ODD"<<endl;
	        }
	    }else if(k == 2){
	        cout<<"ODD"<<endl;
	    }else if(k > 2){
	        cout<<"EVEN"<<endl;
	    }
	}
	return 0;
}

//Ques 4. Smallest Possible Whole Number

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    int n, k;
	    cin>>n>>k;
	    if(k == 0){
	        cout<<n<<endl;
	    }else{
	        cout<<n%k<<endl;
	    }
	    
	}
	return 0;
}

// Ques 5. The Ball And Cups

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    int n, c, q;
	    cin>>n>>c>>q;
	    int l,r;
	    for(int i=0; i<q; i++){
	        cin>>l>>r;
	        if(c >=l && c<= r){
	            c = r - c + l;
	            }
	    }
	    cout<<c<<endl;
	}
	return 0;
}
