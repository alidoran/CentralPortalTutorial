package ir.dorantech.centralportaltutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.dorantech.centralportalpublish.TestLogger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestLogger().setLog("test")
    }
}