select f.id as ID, f.length as LENGTH
from fish_info as f
where
    f.length > 10
order by
    f.length desc, f.id
limit 10