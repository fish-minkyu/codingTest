SELECT DISTINCT 
    user_ID, 
    PRODUCT_ID
FROM 
    ONLINE_SALE
WHERE 
    (user_ID, PRODUCT_ID) IN (
                                SELECT 
                                    user_ID, PRODUCT_ID
                                FROM 
                                    ONLINE_SALE
                                GROUP BY 
                                    user_ID, PRODUCT_ID
                                HAVING 
                                    COUNT(*) > 1
)
ORDER BY 
user_ID ASC, PRODUCT_ID DESC;