package com.nepplus.jickbangcopy_20220104.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nepplus.jickbangcopy_20220104.R
import com.nepplus.jickbangcopy_20220104.models.RoomData
import java.math.MathContext

class RoomAdapter(
    val mathContext: Context,
    val mList: List<RoomData>
    ) : RecyclerView.Adapter<RoomAdapter.MyViewHolder>() {

    inner class MyViewHolder(row: View) : RecyclerView.ViewHolder(row) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val row = LayoutInflater.from(mathContext).inflate(R.layout.room_list_item, parent, false)
        return MyViewHolder(row)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

        return mList.size

    }

}