function solution(str_list, ex) {
    const ans = str_list.map(item => {
        if (item.includes(ex)) {
            return
        } else {
            return item
        }
    })

    return ans.join('')
}