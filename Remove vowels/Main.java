#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
  for(int i=0;i<strlen(str);i++)
  {
    if(str[i]=='a'||str[i]=='A'||str[i]=='e'||str[i]=='E'||str[i]=='i'||str[i]=='I'||str[i]=='o'||str[i]=='O'||str[i]=='U'||str[i]=='u')
      continue;
    else
      printf("%c",str[i]);
  //Type your code here
  }
  return 0;
}