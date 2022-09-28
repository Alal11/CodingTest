croatia = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
alph = input()

for i in croatia:					        	 # croatia 리스트 요소 차례대로 i에 대입
    alph = alph.replace(i, '*') 		 # alph에 croatia 요소가 있으면 *로 바꿈

print(len(alph))						         # alph의 길이 출력
