function solution(arr1, arr2) {
  let [sum1, sum2] = [0, 0]

  if (arr1.length == arr2.length) {
    arr1.map(item => sum1 += item)
    arr2.map(item => sum2 += item)

    return sum1 > sum2 ? 1 : sum1 == sum2 ? 0 : -1
  }

  return arr1.length > arr2.length ? 1 : -1
}