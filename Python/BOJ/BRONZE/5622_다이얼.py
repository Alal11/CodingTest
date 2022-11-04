# 첫번째 풀이
word = input()
a = 0

for i in word:              # word의 각 글자를 i에 대입

    if i == 'A' or i == 'B' or i == 'C':
        a += 3
    elif i == 'D' or i == 'E' or i == 'F':
        a += 4
    elif i == 'G' or i == 'H' or i == 'I':
        a += 5
    elif i == 'J' or i == 'K' or i == 'L':
        a += 6
    elif i == 'M' or i == 'N' or i == 'O':
        a += 7
    elif i == 'P' or i == 'Q' or i == 'R' or i == 'S':
        a += 8
    elif i == 'T' or i == 'U' or i == 'V':
        a += 9
    elif i == 'W' or i == 'X' or i == 'Y' or i == 'Z':
        a += 10

print(a)


# 두번째 풀이
# 딕셔너리에 키값과 밸류값 각각 입력함
dic = {'A': 3, 'B': 3, 'C': 3, 'D': 4, 'E': 4, 'F': 4, 'G': 5, 'H': 5, 'I': 5, 'J': 6, 'K': 6, 'L': 6, 'M': 7,
       'N': 7, 'O': 7, 'P': 8, 'Q': 8, 'R': 8, 'S': 8, 'T': 9, 'U': 9, 'V': 9, 'W': 10, 'X': 10, 'Y': 10, 'Z': 10}

word = input()
a = 0                               # 시간 담을 변수 a를 0으로 초기화

for i in range(0, len(word)):       # i는 0부터 단어 길이-1 까지 반복
    a += dic[word[i]]               # dic[키값]=밸류값의 누적합 구함

print(a)                            # 누적 시간 출력
