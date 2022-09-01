#include <stdio.h>

int main(void)
{
	int A, B, C;

	scanf("%d %d", &A, &B);
	scanf("%d", &C);

	if ((60 * A + B + C) >= 1440) {
		
		printf("%d %d", ((60 * A) + B + C - 1440) / 60, ((60 * A) + B + C - 60) % 60);
	}
	else
		printf("%d %d", (60 * A + B + C) / 60, (60 * A + B + C) % 60);

	return 0;
}
