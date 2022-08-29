#include <stdio.h>

int main(void)
{
	int jumsu;

	scanf("%d", &jumsu);

	if (90 <= jumsu && 100 >= jumsu)
		printf("A");

	else if (70 <= jumsu && 89 >= jumsu)
		printf("B");

	else if (40 <= jumsu && 69 >= jumsu)
		printf("C");

	else if (0 <= jumsu && 39 >= jumsu)
		printf("D");

	return 0;
}


// 다른 풀이

#include <stdio.h>

int main(void)
{
	int jumsu;

	scanf("%d", &jumsu);

	if (jumsu >= 90)
		printf("a");
	else if (jumsu >= 70)
		printf("b");
	else if (jumsu >= 40)
		printf("c");
	else if (jumsu >= 0)
		printf("d");

	return 0;
}
