package org.xuke.game

import javafx.scene.input.KeyEvent
import org.itheima.kotlin.game.core.Window
import org.xuke.game.`interface`.View
import org.xuke.game.modle.Wall
import java.io.File

class GameWindow : Window(
        title = "kotlin版的坦克大战",
        icon = "img/logo.jpg",
        width = Config.gameWith,
        height = Config.gameHeight
) {

    var views = arrayListOf<View>()

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
                }
                cloumnNum++
            }
            lineNum++
        }
    }

    override fun onDisplay() {
        //绘制图像

        views.forEach {
            it.draw()
        }

    }

    override fun onKeyPressed(event: KeyEvent) {
    }

    override fun onRefresh() {
    }

}