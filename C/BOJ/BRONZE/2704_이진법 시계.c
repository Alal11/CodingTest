#include <stdio.h>

void binary(int arr[], int n)
{
	int i = 0;
	while (n > 0)
	{
		arr[i] = n % 2;
		n /= 2;
		i++;
	}
}


int main()
{
	int N;
	int h, m, s;
	int i, j;

	scanf("%d", &N);

	for (j = 0; j < N; j++)
	{
		scanf("%d:%d:%d", &h, &m, &s);

		int bin_h[6] = { 0 };
		int bin_m[6] = { 0 };
		int bin_s[6] = { 0 };

		binary(bin_h, h);
		binary(bin_m, m);
		binary(bin_s, s);

		for (i = 5; i >= 0; i--)
			printf("%d%d%d", bin_h[i], bin_m[i], bin_s[i]);
		printf(" ");

		for (i = 5; i >= 0; i--)
			printf("%d", bin_h[i]);
		for (i = 5; i >= 0; i--)
			printf("%d", bin_m[i]);
		for (i = 5; i >= 0; i--)
			printf("%d", bin_s[i]);

		printf("\n");
	}
	return 0;
}
