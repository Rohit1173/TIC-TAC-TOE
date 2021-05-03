package com.example.tic_tac_toe20

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        val home:Button=findViewById(R.id.home)
        home.visibility = View.GONE
        home.isEnabled=false
        home.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        val again:Button=findViewById(R.id.playagain)
        again.visibility=View.GONE
        again.isEnabled=false
        again.setOnClickListener {
            val intent=Intent(this,game::class.java)
            startActivity(intent)
        }
    }

    fun btnfun(view: View) {
        val btnsel = view as Button
        var cellId =0
        when(btnsel.id){
            R.id.button1 -> cellId=1
            R.id.button2 -> cellId=2
            R.id.button3 -> cellId=3
            R.id.button4 -> cellId=4
            R.id.button5 -> cellId=5
            R.id.button6 -> cellId=6
            R.id.button7 -> cellId=7
            R.id.button8 -> cellId=8
            R.id.button9 -> cellId=9
        }

        playgame(cellId,btnsel)
    }
    var player1= ArrayList<Int>()
    var player2= ArrayList<Int>()
    var activeplayer=1
    private fun playgame(cellId: Int, btnsel: Button) {
        val turn : TextView =findViewById(R.id.textView)
        if(activeplayer==1){
            btnsel.text="X"
            btnsel.setBackgroundColor(Color.parseColor("#28e06c"))
            player1.add(cellId)
            activeplayer=2
            turn.setText("PLAYER 2'S TURN")
            turn.setTextColor(Color.parseColor("#c44025"))

        }
        else{
            btnsel.text="O"
            btnsel.setBackgroundColor(Color.parseColor("#c44025"))
            player2.add(cellId)
            activeplayer=1
            turn.setText("PLAYER 1'S TURN")
            turn.setTextColor(Color.parseColor("#28e06c"))

        }
        btnsel.isEnabled=false
        checkwinner()
    }

    private fun checkwinner() {
        var winner =-1
        if(player1.contains(1)&&player1.contains(2)&&player1.contains(3)){
            winner=1
        }
        if(player1.contains(4)&&player1.contains(5)&&player1.contains(6)){
            winner=1
        }
        if(player1.contains(7)&&player1.contains(8)&&player1.contains(9)){
            winner=1
        }
        if(player1.contains(1)&&player1.contains(4)&&player1.contains(7)){
            winner=1
        }
        if(player1.contains(2)&&player1.contains(5)&&player1.contains(8)){
            winner=1
        }
        if(player1.contains(3)&&player1.contains(6)&&player1.contains(9)){
            winner=1
        }
        if(player1.contains(1)&&player1.contains(5)&&player1.contains(9)){
            winner=1
        }
        if(player2.contains(3)&&player2.contains(5)&&player2.contains(7)){
            winner=1
        }
        if(player2.contains(1)&&player2.contains(5)&&player2.contains(9)){
            winner=2
        }
        if(player2.contains(3)&&player2.contains(5)&&player2.contains(7)){
            winner=2
        }
        if(player2.contains(1)&&player2.contains(2)&&player2.contains(3)){
            winner=2
        }
        if(player2.contains(4)&&player2.contains(5)&&player2.contains(6)){
            winner=2
        }
        if(player2.contains(7)&&player2.contains(8)&&player2.contains(9)){
            winner=2
        }
        if(player2.contains(1)&&player2.contains(4)&&player2.contains(7)){
            winner=2
        }
        if(player2.contains(2)&&player2.contains(5)&&player2.contains(8)){
            winner=2
        }
        if(player2.contains(3)&&player2.contains(6)&&player2.contains(9)){
            winner=2
        }

        if(winner!=-1){
            if(winner==1){
                val txt: TextView =findViewById(R.id.txt)
                txt.setText("PLAYER 1 WON")



            }

            else {
                val txt: TextView = findViewById(R.id.txt)
                txt.setText("PLAYER 2 WON")

            }
            val home:Button=findViewById(R.id.home)
            home.isEnabled=true
            home.visibility=View.VISIBLE
            val again:Button=findViewById(R.id.playagain)
            again.visibility=View.VISIBLE
            again.isEnabled=true
            val btn1: Button =findViewById(R.id.button1)
            val btn2: Button =findViewById(R.id.button2)
            val btn3: Button =findViewById(R.id.button3)
            val btn4: Button =findViewById(R.id.button4)
            val btn5: Button =findViewById(R.id.button5)
            val btn6: Button =findViewById(R.id.button6)
            val btn7: Button =findViewById(R.id.button7)
            val btn8: Button =findViewById(R.id.button8)
            val btn9: Button =findViewById(R.id.button9)
            btn1.isEnabled=false
            btn2.isEnabled=false
            btn3.isEnabled=false
            btn4.isEnabled=false
            btn5.isEnabled=false
            btn6.isEnabled=false
            btn7.isEnabled=false
            btn8.isEnabled=false
            btn9.isEnabled=false




        }



    }




}