package cn.droidlover.xdroid.base;

import android.content.Context;
import android.view.View;

import cn.droidlover.xdroidbase.kit.ToastManager;

/**
 * Created by wanglei on 2016/12/1.
 */

public class UiDelegateBase implements UiDelegate {

    public Context context;

    private UiDelegateBase(Context context) {
        this.context = context;
    }

    public static UiDelegateBase create(Context context) {
        return new UiDelegateBase(context);
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destory() {

    }

    @Override
    public void visible(boolean flag, View view) {
        if (flag) view.setVisibility(View.VISIBLE);
    }

    @Override
    public void gone(boolean flag, View view) {
        if (flag) view.setVisibility(View.GONE);
    }

    @Override
    public void inVisible(View view) {
        view.setVisibility(View.INVISIBLE);
    }

    @Override
    public void toastShort(String msg) {
        ToastManager.showShort(context, msg);
    }

    @Override
    public void toastLong(String msg) {
        ToastManager.showLong(context, msg);
    }

}
