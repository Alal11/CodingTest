#include <stdio.h>

int main(void)
{
	int i;
	char word[21];

	scanf("%s", word, sizeof(word));
	for (i = 0; word[i]!= '\0'; i++)
	{
		printf("\'%c\'\n", word[i]);
	}
	return 0;
}
