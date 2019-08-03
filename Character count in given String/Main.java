#include<stdio.h>
#include<string.h>
int main()
{
	//type your code here
  char s[20];
  char start,current;
  int count=1;
  scanf("%s",s);
  start=s[0];
  int l=strlen(s);
  if(l<=20)
  {
  
  for(int i=1; ;i++)
  { 
    current=s[i];
    if(start==current)
    { 
      count++;
    }
    else
    {
       printf("%c%d",start,count);
      count=1;
      start=current;
    }
    if(s[i]=='\0')
      break;
  }
  }
  else 
    printf("Invalid Input");
  return 0;
      
}