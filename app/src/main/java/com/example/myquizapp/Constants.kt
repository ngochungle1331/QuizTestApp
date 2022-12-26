package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTION : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        // 1
        val que1 = Question(
            1, "What is the name of this animal?",
            R.drawable.dog,
            "Dog", "Frog",
            "Elephant", "Cat", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What is this appliance?",
            R.drawable.fan,
            "Hair Dryer", "Spoon",
            "Fan", "Scissors", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What is this activity?",
            R.drawable.cycling,
            "Jogging", "Running",
            "Swimming", "Cycling", 4
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What is his job?",
            R.drawable.footballer,
            "Doctor", "Footballer",
            "Golfer", "Swimmer", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What is this appliance?",
            R.drawable.washingmachine,
            "Refrigerator", "Fan",
            "Washing Machine", "Hair Dryer", 3
        )

        questionsList.add(que6)



        // 7
        val que7 = Question(
            7, "What shape is this?",
            R.drawable.square,
            "Triangle", "Diamond",
            "Square", "Rectangle", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What is his job?",
            R.drawable.fireman,
            "Taxi Driver", "Cook",
            "Doctor", "Fireman", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What shape is this?",
            R.drawable.circle,
            "Square", "Circle",
            "Oval", "Rectangle", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What is this animal?",
            R.drawable.monkey,
            "Monkey", "Elephant",
            "Giraffe", "Snake", 1
        )

        questionsList.add(que10)

        return questionsList

    }
}