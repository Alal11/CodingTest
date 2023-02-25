#include <stdio.h>

int main(void)
{
	int n, cnt;

	scanf("%d", &n);

	cnt = n;

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < i; j++)
		{
			printf(" ");
		}
		for (int k = 0; k < 2 * cnt - 1; k++)
		{
			printf("*");
		}
		cnt--;
		printf("\n");
	}
	cnt = n - 2;
	for (int i = 0; i < n - 1; i++)
	{
		for (int j = 0; j < cnt; j++)
		{
			printf(" ");
		}
		cnt--;
		for (int k = 0; k < 2 * i + 3; k++)
		{
			printf("*");
		}
		printf("\n");
	}
}
