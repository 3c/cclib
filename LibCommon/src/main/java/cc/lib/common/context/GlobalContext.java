package cc.lib.common.context;

import android.app.Application;
import android.content.Context;

/**
 * GlobalContext.getContext() get application context
 *
 * @author CX
 */
public class GlobalContext {

    private static Application sApplication;

    /**
     * get application context
     * @return
     */
    public static Context getContext() {
        if (sApplication == null) {
            throw new NullPointerException("GlobalContext == null. Please init first");
        }
        //for easy use
        return sApplication;
    }

    public static void setApplication(Application _application) {
        sApplication = _application;
    }
}
