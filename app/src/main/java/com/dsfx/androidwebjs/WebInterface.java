package com.dsfx.androidwebjs;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by esutedja on 2/20/16.
 */
public class WebInterface {
    private Activity mActivity;

    public WebInterface(Activity context) {
        mActivity = context;
    }

    @JavascriptInterface
    public void changeText(String text) {
        TextView tv = (TextView) mActivity.findViewById(R.id.textField);
        tv.setText(text);
    }
}
