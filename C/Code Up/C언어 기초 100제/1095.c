#include <stdio.h>
int main()
{
	int arr[10001] = { 0, };
	int num, min = 24;

	scanf("%d", &num);		              // 개수 입력 받기

	for (int i = 1; i <= num; i++) {		// 개수 만큼 입력 받기
		scanf("%d", &arr[i]);
		if (min > arr[i]) {	            	// arr[i]이 min보다 작으면 min에 arr[i]을 넣어준다.
			min = arr[i];
		}
	}
	printf("%d", min);
	return 0;
}
