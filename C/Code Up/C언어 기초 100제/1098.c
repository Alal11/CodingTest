#include <stdio.h>
int main()
{
	int arr[101][101] = { 0, };	            	//arr[세로][가로] 배열 선언하고 0으로 초기화
	int h, w, n, l, d, x, y;	              	// 세로(h), 가로(w), 막대 수(n), 막대 길이(l), 방향(d), 죄표(x,y)
	int i, j;

	scanf("%d %d", &h, &w);	                 	// 격자판의 세로, 가로
	scanf("%d", &n);		                      // 놓을 막대의 개수

	for (i = 1; i <= n; i++) {
		scanf("%d %d %d %d", &l, &d, &x, &y);		// 막대의 길이, 방향, 좌표, (d: 가로는 0, 세로는 1)
		if (d == 0) {	                        	// 막대 방향 가로일 때
			for (j = 0; j < l; j++) {
				arr[x][y + j] = 1;
			}
		}
		else {		                              // 막대 방향 세로일 때
			for (j = 0; j < l; j++) {
				arr[x + j][y] = 1;
			}
		}
	}
	for (i = 1; i <= h; i++) {	            	// 한 줄(위에서 아래로) 씩
		for (j = 1; j <= w; j++) {	          	// 한 열(왼쪽에서 오른쪽으로) 씩
			printf("%d ", arr[i][j]);	          	// 값 출력
		}
		printf("\n");		                        // 줄 바꾸기
	}
	return 0;
}
