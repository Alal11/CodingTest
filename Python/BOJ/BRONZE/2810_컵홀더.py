n = int(input())
jari = input()

su = jari.count("LL")

cup = n+1-su

if su == -1 or n < cup:
    print(n)
else:
    print(cup)
