function solution(n) {
  var answer = 0;
  if ( n % 7 === 0) {
    return answer = n/7
  } else if (n < 7) {
    return answer = 1
  }
  else {
    return answer = Math.trunc(n/7) + 1
  }
}