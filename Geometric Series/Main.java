#include<stdio.h>
int main()
{
  int a,i;
  scanf("%d",&a);
if(a%2==0)
{
  int n=a/2;
  int d=n-1;
  int p=pow(3,d);
  printf("%d",p);
}else 
{
  int n=(a+1)/2;
  int d=n-1;
  int p=pow(2,d);
  printf("%d",p);
}
  //type your code here
  return 0;
}