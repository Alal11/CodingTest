#include <stdio.h>

int main()
{
	int n, cnt = 0, diff_bit = 0;

	int binary[33] = { 0 };
	int result[33] = { 0 };

	scanf("%d", &n);

	for (int i = 0; ; i++)
	{
		if (n % 2 == 0)
		{
			binary[i] = 0;
			result[i] = 1;
		}
		else
		{
			binary[i] = 1;
			result[i] = 0;
		}
		cnt++;
		
		if (n == 1)
			break;

		n = n / 2;
	}

	for (int i = 31; i >= cnt; i--)
	{
		binary[i] = 0;
		result[i] = 1;
	}
	result[0]++;

	for (int i = 0; i < 32; i++)
	{
		if (result[i] == 2)
		{
			result[i] = 0;
			result[i + 1]++;
		}
		if (binary[i] != result[i])
			diff_bit++;
	}
	printf("%d\n", diff_bit);

	return 0;
}
