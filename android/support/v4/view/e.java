package android.support.v4.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f۱۳۴۷a = false;

    /* renamed from: b  reason: collision with root package name */
    private static Method f۱۳۴۸b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f۱۳۴۹c = false;

    /* renamed from: d  reason: collision with root package name */
    private static Field f۱۳۵۰d = null;

    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    public static boolean a(View root, KeyEvent event) {
        return u.b(root, event);
    }

    public static boolean a(a component, View root, Window.Callback callback, KeyEvent event) {
        if (component == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return component.a(event);
        }
        if (callback instanceof Activity) {
            return a((Activity) callback, event);
        }
        if (callback instanceof Dialog) {
            return a((Dialog) callback, event);
        }
        if ((root == null || !u.a(root, event)) && !component.a(event)) {
            return false;
        }
        return true;
    }

    private static boolean a(ActionBar actionBar, KeyEvent event) {
        if (!f۱۳۴۷a) {
            try {
                f۱۳۴۸b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException e2) {
            }
            f۱۳۴۷a = true;
        }
        Method method = f۱۳۴۸b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, event)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException e3) {
            }
        }
        return false;
    }

    private static boolean a(Activity activity, KeyEvent event) {
        activity.onUserInteraction();
        Window win = activity.getWindow();
        if (win.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (event.getKeyCode() == 82 && actionBar != null && a(actionBar, event)) {
                return true;
            }
        }
        if (win.superDispatchKeyEvent(event)) {
            return true;
        }
        View decor = win.getDecorView();
        if (u.a(decor, event)) {
            return true;
        }
        return event.dispatch(activity, decor != null ? decor.getKeyDispatcherState() : null, activity);
    }

    private static DialogInterface.OnKeyListener a(Dialog dialog) {
        if (!f۱۳۴۹c) {
            try {
                f۱۳۵۰d = Dialog.class.getDeclaredField("mOnKeyListener");
                f۱۳۵۰d.setAccessible(true);
            } catch (NoSuchFieldException e2) {
            }
            f۱۳۴۹c = true;
        }
        Field field = f۱۳۵۰d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException e3) {
            return null;
        }
    }

    private static boolean a(Dialog dialog, KeyEvent event) {
        DialogInterface.OnKeyListener onKeyListener = a(dialog);
        if (onKeyListener != null && onKeyListener.onKey(dialog, event.getKeyCode(), event)) {
            return true;
        }
        Window win = dialog.getWindow();
        if (win.superDispatchKeyEvent(event)) {
            return true;
        }
        View decor = win.getDecorView();
        if (u.a(decor, event)) {
            return true;
        }
        return event.dispatch(dialog, decor != null ? decor.getKeyDispatcherState() : null, dialog);
    }
}
