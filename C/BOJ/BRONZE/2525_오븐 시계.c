#include <stdio.h>

int main(void)
{
	int A, B, C;

	scanf("%d %d", &A, &B);
	scanf("%d", &C);

	if ((60 * A + B + C) >= 1440) {				// A, B, C를 분 단위로 바꾼 것의 합이 1440분(24시간) 이상일 때
		
		printf("%d %d", ((60 * A) + B + C - 1440) / 60, ((60 * A) + B + C - 60) % 60);
	}
	else							// 1440분 미만일 때
		printf("%d %d", (60 * A + B + C) / 60, (60 * A + B + C) % 60);

	return 0;
}
