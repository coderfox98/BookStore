package com.example.bookstore


import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.TabLayout
import android.support.v4.view.GravityCompat
import android.support.v4.view.ViewPager
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBar
import android.view.MenuItem
import com.example.bookstore.ProfileActivity.Companion.FIRST_NAME
import com.example.bookstore.ProfileActivity.Companion.LAST_NAME
import com.example.bookstore.ProfileActivity.Companion.SHAREDPREFS
import kotlinx.android.synthetic.main.nav_header.view.*


class MainActivity : AppCompatActivity() {

    private lateinit var viewPager : ViewPager

    private lateinit var tabLayout: TabLayout
    private lateinit var drawerLayout : DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)

        setSupportActionBar(findViewById(R.id.toolbar))



        val actionBar : ActionBar? = supportActionBar

        actionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu)
        }


        val navigationView: NavigationView = findViewById(R.id.navigation_view)

        navigationView.setNavigationItemSelectedListener {
            menuItem ->
            when(menuItem.itemId) {
                R.id.profile -> {

                    val intent = Intent(this@MainActivity,ProfileActivity::class.java)
                    startActivity(intent)

                }
                R.id.about -> {
                    val intent = Intent(this@MainActivity,AboutActivity::class.java)
                    startActivity(intent)
                }
            }
            drawerLayout.closeDrawers()
            true
        }


        viewPager = findViewById(R.id.view_pager)
        tabLayout = findViewById(R.id.tab_layout)

        val pagerAdapter = MyPagerAdapter(supportFragmentManager)

        viewPager.adapter = pagerAdapter

        tabLayout.setupWithViewPager(viewPager)




    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when(item?.itemId) {
            android.R.id.home -> {
                val sharedPrefs = this.getSharedPreferences(SHAREDPREFS, Context.MODE_PRIVATE)

                val firstName = sharedPrefs.getString(FIRST_NAME,"First Name")
                val lastName = sharedPrefs.getString(LAST_NAME,"Last Name")

                drawerLayout.full_name.text = "$firstName $lastName"
                drawerLayout.openDrawer(GravityCompat.START)
                true
            }else -> return super.onOptionsItemSelected(item)
        }


    }
}
