#include <iostream>
#include <queue>
#include <cmath>

using namespace std;

int main()
{
	int N, x;
	priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;
  
	cin >> N;

	for (int i = 0; i < N; i++)
	{
		cin >> x;

		if (x == 0)
		{
			if (pq.empty())
				cout << 0 << endl;
			else
			{
				int val = pq.top().second;
				cout << val << endl;
				pq.pop();
			}
		}
		else
		{
			pq.push(make_pair(abs(x), x));
		}
	}
}
