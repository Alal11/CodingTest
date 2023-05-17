x, y = map(int, input().split())

gr = [x, 0]
sr = [0, y]

line = int(input())

for i in range(line):
    n, m = map(int, input().split())

    if n == 0:
        sr.append(m)
    else:
        gr.append(m)

gr = sorted(gr)
sr = sorted(sr)
result_list = []

for i in range(1, len(gr)):
    for j in range(1, len(sr)):
        w = gr[i] - gr[i - 1]
        h = sr[j] - sr[j - 1]
        result_list.append(w * h)

print(max(result_list))
