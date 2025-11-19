import { Keyboard, Pressable, StyleSheet, Text, TouchableWithoutFeedback, View } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native-safe-area-context'
import Button from '../../../components/common/Button'
import axios from 'axios'

// app/profile/index.jsx
// profile 탭을 터치하면 실행되는 페이지
const ProfileHomeScreen = () => {

  // 버튼 1 클릭시 실행함수
  const test1= () => {
    axios.get('http://192.168.30.108:5000/t1')
    .then(res => {
      console.log(res.data)
    })
    .catch(error => console.log(error))
  };

  // 버튼 2 클릭시 실행함수
  // UrlParameter로 데이터 가져가기
  // ex @getMapping('/item.')
  const test2 = () => {
    axios.get('http://192.168.30.108:5000/t2/5')
    .then(console.log('통신 성공'))
    .catch(error => console.log(error))
  };

  // 버튼 3 클릭시 실행함수
  const test3 = () => {
    axios.post('http://192.168.30.108:5000/t3', {
      stuName : 'kim',
      stuAge : 20
    })
    .then(res => {
      console.log(res.data)
    })
    .catch(error => console.log(error))
  };

  // 버튼 4 클릭시 실행함수
  // querry string 방식의 데이터 방식
  const test4 = () => {
    axios.get('http://192.168.30.108:5000/t4', {params : {stuName : 'kim', stuAge : 20}})
    .then(console.log('통신 성공'))
    .catch(error => console.log(error))
  };

  return (
    <TouchableWithoutFeedback onPress={Keyboard.dismiss()}>
      <SafeAreaView style={styles.btnContainer}>

        <Button title='버튼1' onPress={() => test1()}/>

        <Button title='버튼2' onPress={() => test2()}/>

        <Button title='버튼3' onPress={() => test3()}/>

        <Button title='버튼4' onPress={() => test4()}/>
      </SafeAreaView>
    </TouchableWithoutFeedback>
  )
}

export default ProfileHomeScreen

const styles = StyleSheet.create({
  btnContainer : {
    width : '50%',
    gap : 10,
    marginHorizontal : 'auto'
  }
})