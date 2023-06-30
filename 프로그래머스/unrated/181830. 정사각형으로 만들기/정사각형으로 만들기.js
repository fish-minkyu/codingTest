  function solution(arr) {
    let width = arr.length
    let heigth = arr[0].length
  
    if (width > heigth) {
        for (let i = 0; i < width; i++) {
            for (let j = 0; j < width - heigth; j++) {
                arr[i].push(0)
            }
        }
    } else if (width < heigth) {
        for (let i = 0; i < heigth - width; i++) {
            arr.push(Array(heigth).fill(0))
        }
    } else {
      arr
    }
    return arr
  }