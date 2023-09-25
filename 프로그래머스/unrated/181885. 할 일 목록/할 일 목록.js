function solution(todo_list, finished) {
  let index = []

  for (let i = 0; i < finished.length; i++) {
    if (!finished[i]) {
      index.push(i)
    }
  }

  let ans = index.map(v => {
    return todo_list[v]
  })

  return ans
}