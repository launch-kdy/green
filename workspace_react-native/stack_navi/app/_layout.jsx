import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { Stack } from 'expo-router'

// 같은 폴더 내의 페이지 구조를 설정하는 파일
// (1) return 안에 지우고 -> <Stack /> 자동완성 expo-router
// (2) <Stack /> 안에 ->  screenOptions={} 자동완성

const HomeLayout = () => {
  return (
    <Stack 
      // headerShown : false로 헤더를 지워보자 
      // 그러면, 영역을 침범할텐데 - npm i react-native-safe-area-context 하고 재실행 후
      // 각각 페이지로 들어가서 모든 페이지 전체를 SafeAreaView 로 감싸준다 
      // 자동완성 (혼돈금지) react-native-safe-area-context

      // 복붙을 하면 편리할 것이다
      screenOptions={{headerShown : false}}
    />
  )
}

export default HomeLayout

const styles = StyleSheet.create({})