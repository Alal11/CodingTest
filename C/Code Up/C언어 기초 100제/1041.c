#include <stdio.h>

int main(void)
{
	char a;

	scanf("%c", &a, sizeof(a));
	printf("%c", a + 1);

	return 0;
}
