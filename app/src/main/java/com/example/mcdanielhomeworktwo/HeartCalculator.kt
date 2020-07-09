package com.example.mcdanielhomeworktwo

import android.widget.ToggleButton


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
    fun totalHeartBeats(elapsedTime: Double, heartRate: Int): Int {
        return ((elapsedTime * 60).toInt()) * heartRate
    }
    fun wheelRevsPerHeartBeat(wheelRevolutions: Double, totalHeartBeats: Int) : Double {
        return wheelRevolutions / totalHeartBeats
    }
    fun calculateBeatsPerRev(distance: Double, tireSize: Int, heartRate: Int, elapsedTime: Double) : Double {

        var revs = calculateWheelRevolutions(calculateWheelCircumference(tireSize), distance)
        var beats = totalHeartBeats(elapsedTime, heartRate)
        return wheelRevsPerHeartBeat(revs, beats)
    }
}