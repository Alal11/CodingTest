N = int(input())
card = list(range(1, N+1))

cardx = []

while True:
    cardx.append(card.pop(0))
    if not card:
        break
    card.append(card.pop(0))

print(*cardx)
