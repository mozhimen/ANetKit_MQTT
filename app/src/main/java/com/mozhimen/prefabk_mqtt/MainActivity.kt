package com.mozhimen.prefabk_mqtt

import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.mozhimen.basick.basek.BaseKActivityVB
import com.mozhimen.basick.basek.service.BaseKServiceResCallback
import com.mozhimen.basick.prefabk.service.PrefabKServiceDelegate
import com.mozhimen.prefabk_mqtt.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : BaseKActivityVB<ActivityMainBinding>() {
    private lateinit var _prefabKServiceDelegate: PrefabKMQTTServiceDelegate<MainActivity, MQTTService>
    private var _resListener: BaseKServiceResCallback = object : BaseKServiceResCallback() {
        override fun onResString(resString: String?) {
            lifecycleScope.launch(Dispatchers.Main) {
                vb.demoTxt.text = resString ?: "loss"
            }
        }
    }

    override fun initData(savedInstanceState: Bundle?) {
        _prefabKServiceDelegate = PrefabKMQTTServiceDelegate(this, MQTTService::class.java, _resListener)
    }
}