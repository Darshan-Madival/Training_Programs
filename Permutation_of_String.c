#include<stdio.h>
void print(char a[],int n){
    for(int i=0;i<n-1;i++){
        printf("%c",a[i]);
    }
    printf("\n");
}
void main(){
    char a[]="abc";
    int i,j,temp;
    for(i=0;i<4-1;i++){
        for(j=0;j<4-2;j++){
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
            print(a,4);
        }
    }
    
}