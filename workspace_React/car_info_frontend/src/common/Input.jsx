import React from 'react'
import styles from './Input.module.css'

// (Input 컴포넌트)

const Input = ({size='120px', ...props}) => {
  return (
    <input 
      style={{width : size}}
      className={styles.input} 
      {...props} 
    />
  )
}

export default Input