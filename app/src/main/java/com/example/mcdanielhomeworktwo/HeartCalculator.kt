package com.example.mcdanielhomeworktwo


class HeartCalculator {

    fun distanceInMilesToKM(distance: Double) : Double {
        return distance * (8/5)
    }
    fun calculateWheelCircumference(tireSize: Int) : Double {
        return (622 + tireSize * 2) * 3.14159
    }
    fun calculateWheelRevolutions(circumference: Double, distance: Double) : Double {
        return distance / (circumference *.000001)
    }
    fun totalHeartBeats(elapsedTime: Double, avgHeartBeat: Int): Int {
        return ((elapsedTime * 60).toInt()) * avgHeartBeat
    }
    fun wheelRevsPerHeartBeat(wheelRevolutions: Double, totalHeartBeats: Int) : Double {
        return wheelRevolutions / totalHeartBeats
    }
}