import sys
from math import sqrt

input = sys.stdin.readline

test_case = int(input().rstrip())

for i in range(test_case):

    password = []
    slice_pw = []

    password = input().rstrip()

    one_len = int(sqrt(len(password)))

    munja = []

    cnt = 0
    for j in range(one_len):
        slice_pw.append(password[cnt:cnt+one_len])
        cnt += one_len

    cnt = one_len
    for k in range(one_len-1, -1, -1):
        for q in range(one_len):
            munja.append(slice_pw[q][k])

    print(*munja, sep='')
