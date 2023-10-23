function solution(answers) {
  let arr1 = [1, 2, 3, 4, 5]
  let arr2 = [2, 1, 2, 3, 2, 4, 2, 5]
  let arr3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
  let ans = [0, 0, 0] // 값이 있어야 index별로 값을 추가 가능하다.
  let res = []

  for (let i = 0; i < answers.length; i++) {
    if (answers[i] === arr1[i % arr1.length]) ans[0]++
    if (answers[i] === arr2[i % arr2.length]) ans[1]++
    if (answers[i] === arr3[i % arr3.length]) ans[2]++
  }

  let max = Math.max(...ans)

  if (ans[0] === max) res.push(1)
  if (ans[1] === max) res.push(2)
  if (ans[2] === max) res.push(3)

  return res
}