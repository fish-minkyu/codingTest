// 13번

// 2016년은 윤년
// 매개변수_ 달 : a, 일 : b
// day [] : 요일 배열(일 ~ 월)
// monthdays [] : 달 일수 배열
// 2016. 01. 01시, 금요일
// => 금요일로 맞출려면 b+4
// 

function solution(a, b) {
    day = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']
    monthdays = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

    let firstDay = b + 4

    for (let i = 0; i < a-1; i++) {
        firstDay += monthdays[i]
    }

    return day[firstDay % 7]
}