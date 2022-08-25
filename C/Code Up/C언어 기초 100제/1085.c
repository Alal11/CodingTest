#include <stdio.h>
int main()
{
	double h, b, c, s;
	double mb;

	scanf("%lf %lf %lf %lf", &h, &b, &c, &s);

	mb = (double)(h * b * c * s) / (1024*1024*8);

	printf("%.1lf mb\n", mb);
	return 0;
}
