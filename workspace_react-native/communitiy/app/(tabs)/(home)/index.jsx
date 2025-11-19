import { useRouter } from 'expo-router'
import { useEffect } from 'react'
import { FlatList, Keyboard, Pressable, StyleSheet, Text, TouchableWithoutFeedback } from 'react-native'
import { SafeAreaView } from 'react-native-safe-area-context'
import FeedItem from '../../../components/home/FeedItem'
import { colors } from '../../../constants/colorConstant'
import { dummyData } from '../../../constants/dummy'
// secureStore 수동 import
import * as SecureStore from 'expo-secure-store'

//                    <로그인>
// 앱에서는 로그인 정보를 휴대폰 안의 secureStore 공간에 저장
// secureStore 사용을 위해 우선 라이브러리 설치 필요
// 명령어 npx expo install expo-secure-store
// 1. 프로젝트 실행 시 HomeScreen이 실행
// 2. HomeScreen이 실행되자마자 로그인 여부를 확인
// 3. 만약 로그인이 안됐다면 바로 로그인 페이지로 강제 이동
// 4. *secureStore 에 저장된 데이터는 폰초기화, 직접 로그아웃을 하지 않는 이상
//    ! 영구적으로 저장됨 ! 문자열 데이터만 저장 가능

//               <secureStore 사용법>
// 라이브러리 import -> import * as SecureStore from 'expo-secure-store'
// 데이터 저장 -> await SecureStore.setItemAsync('key', 'value')
// 데이터 조회 -> await SecureStore.getItemAsync('key')
// 데이터 삭제 -> await SecureStore.deleteItemAsync('key')

// < await & async > 비동기 코드를 실행시킬 때 사용하는 키워드 / axios 쓸때 무조건 사용함.
// await : 
// async : 

// app -> (tabs) -> (home) 안에 있는 indexa.jsx
// sns 목록 페이지

const HomeScreen = () => {
  // 로그인 정보 (유/무)를 확인
  useEffect(()=> {
    const getLoginInfo = async () => {
      // secureStore에 저장된 로그인 정보를 가져옴
      const loginInfo = await SecureStore.getItemAsync('loginInfo')

      // 가져온 데이터를 원래 형태인 객체로 변환
      const result = JSON.parse(loginInfo);

      console.log('로그인 데이터 =', result)

      // 로그인 안 되어있다면
      if(result === null){
        router.replace('/auth/login')
      }

    }
    getLoginInfo();
  },[]);

  const router = useRouter();

  // 게시글 목록
  const feedList = dummyData;

  return (
    <TouchableWithoutFeedback onPress = {() => Keyboard.dismiss()}>
      <SafeAreaView
        style={styles.container}
      >
        {/* 연습 -> (제어 페이지로 이동) */}
        <Pressable onPress={() => router.push('/profile')}>
          <Text>제어 페이지로 이동</Text>
        </Pressable>
        {/* 로그인 -> (로그인 페이지로 이동) */}
        <Pressable onPress={() => router.push('/auth/login')}>
          <Text>로그인 페이지로 이동</Text>
        </Pressable>

        <FlatList
          // data : 반복할 데이터 
          data={feedList}
          // renderItem : 데이터 하나하나 실행할 코드 
          renderItem={({item}) => <FeedItem item={item}/>}
          // keyExtractor : 반복돌릴 아이템의 key, 매개변수는 데이터 각각을 의미 
          keyExtractor={(item) => item.id}
          // list 영역의 디자인 아이템
          contentContainerStyle={styles.listContainer}
        />



      </SafeAreaView>
    </TouchableWithoutFeedback>
  )
}


export default HomeScreen

const styles = StyleSheet.create({
  container : {
    backgroundColor : colors.WHITE,
    // 높이 값을 폰의 세로크기에 맞춤 'flex : 1'해주기
    flex : 1
  },
  listContainer : {
    gap : 10,
    backgroundColor : colors.GRAY_200,
    paddingVertical : 8,
    paddingHorizontal : 6
  }
})