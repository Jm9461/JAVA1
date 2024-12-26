package android.support.design.transformation;

import android.content.Context;
import android.os.Build;
import android.support.design.transformation.FabTransformationBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.p۰۴۳v4.view.Cu;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Map;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ca;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Cj;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: g  reason: contains not printable characters */
    private Map<View, Integer> f۹۵۴۲g;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.design.transformation.FabTransformationBehavior
    /* renamed from: a  reason: contains not printable characters */
    public FabTransformationBehavior.Ce m۱۱۴۰۰a(Context context, boolean expanded) {
        int specRes;
        if (expanded) {
            specRes = Ca.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            specRes = Ca.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.Ce spec = new FabTransformationBehavior.Ce();
        spec.f۹۵۳۶a = Ch.m۹۹۵۵a(context, specRes);
        spec.f۹۵۳۷b = new Cj(17, 0.0f, 0.0f);
        return spec;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.design.transformation.ExpandableTransformationBehavior, android.support.design.transformation.ExpandableBehavior
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۴۰۱a(View dependency, View child, boolean expanded, boolean animated) {
        m۱۱۳۹۹a(child, expanded);
        return super.m۱۱۳۷۱a(dependency, child, expanded, animated);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۳۹۹a(View sheet, boolean expanded) {
        ViewParent viewParent = sheet.getParent();
        if (viewParent instanceof CoordinatorLayout) {
            CoordinatorLayout parent = (CoordinatorLayout) viewParent;
            int childCount = parent.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && expanded) {
                this.f۹۵۴۲g = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View child = parent.getChildAt(i);
                boolean hasScrimBehavior = (child.getLayoutParams() instanceof CoordinatorLayout.Cf) && (((CoordinatorLayout.Cf) child.getLayoutParams()).m۱۱۶۰۳d() instanceof FabTransformationScrimBehavior);
                if (child != sheet && !hasScrimBehavior) {
                    if (!expanded) {
                        Map<View, Integer> map = this.f۹۵۴۲g;
                        if (map != null && map.containsKey(child)) {
                            Cu.m۱۳۰۰۷f(child, this.f۹۵۴۲g.get(child).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f۹۵۴۲g.put(child, Integer.valueOf(child.getImportantForAccessibility()));
                        }
                        Cu.m۱۳۰۰۷f(child, 4);
                    }
                }
            }
            if (!expanded) {
                this.f۹۵۴۲g = null;
            }
        }
    }
}
