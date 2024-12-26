package com.mohamadamin.persianmaterialdatetimepicker.date;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ViewAnimator;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb;

public class AccessibleDateAnimator extends ViewAnimator {

    /* renamed from: c  reason: contains not printable characters */
    private long f۱۴۸۶۲c;

    public AccessibleDateAnimator(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setDateMillis(long dateMillis) {
        this.f۱۴۸۶۲c = dateMillis;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        if (event.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(event);
        }
        event.getText().clear();
        Cb mPersianCalendar = new Cb();
        mPersianCalendar.setTimeInMillis(this.f۱۴۸۶۲c);
        event.getText().add(Ca.m۱۸۰۰۱b(mPersianCalendar.m۱۸۰۱۰e() + " " + mPersianCalendar.m۱۸۰۱۳h()));
        return true;
    }
}
