package org.xuke.game

import javafx.scene.input.KeyEvent
import org.itheima.kotlin.game.core.Window
import org.xuke.game.modle.Grass
import org.xuke.game.modle.Wall

class GameWindow : Window(
        title = "许可的坦克大战",
        icon = "img/logo.jpg",
        width = Config.gameWith,
        height = Config.gameHeight
) {

    var wall = Wall()
    var grass = Grass()

    override fun onCreate() {
    }

    override fun onDisplay() {
        //绘制图像

        //绘制一个砖墙
        wall.draw()

        //绘制一个草坪
        grass.draw()
    }

    override fun onKeyPressed(event: KeyEvent) {
    }

    override fun onRefresh() {
    }

}