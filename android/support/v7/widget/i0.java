package android.support.v7.widget;

import a.b.h.d.a.c;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.y;
import android.support.v4.widget.l;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public class i0 extends ListView {

    /* renamed from: c  reason: collision with root package name */
    private final Rect f۲۰۹۷c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private int f۲۰۹۸d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f۲۰۹۹e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f۲۱۰۰f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f۲۱۰۱g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f۲۱۰۲h;
    private Field i;
    private a j;
    private boolean k;
    private boolean l;
    private boolean m;
    private y n;
    private l o;
    b p;

    i0(Context context, boolean hijackFocus) {
        super(context, null, a.b.h.a.a.dropDownListViewStyle);
        this.l = hijackFocus;
        setCacheColorHint(0);
        try {
            this.i = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.i.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    public boolean isInTouchMode() {
        return (this.l && this.k) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.l || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.l || super.isFocused();
    }

    public boolean hasFocus() {
        return this.l || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable sel) {
        this.j = sel != null ? new a(sel) : null;
        super.setSelector(this.j);
        Rect padding = new Rect();
        if (sel != null) {
            sel.getPadding(padding);
        }
        this.f۲۰۹۸d = padding.left;
        this.f۲۰۹۹e = padding.top;
        this.f۲۱۰۰f = padding.right;
        this.f۲۱۰۱g = padding.bottom;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.p == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            c();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        a(canvas);
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getAction() == 0) {
            this.f۲۱۰۲h = pointToPosition((int) ev.getX(), (int) ev.getY());
        }
        b bVar = this.p;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(ev);
    }

    public int a(int widthMeasureSpec, int startPosition, int endPosition, int maxHeight, int disallowPartialChildPosition) {
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
        int i2 = 0;
        while (i2 < count) {
            int newType = adapter.getItemViewType(i2);
            if (newType != viewType) {
                child = null;
                viewType = newType;
            }
            child = adapter.getView(i2, child, this);
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
            if (i2 > 0) {
                returnedHeight2 += dividerHeight;
            }
            returnedHeight2 += child.getMeasuredHeight();
            if (returnedHeight2 >= maxHeight) {
                return (disallowPartialChildPosition < 0 || i2 <= disallowPartialChildPosition || prevHeightWithoutPartialChild <= 0 || returnedHeight2 == maxHeight) ? maxHeight : prevHeightWithoutPartialChild;
            }
            if (disallowPartialChildPosition >= 0 && i2 >= disallowPartialChildPosition) {
                prevHeightWithoutPartialChild = returnedHeight2;
            }
            i2++;
            paddingTop = paddingTop;
            paddingBottom = paddingBottom;
        }
        return returnedHeight2;
    }

    private void setSelectorEnabled(boolean enabled) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(enabled);
        }
    }

    /* access modifiers changed from: private */
    public static class a extends c {

        /* renamed from: d  reason: collision with root package name */
        private boolean f۲۱۰۳d = true;

        a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        public void a(boolean enabled) {
            this.f۲۱۰۳d = enabled;
        }

        @Override // a.b.h.d.a.c
        public boolean setState(int[] stateSet) {
            if (this.f۲۱۰۳d) {
                return super.setState(stateSet);
            }
            return false;
        }

        @Override // a.b.h.d.a.c
        public void draw(Canvas canvas) {
            if (this.f۲۱۰۳d) {
                super.draw(canvas);
            }
        }

        @Override // a.b.h.d.a.c
        public void setHotspot(float x, float y) {
            if (this.f۲۱۰۳d) {
                super.setHotspot(x, y);
            }
        }

        @Override // a.b.h.d.a.c
        public void setHotspotBounds(int left, int top, int right, int bottom) {
            if (this.f۲۱۰۳d) {
                super.setHotspotBounds(left, top, right, bottom);
            }
        }

        @Override // a.b.h.d.a.c
        public boolean setVisible(boolean visible, boolean restart) {
            if (this.f۲۱۰۳d) {
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
        if (action == 10 && this.p == null) {
            this.p = new b();
            this.p.b();
        }
        boolean handled = super.onHoverEvent(ev);
        if (action == 9 || action == 7) {
            int position = pointToPosition((int) ev.getX(), (int) ev.getY());
            if (!(position == -1 || position == getSelectedItemPosition())) {
                View hoveredItem = getChildAt(position - getFirstVisiblePosition());
                if (hoveredItem.isEnabled()) {
                    setSelectionFromTop(position, hoveredItem.getTop() - getTop());
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return handled;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.p = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.MotionEvent r12, int r13) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.i0.a(android.view.MotionEvent, int):boolean");
    }

    private void a(View child, int position) {
        performItemClick(child, position, getItemIdAtPosition(position));
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean hideListSelection) {
        this.k = hideListSelection;
    }

    private void c() {
        Drawable selector = getSelector();
        if (selector != null && b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void a(Canvas canvas) {
        Drawable selector;
        if (!this.f۲۰۹۷c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f۲۰۹۷c);
            selector.draw(canvas);
        }
    }

    private void a(int position, View sel, float x, float y) {
        b(position, sel);
        Drawable selector = getSelector();
        if (selector != null && position != -1) {
            android.support.v4.graphics.drawable.a.a(selector, x, y);
        }
    }

    private void b(int position, View sel) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean manageState = (selector == null || position == -1) ? false : true;
        if (manageState) {
            selector.setVisible(false, false);
        }
        a(position, sel);
        if (manageState) {
            Rect bounds = this.f۲۰۹۷c;
            float x = bounds.exactCenterX();
            float y = bounds.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            android.support.v4.graphics.drawable.a.a(selector, x, y);
        }
    }

    private void a(int position, View sel) {
        Rect selectorRect = this.f۲۰۹۷c;
        selectorRect.set(sel.getLeft(), sel.getTop(), sel.getRight(), sel.getBottom());
        selectorRect.left -= this.f۲۰۹۸d;
        selectorRect.top -= this.f۲۰۹۹e;
        selectorRect.right += this.f۲۱۰۰f;
        selectorRect.bottom += this.f۲۱۰۱g;
        try {
            boolean isChildViewEnabled = this.i.getBoolean(this);
            if (sel.isEnabled() != isChildViewEnabled) {
                this.i.set(this, Boolean.valueOf(!isChildViewEnabled));
                if (position != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    private void a() {
        this.m = false;
        setPressed(false);
        drawableStateChanged();
        View motionView = getChildAt(this.f۲۱۰۲h - getFirstVisiblePosition());
        if (motionView != null) {
            motionView.setPressed(false);
        }
        y yVar = this.n;
        if (yVar != null) {
            yVar.a();
            this.n = null;
        }
    }

    private void a(View child, int position, float x, float y) {
        View motionView;
        this.m = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(x, y);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f۲۱۰۲h;
        if (!(i2 == -1 || (motionView = getChildAt(i2 - getFirstVisiblePosition())) == null || motionView == child || !motionView.isPressed())) {
            motionView.setPressed(false);
        }
        this.f۲۱۰۲h = position;
        float childX = x - ((float) child.getLeft());
        float childY = y - ((float) child.getTop());
        if (Build.VERSION.SDK_INT >= 21) {
            child.drawableHotspotChanged(childX, childY);
        }
        if (!child.isPressed()) {
            child.setPressed(true);
        }
        a(position, child, x, y);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean b() {
        return this.m;
    }

    /* access modifiers changed from: private */
    public class b implements Runnable {
        b() {
        }

        public void run() {
            i0 i0Var = i0.this;
            i0Var.p = null;
            i0Var.drawableStateChanged();
        }

        public void a() {
            i0 i0Var = i0.this;
            i0Var.p = null;
            i0Var.removeCallbacks(this);
        }

        public void b() {
            i0.this.post(this);
        }
    }
}
