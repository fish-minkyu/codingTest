function solution(number, limit, power) {
  const nums = [];

  // 1부터 number 까지 순차적으로 약수의 개수를 확인한다.
  for (let cur = 1; cur <= number; cur++) {
    let divisor = 0;

    // 1부터 현재 수의 절반 까지만 반복문을 돌린다.
    // 약수는 본래 값(n)을 제외하고 n/2보다 클 수 없기 때문이다.
    for (let i = 1; i <= cur / 2; i++) {

      if (cur % i === 0) {
        divisor += 1;
      }
    }

    // 위에서 본래 값을 제외하고 반절만 돌렸기 때문에
    // 본래 값을 넣어준다 생각 하고 1을 더 더해준다.
    nums.push(divisor + 1); // [1, 2, 5, 10]일 때, 5까지 돌리고 +1을 해줘야 10도 약수에 포함되기 때문
  }

  // 위 작업을 통해 나온 개수의 배열을 map과 reduce를 통해 정답을 구한다.
  // num === [1, 2, 2, 3, 2]
  return nums
    .map((n) => {

      // n이 limit보다 크게되면 협약기관에서 정한 공격력을 가지는 무기를
      // 그렇지 않으면 그대로 n을 구매한다.
      return n > limit ? power : n;
    })
    .reduce((acc, cur) => acc + cur, 0);
}