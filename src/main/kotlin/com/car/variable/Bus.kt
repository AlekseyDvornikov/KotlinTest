package com.car.variable

import com.car.enums.VectorDrive
import com.car.interfaces.Transport

abstract class Bus : Transport {

    override val speed: Int
        get() = TODO("not implemented")
    override val weight: Int
        get() = TODO("not implemented")
    override val color: Int
        get() = TODO("not implemented")
    override val price: Int
        get() = TODO("not implemented")

    override fun drive(vector : VectorDrive) {
        TODO("not implemented")
    }

    override fun useFuel() {
        TODO("not implemented")
    }

}