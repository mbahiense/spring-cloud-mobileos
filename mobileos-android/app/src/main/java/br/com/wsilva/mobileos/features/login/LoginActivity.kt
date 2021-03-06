package br.com.wsilva.mobileos.features.login

import android.os.Bundle
import br.com.wsilva.mobileos.R
import br.com.wsilva.mobileos.core.BasicActivity

class LoginActivity: BasicActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lay_act_template)
        //Configuração inicial
        init(savedInstanceState)
    }

    fun init(savedInstanceState: Bundle?) {
        val fragmentManager = supportFragmentManager
        var fragment = fragmentManager.findFragmentByTag(LoginFragment.TAG)
        if (fragment == null) {
            fragment = LoginFragment.newInstance()
        }
        if (savedInstanceState == null) {
            fragment.arguments = intent.extras
        } else {
            fragment.arguments = savedInstanceState
        }
        addFragmentToActivity(fragmentManager, fragment, R.id.frameLayout, LoginFragment.TAG)
    }
}