package org.xuke.game.`interface`

interface View {
    //位置信息
    val x: Int
    val y: Int
    //宽高
    val width: Int
    val height: Int
    //显示
    fun draw()
}