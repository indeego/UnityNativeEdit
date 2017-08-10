package com.bkmin.android;

import com.unity3d.player.*;
import android.content.ContextWrapper;
import android.view.SurfaceView;
import android.view.View;
import android.util.Log;

public class UnityPlayerNotOnTop
        extends UnityPlayer
{
    public UnityPlayerNotOnTop(ContextWrapper contextwrapper)
    {
        super(contextwrapper);
    }

    public void addView(View child)
    {
        if (child instanceof SurfaceView) {
            ((SurfaceView)child).setZOrderOnTop(false);
        }
        super.addView(child);
    }
}