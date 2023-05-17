import sys

work = ['Re', 'Pt', 'Cc', 'Ea', 'Tb', 'Cm', 'Ex']

bee = dict()
for i in work:
    bee[i] = 0

cnt = 0
line = sys.stdin.readlines()

for i in line:
    str = list(i.split())

    for j in str:
        if j in work:
            bee[j] = bee.get(j, 0) + 1
        cnt += 1

for i in bee:
    print(i, bee.get(i), '{:.2f}'.format(bee.get(i) / cnt))

print('Total', cnt, '1.00')
