package com.mozhimen.prefabk_mqtt.commons

import android.util.Log
import com.mozhimen.underlayk.logk.LogK
import org.eclipse.paho.client.mqttv3.IMqttActionListener
import org.eclipse.paho.client.mqttv3.IMqttToken


/**
 * @ClassName MQTTSubsCallback
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2022/11/2 16:40
 * @Version 1.0
 */
class MQTTSubsCallback(private val _url: String) : IMqttActionListener {
    private val TAG = "MQTTSubsCallback>>>>>"

    override fun onSuccess(asyncActionToken: IMqttToken) {
        Log.d(TAG, "subscribe: onSuccess: topicUrl: $_url")
    }

    override fun onFailure(
        asyncActionToken: IMqttToken,
        exception: Throwable
    ) {
        //消息订阅失败 index
        exception.printStackTrace()
        LogK.et(TAG, "subscribe: onFailure: topicUrl: 消息订阅失败$_url ${exception.message ?: ""}")
    }
}