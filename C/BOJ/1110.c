#include <stdio.h>

int main(void)
{
	int num1, num2, cycle = 0;	       	// cycle은 0으로 시작

	scanf("%d", &num1);
	num2 = num1;		

	while (1) {		                    	// while(1) : 무한 루프를 수행하는 반복문
		num1 = (num1 % 10) * 10 + ((num1 / 10 + num1 % 10) % 10);	
		cycle++;		                      // while문이 한 번 시행될 때마다 1씩 증가

		if (num1 == num2)		              // 초깃값과 새로운 수가 일치한다면 while문 탈출
			break;
	}
	printf("%d", cycle);
	return 0;
}
