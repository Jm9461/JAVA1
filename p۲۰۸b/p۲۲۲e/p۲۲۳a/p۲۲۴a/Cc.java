package p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa;

/* renamed from: b.e.a.a.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc {

    /* renamed from: a, reason: contains not printable characters */
    private AbstractCa f۱۲۷۶۶a;

    /* renamed from: b, reason: contains not printable characters */
    private long f۱۲۷۶۷b;

    /* renamed from: c, reason: contains not printable characters */
    private long f۱۲۷۶۸c;

    /* renamed from: d, reason: contains not printable characters */
    private Interpolator f۱۲۷۶۹d;

    /* renamed from: e, reason: contains not printable characters */
    private List<AbstractCa.a> f۱۲۷۷۰e;

    /* renamed from: f, reason: contains not printable characters */
    private View f۱۲۷۷۱f;

    private Cc(b animationComposer) {
        this.f۱۲۷۶۶a = animationComposer.f۱۲۷۷۳b;
        this.f۱۲۷۶۷b = animationComposer.f۱۲۷۷۴c;
        this.f۱۲۷۶۸c = animationComposer.f۱۲۷۷۵d;
        this.f۱۲۷۶۹d = animationComposer.f۱۲۷۷۶e;
        this.f۱۲۷۷۰e = animationComposer.f۱۲۷۷۲a;
        this.f۱۲۷۷۱f = animationComposer.f۱۲۷۷۷f;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static b m۱۳۹۶۵a(EnumCb techniques) {
        return new b(techniques);
    }

    /* renamed from: b.e.a.a.c$b */
    public static final class b {

        /* renamed from: a, reason: contains not printable characters */
        private List<AbstractCa.a> f۱۲۷۷۲a;

        /* renamed from: b, reason: contains not printable characters */
        private AbstractCa f۱۲۷۷۳b;

        /* renamed from: c, reason: contains not printable characters */
        private long f۱۲۷۷۴c;

        /* renamed from: d, reason: contains not printable characters */
        private long f۱۲۷۷۵d;

        /* renamed from: e, reason: contains not printable characters */
        private Interpolator f۱۲۷۷۶e;

        /* renamed from: f, reason: contains not printable characters */
        private View f۱۲۷۷۷f;

        private b(EnumCb techniques) {
            this.f۱۲۷۷۲a = new ArrayList();
            this.f۱۲۷۷۴c = 1000L;
            this.f۱۲۷۷۵d = 0L;
            this.f۱۲۷۷۳b = techniques.m۱۳۹۶۲a();
        }

        /* renamed from: a, reason: contains not printable characters */
        public b m۱۳۹۷۲a(long duration) {
            this.f۱۲۷۷۴c = duration;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public b m۱۳۹۷۳a(AbstractCa.a listener) {
            this.f۱۲۷۷۲a.add(listener);
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public c m۱۳۹۷۴a(View target) {
            this.f۱۲۷۷۷f = target;
            return new c(new Cc(this).m۱۳۹۶۳a(), this.f۱۲۷۷۷f);
        }
    }

    /* renamed from: b.e.a.a.c$c */
    public static final class c {
        private c(AbstractCa animator, View target) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCa m۱۳۹۶۳a() {
        AbstractCa abstractCa = this.f۱۲۷۶۶a;
        abstractCa.m۱۳۹۵۲a(this.f۱۲۷۶۷b);
        abstractCa.m۱۳۹۵۳a(this.f۱۲۷۶۹d);
        abstractCa.m۱۳۹۵۸b(this.f۱۲۷۶۸c);
        if (this.f۱۲۷۷۰e.size() > 0) {
            for (AbstractCa.a callback : this.f۱۲۷۷۰e) {
                this.f۱۲۷۶۶a.m۱۳۹۵۴a(callback);
            }
        }
        this.f۱۲۷۶۶a.m۱۳۹۵۶a(this.f۱۲۷۷۱f);
        return this.f۱۲۷۶۶a;
    }
}
