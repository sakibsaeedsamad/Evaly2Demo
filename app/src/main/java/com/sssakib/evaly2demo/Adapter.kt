package com.sssakib.evaly2demo


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_grid.view.*

class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>() {


    private val rcvTextViewTitle = arrayOf("Samsung Galaxy\nS21+5G - 6.7 Inch\nDisplay - 8GB RAM...","Apple Airpod Pro","Samsung Galaxy\nS21+5G - 6.7 Inch\nDisplay - 8GB RAM...","Apple Airpod Pro","Samsung Galaxy\nS21+5G - 6.7 Inch\nDisplay - 8GB RAM...","Apple Airpod Pro","Samsung Galaxy\nS21+5G - 6.7 Inch\nDisplay - 8GB RAM...","Apple Airpod Pro","Samsung Galaxy\nS21+5G - 6.7 Inch\nDisplay - 8GB RAM...","Apple Airpod Pro","Samsung Galaxy\nS21+5G - 6.7 Inch\nDisplay - 8GB RAM...","Apple Airpod Pro")

    private val rcvTextViewCros = arrayOf("৳1,10,000","৳30,000","৳1,10,000","৳30,000","৳1,10,000","৳30,000","৳1,10,000","৳30,000","৳1,10,000","৳30,000","৳1,10,000","৳30,000")

    private val productImages = intArrayOf(R.drawable.s21,
        R.drawable.airpod,R.drawable.s21,
        R.drawable.airpod,R.drawable.s21,
        R.drawable.airpod,R.drawable.s21,
        R.drawable.airpod,R.drawable.s21,
        R.drawable.airpod,R.drawable.s21,
        R.drawable.airpod)

    private val rcvTextView = arrayOf("৳60,000","৳15,000","৳60,000","৳15,000","৳60,000","৳15,000","৳60,000","৳15,000","৳60,000","৳15,000","৳60,000","৳15,000")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_grid, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return rcvTextViewTitle.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.rcvTextViewTitle.text = rcvTextViewTitle[position]
        holder.itemView.rcvTextViewCros.text = rcvTextViewCros[position]
        holder.itemView.rcvTextView.text = rcvTextView[position]
        holder.itemView.rcvImageView.setImageResource(productImages[position])
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}