#include <stdio.h>

int main()
{
	int T;
	double dough[] = { 0.5, 0.5, 0.25, 0.0625, 0.5625 };
	int topping[] = { 1, 30, 25, 10 };

	scanf("%d", &T);

	while (T--)
	{
		scanf("\n");

		int line1[5];
		int line2[4];
		int max = 1000000000;

		for (int i = 0; i < 5; i++)
		{
			scanf("%d", &line1[i]);
			int max_dough = line1[i] / dough[i];

			if (max > max_dough)
				max = max_dough;
		}

		int cnt = 0;
		
		for (int i = 0; i < 4; i++)
		{
			scanf("%d", &line2[i]);
			cnt += line2[i] / topping[i];
		}

		if (max < cnt)
			printf("%d\n", max);
		else
			printf("%d\n", cnt);
	}
	return 0;
}
