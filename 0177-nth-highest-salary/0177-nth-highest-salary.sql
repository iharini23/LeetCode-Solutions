CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  DECLARE offset_val INT;
  SET offset_val = N - 1;
  RETURN (
    SELECT salary 
    FROM(
        SELECT DISTINCT salary 
        FROM Employee
        ORDER BY salary DESC
    ) t
    LIMIT offset_val, 1
  );
END