package com.android.example.resoles_exer4_slambook

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.android.example.resoles_exer4_slambook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val userData: UserData = UserData("Aleks Haecky", "Aleks","10")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.userData = userData
        binding.doneButton.setOnClickListener {
            addDetails()
        }

    }

    private fun addDetails(){
        binding.apply{
            userData?.nickname = nicknameEdit.text.toString()
            userData?.name = nameEdit.text.toString()
            userData?.age = ageEdit.text.toString()
            invalidateAll()
            nicknameEdit.visibility = View.GONE
            nameEdit.visibility = View.GONE
            qName.visibility = View.GONE
            nicknameEdit.visibility = View.GONE
            qNickname.visibility = View.GONE
            ageEdit.visibility = View.GONE
            qAge.visibility = View.GONE
            qBirthday.visibility = View.GONE
            birthdayEdit.visibility = View.GONE
            qNumber.visibility = View.GONE
            numberEdit.visibility = View.GONE
            qEmail.visibility = View.GONE
            emailEdit.visibility = View.GONE
            qCourse.visibility = View.GONE
            courseEdit.visibility = View.GONE
            qDream.visibility = View.GONE
            dreamEdit.visibility = View.GONE
            qCrush.visibility = View.GONE
            crushEdit.visibility = View.GONE
            qMessage.visibility = View.GONE
            editMessage.visibility = View.GONE
            greetingText.visibility = View.GONE
            doneButton.visibility = View.GONE
            nameText.visibility = View.VISIBLE
            nicknameText.visibility = View.VISIBLE
            ageText.visibility = View.VISIBLE
            end.visibility = View.VISIBLE

            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(doneButton.windowToken, 0)
        }
    }
}
