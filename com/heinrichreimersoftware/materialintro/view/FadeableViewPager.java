package com.heinrichreimersoftware.materialintro.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.p۰۴۳v4.view.AbstractCq;
import android.support.p۰۴۳v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class FadeableViewPager extends Ca {
    public FadeableViewPager(Context context) {
        super(context);
    }

    public FadeableViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // android.support.p۰۴۳v4.view.ViewPager
    public void setAdapter(AbstractCq adapter) {
        super.setAdapter(new Cc(adapter));
    }

    @Override // android.support.p۰۴۳v4.view.ViewPager
    public AbstractCq getAdapter() {
        Cc wrapper = (Cc) super.getAdapter();
        if (wrapper == null) {
            return null;
        }
        return wrapper.m۱۶۹۸۱d();
    }

    @Override // android.support.p۰۴۳v4.view.ViewPager
    @Deprecated
    public void setOnPageChangeListener(ViewPager.AbstractCj listener) {
        super.setOnPageChangeListener(new Cb(listener));
    }

    @Override // android.support.p۰۴۳v4.view.ViewPager
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۹۶۲a(ViewPager.AbstractCj listener) {
        super.m۱۲۷۶۶a(new Cb(listener));
    }

    @Override // android.support.p۰۴۳v4.view.ViewPager
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۹۶۳b(ViewPager.AbstractCj listener) {
        super.m۱۲۷۷۴b(new Cb(listener));
    }

    /* renamed from: com.heinrichreimersoftware.materialintro.view.FadeableViewPager$b  reason: invalid class name */
    private class Cb implements ViewPager.AbstractCj {

        /* renamed from: c  reason: contains not printable characters */
        private final ViewPager.AbstractCj f۱۳۶۷۴c;

        private Cb(ViewPager.AbstractCj listener) {
            this.f۱۳۶۷۴c = listener;
        }

        @Override // android.support.p۰۴۳v4.view.ViewPager.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۹۶۵a(int position, float positionOffset, int positionOffsetPixels) {
            int count = FadeableViewPager.this.getAdapter().m۱۲۹۵۱a();
            this.f۱۳۶۷۴c.m۱۲۷۸۷a(Math.min(position, count - 1), position < count ? positionOffset : 0.0f, position < count ? positionOffsetPixels : 0);
        }

        @Override // android.support.p۰۴۳v4.view.ViewPager.AbstractCj
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۶۹۶۶b(int position) {
            this.f۱۳۶۷۴c.m۱۲۷۸۸b(Math.min(position, FadeableViewPager.this.getAdapter().m۱۲۹۵۱a() - 1));
        }

        @Override // android.support.p۰۴۳v4.view.ViewPager.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۹۶۴a(int state) {
            this.f۱۳۶۷۴c.m۱۲۷۸۶a(state);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.heinrichreimersoftware.materialintro.view.FadeableViewPager$c  reason: invalid class name */
    public class Cc extends AbstractCq {

        /* renamed from: c  reason: contains not printable characters */
        private final AbstractCq f۱۳۶۷۶c;

        private Cc(FadeableViewPager fadeableViewPager, AbstractCq adapter) {
            this.f۱۳۶۷۶c = adapter;
            adapter.m۱۲۹۵۵a((DataSetObserver) new Ca(fadeableViewPager));
        }

        /* renamed from: com.heinrichreimersoftware.materialintro.view.FadeableViewPager$c$a  reason: invalid class name */
        class Ca extends DataSetObserver {
            Ca(FadeableViewPager fadeableViewPager) {
            }

            public void onChanged() {
                Cc.this.m۱۲۹۶۱b();
            }

            public void onInvalidated() {
                Cc.this.m۱۲۹۶۱b();
            }
        }

        /* renamed from: d  reason: contains not printable characters */
        public AbstractCq m۱۶۹۸۱d() {
            return this.f۱۳۶۷۶c;
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCq
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۶۹۶۷a() {
            return this.f۱۳۶۷۶c.m۱۲۹۵۱a() + 1;
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCq
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۶۹۷۵a(View view, Object object) {
            return this.f۱۳۶۷۶c.m۱۲۹۵۹a(view, object);
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCq
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۶۹۷۷b(ViewGroup container) {
            this.f۱۳۶۷۶c.m۱۲۹۶۳b(container);
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCq
        /* renamed from: a  reason: contains not printable characters */
        public Object m۱۶۹۷۰a(ViewGroup container, int position) {
            if (position < this.f۱۳۶۷۶c.m۱۲۹۵۱a()) {
                return this.f۱۳۶۷۶c.m۱۲۹۵۴a(container, position);
            }
            return null;
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCq
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۹۷۴a(ViewGroup container, int position, Object object) {
            if (position < this.f۱۳۶۷۶c.m۱۲۹۵۱a()) {
                this.f۱۳۶۷۶c.m۱۲۹۵۸a(container, position, object);
            }
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCq
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۶۹۷۸b(ViewGroup container, int position, Object object) {
            if (position < this.f۱۳۶۷۶c.m۱۲۹۵۱a()) {
                this.f۱۳۶۷۶c.m۱۲۹۶۴b(container, position, object);
            }
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCq
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۹۷۳a(ViewGroup container) {
            this.f۱۳۶۷۶c.m۱۲۹۵۷a(container);
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCq
        /* renamed from: c  reason: contains not printable characters */
        public Parcelable m۱۶۹۷۹c() {
            return this.f۱۳۶۷۶c.m۱۲۹۶۵c();
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCq
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۹۷۲a(Parcelable state, ClassLoader loader) {
            this.f۱۳۶۷۶c.m۱۲۹۵۶a(state, loader);
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCq
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۶۹۶۸a(Object object) {
            int position = this.f۱۳۶۷۶c.m۱۲۹۵۲a(object);
            if (position < this.f۱۳۶۷۶c.m۱۲۹۵۱a()) {
                return position;
            }
            return -2;
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCq
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۹۷۱a(DataSetObserver observer) {
            this.f۱۳۶۷۶c.m۱۲۹۵۵a(observer);
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCq
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۶۹۸۰c(DataSetObserver observer) {
            this.f۱۳۶۷۶c.m۱۲۹۶۶c(observer);
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCq
        /* renamed from: a  reason: contains not printable characters */
        public CharSequence m۱۶۹۶۹a(int position) {
            if (position < this.f۱۳۶۷۶c.m۱۲۹۵۱a()) {
                return this.f۱۳۶۷۶c.m۱۲۹۵۳a(position);
            }
            return null;
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCq
        /* renamed from: b  reason: contains not printable characters */
        public float m۱۶۹۷۶b(int position) {
            if (position < this.f۱۳۶۷۶c.m۱۲۹۵۱a()) {
                return this.f۱۳۶۷۶c.m۱۲۹۶۰b(position);
            }
            return 1.0f;
        }
    }
}
