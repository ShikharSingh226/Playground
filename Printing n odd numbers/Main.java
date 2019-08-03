#include <stdio.h>

int main()
{
    int i, n,num=0;
    
   
   
    scanf("%d", &n);


    for(i=1; i<=n; i++)
    {
    num+=1;
        if(num%2!=0)
        {
            printf("%d\n", num);num++;
        }
    }

    return 0;
}