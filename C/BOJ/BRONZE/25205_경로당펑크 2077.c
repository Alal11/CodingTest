#include <stdio.h>

int main()
{
    int N;
    char word[30];

    scanf("%d", &N);
    scanf("%s", word, sizeof(word));

    switch (word[N - 1]) {
    case 'k':
    case 'i':
    case 'j':
    case 'u':
    case 'h':
    case 'y':
    case 'n':
    case 'b':
    case 'm':
    case 'l':
    case 'o':
    case 'p':
        printf("0\n");
        break;
    default:
        printf("1\n");
    }
    return 0;
}
