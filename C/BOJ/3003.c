#include <stdio.h>

int main(void)
{
	int a, b, c, d, e, f, aa, bb, cc, dd, ee, ff;

	scanf("%d %d %d %d %d %d", &a, &b, &c, &d, &e, &f);

	aa = 1 - a;
	bb = 1 - b;
	cc = 2 - c;
	dd = 2 - d;
	ee = 2 - e;
	ff = 8 - f;

	printf("%d %d %d %d %d %d", aa, bb, cc, dd, ee, ff);

	return 0;
}
