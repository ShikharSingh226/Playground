#include<stdio.h>
#include<string.h>
int main()
{
  char a[20],chr;
  int i,j,c=1;
  scanf("%s",a);
  int l=strlen(a);
  if(l<=20){             
  char ch=a[0];
  for(i=1; ;i++)
  {
 
    
   chr=a[i];
      if(ch == chr)
        c++;
    else {
      printf("%c%d",ch,c);
      c=1;
      ch=chr;
    
    }
    
    if(a[i]=='\0')
       break;
    }
  }
  else printf("Invalid Input");
  
 return 0;
	//type your code here
}