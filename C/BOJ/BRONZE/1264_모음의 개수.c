#include <stdio.h>

int main()
{
	char stc[256] = {0};
	int su = 0;

	while (1)
	{
		// scanf()는 공백을 읽을 수가 없다
		// gets()는 줄 바꿈을 입력할 때까지 한 줄을 그대로 읽어들인다
		gets(stc);

		if (stc[0] == '#')
			break;

		for (int i = 0; stc[i] != '\0'; i++) {
			if (stc[i] == 'a' || stc[i] == 'A') su++;
			else if (stc[i] == 'e' || stc[i] == 'E') su++;
			else if (stc[i] == 'i' || stc[i] == 'I') su++;
			else if (stc[i] == 'o' || stc[i] == 'O') su++;
			else if (stc[i] == 'u' || stc[i] == 'U') su++;
		}
		printf("%d\n", su);
		su = 0;
	}
	return 0;
}
