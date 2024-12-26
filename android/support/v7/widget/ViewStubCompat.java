package android.support.v7.widget;

import a.b.h.a.j;
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

public final class ViewStubCompat extends View {

    /* renamed from: c  reason: collision with root package name */
    private int f۱۹۶۱c;

    /* renamed from: d  reason: collision with root package name */
    private int f۱۹۶۲d;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<View> f۱۹۶۳e;

    /* renamed from: f  reason: collision with root package name */
    private LayoutInflater f۱۹۶۴f;

    /* renamed from: g  reason: collision with root package name */
    private a f۱۹۶۵g;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f۱۹۶۱c = 0;
        TypedArray a2 = context.obtainStyledAttributes(attrs, j.ViewStubCompat, defStyle, 0);
        this.f۱۹۶۲d = a2.getResourceId(j.ViewStubCompat_android_inflatedId, -1);
        this.f۱۹۶۱c = a2.getResourceId(j.ViewStubCompat_android_layout, 0);
        setId(a2.getResourceId(j.ViewStubCompat_android_id, -1));
        a2.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f۱۹۶۲d;
    }

    public void setInflatedId(int inflatedId) {
        this.f۱۹۶۲d = inflatedId;
    }

    public int getLayoutResource() {
        return this.f۱۹۶۱c;
    }

    public void setLayoutResource(int layoutResource) {
        this.f۱۹۶۱c = layoutResource;
    }

    public void setLayoutInflater(LayoutInflater inflater) {
        this.f۱۹۶۴f = inflater;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f۱۹۶۴f;
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
        WeakReference<View> weakReference = this.f۱۹۶۳e;
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
            a();
        }
    }

    public View a() {
        LayoutInflater factory;
        ViewParent viewParent = getParent();
        if (viewParent == null || !(viewParent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f۱۹۶۱c != 0) {
            ViewGroup parent = (ViewGroup) viewParent;
            if (this.f۱۹۶۴f != null) {
                factory = this.f۱۹۶۴f;
            } else {
                factory = LayoutInflater.from(getContext());
            }
            View view = factory.inflate(this.f۱۹۶۱c, parent, false);
            int i = this.f۱۹۶۲d;
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
            this.f۱۹۶۳e = new WeakReference<>(view);
            a aVar = this.f۱۹۶۵g;
            if (aVar != null) {
                aVar.a(this, view);
            }
            return view;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void setOnInflateListener(a inflateListener) {
        this.f۱۹۶۵g = inflateListener;
    }
}
