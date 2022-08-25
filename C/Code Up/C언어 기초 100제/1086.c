#include <stdio.h>
int main()
{
	double w, h, b;
	double mb;

	scanf("%lf %lf %lf", &w, &h, &b);

	mb = (double)(w * h * b) / (1024 * 1024 * 8);

	printf("%.2lf mb\n", mb);
	return 0;
}
