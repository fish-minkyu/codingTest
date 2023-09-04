function solution(n) {
 let threeReverse = parseInt([...n.toString(3)].reverse().join(''), 3)
 return threeReverse
}