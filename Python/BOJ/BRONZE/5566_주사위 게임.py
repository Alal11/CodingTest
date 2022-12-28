import sys
input = sys.stdin.readline

n, m = map(int, input().split())

board = []
dice = []
corrent = 0
move = 0

for i in range(0, n):
    board.append(int(input()))

for j in range(0, m):
    dice.append(int(input()))


for k in range(1, m+1):
    corrent += dice[k-1]

    if corrent+1 >= n:
        print(k)
        break

    move = board[corrent]
    corrent += move

    if corrent+1 >= n:
        print(k)
        break
