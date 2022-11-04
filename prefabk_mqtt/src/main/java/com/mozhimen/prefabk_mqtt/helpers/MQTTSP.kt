package com.mozhimen.prefabk_mqtt.helpers

import com.mozhimen.basick.cachek.CacheKSP


/**
 * @ClassName MQTTSP
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2022/11/4 10:42
 * @Version 1.0
 */
object MQTTSP {
    private val _spMQTT = CacheKSP.instance.with("prefabk_mqtt")
    var mqttConnType: Int
        get() = _spMQTT.getInt("mqttConnType")
        set(value) {
            _spMQTT.putInt("mqttConnType", value)
        }
}