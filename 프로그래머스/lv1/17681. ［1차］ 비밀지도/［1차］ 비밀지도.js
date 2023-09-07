// 1. 반복문을 통해 arr1과 arr2를 이진수로 바꾸고 더해준다.
//  1-1. 이때, 숫자로 바꿔 더하고 다시 문자로 바꿔준다.
// 2. 이중반복문 선언, 더한 이진수들을 조건문을 통해 "#"과 " "으로 바꿔준다.
// 3. 배열로 넣어준다.

function solution(n, arr1, arr2) {
  let sum = 0, ans = []

  for (let i = 0; i < n; i++) {
    sum = Number(arr1[i].toString(2)) + Number(arr2[i].toString(2)) + ''

    // sum의 길이가 n과 다를 시, str에 공백 추가(자릿수 마추기)
    let str = ''
    if (sum.length < n) {
      str = Array(n - sum.length).fill(' ').join('')
    };
    
    for (let j = 0; j < sum.length; j++) {
      Number(sum[j]) ? str += '#' : str += " "
    };
    ans.push(str)
  };

  return ans
}