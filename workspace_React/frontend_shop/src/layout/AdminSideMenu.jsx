import React from 'react'
import styles from './AdminSideMenu.module.css'
import { Link, NavLink, useLocation } from 'react-router-dom'

// * NavLink
//현재 url과 링크의 경로가 일치할 때 자동으로 active class를 추가해주는 기능
//현재 어느 페이지에 있는지 시각적인 디자인 요소를 추가 할 수 있음.
// NavLink 컴포넌트의 className 속성에는 화살표 함수를 작성 할 수 있고,
// 이 함수의 매개변수에는 객체가 하나 전달 됨
// ----------------------------------------------------------------------
// 매개변수로 전달되는 객체의 isActive 키는 현재 접속한 url과
// NavLink 컴포넌트의 to 속성에 작성한 url이 일치하면 true 로 리턴한다.
// ----------------------------------------------------------------------
// (걍 console.log에 다 출력 되는데, 내가 누른 객체에 true 표시가 뜬 다는 거임)
// ----------------------------------------------------------------------

const AdminSideMenu = () => {
  //useLocation hook은 현재 url의 정보를 객체로 리턴한다.
  const urlInfo = useLocation();
  //현재 접근한 url 주소
  console.log(urlInfo.pathname);

  return (
    <div className={styles.container}>
    {
      // url이 '/user'로 시작되는 문자열이면...
      urlInfo.pathname.startsWith('/user')
      ? 
      <div className={styles.menuCategory}>
        <p>
          <span>
            <i className="bi bi-bag-fill"></i>
          </span>
          마이페이지
        </p>
        <ul className={styles.sideMenu}>
          <li className={styles.menu_li}>
            <NavLink 
              to={'/user/cart-list'}
              className={({isActive}) => isActive ? styles.active : null}
            >
              장바구니
            </NavLink>
          </li>
          <li className={styles.menu_li}>
            <NavLink 
              to={'/user/buy-list'}
              className={({isActive}) => isActive ? styles.active : null}
            >
              구매 내역
            </NavLink>
          </li>
          <li className={styles.menu_li}>내 정보 관리</li>
        </ul>
      </div>
      :
      <>
        <div className={styles.menuCategory}>
          <p>
            <span>
              <i className="bi bi-bag-fill"></i>
            </span>
            상품관리
          </p>
          <ul className={styles.sideMenu}>
            <li className={styles.menu_li}>
              <NavLink
                to={'/admin/cate-manage'}
                className={({isActive}) =>
                  isActive ? styles.active : null}
              >
                카테고리관리
              </NavLink>
            </li>
            <li className={styles.menu_li}>
              <NavLink
                to={'/admin/reg-book'}
                className={({isActive}) =>
                  isActive ? styles.active : null}
              >
                도서등록
              </NavLink>
            </li>
            <li className={styles.menu_li}>도서관리</li>
          </ul>
        </div>
        <div className={styles.menuCategory}>
          <p>
            <span>
              <i className="bi bi-person-lines-fill"></i>
            </span>
            고객관리
          </p>
          <ul className={styles.sideMenu}>
            <li className={styles.menu_li}>고객정보조회</li>
            <li className={styles.menu_li}>고객정보변경</li>
            <li className={styles.menu_li}>게시판관리</li>
          </ul>
        </div>
        <div className={styles.menuCategory}>
          <p>
            <span>
              <i className="bi bi-clipboard-data-fill"></i>
            </span>
            매출관리
          </p>
          <ul className={styles.sideMenu}>
            <li className={styles.menu_li}>
              <NavLink
                to={'/admin/buy-list'}
                className={({isActive}) =>
                  isActive ? styles.active : null}
              >
                구매이력조회
              </NavLink>
            </li>
            <li className={styles.menu_li}>주간매출관리</li>
            <li className={styles.menu_li}>년간매출관리</li>
          </ul>
        </div>
      </>
    }
    </div>
  )
}

export default AdminSideMenu