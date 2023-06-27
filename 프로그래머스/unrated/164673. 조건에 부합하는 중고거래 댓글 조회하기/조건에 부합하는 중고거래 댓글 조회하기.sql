SELECT
    ub.title,
    ub.board_id,
    ur.reply_id,
    ur.writer_id,
    ur.contents,
    DATE_FORMAT(ur.created_date, '%Y-%m-%d')
FROM
    USED_GOODS_BOARD AS ub
JOIN
    USED_GOODS_REPLY AS ur ON ub.board_id = ur.board_id
WHERE
    ub.created_date like ('2022-10-%')
ORDER BY
    ur.created_date ASC, ub.title ASC