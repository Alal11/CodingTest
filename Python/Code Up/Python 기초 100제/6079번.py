n = int(input())
hap = 0
cnt = 1

while (1):
    hap += cnt
    if hap >= n:
        print(cnt)
        break

    cnt += 1
