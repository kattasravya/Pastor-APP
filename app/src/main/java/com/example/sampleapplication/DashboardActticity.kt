package com.example.sampleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.sampleapplication.databinding.ActivityDashboardActticityBinding

class DashboardActticity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardActticityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardActticityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val homeFragment = HomeFragment()
        val firstFragment = FirstFragment()
        val secondFragment = GalleryFragment()
        val aboutusFragment = AboutUsFragment()
//        val thirdFragment=ThirdFragment()
        setCurrentFragment(homeFragment)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.icn_home -> setCurrentFragment(homeFragment)
                R.id.galleru -> setCurrentFragment(secondFragment)
                R.id.about_us -> setCurrentFragment(aboutusFragment)
                R.id.account -> setCurrentFragment(firstFragment)

            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
}