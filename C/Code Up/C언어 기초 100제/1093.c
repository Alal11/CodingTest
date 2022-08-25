#include <stdio.h>

int main() {

    int arr[24] = { 0, };              // 배열 모두 0으로 초기화
    int num1, num2;
    
    scanf("%d", &num1);

    for (int i = 1; i <= num1; i++) {
        scanf("%d", &num2);            // 입력받은 번호는 해당 배열위 위치 값
        arr[num2] += 1;                // 해당 위치 값에 1만큼 더해 불린 횟수 증가
    }

    for (int j = 1; j < 24; j++) {
        printf("%d ", arr[j]);         // 1~23 번 배열에 저장되어 있는 값(=불린 횟수) 출력 
    }
    return 0;
}
