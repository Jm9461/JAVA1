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
import com.mohamadamin.persianmaterialdatetimepicker.Cc;
import com.mohamadamin.persianmaterialdatetimepicker.Cf;
import com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.i  reason: invalid class name */
public class Ci extends ListView implements AdapterView.OnItemClickListener, DialogFragmentCb.AbstractCc {

    /* renamed from: c  reason: contains not printable characters */
    private final AbstractCa f۱۴۹۶۱c;

    /* renamed from: d  reason: contains not printable characters */
    private Cb f۱۴۹۶۲d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۴۹۶۳e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۴۹۶۴f;

    /* renamed from: g  reason: contains not printable characters */
    private TextViewWithCircularIndicator f۱۴۹۶۵g;

    public Ci(Context context, AbstractCa controller) {
        super(context);
        this.f۱۴۹۶۱c = controller;
        this.f۱۴۹۶۱c.m۱۷۸۹۹a(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Resources res = context.getResources();
        this.f۱۴۹۶۳e = res.getDimensionPixelOffset(Cc.mdtp_date_picker_view_animator_height);
        this.f۱۴۹۶۴f = res.getDimensionPixelOffset(Cc.mdtp_year_label_height);
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(this.f۱۴۹۶۴f / 3);
        m۱۷۹۸۸a(context);
        setOnItemClickListener(this);
        setSelector(new StateListDrawable());
        setDividerHeight(0);
        m۱۷۹۹۰a();
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۷۹۸۸a(Context context) {
        ArrayList<String> years = new ArrayList<>();
        for (int year = this.f۱۴۹۶۱c.m۱۷۸۹۶a(); year <= this.f۱۴۹۶۱c.m۱۷۹۰۷i(); year++) {
            years.add(String.format("%d", Integer.valueOf(year)));
        }
        this.f۱۴۹۶۲d = new Cb(context, Cf.mdtp_year_label_text_view, Ca.m۱۷۹۹۹a(years));
        setAdapter((ListAdapter) this.f۱۴۹۶۲d);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        this.f۱۴۹۶۱c.m۱۷۹۰۶h();
        TextViewWithCircularIndicator clickedView = (TextViewWithCircularIndicator) view;
        if (clickedView != null) {
            TextViewWithCircularIndicator textViewWithCircularIndicator = this.f۱۴۹۶۵g;
            if (clickedView != textViewWithCircularIndicator) {
                if (textViewWithCircularIndicator != null) {
                    textViewWithCircularIndicator.m۱۷۸۹۵a(false);
                    this.f۱۴۹۶۵g.requestLayout();
                }
                clickedView.m۱۷۸۹۵a(true);
                clickedView.requestLayout();
                this.f۱۴۹۶۵g = clickedView;
            }
            this.f۱۴۹۶۱c.m۱۷۸۹۷a(m۱۷۹۸۹b(clickedView));
            this.f۱۴۹۶۲d.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b  reason: contains not printable characters */
    public static int m۱۷۹۸۹b(TextView view) {
        return Integer.valueOf(Ca.m۱۷۹۹۸a(view.getText().toString())).intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.i$b  reason: invalid class name */
    public class Cb extends ArrayAdapter<String> {
        public Cb(Context context, int resource, List<String> objects) {
            super(context, resource, objects);
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            TextViewWithCircularIndicator v = (TextViewWithCircularIndicator) super.getView(position, convertView, parent);
            v.requestLayout();
            boolean selected = Ci.this.f۱۴۹۶۱c.m۱۷۹۰۳e().f۱۴۹۱۶b == Ci.m۱۷۹۸۹b(v);
            v.m۱۷۸۹۵a(selected);
            if (selected) {
                Ci.this.f۱۴۹۶۵g = v;
            }
            return v;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۹۹۱a(int position) {
        m۱۷۹۹۲a(position, (this.f۱۴۹۶۳e / 2) - (this.f۱۴۹۶۴f / 2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.i$a  reason: invalid class name */
    public class RunnableCa implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ int f۱۴۹۶۶c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ int f۱۴۹۶۷d;

        RunnableCa(int i, int i2) {
            this.f۱۴۹۶۶c = i;
            this.f۱۴۹۶۷d = i2;
        }

        public void run() {
            Ci.this.setSelectionFromTop(this.f۱۴۹۶۶c, this.f۱۴۹۶۷d);
            Ci.this.requestLayout();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۹۹۲a(int position, int offset) {
        post(new RunnableCa(position, offset));
    }

    public int getFirstPositionOffset() {
        View firstChild = getChildAt(0);
        if (firstChild == null) {
            return 0;
        }
        return firstChild.getTop();
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۹۹۰a() {
        this.f۱۴۹۶۲d.notifyDataSetChanged();
        m۱۷۹۹۱a(this.f۱۴۹۶۱c.m۱۷۹۰۳e().f۱۴۹۱۶b - this.f۱۴۹۶۱c.m۱۷۸۹۶a());
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        if (event.getEventType() == 4096) {
            event.setFromIndex(0);
            event.setToIndex(0);
        }
    }
}
