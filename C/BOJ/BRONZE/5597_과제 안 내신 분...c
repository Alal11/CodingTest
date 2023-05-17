#include <stdio.h>

int main()
{
	int arr[31] = { 0 };
	int i, num;

	for (i = 1; i <= 28; i++)
	{
		scanf("%d", &num);
		arr[num] = num;
	}

	for (i = 1; i < 31; i++)
	{
		if (arr[i] == 0)
		{
			printf("%d\n", i);
		}
	}
}
