package com.ladddd.kotlinsample

import android.content.Context
import android.widget.Toast

/**
 * Created by 陈伟达 on 2017/11/30.
 */
class ToastUtils {

    //可以指定默认参数，不需要像java一样写多个构造函数
    fun toast(context: Context, message: String, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(context, message, length).show()
    }
}