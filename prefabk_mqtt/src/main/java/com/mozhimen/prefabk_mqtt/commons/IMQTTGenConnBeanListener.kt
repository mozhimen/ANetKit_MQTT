package com.mozhimen.prefabk_mqtt.commons

import com.mozhimen.prefabk_mqtt.annors.AConnType


/**
 * @ClassName IMQTTGenConnBeanListener
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2022/11/4 11:34
 * @Version 1.0
 */
interface IMQTTGenConnBeanListener {
    fun onGetBaseUrl(): String
    fun onGetUseName(@AConnType connType: Int): String
    fun onGetPassword(@AConnType connType: Int): String
    fun onGetClientId(@AConnType connType: Int): String
    fun onGetTopics(@AConnType connType: Int): List<String>
}