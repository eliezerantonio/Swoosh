package astros.eliezer.swoosh.Activitys

import android.content.Intent
import android.os.Bundle
import astros.eliezer.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botaoComecar.setOnClickListener {
            val leagueIntent= Intent (this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }


    }
}
