package p۱۵۵ir.mirrajabi.persiancalendar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.p۰۴۳v4.app.AbstractCq;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.Cb;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۹e.Ca;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۰f.AbstractCa;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۰f.AbstractCb;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۰f.AbstractCd;

/* renamed from: ir.mirrajabi.persiancalendar.PersianCalendarView */
public class PersianCalendarView extends FrameLayout {

    /* renamed from: c  reason: contains not printable characters */
    private Cb f۱۶۳۷۰c;

    /* renamed from: d  reason: contains not printable characters */
    Ca f۱۶۳۷۱d = null;

    public PersianCalendarView(Context context) {
        super(context);
        m۱۹۶۶۴a(context, null);
    }

    public PersianCalendarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        m۱۹۶۶۴a(context, attrs);
    }

    public PersianCalendarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m۱۹۶۶۴a(context, attrs);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۹۶۶۴a(Context context, AttributeSet attrs) {
        Typeface typeface;
        Typeface typeface2;
        this.f۱۶۳۷۰c = Cb.m۱۹۶۶۸a(context);
        LayoutInflater.from(context).inflate(Cc.view_calendar, (ViewGroup) this, true);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, Ce.PersianCalendarView, 0, 0);
        if (typedArray.hasValue(Ce.PersianCalendarView_pcv_typefacePath) && (typeface2 = Typeface.createFromAsset(context.getAssets(), typedArray.getString(Ce.PersianCalendarView_pcv_typefacePath))) != null) {
            this.f۱۶۳۷۰c.m۱۹۶۹۲b(typeface2);
        }
        if (typedArray.hasValue(Ce.PersianCalendarView_pcv_headersTypefacePath) && (typeface = Typeface.createFromAsset(context.getAssets(), typedArray.getString(Ce.PersianCalendarView_pcv_headersTypefacePath))) != null) {
            this.f۱۶۳۷۰c.m۱۹۶۷۶a(typeface);
        }
        this.f۱۶۳۷۰c.m۱۹۶۷۵a((float) typedArray.getDimensionPixelSize(Ce.PersianCalendarView_pcv_fontSize, 25));
        this.f۱۶۳۷۰c.m۱۹۶۹۱b((float) typedArray.getDimensionPixelSize(Ce.PersianCalendarView_pcv_headersFontSize, 20));
        Cb bVar = this.f۱۶۳۷۰c;
        bVar.m۱۹۷۱۶k(typedArray.getResourceId(Ce.PersianCalendarView_pcv_todayBackground, bVar.m۱۹۷۲۲p()));
        Cb bVar2 = this.f۱۶۳۷۰c;
        bVar2.m۱۹۷۱۵j(typedArray.getResourceId(Ce.PersianCalendarView_pcv_selectedDayBackground, bVar2.m۱۹۷۲۰n()));
        Cb bVar3 = this.f۱۶۳۷۰c;
        bVar3.m۱۹۷۰۳d(typedArray.getColor(Ce.PersianCalendarView_pcv_colorDayName, bVar3.m۱۹۶۹۰b()));
        Cb bVar4 = this.f۱۶۳۷۰c;
        bVar4.m۱۹۶۹۹c(typedArray.getColor(Ce.PersianCalendarView_pcv_colorBackground, bVar4.m۱۹۷۰۴e()));
        Cb bVar5 = this.f۱۶۳۷۰c;
        bVar5.m۱۹۷۰۹g(typedArray.getColor(Ce.PersianCalendarView_pcv_colorHolidaySelected, bVar5.m۱۹۷۰۴e()));
        Cb bVar6 = this.f۱۶۳۷۰c;
        bVar6.m۱۹۷۰۷f(typedArray.getColor(Ce.PersianCalendarView_pcv_colorHoliday, bVar6.m۱۹۷۰۲d()));
        Cb bVar7 = this.f۱۶۳۷۰c;
        bVar7.m۱۹۷۱۳i(typedArray.getColor(Ce.PersianCalendarView_pcv_colorNormalDaySelected, bVar7.m۱۹۷۰۸g()));
        Cb bVar8 = this.f۱۶۳۷۰c;
        bVar8.m۱۹۷۱۱h(typedArray.getColor(Ce.PersianCalendarView_pcv_colorNormalDay, bVar8.m۱۹۷۰۶f()));
        Cb bVar9 = this.f۱۶۳۷۰c;
        bVar9.m۱۹۷۰۵e(typedArray.getColor(Ce.PersianCalendarView_pcv_eventUnderlineColor, bVar9.m۱۹۶۹۸c()));
        try {
            this.f۱۶۳۷۱d = (Ca) Ca.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
        setBackgroundColor(this.f۱۶۳۷۰c.m۱۹۶۷۴a());
        AbstractCq a = ((ActivityCe) getContext()).m۱۲۲۶۲e().m۱۲۳۲۰a();
        a.m۱۲۴۷۷a(Cb.fragment_holder, this.f۱۶۳۷۱d, Ca.class.getName());
        a.m۱۲۴۷۵a();
        typedArray.recycle();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۶۶۵a() {
        m۱۹۶۶۶a(1);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۹۶۶۷b() {
        m۱۹۶۶۶a(-1);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۶۶۶a(int offset) {
        this.f۱۶۳۷۱d.m۱۹۷۴۷e(-offset);
    }

    public Cb getCalendar() {
        return this.f۱۶۳۷۰c;
    }

    public void setOnDayClickedListener(AbstractCa listener) {
        this.f۱۶۳۷۰c.m۱۹۶۷۷a(listener);
    }

    public void setOnDayLongClickedListener(AbstractCb listener) {
        this.f۱۶۳۷۰c.m۱۹۶۷۸a(listener);
    }

    public void setOnMonthChangedListener(AbstractCd listener) {
        this.f۱۶۳۷۰c.m۱۹۶۸۰a(listener);
    }
}
