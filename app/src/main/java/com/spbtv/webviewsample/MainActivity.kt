package com.spbtv.webviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val webView = webview

//        val webView = WebView(this)
//        setContentView(webView)

        webView.loadUrl("")

        val htmlBody =
            """
                <html> 
                <body>
                <video src=\"https://r.mradx.net/r/mNbtOAsTpK9s3gXqCUo0xgEMbaLtnli-.mp4\" autoplay muted type=\"video/mp4\" />
                </body>
                </html>
            """
//        webView.loadData(htmlBody, null, null)

        val htmlUrl = "https://ya.ru/"
        webView.loadUrl(htmlUrl)

        Log.d("WebView", webView.settings.userAgentString)

    }
}