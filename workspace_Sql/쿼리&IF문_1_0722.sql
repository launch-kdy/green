study_dbstudy_db#날짜 관련 함수
SELECT NOW(), SYSDATE(), CURRENT_DATE(), CURRENT_TIME();

SELECT YEAR(NOW()), MONTH(NOW()), DAY(NOW());

SELECT * FROM emp;
#EMP 테이블에서 2005년 이후에 입사한 사원들의 모든 정보를 조회
SELECT * FROM emp
WHERE YEAR(HIREDATE) >= 2005;


SELECT 
	HIREDATE
	, TO_CHAR(HIREDATE, 'YYYY.MM.DD HH24:MI:SS')
	, TO_CHAR(HIREDATE, 'YYYY')
	, YEAR(HIREDATE)
	, TO_CHAR(HIREDATE, 'YYYY-MM--DD')
	, TO_CHAR(HIREDATE, 'YYYYMMDD')
	#, TO_CHAR(HIREDATE, 'YYYY년 MM월 DD일')
	, CONCAT(
		TO_CHAR(HIREDATE, 'YYYY'),
		'년',
		TO_CHAR(HIREDATE, 'MM'),
		'월',
		TO_CHAR(HIREDATE, 'DD'),
		'일'
	) AS 입사일
FROM emp;

#IF문 - 시험 미출제
SELECT IF(10 > 2, '참', '거짓');

#IFNULL() -> NULL을 특정 값으로 치환 (평균이나 갯수 구할 때 많이사용)- 시험 출제
SELECT COMM, IFNULL(COMM, 0) FROM emp;

#사원의 사번, 이름 부서번호 부명을 조회해보자
#부서명은 부사번호가 10 일 때는 인사부 20 일때는 영업부
#30일때는 개발부 그 외의 값을 생산부로 조회되어야한다

SELECT
	EMPNO,
	ENAME,
	DEPTNO,
	CASE DEPTNO
		WHEN	10 THEN '인사부'
		WHEN 20 THEN '영업부'
		WHEN 30 THEN '개발부'
		ELSE '생산부' END AS 부서명
FROM emp;

