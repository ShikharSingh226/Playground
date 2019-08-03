#include<stdio.h>
int main()
{
  char a[20];int i,c=0;
  fgets(a,20,stdin);
  for(i=0;a[i]!='\0';i++)
  {
    c++;
  }
  printf("%d",c);
  
  
  //Type your code here
  return 0;
}