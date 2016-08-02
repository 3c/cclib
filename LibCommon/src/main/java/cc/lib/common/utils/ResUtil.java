package cc.lib.common.utils;

import android.content.res.Resources;

import cc.lib.common.context.GlobalContext;

/**
 * @author CX
 *
 */
public class ResUtil {
    /**
     * read String in strings.xml
     *
     * @param resId
     * @return
     */
    public static String getString(int resId) {
        return getResources().getString(resId);
    }

    /**
     * read color in colors.xml
     *
     * @param resId
     * @return
     */
    public static int getColor(int resId) {
        return getResources().getColor(resId);
    }

    /**
     * read array[] in arrays.xml
     *
     * @param resId
     * @return
     */
    public static String[] getStringArray(int resId) {
        return getResources().getStringArray(resId);
    }

    /**
     * read xml里读取dimen in dimens.xml
     *
     * @param resId
     * @return
     */
    public static int getDimen(int resId) {
        return getResources().getDimensionPixelSize(resId);
    }

    /**
     * get application resources
     * @return
     */
    public static Resources getResources() {
        return GlobalContext.getContext().getResources();
    }


}
