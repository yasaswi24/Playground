#include<stdio.h>
#include<math.h>
int main()
{
  //type your code here
  int n,t;
  scanf("%d",&n);
  
  if(n%2==0)
  { 
   
    t=n/2;
 //   printf("%d",t);
    printf("%d",(int)pow(3,t-1));
  }
  else 
  {
    t=(n+1)/2;
    printf("%d",(int)pow(2,t-1));
  }
  return 0;
}