#include <stdio.h>

int main()
{
	char n, i='a';

	scanf("%c", &n);

	while (i<=n) {
		printf("%c ", i);
		i++;
	}
	return 0;
}
