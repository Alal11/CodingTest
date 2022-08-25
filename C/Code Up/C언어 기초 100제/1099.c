#include <stdio.h>
int main()
{
	int arr[11][11] = { 0, };
	int i, j, x = 2, y = 2;		      // (2, 2)에서 출발한다

	for (i = 1; i < 11; i++) {
		for (j = 1; j < 11; j++) {
			scanf("%d", &arr[i][j]);
		}
	}
	while (1) {
		if (arr[x][y] == 0) {	      	// 0(갈 수 있는 곳)일 때
			arr[x][y] = 9;	          	// 해당 좌표 값 9로 변경
			y++;		                    // 오른쪽으로 움직이기 위해 y값 1증가
		}
		if (arr[x][y] == 1) {		      // 1(갈 수 없는 곳)일 때
			y--;		                    // y값 감소시켜 다시 돌아옴
			x++;		                    // 아래쪽으로 이동하기 위해 x값 1증가
		}
		if (arr[x][y] == 2) {		      // 2(먹이 있는 곳)일 때
			arr[x][y] = 9;		          // 해당 좌표 9로 변경
			break;		                  // 더 이상 이동하지 않음
		}
		else if (arr[x][y + 1] == 1 && arr[x + 1][y] == 1) {	  // 오른쪽, 아래가 모두 1인 경우
			if (arr[x][y] == 0)
				arr[x][y] = 9;		        // 해당 좌표 9로 변경
			break;		                  // 더 이상 이동하지 않음
		}
	}

	for (i = 1; i < 11; i++) {
		for (j = 1; j < 11; j++) {
			printf("%d ", arr[i][j]);
		}
		printf("\n");
	}
	return 0;
}
