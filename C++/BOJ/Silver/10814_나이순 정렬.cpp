#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(pair<int, string> x, pair<int, string> y)
{
	return x.first < y.first;
}

int main()
{
	int N;

	cin >> N;

	pair<int, string> tmp;
	vector<pair<int, string>>arr;

	for (int i = 0; i < N; i++)
	{
		cin >> tmp.first >> tmp.second;
		arr.push_back(tmp);
	}

	stable_sort(arr.begin(), arr.end(), compare);

	for (int j = 0; j < N; j++)
	{
		cout << arr[j].first << " " << arr[j].second << "\n";
	}
}
