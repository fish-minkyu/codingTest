select
    d.id as ID
    , d.email as EMAIL
    , d.first_name as FIRST_NAME
    , d.last_name as LAST_NAME
from
    developer_infos as d
where
    d.skill_1 = 'Python'
    or d.skill_2 = 'Python'
    or d.skill_3 = 'Python'
order by d.id