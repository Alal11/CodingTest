#include <stdio.h>

int main(void)
{
	char a[51];

	scanf("%s", a, sizeof(a));
	printf("%s", a);

	return 0;
}
