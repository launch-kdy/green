import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { Tabs } from 'expo-router'
// 아이콘 회사
import FontAwesome from '@expo/vector-icons/FontAwesome';
import Ionicons from '@expo/vector-icons/Ionicons';

// app/(tabs)/_layout.jsx

const TabLayout = () => {
  return (
    // (1) return 지우고, Tabs 만들기 
    <Tabs
      // (2) 헤더 지우기 screenOptions={{}} 
      screenOptions={{
        headerShown : false,
        tabBarInactiveTintColor : 'gray',
        tabBarActiveTintColor : 'tomato'
      }}
    >
      {/* (예시 - Tab을 3개 만들기 : Tabs.Screen) */}
      <Tabs.Screen 
        name='index' // name : 해당 Tab에 연결될 jsx 파일명 (index.jsx)
        options={{
          title : 'Home',
          tabBarIcon : () => <FontAwesome name="home" size={24} color="black" />
        }} //options : 행 디자인 -> ( {} 객체로 여러개 ex title에는 : '탭에 쓰일 글자' / 아이콘은 화살표 함수 tabBarIcon : () => {여기다가 아이콘 링크})  
      />

      <Tabs.Screen 
        name='myPage'
        options={{
          title : '내 정보',
          tabBarIcon : () => <FontAwesome name="user" size={24} color="black" />
        }}
      />
      
      <Tabs.Screen 
        name='settings'
        options={{
          title : '설정',
          tabBarIcon : () => <Ionicons name="settings-sharp" size={24} color="black" />
        }}      
      />

    </Tabs>
  )
}

export default TabLayout

const styles = StyleSheet.create({})