select
    round(avg(if(f.length is null, '10', f.length)), 2) as AVERAGE_LENGTH
from
    fish_info as f