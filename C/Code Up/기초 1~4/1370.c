#include <stdio.h>

int main(void)
{
	int h, r;			          // 높이와 반복 횟수 변수 선언
	int i, j, k;	        	// 삼중중첩문 활용 변수

	scanf("%d %d", &h, &r);

	for (k = 1; k <= r; k++) {	       	// for문을 이용해 반복 횟수 만큼 반복
		for (i = 1; i <= h; i++) {	    	// 별 계단 높이 증가
			for (j = 1; j < i; j++) {
				printf(" ");
			}
			printf("*\n");
		}
		for (i = h - 2; i >= 0; i--) {		// 별 계단 높이 감소
			for (j = 0; j < i; j++) {
				printf(" ");
			}
			printf("*\n");
		}
	}
	return 0;
}
