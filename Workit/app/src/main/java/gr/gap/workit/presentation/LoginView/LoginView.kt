package gr.gap.workit.presentation.LoginView

import com.hannesdorfmann.mosby3.mvp.MvpView
import gr.gap.workit.domain.model.LoginCredentials
import io.reactivex.Observable

/**
 * Created by developer1 on 26/03/2018.
 */
interface LoginView : MvpView {
    fun loginIntent() : Observable<LoginCredentials>
    fun render(state: LoginViewState)
}