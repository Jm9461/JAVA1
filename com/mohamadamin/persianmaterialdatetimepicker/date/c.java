package com.mohamadamin.persianmaterialdatetimepicker.date;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.mohamadamin.persianmaterialdatetimepicker.date.b;
import com.mohamadamin.persianmaterialdatetimepicker.date.d;
import com.mohamadamin.persianmaterialdatetimepicker.i;

public abstract class c extends ListView implements AbsListView.OnScrollListener, b.c {
    public static int m = -1;

    /* renamed from: c  reason: collision with root package name */
    protected float f۳۳۲۸c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    protected Handler f۳۳۲۹d;

    /* renamed from: e  reason: collision with root package name */
    protected d.a f۳۳۳۰e = new d.a();

    /* renamed from: f  reason: collision with root package name */
    protected d f۳۳۳۱f;

    /* renamed from: g  reason: collision with root package name */
    protected d.a f۳۳۳۲g = new d.a();

    /* renamed from: h  reason: collision with root package name */
    protected int f۳۳۳۳h = 0;
    protected int i = 0;
    private a j;
    private boolean k;
    protected b l = new b();

    public abstract d a(Context context, a aVar);

    public c(Context context, a controller) {
        super(context);
        a(context);
        setController(controller);
    }

    public void setController(a controller) {
        this.j = controller;
        this.j.a(this);
        b();
        a();
    }

    public void a(Context context) {
        this.f۳۳۲۹d = new Handler();
        setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        setDrawSelectorOnTop(false);
        c();
    }

    /* access modifiers changed from: protected */
    public void b() {
        d dVar = this.f۳۳۳۱f;
        if (dVar == null) {
            this.f۳۳۳۱f = a(getContext(), this.j);
        } else {
            dVar.b(this.f۳۳۳۰e);
        }
        setAdapter((ListAdapter) this.f۳۳۳۱f);
    }

    /* access modifiers changed from: protected */
    public void c() {
        setCacheColorHint(0);
        setDivider(null);
        setItemsCanFocus(true);
        setFastScrollEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOnScrollListener(this);
        setFadingEdgeLength(0);
        setFriction(ViewConfiguration.getScrollFriction() * this.f۳۳۲۸c);
    }

    public boolean a(d.a day, boolean animate, boolean setSelected, boolean forceScroll) {
        View child;
        int selectedPosition;
        if (setSelected) {
            this.f۳۳۳۰e.a(day);
        }
        this.f۳۳۳۲g.a(day);
        int position = ((day.f۳۳۴۲b - this.j.a()) * 12) + day.f۳۳۴۳c;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            child = getChildAt(i2);
            if (child == null) {
                break;
            }
            int top = child.getTop();
            if (Log.isLoggable("MonthFragment", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("child at ");
                sb.append(i3 - 1);
                sb.append(" has top ");
                sb.append(top);
                Log.d("MonthFragment", sb.toString());
            }
            if (top >= 0) {
                break;
            }
            i2 = i3;
        }
        if (child != null) {
            selectedPosition = getPositionForView(child);
        } else {
            selectedPosition = 0;
        }
        if (setSelected) {
            this.f۳۳۳۱f.b(this.f۳۳۳۰e);
        }
        if (Log.isLoggable("MonthFragment", 3)) {
            Log.d("MonthFragment", "GoTo position " + position);
        }
        if (position != selectedPosition || forceScroll) {
            setMonthDisplayed(this.f۳۳۳۲g);
            this.f۳۳۳۳h = 2;
            if (animate) {
                smoothScrollToPositionFromTop(position, m, 250);
                return true;
            }
            a(position);
            return false;
        } else if (!setSelected) {
            return false;
        } else {
            setMonthDisplayed(this.f۳۳۳۰e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f۳۳۳۴c;

        a(int i) {
            this.f۳۳۳۴c = i;
        }

        public void run() {
            c.this.setSelection(this.f۳۳۳۴c);
        }
    }

    public void a(int position) {
        clearFocus();
        post(new a(position));
        onScrollStateChanged(this, 0);
    }

    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        e child = (e) view.getChildAt(0);
        if (child != null) {
            long firstVisiblePosition = (long) ((view.getFirstVisiblePosition() * child.getHeight()) - child.getBottom());
            this.f۳۳۳۳h = this.i;
        }
    }

    /* access modifiers changed from: protected */
    public void setMonthDisplayed(d.a date) {
        int i2 = date.f۳۳۴۳c;
        invalidateViews();
    }

    public void onScrollStateChanged(AbsListView view, int scrollState) {
        this.l.a(view, scrollState);
    }

    /* access modifiers changed from: protected */
    public class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        private int f۳۳۳۶c;

        protected b() {
        }

        public void a(AbsListView view, int scrollState) {
            c.this.f۳۳۲۹d.removeCallbacks(this);
            this.f۳۳۳۶c = scrollState;
            c.this.f۳۳۲۹d.postDelayed(this, 40);
        }

        public void run() {
            c cVar;
            int i;
            c.this.i = this.f۳۳۳۶c;
            if (Log.isLoggable("MonthFragment", 3)) {
                Log.d("MonthFragment", "new scroll state: " + this.f۳۳۳۶c + " old state: " + c.this.f۳۳۳۳h);
            }
            int i2 = this.f۳۳۳۶c;
            if (i2 == 0 && (i = (cVar = c.this).f۳۳۳۳h) != 0) {
                boolean scroll = true;
                if (i != 1) {
                    cVar.f۳۳۳۳h = i2;
                    int i3 = 0;
                    View child = cVar.getChildAt(0);
                    while (child != null && child.getBottom() <= 0) {
                        i3++;
                        child = c.this.getChildAt(i3);
                    }
                    if (child != null) {
                        int firstPosition = c.this.getFirstVisiblePosition();
                        int lastPosition = c.this.getLastVisiblePosition();
                        if (firstPosition == 0 || lastPosition == c.this.getCount() - 1) {
                            scroll = false;
                        }
                        int top = child.getTop();
                        int bottom = child.getBottom();
                        int midpoint = c.this.getHeight() / 2;
                        if (scroll && top < c.m) {
                            if (bottom > midpoint) {
                                c.this.smoothScrollBy(top, 250);
                                return;
                            } else {
                                c.this.smoothScrollBy(bottom, 250);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            c.this.f۳۳۳۳h = this.f۳۳۳۶c;
        }
    }

    public int getMostVisiblePosition() {
        int firstPosition = getFirstVisiblePosition();
        int height = getHeight();
        int maxDisplayedHeight = 0;
        int mostVisibleIndex = 0;
        int i2 = 0;
        int bottom = 0;
        while (bottom < height) {
            View child = getChildAt(i2);
            if (child == null) {
                break;
            }
            bottom = child.getBottom();
            int displayedHeight = Math.min(bottom, height) - Math.max(0, child.getTop());
            if (displayedHeight > maxDisplayedHeight) {
                mostVisibleIndex = i2;
                maxDisplayedHeight = displayedHeight;
            }
            i2++;
        }
        return firstPosition + mostVisibleIndex;
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.b.c
    public void a() {
        a(this.j.e(), false, true, true);
    }

    private d.a d() {
        d.a focus;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = getChildAt(i2);
            if ((child instanceof e) && (focus = ((e) child).getAccessibilityFocus()) != null) {
                if (Build.VERSION.SDK_INT == 17) {
                    ((e) child).a();
                }
                return focus;
            }
        }
        return null;
    }

    private boolean b(d.a day) {
        if (day == null) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = getChildAt(i2);
            if ((child instanceof e) && ((e) child).a(day)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void layoutChildren() {
        d.a focusedDay = d();
        super.layoutChildren();
        if (this.k) {
            this.k = false;
        } else {
            b(focusedDay);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setItemCount(-1);
    }

    private static String a(d.a day) {
        com.mohamadamin.persianmaterialdatetimepicker.j.b mPersianCalendar = new com.mohamadamin.persianmaterialdatetimepicker.j.b();
        mPersianCalendar.a(day.f۳۳۴۲b, day.f۳۳۴۳c, day.f۳۳۴۴d);
        return (("" + mPersianCalendar.e()) + " ") + mPersianCalendar.h();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info2) {
        super.onInitializeAccessibilityNodeInfo(info2);
        if (Build.VERSION.SDK_INT >= 21) {
            info2.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            info2.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            return;
        }
        info2.addAction(4096);
        info2.addAction(8192);
    }

    @SuppressLint({"NewApi"})
    public boolean performAccessibilityAction(int action, Bundle arguments) {
        View firstVisibleView;
        if (action != 4096 && action != 8192) {
            return super.performAccessibilityAction(action, arguments);
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        d.a day = new d.a((firstVisiblePosition / 12) + this.j.a(), firstVisiblePosition % 12, 1);
        if (action == 4096) {
            day.f۳۳۴۳c++;
            if (day.f۳۳۴۳c == 12) {
                day.f۳۳۴۳c = 0;
                day.f۳۳۴۲b++;
            }
        } else if (action == 8192 && (firstVisibleView = getChildAt(0)) != null && firstVisibleView.getTop() >= -1) {
            day.f۳۳۴۳c--;
            if (day.f۳۳۴۳c == -1) {
                day.f۳۳۴۳c = 11;
                day.f۳۳۴۲b--;
            }
        }
        i.a(this, com.mohamadamin.persianmaterialdatetimepicker.j.a.b(a(day)));
        a(day, true, false, true);
        this.k = true;
        return true;
    }
}
