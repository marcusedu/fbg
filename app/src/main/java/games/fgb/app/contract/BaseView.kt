package games.fgb.app.contract

/**
 * Created by Marcus Eduardo - marcusedu7@gmail.com on 13/02/2018.
 */
interface BaseView<in T : BasePresenter> {
    fun setPresenter(presenter: T)
}