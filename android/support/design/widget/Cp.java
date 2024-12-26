package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.widget.Space;
import android.support.p۰۴۷v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cd;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cf;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Cb;

/* access modifiers changed from: package-private */
/* renamed from: android.support.design.widget.p  reason: invalid class name */
public final class Cp {

    /* renamed from: a  reason: contains not printable characters */
    private final Context f۹۹۹۶a;

    /* renamed from: b  reason: contains not printable characters */
    private final TextInputLayout f۹۹۹۷b;

    /* renamed from: c  reason: contains not printable characters */
    private LinearLayout f۹۹۹۸c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۹۹۹۹d;

    /* renamed from: e  reason: contains not printable characters */
    private FrameLayout f۱۰۰۰۰e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۰۰۰۱f;

    /* renamed from: g  reason: contains not printable characters */
    private Animator f۱۰۰۰۲g;

    /* renamed from: h  reason: contains not printable characters */
    private final float f۱۰۰۰۳h = ((float) this.f۹۹۹۶a.getResources().getDimensionPixelSize(Cd.design_textinput_caption_translate_y));

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۰۰۰۴i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۱۰۰۰۵j;

    /* renamed from: k  reason: contains not printable characters */
    private CharSequence f۱۰۰۰۶k;

    /* renamed from: l  reason: contains not printable characters */
    private boolean f۱۰۰۰۷l;

    /* renamed from: m  reason: contains not printable characters */
    private TextView f۱۰۰۰۸m;

    /* renamed from: n  reason: contains not printable characters */
    private int f۱۰۰۰۹n;

    /* renamed from: o  reason: contains not printable characters */
    private CharSequence f۱۰۰۱۰o;

    /* renamed from: p  reason: contains not printable characters */
    private boolean f۱۰۰۱۱p;

    /* renamed from: q  reason: contains not printable characters */
    private TextView f۱۰۰۱۲q;

    /* renamed from: r  reason: contains not printable characters */
    private int f۱۰۰۱۳r;

    /* renamed from: s  reason: contains not printable characters */
    private Typeface f۱۰۰۱۴s;

    public Cp(TextInputLayout textInputView) {
        this.f۹۹۹۶a = textInputView.getContext();
        this.f۹۹۹۷b = textInputView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۹۸۵b(CharSequence helperText) {
        m۱۱۹۸۱b();
        this.f۱۰۰۱۰o = helperText;
        this.f۱۰۰۱۲q.setText(helperText);
        if (this.f۱۰۰۰۴i != 2) {
            this.f۱۰۰۰۵j = 2;
        }
        m۱۱۹۶۶a(this.f۱۰۰۰۴i, this.f۱۰۰۰۵j, m۱۱۹۷۰a(this.f۱۰۰۱۲q, helperText));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j  reason: contains not printable characters */
    public void m۱۱۹۹۵j() {
        m۱۱۹۸۱b();
        if (this.f۱۰۰۰۴i == 2) {
            this.f۱۰۰۰۵j = 0;
        }
        m۱۱۹۶۶a(this.f۱۰۰۰۴i, this.f۱۰۰۰۵j, m۱۱۹۷۰a(this.f۱۰۰۱۲q, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۹۷۸a(CharSequence errorText) {
        m۱۱۹۸۱b();
        this.f۱۰۰۰۶k = errorText;
        this.f۱۰۰۰۸m.setText(errorText);
        if (this.f۱۰۰۰۴i != 1) {
            this.f۱۰۰۰۵j = 1;
        }
        m۱۱۹۶۶a(this.f۱۰۰۰۴i, this.f۱۰۰۰۵j, m۱۱۹۷۰a(this.f۱۰۰۰۸m, errorText));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public void m۱۱۹۹۴i() {
        this.f۱۰۰۰۶k = null;
        m۱۱۹۸۱b();
        if (this.f۱۰۰۰۴i == 1) {
            if (!this.f۱۰۰۱۱p || TextUtils.isEmpty(this.f۱۰۰۱۰o)) {
                this.f۱۰۰۰۵j = 0;
            } else {
                this.f۱۰۰۰۵j = 2;
            }
        }
        m۱۱۹۶۶a(this.f۱۰۰۰۴i, this.f۱۰۰۰۵j, m۱۱۹۷۰a(this.f۱۰۰۰۸m, (CharSequence) null));
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۱۹۷۰a(TextView captionView, CharSequence captionText) {
        return Cu.m۱۳۰۲۸y(this.f۹۹۹۷b) && this.f۹۹۹۷b.isEnabled() && (this.f۱۰۰۰۵j != this.f۱۰۰۰۴i || captionView == null || !TextUtils.equals(captionView.getText(), captionText));
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۹۶۶a(int captionToHide, int captionToShow, boolean animate) {
        if (animate) {
            AnimatorSet captionAnimator = new AnimatorSet();
            this.f۱۰۰۰۲g = captionAnimator;
            List<Animator> captionAnimatorList = new ArrayList<>();
            m۱۱۹۶۹a(captionAnimatorList, this.f۱۰۰۱۱p, this.f۱۰۰۱۲q, 2, captionToHide, captionToShow);
            m۱۱۹۶۹a(captionAnimatorList, this.f۱۰۰۰۷l, this.f۱۰۰۰۸m, 1, captionToHide, captionToShow);
            Cb.m۹۹۴۵a(captionAnimator, captionAnimatorList);
            captionAnimator.addListener(new Ca(captionToShow, m۱۱۹۷۱d(captionToHide), captionToHide, m۱۱۹۷۱d(captionToShow)));
            captionAnimator.start();
        } else {
            m۱۱۹۶۵a(captionToHide, captionToShow);
        }
        this.f۹۹۹۷b.m۱۱۷۹۴c();
        this.f۹۹۹۷b.m۱۱۷۹۲b(animate);
        this.f۹۹۹۷b.m۱۱۷۹۵d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.p$a  reason: invalid class name */
    public class Ca extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ int f۱۰۰۱۵a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ TextView f۱۰۰۱۶b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ int f۱۰۰۱۷c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ TextView f۱۰۰۱۸d;

        Ca(int i, TextView textView, int i2, TextView textView2) {
            this.f۱۰۰۱۵a = i;
            this.f۱۰۰۱۶b = textView;
            this.f۱۰۰۱۷c = i2;
            this.f۱۰۰۱۸d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            Cp.this.f۱۰۰۰۴i = this.f۱۰۰۱۵a;
            Cp.this.f۱۰۰۰۲g = null;
            TextView textView = this.f۱۰۰۱۶b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f۱۰۰۱۷c == 1 && Cp.this.f۱۰۰۰۸m != null) {
                    Cp.this.f۱۰۰۰۸m.setText((CharSequence) null);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f۱۰۰۱۸d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۹۶۵a(int captionToHide, int captionToShow) {
        TextView captionViewDisplayed;
        TextView captionViewToShow;
        if (captionToHide != captionToShow) {
            if (!(captionToShow == 0 || (captionViewToShow = m۱۱۹۷۱d(captionToShow)) == null)) {
                captionViewToShow.setVisibility(0);
                captionViewToShow.setAlpha(1.0f);
            }
            if (!(captionToHide == 0 || (captionViewDisplayed = m۱۱۹۷۱d(captionToHide)) == null)) {
                captionViewDisplayed.setVisibility(4);
                if (captionToHide == 1) {
                    captionViewDisplayed.setText((CharSequence) null);
                }
            }
            this.f۱۰۰۰۴i = captionToShow;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۹۶۹a(List<Animator> captionAnimatorList, boolean captionEnabled, TextView captionView, int captionState, int captionToHide, int captionToShow) {
        if (captionView != null && captionEnabled) {
            if (captionState == captionToShow || captionState == captionToHide) {
                captionAnimatorList.add(m۱۱۹۶۳a(captionView, captionToShow == captionState));
                if (captionToShow == captionState) {
                    captionAnimatorList.add(m۱۱۹۶۲a(captionView));
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private ObjectAnimator m۱۱۹۶۳a(TextView captionView, boolean display) {
        ObjectAnimator opacityAnimator = ObjectAnimator.ofFloat(captionView, View.ALPHA, display ? 1.0f : 0.0f);
        opacityAnimator.setDuration(167L);
        opacityAnimator.setInterpolator(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.f۸۲۵۱a);
        return opacityAnimator;
    }

    /* renamed from: a  reason: contains not printable characters */
    private ObjectAnimator m۱۱۹۶۲a(TextView captionView) {
        ObjectAnimator translationYAnimator = ObjectAnimator.ofFloat(captionView, View.TRANSLATION_Y, -this.f۱۰۰۰۳h, 0.0f);
        translationYAnimator.setDuration(217L);
        translationYAnimator.setInterpolator(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.f۸۲۵۴d);
        return translationYAnimator;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۹۸۱b() {
        Animator animator = this.f۱۰۰۰۲g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۹۸۰a(int index) {
        return index == 0 || index == 1;
    }

    /* renamed from: d  reason: contains not printable characters */
    private TextView m۱۱۹۷۱d(int captionDisplayState) {
        if (captionDisplayState == 1) {
            return this.f۱۰۰۰۸m;
        }
        if (captionDisplayState != 2) {
            return null;
        }
        return this.f۱۰۰۱۲q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۹۷۴a() {
        if (m۱۱۹۷۳m()) {
            Cu.m۱۲۹۸۰a(this.f۹۹۹۸c, Cu.m۱۳۰۱۸o(this.f۹۹۹۷b.getEditText()), 0, Cu.m۱۳۰۱۷n(this.f۹۹۹۷b.getEditText()), 0);
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    private boolean m۱۱۹۷۳m() {
        return (this.f۹۹۹۸c == null || this.f۹۹۹۷b.getEditText() == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۹۷۷a(TextView indicator, int index) {
        if (this.f۹۹۹۸c == null && this.f۱۰۰۰۰e == null) {
            this.f۹۹۹۸c = new LinearLayout(this.f۹۹۹۶a);
            this.f۹۹۹۸c.setOrientation(0);
            this.f۹۹۹۷b.addView(this.f۹۹۹۸c, -1, -2);
            this.f۱۰۰۰۰e = new FrameLayout(this.f۹۹۹۶a);
            this.f۹۹۹۸c.addView(this.f۱۰۰۰۰e, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f۹۹۹۸c.addView(new Space(this.f۹۹۹۶a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f۹۹۹۷b.getEditText() != null) {
                m۱۱۹۷۴a();
            }
        }
        if (m۱۱۹۸۰a(index)) {
            this.f۱۰۰۰۰e.setVisibility(0);
            this.f۱۰۰۰۰e.addView(indicator);
            this.f۱۰۰۰۱f++;
        } else {
            this.f۹۹۹۸c.addView(indicator, index);
        }
        this.f۹۹۹۸c.setVisibility(0);
        this.f۹۹۹۹d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۹۸۴b(TextView indicator, int index) {
        FrameLayout frameLayout;
        if (this.f۹۹۹۸c != null) {
            if (!m۱۱۹۸۰a(index) || (frameLayout = this.f۱۰۰۰۰e) == null) {
                this.f۹۹۹۸c.removeView(indicator);
            } else {
                this.f۱۰۰۰۱f--;
                m۱۱۹۶۷a(frameLayout, this.f۱۰۰۰۱f);
                this.f۱۰۰۰۰e.removeView(indicator);
            }
            this.f۹۹۹۹d--;
            m۱۱۹۶۷a(this.f۹۹۹۸c, this.f۹۹۹۹d);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۹۶۷a(ViewGroup viewGroup, int indicatorsAdded) {
        if (indicatorsAdded == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۹۷۹a(boolean enabled) {
        if (this.f۱۰۰۰۷l != enabled) {
            m۱۱۹۸۱b();
            if (enabled) {
                this.f۱۰۰۰۸m = new AppCompatTextView(this.f۹۹۹۶a);
                this.f۱۰۰۰۸m.setId(Cf.textinput_error);
                Typeface typeface = this.f۱۰۰۱۴s;
                if (typeface != null) {
                    this.f۱۰۰۰۸m.setTypeface(typeface);
                }
                m۱۱۹۸۲b(this.f۱۰۰۰۹n);
                this.f۱۰۰۰۸m.setVisibility(4);
                Cu.m۱۳۰۰۵e(this.f۱۰۰۰۸m, 1);
                m۱۱۹۷۷a(this.f۱۰۰۰۸m, 0);
            } else {
                m۱۱۹۹۴i();
                m۱۱۹۸۴b(this.f۱۰۰۰۸m, 0);
                this.f۱۰۰۰۸m = null;
                this.f۹۹۹۷b.m۱۱۷۹۴c();
                this.f۹۹۹۷b.m۱۱۷۹۵d();
            }
            this.f۱۰۰۰۷l = enabled;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k  reason: contains not printable characters */
    public boolean m۱۱۹۹۶k() {
        return this.f۱۰۰۰۷l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l  reason: contains not printable characters */
    public boolean m۱۱۹۹۷l() {
        return this.f۱۰۰۱۱p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۹۸۶b(boolean enabled) {
        if (this.f۱۰۰۱۱p != enabled) {
            m۱۱۹۸۱b();
            if (enabled) {
                this.f۱۰۰۱۲q = new AppCompatTextView(this.f۹۹۹۶a);
                this.f۱۰۰۱۲q.setId(Cf.textinput_helper_text);
                Typeface typeface = this.f۱۰۰۱۴s;
                if (typeface != null) {
                    this.f۱۰۰۱۲q.setTypeface(typeface);
                }
                this.f۱۰۰۱۲q.setVisibility(4);
                Cu.m۱۳۰۰۵e(this.f۱۰۰۱۲q, 1);
                m۱۱۹۸۷c(this.f۱۰۰۱۳r);
                m۱۱۹۷۷a(this.f۱۰۰۱۲q, 1);
            } else {
                m۱۱۹۹۵j();
                m۱۱۹۸۴b(this.f۱۰۰۱۲q, 1);
                this.f۱۰۰۱۲q = null;
                this.f۹۹۹۷b.m۱۱۷۹۴c();
                this.f۹۹۹۷b.m۱۱۷۹۵d();
            }
            this.f۱۰۰۱۱p = enabled;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۱۹۸۸c() {
        return m۱۱۹۷۲e(this.f۱۰۰۰۵j);
    }

    /* renamed from: e  reason: contains not printable characters */
    private boolean m۱۱۹۷۲e(int captionState) {
        if (captionState != 1 || this.f۱۰۰۰۸m == null || TextUtils.isEmpty(this.f۱۰۰۰۶k)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public CharSequence m۱۱۹۸۹d() {
        return this.f۱۰۰۰۶k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public CharSequence m۱۱۹۹۲g() {
        return this.f۱۰۰۱۰o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۹۷۶a(Typeface typeface) {
        if (typeface != this.f۱۰۰۱۴s) {
            this.f۱۰۰۱۴s = typeface;
            m۱۱۹۶۸a(this.f۱۰۰۰۸m, typeface);
            m۱۱۹۶۸a(this.f۱۰۰۱۲q, typeface);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۹۶۸a(TextView captionView, Typeface typeface) {
        if (captionView != null) {
            captionView.setTypeface(typeface);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public int m۱۱۹۹۰e() {
        TextView textView = this.f۱۰۰۰۸m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public ColorStateList m۱۱۹۹۱f() {
        TextView textView = this.f۱۰۰۰۸m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۹۷۵a(ColorStateList textColors) {
        TextView textView = this.f۱۰۰۰۸m;
        if (textView != null) {
            textView.setTextColor(textColors);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۹۸۲b(int resId) {
        this.f۱۰۰۰۹n = resId;
        TextView textView = this.f۱۰۰۰۸m;
        if (textView != null) {
            this.f۹۹۹۷b.m۱۱۷۸۹a(textView, resId);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public int m۱۱۹۹۳h() {
        TextView textView = this.f۱۰۰۱۲q;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۹۸۳b(ColorStateList textColors) {
        TextView textView = this.f۱۰۰۱۲q;
        if (textView != null) {
            textView.setTextColor(textColors);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۹۸۷c(int resId) {
        this.f۱۰۰۱۳r = resId;
        TextView textView = this.f۱۰۰۱۲q;
        if (textView != null) {
            android.support.p۰۴۳v4.widget.Cp.m۱۳۳۱۲d(textView, resId);
        }
    }
}
