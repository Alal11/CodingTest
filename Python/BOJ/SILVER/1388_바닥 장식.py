import sys

input = sys.stdin.readline


# 깊이 우선 탐색(dfs) 알고리즘 함수 정의
def dfs(x, y):
    # 바닥 장식 모양이 '-' 일 때
    if board[x][y] == '-':
        board[x][y] = 1  # 해당 노드 방문처리

        for _y in [1, -1]:  # 양 옆(좌우) 확인하기
            Y = y + _y
            # 좌우 노드가 주어진 범위를 벗어나지 않고 '-' 모양이라면 재귀함수 호출
            if (Y > 0 and Y < m) and board[x][Y] == '-':
                dfs(x, Y)

    # 바닥 장식 모양이 '|' 일 때
    if board[x][y] == '|':
        board[x][y] = 1  # 해당 노드 방문처리

        for _x in [1, -1]:  # 위아래(상하) 확인하기
            X = x + _x
            # 상하 노드가 주어진 범위를 벗어나지 않고 '|' 모양이라면 재귀함수 호출
            if (X > 0 and X < n) and board[X][y] == '|':
                dfs(X, y)


n, m = map(int, input().split())  # 방 바닥의 세로 크기n, 가로 크기 m

board = [list(input()) for _ in range(n)]  # 2차원 리스트의 맵 정보 저장할 공간

count = 0
for i in range(n):
    for j in range(m):
        # 노드가 '-'이나 '|'일 경우에 재귀함수 호출
        if board[i][j] == '-' or board[i][j] == '|':
            dfs(i, j)
            count += 1

print(count)
