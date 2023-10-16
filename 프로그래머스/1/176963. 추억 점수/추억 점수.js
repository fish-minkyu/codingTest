let name = ["may", "kein", "kain", "radi"];
let yearning = [5, 10, 1, 3];
let photo = [["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]];

function solution(name, yearning, photo) {
  let sum = 0;
  let result = [];

  let obj = name.reduce(function(acc, currentValue, index) {
    acc[currentValue] = yearning[index];
    return acc;
  }, {});

  for (let i = 0; i < photo.length; i++) {
    for (let j = 0; j < photo[i].length; j++) {
      if (obj[photo[i][j]]) {
        sum += obj[photo[i][j]];
      } else {
        sum += 0
      }
      
    }
    result.push(sum);
    sum = 0
  }

  return result;
}