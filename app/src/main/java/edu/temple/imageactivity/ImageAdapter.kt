package edu.temple.imageactivity

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ImageAdapter (_imageObjects : Array<ImageObject>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>(){

    val imageObjects = _imageObjects


    // Create view holder (defined as 'inner' class to access members of outer class
    inner class ImageViewHolder(_view: View) : RecyclerView.ViewHolder(_view) {
        val imageNameTextView = _view.findViewById<TextView>(R.id.textViewIV)
        val imageDisplayView = _view.findViewById<ImageView>(R.id.imageViewIV)

        // Initialized when new binding is invoked
        lateinit var imageObject: ImageObject

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        // Inflate layout file instead of creating views in code
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_imageview, parent, false)
        return ImageViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        // Manipulate view attributes based on item at 'position'
        holder.imageNameTextView.text = imageObjects[position].name
        holder.imageNameTextView.textSize = 23F
        holder.imageDisplayView .setImageResource(imageObjects[position].pathFile)


    }

    override fun getItemCount(): Int {
        return imageObjects.size
    }
}