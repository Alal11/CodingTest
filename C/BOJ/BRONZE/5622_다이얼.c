#include <stdio.h>
#include <string.h>

int NUM(int n);

int main()
{
	char munja[15];
	int i, sum = 0;

	scanf("%s", munja, sizeof(munja));

	for (i = 0; i < strlen(munja); i++)
	{
		sum += NUM(munja[i]);
	}

	printf("%d\n", sum);

	return 0;
}

int NUM(int n)
{
	switch (n)
	{
	case 'A':
	case 'B':
	case 'C':
		return 3;
	case 'D':
	case 'E':
	case 'F':
		return 4;
	case 'G':
	case 'H':
	case 'I':
		return 5;
	case 'J':
	case 'K':
	case 'L':
		return 6;
	case 'M':
	case 'N':
	case 'O':
		return 7;
	case 'P':
	case 'Q':
	case 'R':
	case 'S':
		return 8;
	case 'T':
	case 'U':
	case 'V':
		return 9;
	default:
		return 10;
	}
}
