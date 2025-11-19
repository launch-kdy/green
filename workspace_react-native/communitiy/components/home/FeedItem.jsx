import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import Octicons from '@expo/vector-icons/Octicons';
import Foundation from '@expo/vector-icons/Foundation';
import { colors } from '../../constants/colorConstant';
import Profile from './Profile';

// 게시글 컴포넌트
const FeedItem = ({item}) => {
  return (
    <View style={styles.feedContainer}>
      <Profile writer={item.writer} createDate={item.createDate} />
      {/* sns 제목 */}
      <Text style={styles.title}>{item.title}</Text>
      {/* sns 내용 */}
      <Text style={styles.content}>{item.content}</Text>
      {/* div - 좋아요 댓글 조회*/}
      <View style={styles.menuContainer}>
        {/* 좋아요 */}
        <Pressable style={styles.menu}>
          <Octicons name="heart" size={20} color="red" />
          <Text>{item.likeCnt}</Text>
        </Pressable>
        {/* 댓글 */}
        <Pressable style={styles.menu}>
          <Octicons name="comment" size={20} color="black" />
          <Text>{item.replyCnt}</Text>
        </Pressable>
        {/* 조회수 */}
        <Pressable style={styles.menu}>
          <Foundation name="eye" size={26} color="black" />
          <Text>{item.readCnt}</Text>
        </Pressable>
      </View>
    </View>
  )
}

export default FeedItem

const styles = StyleSheet.create({
  feedContainer : {
    padding : 10,
    backgroundColor : colors.WHITE
  },
  title : {
    marginBottom : 12
  },
  content : {
    fontSize : 13,
    color : colors.GRAY_600,
    marginBottom : 14
  },
  menuContainer : {
    flexDirection : 'row',
    // space-around 균등분배간격
    justifyContent : 'space-around',
    alignItems : 'center',
    borderTopWidth : 1,
    borderTopColor : colors.GRAY_300
  },
  menu : {
    flexDirection : 'row',
    justifyContent : 'center',
    paddingVertical : 10,
    width : '33.3%',
    gap : 6,
  }
})