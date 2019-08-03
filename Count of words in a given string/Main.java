#include<stdio.h>
#include<string.h>

int main()
{
  //Type your code here
  int count=1;
 char s[100];
  scanf("%[^\n]",s);
  for(int i=0;i<=strlen(s);i++)
  {  if(s[i]==' ')
      count++;
  }
  printf("%d",count);
}