def solution(todo_list, finished):
    list = []
    for i in range(len(todo_list)):
        if not finished[i]:
            list.append(todo_list[i])
    return list