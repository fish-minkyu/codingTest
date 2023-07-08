function solution(sides) {
  let ssides = sides.sort((a, b) => a-b)
  if (ssides[2] < ssides[1] + ssides[0]) {
    return 1
  } else {
    return 2
  }
}