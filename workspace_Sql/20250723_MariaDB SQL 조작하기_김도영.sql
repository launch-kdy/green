team_dbteam_dbteam_db# (문제1) 도서정보 테이블 BOOK_INFO를 생성해보자. 
# 도서정보 테이블은 
# 도서 번호, 도서명, 저자, 도서 가격, 출판사, 발행일이 있다.
# 기본키는 도서번호로 지정하고, 
# 도서명, 저자는 NULL값이 들어올 수 없다. 
# 출판사 컬럼에 들어갈 데이터가 지정되지 않으면 
#‘미지정’이라는 문자 데이터가 기본값으로 들어가야 한다.
CREATE TABLE BOOK_INFO (BOOK_NUM INT PRIMARY KEY, BOOK_TITLE VARCHAR(50) NOT NULL, BOOK_WRITER VARCHAR(50) NOT NULL, BOOK_PRICE INT, BOOK_COMPANY VARCHAR(50), BOOK_DATE DATETIME DEFAULT SYSDATE());

SELECT * FROM BOOK_INFO;

# (문제2) 위에서 생성한 BOOK_INFO 테이블에 
# 다음의 데이터를 삽입하는 쿼리문을 작성하시오.
INSERT INTO book_INFO (BOOK_NUM, BOOK_TITLE, BOOK_WRITER, BOOK_PRICE, BOOK_COMPANY, BOOK_DATE) VALUES (101, '자바 기초', '홍길동', 30000, 'A출판', '2025-02-15');
INSERT INTO book_INFO (BOOK_NUM, BOOK_TITLE, BOOK_WRITER, BOOK_PRICE, BOOK_COMPANY, BOOK_DATE) VALUES (102, '리액트 기초', '이순신', 20000, 'B출판', '2025-01-22');

SELECT * FROM BOOK_INFO;

# (문제3) BOOK_INFO에서 
# 도서번호가 101번인 도서의 
# 도서명은 ‘자바_고급’, 가격은 25000, 
# 출판사는 ‘IT출판’으로 변경하는 쿼리문을 작성하시오.
UPDATE BOOK_INFO SET BOOK_TITLE = '자바_고급', BOOK_PRICE = BOOK_PRICE - 5000, BOOK_COMPANY = 'IT출판' WHERE BOOK_NUM = 101;

SELECT * FROM BOOK_INFO;

# (문제4-EMP) 급여가 500에서 3000 사이이고 
# 커미션이 NULL인 사원의 사원번호, 사원명, 
# 급여, 커미션을 조회하는 쿼리문을 작성하세요. 
# 단, 커미션 컬럼은 ‘인센티브’라는 별칭으로 조회하시오.

SELECT * FROM emp;

SELECT EMPNO, ENAME, SAL, COMM AS 인센티브 FROM emp WHERE SAL BETWEEN 500 AND 3000 AND COMM IS NULL;

# (문제5-EMP) 사원들 중 이름에
# ‘병’이 들어가거나, ‘김’이 들어가는 사원들의 
# 사번, 이름, 직급, 입사일을 조회하되, 
# 직급 기준 오름차순으로 정렬 후, 
# 사번기준 내림차순 정렬하여 조회하는 쿼리문을 작성하세요.

SELECT * FROM emp;

SELECT EMPNO, ENAME, JOB, HIREDATE FROM emp WHERE ENAME LIKE '%병%' OR '%김%' ORDER BY JOB ASC, EMPNO DESC;

# (문제6-EMP) 사원의 사번, 이름, 부서번호, 부서명을 조회해보자. 
# 부서명은 부서번호가 10일 때는 ‘인사부’, 
# 20일 때는 ‘영업부’, 30일 때는 ‘개발부’, 
# 그 외의 값은 ‘생산부’로 조회되어야 한다. 
# 조인 사용하는 문제 아님. CASE 사용..

SELECT * FROM emp;

SELECT EMPNO, ENAME, DEPTNO, CASE DEPTNO WHEN 10 THEN '인사부' WHEN 20 THEN '영업부' WHEN 30 THEN '개발부' ELSE '생산부' END AS DEPT_NAME FROM emp;

# (문제7-EMP) 짝수 월에 입사한 사원 중에서 
# 직급이 사원, 과장, 차장인 사원의 
# 사번, 이름, 입사일을 입사일 기준 오름차순으로 조회하는 
# 쿼리문을 작성하세요. 
# 단, 입사일은 년.월.일 시.분.초 형태로 조회하시오. 
# EX> 2025.01.03. 17.50.36

SELECT * FROM emp;

SELECT EMPNO, ENAME, HIREDATE, TO_CHAR(HIREDATE, 'YYYY.MM.DD. HH24.MI.SS') HIREDATE FROM emp WHERE MOD(MONTH(HIREDATE), 2) = 0 AND JOB IN ('사원', '과장','차장') ORDER BY HIREDATE ASC;

# (문제8-EMP) 사번, 사원명, 급여, 커미션, 총 급여를 조회하여라.
# 총 급여는 다음과 같이 계산한다.
# 총 급여 : 급여 * 12 + 커미션
# 데이터 조회 시 커미션이 null이라면 
# 0으로 치환하여 계산하고, 
# 총 급여는 TOTAL_SALARY라는 별칭으로 조회하여라.
# 단, 조회 데이터는 총 급여 기준 내림차순으로 정렬하시오.

SELECT * FROM emp;
# IF x 라면(a를, b로 치환)
SELECT EMPNO, ENAME, SAL, COMM, SAL * 12 + IFNULL(COMM, 0) AS TOTAL_SALARY FROM emp ORDER BY SAL * 12 + IFNULL(COMM,0) DESC;

# (문제9-EMP) 입사년도가 2003년부터 2006년까지인 사원들의 
# 사번, 부서번호, 부서명, 성을 제외한 사원명을 조회하여라. 성을 제외한 
# 사원명은 ‘이름’이라는 별칭을 사용하고, 
# 성은 전체이름 중 처음 한 글자만 성이라고 간주한다.

SELECT EMPNO, DEPNO, SUBSTR(ENAME, 2) FROM emp WHERE YEAR(HIREDATE) 2003 AND 2006;

# (문제10-EMP) 아래와 같은 데이터가 있는 ORDER_INFO 테이블에서
# SELECT DISTINCT 주문상품, 주문수량, 
# 주문자ID FROM ORDER_INFO WHERE 주문수량 >= 2;
# 쿼리 실행 결과 조회되는 행의 개수는 몇 개인가?
# 3개