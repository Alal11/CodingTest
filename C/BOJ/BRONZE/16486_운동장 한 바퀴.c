#include <stdio.h>
#define PI 3.141592

int main(void)
{
	int d1, d2;
	float dr;

	scanf("%d %d", &d1, &d2);

	dr = 2 * d1 + 2 * d2 * PI;
	printf("%f\n", dr);

	return 0;
}
