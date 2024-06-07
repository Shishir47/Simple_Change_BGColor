package com.shishir.changebgcolor

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var view: View
    private lateinit var button: FloatingActionButton
    private val colors= arrayOf(Color.RED, Color.BLACK, Color.YELLOW, Color.CYAN, Color.MAGENTA, Color.GREEN)
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view= findViewById(R.id.view)
        button= findViewById(R.id.btn)
        button.setOnClickListener{
            view.setBackgroundColor(colors[Random.nextInt(colors.size)])

        }
    }
}