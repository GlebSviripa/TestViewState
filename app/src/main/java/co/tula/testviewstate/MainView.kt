package co.tula.testviewstate

import co.tula.testviewstate.base.BaseView

interface MainView : BaseView {

    fun setText1(text: String)
    fun setText2(text: String)
    fun setText3(text: String)
    fun setVisibility1(visibility: Boolean)
    fun setVisibility2(visibility: Boolean)
    fun setVisibility3(visibility: Boolean)

}
