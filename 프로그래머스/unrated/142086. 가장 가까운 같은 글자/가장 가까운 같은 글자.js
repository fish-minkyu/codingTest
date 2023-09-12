// 숫자 담을 주머니
// 중복 문자인지 판단할 수 있는 주머니
// stack 주머니에 s[i]가 없다면 ans에 -1과 stack에 s[i] 넣기
// stack 주머니에 s[i]가 있다면 

function solution(s) {
  let ans = [], stack = []

  for (let i = 0; i < s.length; i++) {
    if (!stack.includes(s[i])) {
      ans.push(-1)
      stack.push(s[i])
      continue
    }

    if (stack.includes(s[i])) {
      ans.push(stack.length - stack.lastIndexOf(s[i]))
      stack.push(s[i])
      continue
    }
  }

  return ans
}