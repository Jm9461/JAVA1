package ir.mirrajabi.persiancalendar.p۳۱۰f;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import ir.mirrajabi.persiancalendar.Ca;
import ir.mirrajabi.persiancalendar.Cd;
import ir.mirrajabi.persiancalendar.core.models.CalendarEvent;
import ir.mirrajabi.persiancalendar.core.models.Day;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۴f.InterfaceCa;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۴f.InterfaceCb;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۴f.InterfaceCc;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۴f.InterfaceCd;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.AbstractCa;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cc;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Ce;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cf;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ir.mirrajabi.persiancalendar.f.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb {

    /* renamed from: A, reason: contains not printable characters */
    private static WeakReference<Cb> f۱۶۳۷۶A;

    /* renamed from: b, reason: contains not printable characters */
    private Context f۱۶۳۷۸b;

    /* renamed from: c, reason: contains not printable characters */
    private Typeface f۱۶۳۷۹c;

    /* renamed from: d, reason: contains not printable characters */
    private Typeface f۱۶۳۸۰d;

    /* renamed from: r, reason: contains not printable characters */
    private List<ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cb> f۱۶۳۹۴r;

    /* renamed from: t, reason: contains not printable characters */
    private InterfaceCa f۱۶۳۹۶t;

    /* renamed from: u, reason: contains not printable characters */
    private InterfaceCb f۱۶۳۹۷u;

    /* renamed from: v, reason: contains not printable characters */
    private InterfaceCd f۱۶۳۹۸v;

    /* renamed from: z, reason: contains not printable characters */
    private boolean f۱۶۴۰۲z;

    /* renamed from: a, reason: contains not printable characters */
    private final String f۱۶۳۷۷a = Cb.class.getName();

    /* renamed from: e, reason: contains not printable characters */
    private int f۱۶۳۸۱e = -16777216;

    /* renamed from: f, reason: contains not printable characters */
    private int f۱۶۳۸۲f = -65536;

    /* renamed from: g, reason: contains not printable characters */
    private int f۱۶۳۸۳g = -65536;

    /* renamed from: h, reason: contains not printable characters */
    private int f۱۶۳۸۴h = -1;

    /* renamed from: i, reason: contains not printable characters */
    private int f۱۶۳۸۵i = -16776961;

    /* renamed from: j, reason: contains not printable characters */
    private int f۱۶۳۸۶j = -3355444;

    /* renamed from: k, reason: contains not printable characters */
    private int f۱۶۳۸۷k = -65536;

    /* renamed from: l, reason: contains not printable characters */
    private int f۱۶۳۸۸l = Ca.circle_select;

    /* renamed from: m, reason: contains not printable characters */
    private int f۱۶۳۸۹m = Ca.circle_current_day;

    /* renamed from: n, reason: contains not printable characters */
    private float f۱۶۳۹۰n = 25.0f;

    /* renamed from: o, reason: contains not printable characters */
    private float f۱۶۳۹۱o = 20.0f;

    /* renamed from: p, reason: contains not printable characters */
    private boolean f۱۶۳۹۲p = true;

    /* renamed from: q, reason: contains not printable characters */
    private boolean f۱۶۳۹۳q = true;

    /* renamed from: w, reason: contains not printable characters */
    private String[] f۱۶۳۹۹w = {"فروردین", "اردیبهشت", "خرداد", "تیر", "مرداد", "شهریور", "مهر", "آبان", "آذر", "دی", "بهمن", "اسفند"};

    /* renamed from: x, reason: contains not printable characters */
    private String[] f۱۶۴۰۰x = {"شنبه", "یک\u200cشنبه", "دوشنبه", "سه\u200cشنبه", "چهارشنبه", "پنج\u200cشنبه", "جمعه"};

    /* renamed from: y, reason: contains not printable characters */
    private char[] f۱۶۴۰۱y = Ca.f۱۶۳۷۵c;

    /* renamed from: s, reason: contains not printable characters */
    private List<ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cb> f۱۶۳۹۵s = new ArrayList();

    private Cb(Context context) {
        this.f۱۶۳۷۸b = context;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cb m۱۷۵۹۱a(Context context) {
        WeakReference<Cb> weakReference = f۱۶۳۷۶A;
        if (weakReference == null || weakReference.get() == null) {
            f۱۶۳۷۶A = new WeakReference<>(new Cb(context.getApplicationContext()));
        }
        return f۱۶۳۷۶A.get();
    }

    /* renamed from: b, reason: contains not printable characters */
    public String m۱۷۶۱۷b(String text) {
        return Build.VERSION.SDK_INT <= 16 ? ir.mirrajabi.persiancalendar.p۳۱۶g.Ca.m۱۷۷۲۹a(text) : text;
    }

    /* renamed from: s, reason: contains not printable characters */
    private void m۱۷۵۹۵s() {
        if (this.f۱۶۳۷۹c == null) {
            this.f۱۶۳۷۹c = Typeface.createFromAsset(this.f۱۶۳۷۸b.getAssets(), "fonts/NotoNaskhArabic-Regular.ttf");
        }
        if (this.f۱۶۳۸۰d == null) {
            this.f۱۶۳۸۰d = Typeface.createFromAsset(this.f۱۶۳۷۸b.getAssets(), "fonts/NotoNaskhArabic-Regular.ttf");
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۷۶۱۱a(TextView textView) {
        m۱۷۵۹۵s();
        textView.setTypeface(this.f۱۶۳۷۹c);
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۷۶۲۰b(TextView textView) {
        m۱۷۶۱۱a(textView);
        textView.setText(m۱۷۶۱۷b(textView.getText().toString()));
    }

    /* renamed from: o, reason: contains not printable characters */
    public Cf m۱۷۶۴۴o() {
        return ir.mirrajabi.persiancalendar.p۳۱۶g.Cb.m۱۷۷۴۱b(new Cc(m۱۷۶۰۹a(new Date())));
    }

    /* renamed from: a, reason: contains not printable characters */
    public Calendar m۱۷۶۰۹a(Date date) {
        Calendar calendar = Calendar.getInstance();
        if (this.f۱۶۴۰۲z) {
            calendar.setTimeZone(TimeZone.getTimeZone("Asia/Tehran"));
        }
        calendar.setTime(date);
        return calendar;
    }

    /* renamed from: a, reason: contains not printable characters */
    public String m۱۷۶۰۵a(int number) {
        return m۱۷۶۰۸a(Integer.toString(number));
    }

    /* renamed from: a, reason: contains not printable characters */
    public String m۱۷۶۰۸a(String number) {
        if (this.f۱۶۴۰۱y == Ca.f۱۶۳۷۴b) {
            return number;
        }
        StringBuilder sb = new StringBuilder();
        for (char i : number.toCharArray()) {
            if (Character.isDigit(i)) {
                sb.append(this.f۱۶۴۰۱y[Integer.parseInt(i + "")]);
            } else {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    /* renamed from: q, reason: contains not printable characters */
    public boolean m۱۷۶۴۶q() {
        return this.f۱۶۳۹۲p;
    }

    /* renamed from: r, reason: contains not printable characters */
    public boolean m۱۷۶۴۷r() {
        return this.f۱۶۳۹۳q;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cb m۱۷۶۰۴a(boolean highlightOfficialEvents) {
        this.f۱۶۳۹۳q = highlightOfficialEvents;
        return this;
    }

    /* renamed from: c, reason: contains not printable characters */
    public String[] m۱۷۶۲۴c(AbstractCa date) {
        return (String[]) this.f۱۶۳۹۹w.clone();
    }

    /* renamed from: a, reason: contains not printable characters */
    public String m۱۷۶۰۶a(AbstractCa date) {
        return m۱۷۶۲۴c(date)[date.mo۱۷۷۲۰b() - 1];
    }

    /* renamed from: b, reason: contains not printable characters */
    public String m۱۷۶۱۶b(AbstractCa date) {
        if (date instanceof Ce) {
            date = ir.mirrajabi.persiancalendar.p۳۱۶g.Cb.m۱۷۷۳۶a((Ce) date);
        } else if (date instanceof Cf) {
            date = ir.mirrajabi.persiancalendar.p۳۱۶g.Cb.m۱۷۷۳۷a((Cf) date);
        }
        return this.f۱۶۴۰۰x[date.mo۱۷۷۱۷a() % 7];
    }

    /* renamed from: a, reason: contains not printable characters */
    private String m۱۷۵۹۲a(InputStream is) {
        Scanner s = new Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

    /* renamed from: l, reason: contains not printable characters */
    private String m۱۷۵۹۴l(int res) {
        return m۱۷۵۹۲a(this.f۱۶۳۷۸b.getResources().openRawResource(res));
    }

    /* renamed from: t, reason: contains not printable characters */
    private List<ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cb> m۱۷۵۹۶t() {
        List<CalendarEvent> result = new ArrayList<>();
        try {
            JSONArray days = new JSONObject(m۱۷۵۹۴l(Cd.events)).getJSONArray("events");
            int length = days.length();
            for (int i = 0; i < length; i++) {
                JSONObject event = days.getJSONObject(i);
                int year = event.getInt("year");
                int month = event.getInt("month");
                int day = event.getInt("day");
                String title = event.getString("title");
                boolean holiday = event.getBoolean("holiday");
                result.add(new ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cb(new Cf(year, month, day), title, holiday));
            }
        } catch (JSONException e2) {
            Log.e(this.f۱۶۳۷۷a, e2.getMessage());
        }
        return result;
    }

    /* renamed from: c, reason: contains not printable characters */
    public List<ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cb> m۱۷۶۲۳c(Cf day) {
        if (this.f۱۶۳۹۴r == null) {
            this.f۱۶۳۹۴r = m۱۷۵۹۶t();
        }
        return m۱۷۵۹۳a(day, this.f۱۶۳۹۴r);
    }

    /* renamed from: a, reason: contains not printable characters */
    public List<ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cb> m۱۷۶۱۰a(Cf day) {
        List<ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cb> list = m۱۷۶۲۳c(day);
        list.addAll(m۱۷۶۱۹b(day));
        return list;
    }

    /* renamed from: a, reason: contains not printable characters */
    public String m۱۷۶۰۷a(Cf day, boolean holiday) {
        String titles = "";
        boolean first = true;
        for (ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cb event : m۱۷۶۱۰a(day)) {
            if (event.m۱۷۶۸۶c() == holiday) {
                if (first) {
                    first = false;
                } else {
                    titles = titles + "\n";
                }
                titles = titles + event.m۱۷۶۸۵b();
            }
        }
        return titles;
    }

    /* renamed from: b, reason: contains not printable characters */
    public List<ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cd> m۱۷۶۱۸b(int offset) {
        List<Day> days = new ArrayList<>();
        Cf persianDate = m۱۷۶۴۴o();
        int month = (persianDate.mo۱۷۷۲۰b() - offset) - 1;
        int year = persianDate.m۱۷۷۲۴d() + (month / 12);
        int month2 = month % 12;
        if (month2 < 0) {
            year--;
            month2 += 12;
        }
        persianDate.m۱۷۷۲۱b(month2 + 1);
        persianDate.m۱۷۷۲۳c(year);
        persianDate.m۱۷۷۱۸a(1);
        int dayOfWeek = ir.mirrajabi.persiancalendar.p۳۱۶g.Cb.m۱۷۷۳۷a(persianDate).mo۱۷۷۱۷a() % 7;
        try {
            Cf today = m۱۷۶۴۴o();
            for (int i = 1; i <= 31; i++) {
                persianDate.m۱۷۷۱۸a(i);
                ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cd day = new ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cd();
                day.m۱۷۶۹۹a(m۱۷۶۰۵a(i));
                day.m۱۷۶۹۷a(dayOfWeek);
                if (dayOfWeek == 6 || !TextUtils.isEmpty(m۱۷۶۰۷a(persianDate, true))) {
                    day.m۱۷۷۰۰a(true);
                }
                if (this.f۱۶۳۹۲p && m۱۷۶۱۹b(persianDate).size() > 0) {
                    day.m۱۷۷۰۱a(true, true);
                }
                if (this.f۱۶۳۹۳q && m۱۷۶۲۳c(persianDate).size() > 0) {
                    day.m۱۷۷۰۱a(true, false);
                }
                day.m۱۷۶۹۸a(persianDate.m۱۷۷۲۶clone());
                if (persianDate.m۱۷۷۱۹a(today)) {
                    day.m۱۷۷۰۳b(true);
                }
                days.add(day);
                dayOfWeek++;
                if (dayOfWeek == 7) {
                    dayOfWeek = 0;
                }
            }
        } catch (ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۲d.Ca e2) {
        }
        return days;
    }

    /* renamed from: b, reason: contains not printable characters */
    public Cb m۱۷۶۱۵b(Typeface typeface) {
        this.f۱۶۳۷۹c = typeface;
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۱۷۵۹۷a() {
        return this.f۱۶۳۸۱e;
    }

    /* renamed from: c, reason: contains not printable characters */
    public Cb m۱۷۶۲۲c(int colorBackground) {
        this.f۱۶۳۸۱e = colorBackground;
        return this;
    }

    /* renamed from: b, reason: contains not printable characters */
    public int m۱۷۶۱۳b() {
        return this.f۱۶۳۸۶j;
    }

    /* renamed from: d, reason: contains not printable characters */
    public Cb m۱۷۶۲۶d(int colorDayName) {
        this.f۱۶۳۸۶j = colorDayName;
        return this;
    }

    /* renamed from: d, reason: contains not printable characters */
    public int m۱۷۶۲۵d() {
        return this.f۱۶۳۸۲f;
    }

    /* renamed from: f, reason: contains not printable characters */
    public Cb m۱۷۶۳۰f(int colorHoliday) {
        this.f۱۶۳۸۲f = colorHoliday;
        return this;
    }

    /* renamed from: e, reason: contains not printable characters */
    public int m۱۷۶۲۷e() {
        return this.f۱۶۳۸۳g;
    }

    /* renamed from: g, reason: contains not printable characters */
    public Cb m۱۷۶۳۲g(int colorHolidaySelected) {
        this.f۱۶۳۸۳g = colorHolidaySelected;
        return this;
    }

    /* renamed from: h, reason: contains not printable characters */
    public Cb m۱۷۶۳۴h(int colorNormalDay) {
        this.f۱۶۳۸۴h = colorNormalDay;
        return this;
    }

    /* renamed from: f, reason: contains not printable characters */
    public int m۱۷۶۲۹f() {
        return this.f۱۶۳۸۴h;
    }

    /* renamed from: g, reason: contains not printable characters */
    public int m۱۷۶۳۱g() {
        return this.f۱۶۳۸۵i;
    }

    /* renamed from: i, reason: contains not printable characters */
    public Cb m۱۷۶۳۶i(int colorNormalDaySelected) {
        this.f۱۶۳۸۵i = colorNormalDaySelected;
        return this;
    }

    /* renamed from: c, reason: contains not printable characters */
    public int m۱۷۶۲۱c() {
        return this.f۱۶۳۸۷k;
    }

    /* renamed from: e, reason: contains not printable characters */
    public Cb m۱۷۶۲۸e(int colorEventUnderline) {
        this.f۱۶۳۸۷k = colorEventUnderline;
        return this;
    }

    /* renamed from: h, reason: contains not printable characters */
    public float m۱۷۶۳۳h() {
        return this.f۱۶۳۹۰n;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cb m۱۷۵۹۸a(float daysFontSize) {
        this.f۱۶۳۹۰n = daysFontSize;
        return this;
    }

    /* renamed from: i, reason: contains not printable characters */
    public float m۱۷۶۳۵i() {
        return this.f۱۶۳۹۱o;
    }

    /* renamed from: b, reason: contains not printable characters */
    public Cb m۱۷۶۱۴b(float headersFontSize) {
        this.f۱۶۳۹۱o = headersFontSize;
        return this;
    }

    /* renamed from: b, reason: contains not printable characters */
    public List<ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cb> m۱۷۶۱۹b(Cf day) {
        return m۱۷۵۹۳a(day, this.f۱۶۳۹۵s);
    }

    /* renamed from: a, reason: contains not printable characters */
    private List<ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cb> m۱۷۵۹۳a(Cf day, List<ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cb> list) {
        List<CalendarEvent> result = new ArrayList<>();
        for (ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cb calendarEvent : list) {
            if (calendarEvent.m۱۷۶۸۴a().m۱۷۷۱۹a(day)) {
                result.add(calendarEvent);
            }
        }
        return result;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۷۶۱۲a(ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cb event) {
        this.f۱۶۳۹۵s.add(event);
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cb m۱۷۶۰۰a(InterfaceCa onDayClickedListener) {
        this.f۱۶۳۹۶t = onDayClickedListener;
        return this;
    }

    /* renamed from: k, reason: contains not printable characters */
    public InterfaceCa m۱۷۶۴۰k() {
        return this.f۱۶۳۹۶t;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cb m۱۷۶۰۱a(InterfaceCb onDayLongClickedListener) {
        this.f۱۶۳۹۷u = onDayLongClickedListener;
        return this;
    }

    /* renamed from: l, reason: contains not printable characters */
    public InterfaceCb m۱۷۶۴۱l() {
        return this.f۱۶۳۹۷u;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cb m۱۷۶۰۳a(InterfaceCd onMonthChangedListener) {
        this.f۱۶۳۹۸v = onMonthChangedListener;
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cb m۱۷۶۰۲a(InterfaceCc onEventUpdateListener) {
        return this;
    }

    /* renamed from: m, reason: contains not printable characters */
    public InterfaceCd m۱۷۶۴۲m() {
        return this.f۱۶۳۹۸v;
    }

    /* renamed from: p, reason: contains not printable characters */
    public int m۱۷۶۴۵p() {
        return this.f۱۶۳۸۹m;
    }

    /* renamed from: k, reason: contains not printable characters */
    public Cb m۱۷۶۳۹k(int todayBackground) {
        this.f۱۶۳۸۹m = todayBackground;
        return this;
    }

    /* renamed from: n, reason: contains not printable characters */
    public int m۱۷۶۴۳n() {
        return this.f۱۶۳۸۸l;
    }

    /* renamed from: j, reason: contains not printable characters */
    public Cb m۱۷۶۳۸j(int selectedDayBackground) {
        this.f۱۶۳۸۸l = selectedDayBackground;
        return this;
    }

    /* renamed from: j, reason: contains not printable characters */
    public Typeface m۱۷۶۳۷j() {
        return this.f۱۶۳۸۰d;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cb m۱۷۵۹۹a(Typeface headersTypeface) {
        this.f۱۶۳۸۰d = headersTypeface;
        return this;
    }
}
