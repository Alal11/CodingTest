#include <stdio.h>

int main()
{
	int n, m;

	scanf("%d", &n);
re:
	scanf("%d", &m);

	printf("%d\n", m);
		if (n-- != 1){
		goto re;
	}
	return 0;
}
