package com.sealteam.games

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //1-Adapterview:Recycler(cardview)
        val recyclerview: RecyclerView =findViewById(R.id.recyclerview)
        recyclerview.layoutManager= LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        //2-Data source:List of games objects
        var gamesList:ArrayList<GameModel> = ArrayList()

        var g1=GameModel(R.drawable.card1,"Need for speed")
        var g2=GameModel(R.drawable.card2,"PES")
        var g3=GameModel(R.drawable.card3,"Hill climbing")
        var g4=GameModel(R.drawable.card4,"Fort nite")
        var g5=GameModel(R.drawable.card5,"pubg mobile")
        var g6=GameModel(R.drawable.card6,"Buttle grounds")
        var g7=GameModel(R.drawable.card7,"Premier League")

        //Add them to the adapter
        gamesList.add(g1)
        gamesList.add(g2)
        gamesList.add(g3)
        gamesList.add(g4)
        gamesList.add(g5)
        gamesList.add(g6)
        gamesList.add(g7)

//Adapter,this adpter will connect the data source which is the game list

        val adapter = GameAdapter(gamesList)
        recyclerview.adapter=adapter
        //connecting recyclerview to the adapter










    }

}