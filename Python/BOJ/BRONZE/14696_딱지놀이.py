N = int(input())
hi = []

for i in range(N):
    A = list(map(int, input().split()))[1:]
    B = list(map(int, input().split()))[1:]

    list_A = [A.count(4), A.count(3), A.count(2), A.count(1)]
    list_B = [B.count(4), B.count(3), B.count(2), B.count(1)]

    for j in range(0, 4):
        if (list_A[j] > list_B[j]):
            hi.append("A")
            break
        elif (list_A[j] < list_B[j]):
            hi.append("B")
            break
        elif j == 3:
            hi.append("D")
            break
            
for k in hi:
    print(k)
