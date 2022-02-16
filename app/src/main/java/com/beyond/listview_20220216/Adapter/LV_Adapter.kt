package com.beyond.listview_20220216.Adapter

import android.content.Context
import android.widget.ArrayAdapter
import com.beyond.listview_20220216.Data.LV_DataModel

class LV_Adapter(val mContext : Context , val resId : Int , val mList : ArrayList<LV_DataModel>)
    : ArrayAdapter<LV_DataModel>(mContext, resId, mList) {
    //어레이 어댑터를 상속 받는데, 데이터의 형태는 LV_DataModel로 받아서 사용
    //ArrayAdapter는 ()지원 안함
}