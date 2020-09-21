package com.thefinestartist.finestwebview.helpers;

import com.thefinestartist.finestwebview.FinestWebViewActivity;

public class ActivityHelper {

    private static FinestWebViewActivity webViewActivity;

    public static FinestWebViewActivity getWebViewActivity() {
        return webViewActivity;
    }

    public static void setWebViewActivity(FinestWebViewActivity activity) {
        webViewActivity = activity;
    }

}
