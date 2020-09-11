package me.apps.gads2020.app.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import me.apps.gads2020.app.R
import me.apps.gads2020.app.databinding.ActivityMainBinding
import me.apps.gads2020.app.adapters.SectionsPagerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        mBinding.viewPager.adapter = sectionsPagerAdapter

        mBinding.tabs.setupWithViewPager(mBinding.viewPager)

        mBinding.btnSubmit.setOnClickListener {
            startActivity(Intent(this, SubmitActivity::class.java))
        }

    }
}