#include <stdio.h>

int main()
{
	int a, b, c, max;

	while (1)
	{
		scanf("%d %d %d", &a, &b, &c);

		if (a == 0 && b == 0 && c == 0)
			break;

		if (a < c && b < c)
		{
			max = c;
			c = 0;
		}
		else if (a < b && c < b)
		{
			max = b;
			b = 0;
		}
		else
		{
			max = a;
			a = 0;
		}

		if (max * max == a * a + b * b + c * c)
			printf("right\n");
		else
			printf("wrong\n");
	}
}
