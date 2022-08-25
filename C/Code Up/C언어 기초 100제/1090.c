#include <stdio.h>
int main()
{
	long a, r, n;

	scanf("%ld %ld %ld", &a, &r, &n);
	for (int i = 1; i < n; i++)
	{
		a *= r;
	}
	printf("%ld\n", a);

	return 0;
}
