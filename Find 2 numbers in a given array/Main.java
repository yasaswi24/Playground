#include<stdio.h>
int main()
{
  	//type your code here
  int n,a[100],i,k,p,count=0,fla=0;

  scanf("%d",&n);
    for(i=0;i<n;i++)
      scanf("%d",&a[i]);
  scanf("%d%d",&k,&p);
  for(i=0;i<n;i++)
  { 
    if(a[i]==k) 
    {
      count++;
      printf("Element 1 index = %d\n",i);
    }
  }
   if(count==0)
     printf("Element 1 index = -1\n");
   for(i=0;i<n;i++)
  { 
   
    if(a[i]==p)
    { 
      fla++;
      printf("Element 2 index = %d\n",i);
    }
  }
 
  if(fla==0)
     printf("Element 2 index = -1\n");
  return 0;
        
}