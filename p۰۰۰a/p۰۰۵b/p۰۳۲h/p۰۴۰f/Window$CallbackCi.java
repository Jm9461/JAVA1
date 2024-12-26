package p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: a.b.h.f.i  reason: invalid class name */
public class Window$CallbackCi implements Window.Callback {

    /* renamed from: c  reason: contains not printable characters */
    final Window.Callback f۸۹۴۸c;

    public Window$CallbackCi(Window.Callback wrapped) {
        if (wrapped != null) {
            this.f۸۹۴۸c = wrapped;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return this.f۸۹۴۸c.dispatchKeyEvent(event);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        return this.f۸۹۴۸c.dispatchKeyShortcutEvent(event);
    }

    public boolean dispatchTouchEvent(MotionEvent event) {
        return this.f۸۹۴۸c.dispatchTouchEvent(event);
    }

    public boolean dispatchTrackballEvent(MotionEvent event) {
        return this.f۸۹۴۸c.dispatchTrackballEvent(event);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        return this.f۸۹۴۸c.dispatchGenericMotionEvent(event);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return this.f۸۹۴۸c.dispatchPopulateAccessibilityEvent(event);
    }

    public View onCreatePanelView(int featureId) {
        return this.f۸۹۴۸c.onCreatePanelView(featureId);
    }

    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        return this.f۸۹۴۸c.onCreatePanelMenu(featureId, menu);
    }

    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        return this.f۸۹۴۸c.onPreparePanel(featureId, view, menu);
    }

    public boolean onMenuOpened(int featureId, Menu menu) {
        return this.f۸۹۴۸c.onMenuOpened(featureId, menu);
    }

    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        return this.f۸۹۴۸c.onMenuItemSelected(featureId, item);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams attrs) {
        this.f۸۹۴۸c.onWindowAttributesChanged(attrs);
    }

    public void onContentChanged() {
        this.f۸۹۴۸c.onContentChanged();
    }

    public void onWindowFocusChanged(boolean hasFocus) {
        this.f۸۹۴۸c.onWindowFocusChanged(hasFocus);
    }

    public void onAttachedToWindow() {
        this.f۸۹۴۸c.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f۸۹۴۸c.onDetachedFromWindow();
    }

    public void onPanelClosed(int featureId, Menu menu) {
        this.f۸۹۴۸c.onPanelClosed(featureId, menu);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f۸۹۴۸c.onSearchRequested(searchEvent);
    }

    public boolean onSearchRequested() {
        return this.f۸۹۴۸c.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f۸۹۴۸c.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
        return this.f۸۹۴۸c.onWindowStartingActionMode(callback, type);
    }

    public void onActionModeStarted(ActionMode mode) {
        this.f۸۹۴۸c.onActionModeStarted(mode);
    }

    public void onActionModeFinished(ActionMode mode) {
        this.f۸۹۴۸c.onActionModeFinished(mode);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId) {
        this.f۸۹۴۸c.onProvideKeyboardShortcuts(data, menu, deviceId);
    }

    public void onPointerCaptureChanged(boolean hasCapture) {
        this.f۸۹۴۸c.onPointerCaptureChanged(hasCapture);
    }
}
