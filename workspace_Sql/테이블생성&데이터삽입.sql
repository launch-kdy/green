
# 테이블 생성

# 학생 정보 저장하는 테이블 생성문
CREATE TABLE STUDENT(
	STU_NUM INT PRIMARY studentKEY, # 중복데이터 (X)  NULL (X) - 저 장 불 가 - 
	STU_NAME VARCHAR(10),
	KOR_SCORE INT,
	MATH_SCORE INT
);

SELECT * FROM student;
COMMIT;
ROLLBACK;

# 데이터 삽입 문법
#'INSERT INTO 테이블명 (컬럼들) VALUES (값들);'
INSERT INTO student (STU_NUM, STU_NAME, KOR_SCORE, MATH_SCORE) 
VALUES (2, '김자바', 80, 90);

# 컬럼명은 반드시 테이블에 정의된 컬럼의 갯수를 맞출 필요가 없다.
# 순서도 맞출 필요 없다.
INSERT INTO student (STU_NUM, MATH_SCORE, STU_NAME)
VALUES (3, 100, '이자바');

INSERT INTO student (KOR_SCORE, MATH_SCORE, STU_NUM)
VALUES (60, 70, 4);

# 데이터의 변화가 발생하는 쿼리문(삽입, 삭제, 수정) 실행시
# 반드시 CMIMIT 혹은 ROLLBACK 을 진행해야한다.
ROLLBACK;

# 테이블 삭제 쿼리 : DROP TABLE 테이블명
DROP TABLE student;

# STUDENT 테이블 안에 모든 데이터를 지우세요

# 회원 정보 테이블 
# 아이디, 비밀번호, 회원이름, 회원나이, 이메일 정보등을 갖고있다.
CREATE TABLE MEMBER(
	MEM_ID VARCHAR(10) PRIMARY KEY,
	MEM_PD VARCHAR(10) NOT NULL,
	MEM_NAME VARCHAR(10) NOT NULL,
	MEM_AGE INT,
	MEM_EMAIL VARCHAR(20) UNIQUE # 중복데이터 (X)  NULL은 가능 (O)중복 체크 안 함
);

SELECT * FROM MEMBER;
# 아이디 : java
# 비번 : 1111
# 이름 : 김자바
# 나이 : 30
# 이메일 : java@gmail.com
INSERT INTO MEMBER(MEM_ID, MEM_PD, MEM_NAME, MEM_AGE, MEM_EMAIL)
VALUES ('java', '1111', '김자바', 30, 'java@gmail.com');

INSERT INTO MEMBER(MEM_ID, MEM_PD, MEM_AGE, MEM_EMAIL, MEM_NAME)
VALUES ('java2', '1234', 30, NULL, 'AAA');

#테이블 생성문에서 작성한 순서대로 데이터를 삽입하면 컬럼명 생략 가능
INSERT INTO MEMBER VALUES ('JAVA3', '2222', '최자바', 40, 'aaa@gmail.com');
COMMIT;


#게시판 테이블
#글번호, 제목, 작성자, 내용, 작성일, 조회수
SELECT * FROM board;

CREATE TABLE BOARD(
	BOARD_NUM INT PRIMARY KEY AUTO_INCREMENT, #자동증가
	TITLE VARCHAR(20) NOT NULL,
	WRITER VARCHAR(10) NOT NULL,
	CONTENT VARCHAR(100),
	CREATE_DATE DATETIME DEFAULT SYSDATE(), # DEFAULT + SYSDATE
	READ_CNT INT DEFAULT 0 # DEFAULT
);
COMMIT;
INSERT INTO BOARD (TITLE, WRITER)
VALUES ('제목1', '작성자1');

INSERT INTO BOARD (TITLE, WRITER, READ_CNT, CREATE_DATE, BOARD_NUM)
VALUES ('제목1', '작성자1', 5, '2020-10-10 17:50:00', 10);


SELECT * FROM board;

SELECT * FROM emp;

