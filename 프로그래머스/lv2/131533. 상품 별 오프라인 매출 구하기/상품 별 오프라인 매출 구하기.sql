-- 코드를 입력하세요
SELECT
     p.product_code,
     sum(p.price * o.sales_amount) AS sales
FROM
    product p
JOIN
    OFFLINE_SALE o ON p.product_id = o.product_id
GROUP BY
    p.product_code
ORDER BY
    sales DESC, p.product_code