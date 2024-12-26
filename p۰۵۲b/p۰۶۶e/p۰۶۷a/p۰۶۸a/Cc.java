package p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa;

/* renamed from: b.e.a.a.c  reason: invalid class name */
public class Cc {

    /* renamed from: a  reason: contains not printable characters */
    private AbstractCa f۱۲۷۶۶a;

    /* renamed from: b  reason: contains not printable characters */
    private long f۱۲۷۶۷b;

    /* renamed from: c  reason: contains not printable characters */
    private long f۱۲۷۶۸c;

    /* renamed from: d  reason: contains not printable characters */
    private Interpolator f۱۲۷۶۹d;

    /* renamed from: e  reason: contains not printable characters */
    private List<AbstractCa.AbstractCa> f۱۲۷۷۰e;

    /* renamed from: f  reason: contains not printable characters */
    private View f۱۲۷۷۱f;

    private Cc(Cb animationComposer) {
        this.f۱۲۷۶۶a = animationComposer.f۱۲۷۷۳b;
        this.f۱۲۷۶۷b = animationComposer.f۱۲۷۷۴c;
        this.f۱۲۷۶۸c = animationComposer.f۱۲۷۷۵d;
        this.f۱۲۷۶۹d = animationComposer.f۱۲۷۷۶e;
        this.f۱۲۷۷۰e = animationComposer.f۱۲۷۷۲a;
        this.f۱۲۷۷۱f = animationComposer.f۱۲۷۷۷f;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cb m۱۶۰۳۶a(EnumCb techniques) {
        return new Cb(techniques);
    }

    /* renamed from: b.e.a.a.c$b  reason: invalid class name */
    public static final class Cb {

        /* renamed from: a  reason: contains not printable characters */
        private List<AbstractCa.AbstractCa> f۱۲۷۷۲a;

        /* renamed from: b  reason: contains not printable characters */
        private AbstractCa f۱۲۷۷۳b;

        /* renamed from: c  reason: contains not printable characters */
        private long f۱۲۷۷۴c;

        /* renamed from: d  reason: contains not printable characters */
        private long f۱۲۷۷۵d;

        /* renamed from: e  reason: contains not printable characters */
        private Interpolator f۱۲۷۷۶e;

        /* renamed from: f  reason: contains not printable characters */
        private View f۱۲۷۷۷f;

        private Cb(EnumCb techniques) {
            this.f۱۲۷۷۲a = new ArrayList();
            this.f۱۲۷۷۴c = 1000;
            this.f۱۲۷۷۵d = 0;
            this.f۱۲۷۷۳b = techniques.m۱۶۰۳۳a();
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cb m۱۶۰۴۳a(long duration) {
            this.f۱۲۷۷۴c = duration;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cb m۱۶۰۴۴a(AbstractCa.AbstractCa listener) {
            this.f۱۲۷۷۲a.add(listener);
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc m۱۶۰۴۵a(View target) {
            this.f۱۲۷۷۷f = target;
            return new Cc(new Cc(this).m۱۶۰۳۴a(), this.f۱۲۷۷۷f);
        }
    }

    /* renamed from: b.e.a.a.c$c  reason: invalid class name */
    public static final class Cc {
        private Cc(AbstractCa animator, View target) {
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private AbstractCa m۱۶۰۳۴a() {
        AbstractCa aVar = this.f۱۲۷۶۶a;
        aVar.m۱۶۰۲۳a(this.f۱۲۷۶۷b);
        aVar.m۱۶۰۲۴a(this.f۱۲۷۶۹d);
        aVar.m۱۶۰۲۹b(this.f۱۲۷۶۸c);
        if (this.f۱۲۷۷۰e.size() > 0) {
            for (AbstractCa.AbstractCa callback : this.f۱۲۷۷۰e) {
                this.f۱۲۷۶۶a.m۱۶۰۲۵a(callback);
            }
        }
        this.f۱۲۷۶۶a.m۱۶۰۲۷a(this.f۱۲۷۷۱f);
        return this.f۱۲۷۶۶a;
    }
}
