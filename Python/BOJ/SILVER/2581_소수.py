m = int(input())
n = int(input())
sosu_list = []

for i in range(m, n+1):
    num = 0
    for j in range(2, i):
        if i % j == 0:
            num += 1
            break
    if num == 0:
        sosu_list.append(i)

if 1 in sosu_list:
    sosu_list.remove(1)

if len(sosu_list) == 0:
    print(-1)
else:
    print(sum(sosu_list))
    print(sosu_list[0])
