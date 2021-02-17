package com.example.ehnotetask.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.ehnotetask.Constant
import com.example.ehnotetask.R
import com.example.ehnotetask.model.PatientFile
import com.squareup.picasso.Picasso

class PatientAdapter(
    val context: Context, val
    patientList: ArrayList<PatientFile>
) :
    RecyclerView.Adapter<PatientAdapter.MyViewHolder>() {

    var idType = 0
    val tempList = patientList

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val inflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var v: View? = null
        v = inflater.inflate(R.layout.row_list, parent, false)
        return MyViewHolder(v!!)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(
        holder: MyViewHolder,
        position: Int
    ) {
        val dataItem = tempList[position];

        holder.setIsRecyclable(false);
        if (dataItem.fileTypeId == Constant.idType) {
            holder.idTypeTitle.visibility = View.GONE

        } else {
            Constant.idType = dataItem.fileTypeId
            holder.idTypeTitle.setText("file type " + tempList.get(position).fileTypeId)
            holder.idTypeTitle.visibility = View.VISIBLE
        }
        holder.title.setText(tempList.get(position).fileName)
        Picasso.get().load(tempList.get(position).thumbUrl)
            .into(holder.icon)

        holder.delet.setOnClickListener {
            tempList.removeAt(position)
            notifyDataSetChanged()
        }
        holder.editBtn.setOnClickListener {
            holder.title.isEnabled = true
        }
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }


    override fun getItemCount(): Int {
        return tempList.size
    }

    inner class MyViewHolder(v: View) :
        RecyclerView.ViewHolder(v) {
        var title: EditText
        var delet: ImageButton
        var editBtn: ImageButton
        var icon: ImageView
        var cardView: CardView
        val idTypeTitle: TextView
        var view: View

        init {
            title = v.findViewById(R.id.edText)
            delet = v.findViewById(R.id.delBtn)
            editBtn = v.findViewById(R.id.edBtn)
            icon = v.findViewById(R.id.icn)
            cardView = v.findViewById(R.id.card_view)
            idTypeTitle = v.findViewById(R.id.IdTypeTitile)
            view = v
        }
    }
}
