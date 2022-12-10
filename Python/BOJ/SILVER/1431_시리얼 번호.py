import sys
input = sys.stdin.readline


def sum_num(x):
    result = 0
    for i in x:
        if i.isdigit() == True:
            result += int(i)
    return result


arr = []
n = int(input())

for _ in range(n):
    arr.append(str(input().rstrip()))

arr.sort(key=lambda x: (len(x), sum_num(x), x))

for i in arr:
    print(i)
