package com.example.baselib;

import android.app.Application;

import com.alibaba.android.arouter.BuildConfig;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by zr
 * on 2022/7/6
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化ARouter
        initARouter(this);
    }

    /**
     * 初始化ARouter
     * @param application
     */
    public static void initARouter(BaseApplication application) {
        if(BuildConfig.DEBUG) {//这两行必须卸载init之前，否则这些配置在init过程中将无效
            ARouter.openLog();//打印日志
            ARouter.openDebug();//开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(application);//尽可能早，推荐在Application中初始化
    }

}
