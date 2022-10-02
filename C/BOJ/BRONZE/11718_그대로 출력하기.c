#include <stdio.h>

int main()
{
	char a;

	while (scanf("%c", &a) != EOF)		  // EOF 대신 -1을 써도 됨
	{
		printf("%c", a);
	}
	return 0;
}
