SELECT
    f.product_id,
    f.product_name,
    f.product_cd,
    f.category,
    f.price
FROM
    FOOD_PRODUCT f
ORDER BY
    f.price dESC
LIMIT 1