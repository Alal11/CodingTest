#include <stdio.h>
#include <stdlib.h>

struct Medal
{
	int country;
	int gold;
	int silver;
	int bronze;
};

int main()
{
	int N, K;
	int i;
	int target = 0, rank = 0;

	scanf("%d %d", &N, &K);

	struct Medal* medals = malloc(N * sizeof(struct Medal));
	
	for (i = 0; i < N; i++)
	{
		scanf("%d %d %d %d", &medals[i].country, &medals[i].gold, &medals[i].silver, &medals[i].bronze);

		if (medals[i].country == K)
			target = i;
	}

	for (i = 0; i < N; i++)
	{
		if (i != target)
		{
			if (medals[i].gold > medals[target].gold)
				rank++;
			else if (medals[i].gold == medals[target].gold)
			{
				if (medals[i].silver > medals[target].silver)
					rank++;
				else if (medals[i].silver == medals[target].silver)
				{
					if (medals[i].bronze > medals[target].bronze)
						rank++;
				}
			}
		}
	}
	printf("%d\n", rank + 1);
	
	free(medals);
}
