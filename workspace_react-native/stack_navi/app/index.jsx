import { useRouter } from 'expo-router';
import { Pressable, StyleSheet, Text, View } from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';

// 최초실행화면 = index.jsx
// (1) rnfes + 엔터
// (2) const 대문자로 바꿔서 컴포넌트화 + export default (동일명)


const HomeScreen = () => {
  // (4) useRouter 페이지 이동
  // 방법 1 router.push('/detail') 쌓기형 - (닫기 시 이전 페이지로 이동) A -> B -> A
  // 방법 2 router.replace('/detail') 교체형 - (닫기 시 앱이 꺼짐) A -> B -> X
  // 방법 3 router.navigate('/detail') 쌓기형 업데이트 (닫기 시 쌓여있으면 그전 페이지로 이동) A -> B / B -> A 
  const router = useRouter();

  return (
    <SafeAreaView>
    <View>
      <Text>홈화면</Text>
      <View style={styles.btn_view}>
        {/* (3) 예시 - 상세 페이지 이동 버튼 */}
        <Pressable 
          style={styles.btn_press}
          // (4) 예시 - onPress 눌러서 -> push 방법으로 -> detail 페이지 이동
          // {} 객체 안에 pathname / params : {} 객체 + id age 
          onPress={() => {router.push({
            pathname : '/detail',
            params : {
              id : 'abc',
              age : 20
            }
          })}}
          >
          <Text>상세 페이지로 이동</Text>
        </Pressable>

        {/* (3) 예시 - 마이 페이지 이동 버튼 */}
        <Pressable 
          style={styles.btn_press}
          // (4) 예시 - onPress 눌러서 -> replace 방법으로 ->myPage 페이지 이동
          onPress={()=> router.replace('/myPage')}
        >
          <Text>마이 페이지로 이동</Text>
        </Pressable>
      </View>

    </View>
    </SafeAreaView>
  )
}

export default HomeScreen

// 디자인
const styles = StyleSheet.create({
  btn_view : {
    flexDirection : 'row',
    justifyContent : 'space-around'
  },
  btn_press : {
    borderWidth : 1,
    width : '40%',
    alignItems : 'center',
    padding : 10
  }
})