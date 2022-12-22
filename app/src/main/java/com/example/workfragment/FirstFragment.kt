package com.example.workfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View

import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(R.layout.fragment_first) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val user = requireArguments().getSerializable("USER") as User

        println("Nome: ${user.name}, \nIdade: ${user.age} ")

        getData(user)
    }

    fun getData(user: User) {
        Thread(Runnable {
            Thread.sleep(1000)
            textView.text = "${user.name} ${user.age}"
        }).start()

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}