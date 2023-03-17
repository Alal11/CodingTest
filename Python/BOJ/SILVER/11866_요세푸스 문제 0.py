from collections import deque

queue=deque()
arr=[]

n,k=map(int, input().split())

for i in range(n):
    queue.append(i+1)

while queue:
    for i in range(k-1):
        queue.append(queue.popleft())
    arr.append(queue.popleft())

print("<", end='')
for i in range(len(arr)-1):
    print("%d, " %arr[i], end='')
print(arr[-1], end='')
print(">")
