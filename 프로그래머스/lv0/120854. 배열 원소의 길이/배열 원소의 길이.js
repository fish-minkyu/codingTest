function solution(strlist) {
  var newStrList = []
  for (let i = 0; i < strlist.length; i++) {
    newStrList.push(strlist[i].length)
  }
  return newStrList
}