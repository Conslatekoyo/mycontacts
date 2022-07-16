package dev.conslate.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.conslate.mycontacts.databinding.ContactListItemBinding

class ContactsRvAdapter (var contactList:List<Contact>):
RecyclerView.Adapter<ContactsViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
          var itemView= LayoutInflater.from(parent.context)
                  .inflate(R.layout.contact_list_item,parent,false)
                var binding=ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                var contactsViewHolder=ContactsViewHolder(binding)
                return  contactsViewHolder
        }

        override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
                var currentContact= contactList.get(position)
                holder.binding.tvname.text=currentContact.name
                holder.binding.tvnumber.text=currentContact.phoneNUmber
                holder.binding.tvemail.text=currentContact.email
                holder.binding.tvaddress.text=currentContact.address
                Picasso.get().load(currentContact.image)
                    .error(R.drawable.ic_baseline_error_outline_24)
                    .placeholder(R.drawable.ic_baseline_person_24)
                    .resize(50, 50)
                    .centerCrop()
                    .into(holder.binding.imgcontact)
        }

        override fun getItemCount(): Int {
                return contactList.size

        }
}
class ContactsViewHolder(var binding:ContactListItemBinding): RecyclerView.ViewHolder(binding.root){


}