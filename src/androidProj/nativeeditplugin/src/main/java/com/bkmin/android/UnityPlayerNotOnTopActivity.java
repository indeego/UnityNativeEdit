package com.bkmin.android;

import com.unity3d.player.*;
import android.os.Bundle;
import android.util.Log;

public class UnityPlayerNotOnTopActivity
        extends UnityPlayerActivity
{
    @Override
    public void onCreate(Bundle bundle)
    {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setFormat(2);
        mUnityPlayer = new UnityPlayerNotOnTop(this);
        setContentView(mUnityPlayer);
        mUnityPlayer.requestFocus();
    }
}