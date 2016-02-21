package com.dsfx.androidwebjs;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author dsutedja
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
