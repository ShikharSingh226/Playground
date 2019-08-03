#include<stdio.h>

int main()
{


    double a, b, c;

    
    scanf("%lf%lf%lf", &a, &b, &c); 


    if(a >= b && a >= c)
    {
        if(b >= c)
        {
          
            printf("%lf ", b);
        }
        else
        {
            printf("%lf", c);
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            printf("%lf",a);
        }
        else
        {
            printf("%lf",c);
        }
    }

    else if(a >= b)
    {
        printf("%lf", a);}
        else
        {
        printf("%f ", b);
        }
    
    
    return 0;
}