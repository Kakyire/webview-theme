package com.kakyiretechnologies.webviewtheme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kakyiretechnologies.webviewtheme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.apply {
            setWebViewDarkTheme()
            loadDataWithBaseURL(null, HTML, "text/html", "utf-8", null)

        }
    }

    companion object {
        private const val HTML = """
            <!DOCTYPE html>
<html>
<body>

<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>


</body>
</html>

        """
    }
}