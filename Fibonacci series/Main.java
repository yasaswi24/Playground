#include<stdio.h>
int main()
{
  //Type your code here
  int a=0,b=1,n,s=0,i;
  scanf("%d",&n);
  printf("%d %d ",a,b);
  for(i=0;i<n-2;i++)
  { 
    s=a+b;
    a=b;
    b=s;
    printf("%d ",s);
  }
  return 0;
}