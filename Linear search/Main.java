#include<stdio.h>
int main()
{
  int a[10],n,i,ss,as=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++){
    scanf("%d",&a[i]);
  }scanf("%d",&ss);
  for(i=1;i<=n;i++){
    if(ss==a[i])
      as=i;
  }
  if(as==0)printf("%d isn't present in the array.",ss);
  else printf("%d",as);
  
  
  
  //Type your code here
  return 0;
}