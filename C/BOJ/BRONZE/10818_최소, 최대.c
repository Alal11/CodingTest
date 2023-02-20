#include <stdio.h>

int main(void)
{
	int N, min = 1000001, max = -1000001;
	int num;

	scanf("%d", &N);

	for (int i = 0; i < N; i++)
	{
		scanf("%d", &num);

		min = (min < num) ? min : num;
		max = (max > num) ? max : num;
	}
	printf("%d %d", min, max);

	return 0;
}
