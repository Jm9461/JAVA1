package android.support.design.transformation;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.p۰۴۳v4.view.Cu;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۳o.AbstractCb;

public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractCc<View> {

    /* renamed from: a  reason: contains not printable characters */
    private int f۹۵۱۸a = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract boolean m۱۱۳۶۷a(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۳۶۶a(CoordinatorLayout parent, View child, int layoutDirection) {
        AbstractCb dep;
        if (Cu.m۱۳۰۲۸y(child) || (dep = m۱۱۳۶۹e(parent, child)) == null || !m۱۱۳۶۵a(dep.m۱۰۰۲۳a())) {
            return false;
        }
        this.f۹۵۱۸a = dep.m۱۰۰۲۳a() ? 1 : 2;
        child.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerCa(child, this.f۹۵۱۸a, dep));
        return false;
    }

    /* renamed from: android.support.design.transformation.ExpandableBehavior$a  reason: invalid class name */
    class ViewTreeObserver$OnPreDrawListenerCa implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ View f۹۵۱۹c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ int f۹۵۲۰d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ AbstractCb f۹۵۲۱e;

        ViewTreeObserver$OnPreDrawListenerCa(View view, int i, AbstractCb bVar) {
            this.f۹۵۱۹c = view;
            this.f۹۵۲۰d = i;
            this.f۹۵۲۱e = bVar;
        }

        public boolean onPreDraw() {
            this.f۹۵۱۹c.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f۹۵۱۸a == this.f۹۵۲۰d) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                AbstractCb bVar = this.f۹۵۲۱e;
                expandableBehavior.m۱۱۳۶۷a((View) bVar, this.f۹۵۱۹c, bVar.m۱۰۰۲۳a(), false);
            }
            return false;
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۱۳۶۸b(CoordinatorLayout parent, View child, View dependency) {
        AbstractCb dep = (AbstractCb) dependency;
        if (!m۱۱۳۶۵a(dep.m۱۰۰۲۳a())) {
            return false;
        }
        this.f۹۵۱۸a = dep.m۱۰۰۲۳a() ? 1 : 2;
        return m۱۱۳۶۷a((View) dep, child, dep.m۱۰۰۲۳a(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e  reason: contains not printable characters */
    public AbstractCb m۱۱۳۶۹e(CoordinatorLayout parent, View child) {
        List<View> dependencies = parent.m۱۱۵۴۸b(child);
        int size = dependencies.size();
        for (int i = 0; i < size; i++) {
            View dependency = dependencies.get(i);
            if (m۱۱۵۷۶a(parent, child, dependency)) {
                return (AbstractCb) dependency;
            }
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۱۳۶۵a(boolean expanded) {
        if (expanded) {
            int i = this.f۹۵۱۸a;
            if (i == 0 || i == 2) {
                return true;
            }
            return false;
        } else if (this.f۹۵۱۸a == 1) {
            return true;
        } else {
            return false;
        }
    }
}
