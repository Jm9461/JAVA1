package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p۰۴۳v4.view.Cy;
import android.support.p۰۴۳v4.widget.Cl;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cc;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.i0  reason: invalid class name */
public class Ci0 extends ListView {

    /* renamed from: c  reason: contains not printable characters */
    private final Rect f۱۲۰۸۵c = new Rect();

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۲۰۸۶d = 0;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۲۰۸۷e = 0;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۲۰۸۸f = 0;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۲۰۸۹g = 0;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۲۰۹۰h;

    /* renamed from: i  reason: contains not printable characters */
    private Field f۱۲۰۹۱i;

    /* renamed from: j  reason: contains not printable characters */
    private Ca f۱۲۰۹۲j;

    /* renamed from: k  reason: contains not printable characters */
    private boolean f۱۲۰۹۳k;

    /* renamed from: l  reason: contains not printable characters */
    private boolean f۱۲۰۹۴l;

    /* renamed from: m  reason: contains not printable characters */
    private boolean f۱۲۰۹۵m;

    /* renamed from: n  reason: contains not printable characters */
    private Cy f۱۲۰۹۶n;

    /* renamed from: o  reason: contains not printable characters */
    private Cl f۱۲۰۹۷o;

    /* renamed from: p  reason: contains not printable characters */
    RunnableCb f۱۲۰۹۸p;

    Ci0(Context context, boolean hijackFocus) {
        super(context, null, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.dropDownListViewStyle);
        this.f۱۲۰۹۴l = hijackFocus;
        setCacheColorHint(0);
        try {
            this.f۱۲۰۹۱i = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f۱۲۰۹۱i.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public boolean isInTouchMode() {
        return (this.f۱۲۰۹۴l && this.f۱۲۰۹۳k) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.f۱۲۰۹۴l || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f۱۲۰۹۴l || super.isFocused();
    }

    public boolean hasFocus() {
        return this.f۱۲۰۹۴l || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable sel) {
        this.f۱۲۰۹۲j = sel != null ? new Ca(sel) : null;
        super.setSelector(this.f۱۲۰۹۲j);
        Rect padding = new Rect();
        if (sel != null) {
            sel.getPadding(padding);
        }
        this.f۱۲۰۸۶d = padding.left;
        this.f۱۲۰۸۷e = padding.top;
        this.f۱۲۰۸۸f = padding.right;
        this.f۱۲۰۸۹g = padding.bottom;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f۱۲۰۹۸p == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m۱۵۲۷۵c();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m۱۵۲۷۰a(canvas);
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getAction() == 0) {
            this.f۱۲۰۹۰h = pointToPosition((int) ev.getX(), (int) ev.getY());
        }
        RunnableCb bVar = this.f۱۲۰۹۸p;
        if (bVar != null) {
            bVar.m۱۵۲۷۹a();
        }
        return super.onTouchEvent(ev);
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۵۲۷۶a(int widthMeasureSpec, int startPosition, int endPosition, int maxHeight, int disallowPartialChildPosition) {
        ViewGroup.LayoutParams childLp;
        int heightMeasureSpec;
        int paddingTop = getListPaddingTop();
        int paddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int reportedDividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return paddingTop + paddingBottom;
        }
        int returnedHeight = paddingTop + paddingBottom;
        int dividerHeight = (reportedDividerHeight <= 0 || divider == null) ? 0 : reportedDividerHeight;
        View child = null;
        int count = adapter.getCount();
        int viewType = 0;
        int prevHeightWithoutPartialChild = 0;
        int returnedHeight2 = returnedHeight;
        int i = 0;
        while (i < count) {
            int newType = adapter.getItemViewType(i);
            if (newType != viewType) {
                child = null;
                viewType = newType;
            }
            child = adapter.getView(i, child, this);
            ViewGroup.LayoutParams childLp2 = child.getLayoutParams();
            if (childLp2 == null) {
                childLp = generateDefaultLayoutParams();
                child.setLayoutParams(childLp);
            } else {
                childLp = childLp2;
            }
            int paddingBottom2 = childLp.height;
            if (paddingBottom2 > 0) {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingBottom2, 1073741824);
            } else {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            child.measure(widthMeasureSpec, heightMeasureSpec);
            child.forceLayout();
            if (i > 0) {
                returnedHeight2 += dividerHeight;
            }
            returnedHeight2 += child.getMeasuredHeight();
            if (returnedHeight2 >= maxHeight) {
                return (disallowPartialChildPosition < 0 || i <= disallowPartialChildPosition || prevHeightWithoutPartialChild <= 0 || returnedHeight2 == maxHeight) ? maxHeight : prevHeightWithoutPartialChild;
            }
            if (disallowPartialChildPosition >= 0 && i >= disallowPartialChildPosition) {
                prevHeightWithoutPartialChild = returnedHeight2;
            }
            i++;
            paddingTop = paddingTop;
            paddingBottom = paddingBottom;
        }
        return returnedHeight2;
    }

    private void setSelectorEnabled(boolean enabled) {
        Ca aVar = this.f۱۲۰۹۲j;
        if (aVar != null) {
            aVar.m۱۵۲۷۸a(enabled);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.i0$a  reason: invalid class name */
    public static class Ca extends Cc {

        /* renamed from: d  reason: contains not printable characters */
        private boolean f۱۲۰۹۹d = true;

        Ca(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۲۷۸a(boolean enabled) {
            this.f۱۲۰۹۹d = enabled;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cc
        public boolean setState(int[] stateSet) {
            if (this.f۱۲۰۹۹d) {
                return super.setState(stateSet);
            }
            return false;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cc
        public void draw(Canvas canvas) {
            if (this.f۱۲۰۹۹d) {
                super.draw(canvas);
            }
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cc
        public void setHotspot(float x, float y) {
            if (this.f۱۲۰۹۹d) {
                super.setHotspot(x, y);
            }
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cc
        public void setHotspotBounds(int left, int top, int right, int bottom) {
            if (this.f۱۲۰۹۹d) {
                super.setHotspotBounds(left, top, right, bottom);
            }
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cc
        public boolean setVisible(boolean visible, boolean restart) {
            if (this.f۱۲۰۹۹d) {
                return super.setVisible(visible, restart);
            }
            return false;
        }
    }

    public boolean onHoverEvent(MotionEvent ev) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(ev);
        }
        int action = ev.getActionMasked();
        if (action == 10 && this.f۱۲۰۹۸p == null) {
            this.f۱۲۰۹۸p = new RunnableCb();
            this.f۱۲۰۹۸p.m۱۵۲۸۰b();
        }
        boolean handled = super.onHoverEvent(ev);
        if (action == 9 || action == 7) {
            int position = pointToPosition((int) ev.getX(), (int) ev.getY());
            if (!(position == -1 || position == getSelectedItemPosition())) {
                View hoveredItem = getChildAt(position - getFirstVisiblePosition());
                if (hoveredItem.isEnabled()) {
                    setSelectionFromTop(position, hoveredItem.getTop() - getTop());
                }
                m۱۵۲۷۵c();
            }
        } else {
            setSelection(-1);
        }
        return handled;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f۱۲۰۹۸p = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m۱۵۲۷۷a(android.view.MotionEvent r12, int r13) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۷v7.widget.Ci0.m۱۵۲۷۷a(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۲۷۱a(View child, int position) {
        performItemClick(child, position, getItemIdAtPosition(position));
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean hideListSelection) {
        this.f۱۲۰۹۳k = hideListSelection;
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۵۲۷۵c() {
        Drawable selector = getSelector();
        if (selector != null && m۱۵۲۷۴b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۲۷۰a(Canvas canvas) {
        Drawable selector;
        if (!this.f۱۲۰۸۵c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f۱۲۰۸۵c);
            selector.draw(canvas);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۲۶۹a(int position, View sel, float x, float y) {
        m۱۵۲۷۳b(position, sel);
        Drawable selector = getSelector();
        if (selector != null && position != -1) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۶a(selector, x, y);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۵۲۷۳b(int position, View sel) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean manageState = (selector == null || position == -1) ? false : true;
        if (manageState) {
            selector.setVisible(false, false);
        }
        m۱۵۲۶۸a(position, sel);
        if (manageState) {
            Rect bounds = this.f۱۲۰۸۵c;
            float x = bounds.exactCenterX();
            float y = bounds.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۶a(selector, x, y);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۲۶۸a(int position, View sel) {
        Rect selectorRect = this.f۱۲۰۸۵c;
        selectorRect.set(sel.getLeft(), sel.getTop(), sel.getRight(), sel.getBottom());
        selectorRect.left -= this.f۱۲۰۸۶d;
        selectorRect.top -= this.f۱۲۰۸۷e;
        selectorRect.right += this.f۱۲۰۸۸f;
        selectorRect.bottom += this.f۱۲۰۸۹g;
        try {
            boolean isChildViewEnabled = this.f۱۲۰۹۱i.getBoolean(this);
            if (sel.isEnabled() != isChildViewEnabled) {
                this.f۱۲۰۹۱i.set(this, Boolean.valueOf(!isChildViewEnabled));
                if (position != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۲۶۷a() {
        this.f۱۲۰۹۵m = false;
        setPressed(false);
        drawableStateChanged();
        View motionView = getChildAt(this.f۱۲۰۹۰h - getFirstVisiblePosition());
        if (motionView != null) {
            motionView.setPressed(false);
        }
        Cy yVar = this.f۱۲۰۹۶n;
        if (yVar != null) {
            yVar.m۱۳۰۵۸a();
            this.f۱۲۰۹۶n = null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۲۷۲a(View child, int position, float x, float y) {
        View motionView;
        this.f۱۲۰۹۵m = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(x, y);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i = this.f۱۲۰۹۰h;
        if (!(i == -1 || (motionView = getChildAt(i - getFirstVisiblePosition())) == null || motionView == child || !motionView.isPressed())) {
            motionView.setPressed(false);
        }
        this.f۱۲۰۹۰h = position;
        float childX = x - ((float) child.getLeft());
        float childY = y - ((float) child.getTop());
        if (Build.VERSION.SDK_INT >= 21) {
            child.drawableHotspotChanged(childX, childY);
        }
        if (!child.isPressed()) {
            child.setPressed(true);
        }
        m۱۵۲۶۹a(position, child, x, y);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۵۲۷۴b() {
        return this.f۱۲۰۹۵m;
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.i0$b  reason: invalid class name */
    public class RunnableCb implements Runnable {
        RunnableCb() {
        }

        public void run() {
            Ci0 i0Var = Ci0.this;
            i0Var.f۱۲۰۹۸p = null;
            i0Var.drawableStateChanged();
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۲۷۹a() {
            Ci0 i0Var = Ci0.this;
            i0Var.f۱۲۰۹۸p = null;
            i0Var.removeCallbacks(this);
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۵۲۸۰b() {
            Ci0.this.post(this);
        }
    }
}
