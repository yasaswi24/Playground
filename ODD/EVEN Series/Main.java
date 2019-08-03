#include<stdio.h>
int main()
{
	//type your code here
  int n,t;
  scanf("%d",&n);
  if(n%2==0)
  { 
    t=n/2;
    printf("%d",0+(t-1)*1);
  }
  else
  { 
    t=(n+1)/2;
    printf("%d",0+(t-1)*2);
  }
	
}