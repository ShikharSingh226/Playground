#include<stdio.h>
void main()
{
  int a[10],n,i,g,h,ans1=-1,ans2=-1;
  scanf("%d",&n);
  for(i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  scanf("%d %d",&g,&h);
  for(i=0;i<n;i++)
  {
    if(g==a[i]&&ans1==-1)
      ans1=i;
    if(h==a[i]&&ans2==-1)
    ans2=i;      
  }
    
  printf("Element 1 index = %d\n",ans1);

    printf("Element 2 index = %d",ans2);
    
    
   
  	
}