package com.robby.challenge4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.widget.TextView

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get reference to ImageView BATU
        val img_batu_player = findViewById<ImageView>(R.id.img_batu_player)

            var tv_status = findViewById<TextView>(R.id.tv_status)
            var tv_p1choice = findViewById<TextView>(R.id.tv_p1choice)
            var tv_comchoice = findViewById<TextView>(R.id.tv_comchoice)

            //set on-click listener
        img_batu_player.setOnClickListener {
            //your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "PEMAIN 1 pilih ROCK", Toast.LENGTH_SHORT).show()

            val com_choice = (1..4).random()
            //1 denotes "Rock"
            //if value of computer move is 1 it means computer has chosen Rock

            //2 denotes "Paper"
            //if value of computer move is 2 it means computer has chosen paper

            //3 denotes "Scissor"
            //if value of computer move is 1 it means computer has chosen Scissors

            if (com_choice == 1) {

                //rock vs rock
                tv_status.text = "DRAW"
                tv_p1choice.text = "P1 = ROCK"
                tv_comchoice.text = "COM = ROCK"

                println("DRAW")
                println("P1 = ROCK")
                println("COM = ROCK")
                println("")

            }
            else if (com_choice == 2) {

                //rock vs paper
                tv_status.text = "COM WIN"
                tv_p1choice.text = "P1 = ROCK"
                tv_comchoice.text = "COM = PAPER"

                println("COM WIN")
                println("P1 = ROCK")
                println("COM = PAPER")
                println("")

            } else {

                //rock vs scissors
                tv_status.text = "P1 WIN"
                tv_p1choice.text = "P1 = ROCK"
                tv_comchoice.text = "COM = SCISSORS"

                println("P1 WIN")
                println("P1 = ROCK")
                println("COM = SCISSORS")
                println("")

            }
        }

        //get reference to ImageView KERTAS
        val img_kertas_player = findViewById<ImageView>(R.id.img_kertas_player)
        //set on-click listener
        img_kertas_player.setOnClickListener {
            //your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "PEMAIN 1 pilih PAPER", Toast.LENGTH_SHORT).show()

            val com_choice = (1..4).random()
            //1 denotes "Rock"
            //if value of computer move is 1 it means computer has chosen Rock

            //2 denotes "Paper"
            //if value of computer move is 2 it means computer has chosen paper

            //3 denotes "Scissor"
            //if value of computer move is 1 it means computer has chosen Scissors

            if (com_choice == 1) {

                //paper vs rock
                tv_status.text = "P1 WIN"
                tv_p1choice.text = "P1 = PAPER"
                tv_comchoice.text = "COM = ROCK"

                println("P1 WIN")
                println("P1 = PAPER")
                println("COM = ROCK")
                println("")

            }
            else if (com_choice == 2) {

                //paper vs paper
                tv_status.text = "DRAW"
                tv_p1choice.text = "P1 = PAPER"
                tv_comchoice.text = "COM = PAPER"

                println("DRAW")
                println("P1 = PAPER")
                println("COM = PAPER")
                println("")

            } else {

                //paper vs scissors
                tv_status.text = "COM WIN"
                tv_p1choice.text = "P1 = PAPER"
                tv_comchoice.text = "COM = SCISSORS"

                println("COM WIN")
                println("P1 = PAPER")
                println("COM = SCISSORS")
                println("")

            }
        }

        //get reference to ImageView GUNTING
        val img_gunting_player = findViewById<ImageView>(R.id.img_gunting_player)
        //set on-click listener
        img_gunting_player.setOnClickListener {
            //your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "PEMAIN 1 pilih SCISSORS", Toast.LENGTH_SHORT).show()

            val com_choice = (1..4).random()
            //1 denotes "Rock"
            //if value of computer move is 1 it means computer has chosen Rock

            //2 denotes "Paper"
            //if value of computer move is 2 it means computer has chosen paper

            //3 denotes "Scissor"
            //if value of computer move is 1 it means computer has chosen Scissors

            if (com_choice == 1) {

                //scissors vs rock
                tv_status.text = "COM WIN"
                tv_p1choice.text = "P1 = SCISSORS"
                tv_comchoice.text = "COM = ROCK"

                println("COM WIN")
                println("P1 = SCISSORS")
                println("COM = ROCK")
                println("")

            }
            else if (com_choice == 2) {

                //scissors vs paper
                tv_status.text = "P1 WIN"
                tv_p1choice.text = "P1 = SCISSORS"
                tv_comchoice.text = "COM = PAPER"

                println("P1 WIN")
                println("P1 = SCISSORS")
                println("COM = PAPER")
                println("")

            } else {

                //scissors vs scissors
                tv_status.text = "DRAW"
                tv_p1choice.text = "P1 = SCISSORS"
                tv_comchoice.text = "COM = SCISSORS"

                println("DRAW")
                println("P1 = SCISSORS")
                println("COM = SCISSORS")
                println("")

            }
        }

        //get reference to ImageView REFRESH
        val img_refresh = findViewById<ImageView>(R.id.img_refresh)
        //set on-click listener
        img_refresh.setOnClickListener {
            //your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "PEMAIN 1 klik REFRESH", Toast.LENGTH_SHORT).show()

            tv_status.text = "VS"
            tv_p1choice.text = "P1 = ..."
            tv_comchoice.text = "COM = ..."

            println("VS")
            println("P1 = ...")
            println("COM = ...")
            println("")
        }
    }
}