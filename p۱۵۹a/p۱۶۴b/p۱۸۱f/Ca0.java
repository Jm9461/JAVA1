package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.Cu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* renamed from: a.b.f.a0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ca0 implements InterfaceCc0 {

    /* renamed from: a, reason: contains not printable characters */
    protected a f۸۴۷۸a;

    Ca0(Context context, ViewGroup hostView, View requestingView) {
        this.f۸۴۷۸a = new a(context, hostView, requestingView, this);
    }

    /* renamed from: d, reason: contains not printable characters */
    static ViewGroup m۸۱۰۱d(View view) {
        View parent = view;
        while (parent != null) {
            if (parent.getId() == 16908290 && (parent instanceof ViewGroup)) {
                return (ViewGroup) parent;
            }
            if (parent.getParent() instanceof ViewGroup) {
                parent = (ViewGroup) parent.getParent();
            }
        }
        return null;
    }

    /* renamed from: c, reason: contains not printable characters */
    static Ca0 m۸۱۰۰c(View view) {
        ViewGroup contentView = m۸۱۰۱d(view);
        if (contentView != null) {
            int numChildren = contentView.getChildCount();
            for (int i = 0; i < numChildren; i++) {
                View child = contentView.getChildAt(i);
                if (child instanceof a) {
                    return ((a) child).f۸۴۸۲f;
                }
            }
            return new Cu(contentView.getContext(), contentView, view);
        }
        return null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.InterfaceCc0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۳۴۰a(Drawable drawable) {
        this.f۸۴۷۸a.m۸۱۰۵a(drawable);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.InterfaceCc0
    /* renamed from: b, reason: contains not printable characters */
    public void mo۸۳۴۲b(Drawable drawable) {
        this.f۸۴۷۸a.m۸۱۰۸b(drawable);
    }

    /* renamed from: a.b.f.a0$a */
    static class a extends ViewGroup {

        /* renamed from: c, reason: contains not printable characters */
        ViewGroup f۸۴۷۹c;

        /* renamed from: d, reason: contains not printable characters */
        View f۸۴۸۰d;

        /* renamed from: e, reason: contains not printable characters */
        ArrayList<Drawable> f۸۴۸۱e;

        /* renamed from: f, reason: contains not printable characters */
        Ca0 f۸۴۸۲f;

        static {
            try {
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException e2) {
            }
        }

        a(Context context, ViewGroup hostView, View requestingView, Ca0 viewOverlay) {
            super(context);
            this.f۸۴۸۱e = null;
            this.f۸۴۷۹c = hostView;
            this.f۸۴۸۰d = requestingView;
            setRight(hostView.getWidth());
            setBottom(hostView.getHeight());
            hostView.addView(this);
            this.f۸۴۸۲f = viewOverlay;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent ev) {
            return false;
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۸۱۰۵a(Drawable drawable) {
            if (this.f۸۴۸۱e == null) {
                this.f۸۴۸۱e = new ArrayList<>();
            }
            if (!this.f۸۴۸۱e.contains(drawable)) {
                this.f۸۴۸۱e.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b, reason: contains not printable characters */
        public void m۸۱۰۸b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f۸۴۸۱e;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
            }
        }

        @Override // android.view.View
        protected boolean verifyDrawable(Drawable who) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(who) || ((arrayList = this.f۸۴۸۱e) != null && arrayList.contains(who));
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۸۱۰۶a(View child) {
            if (child.getParent() instanceof ViewGroup) {
                ViewGroup parent = (ViewGroup) child.getParent();
                if (parent != this.f۸۴۷۹c && parent.getParent() != null && Cu.m۱۰۹۵۷x(parent)) {
                    int[] parentLocation = new int[2];
                    int[] hostViewLocation = new int[2];
                    parent.getLocationOnScreen(parentLocation);
                    this.f۸۴۷۹c.getLocationOnScreen(hostViewLocation);
                    Cu.m۱۰۹۳۱c(child, parentLocation[0] - hostViewLocation[0]);
                    Cu.m۱۰۹۳۳d(child, parentLocation[1] - hostViewLocation[1]);
                }
                parent.removeView(child);
                if (child.getParent() != null) {
                    parent.removeView(child);
                }
            }
            super.addView(child, getChildCount() - 1);
        }

        /* renamed from: b, reason: contains not printable characters */
        public void m۸۱۰۹b(View view) {
            super.removeView(view);
            if (m۸۱۰۷a()) {
                this.f۸۴۷۹c.removeView(this);
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        boolean m۸۱۰۷a() {
            ArrayList<Drawable> arrayList;
            return getChildCount() == 0 && ((arrayList = this.f۸۴۸۱e) == null || arrayList.size() == 0);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            int[] contentViewLocation = new int[2];
            int[] hostViewLocation = new int[2];
            this.f۸۴۷۹c.getLocationOnScreen(contentViewLocation);
            this.f۸۴۸۰d.getLocationOnScreen(hostViewLocation);
            canvas.translate(hostViewLocation[0] - contentViewLocation[0], hostViewLocation[1] - contentViewLocation[1]);
            canvas.clipRect(new Rect(0, 0, this.f۸۴۸۰d.getWidth(), this.f۸۴۸۰d.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f۸۴۸۱e;
            int numDrawables = arrayList != null ? arrayList.size() : 0;
            for (int i = 0; i < numDrawables; i++) {
                this.f۸۴۸۱e.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean changed, int l, int t, int r, int b2) {
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۸۱۰۴a(int[] offset) {
            int[] contentViewLocation = new int[2];
            int[] hostViewLocation = new int[2];
            this.f۸۴۷۹c.getLocationOnScreen(contentViewLocation);
            this.f۸۴۸۰d.getLocationOnScreen(hostViewLocation);
            offset[0] = hostViewLocation[0] - contentViewLocation[0];
            offset[1] = hostViewLocation[1] - contentViewLocation[1];
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
            if (this.f۸۴۷۹c != null) {
                dirty.offset(location[0], location[1]);
                if (this.f۸۴۷۹c instanceof ViewGroup) {
                    location[0] = 0;
                    location[1] = 0;
                    int[] offset = new int[2];
                    m۸۱۰۴a(offset);
                    dirty.offset(offset[0], offset[1]);
                    return super.invalidateChildInParent(location, dirty);
                }
                invalidate(dirty);
                return null;
            }
            return null;
        }
    }
}
