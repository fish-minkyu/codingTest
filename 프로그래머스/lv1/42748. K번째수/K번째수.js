function solution(array, commands) {
  let ans = []

  for (let i = 0; i < commands.length; i++) {
    // let start = commands[i][0]
    // let end = commands[i][1]
    // let idx = commands[i][2]
    const [start, end, idx] = commands[i]

    ans.push(array.slice(start -1, end).sort((a, b) => a - b)[idx -1])
  }

  return ans
}