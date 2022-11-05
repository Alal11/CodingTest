key = "FBI"
lst = []

for i in range(5):
    word = input()
    if key in word:
        lst.append(i+1)
if len(lst) == 0:
    print("HE GOT AWAY!")
else:
    print(*lst)
