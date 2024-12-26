package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.view.p۰۴۵d0.Cc;
import android.support.p۰۴۷v7.app.DialogCi;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cf;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ch;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cj;

/* renamed from: android.support.design.widget.e  reason: invalid class name */
public class DialogCe extends DialogCi {

    /* renamed from: e  reason: contains not printable characters */
    private BottomSheetBehavior<FrameLayout> f۹۸۵۶e;

    /* renamed from: f  reason: contains not printable characters */
    boolean f۹۸۵۷f;

    /* renamed from: g  reason: contains not printable characters */
    private boolean f۹۸۵۸g;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۹۸۵۹h;

    /* renamed from: i  reason: contains not printable characters */
    private BottomSheetBehavior.AbstractCc f۹۸۶۰i;

    public DialogCe(Context context) {
        this(context, 0);
    }

    public DialogCe(Context context, int theme) {
        super(context, m۱۱۸۰۳a(context, theme));
        this.f۹۸۵۷f = true;
        this.f۹۸۵۸g = true;
        this.f۹۸۶۰i = new Cd();
        m۱۳۶۲۹a(1);
    }

    @Override // android.support.p۰۴۷v7.app.DialogCi, android.app.Dialog
    public void setContentView(int layoutResId) {
        super.setContentView(m۱۱۸۰۴a(layoutResId, null, null));
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.app.DialogCi
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.support.p۰۴۷v7.app.DialogCi, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m۱۱۸۰۴a(0, view, null));
    }

    @Override // android.support.p۰۴۷v7.app.DialogCi
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(m۱۱۸۰۴a(0, view, params));
    }

    public void setCancelable(boolean cancelable) {
        super.setCancelable(cancelable);
        if (this.f۹۸۵۷f != cancelable) {
            this.f۹۸۵۷f = cancelable;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f۹۸۵۶e;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.m۱۱۴۹۴b(cancelable);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f۹۸۵۶e;
        if (bottomSheetBehavior != null && bottomSheetBehavior.m۱۱۴۹۲b() == 5) {
            this.f۹۸۵۶e.m۱۱۴۹۷c(4);
        }
    }

    public void setCanceledOnTouchOutside(boolean cancel) {
        super.setCanceledOnTouchOutside(cancel);
        if (cancel && !this.f۹۸۵۷f) {
            this.f۹۸۵۷f = true;
        }
        this.f۹۸۵۸g = cancel;
        this.f۹۸۵۹h = true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private View m۱۱۸۰۴a(int layoutResId, View view, ViewGroup.LayoutParams params) {
        FrameLayout container = (FrameLayout) View.inflate(getContext(), Ch.design_bottom_sheet_dialog, null);
        CoordinatorLayout coordinator = (CoordinatorLayout) container.findViewById(Cf.coordinator);
        if (layoutResId != 0 && view == null) {
            view = getLayoutInflater().inflate(layoutResId, (ViewGroup) coordinator, false);
        }
        FrameLayout bottomSheet = (FrameLayout) coordinator.findViewById(Cf.design_bottom_sheet);
        this.f۹۸۵۶e = BottomSheetBehavior.m۱۱۴۷۴b(bottomSheet);
        this.f۹۸۵۶e.m۱۱۴۸۲a(this.f۹۸۶۰i);
        this.f۹۸۵۶e.m۱۱۴۹۴b(this.f۹۸۵۷f);
        if (params == null) {
            bottomSheet.addView(view);
        } else {
            bottomSheet.addView(view, params);
        }
        coordinator.findViewById(Cf.touch_outside).setOnClickListener(new View$OnClickListenerCa());
        Cu.m۱۲۹۸۵a(bottomSheet, new Cb());
        bottomSheet.setOnTouchListener(new View$OnTouchListenerCc(this));
        return container;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.e$a  reason: invalid class name */
    public class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View view) {
            DialogCe eVar = DialogCe.this;
            if (eVar.f۹۸۵۷f && eVar.isShowing() && DialogCe.this.m۱۱۸۰۵b()) {
                DialogCe.this.cancel();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.e$b  reason: invalid class name */
    public class Cb extends android.support.p۰۴۳v4.view.Cb {
        Cb() {
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۸۰۶a(View host, Cc info2) {
            super.m۱۲۷۹۷a(host, info2);
            if (DialogCe.this.f۹۸۵۷f) {
                info2.m۱۲۸۳۸a(1048576);
                info2.m۱۲۸۶۸f(true);
                return;
            }
            info2.m۱۲۸۶۸f(false);
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۸۰۷a(View host, int action, Bundle args) {
            if (action == 1048576) {
                DialogCe eVar = DialogCe.this;
                if (eVar.f۹۸۵۷f) {
                    eVar.cancel();
                    return true;
                }
            }
            return super.m۱۲۷۹۸a(host, action, args);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.e$c  reason: invalid class name */
    public class View$OnTouchListenerCc implements View.OnTouchListener {
        View$OnTouchListenerCc(DialogCe this$0) {
        }

        public boolean onTouch(View view, MotionEvent event) {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۱۸۰۵b() {
        if (!this.f۹۸۵۹h) {
            TypedArray a = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f۹۸۵۸g = a.getBoolean(0, true);
            a.recycle();
            this.f۹۸۵۹h = true;
        }
        return this.f۹۸۵۸g;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۱۸۰۳a(Context context, int themeId) {
        if (themeId != 0) {
            return themeId;
        }
        TypedValue outValue = new TypedValue();
        if (context.getTheme().resolveAttribute(p۰۰۰a.p۰۰۵b.p۰۰۸c.Cb.bottomSheetDialogTheme, outValue, true)) {
            return outValue.resourceId;
        }
        return Cj.Theme_Design_Light_BottomSheetDialog;
    }

    /* renamed from: android.support.design.widget.e$d  reason: invalid class name */
    class Cd extends BottomSheetBehavior.AbstractCc {
        Cd() {
        }

        @Override // android.support.design.widget.BottomSheetBehavior.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۸۰۹a(View bottomSheet, int newState) {
            if (newState == 5) {
                DialogCe.this.cancel();
            }
        }

        @Override // android.support.design.widget.BottomSheetBehavior.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۸۰۸a(View bottomSheet, float slideOffset) {
        }
    }
}
