#include <stdio.h>
#include <math.h> 
void main()
{
    int num, last ;
   int c=0,d;
    scanf("%d", &num);
 int a=num;
    while(num>0)
    {
        num/=10;c++;
    }while(c>1)
    {
      d=a%10;
        a/=10;c--;
    }
   
    printf("%d\n", d);
}