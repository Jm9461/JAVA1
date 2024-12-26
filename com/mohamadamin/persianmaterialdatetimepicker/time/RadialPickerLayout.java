package com.mohamadamin.persianmaterialdatetimepicker.time;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.mohamadamin.persianmaterialdatetimepicker.Ca;
import com.mohamadamin.persianmaterialdatetimepicker.Cb;
import java.util.Calendar;

public class RadialPickerLayout extends FrameLayout implements View.OnTouchListener {

    /* renamed from: A  reason: contains not printable characters */
    private float f۱۴۹۷۸A;

    /* renamed from: B  reason: contains not printable characters */
    private float f۱۴۹۷۹B;

    /* renamed from: C  reason: contains not printable characters */
    private AccessibilityManager f۱۴۹۸۰C;

    /* renamed from: D  reason: contains not printable characters */
    private AnimatorSet f۱۴۹۸۱D;

    /* renamed from: E  reason: contains not printable characters */
    private Handler f۱۴۹۸۲E = new Handler();

    /* renamed from: c  reason: contains not printable characters */
    private final int f۱۴۹۸۳c;

    /* renamed from: d  reason: contains not printable characters */
    private final int f۱۴۹۸۴d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۴۹۸۵e;

    /* renamed from: f  reason: contains not printable characters */
    private Ca f۱۴۹۸۶f;

    /* renamed from: g  reason: contains not printable characters */
    private AbstractCc f۱۴۹۸۷g;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۱۴۹۸۸h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۴۹۸۹i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۱۴۹۹۰j;

    /* renamed from: k  reason: contains not printable characters */
    private boolean f۱۴۹۹۱k;

    /* renamed from: l  reason: contains not printable characters */
    private boolean f۱۴۹۹۲l;

    /* renamed from: m  reason: contains not printable characters */
    private int f۱۴۹۹۳m;

    /* renamed from: n  reason: contains not printable characters */
    private Cb f۱۴۹۹۴n;

    /* renamed from: o  reason: contains not printable characters */
    private Ca f۱۴۹۹۵o;

    /* renamed from: p  reason: contains not printable characters */
    private Cd f۱۴۹۹۶p;

    /* renamed from: q  reason: contains not printable characters */
    private Cd f۱۴۹۹۷q;

    /* renamed from: r  reason: contains not printable characters */
    private Cc f۱۴۹۹۸r;

    /* renamed from: s  reason: contains not printable characters */
    private Cc f۱۴۹۹۹s;

    /* renamed from: t  reason: contains not printable characters */
    private View f۱۵۰۰۰t;

    /* renamed from: u  reason: contains not printable characters */
    private int[] f۱۵۰۰۱u;

    /* renamed from: v  reason: contains not printable characters */
    private boolean f۱۵۰۰۲v;

    /* renamed from: w  reason: contains not printable characters */
    private int f۱۵۰۰۳w = -1;

    /* renamed from: x  reason: contains not printable characters */
    private boolean f۱۵۰۰۴x;

    /* renamed from: y  reason: contains not printable characters */
    private boolean f۱۵۰۰۵y;

    /* renamed from: z  reason: contains not printable characters */
    private int f۱۵۰۰۶z;

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.RadialPickerLayout$c  reason: invalid class name */
    public interface AbstractCc {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۰۳۸a(int i, int i2, boolean z);
    }

    public RadialPickerLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnTouchListener(this);
        this.f۱۴۹۸۳c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f۱۴۹۸۴d = ViewConfiguration.getTapTimeout();
        this.f۱۵۰۰۴x = false;
        this.f۱۴۹۹۴n = new Cb(context);
        addView(this.f۱۴۹۹۴n);
        this.f۱۴۹۹۵o = new Ca(context);
        addView(this.f۱۴۹۹۵o);
        this.f۱۴۹۹۸r = new Cc(context);
        addView(this.f۱۴۹۹۸r);
        this.f۱۴۹۹۹s = new Cc(context);
        addView(this.f۱۴۹۹۹s);
        this.f۱۴۹۹۶p = new Cd(context);
        addView(this.f۱۴۹۹۶p);
        this.f۱۴۹۹۷q = new Cd(context);
        addView(this.f۱۴۹۹۷q);
        m۱۸۰۲۳a();
        this.f۱۴۹۸۵e = -1;
        this.f۱۵۰۰۲v = true;
        this.f۱۵۰۰۰t = new View(context);
        this.f۱۵۰۰۰t.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f۱۵۰۰۰t.setBackgroundColor(getResources().getColor(Cb.mdtp_transparent_black));
        this.f۱۵۰۰۰t.setVisibility(4);
        addView(this.f۱۵۰۰۰t);
        this.f۱۴۹۸۰C = (AccessibilityManager) context.getSystemService("accessibility");
        this.f۱۴۹۸۸h = false;
    }

    public void setOnValueSelectedListener(AbstractCc listener) {
        this.f۱۴۹۸۷g = listener;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۳۵a(Context context, Ca hapticFeedbackController, int initialHoursOfDay, int initialMinutes, boolean is24HourMode) {
        String str;
        if (this.f۱۴۹۸۸h) {
            Log.e("RadialPickerLayout", "Time has already been initialized.");
            return;
        }
        this.f۱۴۹۸۶f = hapticFeedbackController;
        this.f۱۴۹۹۱k = is24HourMode;
        this.f۱۴۹۹۲l = this.f۱۴۹۸۰C.isTouchExplorationEnabled() || this.f۱۴۹۹۱k;
        this.f۱۴۹۹۴n.m۱۸۰۴۲a(context, this.f۱۴۹۹۲l);
        this.f۱۴۹۹۴n.invalidate();
        if (!this.f۱۴۹۹۲l) {
            this.f۱۴۹۹۵o.m۱۸۰۴۰a(context, initialHoursOfDay < 12 ? 0 : 1);
            this.f۱۴۹۹۵o.invalidate();
        }
        Resources res = context.getResources();
        int[] hours = {12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] hours_24 = {0, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
        int[] minutes = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
        String[] hoursTexts = new String[12];
        String[] innerHoursTexts = new String[12];
        String[] minutesTexts = new String[12];
        for (int i = 0; i < 12; i++) {
            Object[] objArr = new Object[1];
            if (is24HourMode) {
                objArr[0] = Integer.valueOf(hours_24[i]);
                str = String.format("%02d", objArr);
            } else {
                objArr[0] = Integer.valueOf(hours[i]);
                str = String.format("%d", objArr);
            }
            hoursTexts[i] = com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(str);
            innerHoursTexts[i] = com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(String.format("%d", Integer.valueOf(hours[i])));
            minutesTexts[i] = com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(String.format("%02d", Integer.valueOf(minutes[i])));
        }
        this.f۱۴۹۹۶p.m۱۸۰۵۲a(res, hoursTexts, is24HourMode ? innerHoursTexts : null, this.f۱۴۹۹۲l, true);
        this.f۱۴۹۹۶p.setSelection(is24HourMode ? initialHoursOfDay : initialHoursOfDay % 12);
        this.f۱۴۹۹۶p.invalidate();
        this.f۱۴۹۹۷q.m۱۸۰۵۲a(res, minutesTexts, null, this.f۱۴۹۹۲l, false);
        this.f۱۴۹۹۷q.setSelection(initialMinutes);
        this.f۱۴۹۹۷q.invalidate();
        m۱۸۰۳۰c(0, initialHoursOfDay);
        m۱۸۰۳۰c(1, initialMinutes);
        this.f۱۴۹۹۸r.m۱۸۰۴۷a(context, this.f۱۴۹۹۲l, is24HourMode, true, (initialHoursOfDay % 12) * 30, m۱۸۰۲۴a(initialHoursOfDay));
        this.f۱۴۹۹۹s.m۱۸۰۴۷a(context, this.f۱۴۹۹۲l, false, false, initialMinutes * 6, false);
        this.f۱۴۹۸۸h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۳۶a(Context context, boolean themeDark) {
        this.f۱۴۹۹۴n.m۱۸۰۴۳b(context, themeDark);
        this.f۱۴۹۹۵o.m۱۸۰۴۱a(context, themeDark);
        this.f۱۴۹۹۶p.m۱۸۰۵۱a(context, themeDark);
        this.f۱۴۹۹۷q.m۱۸۰۵۱a(context, themeDark);
        this.f۱۴۹۹۸r.m۱۸۰۴۶a(context, themeDark);
        this.f۱۴۹۹۹s.m۱۸۰۴۶a(context, themeDark);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۳۳a(int hours, int minutes) {
        m۱۸۰۲۸b(0, hours);
        m۱۸۰۲۸b(1, minutes);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۸۰۲۸b(int index, int value) {
        if (index == 0) {
            m۱۸۰۳۰c(0, value);
            this.f۱۴۹۹۸r.m۱۸۰۴۵a((value % 12) * 30, m۱۸۰۲۴a(value), false);
            this.f۱۴۹۹۸r.invalidate();
            this.f۱۴۹۹۶p.setSelection(value);
            this.f۱۴۹۹۶p.invalidate();
        } else if (index == 1) {
            m۱۸۰۳۰c(1, value);
            this.f۱۴۹۹۹s.m۱۸۰۴۵a(value * 6, false, false);
            this.f۱۴۹۹۹s.invalidate();
            this.f۱۴۹۹۷q.setSelection(value);
            this.f۱۴۹۹۶p.invalidate();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۸۰۲۴a(int hourOfDay) {
        return this.f۱۴۹۹۱k && hourOfDay <= 12 && hourOfDay != 0;
    }

    public int getHours() {
        return this.f۱۴۹۸۹i;
    }

    public int getMinutes() {
        return this.f۱۴۹۹۰j;
    }

    private int getCurrentlyShowingValue() {
        int currentIndex = getCurrentItemShowing();
        if (currentIndex == 0) {
            return this.f۱۴۹۸۹i;
        }
        if (currentIndex == 1) {
            return this.f۱۴۹۹۰j;
        }
        return -1;
    }

    public int getIsCurrentlyAmOrPm() {
        int i = this.f۱۴۹۸۹i;
        if (i < 12) {
            return 0;
        }
        if (i < 24) {
            return 1;
        }
        return -1;
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۸۰۳۰c(int index, int value) {
        if (index == 0) {
            this.f۱۴۹۸۹i = value;
        } else if (index == 1) {
            this.f۱۴۹۹۰j = value;
        } else if (index != 2) {
        } else {
            if (value == 0) {
                this.f۱۴۹۸۹i %= 12;
            } else if (value == 1) {
                this.f۱۴۹۸۹i = (this.f۱۴۹۸۹i % 12) + 12;
            }
        }
    }

    public void setAmOrPm(int amOrPm) {
        this.f۱۴۹۹۵o.setAmOrPm(amOrPm);
        this.f۱۴۹۹۵o.invalidate();
        m۱۸۰۳۰c(2, amOrPm);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۰۲۳a() {
        this.f۱۵۰۰۱u = new int[361];
        int snappedOutputDegrees = 0;
        int count = 1;
        int expectedCount = 8;
        for (int degrees = 0; degrees < 361; degrees++) {
            this.f۱۵۰۰۱u[degrees] = snappedOutputDegrees;
            if (count == expectedCount) {
                snappedOutputDegrees += 6;
                if (snappedOutputDegrees == 360) {
                    expectedCount = 7;
                } else if (snappedOutputDegrees % 30 == 0) {
                    expectedCount = 14;
                } else {
                    expectedCount = 4;
                }
                count = 1;
            } else {
                count++;
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۸۰۲۶b(int degrees) {
        int[] iArr = this.f۱۵۰۰۱u;
        if (iArr == null) {
            return -1;
        }
        return iArr[degrees];
    }

    /* renamed from: d  reason: contains not printable characters */
    private static int m۱۸۰۳۱d(int degrees, int forceHigherOrLower) {
        int floor = (degrees / 30) * 30;
        int ceiling = floor + 30;
        if (forceHigherOrLower == 1) {
            return ceiling;
        }
        if (forceHigherOrLower != -1) {
            return degrees - floor < ceiling - degrees ? floor : ceiling;
        }
        if (degrees == floor) {
            floor -= 30;
        }
        return floor;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private int m۱۸۰۱۹a(int degrees, boolean isInnerCircle, boolean forceToVisibleValue, boolean forceDrawDot) {
        int degrees2;
        int stepSize;
        Cc radialSelectorView;
        if (degrees == -1) {
            return -1;
        }
        int currentShowing = getCurrentItemShowing();
        if (!forceToVisibleValue && currentShowing == 1) {
            degrees2 = m۱۸۰۲۶b(degrees);
        } else {
            degrees2 = m۱۸۰۳۱d(degrees, 0);
        }
        if (currentShowing == 0) {
            radialSelectorView = this.f۱۴۹۹۸r;
            stepSize = 30;
        } else {
            radialSelectorView = this.f۱۴۹۹۹s;
            stepSize = 6;
        }
        radialSelectorView.m۱۸۰۴۵a(degrees2, isInnerCircle, forceDrawDot);
        radialSelectorView.invalidate();
        if (currentShowing == 0) {
            if (this.f۱۴۹۹۱k) {
                if (degrees2 == 0 && isInnerCircle) {
                    degrees2 = 360;
                } else if (degrees2 == 360 && !isInnerCircle) {
                    degrees2 = 0;
                }
            } else if (degrees2 == 0) {
                degrees2 = 360;
            }
        } else if (degrees2 == 360 && currentShowing == 1) {
            degrees2 = 0;
        }
        int value = degrees2 / stepSize;
        if (currentShowing == 0 && this.f۱۴۹۹۱k && !isInnerCircle && degrees2 != 0) {
            value += 12;
        }
        if (getCurrentItemShowing() == 0) {
            this.f۱۴۹۹۶p.setSelection(value);
            this.f۱۴۹۹۶p.invalidate();
        } else if (getCurrentItemShowing() == 1) {
            this.f۱۴۹۹۷q.setSelection(value);
            this.f۱۴۹۹۷q.invalidate();
        }
        return value;
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۸۰۱۸a(float pointX, float pointY, boolean forceLegal, Boolean[] isInnerCircle) {
        int currentItem = getCurrentItemShowing();
        if (currentItem == 0) {
            return this.f۱۴۹۹۸r.m۱۸۰۴۴a(pointX, pointY, forceLegal, isInnerCircle);
        }
        if (currentItem == 1) {
            return this.f۱۴۹۹۹s.m۱۸۰۴۴a(pointX, pointY, forceLegal, isInnerCircle);
        }
        return -1;
    }

    public int getCurrentItemShowing() {
        int i = this.f۱۴۹۹۳m;
        if (i == 0 || i == 1) {
            return this.f۱۴۹۹۳m;
        }
        Log.e("RadialPickerLayout", "Current item showing was unfortunately set to " + this.f۱۴۹۹۳m);
        return -1;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۳۴a(int index, boolean animate) {
        if (index == 0 || index == 1) {
            int lastIndex = getCurrentItemShowing();
            this.f۱۴۹۹۳m = index;
            int minuteAlpha = 0;
            if (!animate || index == lastIndex) {
                int hourAlpha = index == 0 ? 255 : 0;
                if (index == 1) {
                    minuteAlpha = 255;
                }
                this.f۱۴۹۹۶p.setAlpha((float) hourAlpha);
                this.f۱۴۹۹۸r.setAlpha((float) hourAlpha);
                this.f۱۴۹۹۷q.setAlpha((float) minuteAlpha);
                this.f۱۴۹۹۹s.setAlpha((float) minuteAlpha);
                return;
            }
            ObjectAnimator[] anims = new ObjectAnimator[4];
            if (index == 1) {
                anims[0] = this.f۱۴۹۹۶p.getDisappearAnimator();
                anims[1] = this.f۱۴۹۹۸r.getDisappearAnimator();
                anims[2] = this.f۱۴۹۹۷q.getReappearAnimator();
                anims[3] = this.f۱۴۹۹۹s.getReappearAnimator();
            } else if (index == 0) {
                anims[0] = this.f۱۴۹۹۶p.getReappearAnimator();
                anims[1] = this.f۱۴۹۹۸r.getReappearAnimator();
                anims[2] = this.f۱۴۹۹۷q.getDisappearAnimator();
                anims[3] = this.f۱۴۹۹۹s.getDisappearAnimator();
            }
            AnimatorSet animatorSet = this.f۱۴۹۸۱D;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.f۱۴۹۸۱D.end();
            }
            this.f۱۴۹۸۱D = new AnimatorSet();
            this.f۱۴۹۸۱D.playTogether(anims);
            this.f۱۴۹۸۱D.start();
            return;
        }
        Log.e("RadialPickerLayout", "TimePicker does not support view at index " + index);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r5 <= ((float) r9)) goto L_0x013a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
        // Method dump skipped, instructions count: 408
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mohamadamin.persianmaterialdatetimepicker.time.RadialPickerLayout.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.RadialPickerLayout$a  reason: invalid class name */
    class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            RadialPickerLayout.this.f۱۴۹۹۵o.setAmOrPmPressed(RadialPickerLayout.this.f۱۵۰۰۳w);
            RadialPickerLayout.this.f۱۴۹۹۵o.invalidate();
        }
    }

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.RadialPickerLayout$b  reason: invalid class name */
    class RunnableCb implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ Boolean[] f۱۵۰۰۸c;

        RunnableCb(Boolean[] boolArr) {
            this.f۱۵۰۰۸c = boolArr;
        }

        public void run() {
            RadialPickerLayout.this.f۱۵۰۰۴x = true;
            RadialPickerLayout radialPickerLayout = RadialPickerLayout.this;
            int value = radialPickerLayout.m۱۸۰۱۹a((RadialPickerLayout) radialPickerLayout.f۱۵۰۰۶z, (int) this.f۱۵۰۰۸c[0].booleanValue(), false, true);
            RadialPickerLayout.this.f۱۴۹۸۵e = value;
            RadialPickerLayout.this.f۱۴۹۸۷g.m۱۸۰۳۸a(RadialPickerLayout.this.getCurrentItemShowing(), value, false);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۰۳۷a(boolean inputEnabled) {
        int i = 0;
        if (this.f۱۵۰۰۵y && !inputEnabled) {
            return false;
        }
        this.f۱۵۰۰۲v = inputEnabled;
        View view = this.f۱۵۰۰۰t;
        if (inputEnabled) {
            i = 4;
        }
        view.setVisibility(i);
        return true;
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

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        if (event.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(event);
        }
        event.getText().clear();
        Calendar time = Calendar.getInstance();
        time.set(10, getHours());
        time.set(12, getMinutes());
        long millis = time.getTimeInMillis();
        int flags = 1;
        if (this.f۱۴۹۹۱k) {
            flags = 1 | 128;
        }
        event.getText().add(com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(DateUtils.formatDateTime(getContext(), millis, flags)));
        return true;
    }

    @SuppressLint({"NewApi"})
    public boolean performAccessibilityAction(int action, Bundle arguments) {
        int maxValue;
        if (super.performAccessibilityAction(action, arguments)) {
            return true;
        }
        int changeMultiplier = 0;
        if (action == 4096) {
            changeMultiplier = 1;
        } else if (action == 8192) {
            changeMultiplier = -1;
        }
        if (changeMultiplier == 0) {
            return false;
        }
        int value = getCurrentlyShowingValue();
        int stepSize = 0;
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            stepSize = 30;
            value %= 12;
        } else if (currentItemShowing == 1) {
            stepSize = 6;
        }
        int value2 = m۱۸۰۳۱d(value * stepSize, changeMultiplier) / stepSize;
        int minValue = 0;
        if (currentItemShowing != 0) {
            maxValue = 55;
        } else if (this.f۱۴۹۹۱k) {
            maxValue = 23;
        } else {
            maxValue = 12;
            minValue = 1;
        }
        if (value2 > maxValue) {
            value2 = minValue;
        } else if (value2 < minValue) {
            value2 = maxValue;
        }
        m۱۸۰۲۸b(currentItemShowing, value2);
        this.f۱۴۹۸۷g.m۱۸۰۳۸a(currentItemShowing, value2, false);
        return true;
    }
}
