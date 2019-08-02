package com.example.androidlessons

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_sing_contact.*


//  override fun onCreate(savedInstanceState: Bundle?) {
//      super.onCreate(savedInstanceState)
//      setContentView(R.layout.activity_sing_contact)

    class ContactRecyclerAdapter(var ctx: Context, var list: ArrayList<Contact>) :
        RecyclerView.Adapter<ContactRecyclerAdapter.ContactViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
            var view = LayoutInflater.from(ctx).inflate(R.layout.activity_sing_contact, parent, false)
            return ContactViewHolder(view)
        }

        override fun getItemCount(): Int {
            return list.size
        }

        override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
            val currentContact = list[position]
            holder.nameContact.text = currentContact.name
            holder.numberContact.text = currentContact.number
            holder.callbtn.setOnClickListener {
                var intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel: ${holder.numberContact.text}")
                (ctx as MainActivity).startActivity(intent)

            }

        }





        inner class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var nameContact = itemView.findViewById<TextView>(R.id.namecontact1)
            var numberContact = itemView.findViewById<TextView>(R.id.numbercontact1)
            var callbtn = itemView.findViewById<ImageView>(R.id.callbtn)
        }


    }










