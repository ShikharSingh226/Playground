#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
        if(a<=5){
          
          if(a==1)
            printf("One");
          else if(a==2)
            printf("Two");
          else if(a==3)
            printf("Three");
          else if(a==4)
            printf("four");
          else 
            printf("five");
        }
  else printf("Invalid");
  //Type your code here
  return 0;
}