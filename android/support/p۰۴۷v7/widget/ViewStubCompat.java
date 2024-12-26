package android.support.p۰۴۷v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* renamed from: android.support.v7.widget.ViewStubCompat */
public final class ViewStubCompat extends View {

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۱۸۹۵c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۱۸۹۶d;

    /* renamed from: e  reason: contains not printable characters */
    private WeakReference<View> f۱۱۸۹۷e;

    /* renamed from: f  reason: contains not printable characters */
    private LayoutInflater f۱۱۸۹۸f;

    /* renamed from: g  reason: contains not printable characters */
    private AbstractCa f۱۱۸۹۹g;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a  reason: invalid class name */
    public interface AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۴۹۵۹a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f۱۱۸۹۵c = 0;
        TypedArray a = context.obtainStyledAttributes(attrs, Cj.ViewStubCompat, defStyle, 0);
        this.f۱۱۸۹۶d = a.getResourceId(Cj.ViewStubCompat_android_inflatedId, -1);
        this.f۱۱۸۹۵c = a.getResourceId(Cj.ViewStubCompat_android_layout, 0);
        setId(a.getResourceId(Cj.ViewStubCompat_android_id, -1));
        a.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f۱۱۸۹۶d;
    }

    public void setInflatedId(int inflatedId) {
        this.f۱۱۸۹۶d = inflatedId;
    }

    public int getLayoutResource() {
        return this.f۱۱۸۹۵c;
    }

    public void setLayoutResource(int layoutResource) {
        this.f۱۱۸۹۵c = layoutResource;
    }

    public void setLayoutInflater(LayoutInflater inflater) {
        this.f۱۱۸۹۸f = inflater;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f۱۱۸۹۸f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    public void setVisibility(int visibility) {
        WeakReference<View> weakReference = this.f۱۱۸۹۷e;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(visibility);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(visibility);
        if (visibility == 0 || visibility == 4) {
            m۱۴۹۵۸a();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public View m۱۴۹۵۸a() {
        LayoutInflater factory;
        ViewParent viewParent = getParent();
        if (viewParent == null || !(viewParent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f۱۱۸۹۵c != 0) {
            ViewGroup parent = (ViewGroup) viewParent;
            if (this.f۱۱۸۹۸f != null) {
                factory = this.f۱۱۸۹۸f;
            } else {
                factory = LayoutInflater.from(getContext());
            }
            View view = factory.inflate(this.f۱۱۸۹۵c, parent, false);
            int i = this.f۱۱۸۹۶d;
            if (i != -1) {
                view.setId(i);
            }
            int index = parent.indexOfChild(this);
            parent.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                parent.addView(view, index, layoutParams);
            } else {
                parent.addView(view, index);
            }
            this.f۱۱۸۹۷e = new WeakReference<>(view);
            AbstractCa aVar = this.f۱۱۸۹۹g;
            if (aVar != null) {
                aVar.m۱۴۹۵۹a(this, view);
            }
            return view;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void setOnInflateListener(AbstractCa inflateListener) {
        this.f۱۱۸۹۹g = inflateListener;
    }
}
