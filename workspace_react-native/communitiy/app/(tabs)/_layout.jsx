import { Tabs } from 'expo-router'
import { StyleSheet, View } from 'react-native'

// (home) + profile + settings = 폴더를 tab 구조롤 설정하는 파일
const TabLayout = () => {
  return (
      <Tabs screenOptions={{headerShown : false}}>
        <Tabs.Screen 
          //첫번째 탭을 터치하면 (home 폴더 안에 있는)/index.jsx에서 파일이 알아서 실행
          name='(home)'
          options={{
            title : 'Home'
          }}
        />
        <Tabs.Screen 
          //첫번째 탭을 터치하면 (profile 폴더 안에 있는)/index.jsx에서 파일이 알아서 실행
          name='profile'
          options={{
            title : 'Profile'
          }}
        />
        <Tabs.Screen 
          //첫번째 탭을 터치하면 (settings 폴더 안에 있는)/index.jsx에서 파일이 알아서 실행
          name='settings'
          options={{
            title : 'Settings'
          }}
        />
      </Tabs>
  )
}

export default TabLayout

const styles = StyleSheet.create({})