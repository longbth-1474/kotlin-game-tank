package org.xuke.game.modle

import org.itheima.kotlin.game.core.Painter
import org.xuke.game.Config
import org.xuke.game.`interface`.View
import org.xuke.game.enums.Direction

/**
 * 坦克的类
 * 笔记:kotlin中 接口为val不可修改的变量在实现类中可以更改为var可修改的变量
 * */
class Tank(override var x: Int, override var y: Int) : View {
    override val width: Int = Config.block
    override val height: Int = Config.block

    //默认向上
    var currentDirection: Direction = Direction.UP

    //默认移动速度为8个像素
    private val speed: Int = 8

    override fun draw() {
        val s = when (currentDirection) {
            Direction.UP -> "img/tank_u.gif"
            Direction.DOWN -> "img/tank_d.gif"
            Direction.LEFT -> "img/tank_l.gif"
            Direction.RIGHT -> "img/tank_r.gif"
        }
        Painter.drawImage(s, x, y)
    }

    fun move(direction: Direction) {

        //当前的方向和希望移动的方向不一致时,只做方向的改变不做后续的移动
        if (this.currentDirection != direction) {
            this.currentDirection = direction
            return
        }

        //方便位移
        when (currentDirection) {
            Direction.UP -> y -= speed
            Direction.DOWN -> y += speed
            Direction.LEFT -> x -= speed
            Direction.RIGHT -> x += speed
        }

        //越界处理
        if (x < 0) x = 0
        if (x > Config.gameWith - width) x = Config.gameWith - width
        if (y < 0) y = 0
        if (y > Config.gameHeight - height) y = Config.gameHeight - height

    }


}