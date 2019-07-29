package com.example.androidlessons

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactRecyclerAdapterActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_contact)

        class ContactRecyclerAdapter(var ctx: Context, var list: ArrayList<Contact>) :
            RecyclerView.Adapter<ContactRecyclerAdapter.ContactViewHolder>() {


            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
                var view = LayoutInflater.from(ctx).inflate(R.layout.activity_sing_contact, parent, false)
                return ContactViewHolder(view)
            }

            override fun getItemCount(): Int {
                return list.size
            }

            override fun onBindViewHolder(holder: ContactRecyclerAdapter.ContactViewHolder, position: Int) {
                val currentContact = list[position]
                holder.nameContact.text = currentContact.name
                holder.numberContact.text = currentContact.number

            }


            inner class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                var nameContact = itemView.findViewById<TextView>(R.id.namecontact1)
                var numberContact = itemView.findViewById<TextView>(R.id.numbercontact1)
                var callbtn = itemView.findViewById<ImageView>(R.id.callbtn)
            }

        }
    }
}





