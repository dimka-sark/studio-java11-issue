package com.example.java11namespaceissue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.module.Java1_8NoIssue
import com.example.module.JavaIssue
import com.example.module.JavaPackageNoIssue
import com.example.module.KotlinNonIssue

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    JavaIssue().run()
    KotlinNonIssue().run()
    Java1_8NoIssue().run()
    JavaPackageNoIssue().run()
  }
}