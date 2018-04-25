package co.tula.testviewstate

import co.tula.testviewstate.base.Action

/*
 * Created by Gleb
 * 4/17/2018
 */
open class TextAction(private val text : String) : Action {
    fun getText() = text
}
class MainAction1(text: String) : TextAction(text)

class MainAction2(text: String) : TextAction(text)

class MainAction3(text: String) : TextAction(text)