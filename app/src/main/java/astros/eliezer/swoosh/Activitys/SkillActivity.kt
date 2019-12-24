package astros.eliezer.swoosh.Activitys

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import astros.eliezer.swoosh.Activitys.Model.Player
import astros.eliezer.swoosh.R
import astros.eliezer.swoosh.helpers.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        //RECEBENDO VALOR DE OUTRA ACTIVITY
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        //println(league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }


    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = "Novata"

    }

    fun onBallerClick(view: View) {
        beginnerSkillBtn.isChecked = false
        player.skill = "Experiente"
    }


    fun onSkillFinishClick(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            //pasando dados paa outra activity
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Por favor escolha um nivel", Toast.LENGTH_LONG).show()
        }
    }
}
