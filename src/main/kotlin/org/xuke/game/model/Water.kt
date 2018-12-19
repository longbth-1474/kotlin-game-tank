package org.xuke.game.model

import org.xuke.game.Config
import org.xuke.game.business.Blockable
import org.itheima.kotlin.game.core.Painter

/**
 * 水墙
 *
 * 具备阻挡能力
 */
class Water(override val x: Int, override val y: Int) : Blockable {

    //位置
//    override var x: Int = 200
//    override var y: Int = 200
    //宽高
    override var width: Int = Config.block
    override var height: Int = Config.block

    //显示行为
    override fun draw() {
        Painter.drawImage("img/water.gif", x, y)
    }
}