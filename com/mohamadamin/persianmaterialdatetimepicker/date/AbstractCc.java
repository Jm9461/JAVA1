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
import com.mohamadamin.persianmaterialdatetimepicker.Ci;
import com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCd;
import com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.c  reason: invalid class name */
public abstract class AbstractCc extends ListView implements AbsListView.OnScrollListener, DialogFragmentCb.AbstractCc {

    /* renamed from: m  reason: contains not printable characters */
    public static int f۱۴۸۹۷m = -1;

    /* renamed from: c  reason: contains not printable characters */
    protected float f۱۴۸۹۸c = 1.0f;

    /* renamed from: d  reason: contains not printable characters */
    protected Handler f۱۴۸۹۹d;

    /* renamed from: e  reason: contains not printable characters */
    protected AbstractCd.Ca f۱۴۹۰۰e = new AbstractCd.Ca();

    /* renamed from: f  reason: contains not printable characters */
    protected AbstractCd f۱۴۹۰۱f;

    /* renamed from: g  reason: contains not printable characters */
    protected AbstractCd.Ca f۱۴۹۰۲g = new AbstractCd.Ca();

    /* renamed from: h  reason: contains not printable characters */
    protected int f۱۴۹۰۳h = 0;

    /* renamed from: i  reason: contains not printable characters */
    protected int f۱۴۹۰۴i = 0;

    /* renamed from: j  reason: contains not printable characters */
    private AbstractCa f۱۴۹۰۵j;

    /* renamed from: k  reason: contains not printable characters */
    private boolean f۱۴۹۰۶k;

    /* renamed from: l  reason: contains not printable characters */
    protected RunnableCb f۱۴۹۰۷l = new RunnableCb();

    /* renamed from: a  reason: contains not printable characters */
    public abstract AbstractCd m۱۷۹۳۵a(Context context, AbstractCa aVar);

    public AbstractCc(Context context, AbstractCa controller) {
        super(context);
        m۱۷۹۳۸a(context);
        setController(controller);
    }

    public void setController(AbstractCa controller) {
        this.f۱۴۹۰۵j = controller;
        this.f۱۴۹۰۵j.m۱۷۸۹۹a(this);
        m۱۷۹۴۰b();
        m۱۷۹۳۶a();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۹۳۸a(Context context) {
        this.f۱۴۸۹۹d = new Handler();
        setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        setDrawSelectorOnTop(false);
        m۱۷۹۴۱c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۹۴۰b() {
        AbstractCd dVar = this.f۱۴۹۰۱f;
        if (dVar == null) {
            this.f۱۴۹۰۱f = m۱۷۹۳۵a(getContext(), this.f۱۴۹۰۵j);
        } else {
            dVar.m۱۷۹۴۸b(this.f۱۴۹۰۰e);
        }
        setAdapter((ListAdapter) this.f۱۴۹۰۱f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۷۹۴۱c() {
        setCacheColorHint(0);
        setDivider(null);
        setItemsCanFocus(true);
        setFastScrollEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOnScrollListener(this);
        setFadingEdgeLength(0);
        setFriction(ViewConfiguration.getScrollFriction() * this.f۱۴۸۹۸c);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۷۹۳۹a(AbstractCd.Ca day, boolean animate, boolean setSelected, boolean forceScroll) {
        View child;
        int selectedPosition;
        if (setSelected) {
            this.f۱۴۹۰۰e.m۱۷۹۵۱a(day);
        }
        this.f۱۴۹۰۲g.m۱۷۹۵۱a(day);
        int position = ((day.f۱۴۹۱۶b - this.f۱۴۹۰۵j.m۱۷۸۹۶a()) * 12) + day.f۱۴۹۱۷c;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            child = getChildAt(i);
            if (child == null) {
                break;
            }
            int top = child.getTop();
            if (Log.isLoggable("MonthFragment", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("child at ");
                sb.append(i2 - 1);
                sb.append(" has top ");
                sb.append(top);
                Log.d("MonthFragment", sb.toString());
            }
            if (top >= 0) {
                break;
            }
            i = i2;
        }
        if (child != null) {
            selectedPosition = getPositionForView(child);
        } else {
            selectedPosition = 0;
        }
        if (setSelected) {
            this.f۱۴۹۰۱f.m۱۷۹۴۸b(this.f۱۴۹۰۰e);
        }
        if (Log.isLoggable("MonthFragment", 3)) {
            Log.d("MonthFragment", "GoTo position " + position);
        }
        if (position != selectedPosition || forceScroll) {
            setMonthDisplayed(this.f۱۴۹۰۲g);
            this.f۱۴۹۰۳h = 2;
            if (animate) {
                smoothScrollToPositionFromTop(position, f۱۴۸۹۷m, 250);
                return true;
            }
            m۱۷۹۳۷a(position);
            return false;
        } else if (!setSelected) {
            return false;
        } else {
            setMonthDisplayed(this.f۱۴۹۰۰e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.c$a  reason: invalid class name */
    public class RunnableCa implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ int f۱۴۹۰۸c;

        RunnableCa(int i) {
            this.f۱۴۹۰۸c = i;
        }

        public void run() {
            AbstractCc.this.setSelection(this.f۱۴۹۰۸c);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۹۳۷a(int position) {
        clearFocus();
        post(new RunnableCa(position));
        onScrollStateChanged(this, 0);
    }

    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        AbstractCe child = (AbstractCe) view.getChildAt(0);
        if (child != null) {
            long firstVisiblePosition = (long) ((view.getFirstVisiblePosition() * child.getHeight()) - child.getBottom());
            this.f۱۴۹۰۳h = this.f۱۴۹۰۴i;
        }
    }

    /* access modifiers changed from: protected */
    public void setMonthDisplayed(AbstractCd.Ca date) {
        int i = date.f۱۴۹۱۷c;
        invalidateViews();
    }

    public void onScrollStateChanged(AbsListView view, int scrollState) {
        this.f۱۴۹۰۷l.m۱۷۹۴۲a(view, scrollState);
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.c$b  reason: invalid class name */
    public class RunnableCb implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        private int f۱۴۹۱۰c;

        protected RunnableCb() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۹۴۲a(AbsListView view, int scrollState) {
            AbstractCc.this.f۱۴۸۹۹d.removeCallbacks(this);
            this.f۱۴۹۱۰c = scrollState;
            AbstractCc.this.f۱۴۸۹۹d.postDelayed(this, 40);
        }

        public void run() {
            AbstractCc cVar;
            int i;
            AbstractCc.this.f۱۴۹۰۴i = this.f۱۴۹۱۰c;
            if (Log.isLoggable("MonthFragment", 3)) {
                Log.d("MonthFragment", "new scroll state: " + this.f۱۴۹۱۰c + " old state: " + AbstractCc.this.f۱۴۹۰۳h);
            }
            int i2 = this.f۱۴۹۱۰c;
            if (i2 == 0 && (i = (cVar = AbstractCc.this).f۱۴۹۰۳h) != 0) {
                boolean scroll = true;
                if (i != 1) {
                    cVar.f۱۴۹۰۳h = i2;
                    int i3 = 0;
                    View child = cVar.getChildAt(0);
                    while (child != null && child.getBottom() <= 0) {
                        i3++;
                        child = AbstractCc.this.getChildAt(i3);
                    }
                    if (child != null) {
                        int firstPosition = AbstractCc.this.getFirstVisiblePosition();
                        int lastPosition = AbstractCc.this.getLastVisiblePosition();
                        if (firstPosition == 0 || lastPosition == AbstractCc.this.getCount() - 1) {
                            scroll = false;
                        }
                        int top = child.getTop();
                        int bottom = child.getBottom();
                        int midpoint = AbstractCc.this.getHeight() / 2;
                        if (scroll && top < AbstractCc.f۱۴۸۹۷m) {
                            if (bottom > midpoint) {
                                AbstractCc.this.smoothScrollBy(top, 250);
                                return;
                            } else {
                                AbstractCc.this.smoothScrollBy(bottom, 250);
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
            AbstractCc.this.f۱۴۹۰۳h = this.f۱۴۹۱۰c;
        }
    }

    public int getMostVisiblePosition() {
        int firstPosition = getFirstVisiblePosition();
        int height = getHeight();
        int maxDisplayedHeight = 0;
        int mostVisibleIndex = 0;
        int i = 0;
        int bottom = 0;
        while (bottom < height) {
            View child = getChildAt(i);
            if (child == null) {
                break;
            }
            bottom = child.getBottom();
            int displayedHeight = Math.min(bottom, height) - Math.max(0, child.getTop());
            if (displayedHeight > maxDisplayedHeight) {
                mostVisibleIndex = i;
                maxDisplayedHeight = displayedHeight;
            }
            i++;
        }
        return firstPosition + mostVisibleIndex;
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۹۳۶a() {
        m۱۷۹۳۹a(this.f۱۴۹۰۵j.m۱۷۹۰۳e(), false, true, true);
    }

    /* renamed from: d  reason: contains not printable characters */
    private AbstractCd.Ca m۱۷۹۳۴d() {
        AbstractCd.Ca focus;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            if ((child instanceof AbstractCe) && (focus = ((AbstractCe) child).getAccessibilityFocus()) != null) {
                if (Build.VERSION.SDK_INT == 17) {
                    ((AbstractCe) child).m۱۷۹۶۰a();
                }
                return focus;
            }
        }
        return null;
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۷۹۳۳b(AbstractCd.Ca day) {
        if (day == null) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            if ((child instanceof AbstractCe) && ((AbstractCe) child).m۱۷۹۶۴a(day)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void layoutChildren() {
        AbstractCd.Ca focusedDay = m۱۷۹۳۴d();
        super.layoutChildren();
        if (this.f۱۴۹۰۶k) {
            this.f۱۴۹۰۶k = false;
        } else {
            m۱۷۹۳۳b(focusedDay);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setItemCount(-1);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static String m۱۷۹۳۲a(AbstractCd.Ca day) {
        Cb mPersianCalendar = new Cb();
        mPersianCalendar.m۱۸۰۰۶a(day.f۱۴۹۱۶b, day.f۱۴۹۱۷c, day.f۱۴۹۱۸d);
        return (("" + mPersianCalendar.m۱۸۰۱۰e()) + " ") + mPersianCalendar.m۱۸۰۱۳h();
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
        AbstractCd.Ca day = new AbstractCd.Ca((firstVisiblePosition / 12) + this.f۱۴۹۰۵j.m۱۷۸۹۶a(), firstVisiblePosition % 12, 1);
        if (action == 4096) {
            day.f۱۴۹۱۷c++;
            if (day.f۱۴۹۱۷c == 12) {
                day.f۱۴۹۱۷c = 0;
                day.f۱۴۹۱۶b++;
            }
        } else if (action == 8192 && (firstVisibleView = getChildAt(0)) != null && firstVisibleView.getTop() >= -1) {
            day.f۱۴۹۱۷c--;
            if (day.f۱۴۹۱۷c == -1) {
                day.f۱۴۹۱۷c = 11;
                day.f۱۴۹۱۶b--;
            }
        }
        Ci.m۱۷۹۹۶a(this, Ca.m۱۸۰۰۱b(m۱۷۹۳۲a(day)));
        m۱۷۹۳۹a(day, true, false, true);
        this.f۱۴۹۰۶k = true;
        return true;
    }
}
