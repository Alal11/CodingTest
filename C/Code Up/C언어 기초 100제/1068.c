#include <stdio.h>

int main(void)
{
	int a;

	scanf("%d", &a);

	if (a >= 90)
		printf("a");
	else if (a >= 70)
		printf("b");
	else if (a >= 40)
		printf("c");
	else
		printf("d");
	return 0;
}
