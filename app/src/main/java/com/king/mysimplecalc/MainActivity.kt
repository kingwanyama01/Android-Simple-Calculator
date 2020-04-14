package com.king.mysimplecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBtnAdd.setOnClickListener {
            //Receive entered data from the user on a variable
            var first_number = mEdtFnum.text.toString()
            var second_number = mEdtSnum.text.toString()
            if (first_number.isEmpty() or second_number.isEmpty()){
                mTvAnswer.text = "Please fill all the inputs";
            }else{
                //Now start implementing the calculation
                var answer = first_number.toDouble() + second_number.toDouble()
                mTvAnswer.text = answer.toString()
            }



        }

        mBtnSubtract.setOnClickListener {
            //Receive entered data from the user on a variable
            var first_number = mEdtFnum.text.toString()
            var second_number = mEdtSnum.text.toString()
            if (first_number.isEmpty() or second_number.isEmpty()){
                mTvAnswer.text = "Please fill all the inputs";
            }else{
                //Now start implementing the calculation
                var answer = first_number.toDouble() - second_number.toDouble()
                mTvAnswer.text = answer.toString()

            }

        }

        mBtnDivide.setOnClickListener {
            //Receive entered data from the user on a variable
            var first_number = mEdtFnum.text.toString()
            var second_number = mEdtSnum.text.toString()
            if (first_number.isEmpty() or second_number.isEmpty()){
                mTvAnswer.text = "Please fill all the inputs";
            }else{
                //Now start implementing the calculation
                var answer = first_number.toDouble() / second_number.toDouble()
                mTvAnswer.text = answer.toString()

            }

        }

        mBtnMultiply.setOnClickListener {
            //Receive entered data from the user on a variable
            var first_number = mEdtFnum.text.toString()
            var second_number = mEdtSnum.text.toString()
            if (first_number.isEmpty() or second_number.isEmpty()){
                mTvAnswer.text = "Please fill all the inputs";
            }else{
                //Now start implementing the calculation
                var answer = first_number.toDouble() * second_number.toDouble()
                mTvAnswer.text = answer.toString()

            }

        }
    }
}
