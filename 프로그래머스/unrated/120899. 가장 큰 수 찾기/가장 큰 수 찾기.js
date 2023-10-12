function solution(array) {
let [max, index] = [0, 0]

  array.map((v, i) => {
    if (v > max) {
      max = v;
      index = i;
    }
  });

  return [ max, index ];
}