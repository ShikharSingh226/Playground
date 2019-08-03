#include<stdio.h>

void main()
{
 int i,j,len;
 char sent[100];


 gets(sent);
 for(len=0;sent[len]!='\0';len++);
 for(i=0;i<len;i++)
 {
  if(sent[i]=='a'||sent[i]=='e'||sent[i]=='i'||sent[i]=='o'||sent[i]=='u'||
   sent[i]=='A'||sent[i]=='E'||sent[i]=='I'||sent[i]=='O'||sent[i]=='U')
  {
   for(j=i;j<len;j++)
   {
    sent[j]=sent[j+1];
   }
   i--;
  }
 }
 
 puts(sent);

}