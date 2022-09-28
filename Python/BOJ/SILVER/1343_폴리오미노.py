board = input()

board = board.replace("XXXX", "AAAA")		# "XXXX"를 AAAA로 바꿈
board = board.replace("XX", "BB")			# "XX"를 BB로 바꿈

if 'X' in board:							# board에 'X'가 있으면 -1 출력
    print(-1)

else:										# 'X'가 없으면 board 출력
    print(board)
