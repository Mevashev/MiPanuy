package com.mipanuy.app.application

import android.app.Application
import com.google.firebase.database.*

/**
 * Created by Henmev on 22-Sep-17.
 *
 */

class MiPanuyApplication : Application()
{
    override fun onCreate()
    {
        super.onCreate()
        val database: FirebaseDatabase = FirebaseDatabase.getInstance()
        val myRef: DatabaseReference = database.getReference("message")
        myRef.setValue("Hello, World!")
        myRef.setValue("banana")

        myRef.addValueEventListener(object: ValueEventListener {
            override fun onCancelled(p0: DatabaseError?)
            {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onDataChange(dataSnapshot: DataSnapshot)
            {
                dataSnapshot.getValue(String::class.java)
            }
        })
    }
}