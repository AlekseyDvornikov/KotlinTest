package com.car.position

class TransportPosition private constructor(){

    init { println("Координаты инициализированы")}

    private object Holder { val INSTANCE = TransportPosition() }

    companion object {
        val instance: TransportPosition by lazy { Holder.INSTANCE }
    }

    var x: Double = .0

    var y: Double = .0

    var z: Double = .0

}