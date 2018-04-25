package co.tula.testviewstate

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    val viewController  = MainViewController()
    override fun setText1(text: String) {
        textView.text = text
    }

    override fun setText2(text: String) {
        textView2.text = text
    }

    override fun setText3(text: String) {
        textView3.text = text
    }

    override fun setVisibility1(visibility: Boolean) {
        textView.visibility = if(visibility) View.VISIBLE else View.GONE
    }

    override fun setVisibility2(visibility: Boolean) {
        textView2.visibility = if(visibility) View.VISIBLE else View.GONE
    }

    override fun setVisibility3(visibility: Boolean) {
        textView3.visibility = if(visibility) View.VISIBLE else View.GONE
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewController.bindView(this)
        button.setOnClickListener({viewController.update(MainAction1(textView.text.toString()))})
        button2.setOnClickListener({viewController.update(MainAction2(textView2.text.toString()))})
        button3.setOnClickListener({viewController.update(MainAction3(textView3.text.toString()))})
    }

    override fun onDestroy() {
        viewController.unbindView()
        super.onDestroy()
    }
}
