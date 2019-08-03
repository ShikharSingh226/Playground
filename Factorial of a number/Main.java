#include <stdio.h>
int main()
{
    int number, i,sum=1;
    
    scanf("%d",&number);
   
    for(i=1; i <= number; ++i)
    {
      sum=sum*i;
    }
            printf("%d\n",sum);
        
    
    return 0;
}