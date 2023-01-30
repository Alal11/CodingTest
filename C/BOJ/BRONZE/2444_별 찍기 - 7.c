#include <stdio.h>

int main()
{
	int n, cnt = 1;

	scanf("%d", &n);

	for (int i = 0; i < n; i++)
	{
		for (int j = n-i-1; j > 0; j--)
		{
			printf(" ");
		}
		for (int k = 0; k < 2 * cnt - 1; k++)
		{
			printf("*");
		}
		cnt++;
		printf("\n");
	}

	for (int a = 0; a < n - 1; a++)
	{
		for (int b =0; b < a+1; b++)
		{
			printf(" ");
		}
		for (int c = 2*cnt-5; c>0; c--)
		{
			printf("*");
		}
		cnt--;
		printf("\n");
	}
}
