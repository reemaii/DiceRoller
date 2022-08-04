package com.example.homework3

class Dice (val numsides: Int){
    fun roll():Int {
    return  (1..numsides).random()
}
}