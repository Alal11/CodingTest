#include <stdio.h>

int main(void)
{
	char mj;

	scanf("%c", &mj);

	switch (mj)
	{
	case 'a':
		printf("best!!!");
		break;
	case 'b':
		printf("good!!");
		break;
	case'c':
		printf("run!");
		break;
	case 'd':
		printf("slowly~");
		break;
	default:
		printf("what?");
	}
	return 0;
}
