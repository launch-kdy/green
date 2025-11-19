import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { Stack } from 'expo-router'

// app -> (tabs) -> (home안에 있는) _Layout.jsx
// (home) 폴더 안의 imdex, detail.jsx 파일의 구조 설정 
const HomeLayout = () => {
  return (
    <Stack screenOptions={{headerShown : false}}/>
  )
}

export default HomeLayout

const styles = StyleSheet.create({})