#include <stdio.h>
 
main()
{
    int num, last ;
    
    scanf("%d", &num);
 
    last = num%10;
   
 
    while(num>=10)
    {
        num = num/10;
    }
 
  int sum =last+num;
  printf("%d",sum);
}