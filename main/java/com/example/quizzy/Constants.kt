package com.example.quizzy

object Constants {
    const val USER_NAME: String = "user name"
    const val TOTAL_QUESTIONS:String="total questions"
    const val CORRECT_ANSWERS:String = "correct"
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val q1 = Question(
            1,
            "What country does the flag belongs to?",
            R.drawable.ic_argentina_flag,
            "Argentina",
            "Brazil",
            "Australia",
            "Spain",
            1
        )
        questionsList.add(q1)


        val q2 = Question(
            2,
            "What country does the flag belongs to?",
            R.drawable.ic_spain_flag,
            "Nepal",
            "India",
            "Australia",
            "Spain",
            4
        )
        questionsList.add(q2)


        val q3 = Question(
            3,
            "What country does the flag belongs to?",
            R.drawable.ic_denmark_flag,
            "Sweden",
            "Brazil",
            "Denmark",
            "Spain",
            3
        )
        questionsList.add(q3)


        val q4 = Question(
            4,
            "What country does the flag belongs to?",
            R.drawable.ic_malaysia_flag,
            "Argentina",
            "Malaysia",
            "Australia",
            "Portugal",
            2
        )
        questionsList.add(q4)


        val q5 = Question(
            5,
            "What country does the flag belongs to?",
            R.drawable.ic_flag_peru,
            "Zimbabwe",
            "Sri Lanka",
            "Peru",
            "South Korea",
            3
        )
        questionsList.add(q5)


        val q6 = Question(
            6,
            "What country does the flag belongs to?",
            R.drawable.ic_hungary_flag,
            "Germany",
            "America",
            "Hungary",
            "Japan",
            3
        )
        questionsList.add(q6)

        return questionsList


    }

}