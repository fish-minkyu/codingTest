function solution(dot){
  // 사분면의 조건문
  // 1사분면, x 양수 y 양수
  if (dot[0] > 0&& dot[1] > 0) {
    return ans = 1
  }
  // 2사분면, x 음수 y 양수
    else if (dot[0] < 0 && dot[1] > 0) {
      return ans = 2
    }
  // 3사분면, x 음수 y 음수
  else if (dot[0] < 0 && dot[1] < 0) {
    return ans = 3
  }
  // 4사분면, x 양수 y 음수
  else {
    return ans = 4
  }
}