import javafx.application.Application
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyEvent
import org.itheima.kotlin.game.core.Window

class MyWindow : Window() {
    override fun onCreate() {
    }

    override fun onDisplay() {
    }

    override fun onKeyPressed(event: KeyEvent) {
        //按键响应
        when(event.code){
            KeyCode.L -> println("点击了L按钮")
        }
    }

    override fun onRefresh() {
    }
}


fun main(args: Array<String>) {
    Application.launch(MyWindow::class.java)
}