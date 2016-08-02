package cc.lib.common.utils;


import android.util.Log;


public final class LogUtil extends Timber {


    private LogUtil() {
    }

    public static void setLog(boolean open) {
        if (open) {
            Timber.plant(new Timber.DebugTree());
        } else {
            Timber.plant(new CrashReportingTree());
        }
    }

    /**
     * A tree which logs important information for crash reporting.
     */
    private static class CrashReportingTree extends Timber.Tree {
        @Override
        protected void log(int priority, String tag, String message, Throwable t) {
            if (priority == Log.VERBOSE || priority == Log.DEBUG) {
                return;
            }
            //TODO :错误的log可以在这里保存，保存到本地or其他操作
//            FakeCrashLibrary.log(priority, tag, message);

            if (t != null) {
                if (priority == Log.ERROR) {
//                    FakeCrashLibrary.logError(t);
                } else if (priority == Log.WARN) {
//                    FakeCrashLibrary.logWarning(t);
                }
            }
        }
    }

}
