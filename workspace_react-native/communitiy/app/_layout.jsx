import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native-safe-area-context'
import { Stack } from 'expo-router'

// 프로젝트 실행 로직
// 1. 로그인 여부 확인
// 2. 로그인 안 되어있으면, 로그인 페이지로 보내기
// 3. 한번 로그인 하면, 다음부터 로그인 불필요하게 
// 4. 로그인이 되어 있다면, sns 목록 페이지로 이동시키기

// (tabs) + auth = _layout.jsx 두 폴더들 stack 구조로 정의하는 파일
const RootLayout = () => {
  return (
      <Stack screenOptions={{headerShown : false}} />
  )
}

export default RootLayout

const styles = StyleSheet.create({})