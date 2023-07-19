function solution(n, control) {
 let [cntW, cntS, cntD, cntA] = [0, 0, 0, 0]
 
  let arr = [...control].map(item => {
    if (item == "w") return cntW++
    if (item == "s") return cntS++
    if (item == "d") return cntD++
    if (item == "a") return cntA++
  })
  
  let [w, s, d, a] = [cntW, cntS * -1, cntD * 10, cntA * -10]
  
  return n + w + s + d + a
}