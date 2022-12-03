#include <stdio.h>

int main()
{
	int i, j, n;
	long long t[36] = { 0 };

	scanf("%d", &n);

	t[0] = 1;

	for (i = 1; i < n + 1; i++)
	{
		for (j = 0; j < i; j++)
		{
			t[i] += t[j] * t[i - j - 1];
		}
	}
	printf("%lld\n", t[n]);

	return 0;
}
