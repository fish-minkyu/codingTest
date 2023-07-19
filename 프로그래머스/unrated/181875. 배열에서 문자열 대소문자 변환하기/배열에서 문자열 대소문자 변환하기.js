function solution(strArr) {
  return strArr.map((item, index) => {
    return (index % 2 == 0) ? item.toLowerCase() : item.toUpperCase()
  })
}