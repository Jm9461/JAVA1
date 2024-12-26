package p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import ir.mirrajabi.persiancalendar.core.models.CalendarEvent;
import ir.mirrajabi.persiancalendar.core.models.Day;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p۱۵۵ir.mirrajabi.persiancalendar.Ca;
import p۱۵۵ir.mirrajabi.persiancalendar.Cd;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۰f.AbstractCa;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۰f.AbstractCb;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۰f.AbstractCc;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۰f.AbstractCd;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cc;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Ce;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cf;

/* renamed from: ir.mirrajabi.persiancalendar.f.b  reason: invalid class name */
public class Cb {

    /* renamed from: A  reason: contains not printable characters */
    private static WeakReference<Cb> f۱۶۳۷۶A;

    /* renamed from: a  reason: contains not printable characters */
    private final String f۱۶۳۷۷a = Cb.class.getName();

    /* renamed from: b  reason: contains not printable characters */
    private Context f۱۶۳۷۸b;

    /* renamed from: c  reason: contains not printable characters */
    private Typeface f۱۶۳۷۹c;

    /* renamed from: d  reason: contains not printable characters */
    private Typeface f۱۶۳۸۰d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۶۳۸۱e = -16777216;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۶۳۸۲f = -65536;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۶۳۸۳g = -65536;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۶۳۸۴h = -1;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۶۳۸۵i = -16776961;

    /* renamed from: j  reason: contains not printable characters */
    private int f۱۶۳۸۶j = -3355444;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۶۳۸۷k = -65536;

    /* renamed from: l  reason: contains not printable characters */
    private int f۱۶۳۸۸l = Ca.circle_select;

    /* renamed from: m  reason: contains not printable characters */
    private int f۱۶۳۸۹m = Ca.circle_current_day;

    /* renamed from: n  reason: contains not printable characters */
    private float f۱۶۳۹۰n = 25.0f;

    /* renamed from: o  reason: contains not printable characters */
    private float f۱۶۳۹۱o = 20.0f;

    /* renamed from: p  reason: contains not printable characters */
    private boolean f۱۶۳۹۲p = true;

    /* renamed from: q  reason: contains not printable characters */
    private boolean f۱۶۳۹۳q = true;

    /* renamed from: r  reason: contains not printable characters */
    private List<p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cb> f۱۶۳۹۴r;

    /* renamed from: s  reason: contains not printable characters */
    private List<p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cb> f۱۶۳۹۵s;

    /* renamed from: t  reason: contains not printable characters */
    private AbstractCa f۱۶۳۹۶t;

    /* renamed from: u  reason: contains not printable characters */
    private AbstractCb f۱۶۳۹۷u;

    /* renamed from: v  reason: contains not printable characters */
    private AbstractCd f۱۶۳۹۸v;

    /* renamed from: w  reason: contains not printable characters */
    private String[] f۱۶۳۹۹w = {"فروردین", "اردیبهشت", "خرداد", "تیر", "مرداد", "شهریور", "مهر", "آبان", "آذر", "دی", "بهمن", "اسفند"};

    /* renamed from: x  reason: contains not printable characters */
    private String[] f۱۶۴۰۰x = {"شنبه", "یک‌شنبه", "دوشنبه", "سه‌شنبه", "چهارشنبه", "پنج‌شنبه", "جمعه"};

    /* renamed from: y  reason: contains not printable characters */
    private char[] f۱۶۴۰۱y = Ca.f۱۶۳۷۵c;

    /* renamed from: z  reason: contains not printable characters */
    private boolean f۱۶۴۰۲z;

    private Cb(Context context) {
        this.f۱۶۳۷۸b = context;
        this.f۱۶۳۹۵s = new ArrayList();
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cb m۱۹۶۶۸a(Context context) {
        WeakReference<Cb> weakReference = f۱۶۳۷۶A;
        if (weakReference == null || weakReference.get() == null) {
            f۱۶۳۷۶A = new WeakReference<>(new Cb(context.getApplicationContext()));
        }
        return f۱۶۳۷۶A.get();
    }

    /* renamed from: b  reason: contains not printable characters */
    public String m۱۹۶۹۴b(String text) {
        if (Build.VERSION.SDK_INT <= 16) {
            return p۱۵۵ir.mirrajabi.persiancalendar.p۱۶۲g.Ca.m۱۹۸۰۳a(text);
        }
        return text;
    }

    /* renamed from: s  reason: contains not printable characters */
    private void m۱۹۶۷۲s() {
        if (this.f۱۶۳۷۹c == null) {
            this.f۱۶۳۷۹c = Typeface.createFromAsset(this.f۱۶۳۷۸b.getAssets(), "fonts/NotoNaskhArabic-Regular.ttf");
        }
        if (this.f۱۶۳۸۰d == null) {
            this.f۱۶۳۸۰d = Typeface.createFromAsset(this.f۱۶۳۷۸b.getAssets(), "fonts/NotoNaskhArabic-Regular.ttf");
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۶۸۸a(TextView textView) {
        m۱۹۶۷۲s();
        textView.setTypeface(this.f۱۶۳۷۹c);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۹۶۹۷b(TextView textView) {
        m۱۹۶۸۸a(textView);
        textView.setText(m۱۹۶۹۴b(textView.getText().toString()));
    }

    /* renamed from: o  reason: contains not printable characters */
    public Cf m۱۹۷۲۱o() {
        return p۱۵۵ir.mirrajabi.persiancalendar.p۱۶۲g.Cb.m۱۹۸۱۵b(new Cc(m۱۹۶۸۶a(new Date())));
    }

    /* renamed from: a  reason: contains not printable characters */
    public Calendar m۱۹۶۸۶a(Date date) {
        Calendar calendar = Calendar.getInstance();
        if (this.f۱۶۴۰۲z) {
            calendar.setTimeZone(TimeZone.getTimeZone("Asia/Tehran"));
        }
        calendar.setTime(date);
        return calendar;
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۹۶۸۲a(int number) {
        return m۱۹۶۸۵a(Integer.toString(number));
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۹۶۸۵a(String number) {
        if (this.f۱۶۴۰۱y == Ca.f۱۶۳۷۴b) {
            return number;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = number.toCharArray();
        for (char i : charArray) {
            if (Character.isDigit(i)) {
                sb.append(this.f۱۶۴۰۱y[Integer.parseInt(i + "")]);
            } else {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    /* renamed from: q  reason: contains not printable characters */
    public boolean m۱۹۷۲۳q() {
        return this.f۱۶۳۹۲p;
    }

    /* renamed from: r  reason: contains not printable characters */
    public boolean m۱۹۷۲۴r() {
        return this.f۱۶۳۹۳q;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۹۶۸۱a(boolean highlightOfficialEvents) {
        this.f۱۶۳۹۳q = highlightOfficialEvents;
        return this;
    }

    /* renamed from: c  reason: contains not printable characters */
    public String[] m۱۹۷۰۱c(p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.AbstractCa date) {
        return (String[]) this.f۱۶۳۹۹w.clone();
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۹۶۸۳a(p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.AbstractCa date) {
        return m۱۹۷۰۱c(date)[date.m۱۹۷۶۰b() - 1];
    }

    /* renamed from: b  reason: contains not printable characters */
    public String m۱۹۶۹۳b(p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.AbstractCa date) {
        if (date instanceof Ce) {
            date = p۱۵۵ir.mirrajabi.persiancalendar.p۱۶۲g.Cb.m۱۹۸۱۰a((Ce) date);
        } else if (date instanceof Cf) {
            date = p۱۵۵ir.mirrajabi.persiancalendar.p۱۶۲g.Cb.m۱۹۸۱۱a((Cf) date);
        }
        return this.f۱۶۴۰۰x[date.m۱۹۷۵۹a() % 7];
    }

    /* renamed from: a  reason: contains not printable characters */
    private String m۱۹۶۶۹a(InputStream is) {
        Scanner s = new Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

    /* renamed from: l  reason: contains not printable characters */
    private String m۱۹۶۷۱l(int res) {
        return m۱۹۶۶۹a(this.f۱۶۳۷۸b.getResources().openRawResource(res));
    }

    /* renamed from: t  reason: contains not printable characters */
    private List<p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cb> m۱۹۶۷۳t() {
        List<CalendarEvent> result = new ArrayList<>();
        try {
            JSONArray days = new JSONObject(m۱۹۶۷۱l(Cd.events)).getJSONArray("events");
            int length = days.length();
            for (int i = 0; i < length; i++) {
                JSONObject event = days.getJSONObject(i);
                int year = event.getInt("year");
                int month = event.getInt("month");
                int day = event.getInt("day");
                result.add(new p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cb(new Cf(year, month, day), event.getString("title"), event.getBoolean("holiday")));
            }
        } catch (JSONException e) {
            Log.e(this.f۱۶۳۷۷a, e.getMessage());
        }
        return result;
    }

    /* renamed from: c  reason: contains not printable characters */
    public List<p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cb> m۱۹۷۰۰c(Cf day) {
        if (this.f۱۶۳۹۴r == null) {
            this.f۱۶۳۹۴r = m۱۹۶۷۳t();
        }
        return m۱۹۶۷۰a(day, this.f۱۶۳۹۴r);
    }

    /* renamed from: a  reason: contains not printable characters */
    public List<p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cb> m۱۹۶۸۷a(Cf day) {
        List<CalendarEvent> events = m۱۹۷۰۰c(day);
        events.addAll(m۱۹۶۹۶b(day));
        return events;
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۹۶۸۴a(Cf day, boolean holiday) {
        String titles = "";
        boolean first = true;
        Iterator<CalendarEvent> it = m۱۹۶۸۷a(day).iterator();
        while (it.hasNext()) {
            p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cb event = (p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cb) it.next();
            if (event.m۱۹۷۶۳c() == holiday) {
                if (first) {
                    first = false;
                } else {
                    titles = titles + "\n";
                }
                titles = titles + event.m۱۹۷۶۲b();
            }
        }
        return titles;
    }

    /* renamed from: b  reason: contains not printable characters */
    public List<p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cd> m۱۹۶۹۵b(int offset) {
        List<Day> days = new ArrayList<>();
        Cf persianDate = m۱۹۷۲۱o();
        int month = (persianDate.m۱۹۷۹۵b() - offset) - 1;
        int year = persianDate.m۱۹۷۹۹d() + (month / 12);
        int month2 = month % 12;
        if (month2 < 0) {
            year--;
            month2 += 12;
        }
        persianDate.m۱۹۷۹۶b(month2 + 1);
        persianDate.m۱۹۷۹۸c(year);
        persianDate.m۱۹۷۹۳a(1);
        int dayOfWeek = p۱۵۵ir.mirrajabi.persiancalendar.p۱۶۲g.Cb.m۱۹۸۱۱a(persianDate).m۱۹۷۶۴a() % 7;
        try {
            Cf today = m۱۹۷۲۱o();
            for (int i = 1; i <= 31; i++) {
                persianDate.m۱۹۷۹۳a(i);
                p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cd day = new p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cd();
                day.m۱۹۷۷۵a(m۱۹۶۸۲a(i));
                day.m۱۹۷۷۳a(dayOfWeek);
                if (dayOfWeek == 6 || !TextUtils.isEmpty(m۱۹۶۸۴a(persianDate, true))) {
                    day.m۱۹۷۷۶a(true);
                }
                if (this.f۱۶۳۹۲p && m۱۹۶۹۶b(persianDate).size() > 0) {
                    day.m۱۹۷۷۷a(true, true);
                }
                if (this.f۱۶۳۹۳q && m۱۹۷۰۰c(persianDate).size() > 0) {
                    day.m۱۹۷۷۷a(true, false);
                }
                day.m۱۹۷۷۴a(persianDate.clone());
                if (persianDate.m۱۹۷۹۴a(today)) {
                    day.m۱۹۷۷۹b(true);
                }
                days.add(day);
                dayOfWeek++;
                if (dayOfWeek == 7) {
                    dayOfWeek = 0;
                }
            }
        } catch (p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۸d.Ca e) {
        }
        return days;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cb m۱۹۶۹۲b(Typeface typeface) {
        this.f۱۶۳۷۹c = typeface;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۹۶۷۴a() {
        return this.f۱۶۳۸۱e;
    }

    /* renamed from: c  reason: contains not printable characters */
    public Cb m۱۹۶۹۹c(int colorBackground) {
        this.f۱۶۳۸۱e = colorBackground;
        return this;
    }

    /* renamed from: b  reason: contains not printable characters */
    public int m۱۹۶۹۰b() {
        return this.f۱۶۳۸۶j;
    }

    /* renamed from: d  reason: contains not printable characters */
    public Cb m۱۹۷۰۳d(int colorDayName) {
        this.f۱۶۳۸۶j = colorDayName;
        return this;
    }

    /* renamed from: d  reason: contains not printable characters */
    public int m۱۹۷۰۲d() {
        return this.f۱۶۳۸۲f;
    }

    /* renamed from: f  reason: contains not printable characters */
    public Cb m۱۹۷۰۷f(int colorHoliday) {
        this.f۱۶۳۸۲f = colorHoliday;
        return this;
    }

    /* renamed from: e  reason: contains not printable characters */
    public int m۱۹۷۰۴e() {
        return this.f۱۶۳۸۳g;
    }

    /* renamed from: g  reason: contains not printable characters */
    public Cb m۱۹۷۰۹g(int colorHolidaySelected) {
        this.f۱۶۳۸۳g = colorHolidaySelected;
        return this;
    }

    /* renamed from: h  reason: contains not printable characters */
    public Cb m۱۹۷۱۱h(int colorNormalDay) {
        this.f۱۶۳۸۴h = colorNormalDay;
        return this;
    }

    /* renamed from: f  reason: contains not printable characters */
    public int m۱۹۷۰۶f() {
        return this.f۱۶۳۸۴h;
    }

    /* renamed from: g  reason: contains not printable characters */
    public int m۱۹۷۰۸g() {
        return this.f۱۶۳۸۵i;
    }

    /* renamed from: i  reason: contains not printable characters */
    public Cb m۱۹۷۱۳i(int colorNormalDaySelected) {
        this.f۱۶۳۸۵i = colorNormalDaySelected;
        return this;
    }

    /* renamed from: c  reason: contains not printable characters */
    public int m۱۹۶۹۸c() {
        return this.f۱۶۳۸۷k;
    }

    /* renamed from: e  reason: contains not printable characters */
    public Cb m۱۹۷۰۵e(int colorEventUnderline) {
        this.f۱۶۳۸۷k = colorEventUnderline;
        return this;
    }

    /* renamed from: h  reason: contains not printable characters */
    public float m۱۹۷۱۰h() {
        return this.f۱۶۳۹۰n;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۹۶۷۵a(float daysFontSize) {
        this.f۱۶۳۹۰n = daysFontSize;
        return this;
    }

    /* renamed from: i  reason: contains not printable characters */
    public float m۱۹۷۱۲i() {
        return this.f۱۶۳۹۱o;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cb m۱۹۶۹۱b(float headersFontSize) {
        this.f۱۶۳۹۱o = headersFontSize;
        return this;
    }

    /* renamed from: b  reason: contains not printable characters */
    public List<p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cb> m۱۹۶۹۶b(Cf day) {
        return m۱۹۶۷۰a(day, this.f۱۶۳۹۵s);
    }

    /* renamed from: a  reason: contains not printable characters */
    private List<p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cb> m۱۹۶۷۰a(Cf day, List<p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cb> list) {
        List<CalendarEvent> result = new ArrayList<>();
        for (p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cb calendarEvent : list) {
            if (calendarEvent.m۱۹۷۶۱a().m۱۹۷۹۴a(day)) {
                result.add(calendarEvent);
            }
        }
        return result;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۶۸۹a(p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cb event) {
        this.f۱۶۳۹۵s.add(event);
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۹۶۷۷a(AbstractCa onDayClickedListener) {
        this.f۱۶۳۹۶t = onDayClickedListener;
        return this;
    }

    /* renamed from: k  reason: contains not printable characters */
    public AbstractCa m۱۹۷۱۷k() {
        return this.f۱۶۳۹۶t;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۹۶۷۸a(AbstractCb onDayLongClickedListener) {
        this.f۱۶۳۹۷u = onDayLongClickedListener;
        return this;
    }

    /* renamed from: l  reason: contains not printable characters */
    public AbstractCb m۱۹۷۱۸l() {
        return this.f۱۶۳۹۷u;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۹۶۸۰a(AbstractCd onMonthChangedListener) {
        this.f۱۶۳۹۸v = onMonthChangedListener;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۹۶۷۹a(AbstractCc onEventUpdateListener) {
        return this;
    }

    /* renamed from: m  reason: contains not printable characters */
    public AbstractCd m۱۹۷۱۹m() {
        return this.f۱۶۳۹۸v;
    }

    /* renamed from: p  reason: contains not printable characters */
    public int m۱۹۷۲۲p() {
        return this.f۱۶۳۸۹m;
    }

    /* renamed from: k  reason: contains not printable characters */
    public Cb m۱۹۷۱۶k(int todayBackground) {
        this.f۱۶۳۸۹m = todayBackground;
        return this;
    }

    /* renamed from: n  reason: contains not printable characters */
    public int m۱۹۷۲۰n() {
        return this.f۱۶۳۸۸l;
    }

    /* renamed from: j  reason: contains not printable characters */
    public Cb m۱۹۷۱۵j(int selectedDayBackground) {
        this.f۱۶۳۸۸l = selectedDayBackground;
        return this;
    }

    /* renamed from: j  reason: contains not printable characters */
    public Typeface m۱۹۷۱۴j() {
        return this.f۱۶۳۸۰d;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۹۶۷۶a(Typeface headersTypeface) {
        this.f۱۶۳۸۰d = headersTypeface;
        return this;
    }
}
