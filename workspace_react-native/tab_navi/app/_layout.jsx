import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { Stack } from 'expo-router'

// app/_layout.jsx
// 같은 폴더 내의 파일들의 layout을 구성하는 파일
// 이 파일에서는 stack 구조를 세팅 (가장 바깥쪽 레이아웃 - 큰 의미 부여 안 함)

const HomeLayout = () => {
  return (
    <Stack 
      screenOptions={{headerShown : false}}
    />
  )
}

export default HomeLayout

const styles = StyleSheet.create({})