package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.p۰۴۱i.p۰۴۲j.Ch;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: android.support.constraint.b  reason: invalid class name */
public abstract class AbstractCb extends View {

    /* renamed from: c  reason: contains not printable characters */
    protected int[] f۹۱۰۴c = new int[32];

    /* renamed from: d  reason: contains not printable characters */
    protected int f۹۱۰۵d = 0;

    /* renamed from: e  reason: contains not printable characters */
    protected Context f۹۱۰۶e;

    /* renamed from: f  reason: contains not printable characters */
    protected Ch f۹۱۰۷f = null;

    /* renamed from: g  reason: contains not printable characters */
    protected boolean f۹۱۰۸g = false;

    /* renamed from: h  reason: contains not printable characters */
    private String f۹۱۰۹h;

    public AbstractCb(Context context) {
        super(context);
        this.f۹۱۰۶e = context;
        m۱۰۹۶۳a((AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۹۶۳a(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, Ch.ConstraintLayout_Layout);
            int N = a.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a.getIndex(i);
                if (attr == Ch.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f۹۱۰۹h = a.getString(attr);
                    setIds(this.f۹۱۰۹h);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f۹۱۰۴c, this.f۹۱۰۵d);
    }

    public void setReferencedIds(int[] ids) {
        this.f۹۱۰۵d = 0;
        for (int i : ids) {
            setTag(i, null);
        }
    }

    public void setTag(int tag, Object value) {
        int i = this.f۹۱۰۵d + 1;
        int[] iArr = this.f۹۱۰۴c;
        if (i > iArr.length) {
            this.f۹۱۰۴c = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f۹۱۰۴c;
        int i2 = this.f۹۱۰۵d;
        iArr2[i2] = tag;
        this.f۹۱۰۵d = i2 + 1;
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f۹۱۰۸g) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۹۶۱a() {
        if (this.f۹۱۰۷f != null) {
            ViewGroup.LayoutParams params = getLayoutParams();
            if (params instanceof ConstraintLayout.Ca) {
                ((ConstraintLayout.Ca) params).f۹۰۸۳k0 = this.f۹۱۰۷f;
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۹۶۰a(String idString) {
        Object value;
        if (idString != null && this.f۹۱۰۶e != null) {
            String idString2 = idString.trim();
            int tag = 0;
            try {
                tag = Cg.class.getField(idString2).getInt(null);
            } catch (Exception e) {
            }
            if (tag == 0) {
                tag = this.f۹۱۰۶e.getResources().getIdentifier(idString2, "id", this.f۹۱۰۶e.getPackageName());
            }
            if (tag == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (value = ((ConstraintLayout) getParent()).m۱۰۹۵۵a(0, idString2)) != null && (value instanceof Integer)) {
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
                    m۱۰۹۶۰a(idList.substring(begin));
                    return;
                } else {
                    m۱۰۹۶۰a(idList.substring(begin, end));
                    begin = end + 1;
                }
            }
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۰۹۶۵c(ConstraintLayout container) {
        if (isInEditMode()) {
            setIds(this.f۹۱۰۹h);
        }
        Ch hVar = this.f۹۱۰۷f;
        if (hVar != null) {
            hVar.m۱۱۲۰۳H();
            for (int i = 0; i < this.f۹۱۰۵d; i++) {
                View view = container.findViewById(this.f۹۱۰۴c[i]);
                if (view != null) {
                    this.f۹۱۰۷f.m۱۱۲۰۴b(container.m۱۰۹۵۴a(view));
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۹۶۲a(ConstraintLayout container) {
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۹۶۴b(ConstraintLayout container) {
    }
}
