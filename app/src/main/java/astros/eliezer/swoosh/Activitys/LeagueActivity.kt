package astros.eliezer.swoosh.Activitys

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import astros.eliezer.swoosh.Activitys.Model.Player
import astros.eliezer.swoosh.R
import astros.eliezer.swoosh.helpers.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null){
            player=savedInstanceState.getParcelable(EXTRA_PLAYER )!!
        }
    }

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "Homens"

    }

    fun onWomensClicked(view: View) {
        coedLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        player.league = "Mulheres"
    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        player.league = "Mista"

    }

    fun leagueNexCliked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
           //pasar valor para outra activity
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)

        } else {
            Toast.makeText(this, "Por favor Selecione uma opcão", Toast.LENGTH_LONG).show()
        }
    }
}
