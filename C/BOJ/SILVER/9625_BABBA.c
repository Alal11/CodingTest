#include <stdio.h>

int main()
{
	int K = 0;
	int numA = 1, numB = 0;
	int temp = 0;

	scanf("%d", &K);

	for (int i = 0; i < K; i++)
	{
		temp = numA;
		numA = numB;
		numB = temp + numB;
	}

	printf("%d %d\n", numA, numB);

	return 0;
}
