-- 코드를 입력하세요
SELECT COUNT(*)
FROM (
    SELECT *
    FROM USER_INFO
    WHERE TO_CHAR(JOINED, 'YYYY') = '2021'
)
WHERE AGE BETWEEN 20 AND 29