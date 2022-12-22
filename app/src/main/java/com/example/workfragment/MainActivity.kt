package com.example.workfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.workfragment.R
import com.example.workfragment.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            callFragment1()
            callFragment2()
        }
    }

    private fun callFragment1() {
        findViewById<Button>(R.id.fragment1).setOnClickListener {

            val bundle = bundleOf(
                "USER" to User("GABRIELLE", 24)
            )

            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<FirstFragment>(R.id.fragmentContainerView, args = bundle)
            }
        }
    }

    private fun callFragment2() {
        findViewById<Button>(R.id.fragment2).setOnClickListener {

            val bundle = bundleOf(
                "USER_NAME" to "gabrielle",
                "USER_AGE" to 24
            )
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<SecondFragment>(R.id.fragmentContainerView, args = bundle)
            }
        }
    }
}