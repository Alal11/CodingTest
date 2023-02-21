#include <stdio.h>

int main()
{
	long long int S;
	long long int i = 1, sum = 0;

	scanf("%d", &S);

	while (1)
	{
		sum += i;
		if (sum > S)
		{
			printf("%d\n", i - 1);

			return 0;
		}
		i++;
	}
}
