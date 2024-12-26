package android.support.p۰۴۳v4.view;

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

/* renamed from: android.support.v4.view.e  reason: invalid class name */
public class Ce {

    /* renamed from: a  reason: contains not printable characters */
    private static boolean f۱۰۶۰۱a = false;

    /* renamed from: b  reason: contains not printable characters */
    private static Method f۱۰۶۰۲b = null;

    /* renamed from: c  reason: contains not printable characters */
    private static boolean f۱۰۶۰۳c = false;

    /* renamed from: d  reason: contains not printable characters */
    private static Field f۱۰۶۰۴d = null;

    /* renamed from: android.support.v4.view.e$a  reason: invalid class name */
    public interface AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۲۹۰۹a(KeyEvent keyEvent);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۲۹۰۸a(View root, KeyEvent event) {
        return Cu.m۱۲۹۹۹b(root, event);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۲۹۰۷a(AbstractCa component, View root, Window.Callback callback, KeyEvent event) {
        if (component == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return component.m۱۲۹۰۹a(event);
        }
        if (callback instanceof Activity) {
            return m۱۲۹۰۵a((Activity) callback, event);
        }
        if (callback instanceof Dialog) {
            return m۱۲۹۰۶a((Dialog) callback, event);
        }
        if ((root == null || !Cu.m۱۲۹۹۴a(root, event)) && !component.m۱۲۹۰۹a(event)) {
            return false;
        }
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۲۹۰۴a(ActionBar actionBar, KeyEvent event) {
        if (!f۱۰۶۰۱a) {
            try {
                f۱۰۶۰۲b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException e) {
            }
            f۱۰۶۰۱a = true;
        }
        Method method = f۱۰۶۰۲b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, event)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException e2) {
            }
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۲۹۰۵a(Activity activity, KeyEvent event) {
        activity.onUserInteraction();
        Window win = activity.getWindow();
        if (win.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (event.getKeyCode() == 82 && actionBar != null && m۱۲۹۰۴a(actionBar, event)) {
                return true;
            }
        }
        if (win.superDispatchKeyEvent(event)) {
            return true;
        }
        View decor = win.getDecorView();
        if (Cu.m۱۲۹۹۴a(decor, event)) {
            return true;
        }
        return event.dispatch(activity, decor != null ? decor.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static DialogInterface.OnKeyListener m۱۲۹۰۳a(Dialog dialog) {
        if (!f۱۰۶۰۳c) {
            try {
                f۱۰۶۰۴d = Dialog.class.getDeclaredField("mOnKeyListener");
                f۱۰۶۰۴d.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f۱۰۶۰۳c = true;
        }
        Field field = f۱۰۶۰۴d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException e2) {
            return null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۲۹۰۶a(Dialog dialog, KeyEvent event) {
        DialogInterface.OnKeyListener onKeyListener = m۱۲۹۰۳a(dialog);
        if (onKeyListener != null && onKeyListener.onKey(dialog, event.getKeyCode(), event)) {
            return true;
        }
        Window win = dialog.getWindow();
        if (win.superDispatchKeyEvent(event)) {
            return true;
        }
        View decor = win.getDecorView();
        if (Cu.m۱۲۹۹۴a(decor, event)) {
            return true;
        }
        return event.dispatch(dialog, decor != null ? decor.getKeyDispatcherState() : null, dialog);
    }
}
