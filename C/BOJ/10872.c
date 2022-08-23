#include <stdio.h>

int main(void)
{
	int num, i;
	int result = 1;

	scanf_s("%d", &num);

	for (i = 1; num >= i; i++)
		result = result * i;

	printf("%d", result);

	return 0;
}
