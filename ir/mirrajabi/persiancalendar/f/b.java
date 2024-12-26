package ir.mirrajabi.persiancalendar.f;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import ir.mirrajabi.persiancalendar.a;
import ir.mirrajabi.persiancalendar.core.models.CalendarEvent;
import ir.mirrajabi.persiancalendar.core.models.Day;
import ir.mirrajabi.persiancalendar.f.f.d;
import ir.mirrajabi.persiancalendar.f.g.c;
import ir.mirrajabi.persiancalendar.f.g.e;
import ir.mirrajabi.persiancalendar.f.g.f;
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

public class b {
    private static WeakReference<b> A;

    /* renamed from: a  reason: collision with root package name */
    private final String f۴۲۷۵a = b.class.getName();

    /* renamed from: b  reason: collision with root package name */
    private Context f۴۲۷۶b;

    /* renamed from: c  reason: collision with root package name */
    private Typeface f۴۲۷۷c;

    /* renamed from: d  reason: collision with root package name */
    private Typeface f۴۲۷۸d;

    /* renamed from: e  reason: collision with root package name */
    private int f۴۲۷۹e = -16777216;

    /* renamed from: f  reason: collision with root package name */
    private int f۴۲۸۰f = -65536;

    /* renamed from: g  reason: collision with root package name */
    private int f۴۲۸۱g = -65536;

    /* renamed from: h  reason: collision with root package name */
    private int f۴۲۸۲h = -1;
    private int i = -16776961;
    private int j = -3355444;
    private int k = -65536;
    private int l = a.circle_select;
    private int m = a.circle_current_day;
    private float n = 25.0f;
    private float o = 20.0f;
    private boolean p = true;
    private boolean q = true;
    private List<ir.mirrajabi.persiancalendar.f.g.b> r;
    private List<ir.mirrajabi.persiancalendar.f.g.b> s;
    private ir.mirrajabi.persiancalendar.f.f.a t;
    private ir.mirrajabi.persiancalendar.f.f.b u;
    private d v;
    private String[] w = {"فروردین", "اردیبهشت", "خرداد", "تیر", "مرداد", "شهریور", "مهر", "آبان", "آذر", "دی", "بهمن", "اسفند"};
    private String[] x = {"شنبه", "یک‌شنبه", "دوشنبه", "سه‌شنبه", "چهارشنبه", "پنج‌شنبه", "جمعه"};
    private char[] y = a.f۴۲۷۴c;
    private boolean z;

    private b(Context context) {
        this.f۴۲۷۶b = context;
        this.s = new ArrayList();
    }

    public static b a(Context context) {
        WeakReference<b> weakReference = A;
        if (weakReference == null || weakReference.get() == null) {
            A = new WeakReference<>(new b(context.getApplicationContext()));
        }
        return A.get();
    }

    public String b(String text) {
        if (Build.VERSION.SDK_INT <= 16) {
            return ir.mirrajabi.persiancalendar.g.a.a(text);
        }
        return text;
    }

    private void s() {
        if (this.f۴۲۷۷c == null) {
            this.f۴۲۷۷c = Typeface.createFromAsset(this.f۴۲۷۶b.getAssets(), "fonts/NotoNaskhArabic-Regular.ttf");
        }
        if (this.f۴۲۷۸d == null) {
            this.f۴۲۷۸d = Typeface.createFromAsset(this.f۴۲۷۶b.getAssets(), "fonts/NotoNaskhArabic-Regular.ttf");
        }
    }

    public void a(TextView textView) {
        s();
        textView.setTypeface(this.f۴۲۷۷c);
    }

    public void b(TextView textView) {
        a(textView);
        textView.setText(b(textView.getText().toString()));
    }

    public f o() {
        return ir.mirrajabi.persiancalendar.g.b.b(new c(a(new Date())));
    }

    public Calendar a(Date date) {
        Calendar calendar = Calendar.getInstance();
        if (this.z) {
            calendar.setTimeZone(TimeZone.getTimeZone("Asia/Tehran"));
        }
        calendar.setTime(date);
        return calendar;
    }

    public String a(int number) {
        return a(Integer.toString(number));
    }

    public String a(String number) {
        if (this.y == a.f۴۲۷۳b) {
            return number;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = number.toCharArray();
        for (char i2 : charArray) {
            if (Character.isDigit(i2)) {
                sb.append(this.y[Integer.parseInt(i2 + "")]);
            } else {
                sb.append(i2);
            }
        }
        return sb.toString();
    }

    public boolean q() {
        return this.p;
    }

    public boolean r() {
        return this.q;
    }

    public b a(boolean highlightOfficialEvents) {
        this.q = highlightOfficialEvents;
        return this;
    }

    public String[] c(ir.mirrajabi.persiancalendar.f.g.a date) {
        return (String[]) this.w.clone();
    }

    public String a(ir.mirrajabi.persiancalendar.f.g.a date) {
        return c(date)[date.b() - 1];
    }

    public String b(ir.mirrajabi.persiancalendar.f.g.a date) {
        if (date instanceof e) {
            date = ir.mirrajabi.persiancalendar.g.b.a((e) date);
        } else if (date instanceof f) {
            date = ir.mirrajabi.persiancalendar.g.b.a((f) date);
        }
        return this.x[date.a() % 7];
    }

    private String a(InputStream is) {
        Scanner s2 = new Scanner(is).useDelimiter("\\A");
        return s2.hasNext() ? s2.next() : "";
    }

    private String l(int res) {
        return a(this.f۴۲۷۶b.getResources().openRawResource(res));
    }

    private List<ir.mirrajabi.persiancalendar.f.g.b> t() {
        List<CalendarEvent> result = new ArrayList<>();
        try {
            JSONArray days = new JSONObject(l(ir.mirrajabi.persiancalendar.d.events)).getJSONArray("events");
            int length = days.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject event = days.getJSONObject(i2);
                int year = event.getInt("year");
                int month = event.getInt("month");
                int day = event.getInt("day");
                result.add(new ir.mirrajabi.persiancalendar.f.g.b(new f(year, month, day), event.getString("title"), event.getBoolean("holiday")));
            }
        } catch (JSONException e2) {
            Log.e(this.f۴۲۷۵a, e2.getMessage());
        }
        return result;
    }

    public List<ir.mirrajabi.persiancalendar.f.g.b> c(f day) {
        if (this.r == null) {
            this.r = t();
        }
        return a(day, this.r);
    }

    public List<ir.mirrajabi.persiancalendar.f.g.b> a(f day) {
        List<CalendarEvent> events = c(day);
        events.addAll(b(day));
        return events;
    }

    public String a(f day, boolean holiday) {
        String titles = "";
        boolean first = true;
        Iterator<CalendarEvent> it = a(day).iterator();
        while (it.hasNext()) {
            ir.mirrajabi.persiancalendar.f.g.b event = (ir.mirrajabi.persiancalendar.f.g.b) it.next();
            if (event.c() == holiday) {
                if (first) {
                    first = false;
                } else {
                    titles = titles + "\n";
                }
                titles = titles + event.b();
            }
        }
        return titles;
    }

    public List<ir.mirrajabi.persiancalendar.f.g.d> b(int offset) {
        List<Day> days = new ArrayList<>();
        f persianDate = o();
        int month = (persianDate.b() - offset) - 1;
        int year = persianDate.d() + (month / 12);
        int month2 = month % 12;
        if (month2 < 0) {
            year--;
            month2 += 12;
        }
        persianDate.b(month2 + 1);
        persianDate.c(year);
        persianDate.a(1);
        int dayOfWeek = ir.mirrajabi.persiancalendar.g.b.a(persianDate).a() % 7;
        try {
            f today = o();
            for (int i2 = 1; i2 <= 31; i2++) {
                persianDate.a(i2);
                ir.mirrajabi.persiancalendar.f.g.d day = new ir.mirrajabi.persiancalendar.f.g.d();
                day.a(a(i2));
                day.a(dayOfWeek);
                if (dayOfWeek == 6 || !TextUtils.isEmpty(a(persianDate, true))) {
                    day.a(true);
                }
                if (this.p && b(persianDate).size() > 0) {
                    day.a(true, true);
                }
                if (this.q && c(persianDate).size() > 0) {
                    day.a(true, false);
                }
                day.a(persianDate.clone());
                if (persianDate.a(today)) {
                    day.b(true);
                }
                days.add(day);
                dayOfWeek++;
                if (dayOfWeek == 7) {
                    dayOfWeek = 0;
                }
            }
        } catch (ir.mirrajabi.persiancalendar.f.d.a e2) {
        }
        return days;
    }

    public b b(Typeface typeface) {
        this.f۴۲۷۷c = typeface;
        return this;
    }

    public int a() {
        return this.f۴۲۷۹e;
    }

    public b c(int colorBackground) {
        this.f۴۲۷۹e = colorBackground;
        return this;
    }

    public int b() {
        return this.j;
    }

    public b d(int colorDayName) {
        this.j = colorDayName;
        return this;
    }

    public int d() {
        return this.f۴۲۸۰f;
    }

    public b f(int colorHoliday) {
        this.f۴۲۸۰f = colorHoliday;
        return this;
    }

    public int e() {
        return this.f۴۲۸۱g;
    }

    public b g(int colorHolidaySelected) {
        this.f۴۲۸۱g = colorHolidaySelected;
        return this;
    }

    public b h(int colorNormalDay) {
        this.f۴۲۸۲h = colorNormalDay;
        return this;
    }

    public int f() {
        return this.f۴۲۸۲h;
    }

    public int g() {
        return this.i;
    }

    public b i(int colorNormalDaySelected) {
        this.i = colorNormalDaySelected;
        return this;
    }

    public int c() {
        return this.k;
    }

    public b e(int colorEventUnderline) {
        this.k = colorEventUnderline;
        return this;
    }

    public float h() {
        return this.n;
    }

    public b a(float daysFontSize) {
        this.n = daysFontSize;
        return this;
    }

    public float i() {
        return this.o;
    }

    public b b(float headersFontSize) {
        this.o = headersFontSize;
        return this;
    }

    public List<ir.mirrajabi.persiancalendar.f.g.b> b(f day) {
        return a(day, this.s);
    }

    private List<ir.mirrajabi.persiancalendar.f.g.b> a(f day, List<ir.mirrajabi.persiancalendar.f.g.b> list) {
        List<CalendarEvent> result = new ArrayList<>();
        for (ir.mirrajabi.persiancalendar.f.g.b calendarEvent : list) {
            if (calendarEvent.a().a(day)) {
                result.add(calendarEvent);
            }
        }
        return result;
    }

    public void a(ir.mirrajabi.persiancalendar.f.g.b event) {
        this.s.add(event);
    }

    public b a(ir.mirrajabi.persiancalendar.f.f.a onDayClickedListener) {
        this.t = onDayClickedListener;
        return this;
    }

    public ir.mirrajabi.persiancalendar.f.f.a k() {
        return this.t;
    }

    public b a(ir.mirrajabi.persiancalendar.f.f.b onDayLongClickedListener) {
        this.u = onDayLongClickedListener;
        return this;
    }

    public ir.mirrajabi.persiancalendar.f.f.b l() {
        return this.u;
    }

    public b a(d onMonthChangedListener) {
        this.v = onMonthChangedListener;
        return this;
    }

    public b a(ir.mirrajabi.persiancalendar.f.f.c onEventUpdateListener) {
        return this;
    }

    public d m() {
        return this.v;
    }

    public int p() {
        return this.m;
    }

    public b k(int todayBackground) {
        this.m = todayBackground;
        return this;
    }

    public int n() {
        return this.l;
    }

    public b j(int selectedDayBackground) {
        this.l = selectedDayBackground;
        return this;
    }

    public Typeface j() {
        return this.f۴۲۷۸d;
    }

    public b a(Typeface headersTypeface) {
        this.f۴۲۷۸d = headersTypeface;
        return this;
    }
}
