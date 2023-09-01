#include <stdio.h>
#include<string.h>

int main()
{
    char s[50];
    int c=0;
    scanf("%s",s);
    
    int a=strlen(s);
    for(int i=0;i<a/2;i++){
        s[i]=tolower(s[i]);
        if(s[i]==s[a-i-1]){
            c++;
        }
    }
    if(c==a/2){
        printf("palindrome");
    }
    else{
        printf("not palindrome");
    }

    return 0;
}
