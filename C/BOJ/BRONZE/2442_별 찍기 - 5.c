#include <stdio.h>

int main()
{
	int n, cnt = 0;

	scanf("%d", &n);

	for (int i = 0; i < n; i++)
	{
		for (int j = n - 1; j > i; j--)
		{
			printf(" ");
		}
		cnt += 1;
		for (int k = 1; k <= (2 * cnt) - 1; k++)
		{
			printf("*");
		}
		printf("\n");
	}
}
