#include <stdio.h>
#include <math.h>
int main()
{
  int a,b;
  scanf("%d %d",&a,&b);
  if(b<0)
    printf("Wrong input");
  else {
    int s=pow(a,b);
    printf("%d",s);
  	//Your code here       
    return 0;}
}