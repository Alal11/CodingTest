#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n, m;
	int arr_n[100001], arr_m[100001];

	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> arr_n[i];
	}

	cin >> m;
	for (int j = 0; j < m; j++)
	{
		cin >> arr_m[j];
	}

	sort(arr_n, arr_n + n);

	for (int k = 0; k < m; k++)
	{
		int low = 0, mid, high = n-1;
		
		while (low <= high)
		{
			mid = (low + high) / 2;

			if (arr_n[mid] == arr_m[k])
			{
				cout << "1\n";
				break;
			}
			else if (arr_n[mid] > arr_m[k])
				high = mid - 1;
			else
				low = mid + 1;
		}
		if (arr_n[mid]!=arr_m[k])
			cout << "0\n";
	}
}
