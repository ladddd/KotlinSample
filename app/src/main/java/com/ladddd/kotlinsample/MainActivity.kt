package com.ladddd.kotlinsample

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import org.jetbrains.anko.*

/**
 * Created by 陈伟达 on 2017/7/21.
 */
class MainActivity : BaseActivity() {

    private lateinit var textView:TextView //late init var要求非空，必须注明延迟初始化

    override fun initView() {
//        setContentView(R.layout.activity_main)
////        textView = findViewById(R.id.tv_hello_world) as TextView
////        textView.setText(R.string.app_name)
//        textView = find(R.id.tv_hello_world)
//        tv_hello_world.text = "nimahai"
        verticalLayout {
            linearLayout {
                orientation = LinearLayout.HORIZONTAL
                button("go to ptr").lparams(wrapContent, wrapContent) {
                    weight = 1f
                    backgroundColor = android.R.color.holo_red_dark
                }
                button("go to H ptr").lparams(wrapContent, wrapContent) {
                    weight = 1f
                }
                button("go to moon").lparams(wrapContent, wrapContent) {
                    weight = 1f
                    backgroundColor = android.R.color.holo_orange_light
                }.onClick {
                    toast("this is a textview")
                    startActivity<SubActivity>("param1" to "hehe", "param2" to "haha")
                }
            }

            relativeLayout {
                textView ("666", android.R.attr.checkedTextViewStyle){
                    id = R.id.action_bar
                }.lparams(wrapContent, wrapContent) {
                    alignParentEnd()
                    marginEnd = dip(20)
                }
            }
        }

//        tv_hello_world.onClick {
//            toast("this is a textview")
//            startActivity<SubActivity>("param1" to "hehe", "param2" to "haha")
//        }
    }

    override fun initData() {

    }

    open class ClickHandler : View.OnClickListener {
        override fun onClick(v: View?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
}