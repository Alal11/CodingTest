#include <stdio.h>

int main(void)
{
	char a;

	scanf("%c", &a, sizeof(a));
	printf("%d", a);

	return 0;
}
