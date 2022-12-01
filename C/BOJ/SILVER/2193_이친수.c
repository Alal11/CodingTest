#include <stdio.h>

int main()
{
	int i, n;
	long long DP[91] = { 0 };
	
	scanf("%d", &n);

	DP[1] = 1;
	DP[2] = 1;

	for (i = 3; i <= n; i++)
	{
		DP[i] = DP[i - 2] + DP[i - 1];
	}
	printf("%lld\n", DP[n]);

	return 0;
}
