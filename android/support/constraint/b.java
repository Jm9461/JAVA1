package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.i.j.h;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

public abstract class b extends View {

    /* renamed from: c  reason: collision with root package name */
    protected int[] f۵۸۳c = new int[32];

    /* renamed from: d  reason: collision with root package name */
    protected int f۵۸۴d = 0;

    /* renamed from: e  reason: collision with root package name */
    protected Context f۵۸۵e;

    /* renamed from: f  reason: collision with root package name */
    protected h f۵۸۶f = null;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f۵۸۷g = false;

    /* renamed from: h  reason: collision with root package name */
    private String f۵۸۸h;

    public b(Context context) {
        super(context);
        this.f۵۸۵e = context;
        a((AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void a(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a2 = getContext().obtainStyledAttributes(attrs, h.ConstraintLayout_Layout);
            int N = a2.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a2.getIndex(i);
                if (attr == h.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f۵۸۸h = a2.getString(attr);
                    setIds(this.f۵۸۸h);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f۵۸۳c, this.f۵۸۴d);
    }

    public void setReferencedIds(int[] ids) {
        this.f۵۸۴d = 0;
        for (int i : ids) {
            setTag(i, null);
        }
    }

    public void setTag(int tag, Object value) {
        int i = this.f۵۸۴d + 1;
        int[] iArr = this.f۵۸۳c;
        if (i > iArr.length) {
            this.f۵۸۳c = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f۵۸۳c;
        int i2 = this.f۵۸۴d;
        iArr2[i2] = tag;
        this.f۵۸۴d = i2 + 1;
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f۵۸۷g) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void a() {
        if (this.f۵۸۶f != null) {
            ViewGroup.LayoutParams params = getLayoutParams();
            if (params instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) params).k0 = this.f۵۸۶f;
            }
        }
    }

    private void a(String idString) {
        Object value;
        if (idString != null && this.f۵۸۵e != null) {
            String idString2 = idString.trim();
            int tag = 0;
            try {
                tag = g.class.getField(idString2).getInt(null);
            } catch (Exception e2) {
            }
            if (tag == 0) {
                tag = this.f۵۸۵e.getResources().getIdentifier(idString2, "id", this.f۵۸۵e.getPackageName());
            }
            if (tag == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (value = ((ConstraintLayout) getParent()).a(0, idString2)) != null && (value instanceof Integer)) {
                tag = ((Integer) value).intValue();
            }
            if (tag != 0) {
                setTag(tag, null);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + idString2 + "\"");
        }
    }

    private void setIds(String idList) {
        if (idList != null) {
            int begin = 0;
            while (true) {
                int end = idList.indexOf(44, begin);
                if (end == -1) {
                    a(idList.substring(begin));
                    return;
                } else {
                    a(idList.substring(begin, end));
                    begin = end + 1;
                }
            }
        }
    }

    public void c(ConstraintLayout container) {
        if (isInEditMode()) {
            setIds(this.f۵۸۸h);
        }
        h hVar = this.f۵۸۶f;
        if (hVar != null) {
            hVar.H();
            for (int i = 0; i < this.f۵۸۴d; i++) {
                View view = container.findViewById(this.f۵۸۳c[i]);
                if (view != null) {
                    this.f۵۸۶f.b(container.a(view));
                }
            }
        }
    }

    public void a(ConstraintLayout container) {
    }

    public void b(ConstraintLayout container) {
    }
}
