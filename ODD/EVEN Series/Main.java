#include<stdio.h>
int main(){
int a,i,s=0,f=0;
scanf("%d",&a);
for(i=0;i<a;i++){
  if(i%2!=0)
    s+=2;
  else f+=1;
}
if(a%2==0)printf("%d",f-1);
else printf("%d",s);
  

return 0;
}