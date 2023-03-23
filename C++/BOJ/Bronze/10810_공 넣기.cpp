#include <iostream>
using namespace std;

int main()
{
	int n, m;

	cin >> n >> m;

	int arr[100] = {};
	int i, j, k;

	for (int a = 0; a < m; a++)
	{
		cin >> i >> j >> k;
		for (int b = i - 1; b < j; b++)
		{
			arr[b] = k;
		}
	}
	for (int c = 0; c < n; c++)
	{
		cout << arr[c] << " ";
	}
}
