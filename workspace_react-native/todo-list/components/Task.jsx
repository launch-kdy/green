import { Alert, Image, Pressable, StyleSheet, Text, TextInput, View } from 'react-native'

//이미지 import
//@ -> 최상위 경로에서부터 찾아가겠다.
import del_img from '@/assets/icon/delete.png'
import edit_img from '@/assets/icon/edit.png'
import { SERVER_URL } from '@/constants/appConst'
import axios from 'axios'
import { useEffect, useState } from 'react'

/* 앱에서 alert 또는 confirm을 사용하는 방법
 Alert.alert('제목' '내용' '버튼정보')

<ex>
Alert.alert(
  'Confirm',
  '정말 삭제할까요?',
  [
    {
      text : '확인',
      style : 'default',
      onPress : () => {}
    },
    {}
  ]
);

*/


// props 로 전달되는 데이터를 state 변수의 초기값으로 바로 세팅하면 안 됨.
const Task = ({data, changeReloading}) => {
  // 수정 상태를 저장할 state 변수
  const [isUpdating, setIsUpdating] = useState(false);

  //수정 내용을 저장할 state 변수
  const [updateTitle, setUpdateTitle] = useState(''); 

  // updateTitle 변수의 값을 props 로 받아온 데이터를 세팅
  useEffect(()=>{
    setUpdateTitle(data.todoTitle)
  },[data.todoTitle]);


  // 삭제 버튼 터치 함수
  const deleteTodo = () => {
    // Alert.alert()
    Alert.alert(
      // 제목
      '확인',
      // 내용
      '정말 삭제할까요?',
      // 버튼
      [
        {
          text : '삭제',
          style : 'default',
          // onPress = 클릭해서 뭐할래
          onPress : () => confirmDelete()
        },
        {
          text : '취소',
          style : 'cancel',
        },
      ]
    );
  }

  // 삭제 함수
  const confirmDelete = () => {
    axios.delete(`${SERVER_URL}/todo/${data.todoNum}`)
    .then(res => {
      changeReloading();
    })
    .catch(error => {
      if(e.status === 400 | e.status === 500){
        alert(`오류코드 : ${e.status}\n 오류메세지 : ${e.response.data}`)
      }
      else{
        alert('알 수 없는 오류가 발생하였습니다')
        console.log(error)
      }
    });
  }

  // 할 일 수정 함수
  const updateTodo = () => {
    axios.put(`${SERVER_URL}/todo/${data.todoNum}`, {todoTitle : updateTitle})
    .then(res => {
      changeReloading();
    })
    .catch(error => console.log(e))
  }

  return (
    <View style={styles.task_back}>
      {
        isUpdating 
        ?
        <TextInput 
          style={styles.input}
          value={updateTitle}
          onBlur={() => setIsUpdating(false)}
          autoFocus={true} //인풋 태그에 자동 포커스
          onChangeText={text => setUpdateTitle(text)}

          onSubmitEditing={() => updateTodo()}
        />
        :
        <Text style={styles.todo}>{data.todoTitle}</Text>
      }
      
      {/* 수정 아이콘 */}
      {/* Pressable & onPress (터치) */}
      <Pressable onPress={() => setIsUpdating(true)}>
        <Image 
          source={edit_img}
          style={styles.img}
        />
      </Pressable>

      {/* 삭제 아이콘 */}
      {/* Pressable & onPress (터치) */}
      <Pressable 
        onPress={() => deleteTodo()}
        style={styles.press_img}
      >
        <Image 
          source={del_img}
          style={styles.img}
        />
      </Pressable>
    </View>
  )
}

export default Task

const styles = StyleSheet.create({
  task_back : {
    backgroundColor : '#eeeeee',
    padding : 14,
    flexDirection : 'row',
    gap : 4
  },
  todo : {
    fontSize : 20,
    width : '80%'
  },
  press_img :{
    width : '10%'
  },
  img :{

  },
  input : {
    width : '80%',
    borderWidth : 1,
    borderColor : 'black',
    borderStyle: 'solid',
    backgroundColor: 'white'
  }
})