package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("kotlintest","ログへの出力テスト")
        val dog = Dog("ポチ",3)
        dog.say();dog.name();dog.age();
        dog.move()
        val dog2 = Dog("ハチ",10)
        dog2.say();dog2.name();dog2.age();
        val bigdog = BigDog("ヨーゼフ",15)
        bigdog.say();bigdog.name();bigdog.age();

        //ここから課題分
        val mei = Human("メイ",8,"どんぐりあつめ")
        mei.say();
        mei.think();
        val satuki = Human("サツキ",10,"洗濯")
        satuki.say()
        satuki.think()
    }

}