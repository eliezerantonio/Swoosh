package astros.eliezer.swoosh.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import astros.eliezer.swoosh.Activitys.Model.Player
import astros.eliezer.swoosh.R
import astros.eliezer.swoosh.helpers.EXTRA_LEAGUE
import astros.eliezer.swoosh.helpers.EXTRA_PLAYER
import astros.eliezer.swoosh.helpers.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)


        //recebendo valores da activity skill

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

            searchLeaguesText.text ="Procurando uma Equipa ${player.skill} de ${player.league}   para você..."


     }
}
