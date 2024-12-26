package a.b.h.f;

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

public class i implements Window.Callback {

    /* renamed from: c  reason: collision with root package name */
    final Window.Callback f۵۰۵c;

    public i(Window.Callback wrapped) {
        if (wrapped != null) {
            this.f۵۰۵c = wrapped;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return this.f۵۰۵c.dispatchKeyEvent(event);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        return this.f۵۰۵c.dispatchKeyShortcutEvent(event);
    }

    public boolean dispatchTouchEvent(MotionEvent event) {
        return this.f۵۰۵c.dispatchTouchEvent(event);
    }

    public boolean dispatchTrackballEvent(MotionEvent event) {
        return this.f۵۰۵c.dispatchTrackballEvent(event);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        return this.f۵۰۵c.dispatchGenericMotionEvent(event);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return this.f۵۰۵c.dispatchPopulateAccessibilityEvent(event);
    }

    public View onCreatePanelView(int featureId) {
        return this.f۵۰۵c.onCreatePanelView(featureId);
    }

    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        return this.f۵۰۵c.onCreatePanelMenu(featureId, menu);
    }

    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        return this.f۵۰۵c.onPreparePanel(featureId, view, menu);
    }

    public boolean onMenuOpened(int featureId, Menu menu) {
        return this.f۵۰۵c.onMenuOpened(featureId, menu);
    }

    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        return this.f۵۰۵c.onMenuItemSelected(featureId, item);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams attrs) {
        this.f۵۰۵c.onWindowAttributesChanged(attrs);
    }

    public void onContentChanged() {
        this.f۵۰۵c.onContentChanged();
    }

    public void onWindowFocusChanged(boolean hasFocus) {
        this.f۵۰۵c.onWindowFocusChanged(hasFocus);
    }

    public void onAttachedToWindow() {
        this.f۵۰۵c.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f۵۰۵c.onDetachedFromWindow();
    }

    public void onPanelClosed(int featureId, Menu menu) {
        this.f۵۰۵c.onPanelClosed(featureId, menu);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f۵۰۵c.onSearchRequested(searchEvent);
    }

    public boolean onSearchRequested() {
        return this.f۵۰۵c.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f۵۰۵c.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
        return this.f۵۰۵c.onWindowStartingActionMode(callback, type);
    }

    public void onActionModeStarted(ActionMode mode) {
        this.f۵۰۵c.onActionModeStarted(mode);
    }

    public void onActionModeFinished(ActionMode mode) {
        this.f۵۰۵c.onActionModeFinished(mode);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId) {
        this.f۵۰۵c.onProvideKeyboardShortcuts(data, menu, deviceId);
    }

    public void onPointerCaptureChanged(boolean hasCapture) {
        this.f۵۰۵c.onPointerCaptureChanged(hasCapture);
    }
}
