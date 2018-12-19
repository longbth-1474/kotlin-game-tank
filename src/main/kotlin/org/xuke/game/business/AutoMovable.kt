package org.xuke.game.business

import org.xuke.game.enums.Direction
import org.xuke.game.model.View

/**
 * 自动移动的能力
 */
interface AutoMovable : View {

    //方向
    val currentDirection: Direction
    //速度
    val speed: Int

    fun autoMove()
}