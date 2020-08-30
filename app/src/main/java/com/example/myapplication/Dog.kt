package com.example.myapplication

import android.util.Log

open class Dog:Animal,Movable {
    //コンストラクタ
    constructor(name: String,age:Int) : super(name,age) {
    }
    //メソッド
    override fun say(){
        Log.d("kotlintest",this.name+"("+this.age+")"+"「わんわん」")
    }
    fun name(){
        Log.d("kotlintest","犬の名前は"+this.name+"です")
    }

    fun age(){
        Log.d("kotlintest","犬の年齢は"+this.age+"歳です")
    }

    override fun move() {
        Log.d("kotlintest",this.name+"("+this.age+"歳)　は全力で走った")
    }
}