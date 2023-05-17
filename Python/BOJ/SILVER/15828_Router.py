from collections import deque
import sys

input = sys.stdin.readline

n = int(input())
buffer = deque()

while True:
    x = int(input())

    if x == -1:
        break

    if x == 0 and len(buffer) != 0:
        buffer.popleft()

    elif x != 0 and len(buffer) != n:
        buffer.append(x)

if len(buffer) == 0:
    print("empty")
else:
    print(*buffer)
