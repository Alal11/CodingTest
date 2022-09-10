#include <stdio.h>

int main() {

	int t, h, w, n;			    // t는 테스트 횟수 ,h는 높이, w는 길이, n은 몇번째 손님인지
	int count;			    // 몇호인지 나타낼 변수

	scanf("%d", &t);

	for (int i = 0; i < t; i++) {
		count = 1;		             // 방은 1호부터 시작하니까 1로 선언
		
		scanf("%d %d %d", &h, &w, &n);
		
		while (n > h) {			     // 손님의 번호에서 건물의 높이만큼 빼주는 반복문 
			n -= h;
			count++;	             // 오른쪽으로 이동할때마다 호수에서 +1 을 한다
		}		
		printf("%d%02d\n", n, count);
	} 
	return 0;
}
