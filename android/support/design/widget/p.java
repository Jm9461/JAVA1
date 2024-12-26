package android.support.design.widget;

import a.b.c.d;
import a.b.c.f;
import a.b.c.l.b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.support.v4.view.u;
import android.support.v4.widget.Space;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final Context f۹۹۱a;

    /* renamed from: b  reason: collision with root package name */
    private final TextInputLayout f۹۹۲b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f۹۹۳c;

    /* renamed from: d  reason: collision with root package name */
    private int f۹۹۴d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f۹۹۵e;

    /* renamed from: f  reason: collision with root package name */
    private int f۹۹۶f;

    /* renamed from: g  reason: collision with root package name */
    private Animator f۹۹۷g;

    /* renamed from: h  reason: collision with root package name */
    private final float f۹۹۸h = ((float) this.f۹۹۱a.getResources().getDimensionPixelSize(d.design_textinput_caption_translate_y));
    private int i;
    private int j;
    private CharSequence k;
    private boolean l;
    private TextView m;
    private int n;
    private CharSequence o;
    private boolean p;
    private TextView q;
    private int r;
    private Typeface s;

    public p(TextInputLayout textInputView) {
        this.f۹۹۱a = textInputView.getContext();
        this.f۹۹۲b = textInputView;
    }

    /* access modifiers changed from: package-private */
    public void b(CharSequence helperText) {
        b();
        this.o = helperText;
        this.q.setText(helperText);
        if (this.i != 2) {
            this.j = 2;
        }
        a(this.i, this.j, a(this.q, helperText));
    }

    /* access modifiers changed from: package-private */
    public void j() {
        b();
        if (this.i == 2) {
            this.j = 0;
        }
        a(this.i, this.j, a(this.q, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    public void a(CharSequence errorText) {
        b();
        this.k = errorText;
        this.m.setText(errorText);
        if (this.i != 1) {
            this.j = 1;
        }
        a(this.i, this.j, a(this.m, errorText));
    }

    /* access modifiers changed from: package-private */
    public void i() {
        this.k = null;
        b();
        if (this.i == 1) {
            if (!this.p || TextUtils.isEmpty(this.o)) {
                this.j = 0;
            } else {
                this.j = 2;
            }
        }
        a(this.i, this.j, a(this.m, (CharSequence) null));
    }

    private boolean a(TextView captionView, CharSequence captionText) {
        return u.y(this.f۹۹۲b) && this.f۹۹۲b.isEnabled() && (this.j != this.i || captionView == null || !TextUtils.equals(captionView.getText(), captionText));
    }

    private void a(int captionToHide, int captionToShow, boolean animate) {
        if (animate) {
            AnimatorSet captionAnimator = new AnimatorSet();
            this.f۹۹۷g = captionAnimator;
            List<Animator> captionAnimatorList = new ArrayList<>();
            a(captionAnimatorList, this.p, this.q, 2, captionToHide, captionToShow);
            a(captionAnimatorList, this.l, this.m, 1, captionToHide, captionToShow);
            b.a(captionAnimator, captionAnimatorList);
            captionAnimator.addListener(new a(captionToShow, d(captionToHide), captionToHide, d(captionToShow)));
            captionAnimator.start();
        } else {
            a(captionToHide, captionToShow);
        }
        this.f۹۹۲b.c();
        this.f۹۹۲b.b(animate);
        this.f۹۹۲b.d();
    }

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f۹۹۹a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f۱۰۰۰b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f۱۰۰۱c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f۱۰۰۲d;

        a(int i, TextView textView, int i2, TextView textView2) {
            this.f۹۹۹a = i;
            this.f۱۰۰۰b = textView;
            this.f۱۰۰۱c = i2;
            this.f۱۰۰۲d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            p.this.i = this.f۹۹۹a;
            p.this.f۹۹۷g = null;
            TextView textView = this.f۱۰۰۰b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f۱۰۰۱c == 1 && p.this.m != null) {
                    p.this.m.setText((CharSequence) null);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f۱۰۰۲d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    private void a(int captionToHide, int captionToShow) {
        TextView captionViewDisplayed;
        TextView captionViewToShow;
        if (captionToHide != captionToShow) {
            if (!(captionToShow == 0 || (captionViewToShow = d(captionToShow)) == null)) {
                captionViewToShow.setVisibility(0);
                captionViewToShow.setAlpha(1.0f);
            }
            if (!(captionToHide == 0 || (captionViewDisplayed = d(captionToHide)) == null)) {
                captionViewDisplayed.setVisibility(4);
                if (captionToHide == 1) {
                    captionViewDisplayed.setText((CharSequence) null);
                }
            }
            this.i = captionToShow;
        }
    }

    private void a(List<Animator> captionAnimatorList, boolean captionEnabled, TextView captionView, int captionState, int captionToHide, int captionToShow) {
        if (captionView != null && captionEnabled) {
            if (captionState == captionToShow || captionState == captionToHide) {
                captionAnimatorList.add(a(captionView, captionToShow == captionState));
                if (captionToShow == captionState) {
                    captionAnimatorList.add(a(captionView));
                }
            }
        }
    }

    private ObjectAnimator a(TextView captionView, boolean display) {
        ObjectAnimator opacityAnimator = ObjectAnimator.ofFloat(captionView, View.ALPHA, display ? 1.0f : 0.0f);
        opacityAnimator.setDuration(167L);
        opacityAnimator.setInterpolator(a.b.c.l.a.f۲۲a);
        return opacityAnimator;
    }

    private ObjectAnimator a(TextView captionView) {
        ObjectAnimator translationYAnimator = ObjectAnimator.ofFloat(captionView, View.TRANSLATION_Y, -this.f۹۹۸h, 0.0f);
        translationYAnimator.setDuration(217L);
        translationYAnimator.setInterpolator(a.b.c.l.a.f۲۵d);
        return translationYAnimator;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Animator animator = this.f۹۹۷g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(int index) {
        return index == 0 || index == 1;
    }

    private TextView d(int captionDisplayState) {
        if (captionDisplayState == 1) {
            return this.m;
        }
        if (captionDisplayState != 2) {
            return null;
        }
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (m()) {
            u.a(this.f۹۹۳c, u.o(this.f۹۹۲b.getEditText()), 0, u.n(this.f۹۹۲b.getEditText()), 0);
        }
    }

    private boolean m() {
        return (this.f۹۹۳c == null || this.f۹۹۲b.getEditText() == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void a(TextView indicator, int index) {
        if (this.f۹۹۳c == null && this.f۹۹۵e == null) {
            this.f۹۹۳c = new LinearLayout(this.f۹۹۱a);
            this.f۹۹۳c.setOrientation(0);
            this.f۹۹۲b.addView(this.f۹۹۳c, -1, -2);
            this.f۹۹۵e = new FrameLayout(this.f۹۹۱a);
            this.f۹۹۳c.addView(this.f۹۹۵e, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f۹۹۳c.addView(new Space(this.f۹۹۱a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f۹۹۲b.getEditText() != null) {
                a();
            }
        }
        if (a(index)) {
            this.f۹۹۵e.setVisibility(0);
            this.f۹۹۵e.addView(indicator);
            this.f۹۹۶f++;
        } else {
            this.f۹۹۳c.addView(indicator, index);
        }
        this.f۹۹۳c.setVisibility(0);
        this.f۹۹۴d++;
    }

    /* access modifiers changed from: package-private */
    public void b(TextView indicator, int index) {
        FrameLayout frameLayout;
        if (this.f۹۹۳c != null) {
            if (!a(index) || (frameLayout = this.f۹۹۵e) == null) {
                this.f۹۹۳c.removeView(indicator);
            } else {
                this.f۹۹۶f--;
                a(frameLayout, this.f۹۹۶f);
                this.f۹۹۵e.removeView(indicator);
            }
            this.f۹۹۴d--;
            a(this.f۹۹۳c, this.f۹۹۴d);
        }
    }

    private void a(ViewGroup viewGroup, int indicatorsAdded) {
        if (indicatorsAdded == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean enabled) {
        if (this.l != enabled) {
            b();
            if (enabled) {
                this.m = new AppCompatTextView(this.f۹۹۱a);
                this.m.setId(f.textinput_error);
                Typeface typeface = this.s;
                if (typeface != null) {
                    this.m.setTypeface(typeface);
                }
                b(this.n);
                this.m.setVisibility(4);
                u.e(this.m, 1);
                a(this.m, 0);
            } else {
                i();
                b(this.m, 0);
                this.m = null;
                this.f۹۹۲b.c();
                this.f۹۹۲b.d();
            }
            this.l = enabled;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean enabled) {
        if (this.p != enabled) {
            b();
            if (enabled) {
                this.q = new AppCompatTextView(this.f۹۹۱a);
                this.q.setId(f.textinput_helper_text);
                Typeface typeface = this.s;
                if (typeface != null) {
                    this.q.setTypeface(typeface);
                }
                this.q.setVisibility(4);
                u.e(this.q, 1);
                c(this.r);
                a(this.q, 1);
            } else {
                j();
                b(this.q, 1);
                this.q = null;
                this.f۹۹۲b.c();
                this.f۹۹۲b.d();
            }
            this.p = enabled;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return e(this.j);
    }

    private boolean e(int captionState) {
        if (captionState != 1 || this.m == null || TextUtils.isEmpty(this.k)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public CharSequence d() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public CharSequence g() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public void a(Typeface typeface) {
        if (typeface != this.s) {
            this.s = typeface;
            a(this.m, typeface);
            a(this.q, typeface);
        }
    }

    private void a(TextView captionView, Typeface typeface) {
        if (captionView != null) {
            captionView.setTypeface(typeface);
        }
    }

    /* access modifiers changed from: package-private */
    public int e() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList f() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList textColors) {
        TextView textView = this.m;
        if (textView != null) {
            textView.setTextColor(textColors);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int resId) {
        this.n = resId;
        TextView textView = this.m;
        if (textView != null) {
            this.f۹۹۲b.a(textView, resId);
        }
    }

    /* access modifiers changed from: package-private */
    public int h() {
        TextView textView = this.q;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void b(ColorStateList textColors) {
        TextView textView = this.q;
        if (textView != null) {
            textView.setTextColor(textColors);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(int resId) {
        this.r = resId;
        TextView textView = this.q;
        if (textView != null) {
            android.support.v4.widget.p.d(textView, resId);
        }
    }
}
