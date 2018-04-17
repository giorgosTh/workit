package gr.gap.workit.data.di.login

import dagger.Module
import dagger.Provides
import gr.gap.workit.data.di.NetworkModule
import gr.gap.workit.data.network.UserApi
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [(NetworkModule::class)])
class LoginModule {

    @Singleton
    @Provides
    fun userApi(retrofit: Retrofit):UserApi = retrofit.create(UserApi::class.java)

}
