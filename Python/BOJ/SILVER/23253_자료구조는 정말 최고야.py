import sys
input = sys.stdin.readline

n, m = map(int, input().split())

check = True

for _ in range(m):
    i = int(input())
    k = list(map(int, input().split()))

    for j in range(i-1):
        if k[j] < k[j+1]:
            check = False
            break

    if not check:
        break

print('Yes' if check else 'No')
