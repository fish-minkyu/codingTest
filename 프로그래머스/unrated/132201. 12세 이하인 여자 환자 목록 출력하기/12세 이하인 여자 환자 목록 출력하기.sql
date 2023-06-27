SELECT
    p.pt_name,
    p.pt_no,
    p.gend_cd,
    p.age,
    if(p.tlno is NULL, 'NONE', p.tlno)
FROM
    patient AS p
WHERE
    p.age <= 12
    and p.gend_cd = 'W'
ORDER BY
    age desc, p.pt_name ASC