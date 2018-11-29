package org.xuke.game.modle

import org.itheima.kotlin.game.core.Painter
import org.xuke.game.Config
import org.xuke.game.`interface`.View

/**
 * 砖墙
 * */
class Wall : View {
    override val x: Int = 100
    override val y: Int = 100
    override val width: Int = Config.block
    override val height: Int = Config.block

    override fun draw() {
        Painter.drawImage("img/wall.gif", x, y)
    }
}