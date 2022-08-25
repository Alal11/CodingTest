#include <stdio.h>
int main()
{
	int arr[10001] = { 0, };
	int num1, num2;

	scanf("%d", &num1);

	for (int i = 1; i <= num1; i++) {
		scanf("%d", &arr[i]);
	}
	for (int j = num1; j >=1; j--) {
		printf("%d ", arr[j]);
	}
	return 0;
}
