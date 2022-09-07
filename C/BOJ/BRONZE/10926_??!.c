#include <stdio.h>

int main()
{
	char a[51];

	scanf("%s", a, sizeof(a));       // 문자열 입력 받을땐 & 생략

	printf("%s??!\n", a);

	return 0;
}
