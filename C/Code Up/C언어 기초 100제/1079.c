#include <stdio.h>

int main()
{
	char alph;

	do
	{
		scanf("%c", &alph);
		getchar();

		if (alph != 'q')
		{
			printf("%c\n", alph);
		}
		else {
			printf("q");
			return 0;
		}
	} while (1);
}
