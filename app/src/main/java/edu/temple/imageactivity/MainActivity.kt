package edu.temple.imageactivity

import android.content.res.Resources
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

        var mDrawableName = "a"
        val res: Resources = resources
        val resID1: Int = res.getIdentifier(mDrawableName, "drawable", packageName)
        mDrawableName = "b"
        val resID2: Int = res.getIdentifier(mDrawableName, "drawable", packageName)
        mDrawableName = "c"
        val resID3: Int = res.getIdentifier(mDrawableName, "drawable", packageName)
        mDrawableName = "d"
        val resID4: Int = res.getIdentifier(mDrawableName, "drawable", packageName)
        mDrawableName = "e"
        val resID5: Int = res.getIdentifier(mDrawableName, "drawable", packageName)
        mDrawableName = "f"
        val resID6: Int = res.getIdentifier(mDrawableName, "drawable", packageName)
        mDrawableName = "g"
        val resID7: Int = res.getIdentifier(mDrawableName, "drawable", packageName)
        mDrawableName = "h"
        val resID8: Int = res.getIdentifier(mDrawableName, "drawable", packageName)
        mDrawableName = "i"
        val resID9: Int = res.getIdentifier(mDrawableName, "drawable", packageName)
        mDrawableName = "i1"
        val resID10: Int = res.getIdentifier(mDrawableName, "drawable", packageName)


        // Create array of color objects
        val colors = arrayOf(
            ImageObject("Bulbasaur", resID1),
            ImageObject("Charmander", resID2),
            ImageObject("Squirtle", resID3),
            ImageObject("Chikorita", resID4),
            ImageObject("Cyndaquil", resID5),
            ImageObject("Totodile", resID6),
            ImageObject("Treecko", resID7),
            ImageObject("Torchic", resID8),
            ImageObject("Mudkip", resID9),
            ImageObject("Mew", resID10)


            )




        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Assign a Grid layout manager with 3 columns
        recyclerView.layoutManager = GridLayoutManager(this, 3)

        // Initialize adapter with lambda for event listening
        recyclerView.adapter = ImageAdapter(colors)


    }
}