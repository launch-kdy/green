
#DISTINCT 키워드 - 중복제거
SELECT DISTINCT DEPNO FROM emp;
SELECT DISTINCT CG FROM BOOK;

#DISTINCT 키워드를 한 번 작성하면 뒤에 있는 모든 컬럼의 중복값을 제거한다.
#DISTINCT 키워드속 컬럼이 여러 개이면, 값이 전부 동일한 쌍이 중복값으로 제거된다. 
SELECT DISTINCT JOB, DEPTNO FROM emp;

#함수
#수치 함수 = 수학
#수치 함수 CELI(칼럼명 OR 숫자) = 올림
SELECT CEIL(SAL), CEIL(50.2), FROM emp;
SELECT CEIL(48.9); #문법학습을 위한 SELECT 쿼리문은 FROM절 안 넣어도 됨.
#수치 함수 FLOOR(칼럼명 OR 숫자) = 내림
SELECT CEIL(70.1), FLOOR(70.9);
#수치 함수 FLOOR(칼럼명 OR 숫자) = 반올림
SELECT ROUND(123.456), ROUND(123.456, 1), ROUND (123.456, 2);
#수치 함수 TRUNCATE = 내림 * 내림하는 결과의 소수점 및 컨트롤 가능하다 *
SELECT TRUNCATE(123.456, 1), TRUNCATE(123.456, 2)

#수치 함수 MOD = 나머지 연산
SELECT MOD(7,3), (10.4);

#EMP 테이블에서 사번이 짝수인 모든 환경 정보 조회
SELECT *
FROM emp
WHERE MOD(EMPNO, 2) = 0;

SELECT 3 + 5, 5 - 3, 5 /2;

#문자 관련 함수 = 문자
#문자 관련 함수 SUBSTR, SUBSTRING = 오려내기 * ('ABC', n -> ABC의 N번 뒤에 오려내기) & ('ABC', n , m-> ABC의 N번 뒤에 ~ m개 오려내기)
SELECT SUBSTR('ABCDEF', 3), SUBSTR('ABCDEF', 3, 2);
SELECT SUBSTRING('ABCDEF', 3), SUBSTRING('ABCDEF', 3, 2);

#문자 관련 함수 UPPER, LOWER = 대문자 소문자로 변환 
SELECT UPPER('MariaDB'), LOWER('MariaDB');

#문자 관련 함수 LTRIM, RTRIM, TRIM = 공백제거
SELECT RTRIM(' DB '), LTRIM(' DB '), TRIM(' DB ');

#문자 관련 함수 CHAR_LENGTH, LENGTHB
# CHAR_LENGTH 문자열의 길이, 공백포함 ' DB '  -> 4
# LENGTHB() : 문자열의 바이트수, 영문 1글자 1BYTE / 한글 1글자 : 3BYTE
SELECT CHAR_LENGTH('디비'), LENGTHB('디비'), CHAR_LENGTH('DB'), LENGTHB('DB');

#문자 관련 함수 CONCAT = 문자열 나열
SELECT CONCAT('A', 'B', 'C');
SELECT ENAME, JOB, CONCAT(ENAME, '사원의 직급은 ', JOB) FROM emp;

#문자 관련 함수 LPAD RPAD = 문자열의 길이를 맞추는 함수
SELECT LPAD('DB', 5, '#'), RPAD('DB', 5, '#'); LPAD('123', 5, '0');

#문자 관련 함수 REPLACE = 문자열 교체
SELECT REPLACE('나는 HOME에 가고 싶다', 'HOME', '집');


