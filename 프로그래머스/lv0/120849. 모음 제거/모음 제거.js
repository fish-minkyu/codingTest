function solution (my_stirng) {
  var newString = ''
  for (let i = 0; i <= my_stirng.length-1; i++) {
    if (my_stirng[i] === 'a') {
      continue
    } else if (my_stirng[i] === 'e') {
      continue
    } else if (my_stirng[i] === 'i') {
      continue
    } else if (my_stirng[i] === 'o') {
      continue
    } else if (my_stirng[i] === 'u') {
      continue
    }else {
      newString += my_stirng[i]
    }
  }
  return newString
}