package com.example.androidiotaminer.androidiotaminer.iota

data class FullBlockWithTaggedDataPayload(
    val protocolVersion: Int,
    val parents: List<String>,
    val payload: Payload? = null,
    val nonce: String = ""
)
