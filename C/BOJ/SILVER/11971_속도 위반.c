#include <stdio.h>

int main()
{
    int n, m;
    int limit_speed[100] = { 0 };
    int mySpeed[100] = { 0 };
    int lastIdx = 0;
    int len, speed;
    int max = 0;

    scanf("%d %d", &n, &m);

    for (int i = 0; i < n; i++)
    {
        scanf("%d %d", &len, &speed);

        for (int j = lastIdx; j < lastIdx + len; j++)
            limit_speed[j] = speed;
        lastIdx += len;
    }
    lastIdx = 0;

    for (int i = 0; i < m; i++)
    {
        scanf("%d %d", &len, &speed);

        for (int j = lastIdx; j < lastIdx + len; j++)
            mySpeed[j] = speed;
        lastIdx += len;
    }

    for (int i = 0; i < 100; i++)
    {
        int diff = mySpeed[i] - limit_speed[i];

        if (diff > max)
            max = diff;
    }

    printf("%d", max);
}
