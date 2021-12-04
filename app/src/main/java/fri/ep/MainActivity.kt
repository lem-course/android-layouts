package fri.ep

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import fri.ep.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun addNumber(view: View) {
        val b = view as Button
        val currentValue = binding.textView.text.toString()
        val newValue = currentValue + b.text.toString()

        binding.textView.text = newValue
    }
}
