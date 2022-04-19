package com.example.myapplication10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlin.math.log

//import com.example.myapplication10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

//        lateinit var binding:ActivityMainBinding

        super.onCreate(savedInstanceState)
//
//         binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
        setContentView(R.layout.activity_main)
    }


    fun buSelect(view: View) {
        val btnChoice = view as Button
        var cellId = 0
        when (btnChoice.id) {
            R.id.btn1 -> cellId = 1
            R.id.btn2 -> cellId = 2
            R.id.btn3 -> cellId = 3
            R.id.btn4 -> cellId = 4
            R.id.btn5 -> cellId = 5
            R.id.btn6 -> cellId = 6
            R.id.btn7 -> cellId = 7
            R.id.btn8 -> cellId = 8
            R.id.btn9 -> cellId = 9
        }
//Toast.makeText(this,"adsdfaf",Toast.LENGTH_LONG).show()
        Log.d("cellId : ", cellId.toString())
//        btnChoice.setBackgroundResource(R.color.blue)
        playGame(cellId, btnChoice)

    }


    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activePlayer = 1

    fun playGame(cellId: Int, btnChoice: Button) {
        if (activePlayer == 1) {
            btnChoice.text = "X"
            btnChoice.setBackgroundColor(resources.getColor(R.color.purple_200))
//            btnChoice.setBackgroundResource(R.color.blue)
            player1.add(cellId)
            activePlayer = 2
        } else {
            btnChoice.text = "O"
//            btnChoice.setBackgroundResource(R.color.white)
            btnChoice.setBackgroundColor(resources.getColor( R.color.blue))
            player2.add(cellId)
            activePlayer = 1
        }
        btnChoice.isEnabled = false
        checkWinner()
    }

    fun checkWinner() {
        var winner = -1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            winner = 2
        }

        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            winner = 1
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            winner = 2
        }
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            winner = 2
        }

        if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
            winner = 2
        }

        if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
            winner = 1
        }
        if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
            winner = 2
        }

        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winner = 2
        }

        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winner = 1
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            winner = 2
        }

        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winner = 2
        }



        if (winner != -1) {
            if (winner == 1) {
                Toast.makeText(this, "Player 1 win the game", Toast.LENGTH_LONG).show()
                finish()
                startActivity(getIntent())
            } else if(winner == 2){
                Toast.makeText(this, "Player 2 win the game", Toast.LENGTH_LONG).show()
                finish()
                startActivity(getIntent())
            }
            else if(winner != -1){
                Toast.makeText(this, "Ii is equal, no winner", Toast.LENGTH_LONG).show()
                finish()
            }

        }

//        when(winner != -1){
//            winner == 1 -> Toast.makeText(this, "Player 1 win the game", Toast.LENGTH_LONG).show()
//            winner == 2 -> Toast.makeText(this, "Player 2 win the game", Toast.LENGTH_LONG).show()
//
//            else -> {
//                Toast.makeText(this, "Ii is equal, no winner", Toast.LENGTH_LONG).show()
//            }




    }
}
//}