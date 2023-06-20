function solution(spell, dic) {
    let spell_str = spell.sort().join('') // dxz
    
    for (let i = 0; i < dic.length; i++) {
        dic[i] = dic[i].split('').sort().join('') // [ 'def', 'dww', 'dxz', 'aelovw' ]
    }

    for (let j = 0; j < dic.length; j++) {
        return dic.includes(spell_str) ? 1 : 2
    }
    
}