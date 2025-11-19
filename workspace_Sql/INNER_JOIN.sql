# 조인 (JOIN) - <다수의 테이블>에 있는 <정보를> 동시에 조회

# 사전 지식
# 사원번호, 사원명, 급여, 부서번호 조회
SELECT EMPNO, ENAME, SAL, DEPTNO
FROM emp;

# 위 쿼리문에 생략된 부분을 살리면...
SELECT EMP.EMPNO, EMP.ENAME, EMP.SAL, EMP.DEPTNO
FROM emp;

# 별칭을 테이블명에 적용시키면... (테이블 명 - X AS)
SELECT EMPNO, ENAME, SAL 급여, DEPTNO AS 부서번호
FROM emp 부서정보;

# 두 내용을 함께 사용하면 다음과 같다.
SELECT E.EMPNO, E.ENAME, E.SAL, E.DEPTNO
FROM emp E;

# ---- 조인의 기본문법 (Cross Join) 가짜 데이터들이 섞여서 나옴 ----<------------------------- #
# ---- 여기서 (ON절)만 추가하면 -----------------> 조인의 기본문법 (Inner Join) ----<--------- #
# 사번 사원명 급여 (Emp 테이블) / 부서명 (Dept 테이블) / _ 부서번호 (Emp + Dept 테이블) _ / 조회
SELECT * FROM emp; #14개
SELECT * FROM dept; #4개

SELECT EMPNO, ENAME, SAL, DNAME, EMP.DEPTNO, dept.DEPTNO #56개
FROM emp INNER JOIN dept
ON emp.DEPTNO = dept.DEPTNO;

# Q. 급여가 300 이상인 사원들의 사번 사원명 급여 부서번호 부서명 부서지역(LOC)을
# 조회하되, 급여기준 내림차순으로 정렬
SELECT EMPNO, ENAME, SAL, E.DEPTNO, DNAME, LOC
FROM emp E INNER JOIN dept D
ON E.DEPTNO = D.DEPTNO
WHERE SAL >= 300
ORDER BY SAL DESC;







