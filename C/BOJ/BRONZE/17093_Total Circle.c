#include <stdio.h>
#include <math.h>

long long int radius(int p_x, int p_y, int q_x, int q_y)
{
	return pow((p_x - q_x), 2) + pow((p_y - q_y), 2);
}

int main(void) {

	int p[2000], q[2000];
	int p_cnt, q_cnt;
	long long int answer = 0;
	long long int radius_cal;

	scanf("%d %d", &p_cnt, &q_cnt);

	for (int i = 0; i < p_cnt * 2; i += 2)
		scanf("%d %d", &p[i], &p[i + 1]);

	for (int i = 0; i < q_cnt * 2; i += 2)
		scanf("%d %d", &q[i], &q[i + 1]);

	for (int i = 0; i < p_cnt * 2; i += 2) {
		for (int j = 0; j < q_cnt * 2; j += 2) {
			radius_cal = radius(p[i], p[i + 1], q[j], q[j + 1]);
			answer = answer > radius_cal ? answer : radius_cal;
		}
	}
	printf("%lld\n", answer);

	return 0;
}
