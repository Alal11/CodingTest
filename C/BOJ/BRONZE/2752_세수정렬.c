#include <stdio.h>

int main(void)
{
	int a, b, c;

	scanf("%d %d %d", &a, &b, &c);

	if (a < b && b < c) {
		printf("%d %d %d", a, b, c);
	}
	else if (a < c && c < b) {
		printf("%d %d %d", a, c, b);
	}
	else if (b < c && c < a) {
		printf("%d %d %d", b, c, a);
	}
	else if (b < a && a < c) {
		printf("%d %d %d", b, a, c);
	}
	else if (c < b && b < a) {
		printf("%d %d %d", c, b, a);
	}
	else
		printf("%d %d %d", c, a, b);

	return 0;
}


// 다른 풀이
#include <stdio.h>

int main() {
    int a, b, c, t;
    scanf("%d %d %d", &a, &b, &c);
	
    if (a > b) {
        t = a; a = b; b = t;
    }
    if (b > c) {
        t = b; b = c; c = t;
    }
    if (a > b) {
        t = a; a = b; b = t;
    }
    printf("%d %d %d\n", a, b, c);
	
    return 0;
}
