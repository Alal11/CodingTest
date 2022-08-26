#include <stdio.h>

int main()
{
	int arr[15][15] = { 0, };		    // 각각 크기 15인 2차원 배열을 선언하고 0으로 초기화
	int test, k, n, i, j;

	for (i = 0; i < 15; i++) {
		arr[0][i] = i;	            	// 0층의 i호에는 i명 만큼 산다고 했으므로 0층에는 i명으로 선언
	}
	for (i = 1; i < 15; i++) {
		for (j = 1; j < 15; j++) {
			arr[i][j] = arr[i][j - 1] + arr[i - 1][j];		// 사람들의 합을 arr[i][j]에 넣어준다
	}
		}
	scanf_s("%d", &test);		        // test case의 수 입력

	for (i = 1; i <= test; i++) {
		scanf_s("%d %d", &k, &n);
		printf("%d\n", arr[k][n]);
	}
	
	return 0;
}
