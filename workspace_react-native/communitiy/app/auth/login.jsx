import { StyleSheet, Text, TouchableWithoutFeedback, View } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native-safe-area-context'
import Input from '../../components/common/Input'
import Button from '../../components/common/Button'
// secureStore 수동 import
import * as SecureStore from 'expo-secure-store'
import { useRouter } from 'expo-router'

const LoginScreen = () => {

  // < 페이지 이동 useRouter >
  const router = useRouter();

  // <로그인 함수>
  const login = async () => {
    // 원래는 axios 해야겠죠 ? 근데 이번에는 안 할게요
    // 로그인한 회원의 [아이디/이름/권한정보]를 조회했다고 가정하고 할게요
    const loginInfo = {
      userId : 'java',
      userName : 'kim',
      userRole : 'ADMIN'
    }

    // 로그인 정보를 secureStore에 저장
    await SecureStore.setItemAsync('loginInfo', JSON.stringify(loginInfo));

    // 로그인 성공 후 SNS 목록 페이지로 이동
    // push 하면 보안상 안 맞기에, replace로 교체 해줘야 함
    router.replace('/');

  }



  return (
    <TouchableWithoutFeedback>
      <SafeAreaView>

        <Input label='아이디' />
        <Input label='비밀번호' isPw={true}/>
        {/* 로그인 버튼 */}
        <Button title='로그인' onPress={() => login()}/>

      </SafeAreaView>
    </TouchableWithoutFeedback>
  )
}

export default LoginScreen

const styles = StyleSheet.create({})