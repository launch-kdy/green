import { useRouter } from 'expo-router';
import { Pressable, StyleSheet, Text } from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';


// 홈 화면
// (1) return 안에 SafeAreaView 자동완성 'react-native-safe-area-context'

const HomeScreen = () => {
  // (2) const router = useRouter(); 만들기
  const router = useRouter();



  return (
    <SafeAreaView>
      <Text>홈 화면</Text>
      {/* router.push('/페이지명') */}
      <Pressable onPress={() => router.push('/myPage')}> 
        <Text>내 정보 페이지로 이동</Text>
      </Pressable>
    </SafeAreaView>
  )
}

export default HomeScreen

const styles = StyleSheet.create({})