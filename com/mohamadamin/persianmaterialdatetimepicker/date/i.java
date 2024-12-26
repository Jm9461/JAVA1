package com.mohamadamin.persianmaterialdatetimepicker.date;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.mohamadamin.persianmaterialdatetimepicker.c;
import com.mohamadamin.persianmaterialdatetimepicker.date.b;
import com.mohamadamin.persianmaterialdatetimepicker.f;
import java.util.ArrayList;
import java.util.List;

public class i extends ListView implements AdapterView.OnItemClickListener, b.c {

    /* renamed from: c  reason: collision with root package name */
    private final a f۳۳۵۱c;

    /* renamed from: d  reason: collision with root package name */
    private b f۳۳۵۲d;

    /* renamed from: e  reason: collision with root package name */
    private int f۳۳۵۳e;

    /* renamed from: f  reason: collision with root package name */
    private int f۳۳۵۴f;

    /* renamed from: g  reason: collision with root package name */
    private TextViewWithCircularIndicator f۳۳۵۵g;

    public i(Context context, a controller) {
        super(context);
        this.f۳۳۵۱c = controller;
        this.f۳۳۵۱c.a(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Resources res = context.getResources();
        this.f۳۳۵۳e = res.getDimensionPixelOffset(c.mdtp_date_picker_view_animator_height);
        this.f۳۳۵۴f = res.getDimensionPixelOffset(c.mdtp_year_label_height);
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(this.f۳۳۵۴f / 3);
        a(context);
        setOnItemClickListener(this);
        setSelector(new StateListDrawable());
        setDividerHeight(0);
        a();
    }

    private void a(Context context) {
        ArrayList<String> years = new ArrayList<>();
        for (int year = this.f۳۳۵۱c.a(); year <= this.f۳۳۵۱c.i(); year++) {
            years.add(String.format("%d", Integer.valueOf(year)));
        }
        this.f۳۳۵۲d = new b(context, f.mdtp_year_label_text_view, com.mohamadamin.persianmaterialdatetimepicker.j.a.a(years));
        setAdapter((ListAdapter) this.f۳۳۵۲d);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        this.f۳۳۵۱c.h();
        TextViewWithCircularIndicator clickedView = (TextViewWithCircularIndicator) view;
        if (clickedView != null) {
            TextViewWithCircularIndicator textViewWithCircularIndicator = this.f۳۳۵۵g;
            if (clickedView != textViewWithCircularIndicator) {
                if (textViewWithCircularIndicator != null) {
                    textViewWithCircularIndicator.a(false);
                    this.f۳۳۵۵g.requestLayout();
                }
                clickedView.a(true);
                clickedView.requestLayout();
                this.f۳۳۵۵g = clickedView;
            }
            this.f۳۳۵۱c.a(b(clickedView));
            this.f۳۳۵۲d.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    public static int b(TextView view) {
        return Integer.valueOf(com.mohamadamin.persianmaterialdatetimepicker.j.a.a(view.getText().toString())).intValue();
    }

    /* access modifiers changed from: private */
    public class b extends ArrayAdapter<String> {
        public b(Context context, int resource, List<String> objects) {
            super(context, resource, objects);
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            TextViewWithCircularIndicator v = (TextViewWithCircularIndicator) super.getView(position, convertView, parent);
            v.requestLayout();
            boolean selected = i.this.f۳۳۵۱c.e().f۳۳۴۲b == i.b(v);
            v.a(selected);
            if (selected) {
                i.this.f۳۳۵۵g = v;
            }
            return v;
        }
    }

    public void a(int position) {
        a(position, (this.f۳۳۵۳e / 2) - (this.f۳۳۵۴f / 2));
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f۳۳۵۶c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f۳۳۵۷d;

        a(int i, int i2) {
            this.f۳۳۵۶c = i;
            this.f۳۳۵۷d = i2;
        }

        public void run() {
            i.this.setSelectionFromTop(this.f۳۳۵۶c, this.f۳۳۵۷d);
            i.this.requestLayout();
        }
    }

    public void a(int position, int offset) {
        post(new a(position, offset));
    }

    public int getFirstPositionOffset() {
        View firstChild = getChildAt(0);
        if (firstChild == null) {
            return 0;
        }
        return firstChild.getTop();
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.b.c
    public void a() {
        this.f۳۳۵۲d.notifyDataSetChanged();
        a(this.f۳۳۵۱c.e().f۳۳۴۲b - this.f۳۳۵۱c.a());
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        if (event.getEventType() == 4096) {
            event.setFromIndex(0);
            event.setToIndex(0);
        }
    }
}
