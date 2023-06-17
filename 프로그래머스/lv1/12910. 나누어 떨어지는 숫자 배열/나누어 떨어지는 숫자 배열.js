function solution(arr, divisor) {
    var ans = [];

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] % divisor == 0) {
            ans.push(arr[i]) 
        }
    }

    (ans.length == 0) ? ans.push(-1) : ans.sort(function(a, b) {
        return a -b
    })
  
    return ans;
}