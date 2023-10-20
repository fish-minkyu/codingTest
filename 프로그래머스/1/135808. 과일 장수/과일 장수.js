function solution(k, m, score) {
  let item = score.sort((a, b) => a - b).reverse();
  let price = 0
  
  for (let i = 0; i < Math.floor(score.length / m); i++) {
    let box = item.slice(i * m, (i+1) * m)
    price += box.at(-1) * m
  }

  return price
}