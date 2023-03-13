import sys

while (1):
    string = sys.stdin.readline().rstrip()
    stack = []

    if string == ".":
        break

    for x in string:
        if x == "(" or x == "[":
            stack.append(x)

        elif x == ")":
            if stack and stack[-1] == "(":
                stack.pop()
            else:
                stack.append(x)
                break

        elif x == "]":
            if stack and stack[-1] == "[":
                stack.pop()
            else:
                stack.append(x)
                break

    if stack:
        print("no")
    else:
        print("yes")
