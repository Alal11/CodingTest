#include <stdio.h>

int main()
{
	int n, hap = 0;

	scanf("%d", &n);

	for (int i = n; i >= 0; i--) {
		hap += i;
	}

	printf("%d\n", hap);

	return 0;
}
