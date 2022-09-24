#include <stdio.h>

int main()
{
	int A, B;

	while (1) {							// 무한 반복문
		scanf("%d %d", &A, &B);

		if (A == 0 && B == 0) {
			return 0;
		}
		else
			printf("%d\n", A + B);
	}
}
