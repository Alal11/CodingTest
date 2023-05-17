n = int(input())
hap = 0
cnt = 1

while True:
    hap += cnt
    if hap >= n:
        print(cnt)
        break

    cnt += 1
