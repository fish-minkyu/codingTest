function solution(money) {
  var ans = [];
  let coffee = Math.floor(money / 5500)
  let change = money - (5500 * coffee)
  return ans = [coffee, change]
}