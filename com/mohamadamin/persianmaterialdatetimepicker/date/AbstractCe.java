package com.mohamadamin.persianmaterialdatetimepicker.date;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.widget.AbstractCh;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.mohamadamin.persianmaterialdatetimepicker.Cc;
import com.mohamadamin.persianmaterialdatetimepicker.Cg;
import com.mohamadamin.persianmaterialdatetimepicker.Ch;
import com.mohamadamin.persianmaterialdatetimepicker.Ci;
import com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCd;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.e  reason: invalid class name */
public abstract class AbstractCe extends View {

    /* renamed from: H  reason: contains not printable characters */
    protected static int f۱۴۹۱۹H = 32;

    /* renamed from: I  reason: contains not printable characters */
    protected static int f۱۴۹۲۰I = 10;

    /* renamed from: J  reason: contains not printable characters */
    protected static int f۱۴۹۲۱J = 1;

    /* renamed from: K  reason: contains not printable characters */
    protected static int f۱۴۹۲۲K;

    /* renamed from: L  reason: contains not printable characters */
    protected static int f۱۴۹۲۳L;

    /* renamed from: M  reason: contains not printable characters */
    protected static int f۱۴۹۲۴M;

    /* renamed from: N  reason: contains not printable characters */
    protected static int f۱۴۹۲۵N;

    /* renamed from: O  reason: contains not printable characters */
    protected static int f۱۴۹۲۶O;

    /* renamed from: A  reason: contains not printable characters */
    protected int f۱۴۹۲۷A;

    /* renamed from: B  reason: contains not printable characters */
    protected int f۱۴۹۲۸B;

    /* renamed from: C  reason: contains not printable characters */
    protected int f۱۴۹۲۹C;

    /* renamed from: D  reason: contains not printable characters */
    protected int f۱۴۹۳۰D;

    /* renamed from: E  reason: contains not printable characters */
    protected int f۱۴۹۳۱E;

    /* renamed from: F  reason: contains not printable characters */
    protected int f۱۴۹۳۲F;

    /* renamed from: G  reason: contains not printable characters */
    private int f۱۴۹۳۳G = 0;

    /* renamed from: c  reason: contains not printable characters */
    protected AbstractCa f۱۴۹۳۴c;

    /* renamed from: d  reason: contains not printable characters */
    protected int f۱۴۹۳۵d = 0;

    /* renamed from: e  reason: contains not printable characters */
    private String f۱۴۹۳۶e;

    /* renamed from: f  reason: contains not printable characters */
    protected Paint f۱۴۹۳۷f;

    /* renamed from: g  reason: contains not printable characters */
    protected Paint f۱۴۹۳۸g;

    /* renamed from: h  reason: contains not printable characters */
    protected Paint f۱۴۹۳۹h;

    /* renamed from: i  reason: contains not printable characters */
    protected Paint f۱۴۹۴۰i;

    /* renamed from: j  reason: contains not printable characters */
    private final StringBuilder f۱۴۹۴۱j;

    /* renamed from: k  reason: contains not printable characters */
    protected int f۱۴۹۴۲k;

    /* renamed from: l  reason: contains not printable characters */
    protected int f۱۴۹۴۳l;

    /* renamed from: m  reason: contains not printable characters */
    protected int f۱۴۹۴۴m;

    /* renamed from: n  reason: contains not printable characters */
    protected int f۱۴۹۴۵n = f۱۴۹۱۹H;

    /* renamed from: o  reason: contains not printable characters */
    protected boolean f۱۴۹۴۶o = false;

    /* renamed from: p  reason: contains not printable characters */
    protected int f۱۴۹۴۷p = -1;

    /* renamed from: q  reason: contains not printable characters */
    protected int f۱۴۹۴۸q = -1;

    /* renamed from: r  reason: contains not printable characters */
    protected int f۱۴۹۴۹r = 7;

    /* renamed from: s  reason: contains not printable characters */
    protected int f۱۴۹۵۰s = 7;

    /* renamed from: t  reason: contains not printable characters */
    protected int f۱۴۹۵۱t = this.f۱۴۹۵۰s;

    /* renamed from: u  reason: contains not printable characters */
    private final Cb f۱۴۹۵۲u;

    /* renamed from: v  reason: contains not printable characters */
    protected final Cb f۱۴۹۵۳v;

    /* renamed from: w  reason: contains not printable characters */
    private final Ca f۱۴۹۵۴w;

    /* renamed from: x  reason: contains not printable characters */
    protected int f۱۴۹۵۵x = 6;

    /* renamed from: y  reason: contains not printable characters */
    protected AbstractCb f۱۴۹۵۶y;

    /* renamed from: z  reason: contains not printable characters */
    private boolean f۱۴۹۵۷z;

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.e$b  reason: invalid class name */
    public interface AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۷۹۸۱a(AbstractCe eVar, AbstractCd.Ca aVar);
    }

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۷۹۶۲a(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    public AbstractCe(Context context, AttributeSet attr, AbstractCa controller) {
        super(context, attr);
        boolean darkTheme = false;
        this.f۱۴۹۳۴c = controller;
        Resources res = context.getResources();
        this.f۱۴۹۵۳v = new Cb();
        this.f۱۴۹۵۲u = new Cb();
        res.getString(Cg.mdtp_day_of_week_label_typeface);
        this.f۱۴۹۳۶e = res.getString(Cg.mdtp_sans_serif);
        AbstractCa aVar = this.f۱۴۹۳۴c;
        if (aVar != null && aVar.m۱۷۹۰۴f()) {
            darkTheme = true;
        }
        if (darkTheme) {
            this.f۱۴۹۲۷A = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_date_picker_text_normal_dark_theme);
            this.f۱۴۹۲۹C = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_date_picker_month_day_dark_theme);
            this.f۱۴۹۳۲F = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_date_picker_text_disabled_dark_theme);
            this.f۱۴۹۳۱E = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_date_picker_text_highlighted_dark_theme);
        } else {
            this.f۱۴۹۲۷A = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_date_picker_text_normal);
            this.f۱۴۹۲۹C = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_date_picker_month_day);
            this.f۱۴۹۳۲F = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_date_picker_text_disabled);
            this.f۱۴۹۳۱E = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_date_picker_text_highlighted);
        }
        this.f۱۴۹۲۸B = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_white);
        this.f۱۴۹۳۰D = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_accent_color);
        res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_white);
        this.f۱۴۹۴۱j = new StringBuilder(50);
        f۱۴۹۲۲K = res.getDimensionPixelSize(Cc.mdtp_day_number_size);
        f۱۴۹۲۳L = res.getDimensionPixelSize(Cc.mdtp_month_label_size);
        f۱۴۹۲۴M = res.getDimensionPixelSize(Cc.mdtp_month_day_label_text_size);
        f۱۴۹۲۵N = res.getDimensionPixelOffset(Cc.mdtp_month_list_item_header_height);
        f۱۴۹۲۶O = res.getDimensionPixelSize(Cc.mdtp_day_number_select_circle_radius);
        this.f۱۴۹۴۵n = (res.getDimensionPixelOffset(Cc.mdtp_date_picker_view_animator_height) - getMonthHeaderSize()) / 6;
        this.f۱۴۹۵۴w = getMonthViewTouchHelper();
        Cu.m۱۲۹۸۵a(this, this.f۱۴۹۵۴w);
        Cu.m۱۳۰۰۷f(this, 1);
        this.f۱۴۹۵۷z = true;
        m۱۷۹۶۹c();
    }

    public void setDatePickerController(AbstractCa controller) {
        this.f۱۴۹۳۴c = controller;
    }

    /* access modifiers changed from: protected */
    public Ca getMonthViewTouchHelper() {
        return new Ca(this);
    }

    public void setAccessibilityDelegate(View.AccessibilityDelegate delegate) {
        if (!this.f۱۴۹۵۷z) {
            super.setAccessibilityDelegate(delegate);
        }
    }

    public void setOnDayClickListener(AbstractCb listener) {
        this.f۱۴۹۵۶y = listener;
    }

    public boolean dispatchHoverEvent(MotionEvent event) {
        if (this.f۱۴۹۵۴w.m۱۳۲۷۳a(event)) {
            return true;
        }
        return super.dispatchHoverEvent(event);
    }

    public boolean onTouchEvent(MotionEvent event) {
        int day;
        if (event.getAction() == 1 && (day = m۱۷۹۵۹a(event.getX(), event.getY())) >= 0) {
            m۱۷۹۵۲a(day);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۷۹۶۹c() {
        this.f۱۴۹۳۸g = new Paint();
        this.f۱۴۹۳۸g.setFakeBoldText(true);
        this.f۱۴۹۳۸g.setAntiAlias(true);
        this.f۱۴۹۳۸g.setTextSize((float) f۱۴۹۲۳L);
        this.f۱۴۹۳۸g.setTypeface(Typeface.create(this.f۱۴۹۳۶e, 1));
        this.f۱۴۹۳۸g.setColor(this.f۱۴۹۲۷A);
        this.f۱۴۹۳۸g.setTextAlign(Paint.Align.CENTER);
        this.f۱۴۹۳۸g.setStyle(Paint.Style.FILL);
        this.f۱۴۹۳۹h = new Paint();
        this.f۱۴۹۳۹h.setFakeBoldText(true);
        this.f۱۴۹۳۹h.setAntiAlias(true);
        this.f۱۴۹۳۹h.setColor(this.f۱۴۹۳۰D);
        this.f۱۴۹۳۹h.setTextAlign(Paint.Align.CENTER);
        this.f۱۴۹۳۹h.setStyle(Paint.Style.FILL);
        this.f۱۴۹۳۹h.setAlpha(255);
        this.f۱۴۹۴۰i = new Paint();
        this.f۱۴۹۴۰i.setAntiAlias(true);
        this.f۱۴۹۴۰i.setTextSize((float) f۱۴۹۲۴M);
        this.f۱۴۹۴۰i.setColor(this.f۱۴۹۲۹C);
        this.f۱۴۹۴۰i.setTypeface(Ch.m۱۷۹۹۳a(getContext(), "Roboto-Medium"));
        this.f۱۴۹۴۰i.setStyle(Paint.Style.FILL);
        this.f۱۴۹۴۰i.setTextAlign(Paint.Align.CENTER);
        this.f۱۴۹۴۰i.setFakeBoldText(true);
        this.f۱۴۹۳۷f = new Paint();
        this.f۱۴۹۳۷f.setAntiAlias(true);
        this.f۱۴۹۳۷f.setTextSize((float) f۱۴۹۲۲K);
        this.f۱۴۹۳۷f.setStyle(Paint.Style.FILL);
        this.f۱۴۹۳۷f.setTextAlign(Paint.Align.CENTER);
        this.f۱۴۹۳۷f.setFakeBoldText(false);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        m۱۷۹۷۰c(canvas);
        m۱۷۹۶۱a(canvas);
        m۱۷۹۶۷b(canvas);
    }

    public void setMonthParams(HashMap<String, Integer> params) {
        if (params.containsKey("month") || params.containsKey("year")) {
            setTag(params);
            if (params.containsKey("height")) {
                this.f۱۴۹۴۵n = params.get("height").intValue();
                int i = this.f۱۴۹۴۵n;
                int i2 = f۱۴۹۲۰I;
                if (i < i2) {
                    this.f۱۴۹۴۵n = i2;
                }
            }
            if (params.containsKey("selected_day")) {
                this.f۱۴۹۴۷p = params.get("selected_day").intValue();
            }
            this.f۱۴۹۴۲k = params.get("month").intValue();
            this.f۱۴۹۴۳l = params.get("year").intValue();
            Cb today = new Cb();
            this.f۱۴۹۴۶o = false;
            this.f۱۴۹۴۸q = -1;
            this.f۱۴۹۵۲u.m۱۸۰۰۶a(this.f۱۴۹۴۳l, this.f۱۴۹۴۲k, 1);
            this.f۱۴۹۳۳G = this.f۱۴۹۵۲u.get(7);
            if (params.containsKey("week_start")) {
                this.f۱۴۹۴۹r = params.get("week_start").intValue();
            } else {
                this.f۱۴۹۴۹r = 7;
            }
            this.f۱۴۹۵۱t = Ci.m۱۷۹۹۴a(this.f۱۴۹۴۲k, this.f۱۴۹۴۳l);
            for (int i3 = 0; i3 < this.f۱۴۹۵۱t; i3++) {
                int day = i3 + 1;
                if (m۱۷۹۵۴a(day, today)) {
                    this.f۱۴۹۴۶o = true;
                    this.f۱۴۹۴۸q = day;
                }
            }
            this.f۱۴۹۵۵x = m۱۷۹۵۷e();
            this.f۱۴۹۵۴w.m۱۳۲۸۱d();
            return;
        }
        throw new InvalidParameterException("You must specify month and year for this view");
    }

    public void setSelectedDay(int day) {
        this.f۱۴۹۴۷p = day;
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۷۹۷۱d() {
        this.f۱۴۹۵۵x = 6;
        requestLayout();
    }

    /* renamed from: e  reason: contains not printable characters */
    private int m۱۷۹۵۷e() {
        int offset = m۱۷۹۶۵b();
        int i = this.f۱۴۹۵۱t;
        int i2 = this.f۱۴۹۵۰s;
        return ((i + offset) % i2 > 0 ? 1 : 0) + ((offset + i) / i2);
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۷۹۵۴a(int day, Cb today) {
        return this.f۱۴۹۴۳l == today.m۱۸۰۱۳h() && this.f۱۴۹۴۲k == today.m۱۸۰۰۹d() && day == today.m۱۸۰۰۷b();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), (this.f۱۴۹۴۵n * this.f۱۴۹۵۵x) + getMonthHeaderSize() + 5);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        this.f۱۴۹۴۴m = w;
        this.f۱۴۹۵۴w.m۱۳۲۸۱d();
    }

    public int getMonth() {
        return this.f۱۴۹۴۲k;
    }

    public int getYear() {
        return this.f۱۴۹۴۳l;
    }

    /* access modifiers changed from: protected */
    public int getMonthHeaderSize() {
        return f۱۴۹۲۵N;
    }

    private String getMonthAndYearString() {
        this.f۱۴۹۴۱j.setLength(0);
        return com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(this.f۱۴۹۵۲u.m۱۸۰۱۰e() + " " + this.f۱۴۹۵۲u.m۱۸۰۱۳h());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۷۹۷۰c(Canvas canvas) {
        canvas.drawText(getMonthAndYearString(), (float) ((this.f۱۴۹۴۴m + (this.f۱۴۹۳۵d * 2)) / 2), (float) ((getMonthHeaderSize() - f۱۴۹۲۴M) / 2), this.f۱۴۹۳۸g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۹۶۱a(Canvas canvas) {
        int y = getMonthHeaderSize() - (f۱۴۹۲۴M / 2);
        int dayWidthHalf = (this.f۱۴۹۴۴m - (this.f۱۴۹۳۵d * 2)) / (this.f۱۴۹۵۰s * 2);
        int i = 0;
        while (true) {
            int i2 = this.f۱۴۹۵۰s;
            if (i < i2) {
                int calendarDay = (this.f۱۴۹۴۹r + i) % i2;
                int x = (((i * 2) + 1) * dayWidthHalf) + this.f۱۴۹۳۵d;
                this.f۱۴۹۵۳v.set(7, calendarDay);
                canvas.drawText(this.f۱۴۹۵۳v.m۱۸۰۱۲g().substring(0, 1), (float) x, (float) y, this.f۱۴۹۴۰i);
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۹۶۷b(Canvas canvas) {
        int y = (((this.f۱۴۹۴۵n + f۱۴۹۲۲K) / 2) - f۱۴۹۲۱J) + getMonthHeaderSize();
        float dayWidthHalf = ((float) (this.f۱۴۹۴۴m - (this.f۱۴۹۳۵d * 2))) / (((float) this.f۱۴۹۵۰s) * 2.0f);
        int y2 = y;
        int j = m۱۷۹۶۵b();
        for (int dayNumber = 1; dayNumber <= this.f۱۴۹۵۱t; dayNumber++) {
            int x = (int) ((((float) ((j * 2) + 1)) * dayWidthHalf) + ((float) this.f۱۴۹۳۵d));
            int i = this.f۱۴۹۴۵n;
            int startY = y2 - (((f۱۴۹۲۲K + i) / 2) - f۱۴۹۲۱J);
            m۱۷۹۶۲a(canvas, this.f۱۴۹۴۳l, this.f۱۴۹۴۲k, dayNumber, x, y2, (int) (((float) x) - dayWidthHalf), (int) (((float) x) + dayWidthHalf), startY, startY + i);
            j++;
            if (j == this.f۱۴۹۵۰s) {
                y2 += this.f۱۴۹۴۵n;
                j = 0;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۹۶۵b() {
        int i = this.f۱۴۹۳۳G;
        if (i < this.f۱۴۹۴۹r) {
            i += this.f۱۴۹۵۰s;
        }
        return i - this.f۱۴۹۴۹r;
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۹۵۹a(float x, float y) {
        int day = m۱۷۹۶۶b(x, y);
        if (day < 1 || day > this.f۱۴۹۵۱t) {
            return -1;
        }
        return day;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۹۶۶b(float x, float y) {
        int dayStart = this.f۱۴۹۳۵d;
        if (x < ((float) dayStart) || x > ((float) (this.f۱۴۹۴۴m - this.f۱۴۹۳۵d))) {
            return -1;
        }
        return (((int) (((x - ((float) dayStart)) * ((float) this.f۱۴۹۵۰s)) / ((float) ((this.f۱۴۹۴۴m - dayStart) - this.f۱۴۹۳۵d)))) - m۱۷۹۶۵b()) + 1 + (this.f۱۴۹۵۰s * (((int) (y - ((float) getMonthHeaderSize()))) / this.f۱۴۹۴۵n));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۷۹۵۲a(int day) {
        if (!m۱۷۹۶۸b(this.f۱۴۹۴۳l, this.f۱۴۹۴۲k, day)) {
            AbstractCb bVar = this.f۱۴۹۵۶y;
            if (bVar != null) {
                bVar.m۱۷۹۸۱a(this, new AbstractCd.Ca(this.f۱۴۹۴۳l, this.f۱۴۹۴۲k, day));
            }
            this.f۱۴۹۵۴w.m۱۳۲۷۷b(day, 1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۷۹۶۸b(int year, int month, int day) {
        if (this.f۱۴۹۳۴c.m۱۷۹۰۲d() != null) {
            return !m۱۷۹۵۸e(year, month, day);
        }
        if (!m۱۷۹۵۶d(year, month, day) && !m۱۷۹۵۵c(year, month, day)) {
            return false;
        }
        return true;
    }

    /* renamed from: e  reason: contains not printable characters */
    private boolean m۱۷۹۵۸e(int year, int month, int day) {
        Cb[] selectableDays = this.f۱۴۹۳۴c.m۱۷۹۰۲d();
        for (Cb c : selectableDays) {
            if (year < c.m۱۸۰۱۳h()) {
                return false;
            }
            if (year <= c.m۱۸۰۱۳h()) {
                if (month < c.m۱۸۰۰۹d()) {
                    return false;
                }
                if (month > c.m۱۸۰۰۹d()) {
                    continue;
                } else if (day < c.m۱۸۰۰۷b()) {
                    return false;
                } else {
                    if (day <= c.m۱۸۰۰۷b()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: d  reason: contains not printable characters */
    private boolean m۱۷۹۵۶d(int year, int month, int day) {
        Cb minDate;
        AbstractCa aVar = this.f۱۴۹۳۴c;
        if (aVar == null || (minDate = aVar.m۱۷۹۰۸j()) == null) {
            return false;
        }
        if (year < minDate.m۱۸۰۱۳h()) {
            return true;
        }
        if (year > minDate.m۱۸۰۱۳h()) {
            return false;
        }
        if (month < minDate.m۱۸۰۰۹d()) {
            return true;
        }
        if (month <= minDate.m۱۸۰۰۹d() && day < minDate.m۱۸۰۰۷b()) {
            return true;
        }
        return false;
    }

    /* renamed from: c  reason: contains not printable characters */
    private boolean m۱۷۹۵۵c(int year, int month, int day) {
        Cb maxDate;
        AbstractCa aVar = this.f۱۴۹۳۴c;
        if (aVar == null || (maxDate = aVar.m۱۷۹۰۱c()) == null) {
            return false;
        }
        if (year > maxDate.m۱۸۰۱۳h()) {
            return true;
        }
        if (year < maxDate.m۱۸۰۱۳h()) {
            return false;
        }
        if (month > maxDate.m۱۸۰۰۹d()) {
            return true;
        }
        if (month >= maxDate.m۱۸۰۰۹d() && day > maxDate.m۱۸۰۰۹d()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۷۹۶۳a(int year, int month, int day) {
        Cb[] highlightedDays = this.f۱۴۹۳۴c.m۱۷۹۰۵g();
        if (highlightedDays == null) {
            return false;
        }
        for (Cb c : highlightedDays) {
            if (year < c.m۱۸۰۱۳h()) {
                break;
            }
            if (year <= c.m۱۸۰۱۳h()) {
                if (month < c.m۱۸۰۰۹d()) {
                    break;
                } else if (month > c.m۱۸۰۰۹d()) {
                    continue;
                } else if (day < c.m۱۸۰۰۷b()) {
                    break;
                } else if (day <= c.m۱۸۰۰۷b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public AbstractCd.Ca getAccessibilityFocus() {
        int day = this.f۱۴۹۵۴w.m۱۳۲۷۹c();
        if (day >= 0) {
            return new AbstractCd.Ca(this.f۱۴۹۴۳l, this.f۱۴۹۴۲k, day);
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۹۶۰a() {
        this.f۱۴۹۵۴w.m۱۷۹۷۹e();
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۷۹۶۴a(AbstractCd.Ca day) {
        int i;
        if (day.f۱۴۹۱۶b != this.f۱۴۹۴۳l || day.f۱۴۹۱۷c != this.f۱۴۹۴۲k || (i = day.f۱۴۹۱۸d) > this.f۱۴۹۵۱t) {
            return false;
        }
        this.f۱۴۹۵۴w.m۱۷۹۸۰e(i);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.e$a  reason: invalid class name */
    public class Ca extends AbstractCh {

        /* renamed from: n  reason: contains not printable characters */
        private final Rect f۱۴۹۵۸n = new Rect();

        /* renamed from: o  reason: contains not printable characters */
        private final Cb f۱۴۹۵۹o = new Cb();

        public Ca(View host) {
            super(host);
        }

        /* renamed from: e  reason: contains not printable characters */
        public void m۱۷۹۸۰e(int virtualViewId) {
            m۱۳۲۶۲a(AbstractCe.this).m۱۲۸۹۸a(virtualViewId, 64, null);
        }

        /* renamed from: e  reason: contains not printable characters */
        public void m۱۷۹۷۹e() {
            int focusedVirtualView = m۱۳۲۷۹c();
            if (focusedVirtualView != Integer.MIN_VALUE) {
                m۱۳۲۶۲a(AbstractCe.this).m۱۲۸۹۸a(focusedVirtualView, 128, null);
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.support.p۰۴۳v4.widget.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۷۹۷۲a(float x, float y) {
            int day = AbstractCe.this.m۱۷۹۵۹a(x, y);
            if (day >= 0) {
                return day;
            }
            return Integer.MIN_VALUE;
        }

        /* access modifiers changed from: protected */
        @Override // android.support.p۰۴۳v4.widget.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۹۷۶a(List<Integer> virtualViewIds) {
            for (int day = 1; day <= AbstractCe.this.f۱۴۹۵۱t; day++) {
                virtualViewIds.add(Integer.valueOf(day));
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.support.p۰۴۳v4.widget.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۹۷۵a(int virtualViewId, AccessibilityEvent event) {
            event.setContentDescription(m۱۷۹۷۸d(virtualViewId));
        }

        /* access modifiers changed from: protected */
        @Override // android.support.p۰۴۳v4.widget.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۹۷۴a(int virtualViewId, android.support.p۰۴۳v4.view.p۰۴۵d0.Cc node) {
            m۱۷۹۷۳a(virtualViewId, this.f۱۴۹۵۸n);
            node.m۱۲۸۵۰b(m۱۷۹۷۸d(virtualViewId));
            node.m۱۲۸۵۴c(this.f۱۴۹۵۸n);
            node.m۱۲۸۳۸a(16);
            if (virtualViewId == AbstractCe.this.f۱۴۹۴۷p) {
                node.m۱۲۸۷۹l(true);
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.support.p۰۴۳v4.widget.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۹۷۷a(int virtualViewId, int action, Bundle arguments) {
            if (action != 16) {
                return false;
            }
            AbstractCe.this.m۱۷۹۵۲a((AbstractCe) virtualViewId);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۹۷۳a(int day, Rect rect) {
            AbstractCe eVar = AbstractCe.this;
            int offsetX = eVar.f۱۴۹۳۵d;
            int offsetY = eVar.getMonthHeaderSize();
            AbstractCe eVar2 = AbstractCe.this;
            int cellHeight = eVar2.f۱۴۹۴۵n;
            int cellWidth = (eVar2.f۱۴۹۴۴m - (eVar2.f۱۴۹۳۵d * 2)) / eVar2.f۱۴۹۵۰s;
            int index = (day - 1) + eVar2.m۱۷۹۶۵b();
            int i = AbstractCe.this.f۱۴۹۵۰s;
            int x = ((index % i) * cellWidth) + offsetX;
            int y = ((index / i) * cellHeight) + offsetY;
            rect.set(x, y, x + cellWidth, y + cellHeight);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d  reason: contains not printable characters */
        public CharSequence m۱۷۹۷۸d(int day) {
            Cb bVar = this.f۱۴۹۵۹o;
            AbstractCe eVar = AbstractCe.this;
            bVar.m۱۸۰۰۶a(eVar.f۱۴۹۴۳l, eVar.f۱۴۹۴۲k, day);
            String date = com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(this.f۱۴۹۵۹o.m۱۸۰۰۸c());
            AbstractCe eVar2 = AbstractCe.this;
            if (day != eVar2.f۱۴۹۴۷p) {
                return date;
            }
            return eVar2.getContext().getString(Cg.mdtp_item_is_selected, date);
        }
    }
}
