N=int(input())
stack=[]
for _ in range(N):
    command = input()
    if command == "pop":
        if stack:
            print(stack[-1])
            stack.pop()
        else:
            print(-1)
    elif command == "size":
        print(len(stack))
    elif command == "empty":
        if stack:
            print(0)
        else:
            print(1)
    elif command == "top":
        if stack:
            print(stack[-1])
        else:
            print(-1)
    else:
        X=command.split()[-1]
        stack.append(X)
