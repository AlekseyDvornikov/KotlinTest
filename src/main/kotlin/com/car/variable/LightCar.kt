package com.car.variable

import com.car.enums.VectorDrive
import com.car.exceptions.WrongVectorException
import com.car.interfaces.Transport
import com.car.position.TransportPosition

abstract class LightCar: Transport {

    override val speed: Int
        get() = TODO("not implemented")
    override val weight: Int
        get() = TODO("not implemented")
    override val color: Int
        get() = TODO("not implemented")
    override val price: Int
        get() = TODO("not implemented")

    override fun drive(vector : VectorDrive) {

        var transportPosition = TransportPosition.instance

        when (vector){
            VectorDrive.FORWARD -> (transportPosition.x+1)
            VectorDrive.BACKWARD -> (transportPosition.x-1)
            VectorDrive.LEFT -> (transportPosition.y+1)
            VectorDrive.RIGHT -> (transportPosition.y-1)
             else -> throw WrongVectorException("Unexpected vector");
        }
    }

    override fun useFuel() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}