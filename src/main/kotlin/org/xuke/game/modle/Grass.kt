package org.xuke.game.modle

import org.itheima.kotlin.game.core.Painter
import org.xuke.game.Config

/**
 * 草坪
 * */
class Grass {
    //位置
    var x: Int = 200
    var y: Int = 200
    //宽高
    var width: Int = Config.block
    var height: Int = Config.block

    //显示
    fun draw() {
        Painter.drawImage("img/grass.gif", x, y)
    }
}