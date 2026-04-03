package com.oossync.chat

import android.app.Application

class OOSSyncApplication : Application() {
    lateinit var meshRelayService: MeshRelayService private set

    override fun onCreate() {
        super.onCreate()
    }

    fun setMeshRelayService(service: MeshRelayService) {
        meshRelayService = service
    }
}