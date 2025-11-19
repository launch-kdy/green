  //게시글 관련된 api를 모아놓는 파일

import axios from "axios"

//게시글 목록 조회
export const getBoardListApi = async () => {
  try{
    const res = await axios.get('/api/board');
    return res.data;
  }catch(e){
    console.log('게시글 목록 조회 API 호출 시 오류 발생 : getBoardListApi()');
    console.log(e);
  }
}

/**
 * 게시글 상세 조회 API
 * @param boardNum 게시글 번호(int)
 */
export const getBoardDetail = async (boardNum) => {
  try{
    const res = await axios.get(`/api/board/${boardNum}`);
    return res.data;
  }catch(e){
    console.log('게시글 상세 조회 api 오류, getBoardDetail()')
    console.log(e)
  }
}


/**
 * 게시글 등록 API
 * @param boardInfo {'title' : '제목데이터', 'content' : '내용데이터'}
 */
export const regBoard = async (boardInfo) => {
  try{
    await axios.post('/api/board', boardInfo);
  }catch(e){
    console.log('게시글 등록 API 오류, regBoard()');
    console.log(e);
  }
}

//게시글 삭제

//게시글 수정















//과정의 단위기간을 계산하여 배열로 반환
function generatePeriods(startDate, endDate) {
  const start = new Date(startDate);
  const end = new Date(endDate);
  
  const formatDate = (date) => {
    const year = date.getFullYear();
    const month = String(date.getMonth() + 1).padStart(2, '0');
    const day = String(date.getDate()).padStart(2, '0');
    return `${year}-${month}-${day}`;
  };
  
  const periods = [];
  let periodNumber = 1;
  let currentStart = new Date(start);
  
  while (currentStart <= end) {
    // 현재 단위기간의 시작일 날짜
    const currentStartDay = currentStart.getDate();
    
    // 한 달 후의 년/월 계산
    let nextMonth = currentStart.getMonth() + 1;
    let nextYear = currentStart.getFullYear();
    
    if (nextMonth > 11) {
      nextMonth = 0;
      nextYear++;
    }
    
    // 다음 달의 마지막 날 확인
    const lastDayOfNextMonth = new Date(nextYear, nextMonth + 1, 0).getDate();
    
    // 단위기간 종료일 계산
    let currentEnd;
    if (currentStartDay <= lastDayOfNextMonth) {
      // 다음 달에 같은 날짜가 있으면: (시작일 - 1)일까지
      currentEnd = new Date(nextYear, nextMonth, currentStartDay - 1);
    } else {
      // 다음 달에 같은 날짜가 없으면: 다음 달의 마지막 날까지
      currentEnd = new Date(nextYear, nextMonth, lastDayOfNextMonth);
    }
    
    // 전체 종료일을 넘지 않도록
    if (currentEnd > end) {
      periods.push({
        단위기간: periodNumber,
        시작일: formatDate(currentStart),
        종료일: formatDate(end)
      });
      break;
    } else {
      periods.push({
        단위기간: periodNumber,
        시작일: formatDate(currentStart),
        종료일: formatDate(currentEnd)
      });
    }
    
    // 다음 단위기간 시작일
    currentStart = new Date(currentEnd);
    currentStart.setDate(currentStart.getDate() + 1);
    periodNumber++;
  }
  
  return periods;
}

//특정 날짜가 포함된 단위기간 찾기
function findCurrentPeriod(periods, todayStr) {
  const today = new Date(todayStr);

  const found = periods.find(p => {
    const start = new Date(p.시작일);
    const end = new Date(p.종료일);
    return today >= start && today <= end;
  });

  if (!found) {
    return { message: '해당 날짜는 어떤 단위기간에도 포함되지 않습니다.' };
  }

  return {
    현재단위기간: found.단위기간,
    시작일: found.시작일,
    종료일: found.종료일
  };
}





