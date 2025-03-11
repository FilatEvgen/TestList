package ru.kosproger.testlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.kosproger.testlist.api.InfoClass
import ru.kosproger.testlist.databinding.ListInfoBinding

class InfoAdapter: RecyclerView.Adapter<InfoAdapter.InfoViewHolder>() {

    var data: List<InfoClass> = emptyList()
        set(newValue) {
            field = newValue
            notifyDataSetChanged()
        }

    class InfoViewHolder(private val binding: ListInfoBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(info: InfoClass) {
            binding.titleTextView.text = info.title
            binding.bodyTextView.text = info.body
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfoViewHolder {
        val binding = ListInfoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return InfoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: InfoViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount():
            Int = data.size

}