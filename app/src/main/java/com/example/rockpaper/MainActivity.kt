package com.example.rockpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       tvResult = findViewById<TextView>(R.id.tvResult)
        val btnRock: Button = findViewById<Button>(R.id.btnRock)
        val btnPaper: Button = findViewById<Button>(R.id.btnPaper)
        val btnScissors: Button = findViewById<Button>(R.id.btnScissors)

        btnRock.setOnClickListener { playRound("rock") }
        btnPaper.setOnClickListener { playRound("paper") }
        btnScissors.setOnClickListener{playRound("scissors")}
    }    // tv result is equivalent to TextView in the xml file.
//tvResult is used in the android applications to show the outcome of each round of Rock -Paper-Scissors game in other words it is used
//for displaying

//PLaygorund Method  this is used in anddroid  fro the games. This method implements game logic .
// 1 It generates a random choice for the computer from the choices array
// 2 It determines the outcome of the game using a when statement that compares the players choice with the
// 3//computers choice andapplies the rules of R-P_S to decide the result
//4 it is used with tvresult for displaying the copmuters choice and game result
//PLAYROUND METHOD: ALso is used for developing android games. It collects elements from the choice array and displaying
private fun playRound(playerChoice:String) {
    val choices = arrayOf("rock", "paper", "scissors")
    val computerChoice = choices[Random.nextInt(choices.size)]
    val result = when { // when statement is like the if statement
        playerChoice == computerChoice -> "it's a Draw!"
        playerChoice == "rock" && computerChoice  == "scissors" ||
         playerChoice == "scissors" && computerChoice =="paper" ||
        playerChoice == "paper" && computerChoice =="rock" -> "You Win!"
       else -> "You Lose"
        }
    tvResult.text  ="Computer chose $computerChoice. $result"
    }

    }

