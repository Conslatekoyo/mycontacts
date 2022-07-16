package dev.conslate.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.conslate.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contact1=Contact("Abby","0768465737","abbygintu@gmail.com","234 keloni","https://images.unsplash.com/photo-1535295972055-1c762f4483e5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80")
        var contact2=Contact("conslate","0723456789","conslatek@gmail.com","mombasa","https://images.unsplash.com/photo-1531727991582-cfd25ce79613?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80")
        var contact3=Contact("Joy","0756435289","joyshiro@gmail.com","lamu","https://images.unsplash.com/photo-1587366802383-2e3e3e07aaf5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80")
        var contact4=Contact("jesse","0721325465","jesser@gmail.com","mpeketoni","https://images.unsplash.com/photo-1505421031134-e57263cae630?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=845&q=80")
        var contact5=Contact("Ricky","070045645678","rickyn@gmail.com","juliesi","https://images.unsplash.com/photo-14jenfjefyregyufcckjbhrvyryriurui")
        var contact6=Contact("Osili","0723446781","osiliw@gmail.com","zawadi","https://images.unsplash.com/photo-1533973427779-4b8c2eb4c3cd?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80")

        var contactList=
            listOf(contact1,contact2,contact3,contact4,contact5,contact6)
        var contactsadapter = ContactsRvAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsadapter

    }
}