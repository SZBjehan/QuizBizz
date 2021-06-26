package com.example.test123

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.test123.DoneFeed
import com.example.test123.R

class DoneAdapter(private val context: Context,
                  private val info: DoneFeed
): BaseAdapter() {
    override fun getCount(): Int {
        return 1
    }

    override fun getItem(position: Int): Any {
        return  position.toLong()
    }

    override fun getItemId(position: Int): Long {
        return  position.toLong()
    }

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
        val layoutInflater: LayoutInflater= LayoutInflater.from(context);
        val statRow: View = layoutInflater.inflate(R.layout.donelist, viewGroup, false)

        statRow.findViewById<TextView>(R.id.tvQuestionsNumber).text = "Total Questions: ${info.qNumbers}"
        statRow.findViewById<TextView>(R.id.tvAttemptedQuestions).text = "Attempted Questions: ${info.qAttempted}"
        statRow.findViewById<TextView>(R.id.tvCorrectAnswers).text = "Correct Answers: ${info.qCorrectAnswers}"
        statRow.findViewById<TextView>(R.id.tvNegativeMarks).text = "Negative Marks: ${info.qNegative}"

        return statRow
    }
}
