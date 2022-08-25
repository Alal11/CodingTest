#include <stdio.h>
int main()
{
	int n, i;

	scanf("%x", &n);
	getchar();

	for (i = 1; i <= 15; i++) {
		printf("%x*%x=%x\n", n, i, n * i);
	}
	return 0;
}
