#include <stdio.h>

int main(void)
{
	int bg, sg;

	scanf("%d", &bg);		// 불기 년도 입력

	sg = bg - 543;
	printf("%d\n", sg);		// 서기 년도 출력

	return 0;
}
