function solution(n, k) {
  var answer = 0;
  let bev = 0;
  // 양꼬치 = 12000 * n
  let sheep = 12000 * n
  // 조건문 음료수 = n/10, 2000 * k
  if ((n / 10) > 0) {
    bev = 2000 * (k - Math.trunc(n/10))
  } else {
    bev = 2000 * k
  }
  answer = sheep + bev
    return answer
}
