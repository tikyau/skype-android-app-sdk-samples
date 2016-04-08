package com.microsoft.office.sfb.sfbwellbaby;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by johnau on 4/7/2016.
 */
public class InputMethodHelper {
    /**
     * Show the soft keyboard.
     *
     * @param context
     * @param view
     */
    public static boolean showSoftKeyBoard(Context context, View view) {
        InputMethodManager mgr = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        return mgr.showSoftInput(view, InputMethodManager.SHOW_FORCED);
    }

    /**
     * Hide the soft keyboard.
     *
     * @param context
     * @param windowToken
     */
    public static void hideSoftKeyBoard(Context context, IBinder windowToken) {
        InputMethodManager mgr = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(windowToken, 0);
    }

}
