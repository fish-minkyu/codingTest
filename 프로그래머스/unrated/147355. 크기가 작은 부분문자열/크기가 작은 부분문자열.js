// 문제 : 크기가 작은 부분 문자열

// 문자열은 2개가 주어진다 => t 와 p
// p 의 길이만큼 t 를 여러개로 쪼개어준다
// ex) t = '12345' / p = '12' 일때 t = 12 / 23 / 34 / 45
// 01 12 23 
// 012 123

// 주의할 것: 이어지지 않는 2자리는 취급하지 않는다 ex) 51

// 이 때, p 의 길이만큼 쪼개어진 t 들의 숫자들 중에서 p 보다 작거나 같은 수는 몇 개인지 찾아라.

// key point : p 의 길이만큼 쪼갠 값들을 어떻게 활용할 것인가.

// 1. p의 길이만큼 t를 여러개로 쪼갠 배열을 만든다
// 1-1. slice
// 2. for-if문을 활용해서 [i]<=p

// t = 7 p 3 5
// t = 12 p 1 12
// t = 5 p 2

// => t - (p -1)

function solution(t, p) {
  let t_length = t.length
  let p_length = p.length
  let arr = []
  let p_num = parseInt(p)

  for (let i = 0; i < t_length - (p_length -1); i++) {
    arr.push(t.slice(i, p_length + i))
  }
  let arr1 = arr.map(Number)
  
  let result = 0
  for(let i = 0; i < arr1.length; i++) {
    if(arr1[i] <= p_num) result++
  }
  return result

}