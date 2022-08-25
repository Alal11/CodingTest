#include <stdio.h>
int main()
{
	long a, m, d, n, i;

	scanf("%ld %ld %ld %ld", &a, &m, &d, &n);

	for (i = 1; i < n; i++) {
		a = a * m + d;
	}
	printf("%ld\n", a);
	return 0;
}
