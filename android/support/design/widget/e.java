package android.support.design.widget;

import a.b.c.f;
import a.b.c.h;
import a.b.c.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.view.u;
import android.support.v7.app.i;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;

public class e extends i {

    /* renamed from: e  reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f۹۲۵e;

    /* renamed from: f  reason: collision with root package name */
    boolean f۹۲۶f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f۹۲۷g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f۹۲۸h;
    private BottomSheetBehavior.c i;

    public e(Context context) {
        this(context, 0);
    }

    public e(Context context, int theme) {
        super(context, a(context, theme));
        this.f۹۲۶f = true;
        this.f۹۲۷g = true;
        this.i = new d();
        a(1);
    }

    @Override // android.support.v7.app.i, android.app.Dialog
    public void setContentView(int layoutResId) {
        super.setContentView(a(layoutResId, null, null));
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v7.app.i
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

    @Override // android.support.v7.app.i, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(a(0, view, null));
    }

    @Override // android.support.v7.app.i
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(a(0, view, params));
    }

    public void setCancelable(boolean cancelable) {
        super.setCancelable(cancelable);
        if (this.f۹۲۶f != cancelable) {
            this.f۹۲۶f = cancelable;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f۹۲۵e;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.b(cancelable);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f۹۲۵e;
        if (bottomSheetBehavior != null && bottomSheetBehavior.b() == 5) {
            this.f۹۲۵e.c(4);
        }
    }

    public void setCanceledOnTouchOutside(boolean cancel) {
        super.setCanceledOnTouchOutside(cancel);
        if (cancel && !this.f۹۲۶f) {
            this.f۹۲۶f = true;
        }
        this.f۹۲۷g = cancel;
        this.f۹۲۸h = true;
    }

    private View a(int layoutResId, View view, ViewGroup.LayoutParams params) {
        FrameLayout container = (FrameLayout) View.inflate(getContext(), h.design_bottom_sheet_dialog, null);
        CoordinatorLayout coordinator = (CoordinatorLayout) container.findViewById(f.coordinator);
        if (layoutResId != 0 && view == null) {
            view = getLayoutInflater().inflate(layoutResId, (ViewGroup) coordinator, false);
        }
        FrameLayout bottomSheet = (FrameLayout) coordinator.findViewById(f.design_bottom_sheet);
        this.f۹۲۵e = BottomSheetBehavior.b(bottomSheet);
        this.f۹۲۵e.a(this.i);
        this.f۹۲۵e.b(this.f۹۲۶f);
        if (params == null) {
            bottomSheet.addView(view);
        } else {
            bottomSheet.addView(view, params);
        }
        coordinator.findViewById(f.touch_outside).setOnClickListener(new a());
        u.a(bottomSheet, new b());
        bottomSheet.setOnTouchListener(new c(this));
        return container;
    }

    /* access modifiers changed from: package-private */
    public class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            e eVar = e.this;
            if (eVar.f۹۲۶f && eVar.isShowing() && e.this.b()) {
                e.this.cancel();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends android.support.v4.view.b {
        b() {
        }

        @Override // android.support.v4.view.b
        public void a(View host, android.support.v4.view.d0.c info2) {
            super.a(host, info2);
            if (e.this.f۹۲۶f) {
                info2.a(1048576);
                info2.f(true);
                return;
            }
            info2.f(false);
        }

        @Override // android.support.v4.view.b
        public boolean a(View host, int action, Bundle args) {
            if (action == 1048576) {
                e eVar = e.this;
                if (eVar.f۹۲۶f) {
                    eVar.cancel();
                    return true;
                }
            }
            return super.a(host, action, args);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements View.OnTouchListener {
        c(e this$0) {
        }

        public boolean onTouch(View view, MotionEvent event) {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        if (!this.f۹۲۸h) {
            TypedArray a2 = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f۹۲۷g = a2.getBoolean(0, true);
            a2.recycle();
            this.f۹۲۸h = true;
        }
        return this.f۹۲۷g;
    }

    private static int a(Context context, int themeId) {
        if (themeId != 0) {
            return themeId;
        }
        TypedValue outValue = new TypedValue();
        if (context.getTheme().resolveAttribute(a.b.c.b.bottomSheetDialogTheme, outValue, true)) {
            return outValue.resourceId;
        }
        return j.Theme_Design_Light_BottomSheetDialog;
    }

    class d extends BottomSheetBehavior.c {
        d() {
        }

        @Override // android.support.design.widget.BottomSheetBehavior.c
        public void a(View bottomSheet, int newState) {
            if (newState == 5) {
                e.this.cancel();
            }
        }

        @Override // android.support.design.widget.BottomSheetBehavior.c
        public void a(View bottomSheet, float slideOffset) {
        }
    }
}
