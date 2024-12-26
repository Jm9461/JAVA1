package b.e.a.a;

import android.view.View;
import android.view.animation.Interpolator;
import b.h.a.a;
import java.util.ArrayList;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private a f۲۴۶۴a;

    /* renamed from: b  reason: collision with root package name */
    private long f۲۴۶۵b;

    /* renamed from: c  reason: collision with root package name */
    private long f۲۴۶۶c;

    /* renamed from: d  reason: collision with root package name */
    private Interpolator f۲۴۶۷d;

    /* renamed from: e  reason: collision with root package name */
    private List<a.AbstractC۰۰۵۲a> f۲۴۶۸e;

    /* renamed from: f  reason: collision with root package name */
    private View f۲۴۶۹f;

    private c(b animationComposer) {
        this.f۲۴۶۴a = animationComposer.f۲۴۷۱b;
        this.f۲۴۶۵b = animationComposer.f۲۴۷۲c;
        this.f۲۴۶۶c = animationComposer.f۲۴۷۳d;
        this.f۲۴۶۷d = animationComposer.f۲۴۷۴e;
        this.f۲۴۶۸e = animationComposer.f۲۴۷۰a;
        this.f۲۴۶۹f = animationComposer.f۲۴۷۵f;
    }

    public static b a(b techniques) {
        return new b(techniques);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private List<a.AbstractC۰۰۵۲a> f۲۴۷۰a;

        /* renamed from: b  reason: collision with root package name */
        private a f۲۴۷۱b;

        /* renamed from: c  reason: collision with root package name */
        private long f۲۴۷۲c;

        /* renamed from: d  reason: collision with root package name */
        private long f۲۴۷۳d;

        /* renamed from: e  reason: collision with root package name */
        private Interpolator f۲۴۷۴e;

        /* renamed from: f  reason: collision with root package name */
        private View f۲۴۷۵f;

        private b(b techniques) {
            this.f۲۴۷۰a = new ArrayList();
            this.f۲۴۷۲c = 1000;
            this.f۲۴۷۳d = 0;
            this.f۲۴۷۱b = techniques.a();
        }

        public b a(long duration) {
            this.f۲۴۷۲c = duration;
            return this;
        }

        public b a(a.AbstractC۰۰۵۲a listener) {
            this.f۲۴۷۰a.add(listener);
            return this;
        }

        public C۰۰۴۹c a(View target) {
            this.f۲۴۷۵f = target;
            return new C۰۰۴۹c(new c(this).a(), this.f۲۴۷۵f);
        }
    }

    /* renamed from: b.e.a.a.c$c  reason: collision with other inner class name */
    public static final class C۰۰۴۹c {
        private C۰۰۴۹c(a animator, View target) {
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private a a() {
        a aVar = this.f۲۴۶۴a;
        aVar.a(this.f۲۴۶۵b);
        aVar.a(this.f۲۴۶۷d);
        aVar.b(this.f۲۴۶۶c);
        if (this.f۲۴۶۸e.size() > 0) {
            for (a.AbstractC۰۰۵۲a callback : this.f۲۴۶۸e) {
                this.f۲۴۶۴a.a(callback);
            }
        }
        this.f۲۴۶۴a.a(this.f۲۴۶۹f);
        return this.f۲۴۶۴a;
    }
}
