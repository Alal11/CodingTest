from collections import deque
import sys
input = sys.stdin.readline


n = int(input())

board = []
for _ in range(n):
    board.append(list(map(int, input().split())))

visit = []
for _ in range(n):
    visit.append([False]*n)

dx = [1, 0]
dy = [0, 1]

def bfs(x, y, visit):
    queue = deque()
    queue.append((x, y))
    visit[x][y] = True

    while queue:
        x, y = queue.popleft()
        if board[x][y] == -1:
            return 'HaruHaru'

        jump = board[x][y]
        for i in range(2):
            nx = x+dx[i]*jump
            ny = y+dy[i]*jump
            if 0 <= nx < n and 0 <= ny < n and visit[nx][ny] == 0:
                visit[nx][ny] = True
                queue.append((nx, ny))
    return 'Hing'


print(bfs(0, 0, visit))
