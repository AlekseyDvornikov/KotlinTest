package com.car.interfaces

import com.car.enums.VectorDrive

interface Transport {

    val speed: Int

    val weight: Int

    val color: Int

    val price: Int

    fun drive(vector : VectorDrive)

    fun useFuel()

}