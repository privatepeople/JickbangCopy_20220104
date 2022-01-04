package com.nepplus.jickbangcopy_20220104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.jickbangcopy_20220104.models.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()  // 변수명의 m : 멤버변수라는 표식

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(RoomData(8000, "서울시 동대문구", 5, "1번째 방입니다."))
        mRoomList.add(RoomData(17500, "서울시 동대문구", 0, "2번째 방입니다."))
        mRoomList.add(RoomData(83600, "서울시 동대문구", -2, "3번째 방입니다."))
        mRoomList.add(RoomData(123000, "서울시 서대문구", 17, "4번째 방입니다."))
        mRoomList.add(RoomData(5700, "서울시 서대문구", 8, "5번째 방입니다."))
        mRoomList.add(RoomData(6800, "서울시 서대문구", 0, "6번째 방입니다."))
        mRoomList.add(RoomData(37500, "서울시 서대문구", -1, "7번째 방입니다."))
        mRoomList.add(RoomData(23800, "서울시 동작구", 6, "8번째 방입니다."))
        mRoomList.add(RoomData(3000, "서울시 동작구", 9, "9번째 방입니다."))
        mRoomList.add(RoomData(9800, "서울시 동작구", 3, "10번째 방입니다."))

    }
}