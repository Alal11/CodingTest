N = int(input())
cnt = 1

while N:
    cnt *= N-1
    cnt %= (1000000007)

    N -= 2

print(cnt)
