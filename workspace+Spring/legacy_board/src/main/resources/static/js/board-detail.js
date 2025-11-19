// 삭제 함수
const goDelete = (boardNum) => {
  const result = confirm("게시글을 삭제할까요?");

  if(result) location.href = `/boards/delete/${boardNum}`

}

// 목록가기(그냥 뒤로가기 원리)
const goList = () => {
  // ( 1. 그냥 뒤로가기 원리 )
  // 웹브라우저의 뒤로가기 버튼이랑 완전 같음
  history.back();

  // ( 2. 뒤로가면 갈 페이지를 명시해주는 원리 )
  // location.href = '/board'
}

// 수정 함수
const goUpdate = (boardNum) => {
  location.href = `/boards/update/${boardNum}`;
}