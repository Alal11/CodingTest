#include <stdio.h>

int main(void)
{
	int n, i;

	scanf("%d", &n);
	
	for (i = 1; i <= n; i++)		// 1부터 n까지 한 줄에 하나씩 출력
		printf("%d\n", i);

	return 0;
}
