import { StyleSheet, Text, TouchableWithoutFeedback, View } from 'react-native'
import React from 'react'
import axios from 'axios'
import { SafeAreaView } from 'react-native-safe-area-context'
import Button from '../../../components/common/Button'
// secureStore 수동 import
import * as SecureStore from 'expo-secure-store'
import { useRouter } from 'expo-router'

// app + settings = index.jsx
// settings 탭을 터치하면 실행되는 페이지
const SettingsHomeScreen = () => {

  const router = useRouter();
  
  // ----------------------------------------------------------------
  const getData1 = () => {
    console.log(1);
    
    axios.get()
    .then(res => console.log(2))
    .catch();
    
    console.log(3);
    
    // react의 비동기 코드는 그림까지 다 그린 후 가장 마지막에 실행
    // 위 코드의 실행결과 출력 -> 1, 3, 2
    
  }
  
  // await & async 활용 문법
  // await : 비동기 실행 코드 앞에 await 라는 키워드를 붙이면, 비동기 코드가 동기로 실행 됨
  // async : 함수 앞에 async 라는 키워드를 붙이면, 동기 코드가 비동기로 실행 됨
  // 선언된 함수 안에 await가 붙은 코드가 있으면 해당 함수는 
  // 반드시 async를 붙여서 비동기 함수로 만들어줘야함 

  async function getData2(){
    console.log(1);
    const res = await axios.get()
    console.log(res.data)
    console.log(3);
  }

  const getData3 = async() => {
    console.log(1);
    
    try{
      const res = await axios.get();
      console.log(res.data)
    }catch(e){
      console.log(e);
    }

    console.log(3);
  }
  // ----------------------------------------------------------------

  const logout = async () => {
    //SecureStore에 저장된 로그인 정보를 삭제
    await SecureStore.deleteItemAsync('loginInfo')

    // 첫 페이지로 이동
    router.replace('/');
  }

  return (
    <TouchableWithoutFeedback>
      <SafeAreaView>

        <Button title='로그아웃' onPress={() => logout()}/>

      </SafeAreaView>
    </TouchableWithoutFeedback>
  )
}

export default SettingsHomeScreen

const styles = StyleSheet.create({})