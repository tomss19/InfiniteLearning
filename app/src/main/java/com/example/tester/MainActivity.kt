package com.example.tester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.tr,
                nameSuperhero = "Toms",
                descSuperhero = " You’ve gotta dance like there’s nobody watching, love like you’ll never be hurt, " +
                        "sing like there’s nobody listening, and live like it’s heaven on earth."
            ),
            Superhero(
                R.drawable.d,
                nameSuperhero = "Toms",
                descSuperhero = " Never regret a day in your life. Good days bring you happiness and" +
                        " bad days give you experience"),
            Superhero(
                R.drawable.f,
                nameSuperhero = "Toms",
                descSuperhero = " Words can inspire, thoughts can provoke, but only action truly " +
                        "brings you closer to your dreams."),
            Superhero(
                R.drawable.i,
                nameSuperhero = "Toms",
                descSuperhero = " Do something today that your future self will thank you for"),
            Superhero(
                R.drawable.o,
                nameSuperhero = "Toms",
                descSuperhero = "Be strong enough to let go and wise enough to wait for what you deserve."),
            Superhero(
                R.drawable.p,
                nameSuperhero = "Toms",
                descSuperhero = "si tampan dan si pemberani"),
            Superhero(
                R.drawable.q,
                nameSuperhero = "Toms",
                descSuperhero = "si tampan dan si pemberani"),
            Superhero(
                R.drawable.r,
                nameSuperhero = "Toms",
                descSuperhero = "si tampan dan si pemberani"),
            Superhero(
                R.drawable.s,
                nameSuperhero = "Toms",
                descSuperhero = "si tampan dan si pemberani"),
            Superhero(
                R.drawable.t,
                nameSuperhero = "Toms",
                descSuperhero = "si tampan dan si pemberani"),
            Superhero(
                R.drawable.u,
                nameSuperhero = "Toms",
                descSuperhero = "si tampan dan si pemberani"),
            Superhero(
                R.drawable.y,
                nameSuperhero = "Toms",
                descSuperhero = "si tampan dan si pemberani"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}