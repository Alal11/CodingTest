#include <stdio.h>

int main()
{
	int n, diff, top, bottom, line = 0, end = 0;
	// line은 대각선으로 그었을 때 짝수 또는 홀수 번째에 있는지 판별하는 변수
	// end는 해당 라인의 가장 끝의 번째(1, 3, 6, 10, ...)를 나타내는 변수

	scanf("%d", &n);

	while (n > end) {
		line += 1;
		end += line;
	}

	diff = end - n;

	if (line % 2 == 0) {
		top = line - diff;
		bottom = diff + 1;
	}
	else {
		top = diff + 1;
		bottom = line - diff;
	}

	printf("%d/%d", top, bottom);
}
