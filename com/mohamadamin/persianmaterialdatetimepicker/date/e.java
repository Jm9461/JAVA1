package com.mohamadamin.persianmaterialdatetimepicker.date;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.mohamadamin.persianmaterialdatetimepicker.c;
import com.mohamadamin.persianmaterialdatetimepicker.date.d;
import com.mohamadamin.persianmaterialdatetimepicker.g;
import com.mohamadamin.persianmaterialdatetimepicker.h;
import com.mohamadamin.persianmaterialdatetimepicker.i;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.List;

public abstract class e extends View {
    protected static int H = 32;
    protected static int I = 10;
    protected static int J = 1;
    protected static int K;
    protected static int L;
    protected static int M;
    protected static int N;
    protected static int O;
    protected int A;
    protected int B;
    protected int C;
    protected int D;
    protected int E;
    protected int F;
    private int G = 0;

    /* renamed from: c  reason: collision with root package name */
    protected a f۳۳۴۵c;

    /* renamed from: d  reason: collision with root package name */
    protected int f۳۳۴۶d = 0;

    /* renamed from: e  reason: collision with root package name */
    private String f۳۳۴۷e;

    /* renamed from: f  reason: collision with root package name */
    protected Paint f۳۳۴۸f;

    /* renamed from: g  reason: collision with root package name */
    protected Paint f۳۳۴۹g;

    /* renamed from: h  reason: collision with root package name */
    protected Paint f۳۳۵۰h;
    protected Paint i;
    private final StringBuilder j;
    protected int k;
    protected int l;
    protected int m;
    protected int n = H;
    protected boolean o = false;
    protected int p = -1;
    protected int q = -1;
    protected int r = 7;
    protected int s = 7;
    protected int t = this.s;
    private final com.mohamadamin.persianmaterialdatetimepicker.j.b u;
    protected final com.mohamadamin.persianmaterialdatetimepicker.j.b v;
    private final a w;
    protected int x = 6;
    protected b y;
    private boolean z;

    public interface b {
        void a(e eVar, d.a aVar);
    }

    public abstract void a(Canvas canvas, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    public e(Context context, AttributeSet attr, a controller) {
        super(context, attr);
        boolean darkTheme = false;
        this.f۳۳۴۵c = controller;
        Resources res = context.getResources();
        this.v = new com.mohamadamin.persianmaterialdatetimepicker.j.b();
        this.u = new com.mohamadamin.persianmaterialdatetimepicker.j.b();
        res.getString(g.mdtp_day_of_week_label_typeface);
        this.f۳۳۴۷e = res.getString(g.mdtp_sans_serif);
        a aVar = this.f۳۳۴۵c;
        if (aVar != null && aVar.f()) {
            darkTheme = true;
        }
        if (darkTheme) {
            this.A = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_date_picker_text_normal_dark_theme);
            this.C = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_date_picker_month_day_dark_theme);
            this.F = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_date_picker_text_disabled_dark_theme);
            this.E = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_date_picker_text_highlighted_dark_theme);
        } else {
            this.A = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_date_picker_text_normal);
            this.C = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_date_picker_month_day);
            this.F = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_date_picker_text_disabled);
            this.E = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_date_picker_text_highlighted);
        }
        this.B = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_white);
        this.D = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_accent_color);
        res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_white);
        this.j = new StringBuilder(50);
        K = res.getDimensionPixelSize(c.mdtp_day_number_size);
        L = res.getDimensionPixelSize(c.mdtp_month_label_size);
        M = res.getDimensionPixelSize(c.mdtp_month_day_label_text_size);
        N = res.getDimensionPixelOffset(c.mdtp_month_list_item_header_height);
        O = res.getDimensionPixelSize(c.mdtp_day_number_select_circle_radius);
        this.n = (res.getDimensionPixelOffset(c.mdtp_date_picker_view_animator_height) - getMonthHeaderSize()) / 6;
        this.w = getMonthViewTouchHelper();
        u.a(this, this.w);
        u.f(this, 1);
        this.z = true;
        c();
    }

    public void setDatePickerController(a controller) {
        this.f۳۳۴۵c = controller;
    }

    /* access modifiers changed from: protected */
    public a getMonthViewTouchHelper() {
        return new a(this);
    }

    public void setAccessibilityDelegate(View.AccessibilityDelegate delegate) {
        if (!this.z) {
            super.setAccessibilityDelegate(delegate);
        }
    }

    public void setOnDayClickListener(b listener) {
        this.y = listener;
    }

    public boolean dispatchHoverEvent(MotionEvent event) {
        if (this.w.a(event)) {
            return true;
        }
        return super.dispatchHoverEvent(event);
    }

    public boolean onTouchEvent(MotionEvent event) {
        int day;
        if (event.getAction() == 1 && (day = a(event.getX(), event.getY())) >= 0) {
            a(day);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.f۳۳۴۹g = new Paint();
        this.f۳۳۴۹g.setFakeBoldText(true);
        this.f۳۳۴۹g.setAntiAlias(true);
        this.f۳۳۴۹g.setTextSize((float) L);
        this.f۳۳۴۹g.setTypeface(Typeface.create(this.f۳۳۴۷e, 1));
        this.f۳۳۴۹g.setColor(this.A);
        this.f۳۳۴۹g.setTextAlign(Paint.Align.CENTER);
        this.f۳۳۴۹g.setStyle(Paint.Style.FILL);
        this.f۳۳۵۰h = new Paint();
        this.f۳۳۵۰h.setFakeBoldText(true);
        this.f۳۳۵۰h.setAntiAlias(true);
        this.f۳۳۵۰h.setColor(this.D);
        this.f۳۳۵۰h.setTextAlign(Paint.Align.CENTER);
        this.f۳۳۵۰h.setStyle(Paint.Style.FILL);
        this.f۳۳۵۰h.setAlpha(255);
        this.i = new Paint();
        this.i.setAntiAlias(true);
        this.i.setTextSize((float) M);
        this.i.setColor(this.C);
        this.i.setTypeface(h.a(getContext(), "Roboto-Medium"));
        this.i.setStyle(Paint.Style.FILL);
        this.i.setTextAlign(Paint.Align.CENTER);
        this.i.setFakeBoldText(true);
        this.f۳۳۴۸f = new Paint();
        this.f۳۳۴۸f.setAntiAlias(true);
        this.f۳۳۴۸f.setTextSize((float) K);
        this.f۳۳۴۸f.setStyle(Paint.Style.FILL);
        this.f۳۳۴۸f.setTextAlign(Paint.Align.CENTER);
        this.f۳۳۴۸f.setFakeBoldText(false);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        c(canvas);
        a(canvas);
        b(canvas);
    }

    public void setMonthParams(HashMap<String, Integer> params) {
        if (params.containsKey("month") || params.containsKey("year")) {
            setTag(params);
            if (params.containsKey("height")) {
                this.n = params.get("height").intValue();
                int i2 = this.n;
                int i3 = I;
                if (i2 < i3) {
                    this.n = i3;
                }
            }
            if (params.containsKey("selected_day")) {
                this.p = params.get("selected_day").intValue();
            }
            this.k = params.get("month").intValue();
            this.l = params.get("year").intValue();
            com.mohamadamin.persianmaterialdatetimepicker.j.b today = new com.mohamadamin.persianmaterialdatetimepicker.j.b();
            this.o = false;
            this.q = -1;
            this.u.a(this.l, this.k, 1);
            this.G = this.u.get(7);
            if (params.containsKey("week_start")) {
                this.r = params.get("week_start").intValue();
            } else {
                this.r = 7;
            }
            this.t = i.a(this.k, this.l);
            for (int i4 = 0; i4 < this.t; i4++) {
                int day = i4 + 1;
                if (a(day, today)) {
                    this.o = true;
                    this.q = day;
                }
            }
            this.x = e();
            this.w.d();
            return;
        }
        throw new InvalidParameterException("You must specify month and year for this view");
    }

    public void setSelectedDay(int day) {
        this.p = day;
    }

    public void d() {
        this.x = 6;
        requestLayout();
    }

    private int e() {
        int offset = b();
        int i2 = this.t;
        int i3 = this.s;
        return ((i2 + offset) % i3 > 0 ? 1 : 0) + ((offset + i2) / i3);
    }

    private boolean a(int day, com.mohamadamin.persianmaterialdatetimepicker.j.b today) {
        return this.l == today.h() && this.k == today.d() && day == today.b();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), (this.n * this.x) + getMonthHeaderSize() + 5);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        this.m = w2;
        this.w.d();
    }

    public int getMonth() {
        return this.k;
    }

    public int getYear() {
        return this.l;
    }

    /* access modifiers changed from: protected */
    public int getMonthHeaderSize() {
        return N;
    }

    private String getMonthAndYearString() {
        this.j.setLength(0);
        return com.mohamadamin.persianmaterialdatetimepicker.j.a.b(this.u.e() + " " + this.u.h());
    }

    /* access modifiers changed from: protected */
    public void c(Canvas canvas) {
        canvas.drawText(getMonthAndYearString(), (float) ((this.m + (this.f۳۳۴۶d * 2)) / 2), (float) ((getMonthHeaderSize() - M) / 2), this.f۳۳۴۹g);
    }

    /* access modifiers changed from: protected */
    public void a(Canvas canvas) {
        int y2 = getMonthHeaderSize() - (M / 2);
        int dayWidthHalf = (this.m - (this.f۳۳۴۶d * 2)) / (this.s * 2);
        int i2 = 0;
        while (true) {
            int i3 = this.s;
            if (i2 < i3) {
                int calendarDay = (this.r + i2) % i3;
                int x2 = (((i2 * 2) + 1) * dayWidthHalf) + this.f۳۳۴۶d;
                this.v.set(7, calendarDay);
                canvas.drawText(this.v.g().substring(0, 1), (float) x2, (float) y2, this.i);
                i2++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(Canvas canvas) {
        int y2 = (((this.n + K) / 2) - J) + getMonthHeaderSize();
        float dayWidthHalf = ((float) (this.m - (this.f۳۳۴۶d * 2))) / (((float) this.s) * 2.0f);
        int y3 = y2;
        int j2 = b();
        for (int dayNumber = 1; dayNumber <= this.t; dayNumber++) {
            int x2 = (int) ((((float) ((j2 * 2) + 1)) * dayWidthHalf) + ((float) this.f۳۳۴۶d));
            int i2 = this.n;
            int startY = y3 - (((K + i2) / 2) - J);
            a(canvas, this.l, this.k, dayNumber, x2, y3, (int) (((float) x2) - dayWidthHalf), (int) (((float) x2) + dayWidthHalf), startY, startY + i2);
            j2++;
            if (j2 == this.s) {
                y3 += this.n;
                j2 = 0;
            }
        }
    }

    /* access modifiers changed from: protected */
    public int b() {
        int i2 = this.G;
        if (i2 < this.r) {
            i2 += this.s;
        }
        return i2 - this.r;
    }

    public int a(float x2, float y2) {
        int day = b(x2, y2);
        if (day < 1 || day > this.t) {
            return -1;
        }
        return day;
    }

    /* access modifiers changed from: protected */
    public int b(float x2, float y2) {
        int dayStart = this.f۳۳۴۶d;
        if (x2 < ((float) dayStart) || x2 > ((float) (this.m - this.f۳۳۴۶d))) {
            return -1;
        }
        return (((int) (((x2 - ((float) dayStart)) * ((float) this.s)) / ((float) ((this.m - dayStart) - this.f۳۳۴۶d)))) - b()) + 1 + (this.s * (((int) (y2 - ((float) getMonthHeaderSize()))) / this.n));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(int day) {
        if (!b(this.l, this.k, day)) {
            b bVar = this.y;
            if (bVar != null) {
                bVar.a(this, new d.a(this.l, this.k, day));
            }
            this.w.b(day, 1);
        }
    }

    /* access modifiers changed from: protected */
    public boolean b(int year, int month, int day) {
        if (this.f۳۳۴۵c.d() != null) {
            return !e(year, month, day);
        }
        if (!d(year, month, day) && !c(year, month, day)) {
            return false;
        }
        return true;
    }

    private boolean e(int year, int month, int day) {
        com.mohamadamin.persianmaterialdatetimepicker.j.b[] selectableDays = this.f۳۳۴۵c.d();
        for (com.mohamadamin.persianmaterialdatetimepicker.j.b c2 : selectableDays) {
            if (year < c2.h()) {
                return false;
            }
            if (year <= c2.h()) {
                if (month < c2.d()) {
                    return false;
                }
                if (month > c2.d()) {
                    continue;
                } else if (day < c2.b()) {
                    return false;
                } else {
                    if (day <= c2.b()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean d(int year, int month, int day) {
        com.mohamadamin.persianmaterialdatetimepicker.j.b minDate;
        a aVar = this.f۳۳۴۵c;
        if (aVar == null || (minDate = aVar.j()) == null) {
            return false;
        }
        if (year < minDate.h()) {
            return true;
        }
        if (year > minDate.h()) {
            return false;
        }
        if (month < minDate.d()) {
            return true;
        }
        if (month <= minDate.d() && day < minDate.b()) {
            return true;
        }
        return false;
    }

    private boolean c(int year, int month, int day) {
        com.mohamadamin.persianmaterialdatetimepicker.j.b maxDate;
        a aVar = this.f۳۳۴۵c;
        if (aVar == null || (maxDate = aVar.c()) == null) {
            return false;
        }
        if (year > maxDate.h()) {
            return true;
        }
        if (year < maxDate.h()) {
            return false;
        }
        if (month > maxDate.d()) {
            return true;
        }
        if (month >= maxDate.d() && day > maxDate.d()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean a(int year, int month, int day) {
        com.mohamadamin.persianmaterialdatetimepicker.j.b[] highlightedDays = this.f۳۳۴۵c.g();
        if (highlightedDays == null) {
            return false;
        }
        for (com.mohamadamin.persianmaterialdatetimepicker.j.b c2 : highlightedDays) {
            if (year < c2.h()) {
                break;
            }
            if (year <= c2.h()) {
                if (month < c2.d()) {
                    break;
                } else if (month > c2.d()) {
                    continue;
                } else if (day < c2.b()) {
                    break;
                } else if (day <= c2.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public d.a getAccessibilityFocus() {
        int day = this.w.c();
        if (day >= 0) {
            return new d.a(this.l, this.k, day);
        }
        return null;
    }

    public void a() {
        this.w.e();
    }

    public boolean a(d.a day) {
        int i2;
        if (day.f۳۳۴۲b != this.l || day.f۳۳۴۳c != this.k || (i2 = day.f۳۳۴۴d) > this.t) {
            return false;
        }
        this.w.e(i2);
        return true;
    }

    /* access modifiers changed from: protected */
    public class a extends android.support.v4.widget.h {
        private final Rect n = new Rect();
        private final com.mohamadamin.persianmaterialdatetimepicker.j.b o = new com.mohamadamin.persianmaterialdatetimepicker.j.b();

        public a(View host) {
            super(host);
        }

        public void e(int virtualViewId) {
            a(e.this).a(virtualViewId, 64, null);
        }

        public void e() {
            int focusedVirtualView = c();
            if (focusedVirtualView != Integer.MIN_VALUE) {
                a(e.this).a(focusedVirtualView, 128, null);
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.support.v4.widget.h
        public int a(float x, float y) {
            int day = e.this.a(x, y);
            if (day >= 0) {
                return day;
            }
            return Integer.MIN_VALUE;
        }

        /* access modifiers changed from: protected */
        @Override // android.support.v4.widget.h
        public void a(List<Integer> virtualViewIds) {
            for (int day = 1; day <= e.this.t; day++) {
                virtualViewIds.add(Integer.valueOf(day));
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.support.v4.widget.h
        public void a(int virtualViewId, AccessibilityEvent event) {
            event.setContentDescription(d(virtualViewId));
        }

        /* access modifiers changed from: protected */
        @Override // android.support.v4.widget.h
        public void a(int virtualViewId, android.support.v4.view.d0.c node) {
            a(virtualViewId, this.n);
            node.b(d(virtualViewId));
            node.c(this.n);
            node.a(16);
            if (virtualViewId == e.this.p) {
                node.l(true);
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.support.v4.widget.h
        public boolean a(int virtualViewId, int action, Bundle arguments) {
            if (action != 16) {
                return false;
            }
            e.this.a((e) virtualViewId);
            return true;
        }

        /* access modifiers changed from: protected */
        public void a(int day, Rect rect) {
            e eVar = e.this;
            int offsetX = eVar.f۳۳۴۶d;
            int offsetY = eVar.getMonthHeaderSize();
            e eVar2 = e.this;
            int cellHeight = eVar2.n;
            int cellWidth = (eVar2.m - (eVar2.f۳۳۴۶d * 2)) / eVar2.s;
            int index = (day - 1) + eVar2.b();
            int i = e.this.s;
            int x = ((index % i) * cellWidth) + offsetX;
            int y = ((index / i) * cellHeight) + offsetY;
            rect.set(x, y, x + cellWidth, y + cellHeight);
        }

        /* access modifiers changed from: protected */
        public CharSequence d(int day) {
            com.mohamadamin.persianmaterialdatetimepicker.j.b bVar = this.o;
            e eVar = e.this;
            bVar.a(eVar.l, eVar.k, day);
            String date = com.mohamadamin.persianmaterialdatetimepicker.j.a.b(this.o.c());
            e eVar2 = e.this;
            if (day != eVar2.p) {
                return date;
            }
            return eVar2.getContext().getString(g.mdtp_item_is_selected, date);
        }
    }
}
