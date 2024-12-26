package ir.mirrajabi.persiancalendar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v4.app.q;
import android.support.v7.app.e;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ir.mirrajabi.persiancalendar.f.b;
import ir.mirrajabi.persiancalendar.f.e.a;
import ir.mirrajabi.persiancalendar.f.f.d;

public class PersianCalendarView extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    private b f۴۲۶۹c;

    /* renamed from: d  reason: collision with root package name */
    a f۴۲۷۰d = null;

    public PersianCalendarView(Context context) {
        super(context);
        a(context, null);
    }

    public PersianCalendarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        a(context, attrs);
    }

    public PersianCalendarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        a(context, attrs);
    }

    private void a(Context context, AttributeSet attrs) {
        Typeface typeface;
        Typeface typeface2;
        this.f۴۲۶۹c = b.a(context);
        LayoutInflater.from(context).inflate(c.view_calendar, (ViewGroup) this, true);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, e.PersianCalendarView, 0, 0);
        if (typedArray.hasValue(e.PersianCalendarView_pcv_typefacePath) && (typeface2 = Typeface.createFromAsset(context.getAssets(), typedArray.getString(e.PersianCalendarView_pcv_typefacePath))) != null) {
            this.f۴۲۶۹c.b(typeface2);
        }
        if (typedArray.hasValue(e.PersianCalendarView_pcv_headersTypefacePath) && (typeface = Typeface.createFromAsset(context.getAssets(), typedArray.getString(e.PersianCalendarView_pcv_headersTypefacePath))) != null) {
            this.f۴۲۶۹c.a(typeface);
        }
        this.f۴۲۶۹c.a((float) typedArray.getDimensionPixelSize(e.PersianCalendarView_pcv_fontSize, 25));
        this.f۴۲۶۹c.b((float) typedArray.getDimensionPixelSize(e.PersianCalendarView_pcv_headersFontSize, 20));
        b bVar = this.f۴۲۶۹c;
        bVar.k(typedArray.getResourceId(e.PersianCalendarView_pcv_todayBackground, bVar.p()));
        b bVar2 = this.f۴۲۶۹c;
        bVar2.j(typedArray.getResourceId(e.PersianCalendarView_pcv_selectedDayBackground, bVar2.n()));
        b bVar3 = this.f۴۲۶۹c;
        bVar3.d(typedArray.getColor(e.PersianCalendarView_pcv_colorDayName, bVar3.b()));
        b bVar4 = this.f۴۲۶۹c;
        bVar4.c(typedArray.getColor(e.PersianCalendarView_pcv_colorBackground, bVar4.e()));
        b bVar5 = this.f۴۲۶۹c;
        bVar5.g(typedArray.getColor(e.PersianCalendarView_pcv_colorHolidaySelected, bVar5.e()));
        b bVar6 = this.f۴۲۶۹c;
        bVar6.f(typedArray.getColor(e.PersianCalendarView_pcv_colorHoliday, bVar6.d()));
        b bVar7 = this.f۴۲۶۹c;
        bVar7.i(typedArray.getColor(e.PersianCalendarView_pcv_colorNormalDaySelected, bVar7.g()));
        b bVar8 = this.f۴۲۶۹c;
        bVar8.h(typedArray.getColor(e.PersianCalendarView_pcv_colorNormalDay, bVar8.f()));
        b bVar9 = this.f۴۲۶۹c;
        bVar9.e(typedArray.getColor(e.PersianCalendarView_pcv_eventUnderlineColor, bVar9.c()));
        try {
            this.f۴۲۷۰d = (a) a.class.newInstance();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        }
        setBackgroundColor(this.f۴۲۶۹c.a());
        q a2 = ((e) getContext()).e().a();
        a2.a(b.fragment_holder, this.f۴۲۷۰d, a.class.getName());
        a2.a();
        typedArray.recycle();
    }

    public void a() {
        a(1);
    }

    public void b() {
        a(-1);
    }

    public void a(int offset) {
        this.f۴۲۷۰d.e(-offset);
    }

    public b getCalendar() {
        return this.f۴۲۶۹c;
    }

    public void setOnDayClickedListener(ir.mirrajabi.persiancalendar.f.f.a listener) {
        this.f۴۲۶۹c.a(listener);
    }

    public void setOnDayLongClickedListener(ir.mirrajabi.persiancalendar.f.f.b listener) {
        this.f۴۲۶۹c.a(listener);
    }

    public void setOnMonthChangedListener(d listener) {
        this.f۴۲۶۹c.a(listener);
    }
}
