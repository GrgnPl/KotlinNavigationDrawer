package com.izleyerekkazan.izlekazanprojesi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.Keep
import androidx.core.view.GravityCompat
@Keep
class Activity : AppCompatActivity() {
    val kdi= ApiUtils.getKisilerDaoInterface()
    private lateinit var binding: ActivityBinding
    lateinit var bottomnav: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val drawarLayout = binding.drawarLayout
        val imgMenu = binding.imgMenu
        val navView = findViewById<NavigationView>(R.id.navDawar)
        navView.itemIconTintList = null
        imgMenu.setOnClickListener {
            drawarLayout.openDrawer(GravityCompat.START)
        }
        navView.setNavigationItemSelectedListener(object :
            NavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
                when (menuItem.getItemId()) {
                    R.id.ActivityAdi -> {
                        startActivity(Intent(applicationContext, ActivityAdi::class.java))
                    }
                    R.id.ActivityAdi->{
                        startActivity(Intent(applicationContext,ActivityAdi::class.java))
                    }
                    R.id.ActivityAdi->{
                        startActivity(Intent(applicationContext,ActivityAdi::class.java))
                    }
                    R.id.ActivityAdi->{
                        startActivity(Intent(applicationContext,ActivityAdi::class.java))
                    }
                    R.id.ActivityAdi->{
                        startActivity(Intent(applicationContext,ActivityAdi::class.java))
                    }
                    R.id.ActivityAdi->{
                        startActivity(Intent(applicationContext,ActivityAdi::class.java))
                    }
                }
                return true
            }
        })
    }
}
