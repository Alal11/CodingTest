n = int(input())                    # 분수 번호 n 입력
line = 1                            # 분수 라인 1부터 시작

while (n > line):                   # n이 line보다 작아질 때까지 반복
    # 입력받은 n을 1씩 늘려가며 빼줌(몇 번째 줄에 몇 번째 숫자인지 구하기)
    n -= line
    line += 1

if line % 2 == 0:                # 짝수 라인이라면
    a = n                           # 분자a는 오름차순
    b = line-n+1                    # 분자b는 내림차순
else:                            # 홀수 라인이라면
    a = line-n+1                    # 분자a는 내림차순
    b = n                           # 분모b는 오름차순

print(a, '/', b, sep='')            # 분수 출력
