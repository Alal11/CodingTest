a, b = map(int, input().split())
print((bool(not a) and bool(b)) or bool(a) and bool(not b))
