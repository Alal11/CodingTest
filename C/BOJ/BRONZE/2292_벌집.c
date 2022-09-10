#include <stdio.h>

int main(void)
{
    int n, i = 2, j = 5, cnt = 2;

    scanf("%d", &n);

    if (n == 1)                   // 1인 경우 1을 출력
    {
        printf("%d", 1);
        return 0;
    }
    while (1)                     // 무한 반복문
    {
        if (i <= n && i + j >= n) 
        {
            printf("%d", cnt);
            break;
        }
        i = i + j + 1;
        j += 6;
        cnt++;
    }
    return 0;
}
