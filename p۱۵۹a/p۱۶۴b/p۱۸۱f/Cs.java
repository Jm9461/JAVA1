package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a.b.f.s, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cs {

    /* renamed from: b, reason: contains not printable characters */
    public View f۸۶۳۱b;

    /* renamed from: a, reason: contains not printable characters */
    public final Map<String, Object> f۸۶۳۰a = new HashMap();

    /* renamed from: c, reason: contains not printable characters */
    final ArrayList<AbstractCm> f۸۶۳۲c = new ArrayList<>();

    public boolean equals(Object other) {
        if ((other instanceof Cs) && this.f۸۶۳۱b == ((Cs) other).f۸۶۳۱b && this.f۸۶۳۰a.equals(((Cs) other).f۸۶۳۰a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f۸۶۳۱b.hashCode() * 31) + this.f۸۶۳۰a.hashCode();
    }

    public String toString() {
        String returnValue = "TransitionValues@" + Integer.toHexString(hashCode()) + ":\n";
        String returnValue2 = (returnValue + "    view = " + this.f۸۶۳۱b + "\n") + "    values:";
        for (String s : this.f۸۶۳۰a.keySet()) {
            returnValue2 = returnValue2 + "    " + s + ": " + this.f۸۶۳۰a.get(s) + "\n";
        }
        return returnValue2;
    }
}
