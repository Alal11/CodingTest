#include <stdio.h>

int main()
{
	int n;
	int min = 100000000;
	int a, b, c;
	int area;

	scanf("%d", &n);

	for (int i = 1; i <= n; i++)
	{
		if (n % i == 0)
		{
			for (int j = 1; j <= n / i; j++)
			{
				if (n % (i * j) == 0)
				{
					for (int k = 1; k <= n / (i * j); k++)
					{
						if (i * j * k == n)
						{
							area = (i * j + j * k + i * k) * 2;

							if (area < min)
							{
								min = area;
								a = i;
								b = j;
								c = k;
							}
						}
					}
				}
			}
		}
	}
	printf("%d %d %d", a, b, c);
}
