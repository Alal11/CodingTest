#include <stdio.h>

int main(void)
{
	int a, b, c;

	scanf("%d %d %d", &a, &b, &c);

	if (a == b && a == c)					       // a,b,c가 모두 같은 경우
		printf("%d", 10000 + (a * 1000));

	else if (a == b || b == c || c == a) {		               // a,b,c 중 두 개만 같은 경우	
		if (a == b && b != c)
			printf("%d\n", 1000 + (a * 100));
		else if (b == c && b != a)
			printf("%d\n", 1000 + (b * 100));
		else
			printf("%d\n", 1000 + (c * 100));
	}
	else {							       // a,b,c가 모두 다른 경우
		if (b < a && c < a)
			printf("%d\n", a * 100);
		else if (a < b && c < b)
			printf("%d\n", b * 100);
		else
			printf("%d\n", c * 100);
	}
	return 0;
}
