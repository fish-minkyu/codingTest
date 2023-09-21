function solution(food) {
  let resultArray = [];

  for (let i = 0; i < food.length; i++) {
    if (food[i] >= 2) {
      const halfValue = Math.floor(food[i] / 2);
      const repeatedValue = Array(halfValue * 2).fill(i);
      resultArray = [...resultArray.slice(0, resultArray.length / 2), ...repeatedValue, ...resultArray.slice(resultArray.length / 2)];
    }
  }

  resultArray.splice(Math.floor(resultArray.length / 2), 0, '0');
  return resultArray.join('');
}