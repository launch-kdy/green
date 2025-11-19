import React, { useEffect, useState } from 'react'
import Modal from '../common/Modal'
import axios from 'axios';
import styles from './BuyListModal.module.css'

const BuyListModal = ({detailList, isOpen, onClose}) => {

  return (
    <Modal 
      isOpen={isOpen}
      size='600px'
      title='구매상세내역'
      onClose={onClose}
    >
      {/* {children} = 들어갈 내용*/}
      <div className={styles.container}>
        <table className={styles.list_table}>
          <colgroup>
            <col width='10%'/>
            <col width='40%'/>
            <col width='20%'/>
            <col width='10%'/>
            <col width='*'/>
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td>상품정보</td>
              <td>가격</td>
              <td>수량</td>
              <td>총 가격</td>
            </tr>
          </thead>
          <tbody>
          {            
            detailList.map((e, i) => {
              return(
                <tr key={i}>
                  <td>{detailList.length - i}</td>
                  {/* (2개 띄우려면 div로 감싸기) 이미지 & 상품명 */}
                  <td>
                    <div className={styles.product_info}>
                      <img src={`http://localhost:8080/upload/${e.bookDTO.imgList[0].attachedImgName}`} 
                      style={{width:'50px'}}/>
                      <span>{e.bookDTO.title}</span>
                    </div>
                  </td>
                  <td>{e.bookDTO.price}</td>
                  <td>{e.buyCnt}</td>
                  <td>{e.totalPrice}</td>
                </tr>
              )
            })
          }
          </tbody>
        </table>
      </div>  
    </Modal>
  )
}

export default BuyListModal