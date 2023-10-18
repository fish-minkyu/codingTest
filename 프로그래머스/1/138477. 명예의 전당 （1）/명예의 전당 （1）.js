function solution(k, score) {
  let pocket = 0
  let arr = []
  let ans = []


  for (let i = 0; i < score.length; i++) {
    arr.push(score[i])
    pocket = Math.min(...arr.sort((a, b) => b - a).slice(0, k))
    ans.push(pocket)
  }

  return ans
}