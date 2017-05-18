package ninja.sakib.kotlinschool.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import ninja.sakib.kotlinschool.R
import org.jetbrains.anko.find
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.toast
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    private var sayHelloBtn: Button by Delegates.notNull<Button>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.sayHelloBtn = find(R.id.sayHelloBtn)
        this.sayHelloBtn.onClick {
            toast("Clicked Say Hello Button")
        }
    }
}
