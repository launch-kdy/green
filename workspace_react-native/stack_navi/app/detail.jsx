import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { useLocalSearchParams } from 'expo-router'

const DetailScreen = () => {
  // (5) 전달되는 데이터 받기 - useLocalSearchParams
  const params = useLocalSearchParams();
  // 구조분해할당 문법으로 멋지게 만들수도 있다
  // const {id, age} = useLocalSearchParams();


  return (
    <View>
      <Text>상세화면</Text>
      <Text>{params.id} / {params.age}</Text>
    </View>
  )
}

export default DetailScreen

const styles = StyleSheet.create({})