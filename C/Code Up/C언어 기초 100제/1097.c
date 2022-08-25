#include <stdio.h>
int main()
{
	int n, i, j, x, y;
	int arr[20][20] = { 0, };

	for (i = 1; i <= 19; i++) {	    	// 한 줄씩 바둑판 상황 입력
		for (j = 1; j <= 19; j++) {
			scanf("%d", &arr[i][j]);
		}
	}
	scanf("%d", &n);	              	// 십자 뒤집기 횟수(n) 입력

	for (i = 1; i <= n; i++) {	    	// n 횟수 만큼 반복
		scanf("%d %d", &x, &y);	      	// 십자 뒤집기 할 좌표 입력

		for (j = 1; j <= 19; j++) {		  // 가로 줄 (흑<->백) 바꾸기
			if (arr[x][j] == 0) arr[x][j] = 1;
			else arr[x][j] = 0;
		}
		for (j = 1; j <= 19; j++) {	  	// 세로 줄 (흑<->백) 바꾸기
			if (arr[j][y] == 0) arr[j][y] = 1;
			else arr[j][y] = 0;
		}
	}
	for (i = 1; i <= 19; i++) {		    // 바둑판 결과 출력
		for (j = 1; j <= 19; j++) {
			printf("%d ", arr[i][j]);
		}
		printf("\n");
	}
	return 0;
}
