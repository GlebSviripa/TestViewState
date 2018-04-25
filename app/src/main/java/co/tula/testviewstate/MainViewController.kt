package co.tula.testviewstate

import co.tula.testviewstate.base.Action
import co.tula.testviewstate.base.ViewController

/*
 * Created by Gleb
 * 4/17/2018
 */
class MainViewController : ViewController<MainView, ViewStateModel> {
    var presenter = MainPresenter()
    var view: MainView? = null
    var viewState = ViewStateModel()

    override fun bindView(view: MainView) {
        this.view = view
    }

    override fun unbindView() {
        view = null
    }

    override fun update(action: Action) {
        when (action) {
            is MainAction1 -> {
                viewState.text1 = presenter.getFirstResult()
                if (viewState.text2 == "") viewState.text2 = presenter.getThirdResult()
                else viewState.text2 = ""
            }

            is MainAction2 -> {
                viewState.text2 = presenter.getSeconResult()
                if (viewState.text3 == "") viewState.text3 = presenter.getFirstResult()
                else viewState.text3 = ""
            }

            is MainAction3 -> {
                viewState.text3 = presenter.getThirdResult()
                if(viewState.text1 == "") viewState.text1 = presenter.getSeconResult()
                else viewState.text1 = ""
            }
        }
        render(viewState)
    }

    override fun render(viewState: ViewStateModel) {
        view?.setText1(viewState.text1)
        view?.setText2(viewState.text2)
        view?.setText3(viewState.text3)
        view?.setVisibility1(viewState.visibility1)
        view?.setVisibility2(viewState.visibility2)
        view?.setVisibility3(viewState.visibility3)
    }
}