package com.izleyerekkazan.izlekazanprojesi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.Keep
import androidx.core.view.GravityCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.izleyerekkazan.izlekazanprojesi.API.ApiUtils
import com.izleyerekkazan.izlekazanprojesi.databinding.ActivityContactBinding
@Keep
class ContactActivity : AppCompatActivity() {
    val kdi= ApiUtils.getKisilerDaoInterface()
    private lateinit var binding: ActivityContactBinding
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
                    R.id.OdemeBilgiActivity -> {
                        startActivity(Intent(applicationContext, OdemeBilgiActivity::class.java))
                    }
                    R.id.TalepEtActivity->{
                        startActivity(Intent(applicationContext,TalepEtActivity::class.java))
                    }
                    R.id.HesabimActivity->{
                        startActivity(Intent(applicationContext,HesabimActivity::class.java))
                    }
                    R.id.ProfilActivity->{
                        startActivity(Intent(applicationContext,ProfilActivity::class.java))
                    }
                    R.id.MainActivity->{
                        val sp = getSharedPreferences("checkbox", MODE_PRIVATE)
                        val editor = sp.edit()
                        editor.putString("remember", "false")
                        editor.apply()
                        Toast.makeText(applicationContext, "Başarıyla Çıkış Yapıldı", Toast.LENGTH_SHORT).show()
                        startActivity(Intent(applicationContext,MainActivity::class.java))

                    }
                    R.id.MenuActivity->{
                        startActivity(Intent(applicationContext,MenuActivity::class.java))
                    }
                }
                return true
            }
        })
    }
}