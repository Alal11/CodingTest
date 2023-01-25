#include <stdio.h>

int main()
{
	int a;

	scanf("%d", &a);

	for (int i = 0; i < a; i++)
	{
		for (int j = 0; j < i; j++)
		{
			printf(" ");
		}
		for (int k = a - i; k > 0; k--)
		{
			printf("*");
		}
		printf("\n");
	}
}
