package edu.temple.imageactivity

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find layout (root element)
        val imageView = findViewById<ImageView>(R.id.imageView)

        /*val id = resources.getIdentifier(lowerCountryCode, "drawable", packageName)
        imageView.setImageResource(id)*/

        // Create array of color objects
        val colors = arrayOf(
            ImageObject("Bulbasaur", "#FF0000"),
            ImageObject("Charmander", "#00FF00"),
            ImageObject("Squirtle", "#0000FF"),
            ImageObject("Chikorita", "#FF0000"),
            ImageObject("Cyndaquil", "#00FF00"),
            ImageObject("Totodile", "#0000FF"),
            ImageObject("Treecko", "#FF0000"),
            ImageObject("Torchic", "#00FF00"),
            ImageObject("Mudkip", "#0000FF"),
            ImageObject("Mew", "#0000FF")


            )




        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Assign a Grid layout manager with 3 columns
        recyclerView.layoutManager = GridLayoutManager(this, 3)

        // Initialize adapter with lambda for event listening
        recyclerView.adapter = ImageAdapter(colors)


    }
}