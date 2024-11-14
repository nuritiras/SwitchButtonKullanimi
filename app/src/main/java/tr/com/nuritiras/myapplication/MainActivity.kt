package tr.com.nuritiras.myapplication

import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onResume() {
        super.onResume()

        val switchNamaz = findViewById<Switch>(R.id.switchNamaz)

        switchNamaz.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Namaz cennetin anahtarıdır.", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Kulun kıyamet gününde ilk hesaba çekileceği şey, namazdır. ", Toast.LENGTH_LONG).show()
            }
        }
    }
}