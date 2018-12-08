package org.xuke.game

import javafx.scene.input.KeyCode
import javafx.scene.input.KeyEvent
import org.itheima.kotlin.game.core.Window
import org.xuke.game.`interface`.View
import org.xuke.game.enums.Direction
import org.xuke.game.modle.*
import java.io.File

class GameWindow : Window(
        title = "kotlin版的坦克大战",
        icon = "img/logo.jpg",
        width = Config.gameWith,
        height = Config.gameHeight
) {
    //管理元素的集合
    private val views = arrayListOf<View>()

    //晚点创建
    private lateinit var tank: Tank

    override fun onCreate() {
        //地图
        //读取文件
        val path = javaClass.getResource("/map/1.txt").path
        val file = File(path)
        //读取文件每一行
        val readLines = file.readLines()
        //循环遍历
        var lineNum = 0
        readLines.forEach {
            //每一行
            var cloumnNum = 0
            it.toCharArray().forEach {
                //每个字
                when (it) {
                    '砖' -> views.add(Wall(cloumnNum * Config.block, lineNum * Config.block))
                    '铁' -> views.add(Steel(cloumnNum * Config.block, lineNum * Config.block))
                    '草' -> views.add(Grass(cloumnNum * Config.block, lineNum * Config.block))
                    '水' -> views.add(Water(cloumnNum * Config.block, lineNum * Config.block))
                }
                cloumnNum++
            }
            lineNum++
        }


        //添加我方的坦克
        tank = Tank(Config.block * 10, Config.block * 12)
        views.add(tank)

    }

    override fun onDisplay() {
        //绘制图像

        views.forEach {
            it.draw()
        }

    }

    override fun onKeyPressed(event: KeyEvent) {

        when (event.code) {
            KeyCode.W -> {
                tank.move(Direction.UP)
            }

            KeyCode.S -> {
                tank.move(Direction.DOWN)
            }

            KeyCode.A -> {
                tank.move(Direction.LEFT)
            }

            KeyCode.D -> {
                tank.move(Direction.RIGHT)
            }
        }
    }

    override fun onRefresh() {
    }

}