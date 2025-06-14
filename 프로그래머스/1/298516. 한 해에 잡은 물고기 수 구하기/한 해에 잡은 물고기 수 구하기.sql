select count(*) as FISH_COUNT
from fish_info as f
where
    f.time like '2021%'