package com.mozhimen.prefabk_mqtt.commons

import org.eclipse.paho.client.mqttv3.MqttMessage


/**
 * @ClassName IMQTTSubsResListener
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2022/11/4 14:17
 * @Version 1.0
 */
interface IMQTTSubsResListener {
    fun onTopicPush(topic: String, payload: String)
}