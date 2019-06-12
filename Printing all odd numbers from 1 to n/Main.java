#include <stdio.h>
int main() {
  int count;
  int n;
  count=1;
  scanf("%d",&n);
  while(count<=n)
  {
    if(count%2!=0)
      printf("%d\n",count);
    count++;
  }
	//Type your code
	return 0;
}