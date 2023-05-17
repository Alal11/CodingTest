s = input()  # 자연수 합 s 입력
sum = 0  # 누적합 담을 변수 sum 0으로 초기화
add = 1  # 1부터 더해주기 위해 add는 1로 초기화

while (1):  # 조건에 맞을 때까지 무한 반복
    sum += add  # sum에 add를 더해줌

    if (int(sum) > int(s)):  # sum이 s보다 커지게 되면
        print(add - 1)  # 커지기 전의 add 값 출력
        break

    add += 1  # add를 +1 해줌

# 1부터 n까지(add) 더한 누적합(sum)이 s보다 커지게 되면
# 더하기를 멈추고 커지기 전으로 돌아가서 가장 마지막에 더해준 자연수(최댓값)를 출력한다.
