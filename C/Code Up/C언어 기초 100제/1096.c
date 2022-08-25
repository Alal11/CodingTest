#include <stdio.h>
int main()
{
	int n, i, j, x, y;
	int a[20][20] = { 0, };	        	 // 2차원 배열 선언하고 모두 0으로 초기화

	scanf("%d", &n);		               // n개의 흰 돌 개수 입력
	for (i = 1; i <= n; i++) {
		scanf("%d %d", &y, &x);		       // 흰 돌 놓을 위치 (y,x)좌표 입력
		a[y][x] = 1;		                 // 그 흰 돌의 (y,x)좌표 위치는 1로 설정 
	}
	for (i = 1; i <= 19; i++) {		     // 한 줄(위에서 아래로) 씩
		for (j = 1; j <= 19; j++) {	     // 한 열(왼쪽에서 오른쪽으로) 씩
			printf("%d ", a[i][j]);		     // 해당 위치의 값 출력
		}
		printf("\n");		// 한 줄이 끝나면 줄 바꾸기
	}
	return 0;
}
