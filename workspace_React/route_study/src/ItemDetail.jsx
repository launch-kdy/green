import React from 'react'
import { useParams } from 'react-router-dom'

const ItemDetail = () => {
  //url에서 넘어오는 데이터를 받기 위해 useParams() 훅을 사용
  const {itemNum, title} = useParams();
  console.log(data);
  console.log(data.itemNum);

  return (
    <div>
      <div>상세정보 페이지입니다</div>
    </div>
  )
}

export default ItemDetail