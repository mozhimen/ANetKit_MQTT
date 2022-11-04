package com.mozhimen.prefabk_mqtt

import com.mozhimen.basick.basek.service.BaseKService
import com.mozhimen.prefabk_mqtt.commons.IMQTTDataListener
import com.mozhimen.prefabk_mqtt.commons.IMQTTGenConnBeanListener
import com.mozhimen.prefabk_mqtt.commons.IMQTTListener
import com.mozhimen.prefabk_mqtt.commons.IMQTTSubsResListener
import com.mozhimen.prefabk_mqtt.helpers.MQTTManager

/**
 * @ClassName MQTTService
 * @Description MQTTService
 * @Author Kolin Zhao / Mozhimen
 * @Date 2022/9/26 18:20
 * @Version 1.0
 */
abstract class BaseKMQTTService : BaseKService(), IMQTTListener {

    private val _mqttDataListener: IMQTTDataListener = object : IMQTTDataListener {
        override fun onGetData(data: String) {
            onCallback(data)
        }
    }
    private val _mattManager by lazy {
        MQTTManager(
            this, this,
            _mqttDataListener = _mqttDataListener,
            _mqttSubsResListener = getSubsResListener(),
            _mqttGenConnBeanListener = getGenConnBeanListener()
        )
    }

    abstract fun getSubsResListener(): IMQTTSubsResListener

    abstract fun getGenConnBeanListener(): IMQTTGenConnBeanListener

    override fun onCreate() {
        super.onCreate()
        start()
    }

    override fun onDestroy() {
        stop()
        super.onDestroy()
    }

    override fun start() {
        _mattManager.start()
    }

    override fun stop() {
        _mattManager.stop()
    }
}