function solution(numbers, num1, num2) {
  var newNumbers = []
  for (let i = num1; i <= num2; i++) {
    newNumbers.push(numbers[i])
  }
  return newNumbers
}