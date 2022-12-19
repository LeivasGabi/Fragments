package com.example.workfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        callFirstFragment()
        callSeconfFragment()

    }

    private fun callFirstFragment() {
        findViewById<Button>(R.id.fragmento1).setOnClickListener{
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<FirstFragment>(R.id.fragmentContainerView)
            }
        }
    }

    private fun callSeconfFragment() {
        findViewById<Button>(R.id.fragmento2).setOnClickListener{
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<SecondFragment>(R.id.fragmentContainerView)
            }
        }
    }
}