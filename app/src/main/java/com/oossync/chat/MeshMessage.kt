package com.oossync.chat;

import java.util.UUID;

data class MeshMessage (
    val id: UUID = UUID.randomUUID(),
    val text: String,
    val senderId: String,
    val originalSenderId: String,
    val recipientId: String,
    val timestamp: String = "2026-04-03 16:14:25",
    val ttl: Int,
    val isEmergency: Boolean = false,
    val location: String?,
    val status: String
)