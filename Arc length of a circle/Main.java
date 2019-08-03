#include<stdio.h>
int main()
{
 float a,r,c;
  scanf("%f %f",&r,&c);
 a = 2 * 3.14 * r * (c/360);
 printf("%.2f",a);
 return(0);
}