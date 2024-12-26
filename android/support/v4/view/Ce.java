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

/* renamed from: android.support.v4.view.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ce {

    /* renamed from: a, reason: contains not printable characters */
    private static boolean f۱۰۶۰۱a = false;

    /* renamed from: b, reason: contains not printable characters */
    private static Method f۱۰۶۰۲b = null;

    /* renamed from: c, reason: contains not printable characters */
    private static boolean f۱۰۶۰۳c = false;

    /* renamed from: d, reason: contains not printable characters */
    private static Field f۱۰۶۰۴d = null;

    /* renamed from: android.support.v4.view.e$a */
    public interface a {
        /* renamed from: a, reason: contains not printable characters */
        boolean mo۱۱۵۶۲a(KeyEvent keyEvent);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۰۸۳۸a(View root, KeyEvent event) {
        return Cu.m۱۰۹۲۹b(root, event);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۰۸۳۷a(a component, View root, Window.Callback callback, KeyEvent event) {
        if (component == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return component.mo۱۱۵۶۲a(event);
        }
        if (callback instanceof Activity) {
            return m۱۰۸۳۵a((Activity) callback, event);
        }
        if (callback instanceof Dialog) {
            return m۱۰۸۳۶a((Dialog) callback, event);
        }
        return (root != null && Cu.m۱۰۹۲۴a(root, event)) || component.mo۱۱۵۶۲a(event);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۱۰۸۳۴a(ActionBar actionBar, KeyEvent event) {
        if (!f۱۰۶۰۱a) {
            try {
                f۱۰۶۰۲b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException e2) {
            }
            f۱۰۶۰۱a = true;
        }
        Method method = f۱۰۶۰۲b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, event)).booleanValue();
            } catch (IllegalAccessException e3) {
            } catch (InvocationTargetException e4) {
            }
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۱۰۸۳۵a(Activity activity, KeyEvent event) {
        activity.onUserInteraction();
        Window win = activity.getWindow();
        if (win.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            int keyCode = event.getKeyCode();
            if (keyCode == 82 && actionBar != null && m۱۰۸۳۴a(actionBar, event)) {
                return true;
            }
        }
        if (win.superDispatchKeyEvent(event)) {
            return true;
        }
        View decor = win.getDecorView();
        if (Cu.m۱۰۹۲۴a(decor, event)) {
            return true;
        }
        return event.dispatch(activity, decor != null ? decor.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static DialogInterface.OnKeyListener m۱۰۸۳۳a(Dialog dialog) {
        if (!f۱۰۶۰۳c) {
            try {
                f۱۰۶۰۴d = Dialog.class.getDeclaredField("mOnKeyListener");
                f۱۰۶۰۴d.setAccessible(true);
            } catch (NoSuchFieldException e2) {
            }
            f۱۰۶۰۳c = true;
        }
        Field field = f۱۰۶۰۴d;
        if (field != null) {
            try {
                return (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException e3) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۱۰۸۳۶a(Dialog dialog, KeyEvent event) {
        DialogInterface.OnKeyListener onKeyListener = m۱۰۸۳۳a(dialog);
        if (onKeyListener != null && onKeyListener.onKey(dialog, event.getKeyCode(), event)) {
            return true;
        }
        Window win = dialog.getWindow();
        if (win.superDispatchKeyEvent(event)) {
            return true;
        }
        View decor = win.getDecorView();
        if (Cu.m۱۰۹۲۴a(decor, event)) {
            return true;
        }
        return event.dispatch(dialog, decor != null ? decor.getKeyDispatcherState() : null, dialog);
    }
}
