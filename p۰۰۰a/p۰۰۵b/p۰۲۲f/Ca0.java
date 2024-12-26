package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.view.Cu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: a.b.f.a0  reason: invalid class name */
public class Ca0 implements AbstractCc0 {

    /* renamed from: a  reason: contains not printable characters */
    protected Ca f۸۴۷۸a;

    Ca0(Context context, ViewGroup hostView, View requestingView) {
        this.f۸۴۷۸a = new Ca(context, hostView, requestingView, this);
    }

    /* renamed from: d  reason: contains not printable characters */
    static ViewGroup m۱۰۱۶۸d(View view) {
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

    /* renamed from: c  reason: contains not printable characters */
    static Ca0 m۱۰۱۶۷c(View view) {
        ViewGroup contentView = m۱۰۱۶۸d(view);
        if (contentView == null) {
            return null;
        }
        int numChildren = contentView.getChildCount();
        for (int i = 0; i < numChildren; i++) {
            View child = contentView.getChildAt(i);
            if (child instanceof Ca) {
                return ((Ca) child).f۸۴۸۲f;
            }
        }
        return new Cu(contentView.getContext(), contentView, view);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCc0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۱۶۹a(Drawable drawable) {
        this.f۸۴۷۸a.m۱۰۱۷۲a(drawable);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCc0
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۱۷۰b(Drawable drawable) {
        this.f۸۴۷۸a.m۱۰۱۷۵b(drawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.f.a0$a  reason: invalid class name */
    public static class Ca extends ViewGroup {

        /* renamed from: c  reason: contains not printable characters */
        ViewGroup f۸۴۷۹c;

        /* renamed from: d  reason: contains not printable characters */
        View f۸۴۸۰d;

        /* renamed from: e  reason: contains not printable characters */
        ArrayList<Drawable> f۸۴۸۱e = null;

        /* renamed from: f  reason: contains not printable characters */
        Ca0 f۸۴۸۲f;

        static {
            try {
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException e) {
            }
        }

        Ca(Context context, ViewGroup hostView, View requestingView, Ca0 viewOverlay) {
            super(context);
            this.f۸۴۷۹c = hostView;
            this.f۸۴۸۰d = requestingView;
            setRight(hostView.getWidth());
            setBottom(hostView.getHeight());
            hostView.addView(this);
            this.f۸۴۸۲f = viewOverlay;
        }

        public boolean dispatchTouchEvent(MotionEvent ev) {
            return false;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۱۷۲a(Drawable drawable) {
            if (this.f۸۴۸۱e == null) {
                this.f۸۴۸۱e = new ArrayList<>();
            }
            if (!this.f۸۴۸۱e.contains(drawable)) {
                this.f۸۴۸۱e.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۰۱۷۵b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f۸۴۸۱e;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
            }
        }

        /* access modifiers changed from: protected */
        public boolean verifyDrawable(Drawable who) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(who) || ((arrayList = this.f۸۴۸۱e) != null && arrayList.contains(who));
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۱۷۳a(View child) {
            if (child.getParent() instanceof ViewGroup) {
                ViewGroup parent = (ViewGroup) child.getParent();
                if (!(parent == this.f۸۴۷۹c || parent.getParent() == null || !Cu.m۱۳۰۲۷x(parent))) {
                    int[] parentLocation = new int[2];
                    int[] hostViewLocation = new int[2];
                    parent.getLocationOnScreen(parentLocation);
                    this.f۸۴۷۹c.getLocationOnScreen(hostViewLocation);
                    Cu.m۱۳۰۰۱c(child, parentLocation[0] - hostViewLocation[0]);
                    Cu.m۱۳۰۰۳d(child, parentLocation[1] - hostViewLocation[1]);
                }
                parent.removeView(child);
                if (child.getParent() != null) {
                    parent.removeView(child);
                }
            }
            super.addView(child, getChildCount() - 1);
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۰۱۷۶b(View view) {
            super.removeView(view);
            if (m۱۰۱۷۴a()) {
                this.f۸۴۷۹c.removeView(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۱۷۴a() {
            ArrayList<Drawable> arrayList;
            return getChildCount() == 0 && ((arrayList = this.f۸۴۸۱e) == null || arrayList.size() == 0);
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] contentViewLocation = new int[2];
            int[] hostViewLocation = new int[2];
            this.f۸۴۷۹c.getLocationOnScreen(contentViewLocation);
            this.f۸۴۸۰d.getLocationOnScreen(hostViewLocation);
            int numDrawables = 0;
            canvas.translate((float) (hostViewLocation[0] - contentViewLocation[0]), (float) (hostViewLocation[1] - contentViewLocation[1]));
            canvas.clipRect(new Rect(0, 0, this.f۸۴۸۰d.getWidth(), this.f۸۴۸۰d.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f۸۴۸۱e;
            if (arrayList != null) {
                numDrawables = arrayList.size();
            }
            for (int i = 0; i < numDrawables; i++) {
                this.f۸۴۸۱e.get(i).draw(canvas);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean changed, int l, int t, int r, int b) {
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۰۱۷۱a(int[] offset) {
            int[] contentViewLocation = new int[2];
            int[] hostViewLocation = new int[2];
            this.f۸۴۷۹c.getLocationOnScreen(contentViewLocation);
            this.f۸۴۸۰d.getLocationOnScreen(hostViewLocation);
            offset[0] = hostViewLocation[0] - contentViewLocation[0];
            offset[1] = hostViewLocation[1] - contentViewLocation[1];
        }

        public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
            if (this.f۸۴۷۹c == null) {
                return null;
            }
            dirty.offset(location[0], location[1]);
            if (this.f۸۴۷۹c instanceof ViewGroup) {
                location[0] = 0;
                location[1] = 0;
                int[] offset = new int[2];
                m۱۰۱۷۱a(offset);
                dirty.offset(offset[0], offset[1]);
                return super.invalidateChildInParent(location, dirty);
            }
            invalidate(dirty);
            return null;
        }
    }
}
