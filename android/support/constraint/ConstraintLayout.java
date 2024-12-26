package android.support.constraint;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.constraint.p۰۴۱i.p۰۴۲j.Cd;
import android.support.constraint.p۰۴۱i.p۰۴۲j.Ce;
import android.support.constraint.p۰۴۱i.p۰۴۲j.Cf;
import android.support.constraint.p۰۴۱i.p۰۴۲j.Cg;
import android.support.constraint.p۰۴۱i.p۰۴۲j.Ck;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: c  reason: contains not printable characters */
    SparseArray<View> f۹۰۱۶c = new SparseArray<>();

    /* renamed from: d  reason: contains not printable characters */
    private ArrayList<AbstractCb> f۹۰۱۷d = new ArrayList<>(4);

    /* renamed from: e  reason: contains not printable characters */
    private final ArrayList<Ce> f۹۰۱۸e = new ArrayList<>(100);

    /* renamed from: f  reason: contains not printable characters */
    Cf f۹۰۱۹f = new Cf();

    /* renamed from: g  reason: contains not printable characters */
    private int f۹۰۲۰g = 0;

    /* renamed from: h  reason: contains not printable characters */
    private int f۹۰۲۱h = 0;

    /* renamed from: i  reason: contains not printable characters */
    private int f۹۰۲۲i = Integer.MAX_VALUE;

    /* renamed from: j  reason: contains not printable characters */
    private int f۹۰۲۳j = Integer.MAX_VALUE;

    /* renamed from: k  reason: contains not printable characters */
    private boolean f۹۰۲۴k = true;

    /* renamed from: l  reason: contains not printable characters */
    private int f۹۰۲۵l = 3;

    /* renamed from: m  reason: contains not printable characters */
    private Cc f۹۰۲۶m = null;

    /* renamed from: n  reason: contains not printable characters */
    private int f۹۰۲۷n = -1;

    /* renamed from: o  reason: contains not printable characters */
    private HashMap<String, Integer> f۹۰۲۸o = new HashMap<>();

    /* renamed from: p  reason: contains not printable characters */
    private int f۹۰۲۹p = -1;

    /* renamed from: q  reason: contains not printable characters */
    private int f۹۰۳۰q = -1;

    /* renamed from: r  reason: contains not printable characters */
    int f۹۰۳۱r = -1;

    /* renamed from: s  reason: contains not printable characters */
    int f۹۰۳۲s = -1;

    /* renamed from: t  reason: contains not printable characters */
    int f۹۰۳۳t = 0;

    /* renamed from: u  reason: contains not printable characters */
    int f۹۰۳۴u = 0;

    /* renamed from: v  reason: contains not printable characters */
    private android.support.constraint.p۰۴۱i.Cf f۹۰۳۵v;

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۹۵۶a(int type, Object value1, Object value2) {
        if (type == 0 && (value1 instanceof String) && (value2 instanceof Integer)) {
            if (this.f۹۰۲۸o == null) {
                this.f۹۰۲۸o = new HashMap<>();
            }
            String name = (String) value1;
            int index = name.indexOf("/");
            if (index != -1) {
                name = name.substring(index + 1);
            }
            this.f۹۰۲۸o.put(name, Integer.valueOf(((Integer) value2).intValue()));
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public Object m۱۰۹۵۵a(int type, Object value) {
        if (type != 0 || !(value instanceof String)) {
            return null;
        }
        String name = (String) value;
        HashMap<String, Integer> hashMap = this.f۹۰۲۸o;
        if (hashMap == null || !hashMap.containsKey(name)) {
            return null;
        }
        return this.f۹۰۲۸o.get(name);
    }

    public ConstraintLayout(Context context) {
        super(context);
        m۱۰۹۴۹a((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        m۱۰۹۴۹a(attrs);
    }

    public ConstraintLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m۱۰۹۴۹a(attrs);
    }

    public void setId(int id) {
        this.f۹۰۱۶c.remove(getId());
        super.setId(id);
        this.f۹۰۱۶c.put(getId(), this);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۹۴۹a(AttributeSet attrs) {
        this.f۹۰۱۹f.m۱۱۱۱۴a(this);
        this.f۹۰۱۶c.put(getId(), this);
        this.f۹۰۲۶m = null;
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, Ch.ConstraintLayout_Layout);
            int N = a.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a.getIndex(i);
                if (attr == Ch.ConstraintLayout_Layout_android_minWidth) {
                    this.f۹۰۲۰g = a.getDimensionPixelOffset(attr, this.f۹۰۲۰g);
                } else if (attr == Ch.ConstraintLayout_Layout_android_minHeight) {
                    this.f۹۰۲۱h = a.getDimensionPixelOffset(attr, this.f۹۰۲۱h);
                } else if (attr == Ch.ConstraintLayout_Layout_android_maxWidth) {
                    this.f۹۰۲۲i = a.getDimensionPixelOffset(attr, this.f۹۰۲۲i);
                } else if (attr == Ch.ConstraintLayout_Layout_android_maxHeight) {
                    this.f۹۰۲۳j = a.getDimensionPixelOffset(attr, this.f۹۰۲۳j);
                } else if (attr == Ch.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f۹۰۲۵l = a.getInt(attr, this.f۹۰۲۵l);
                } else if (attr == Ch.ConstraintLayout_Layout_constraintSet) {
                    int id = a.getResourceId(attr, 0);
                    try {
                        this.f۹۰۲۶m = new Cc();
                        this.f۹۰۲۶m.m۱۰۹۶۹a(getContext(), id);
                    } catch (Resources.NotFoundException e) {
                        this.f۹۰۲۶m = null;
                    }
                    this.f۹۰۲۷n = id;
                }
            }
            a.recycle();
        }
        this.f۹۰۱۹f.m۱۱۱۹۱q(this.f۹۰۲۵l);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(child);
        }
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        Ce widget = m۱۰۹۵۴a(view);
        if ((view instanceof Ce) && !(widget instanceof Cg)) {
            Ca layoutParams = (Ca) view.getLayoutParams();
            layoutParams.f۹۰۸۳k0 = new Cg();
            layoutParams.f۹۰۵۹X = true;
            ((Cg) layoutParams.f۹۰۸۳k0).m۱۱۲۰۲r(layoutParams.f۹۰۵۳R);
        }
        if (view instanceof AbstractCb) {
            AbstractCb helper = (AbstractCb) view;
            helper.m۱۰۹۶۱a();
            ((Ca) view.getLayoutParams()).f۹۰۶۰Y = true;
            if (!this.f۹۰۱۷d.contains(helper)) {
                this.f۹۰۱۷d.add(helper);
            }
        }
        this.f۹۰۱۶c.put(view.getId(), view);
        this.f۹۰۲۴k = true;
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f۹۰۱۶c.remove(view.getId());
        Ce widget = m۱۰۹۵۴a(view);
        this.f۹۰۱۹f.m۱۱۲۴۳c(widget);
        this.f۹۰۱۷d.remove(view);
        this.f۹۰۱۸e.remove(widget);
        this.f۹۰۲۴k = true;
    }

    public void setMinWidth(int value) {
        if (value != this.f۹۰۲۰g) {
            this.f۹۰۲۰g = value;
            requestLayout();
        }
    }

    public void setMinHeight(int value) {
        if (value != this.f۹۰۲۱h) {
            this.f۹۰۲۱h = value;
            requestLayout();
        }
    }

    public int getMinWidth() {
        return this.f۹۰۲۰g;
    }

    public int getMinHeight() {
        return this.f۹۰۲۱h;
    }

    public void setMaxWidth(int value) {
        if (value != this.f۹۰۲۲i) {
            this.f۹۰۲۲i = value;
            requestLayout();
        }
    }

    public void setMaxHeight(int value) {
        if (value != this.f۹۰۲۳j) {
            this.f۹۰۲۳j = value;
            requestLayout();
        }
    }

    public int getMaxWidth() {
        return this.f۹۰۲۲i;
    }

    public int getMaxHeight() {
        return this.f۹۰۲۳j;
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۰۹۵۰b() {
        int count = getChildCount();
        boolean recompute = false;
        int i = 0;
        while (true) {
            if (i >= count) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                recompute = true;
                break;
            } else {
                i++;
            }
        }
        if (recompute) {
            this.f۹۰۱۸e.clear();
            m۱۰۹۴۷a();
        }
    }

    /* JADX INFO: Multiple debug info for r8v3 'layoutParams'  android.support.constraint.ConstraintLayout$a: [D('layoutParams' android.support.constraint.ConstraintLayout$a), D('child' android.view.View)] */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۹۴۷a() {
        int helperCount;
        int count;
        int resolvedLeftToLeft;
        int resolveGoneLeftMargin;
        float resolvedHorizontalBias;
        int resolveGoneLeftMargin2;
        int resolveGoneRightMargin;
        int resolvedLeftToLeft2;
        Ca layoutParams;
        int helperCount2;
        int resolvedRightToRight;
        float resolvedHorizontalBias2;
        Ce target;
        Ce target2;
        Ce target3;
        Ce target4;
        int resolvedLeftToLeft3;
        int resolvedLeftToLeft4;
        int resolvedLeftToLeft5;
        boolean isInEditMode = isInEditMode();
        int count2 = getChildCount();
        boolean z = false;
        int i = -1;
        if (isInEditMode) {
            for (int i2 = 0; i2 < count2; i2++) {
                View view = getChildAt(i2);
                try {
                    String IdAsString = getResources().getResourceName(view.getId());
                    m۱۰۹۵۶a(0, IdAsString, Integer.valueOf(view.getId()));
                    int slashIndex = IdAsString.indexOf(47);
                    if (slashIndex != -1) {
                        IdAsString = IdAsString.substring(slashIndex + 1);
                    }
                    m۱۰۹۴۶a(view.getId()).m۱۱۱۱۵a(IdAsString);
                } catch (Resources.NotFoundException e) {
                }
            }
        }
        for (int i3 = 0; i3 < count2; i3++) {
            Ce widget = m۱۰۹۵۴a(getChildAt(i3));
            if (widget != null) {
                widget.m۱۱۰۹۶B();
            }
        }
        if (this.f۹۰۲۷n != -1) {
            for (int i4 = 0; i4 < count2; i4++) {
                View child = getChildAt(i4);
                if (child.getId() == this.f۹۰۲۷n && (child instanceof Cd)) {
                    this.f۹۰۲۶m = ((Cd) child).getConstraintSet();
                }
            }
        }
        Cc cVar = this.f۹۰۲۶m;
        if (cVar != null) {
            cVar.m۱۰۹۷۰a(this);
        }
        this.f۹۰۱۹f.m۱۱۲۳۹J();
        int helperCount3 = this.f۹۰۱۷d.size();
        if (helperCount3 > 0) {
            for (int i5 = 0; i5 < helperCount3; i5++) {
                this.f۹۰۱۷d.get(i5).m۱۰۹۶۵c(this);
            }
        }
        for (int i6 = 0; i6 < count2; i6++) {
            View child2 = getChildAt(i6);
            if (child2 instanceof Cf) {
                ((Cf) child2).m۱۰۹۷۹b(this);
            }
        }
        int i7 = 0;
        while (i7 < count2) {
            View child3 = getChildAt(i7);
            Ce widget2 = m۱۰۹۵۴a(child3);
            if (widget2 == null) {
                count = count2;
                helperCount = helperCount3;
            } else {
                Ca layoutParams2 = (Ca) child3.getLayoutParams();
                layoutParams2.m۱۰۹۵۸a();
                if (layoutParams2.f۹۰۸۵l0) {
                    layoutParams2.f۹۰۸۵l0 = z;
                } else if (isInEditMode) {
                    try {
                        String IdAsString2 = getResources().getResourceName(child3.getId());
                        Object valueOf = Integer.valueOf(child3.getId());
                        int i8 = z ? 1 : 0;
                        int i9 = z ? 1 : 0;
                        int i10 = z ? 1 : 0;
                        m۱۰۹۵۶a(i8, IdAsString2, valueOf);
                        m۱۰۹۴۶a(child3.getId()).m۱۱۱۱۵a(IdAsString2.substring(IdAsString2.indexOf("id/") + 3));
                    } catch (Resources.NotFoundException e2) {
                    }
                }
                widget2.m۱۱۱۴۸j(child3.getVisibility());
                if (layoutParams2.f۹۰۶۱Z) {
                    widget2.m۱۱۱۴۸j(8);
                }
                widget2.m۱۱۱۱۴a(child3);
                this.f۹۰۱۹f.m۱۱۲۴۲b(widget2);
                if (!layoutParams2.f۹۰۵۷V || !layoutParams2.f۹۰۵۶U) {
                    this.f۹۰۱۸e.add(widget2);
                }
                if (layoutParams2.f۹۰۵۹X) {
                    Cg guideline = (Cg) widget2;
                    int resolvedGuideBegin = layoutParams2.f۹۰۷۷h0;
                    int resolvedGuideEnd = layoutParams2.f۹۰۷۹i0;
                    float resolvedGuidePercent = layoutParams2.f۹۰۸۱j0;
                    if (Build.VERSION.SDK_INT < 17) {
                        resolvedGuideBegin = layoutParams2.f۹۰۶۲a;
                        resolvedGuideEnd = layoutParams2.f۹۰۶۴b;
                        resolvedGuidePercent = layoutParams2.f۹۰۶۶c;
                    }
                    if (resolvedGuidePercent != -1.0f) {
                        guideline.m۱۱۱۹۹e(resolvedGuidePercent);
                    } else if (resolvedGuideBegin != i) {
                        guideline.m۱۱۲۰۰p(resolvedGuideBegin);
                    } else if (resolvedGuideEnd != i) {
                        guideline.m۱۱۲۰۱q(resolvedGuideEnd);
                    }
                } else if (!(layoutParams2.f۹۰۶۸d == i && layoutParams2.f۹۰۷۰e == i && layoutParams2.f۹۰۷۲f == i && layoutParams2.f۹۰۷۴g == i && layoutParams2.f۹۰۹۰q == i && layoutParams2.f۹۰۸۹p == i && layoutParams2.f۹۰۹۱r == i && layoutParams2.f۹۰۹۲s == i && layoutParams2.f۹۰۷۶h == i && layoutParams2.f۹۰۷۸i == i && layoutParams2.f۹۰۸۰j == i && layoutParams2.f۹۰۸۲k == i && layoutParams2.f۹۰۸۴l == i && layoutParams2.f۹۰۵۱P == i && layoutParams2.f۹۰۵۲Q == i && layoutParams2.f۹۰۸۶m == i && ((ViewGroup.MarginLayoutParams) layoutParams2).width != i && ((ViewGroup.MarginLayoutParams) layoutParams2).height != i)) {
                    int resolvedLeftToLeft6 = layoutParams2.f۹۰۶۳a0;
                    int resolvedLeftToRight = layoutParams2.f۹۰۶۵b0;
                    int resolvedRightToLeft = layoutParams2.f۹۰۶۷c0;
                    int resolvedRightToRight2 = layoutParams2.f۹۰۶۹d0;
                    int resolveGoneLeftMargin3 = layoutParams2.f۹۰۷۱e0;
                    int resolveGoneRightMargin2 = layoutParams2.f۹۰۷۳f0;
                    float resolvedHorizontalBias3 = layoutParams2.f۹۰۷۵g0;
                    if (Build.VERSION.SDK_INT < 17) {
                        int resolvedLeftToLeft7 = layoutParams2.f۹۰۶۸d;
                        int resolvedLeftToRight2 = layoutParams2.f۹۰۷۰e;
                        int resolvedRightToLeft2 = layoutParams2.f۹۰۷۲f;
                        resolvedRightToRight2 = layoutParams2.f۹۰۷۴g;
                        int resolveGoneLeftMargin4 = layoutParams2.f۹۰۹۳t;
                        int resolveGoneRightMargin3 = layoutParams2.f۹۰۹۵v;
                        float resolvedHorizontalBias4 = layoutParams2.f۹۰۹۹z;
                        if (resolvedLeftToLeft7 == -1 && resolvedLeftToRight2 == -1) {
                            resolvedLeftToLeft5 = resolvedLeftToLeft7;
                            if (layoutParams2.f۹۰۹۰q != -1) {
                                resolvedLeftToLeft3 = layoutParams2.f۹۰۹۰q;
                            } else if (layoutParams2.f۹۰۸۹p != -1) {
                                resolvedLeftToRight2 = layoutParams2.f۹۰۸۹p;
                                resolvedLeftToLeft3 = resolvedLeftToLeft5;
                            }
                            if (resolvedRightToLeft2 == -1 || resolvedRightToRight2 != -1) {
                                resolvedLeftToLeft4 = resolvedLeftToLeft3;
                            } else {
                                resolvedLeftToLeft4 = resolvedLeftToLeft3;
                                if (layoutParams2.f۹۰۹۱r != -1) {
                                    resolveGoneLeftMargin = layoutParams2.f۹۰۹۱r;
                                    resolvedLeftToLeft2 = resolvedLeftToLeft4;
                                    resolvedLeftToLeft = resolveGoneRightMargin3;
                                    resolvedHorizontalBias = resolvedHorizontalBias4;
                                    resolveGoneRightMargin = resolvedLeftToRight2;
                                    resolveGoneLeftMargin2 = resolveGoneLeftMargin4;
                                } else if (layoutParams2.f۹۰۹۲s != -1) {
                                    resolvedRightToRight2 = layoutParams2.f۹۰۹۲s;
                                    resolveGoneLeftMargin = resolvedRightToLeft2;
                                    resolvedLeftToLeft2 = resolvedLeftToLeft4;
                                    resolvedLeftToLeft = resolveGoneRightMargin3;
                                    resolvedHorizontalBias = resolvedHorizontalBias4;
                                    resolveGoneRightMargin = resolvedLeftToRight2;
                                    resolveGoneLeftMargin2 = resolveGoneLeftMargin4;
                                }
                            }
                            resolveGoneLeftMargin = resolvedRightToLeft2;
                            resolvedLeftToLeft2 = resolvedLeftToLeft4;
                            resolvedLeftToLeft = resolveGoneRightMargin3;
                            resolvedHorizontalBias = resolvedHorizontalBias4;
                            resolveGoneRightMargin = resolvedLeftToRight2;
                            resolveGoneLeftMargin2 = resolveGoneLeftMargin4;
                        } else {
                            resolvedLeftToLeft5 = resolvedLeftToLeft7;
                        }
                        resolvedLeftToLeft3 = resolvedLeftToLeft5;
                        if (resolvedRightToLeft2 == -1) {
                        }
                        resolvedLeftToLeft4 = resolvedLeftToLeft3;
                        resolveGoneLeftMargin = resolvedRightToLeft2;
                        resolvedLeftToLeft2 = resolvedLeftToLeft4;
                        resolvedLeftToLeft = resolveGoneRightMargin3;
                        resolvedHorizontalBias = resolvedHorizontalBias4;
                        resolveGoneRightMargin = resolvedLeftToRight2;
                        resolveGoneLeftMargin2 = resolveGoneLeftMargin4;
                    } else {
                        resolvedLeftToLeft2 = resolvedLeftToLeft6;
                        resolvedLeftToLeft = resolveGoneRightMargin2;
                        resolveGoneRightMargin = resolvedLeftToRight;
                        resolvedHorizontalBias = resolvedHorizontalBias3;
                        resolveGoneLeftMargin2 = resolveGoneLeftMargin3;
                        resolveGoneLeftMargin = resolvedRightToLeft;
                    }
                    int i11 = layoutParams2.f۹۰۸۶m;
                    if (i11 != -1) {
                        Ce target5 = m۱۰۹۴۶a(i11);
                        if (target5 != null) {
                            count = count2;
                            widget2.m۱۱۱۱۳a(target5, layoutParams2.f۹۰۸۸o, layoutParams2.f۹۰۸۷n);
                        } else {
                            count = count2;
                        }
                        helperCount = helperCount3;
                        layoutParams = layoutParams2;
                    } else {
                        count = count2;
                        if (resolvedLeftToLeft2 != -1) {
                            Ce target6 = m۱۰۹۴۶a(resolvedLeftToLeft2);
                            if (target6 != null) {
                                Cd.EnumCd dVar = Cd.EnumCd.LEFT;
                                resolvedHorizontalBias2 = resolvedHorizontalBias;
                                resolvedRightToRight = resolvedRightToRight2;
                                helperCount = helperCount3;
                                helperCount2 = resolveGoneLeftMargin;
                                layoutParams = layoutParams2;
                                widget2.m۱۱۱۱۰a(dVar, target6, dVar, ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, resolveGoneLeftMargin2);
                            } else {
                                helperCount = helperCount3;
                                resolvedHorizontalBias2 = resolvedHorizontalBias;
                                resolvedRightToRight = resolvedRightToRight2;
                                helperCount2 = resolveGoneLeftMargin;
                                layoutParams = layoutParams2;
                            }
                        } else {
                            helperCount = helperCount3;
                            resolvedHorizontalBias2 = resolvedHorizontalBias;
                            resolvedRightToRight = resolvedRightToRight2;
                            helperCount2 = resolveGoneLeftMargin;
                            layoutParams = layoutParams2;
                            if (!(resolveGoneRightMargin == -1 || (target4 = m۱۰۹۴۶a(resolveGoneRightMargin)) == null)) {
                                widget2.m۱۱۱۱۰a(Cd.EnumCd.LEFT, target4, Cd.EnumCd.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, resolveGoneLeftMargin2);
                            }
                        }
                        if (helperCount2 != -1) {
                            Ce target7 = m۱۰۹۴۶a(helperCount2);
                            if (target7 != null) {
                                widget2.m۱۱۱۱۰a(Cd.EnumCd.RIGHT, target7, Cd.EnumCd.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, resolvedLeftToLeft);
                            }
                        } else if (!(resolvedRightToRight == -1 || (target3 = m۱۰۹۴۶a(resolvedRightToRight)) == null)) {
                            Cd.EnumCd dVar2 = Cd.EnumCd.RIGHT;
                            widget2.m۱۱۱۱۰a(dVar2, target3, dVar2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, resolvedLeftToLeft);
                        }
                        int i12 = layoutParams.f۹۰۷۶h;
                        if (i12 != -1) {
                            Ce target8 = m۱۰۹۴۶a(i12);
                            if (target8 != null) {
                                Cd.EnumCd dVar3 = Cd.EnumCd.TOP;
                                widget2.m۱۱۱۱۰a(dVar3, target8, dVar3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f۹۰۹۴u);
                            }
                        } else {
                            int i13 = layoutParams.f۹۰۷۸i;
                            if (!(i13 == -1 || (target2 = m۱۰۹۴۶a(i13)) == null)) {
                                widget2.m۱۱۱۱۰a(Cd.EnumCd.TOP, target2, Cd.EnumCd.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f۹۰۹۴u);
                            }
                        }
                        int i14 = layoutParams.f۹۰۸۰j;
                        if (i14 != -1) {
                            Ce target9 = m۱۰۹۴۶a(i14);
                            if (target9 != null) {
                                widget2.m۱۱۱۱۰a(Cd.EnumCd.BOTTOM, target9, Cd.EnumCd.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f۹۰۹۶w);
                            }
                        } else {
                            int i15 = layoutParams.f۹۰۸۲k;
                            if (!(i15 == -1 || (target = m۱۰۹۴۶a(i15)) == null)) {
                                Cd.EnumCd dVar4 = Cd.EnumCd.BOTTOM;
                                widget2.m۱۱۱۱۰a(dVar4, target, dVar4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f۹۰۹۶w);
                            }
                        }
                        int i16 = layoutParams.f۹۰۸۴l;
                        if (i16 != -1) {
                            View view2 = this.f۹۰۱۶c.get(i16);
                            Ce target10 = m۱۰۹۴۶a(layoutParams.f۹۰۸۴l);
                            if (!(target10 == null || view2 == null || !(view2.getLayoutParams() instanceof Ca))) {
                                layoutParams.f۹۰۵۸W = true;
                                ((Ca) view2.getLayoutParams()).f۹۰۵۸W = true;
                                widget2.m۱۱۱۰۲a(Cd.EnumCd.BASELINE).m۱۱۰۸۲a(target10.m۱۱۱۰۲a(Cd.EnumCd.BASELINE), 0, -1, Cd.EnumCc.STRONG, 0, true);
                                widget2.m۱۱۱۰۲a(Cd.EnumCd.TOP).m۱۱۰۹۲j();
                                widget2.m۱۱۱۰۲a(Cd.EnumCd.BOTTOM).m۱۱۰۹۲j();
                            }
                        }
                        if (resolvedHorizontalBias2 >= 0.0f && resolvedHorizontalBias2 != 0.5f) {
                            widget2.m۱۱۱۰۳a(resolvedHorizontalBias2);
                        }
                        float f = layoutParams.f۹۰۳۶A;
                        if (f >= 0.0f && f != 0.5f) {
                            widget2.m۱۱۱۲۹c(f);
                        }
                    }
                    if (isInEditMode && !(layoutParams.f۹۰۵۱P == -1 && layoutParams.f۹۰۵۲Q == -1)) {
                        widget2.m۱۱۱۳۱c(layoutParams.f۹۰۵۱P, layoutParams.f۹۰۵۲Q);
                    }
                    if (layoutParams.f۹۰۵۶U) {
                        widget2.m۱۱۱۱۱a(Ce.EnumCb.FIXED);
                        widget2.m۱۱۱۵۰k(((ViewGroup.MarginLayoutParams) layoutParams).width);
                    } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
                        widget2.m۱۱۱۱۱a(Ce.EnumCb.MATCH_PARENT);
                        widget2.m۱۱۱۰۲a(Cd.EnumCd.LEFT).f۹۳۰۸e = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        widget2.m۱۱۱۰۲a(Cd.EnumCd.RIGHT).f۹۳۰۸e = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    } else {
                        widget2.m۱۱۱۱۱a(Ce.EnumCb.MATCH_CONSTRAINT);
                        widget2.m۱۱۱۵۰k(0);
                    }
                    if (layoutParams.f۹۰۵۷V) {
                        widget2.m۱۱۱۲۵b(Ce.EnumCb.FIXED);
                        widget2.m۱۱۱۳۰c(((ViewGroup.MarginLayoutParams) layoutParams).height);
                    } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                        widget2.m۱۱۱۲۵b(Ce.EnumCb.MATCH_PARENT);
                        widget2.m۱۱۱۰۲a(Cd.EnumCd.TOP).f۹۳۰۸e = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        widget2.m۱۱۱۰۲a(Cd.EnumCd.BOTTOM).f۹۳۰۸e = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    } else {
                        widget2.m۱۱۱۲۵b(Ce.EnumCb.MATCH_CONSTRAINT);
                        widget2.m۱۱۱۳۰c(0);
                    }
                    String str = layoutParams.f۹۰۳۷B;
                    if (str != null) {
                        widget2.m۱۱۱۲۶b(str);
                    }
                    widget2.m۱۱۱۲۰b(layoutParams.f۹۰۳۹D);
                    widget2.m۱۱۱۳۴d(layoutParams.f۹۰۴۰E);
                    widget2.m۱۱۱۳۵d(layoutParams.f۹۰۴۱F);
                    widget2.m۱۱۱۴۶i(layoutParams.f۹۰۴۲G);
                    widget2.m۱۱۱۰۶a(layoutParams.f۹۰۴۳H, layoutParams.f۹۰۴۵J, layoutParams.f۹۰۴۷L, layoutParams.f۹۰۴۹N);
                    widget2.m۱۱۱۲۳b(layoutParams.f۹۰۴۴I, layoutParams.f۹۰۴۶K, layoutParams.f۹۰۴۸M, layoutParams.f۹۰۵۰O);
                }
                count = count2;
                helperCount = helperCount3;
            }
            i7++;
            count2 = count;
            helperCount3 = helperCount;
            z = false;
            i = -1;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private final Ce m۱۰۹۴۶a(int id) {
        if (id == 0) {
            return this.f۹۰۱۹f;
        }
        View view = this.f۹۰۱۶c.get(id);
        if (view == this) {
            return this.f۹۰۱۹f;
        }
        if (view == null) {
            return null;
        }
        return ((Ca) view.getLayoutParams()).f۹۰۸۳k0;
    }

    /* renamed from: a  reason: contains not printable characters */
    public final Ce m۱۰۹۵۴a(View view) {
        if (view == this) {
            return this.f۹۰۱۹f;
        }
        if (view == null) {
            return null;
        }
        return ((Ca) view.getLayoutParams()).f۹۰۸۳k0;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۹۴۸a(int parentWidthSpec, int parentHeightSpec) {
        int baseline;
        int childWidthMeasureSpec;
        int childWidthMeasureSpec2;
        int childHeightMeasureSpec;
        ConstraintLayout constraintLayout = this;
        int i = parentWidthSpec;
        int heightPadding = getPaddingTop() + getPaddingBottom();
        int widthPadding = getPaddingLeft() + getPaddingRight();
        int widgetsCount = getChildCount();
        int i2 = 0;
        while (i2 < widgetsCount) {
            View child = constraintLayout.getChildAt(i2);
            if (child.getVisibility() != 8) {
                Ca params = (Ca) child.getLayoutParams();
                Ce widget = params.f۹۰۸۳k0;
                if (!params.f۹۰۵۹X && !params.f۹۰۶۰Y) {
                    widget.m۱۱۱۴۸j(child.getVisibility());
                    int width = ((ViewGroup.MarginLayoutParams) params).width;
                    int height = ((ViewGroup.MarginLayoutParams) params).height;
                    boolean z = params.f۹۰۵۶U;
                    int didWrapMeasureWidth = 0;
                    boolean didWrapMeasureHeight = false;
                    if (z || params.f۹۰۵۷V || (!z && params.f۹۰۴۳H == 1) || ((ViewGroup.MarginLayoutParams) params).width == -1 || (!params.f۹۰۵۷V && (params.f۹۰۴۴I == 1 || ((ViewGroup.MarginLayoutParams) params).height == -1))) {
                        if (width == 0) {
                            childWidthMeasureSpec = 1;
                            childWidthMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, widthPadding, -2);
                        } else if (width == -1) {
                            childWidthMeasureSpec = 0;
                            childWidthMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, widthPadding, -1);
                        } else {
                            if (width == -2) {
                                didWrapMeasureWidth = 1;
                            }
                            childWidthMeasureSpec = didWrapMeasureWidth;
                            childWidthMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, widthPadding, width);
                        }
                        if (height == 0) {
                            didWrapMeasureHeight = true;
                            childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding, -2);
                        } else if (height == -1) {
                            childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding, -1);
                        } else {
                            if (height == -2) {
                                didWrapMeasureHeight = true;
                            }
                            childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding, height);
                        }
                        child.measure(childWidthMeasureSpec2, childHeightMeasureSpec);
                        android.support.constraint.p۰۴۱i.Cf fVar = constraintLayout.f۹۰۳۵v;
                        if (fVar != null) {
                            fVar.f۹۲۳۹a++;
                        }
                        widget.m۱۱۱۲۷b(width == -2);
                        widget.m۱۱۱۱۶a(height == -2);
                        width = child.getMeasuredWidth();
                        height = child.getMeasuredHeight();
                        didWrapMeasureWidth = childWidthMeasureSpec;
                    }
                    widget.m۱۱۱۵۰k(width);
                    widget.m۱۱۱۳۰c(height);
                    if (didWrapMeasureWidth != 0) {
                        widget.m۱۱۱۵۴m(width);
                    }
                    if (didWrapMeasureHeight) {
                        widget.m۱۱۱۵۲l(height);
                    }
                    if (params.f۹۰۵۸W && (baseline = child.getBaseline()) != -1) {
                        widget.m۱۱۱۲۱b(baseline);
                    }
                }
            }
            i2++;
            constraintLayout = this;
            i = parentWidthSpec;
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۰۹۵۲c() {
        int widgetsCount = getChildCount();
        for (int i = 0; i < widgetsCount; i++) {
            View child = getChildAt(i);
            if (child instanceof Cf) {
                ((Cf) child).m۱۰۹۷۸a(this);
            }
        }
        int helperCount = this.f۹۰۱۷d.size();
        if (helperCount > 0) {
            for (int i2 = 0; i2 < helperCount; i2++) {
                this.f۹۰۱۷d.get(i2).m۱۰۹۶۴b(this);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۰۹۵۱b(int parentWidthSpec, int parentHeightSpec) {
        int i;
        int widthPadding;
        int i2;
        int widgetsCount;
        int childWidthMeasureSpec;
        boolean resolveHeight;
        int childHeightMeasureSpec;
        int heightPadding;
        int baseline;
        ConstraintLayout constraintLayout = this;
        int i3 = parentWidthSpec;
        int i4 = parentHeightSpec;
        int heightPadding2 = getPaddingTop() + getPaddingBottom();
        int widthPadding2 = getPaddingLeft() + getPaddingRight();
        int widgetsCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            i = 8;
            if (i5 >= widgetsCount2) {
                break;
            }
            View child = constraintLayout.getChildAt(i5);
            if (child.getVisibility() == 8) {
                heightPadding = heightPadding2;
            } else {
                Ca params = (Ca) child.getLayoutParams();
                Ce widget = params.f۹۰۸۳k0;
                if (params.f۹۰۵۹X) {
                    heightPadding = heightPadding2;
                } else if (params.f۹۰۶۰Y) {
                    heightPadding = heightPadding2;
                } else {
                    widget.m۱۱۱۴۸j(child.getVisibility());
                    int width = ((ViewGroup.MarginLayoutParams) params).width;
                    int height = ((ViewGroup.MarginLayoutParams) params).height;
                    if (width == 0) {
                        heightPadding = heightPadding2;
                    } else if (height == 0) {
                        heightPadding = heightPadding2;
                    } else {
                        boolean didWrapMeasureWidth = false;
                        boolean didWrapMeasureHeight = false;
                        if (width == -2) {
                            didWrapMeasureWidth = true;
                        }
                        int childWidthMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, widthPadding2, width);
                        if (height == -2) {
                            didWrapMeasureHeight = true;
                        }
                        child.measure(childWidthMeasureSpec2, ViewGroup.getChildMeasureSpec(i4, heightPadding2, height));
                        android.support.constraint.p۰۴۱i.Cf fVar = constraintLayout.f۹۰۳۵v;
                        if (fVar != null) {
                            heightPadding = heightPadding2;
                            fVar.f۹۲۳۹a++;
                        } else {
                            heightPadding = heightPadding2;
                        }
                        widget.m۱۱۱۲۷b(width == -2);
                        widget.m۱۱۱۱۶a(height == -2);
                        int width2 = child.getMeasuredWidth();
                        int height2 = child.getMeasuredHeight();
                        widget.m۱۱۱۵۰k(width2);
                        widget.m۱۱۱۳۰c(height2);
                        if (didWrapMeasureWidth) {
                            widget.m۱۱۱۵۴m(width2);
                        }
                        if (didWrapMeasureHeight) {
                            widget.m۱۱۱۵۲l(height2);
                        }
                        if (params.f۹۰۵۸W && (baseline = child.getBaseline()) != -1) {
                            widget.m۱۱۱۲۱b(baseline);
                        }
                        if (params.f۹۰۵۶U && params.f۹۰۵۷V) {
                            widget.m۱۱۱۵۵n().m۱۱۲۲۲a(width2);
                            widget.m۱۱۱۵۳m().m۱۱۲۲۲a(height2);
                        }
                    }
                    widget.m۱۱۱۵۵n().m۱۱۲۲۷b();
                    widget.m۱۱۱۵۳m().m۱۱۲۲۷b();
                }
            }
            i5++;
            i4 = parentHeightSpec;
            heightPadding2 = heightPadding;
        }
        constraintLayout.f۹۰۱۹f.m۱۱۱۸۳S();
        int i6 = 0;
        while (i6 < widgetsCount2) {
            View child2 = constraintLayout.getChildAt(i6);
            if (child2.getVisibility() == i) {
                i2 = i6;
                widthPadding = widthPadding2;
                widgetsCount = widgetsCount2;
            } else {
                Ca params2 = (Ca) child2.getLayoutParams();
                Ce widget2 = params2.f۹۰۸۳k0;
                if (params2.f۹۰۵۹X) {
                    i2 = i6;
                    widthPadding = widthPadding2;
                    widgetsCount = widgetsCount2;
                } else if (params2.f۹۰۶۰Y) {
                    i2 = i6;
                    widthPadding = widthPadding2;
                    widgetsCount = widgetsCount2;
                } else {
                    widget2.m۱۱۱۴۸j(child2.getVisibility());
                    int width3 = ((ViewGroup.MarginLayoutParams) params2).width;
                    int height3 = ((ViewGroup.MarginLayoutParams) params2).height;
                    if (width3 == 0 || height3 == 0) {
                        Ck left = widget2.m۱۱۱۰۲a(Cd.EnumCd.LEFT).m۱۱۰۸۶d();
                        Ck right = widget2.m۱۱۱۰۲a(Cd.EnumCd.RIGHT).m۱۱۰۸۶d();
                        boolean bothHorizontal = (widget2.m۱۱۱۰۲a(Cd.EnumCd.LEFT).m۱۱۰۸۹g() == null || widget2.m۱۱۱۰۲a(Cd.EnumCd.RIGHT).m۱۱۰۸۹g() == null) ? false : true;
                        Ck top = widget2.m۱۱۱۰۲a(Cd.EnumCd.TOP).m۱۱۰۸۶d();
                        Ck bottom = widget2.m۱۱۱۰۲a(Cd.EnumCd.BOTTOM).m۱۱۰۸۶d();
                        widgetsCount = widgetsCount2;
                        boolean bothVertical = (widget2.m۱۱۱۰۲a(Cd.EnumCd.TOP).m۱۱۰۸۹g() == null || widget2.m۱۱۱۰۲a(Cd.EnumCd.BOTTOM).m۱۱۰۸۹g() == null) ? false : true;
                        if (width3 != 0 || height3 != 0 || !bothHorizontal || !bothVertical) {
                            boolean didWrapMeasureWidth2 = false;
                            boolean didWrapMeasureHeight2 = false;
                            i2 = i6;
                            boolean resolveWidth = constraintLayout.f۹۰۱۹f.m۱۱۱۴۹k() != Ce.EnumCb.WRAP_CONTENT;
                            boolean resolveHeight2 = constraintLayout.f۹۰۱۹f.m۱۱۱۶۱r() != Ce.EnumCb.WRAP_CONTENT;
                            if (!resolveWidth) {
                                widget2.m۱۱۱۵۵n().m۱۱۲۲۷b();
                            }
                            if (!resolveHeight2) {
                                widget2.m۱۱۱۵۳m().m۱۱۲۲۷b();
                            }
                            if (width3 == 0) {
                                if (!resolveWidth || !widget2.m۱۱۰۹۵A() || !bothHorizontal || !left.m۱۱۲۲۸c() || !right.m۱۱۲۲۸c()) {
                                    didWrapMeasureWidth2 = true;
                                    resolveWidth = false;
                                    childWidthMeasureSpec = ViewGroup.getChildMeasureSpec(i3, widthPadding2, -2);
                                } else {
                                    width3 = (int) (right.m۱۱۲۲۰f() - left.m۱۱۲۲۰f());
                                    widget2.m۱۱۱۵۵n().m۱۱۲۲۲a(width3);
                                    childWidthMeasureSpec = ViewGroup.getChildMeasureSpec(i3, widthPadding2, width3);
                                }
                            } else if (width3 == -1) {
                                childWidthMeasureSpec = ViewGroup.getChildMeasureSpec(i3, widthPadding2, -1);
                            } else {
                                if (width3 == -2) {
                                    didWrapMeasureWidth2 = true;
                                }
                                childWidthMeasureSpec = ViewGroup.getChildMeasureSpec(i3, widthPadding2, width3);
                            }
                            if (height3 != 0) {
                                resolveHeight = resolveHeight2;
                                if (height3 == -1) {
                                    childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding2, -1);
                                } else {
                                    if (height3 == -2) {
                                        didWrapMeasureHeight2 = true;
                                    }
                                    childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding2, height3);
                                }
                            } else if (!resolveHeight2 || !widget2.m۱۱۱۶۹z() || !bothVertical || !top.m۱۱۲۲۸c() || !bottom.m۱۱۲۲۸c()) {
                                didWrapMeasureHeight2 = true;
                                resolveHeight = false;
                                childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding2, -2);
                            } else {
                                resolveHeight = resolveHeight2;
                                height3 = (int) (bottom.m۱۱۲۲۰f() - top.m۱۱۲۲۰f());
                                widget2.m۱۱۱۵۳m().m۱۱۲۲۲a(height3);
                                childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding2, height3);
                            }
                            child2.measure(childWidthMeasureSpec, childHeightMeasureSpec);
                            constraintLayout = this;
                            android.support.constraint.p۰۴۱i.Cf fVar2 = constraintLayout.f۹۰۳۵v;
                            if (fVar2 != null) {
                                widthPadding = widthPadding2;
                                fVar2.f۹۲۳۹a++;
                            } else {
                                widthPadding = widthPadding2;
                            }
                            widget2.m۱۱۱۲۷b(width3 == -2);
                            widget2.m۱۱۱۱۶a(height3 == -2);
                            int width4 = child2.getMeasuredWidth();
                            int height4 = child2.getMeasuredHeight();
                            widget2.m۱۱۱۵۰k(width4);
                            widget2.m۱۱۱۳۰c(height4);
                            if (didWrapMeasureWidth2) {
                                widget2.m۱۱۱۵۴m(width4);
                            }
                            if (didWrapMeasureHeight2) {
                                widget2.m۱۱۱۵۲l(height4);
                            }
                            if (resolveWidth) {
                                widget2.m۱۱۱۵۵n().m۱۱۲۲۲a(width4);
                            } else {
                                widget2.m۱۱۱۵۵n().m۱۱۲۲۴f();
                            }
                            if (resolveHeight) {
                                widget2.m۱۱۱۵۳m().m۱۱۲۲۲a(height4);
                            } else {
                                widget2.m۱۱۱۵۳m().m۱۱۲۲۴f();
                            }
                            if (params2.f۹۰۵۸W) {
                                int baseline2 = child2.getBaseline();
                                if (baseline2 != -1) {
                                    widget2.m۱۱۱۲۱b(baseline2);
                                }
                            }
                        } else {
                            i2 = i6;
                            widthPadding = widthPadding2;
                        }
                    } else {
                        i2 = i6;
                        widthPadding = widthPadding2;
                        widgetsCount = widgetsCount2;
                    }
                }
            }
            i6 = i2 + 1;
            i3 = parentWidthSpec;
            widgetsCount2 = widgetsCount;
            widthPadding2 = widthPadding;
            i = 8;
        }
    }

    /* JADX INFO: Multiple debug info for r9v1 int: [D('heightPadding' int), D('heightMode' int)] */
    /* JADX INFO: Multiple debug info for r3v3 int: [D('paddingTop' int), D('widthPadding' int)] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r44, int r45) {
        /*
        // Method dump skipped, instructions count: 1064
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۰۹۵۳c(int widthMeasureSpec, int heightMeasureSpec) {
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        int heightPadding = getPaddingTop() + getPaddingBottom();
        int widthPadding = getPaddingLeft() + getPaddingRight();
        Ce.EnumCb widthBehaviour = Ce.EnumCb.FIXED;
        Ce.EnumCb heightBehaviour = Ce.EnumCb.FIXED;
        int desiredWidth = 0;
        int desiredHeight = 0;
        getLayoutParams();
        if (widthMode == Integer.MIN_VALUE) {
            widthBehaviour = Ce.EnumCb.WRAP_CONTENT;
            desiredWidth = widthSize;
        } else if (widthMode == 0) {
            widthBehaviour = Ce.EnumCb.WRAP_CONTENT;
        } else if (widthMode == 1073741824) {
            desiredWidth = Math.min(this.f۹۰۲۲i, widthSize) - widthPadding;
        }
        if (heightMode == Integer.MIN_VALUE) {
            heightBehaviour = Ce.EnumCb.WRAP_CONTENT;
            desiredHeight = heightSize;
        } else if (heightMode == 0) {
            heightBehaviour = Ce.EnumCb.WRAP_CONTENT;
        } else if (heightMode == 1073741824) {
            desiredHeight = Math.min(this.f۹۰۲۳j, heightSize) - heightPadding;
        }
        this.f۹۰۱۹f.m۱۱۱۴۴h(0);
        this.f۹۰۱۹f.m۱۱۱۴۲g(0);
        this.f۹۰۱۹f.m۱۱۱۱۱a(widthBehaviour);
        this.f۹۰۱۹f.m۱۱۱۵۰k(desiredWidth);
        this.f۹۰۱۹f.m۱۱۱۲۵b(heightBehaviour);
        this.f۹۰۱۹f.m۱۱۱۳۰c(desiredHeight);
        this.f۹۰۱۹f.m۱۱۱۴۴h((this.f۹۰۲۰g - getPaddingLeft()) - getPaddingRight());
        this.f۹۰۱۹f.m۱۱۱۴۲g((this.f۹۰۲۱h - getPaddingTop()) - getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۹۵۷a(String reason) {
        this.f۹۰۱۹f.m۱۱۱۷۴I();
        android.support.constraint.p۰۴۱i.Cf fVar = this.f۹۰۳۵v;
        if (fVar != null) {
            fVar.f۹۲۴۱c++;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View content;
        int widgetsCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i = 0; i < widgetsCount; i++) {
            View child = getChildAt(i);
            Ca params = (Ca) child.getLayoutParams();
            Ce widget = params.f۹۰۸۳k0;
            if ((child.getVisibility() != 8 || params.f۹۰۵۹X || params.f۹۰۶۰Y || isInEditMode) && !params.f۹۰۶۱Z) {
                int l = widget.m۱۱۱۴۱g();
                int t = widget.m۱۱۱۴۳h();
                int r = widget.m۱۱۱۶۳t() + l;
                int b = widget.m۱۱۱۴۵i() + t;
                child.layout(l, t, r, b);
                if ((child instanceof Cf) && (content = ((Cf) child).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(l, t, r, b);
                }
            }
        }
        int helperCount = this.f۹۰۱۷d.size();
        if (helperCount > 0) {
            for (int i2 = 0; i2 < helperCount; i2++) {
                this.f۹۰۱۷d.get(i2).m۱۰۹۶۲a(this);
            }
        }
    }

    public void setOptimizationLevel(int level) {
        this.f۹۰۱۹f.m۱۱۱۹۱q(level);
    }

    public int getOptimizationLevel() {
        return this.f۹۰۱۹f.m۱۱۱۷۵K();
    }

    @Override // android.view.ViewGroup
    public Ca generateLayoutParams(AttributeSet attrs) {
        return new Ca(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    public Ca generateDefaultLayoutParams() {
        return new Ca(-2, -2);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new Ca(p);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof Ca;
    }

    public void setConstraintSet(Cc set) {
        this.f۹۰۲۶m = set;
    }

    public void dispatchDraw(Canvas canvas) {
        float ow;
        float ch;
        float cw;
        int count;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int count2 = getChildCount();
            float cw2 = (float) getWidth();
            float ch2 = (float) getHeight();
            float ow2 = 1080.0f;
            int i = 0;
            while (i < count2) {
                View child = getChildAt(i);
                if (child.getVisibility() == 8) {
                    count = count2;
                    cw = cw2;
                    ch = ch2;
                    ow = ow2;
                } else {
                    Object tag = child.getTag();
                    if (tag == null || !(tag instanceof String)) {
                        count = count2;
                        cw = cw2;
                        ch = ch2;
                        ow = ow2;
                    } else {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int x = Integer.parseInt(split[0]);
                            int y = Integer.parseInt(split[1]);
                            int x2 = (int) ((((float) x) / ow2) * cw2);
                            int y2 = (int) ((((float) y) / 1920.0f) * ch2);
                            int w = (int) ((((float) Integer.parseInt(split[2])) / ow2) * cw2);
                            int h = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * ch2);
                            Paint paint = new Paint();
                            count = count2;
                            paint.setColor(-65536);
                            cw = cw2;
                            ch = ch2;
                            ow = ow2;
                            canvas.drawLine((float) x2, (float) y2, (float) (x2 + w), (float) y2, paint);
                            canvas.drawLine((float) (x2 + w), (float) y2, (float) (x2 + w), (float) (y2 + h), paint);
                            canvas.drawLine((float) (x2 + w), (float) (y2 + h), (float) x2, (float) (y2 + h), paint);
                            canvas.drawLine((float) x2, (float) (y2 + h), (float) x2, (float) y2, paint);
                            paint.setColor(-16711936);
                            canvas.drawLine((float) x2, (float) y2, (float) (x2 + w), (float) (y2 + h), paint);
                            canvas.drawLine((float) x2, (float) (y2 + h), (float) (x2 + w), (float) y2, paint);
                        } else {
                            count = count2;
                            cw = cw2;
                            ch = ch2;
                            ow = ow2;
                        }
                    }
                }
                i++;
                count2 = count;
                cw2 = cw;
                ch2 = ch;
                ow2 = ow;
            }
        }
    }

    /* renamed from: android.support.constraint.ConstraintLayout$a  reason: invalid class name */
    public static class Ca extends ViewGroup.MarginLayoutParams {

        /* renamed from: A  reason: contains not printable characters */
        public float f۹۰۳۶A;

        /* renamed from: B  reason: contains not printable characters */
        public String f۹۰۳۷B;

        /* renamed from: C  reason: contains not printable characters */
        int f۹۰۳۸C;

        /* renamed from: D  reason: contains not printable characters */
        public float f۹۰۳۹D;

        /* renamed from: E  reason: contains not printable characters */
        public float f۹۰۴۰E;

        /* renamed from: F  reason: contains not printable characters */
        public int f۹۰۴۱F;

        /* renamed from: G  reason: contains not printable characters */
        public int f۹۰۴۲G;

        /* renamed from: H  reason: contains not printable characters */
        public int f۹۰۴۳H;

        /* renamed from: I  reason: contains not printable characters */
        public int f۹۰۴۴I;

        /* renamed from: J  reason: contains not printable characters */
        public int f۹۰۴۵J;

        /* renamed from: K  reason: contains not printable characters */
        public int f۹۰۴۶K;

        /* renamed from: L  reason: contains not printable characters */
        public int f۹۰۴۷L;

        /* renamed from: M  reason: contains not printable characters */
        public int f۹۰۴۸M;

        /* renamed from: N  reason: contains not printable characters */
        public float f۹۰۴۹N;

        /* renamed from: O  reason: contains not printable characters */
        public float f۹۰۵۰O;

        /* renamed from: P  reason: contains not printable characters */
        public int f۹۰۵۱P;

        /* renamed from: Q  reason: contains not printable characters */
        public int f۹۰۵۲Q;

        /* renamed from: R  reason: contains not printable characters */
        public int f۹۰۵۳R;

        /* renamed from: S  reason: contains not printable characters */
        public boolean f۹۰۵۴S;

        /* renamed from: T  reason: contains not printable characters */
        public boolean f۹۰۵۵T;

        /* renamed from: U  reason: contains not printable characters */
        boolean f۹۰۵۶U;

        /* renamed from: V  reason: contains not printable characters */
        boolean f۹۰۵۷V;

        /* renamed from: W  reason: contains not printable characters */
        boolean f۹۰۵۸W;

        /* renamed from: X  reason: contains not printable characters */
        boolean f۹۰۵۹X;

        /* renamed from: Y  reason: contains not printable characters */
        boolean f۹۰۶۰Y;

        /* renamed from: Z  reason: contains not printable characters */
        boolean f۹۰۶۱Z;

        /* renamed from: a  reason: contains not printable characters */
        public int f۹۰۶۲a;

        /* renamed from: a0  reason: contains not printable characters */
        int f۹۰۶۳a0;

        /* renamed from: b  reason: contains not printable characters */
        public int f۹۰۶۴b;

        /* renamed from: b0  reason: contains not printable characters */
        int f۹۰۶۵b0;

        /* renamed from: c  reason: contains not printable characters */
        public float f۹۰۶۶c;

        /* renamed from: c0  reason: contains not printable characters */
        int f۹۰۶۷c0;

        /* renamed from: d  reason: contains not printable characters */
        public int f۹۰۶۸d;

        /* renamed from: d0  reason: contains not printable characters */
        int f۹۰۶۹d0;

        /* renamed from: e  reason: contains not printable characters */
        public int f۹۰۷۰e;

        /* renamed from: e0  reason: contains not printable characters */
        int f۹۰۷۱e0;

        /* renamed from: f  reason: contains not printable characters */
        public int f۹۰۷۲f;

        /* renamed from: f0  reason: contains not printable characters */
        int f۹۰۷۳f0;

        /* renamed from: g  reason: contains not printable characters */
        public int f۹۰۷۴g;

        /* renamed from: g0  reason: contains not printable characters */
        float f۹۰۷۵g0;

        /* renamed from: h  reason: contains not printable characters */
        public int f۹۰۷۶h;

        /* renamed from: h0  reason: contains not printable characters */
        int f۹۰۷۷h0;

        /* renamed from: i  reason: contains not printable characters */
        public int f۹۰۷۸i;

        /* renamed from: i0  reason: contains not printable characters */
        int f۹۰۷۹i0;

        /* renamed from: j  reason: contains not printable characters */
        public int f۹۰۸۰j;

        /* renamed from: j0  reason: contains not printable characters */
        float f۹۰۸۱j0;

        /* renamed from: k  reason: contains not printable characters */
        public int f۹۰۸۲k;

        /* renamed from: k0  reason: contains not printable characters */
        Ce f۹۰۸۳k0;

        /* renamed from: l  reason: contains not printable characters */
        public int f۹۰۸۴l;

        /* renamed from: l0  reason: contains not printable characters */
        public boolean f۹۰۸۵l0;

        /* renamed from: m  reason: contains not printable characters */
        public int f۹۰۸۶m;

        /* renamed from: n  reason: contains not printable characters */
        public int f۹۰۸۷n;

        /* renamed from: o  reason: contains not printable characters */
        public float f۹۰۸۸o;

        /* renamed from: p  reason: contains not printable characters */
        public int f۹۰۸۹p;

        /* renamed from: q  reason: contains not printable characters */
        public int f۹۰۹۰q;

        /* renamed from: r  reason: contains not printable characters */
        public int f۹۰۹۱r;

        /* renamed from: s  reason: contains not printable characters */
        public int f۹۰۹۲s;

        /* renamed from: t  reason: contains not printable characters */
        public int f۹۰۹۳t;

        /* renamed from: u  reason: contains not printable characters */
        public int f۹۰۹۴u;

        /* renamed from: v  reason: contains not printable characters */
        public int f۹۰۹۵v;

        /* renamed from: w  reason: contains not printable characters */
        public int f۹۰۹۶w;

        /* renamed from: x  reason: contains not printable characters */
        public int f۹۰۹۷x;

        /* renamed from: y  reason: contains not printable characters */
        public int f۹۰۹۸y;

        /* renamed from: z  reason: contains not printable characters */
        public float f۹۰۹۹z;

        /* renamed from: android.support.constraint.ConstraintLayout$a$a  reason: invalid class name */
        private static class Ca {

            /* renamed from: a  reason: contains not printable characters */
            public static final SparseIntArray f۹۱۰۰a = new SparseIntArray();

            static {
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_android_orientation, 1);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f۹۱۰۰a.append(Ch.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public Ca(Context c, AttributeSet attrs) {
            super(c, attrs);
            int commaIndex;
            int i = -1;
            this.f۹۰۶۲a = -1;
            this.f۹۰۶۴b = -1;
            this.f۹۰۶۶c = -1.0f;
            this.f۹۰۶۸d = -1;
            this.f۹۰۷۰e = -1;
            this.f۹۰۷۲f = -1;
            this.f۹۰۷۴g = -1;
            this.f۹۰۷۶h = -1;
            this.f۹۰۷۸i = -1;
            this.f۹۰۸۰j = -1;
            this.f۹۰۸۲k = -1;
            this.f۹۰۸۴l = -1;
            this.f۹۰۸۶m = -1;
            int i2 = 0;
            this.f۹۰۸۷n = 0;
            this.f۹۰۸۸o = 0.0f;
            this.f۹۰۸۹p = -1;
            this.f۹۰۹۰q = -1;
            this.f۹۰۹۱r = -1;
            this.f۹۰۹۲s = -1;
            this.f۹۰۹۳t = -1;
            this.f۹۰۹۴u = -1;
            this.f۹۰۹۵v = -1;
            this.f۹۰۹۶w = -1;
            this.f۹۰۹۷x = -1;
            this.f۹۰۹۸y = -1;
            this.f۹۰۹۹z = 0.5f;
            this.f۹۰۳۶A = 0.5f;
            this.f۹۰۳۷B = null;
            this.f۹۰۳۸C = 1;
            this.f۹۰۳۹D = -1.0f;
            this.f۹۰۴۰E = -1.0f;
            this.f۹۰۴۱F = 0;
            this.f۹۰۴۲G = 0;
            this.f۹۰۴۳H = 0;
            this.f۹۰۴۴I = 0;
            this.f۹۰۴۵J = 0;
            this.f۹۰۴۶K = 0;
            this.f۹۰۴۷L = 0;
            this.f۹۰۴۸M = 0;
            this.f۹۰۴۹N = 1.0f;
            this.f۹۰۵۰O = 1.0f;
            this.f۹۰۵۱P = -1;
            this.f۹۰۵۲Q = -1;
            this.f۹۰۵۳R = -1;
            this.f۹۰۵۴S = false;
            this.f۹۰۵۵T = false;
            this.f۹۰۵۶U = true;
            this.f۹۰۵۷V = true;
            this.f۹۰۵۸W = false;
            this.f۹۰۵۹X = false;
            this.f۹۰۶۰Y = false;
            this.f۹۰۶۱Z = false;
            this.f۹۰۶۳a0 = -1;
            this.f۹۰۶۵b0 = -1;
            this.f۹۰۶۷c0 = -1;
            this.f۹۰۶۹d0 = -1;
            this.f۹۰۷۱e0 = -1;
            this.f۹۰۷۳f0 = -1;
            this.f۹۰۷۵g0 = 0.5f;
            this.f۹۰۸۳k0 = new Ce();
            this.f۹۰۸۵l0 = false;
            TypedArray a = c.obtainStyledAttributes(attrs, Ch.ConstraintLayout_Layout);
            int N = a.getIndexCount();
            int i3 = 0;
            while (i3 < N) {
                int attr = a.getIndex(i3);
                switch (Ca.f۹۱۰۰a.get(attr)) {
                    case 1:
                        this.f۹۰۵۳R = a.getInt(attr, this.f۹۰۵۳R);
                        break;
                    case 2:
                        this.f۹۰۸۶m = a.getResourceId(attr, this.f۹۰۸۶m);
                        if (this.f۹۰۸۶m != -1) {
                            break;
                        } else {
                            this.f۹۰۸۶m = a.getInt(attr, -1);
                            break;
                        }
                    case 3:
                        this.f۹۰۸۷n = a.getDimensionPixelSize(attr, this.f۹۰۸۷n);
                        break;
                    case 4:
                        this.f۹۰۸۸o = a.getFloat(attr, this.f۹۰۸۸o) % 360.0f;
                        float f = this.f۹۰۸۸o;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.f۹۰۸۸o = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f۹۰۶۲a = a.getDimensionPixelOffset(attr, this.f۹۰۶۲a);
                        break;
                    case 6:
                        this.f۹۰۶۴b = a.getDimensionPixelOffset(attr, this.f۹۰۶۴b);
                        break;
                    case 7:
                        this.f۹۰۶۶c = a.getFloat(attr, this.f۹۰۶۶c);
                        break;
                    case 8:
                        this.f۹۰۶۸d = a.getResourceId(attr, this.f۹۰۶۸d);
                        if (this.f۹۰۶۸d != -1) {
                            break;
                        } else {
                            this.f۹۰۶۸d = a.getInt(attr, -1);
                            break;
                        }
                    case 9:
                        this.f۹۰۷۰e = a.getResourceId(attr, this.f۹۰۷۰e);
                        if (this.f۹۰۷۰e != -1) {
                            break;
                        } else {
                            this.f۹۰۷۰e = a.getInt(attr, -1);
                            break;
                        }
                    case 10:
                        this.f۹۰۷۲f = a.getResourceId(attr, this.f۹۰۷۲f);
                        if (this.f۹۰۷۲f != -1) {
                            break;
                        } else {
                            this.f۹۰۷۲f = a.getInt(attr, -1);
                            break;
                        }
                    case 11:
                        this.f۹۰۷۴g = a.getResourceId(attr, this.f۹۰۷۴g);
                        if (this.f۹۰۷۴g != -1) {
                            break;
                        } else {
                            this.f۹۰۷۴g = a.getInt(attr, -1);
                            break;
                        }
                    case 12:
                        this.f۹۰۷۶h = a.getResourceId(attr, this.f۹۰۷۶h);
                        if (this.f۹۰۷۶h != -1) {
                            break;
                        } else {
                            this.f۹۰۷۶h = a.getInt(attr, -1);
                            break;
                        }
                    case 13:
                        this.f۹۰۷۸i = a.getResourceId(attr, this.f۹۰۷۸i);
                        if (this.f۹۰۷۸i != -1) {
                            break;
                        } else {
                            this.f۹۰۷۸i = a.getInt(attr, -1);
                            break;
                        }
                    case 14:
                        this.f۹۰۸۰j = a.getResourceId(attr, this.f۹۰۸۰j);
                        if (this.f۹۰۸۰j != -1) {
                            break;
                        } else {
                            this.f۹۰۸۰j = a.getInt(attr, -1);
                            break;
                        }
                    case 15:
                        this.f۹۰۸۲k = a.getResourceId(attr, this.f۹۰۸۲k);
                        if (this.f۹۰۸۲k != -1) {
                            break;
                        } else {
                            this.f۹۰۸۲k = a.getInt(attr, -1);
                            break;
                        }
                    case 16:
                        this.f۹۰۸۴l = a.getResourceId(attr, this.f۹۰۸۴l);
                        if (this.f۹۰۸۴l != -1) {
                            break;
                        } else {
                            this.f۹۰۸۴l = a.getInt(attr, -1);
                            break;
                        }
                    case 17:
                        this.f۹۰۸۹p = a.getResourceId(attr, this.f۹۰۸۹p);
                        if (this.f۹۰۸۹p != -1) {
                            break;
                        } else {
                            this.f۹۰۸۹p = a.getInt(attr, -1);
                            break;
                        }
                    case 18:
                        this.f۹۰۹۰q = a.getResourceId(attr, this.f۹۰۹۰q);
                        if (this.f۹۰۹۰q != -1) {
                            break;
                        } else {
                            this.f۹۰۹۰q = a.getInt(attr, -1);
                            break;
                        }
                    case 19:
                        this.f۹۰۹۱r = a.getResourceId(attr, this.f۹۰۹۱r);
                        if (this.f۹۰۹۱r != -1) {
                            break;
                        } else {
                            this.f۹۰۹۱r = a.getInt(attr, -1);
                            break;
                        }
                    case 20:
                        this.f۹۰۹۲s = a.getResourceId(attr, this.f۹۰۹۲s);
                        if (this.f۹۰۹۲s != -1) {
                            break;
                        } else {
                            this.f۹۰۹۲s = a.getInt(attr, -1);
                            break;
                        }
                    case 21:
                        this.f۹۰۹۳t = a.getDimensionPixelSize(attr, this.f۹۰۹۳t);
                        break;
                    case 22:
                        this.f۹۰۹۴u = a.getDimensionPixelSize(attr, this.f۹۰۹۴u);
                        break;
                    case 23:
                        this.f۹۰۹۵v = a.getDimensionPixelSize(attr, this.f۹۰۹۵v);
                        break;
                    case 24:
                        this.f۹۰۹۶w = a.getDimensionPixelSize(attr, this.f۹۰۹۶w);
                        break;
                    case 25:
                        this.f۹۰۹۷x = a.getDimensionPixelSize(attr, this.f۹۰۹۷x);
                        break;
                    case 26:
                        this.f۹۰۹۸y = a.getDimensionPixelSize(attr, this.f۹۰۹۸y);
                        break;
                    case 27:
                        this.f۹۰۵۴S = a.getBoolean(attr, this.f۹۰۵۴S);
                        break;
                    case 28:
                        this.f۹۰۵۵T = a.getBoolean(attr, this.f۹۰۵۵T);
                        break;
                    case 29:
                        this.f۹۰۹۹z = a.getFloat(attr, this.f۹۰۹۹z);
                        break;
                    case 30:
                        this.f۹۰۳۶A = a.getFloat(attr, this.f۹۰۳۶A);
                        break;
                    case 31:
                        this.f۹۰۴۳H = a.getInt(attr, 0);
                        if (this.f۹۰۴۳H != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        this.f۹۰۴۴I = a.getInt(attr, 0);
                        if (this.f۹۰۴۴I != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.f۹۰۴۵J = a.getDimensionPixelSize(attr, this.f۹۰۴۵J);
                            break;
                        } catch (Exception e) {
                            if (a.getInt(attr, this.f۹۰۴۵J) == -2) {
                                this.f۹۰۴۵J = -2;
                            }
                            break;
                        }
                    case 34:
                        try {
                            this.f۹۰۴۷L = a.getDimensionPixelSize(attr, this.f۹۰۴۷L);
                            break;
                        } catch (Exception e2) {
                            if (a.getInt(attr, this.f۹۰۴۷L) == -2) {
                                this.f۹۰۴۷L = -2;
                            }
                            break;
                        }
                    case 35:
                        this.f۹۰۴۹N = Math.max(0.0f, a.getFloat(attr, this.f۹۰۴۹N));
                        break;
                    case 36:
                        try {
                            this.f۹۰۴۶K = a.getDimensionPixelSize(attr, this.f۹۰۴۶K);
                            break;
                        } catch (Exception e3) {
                            if (a.getInt(attr, this.f۹۰۴۶K) == -2) {
                                this.f۹۰۴۶K = -2;
                            }
                            break;
                        }
                    case 37:
                        try {
                            this.f۹۰۴۸M = a.getDimensionPixelSize(attr, this.f۹۰۴۸M);
                            break;
                        } catch (Exception e4) {
                            if (a.getInt(attr, this.f۹۰۴۸M) == -2) {
                                this.f۹۰۴۸M = -2;
                            }
                            break;
                        }
                    case 38:
                        this.f۹۰۵۰O = Math.max(0.0f, a.getFloat(attr, this.f۹۰۵۰O));
                        break;
                    case 44:
                        this.f۹۰۳۷B = a.getString(attr);
                        this.f۹۰۳۸C = i;
                        String str = this.f۹۰۳۷B;
                        if (str == null) {
                            break;
                        } else {
                            int len = str.length();
                            int commaIndex2 = this.f۹۰۳۷B.indexOf(44);
                            if (commaIndex2 <= 0 || commaIndex2 >= len - 1) {
                                commaIndex = 0;
                            } else {
                                String dimension = this.f۹۰۳۷B.substring(i2, commaIndex2);
                                if (dimension.equalsIgnoreCase("W")) {
                                    this.f۹۰۳۸C = i2;
                                } else if (dimension.equalsIgnoreCase("H")) {
                                    this.f۹۰۳۸C = 1;
                                }
                                commaIndex = commaIndex2 + 1;
                            }
                            int colonIndex = this.f۹۰۳۷B.indexOf(58);
                            if (colonIndex < 0 || colonIndex >= len - 1) {
                                String r = this.f۹۰۳۷B.substring(commaIndex);
                                if (r.length() > 0) {
                                    try {
                                        Float.parseFloat(r);
                                    } catch (NumberFormatException e5) {
                                    }
                                }
                            } else {
                                String nominator = this.f۹۰۳۷B.substring(commaIndex, colonIndex);
                                String denominator = this.f۹۰۳۷B.substring(colonIndex + 1);
                                if (nominator.length() > 0 && denominator.length() > 0) {
                                    try {
                                        float nominatorValue = Float.parseFloat(nominator);
                                        float denominatorValue = Float.parseFloat(denominator);
                                        if (nominatorValue > 0.0f && denominatorValue > 0.0f) {
                                            if (this.f۹۰۳۸C == 1) {
                                                Math.abs(denominatorValue / nominatorValue);
                                            } else {
                                                Math.abs(nominatorValue / denominatorValue);
                                            }
                                        }
                                    } catch (NumberFormatException e6) {
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    case 45:
                        this.f۹۰۳۹D = a.getFloat(attr, this.f۹۰۳۹D);
                        break;
                    case 46:
                        this.f۹۰۴۰E = a.getFloat(attr, this.f۹۰۴۰E);
                        break;
                    case 47:
                        this.f۹۰۴۱F = a.getInt(attr, i2);
                        break;
                    case 48:
                        this.f۹۰۴۲G = a.getInt(attr, i2);
                        break;
                    case 49:
                        this.f۹۰۵۱P = a.getDimensionPixelOffset(attr, this.f۹۰۵۱P);
                        break;
                    case 50:
                        this.f۹۰۵۲Q = a.getDimensionPixelOffset(attr, this.f۹۰۵۲Q);
                        break;
                }
                i3++;
                i = -1;
                i2 = 0;
            }
            a.recycle();
            m۱۰۹۵۸a();
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۹۵۸a() {
            this.f۹۰۵۹X = false;
            this.f۹۰۵۶U = true;
            this.f۹۰۵۷V = true;
            if (((ViewGroup.MarginLayoutParams) this).width == -2 && this.f۹۰۵۴S) {
                this.f۹۰۵۶U = false;
                this.f۹۰۴۳H = 1;
            }
            if (((ViewGroup.MarginLayoutParams) this).height == -2 && this.f۹۰۵۵T) {
                this.f۹۰۵۷V = false;
                this.f۹۰۴۴I = 1;
            }
            if (((ViewGroup.MarginLayoutParams) this).width == 0 || ((ViewGroup.MarginLayoutParams) this).width == -1) {
                this.f۹۰۵۶U = false;
                if (((ViewGroup.MarginLayoutParams) this).width == 0 && this.f۹۰۴۳H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f۹۰۵۴S = true;
                }
            }
            if (((ViewGroup.MarginLayoutParams) this).height == 0 || ((ViewGroup.MarginLayoutParams) this).height == -1) {
                this.f۹۰۵۷V = false;
                if (((ViewGroup.MarginLayoutParams) this).height == 0 && this.f۹۰۴۴I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f۹۰۵۵T = true;
                }
            }
            if (this.f۹۰۶۶c != -1.0f || this.f۹۰۶۲a != -1 || this.f۹۰۶۴b != -1) {
                this.f۹۰۵۹X = true;
                this.f۹۰۵۶U = true;
                this.f۹۰۵۷V = true;
                if (!(this.f۹۰۸۳k0 instanceof Cg)) {
                    this.f۹۰۸۳k0 = new Cg();
                }
                ((Cg) this.f۹۰۸۳k0).m۱۱۲۰۲r(this.f۹۰۵۳R);
            }
        }

        public Ca(int width, int height) {
            super(width, height);
            this.f۹۰۶۲a = -1;
            this.f۹۰۶۴b = -1;
            this.f۹۰۶۶c = -1.0f;
            this.f۹۰۶۸d = -1;
            this.f۹۰۷۰e = -1;
            this.f۹۰۷۲f = -1;
            this.f۹۰۷۴g = -1;
            this.f۹۰۷۶h = -1;
            this.f۹۰۷۸i = -1;
            this.f۹۰۸۰j = -1;
            this.f۹۰۸۲k = -1;
            this.f۹۰۸۴l = -1;
            this.f۹۰۸۶m = -1;
            this.f۹۰۸۷n = 0;
            this.f۹۰۸۸o = 0.0f;
            this.f۹۰۸۹p = -1;
            this.f۹۰۹۰q = -1;
            this.f۹۰۹۱r = -1;
            this.f۹۰۹۲s = -1;
            this.f۹۰۹۳t = -1;
            this.f۹۰۹۴u = -1;
            this.f۹۰۹۵v = -1;
            this.f۹۰۹۶w = -1;
            this.f۹۰۹۷x = -1;
            this.f۹۰۹۸y = -1;
            this.f۹۰۹۹z = 0.5f;
            this.f۹۰۳۶A = 0.5f;
            this.f۹۰۳۷B = null;
            this.f۹۰۳۸C = 1;
            this.f۹۰۳۹D = -1.0f;
            this.f۹۰۴۰E = -1.0f;
            this.f۹۰۴۱F = 0;
            this.f۹۰۴۲G = 0;
            this.f۹۰۴۳H = 0;
            this.f۹۰۴۴I = 0;
            this.f۹۰۴۵J = 0;
            this.f۹۰۴۶K = 0;
            this.f۹۰۴۷L = 0;
            this.f۹۰۴۸M = 0;
            this.f۹۰۴۹N = 1.0f;
            this.f۹۰۵۰O = 1.0f;
            this.f۹۰۵۱P = -1;
            this.f۹۰۵۲Q = -1;
            this.f۹۰۵۳R = -1;
            this.f۹۰۵۴S = false;
            this.f۹۰۵۵T = false;
            this.f۹۰۵۶U = true;
            this.f۹۰۵۷V = true;
            this.f۹۰۵۸W = false;
            this.f۹۰۵۹X = false;
            this.f۹۰۶۰Y = false;
            this.f۹۰۶۱Z = false;
            this.f۹۰۶۳a0 = -1;
            this.f۹۰۶۵b0 = -1;
            this.f۹۰۶۷c0 = -1;
            this.f۹۰۶۹d0 = -1;
            this.f۹۰۷۱e0 = -1;
            this.f۹۰۷۳f0 = -1;
            this.f۹۰۷۵g0 = 0.5f;
            this.f۹۰۸۳k0 = new Ce();
            this.f۹۰۸۵l0 = false;
        }

        public Ca(ViewGroup.LayoutParams source) {
            super(source);
            this.f۹۰۶۲a = -1;
            this.f۹۰۶۴b = -1;
            this.f۹۰۶۶c = -1.0f;
            this.f۹۰۶۸d = -1;
            this.f۹۰۷۰e = -1;
            this.f۹۰۷۲f = -1;
            this.f۹۰۷۴g = -1;
            this.f۹۰۷۶h = -1;
            this.f۹۰۷۸i = -1;
            this.f۹۰۸۰j = -1;
            this.f۹۰۸۲k = -1;
            this.f۹۰۸۴l = -1;
            this.f۹۰۸۶m = -1;
            this.f۹۰۸۷n = 0;
            this.f۹۰۸۸o = 0.0f;
            this.f۹۰۸۹p = -1;
            this.f۹۰۹۰q = -1;
            this.f۹۰۹۱r = -1;
            this.f۹۰۹۲s = -1;
            this.f۹۰۹۳t = -1;
            this.f۹۰۹۴u = -1;
            this.f۹۰۹۵v = -1;
            this.f۹۰۹۶w = -1;
            this.f۹۰۹۷x = -1;
            this.f۹۰۹۸y = -1;
            this.f۹۰۹۹z = 0.5f;
            this.f۹۰۳۶A = 0.5f;
            this.f۹۰۳۷B = null;
            this.f۹۰۳۸C = 1;
            this.f۹۰۳۹D = -1.0f;
            this.f۹۰۴۰E = -1.0f;
            this.f۹۰۴۱F = 0;
            this.f۹۰۴۲G = 0;
            this.f۹۰۴۳H = 0;
            this.f۹۰۴۴I = 0;
            this.f۹۰۴۵J = 0;
            this.f۹۰۴۶K = 0;
            this.f۹۰۴۷L = 0;
            this.f۹۰۴۸M = 0;
            this.f۹۰۴۹N = 1.0f;
            this.f۹۰۵۰O = 1.0f;
            this.f۹۰۵۱P = -1;
            this.f۹۰۵۲Q = -1;
            this.f۹۰۵۳R = -1;
            this.f۹۰۵۴S = false;
            this.f۹۰۵۵T = false;
            this.f۹۰۵۶U = true;
            this.f۹۰۵۷V = true;
            this.f۹۰۵۸W = false;
            this.f۹۰۵۹X = false;
            this.f۹۰۶۰Y = false;
            this.f۹۰۶۱Z = false;
            this.f۹۰۶۳a0 = -1;
            this.f۹۰۶۵b0 = -1;
            this.f۹۰۶۷c0 = -1;
            this.f۹۰۶۹d0 = -1;
            this.f۹۰۷۱e0 = -1;
            this.f۹۰۷۳f0 = -1;
            this.f۹۰۷۵g0 = 0.5f;
            this.f۹۰۸۳k0 = new Ce();
            this.f۹۰۸۵l0 = false;
        }

        @TargetApi(17)
        public void resolveLayoutDirection(int layoutDirection) {
            int preLeftMargin = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int preRightMargin = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(layoutDirection);
            this.f۹۰۶۷c0 = -1;
            this.f۹۰۶۹d0 = -1;
            this.f۹۰۶۳a0 = -1;
            this.f۹۰۶۵b0 = -1;
            this.f۹۰۷۱e0 = -1;
            this.f۹۰۷۳f0 = -1;
            this.f۹۰۷۱e0 = this.f۹۰۹۳t;
            this.f۹۰۷۳f0 = this.f۹۰۹۵v;
            this.f۹۰۷۵g0 = this.f۹۰۹۹z;
            this.f۹۰۷۷h0 = this.f۹۰۶۲a;
            this.f۹۰۷۹i0 = this.f۹۰۶۴b;
            this.f۹۰۸۱j0 = this.f۹۰۶۶c;
            if (1 == getLayoutDirection()) {
                boolean startEndDefined = false;
                int i = this.f۹۰۸۹p;
                if (i != -1) {
                    this.f۹۰۶۷c0 = i;
                    startEndDefined = true;
                } else {
                    int i2 = this.f۹۰۹۰q;
                    if (i2 != -1) {
                        this.f۹۰۶۹d0 = i2;
                        startEndDefined = true;
                    }
                }
                int i3 = this.f۹۰۹۱r;
                if (i3 != -1) {
                    this.f۹۰۶۵b0 = i3;
                    startEndDefined = true;
                }
                int i4 = this.f۹۰۹۲s;
                if (i4 != -1) {
                    this.f۹۰۶۳a0 = i4;
                    startEndDefined = true;
                }
                int i5 = this.f۹۰۹۷x;
                if (i5 != -1) {
                    this.f۹۰۷۳f0 = i5;
                }
                int i6 = this.f۹۰۹۸y;
                if (i6 != -1) {
                    this.f۹۰۷۱e0 = i6;
                }
                if (startEndDefined) {
                    this.f۹۰۷۵g0 = 1.0f - this.f۹۰۹۹z;
                }
                if (this.f۹۰۵۹X && this.f۹۰۵۳R == 1) {
                    float f = this.f۹۰۶۶c;
                    if (f != -1.0f) {
                        this.f۹۰۸۱j0 = 1.0f - f;
                        this.f۹۰۷۷h0 = -1;
                        this.f۹۰۷۹i0 = -1;
                    } else {
                        int i7 = this.f۹۰۶۲a;
                        if (i7 != -1) {
                            this.f۹۰۷۹i0 = i7;
                            this.f۹۰۷۷h0 = -1;
                            this.f۹۰۸۱j0 = -1.0f;
                        } else {
                            int i8 = this.f۹۰۶۴b;
                            if (i8 != -1) {
                                this.f۹۰۷۷h0 = i8;
                                this.f۹۰۷۹i0 = -1;
                                this.f۹۰۸۱j0 = -1.0f;
                            }
                        }
                    }
                }
            } else {
                int i9 = this.f۹۰۸۹p;
                if (i9 != -1) {
                    this.f۹۰۶۵b0 = i9;
                }
                int i10 = this.f۹۰۹۰q;
                if (i10 != -1) {
                    this.f۹۰۶۳a0 = i10;
                }
                int i11 = this.f۹۰۹۱r;
                if (i11 != -1) {
                    this.f۹۰۶۷c0 = i11;
                }
                int i12 = this.f۹۰۹۲s;
                if (i12 != -1) {
                    this.f۹۰۶۹d0 = i12;
                }
                int i13 = this.f۹۰۹۷x;
                if (i13 != -1) {
                    this.f۹۰۷۱e0 = i13;
                }
                int i14 = this.f۹۰۹۸y;
                if (i14 != -1) {
                    this.f۹۰۷۳f0 = i14;
                }
            }
            if (this.f۹۰۹۱r == -1 && this.f۹۰۹۲s == -1 && this.f۹۰۹۰q == -1 && this.f۹۰۸۹p == -1) {
                int i15 = this.f۹۰۷۲f;
                if (i15 != -1) {
                    this.f۹۰۶۷c0 = i15;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && preRightMargin > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = preRightMargin;
                    }
                } else {
                    int i16 = this.f۹۰۷۴g;
                    if (i16 != -1) {
                        this.f۹۰۶۹d0 = i16;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && preRightMargin > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = preRightMargin;
                        }
                    }
                }
                int i17 = this.f۹۰۶۸d;
                if (i17 != -1) {
                    this.f۹۰۶۳a0 = i17;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && preLeftMargin > 0) {
                        ((ViewGroup.MarginLayoutParams) this).leftMargin = preLeftMargin;
                        return;
                    }
                    return;
                }
                int i18 = this.f۹۰۷۰e;
                if (i18 != -1) {
                    this.f۹۰۶۵b0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && preLeftMargin > 0) {
                        ((ViewGroup.MarginLayoutParams) this).leftMargin = preLeftMargin;
                    }
                }
            }
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f۹۰۲۴k = true;
        this.f۹۰۲۹p = -1;
        this.f۹۰۳۰q = -1;
        this.f۹۰۳۱r = -1;
        this.f۹۰۳۲s = -1;
        this.f۹۰۳۳t = 0;
        this.f۹۰۳۴u = 0;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
