package com.example.circle;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.baselib.ARouterPath;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by zr
 * on 2022/7/6
 */
@Route(path = ARouterPath.CIRCLE_CIRCLE)
public class JumpOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump_one);
    }
}
