package org.xuke.game.modle

import org.itheima.kotlin.game.core.Painter
import org.xuke.game.Config
import org.xuke.game.`interface`.View

/**
 * 铁墙
 * */
class Steel(override val x: Int, override val y: Int) : View {
    override val width: Int = Config.block
    override val height: Int = Config.block

    override fun draw() {
        Painter.drawImage("img/steel.gif", x, y)
    }
}