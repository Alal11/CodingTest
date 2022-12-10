import sys

arr = []
n = int(input())


def addDigit(x):
    result = 0
    for i in x:
        if i.isdigit() == True:
            result += int(i)
    return result


for _ in range(n):
    arr.append(str(sys.stdin.readline().rstrip()))

arr.sort(key=lambda x: (len(x), addDigit(x), x))

for i in arr:
    print(i)
