package a.b.f;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.u;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class a0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    protected a f۱۶۳a;

    a0(Context context, ViewGroup hostView, View requestingView) {
        this.f۱۶۳a = new a(context, hostView, requestingView, this);
    }

    static ViewGroup d(View view) {
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

    static a0 c(View view) {
        ViewGroup contentView = d(view);
        if (contentView == null) {
            return null;
        }
        int numChildren = contentView.getChildCount();
        for (int i = 0; i < numChildren; i++) {
            View child = contentView.getChildAt(i);
            if (child instanceof a) {
                return ((a) child).f۱۶۷f;
            }
        }
        return new u(contentView.getContext(), contentView, view);
    }

    @Override // a.b.f.c0
    public void a(Drawable drawable) {
        this.f۱۶۳a.a(drawable);
    }

    @Override // a.b.f.c0
    public void b(Drawable drawable) {
        this.f۱۶۳a.b(drawable);
    }

    /* access modifiers changed from: package-private */
    public static class a extends ViewGroup {

        /* renamed from: c  reason: collision with root package name */
        ViewGroup f۱۶۴c;

        /* renamed from: d  reason: collision with root package name */
        View f۱۶۵d;

        /* renamed from: e  reason: collision with root package name */
        ArrayList<Drawable> f۱۶۶e = null;

        /* renamed from: f  reason: collision with root package name */
        a0 f۱۶۷f;

        static {
            try {
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException e2) {
            }
        }

        a(Context context, ViewGroup hostView, View requestingView, a0 viewOverlay) {
            super(context);
            this.f۱۶۴c = hostView;
            this.f۱۶۵d = requestingView;
            setRight(hostView.getWidth());
            setBottom(hostView.getHeight());
            hostView.addView(this);
            this.f۱۶۷f = viewOverlay;
        }

        public boolean dispatchTouchEvent(MotionEvent ev) {
            return false;
        }

        public void a(Drawable drawable) {
            if (this.f۱۶۶e == null) {
                this.f۱۶۶e = new ArrayList<>();
            }
            if (!this.f۱۶۶e.contains(drawable)) {
                this.f۱۶۶e.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        public void b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f۱۶۶e;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
            }
        }

        /* access modifiers changed from: protected */
        public boolean verifyDrawable(Drawable who) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(who) || ((arrayList = this.f۱۶۶e) != null && arrayList.contains(who));
        }

        public void a(View child) {
            if (child.getParent() instanceof ViewGroup) {
                ViewGroup parent = (ViewGroup) child.getParent();
                if (!(parent == this.f۱۶۴c || parent.getParent() == null || !u.x(parent))) {
                    int[] parentLocation = new int[2];
                    int[] hostViewLocation = new int[2];
                    parent.getLocationOnScreen(parentLocation);
                    this.f۱۶۴c.getLocationOnScreen(hostViewLocation);
                    u.c(child, parentLocation[0] - hostViewLocation[0]);
                    u.d(child, parentLocation[1] - hostViewLocation[1]);
                }
                parent.removeView(child);
                if (child.getParent() != null) {
                    parent.removeView(child);
                }
            }
            super.addView(child, getChildCount() - 1);
        }

        public void b(View view) {
            super.removeView(view);
            if (a()) {
                this.f۱۶۴c.removeView(this);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            ArrayList<Drawable> arrayList;
            return getChildCount() == 0 && ((arrayList = this.f۱۶۶e) == null || arrayList.size() == 0);
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] contentViewLocation = new int[2];
            int[] hostViewLocation = new int[2];
            this.f۱۶۴c.getLocationOnScreen(contentViewLocation);
            this.f۱۶۵d.getLocationOnScreen(hostViewLocation);
            int numDrawables = 0;
            canvas.translate((float) (hostViewLocation[0] - contentViewLocation[0]), (float) (hostViewLocation[1] - contentViewLocation[1]));
            canvas.clipRect(new Rect(0, 0, this.f۱۶۵d.getWidth(), this.f۱۶۵d.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f۱۶۶e;
            if (arrayList != null) {
                numDrawables = arrayList.size();
            }
            for (int i = 0; i < numDrawables; i++) {
                this.f۱۶۶e.get(i).draw(canvas);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean changed, int l, int t, int r, int b2) {
        }

        private void a(int[] offset) {
            int[] contentViewLocation = new int[2];
            int[] hostViewLocation = new int[2];
            this.f۱۶۴c.getLocationOnScreen(contentViewLocation);
            this.f۱۶۵d.getLocationOnScreen(hostViewLocation);
            offset[0] = hostViewLocation[0] - contentViewLocation[0];
            offset[1] = hostViewLocation[1] - contentViewLocation[1];
        }

        public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
            if (this.f۱۶۴c == null) {
                return null;
            }
            dirty.offset(location[0], location[1]);
            if (this.f۱۶۴c instanceof ViewGroup) {
                location[0] = 0;
                location[1] = 0;
                int[] offset = new int[2];
                a(offset);
                dirty.offset(offset[0], offset[1]);
                return super.invalidateChildInParent(location, dirty);
            }
            invalidate(dirty);
            return null;
        }
    }
}
