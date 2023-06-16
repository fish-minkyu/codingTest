process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const n = data.split(" ");
    const a = Number(n[0]), b = Number(n[1]);

    let star = '*'
    let star_repeat = star.repeat(a)

    // console.log(star_repeat.repeat(b)) // ***************

    for (let i = 0; i < b; i++) {
        console.log(star_repeat)
    }
    
});
