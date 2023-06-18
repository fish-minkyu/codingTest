function solution (ineq, eq, n, m) {
    let ans = 0
    switch (ineq+eq) {
        case '>=':
            ans = n >= m ? 1 : 0
            break
        case '<=':
            ans = n <= m ? 1 : 0
            break
        case '<!':
            ans = (n < m) ? 1 : 0
            break
        case '>!':
            ans = (n > m) ? 1 : 0
            break
}
    return ans
}