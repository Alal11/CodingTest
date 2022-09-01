#include <stdio.h>

int main(void)
{
	int H, M;

	scanf("%d %d", &H, &M);
	
	if (H == 0 && M < 45)
		printf("23 %d", 60 - (45 - M));

	else
		printf("%d %d", (60 * H + M - 45) / 60, (60 * H + M - 45) % 60);

	return 0;
}
