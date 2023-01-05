n = int(input())

lst = []

for i in range(n):
    name, kor, eng, math = list(map(str, input().split()))

    lst.append([name, int(kor), int(eng), int(math)])

lst.sort(key=lambda x: (-x[1], x[2], -x[3], x[0]))

for i in lst:
    print(i[0])
