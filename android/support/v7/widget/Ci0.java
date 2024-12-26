package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.Cy;
import android.support.v4.widget.Cl;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cc;

/* renamed from: android.support.v7.widget.i0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ci0 extends ListView {

    /* renamed from: c, reason: contains not printable characters */
    private final Rect f۱۲۰۸۵c;

    /* renamed from: d, reason: contains not printable characters */
    private int f۱۲۰۸۶d;

    /* renamed from: e, reason: contains not printable characters */
    private int f۱۲۰۸۷e;

    /* renamed from: f, reason: contains not printable characters */
    private int f۱۲۰۸۸f;

    /* renamed from: g, reason: contains not printable characters */
    private int f۱۲۰۸۹g;

    /* renamed from: h, reason: contains not printable characters */
    private int f۱۲۰۹۰h;

    /* renamed from: i, reason: contains not printable characters */
    private Field f۱۲۰۹۱i;

    /* renamed from: j, reason: contains not printable characters */
    private a f۱۲۰۹۲j;

    /* renamed from: k, reason: contains not printable characters */
    private boolean f۱۲۰۹۳k;

    /* renamed from: l, reason: contains not printable characters */
    private boolean f۱۲۰۹۴l;

    /* renamed from: m, reason: contains not printable characters */
    private boolean f۱۲۰۹۵m;

    /* renamed from: n, reason: contains not printable characters */
    private Cy f۱۲۰۹۶n;

    /* renamed from: o, reason: contains not printable characters */
    private Cl f۱۲۰۹۷o;

    /* renamed from: p, reason: contains not printable characters */
    b f۱۲۰۹۸p;

    Ci0(Context context, boolean hijackFocus) {
        super(context, null, Ca.dropDownListViewStyle);
        this.f۱۲۰۸۵c = new Rect();
        this.f۱۲۰۸۶d = 0;
        this.f۱۲۰۸۷e = 0;
        this.f۱۲۰۸۸f = 0;
        this.f۱۲۰۸۹g = 0;
        this.f۱۲۰۹۴l = hijackFocus;
        setCacheColorHint(0);
        try {
            this.f۱۲۰۹۱i = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f۱۲۰۹۱i.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f۱۲۰۹۴l && this.f۱۲۰۹۳k) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f۱۲۰۹۴l || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f۱۲۰۹۴l || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f۱۲۰۹۴l || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable sel) {
        this.f۱۲۰۹۲j = sel != null ? new a(sel) : null;
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

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f۱۲۰۹۸p != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m۱۳۲۰۵c();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m۱۳۲۰۰a(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getAction() == 0) {
            this.f۱۲۰۹۰h = pointToPosition((int) ev.getX(), (int) ev.getY());
        }
        b bVar = this.f۱۲۰۹۸p;
        if (bVar != null) {
            bVar.m۱۳۲۰۹a();
        }
        return super.onTouchEvent(ev);
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۱۳۲۰۶a(int widthMeasureSpec, int startPosition, int endPosition, int maxHeight, int disallowPartialChildPosition) {
        ViewGroup.LayoutParams childLp;
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
        int returnedHeight3 = 0;
        while (returnedHeight3 < count) {
            int paddingTop2 = paddingTop;
            int newType = adapter.getItemViewType(returnedHeight3);
            if (newType != viewType) {
                child = null;
                viewType = newType;
            }
            child = adapter.getView(returnedHeight3, child, this);
            ViewGroup.LayoutParams childLp2 = child.getLayoutParams();
            if (childLp2 != null) {
                childLp = childLp2;
            } else {
                childLp = generateDefaultLayoutParams();
                child.setLayoutParams(childLp);
            }
            int paddingBottom2 = paddingBottom;
            int paddingBottom3 = childLp.height;
            int heightMeasureSpec = paddingBottom3 > 0 ? View.MeasureSpec.makeMeasureSpec(paddingBottom3, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0);
            child.measure(widthMeasureSpec, heightMeasureSpec);
            child.forceLayout();
            if (returnedHeight3 > 0) {
                returnedHeight2 += dividerHeight;
            }
            returnedHeight2 += child.getMeasuredHeight();
            if (returnedHeight2 >= maxHeight) {
                return (disallowPartialChildPosition < 0 || returnedHeight3 <= disallowPartialChildPosition || prevHeightWithoutPartialChild <= 0 || returnedHeight2 == maxHeight) ? maxHeight : prevHeightWithoutPartialChild;
            }
            if (disallowPartialChildPosition >= 0 && returnedHeight3 >= disallowPartialChildPosition) {
                prevHeightWithoutPartialChild = returnedHeight2;
            }
            returnedHeight3++;
            paddingTop = paddingTop2;
            paddingBottom = paddingBottom2;
        }
        return returnedHeight2;
    }

    private void setSelectorEnabled(boolean enabled) {
        a aVar = this.f۱۲۰۹۲j;
        if (aVar != null) {
            aVar.m۱۳۲۰۸a(enabled);
        }
    }

    /* renamed from: android.support.v7.widget.i0$a */
    private static class a extends Cc {

        /* renamed from: d, reason: contains not printable characters */
        private boolean f۱۲۰۹۹d;

        a(Drawable drawable) {
            super(drawable);
            this.f۱۲۰۹۹d = true;
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۳۲۰۸a(boolean enabled) {
            this.f۱۲۰۹۹d = enabled;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cc, android.graphics.drawable.Drawable
        public boolean setState(int[] stateSet) {
            if (this.f۱۲۰۹۹d) {
                return super.setState(stateSet);
            }
            return false;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cc, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f۱۲۰۹۹d) {
                super.draw(canvas);
            }
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cc, android.graphics.drawable.Drawable
        public void setHotspot(float x, float y) {
            if (this.f۱۲۰۹۹d) {
                super.setHotspot(x, y);
            }
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cc, android.graphics.drawable.Drawable
        public void setHotspotBounds(int left, int top, int right, int bottom) {
            if (this.f۱۲۰۹۹d) {
                super.setHotspotBounds(left, top, right, bottom);
            }
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cc, android.graphics.drawable.Drawable
        public boolean setVisible(boolean visible, boolean restart) {
            if (this.f۱۲۰۹۹d) {
                return super.setVisible(visible, restart);
            }
            return false;
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent ev) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(ev);
        }
        int action = ev.getActionMasked();
        if (action == 10 && this.f۱۲۰۹۸p == null) {
            this.f۱۲۰۹۸p = new b();
            this.f۱۲۰۹۸p.m۱۳۲۱۰b();
        }
        boolean handled = super.onHoverEvent(ev);
        if (action == 9 || action == 7) {
            int position = pointToPosition((int) ev.getX(), (int) ev.getY());
            if (position != -1 && position != getSelectedItemPosition()) {
                View hoveredItem = getChildAt(position - getFirstVisiblePosition());
                if (hoveredItem.isEnabled()) {
                    setSelectionFromTop(position, hoveredItem.getTop() - getTop());
                }
                m۱۳۲۰۵c();
            }
        } else {
            setSelection(-1);
        }
        return handled;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f۱۲۰۹۸p = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m۱۳۲۰۷a(android.view.MotionEvent r12, int r13) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            int r2 = r12.getActionMasked()
            r3 = 1
            if (r2 == r3) goto L12
            r4 = 2
            if (r2 == r4) goto L13
            r4 = 3
            if (r2 == r4) goto L10
            goto L43
        L10:
            r0 = 0
            goto L43
        L12:
            r0 = 0
        L13:
            int r4 = r12.findPointerIndex(r13)
            if (r4 >= 0) goto L1b
            r0 = 0
            goto L43
        L1b:
            float r5 = r12.getX(r4)
            int r5 = (int) r5
            float r6 = r12.getY(r4)
            int r6 = (int) r6
            int r7 = r11.pointToPosition(r5, r6)
            r8 = -1
            if (r7 != r8) goto L2e
            r1 = 1
            goto L43
        L2e:
            int r8 = r11.getFirstVisiblePosition()
            int r8 = r7 - r8
            android.view.View r8 = r11.getChildAt(r8)
            float r9 = (float) r5
            float r10 = (float) r6
            r11.m۱۳۲۰۲a(r8, r7, r9, r10)
            r0 = 1
            if (r2 != r3) goto L43
            r11.m۱۳۲۰۱a(r8, r7)
        L43:
            if (r0 == 0) goto L47
            if (r1 == 0) goto L4a
        L47:
            r11.m۱۳۱۹۷a()
        L4a:
            if (r0 == 0) goto L62
            android.support.v4.widget.l r4 = r11.f۱۲۰۹۷o
            if (r4 != 0) goto L57
            android.support.v4.widget.l r4 = new android.support.v4.widget.l
            r4.<init>(r11)
            r11.f۱۲۰۹۷o = r4
        L57:
            android.support.v4.widget.l r4 = r11.f۱۲۰۹۷o
            r4.m۱۱۱۲۵a(r3)
            android.support.v4.widget.l r3 = r11.f۱۲۰۹۷o
            r3.onTouch(r11, r12)
            goto L6a
        L62:
            android.support.v4.widget.l r3 = r11.f۱۲۰۹۷o
            if (r3 == 0) goto L6a
            r4 = 0
            r3.m۱۱۱۲۵a(r4)
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Ci0.m۱۳۲۰۷a(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۲۰۱a(View child, int position) {
        long id = getItemIdAtPosition(position);
        performItemClick(child, position, id);
    }

    void setListSelectionHidden(boolean hideListSelection) {
        this.f۱۲۰۹۳k = hideListSelection;
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۳۲۰۵c() {
        Drawable selector = getSelector();
        if (selector != null && m۱۳۲۰۴b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۲۰۰a(Canvas canvas) {
        Drawable selector;
        if (!this.f۱۲۰۸۵c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f۱۲۰۸۵c);
            selector.draw(canvas);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۱۹۹a(int position, View sel, float x, float y) {
        m۱۳۲۰۳b(position, sel);
        Drawable selector = getSelector();
        if (selector != null && position != -1) {
            android.support.v4.graphics.drawable.Ca.m۱۰۶۳۶a(selector, x, y);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۳۲۰۳b(int position, View sel) {
        Drawable selector = getSelector();
        boolean manageState = (selector == null || position == -1) ? false : true;
        if (manageState) {
            selector.setVisible(false, false);
        }
        m۱۳۱۹۸a(position, sel);
        if (manageState) {
            Rect bounds = this.f۱۲۰۸۵c;
            float x = bounds.exactCenterX();
            float y = bounds.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            android.support.v4.graphics.drawable.Ca.m۱۰۶۳۶a(selector, x, y);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۱۹۸a(int position, View sel) {
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
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۱۹۷a() {
        this.f۱۲۰۹۵m = false;
        setPressed(false);
        drawableStateChanged();
        View motionView = getChildAt(this.f۱۲۰۹۰h - getFirstVisiblePosition());
        if (motionView != null) {
            motionView.setPressed(false);
        }
        Cy cy = this.f۱۲۰۹۶n;
        if (cy != null) {
            cy.m۱۰۹۸۸a();
            this.f۱۲۰۹۶n = null;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۲۰۲a(View child, int position, float x, float y) {
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
        if (i != -1 && (motionView = getChildAt(i - getFirstVisiblePosition())) != null && motionView != child && motionView.isPressed()) {
            motionView.setPressed(false);
        }
        this.f۱۲۰۹۰h = position;
        float childX = x - child.getLeft();
        float childY = y - child.getTop();
        if (Build.VERSION.SDK_INT >= 21) {
            child.drawableHotspotChanged(childX, childY);
        }
        if (!child.isPressed()) {
            child.setPressed(true);
        }
        m۱۳۱۹۹a(position, child, x, y);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۱۳۲۰۴b() {
        return this.f۱۲۰۹۵m;
    }

    /* renamed from: android.support.v7.widget.i0$b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Ci0 ci0 = Ci0.this;
            ci0.f۱۲۰۹۸p = null;
            ci0.drawableStateChanged();
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۱۳۲۰۹a() {
            Ci0 ci0 = Ci0.this;
            ci0.f۱۲۰۹۸p = null;
            ci0.removeCallbacks(this);
        }

        /* renamed from: b, reason: contains not printable characters */
        public void m۱۳۲۱۰b() {
            Ci0.this.post(this);
        }
    }
}
