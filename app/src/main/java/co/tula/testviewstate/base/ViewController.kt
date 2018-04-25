package co.tula.testviewstate.base

/*
 * Created by Gleb
 * 4/16/2018
 */
interface ViewController<in T : BaseView, in L : IViewState> {
    fun bindView(view : T)
    fun unbindView()
    fun update(action : Action)
    fun render(viewState : L)
}