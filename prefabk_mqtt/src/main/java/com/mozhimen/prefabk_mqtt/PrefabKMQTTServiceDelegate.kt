package com.mozhimen.prefabk_mqtt

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleOwner
import com.mozhimen.basick.IBaseKServiceResListener
import com.mozhimen.basick.prefabk.service.PrefabKServiceDelegate


/**
 * @ClassName PrefabKMQTTServiceDelegate
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2022/11/4 10:34
 * @Version 1.0
 */
class PrefabKMQTTServiceDelegate<A, S>(
    activity: A,
    clazz: Class<S>,
    resListener: IBaseKServiceResListener
) : PrefabKServiceDelegate<A>(activity, clazz, resListener) where A : AppCompatActivity, A : LifecycleOwner, S : BaseKMQTTService