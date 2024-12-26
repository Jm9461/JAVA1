package a.b.f;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f۲۶۷a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f۲۶۸b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<m> f۲۶۹c = new ArrayList<>();

    public boolean equals(Object other) {
        if (!(other instanceof s) || this.f۲۶۸b != ((s) other).f۲۶۸b || !this.f۲۶۷a.equals(((s) other).f۲۶۷a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f۲۶۸b.hashCode() * 31) + this.f۲۶۷a.hashCode();
    }

    public String toString() {
        String returnValue = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f۲۶۸b + "\n") + "    values:";
        for (String s : this.f۲۶۷a.keySet()) {
            returnValue = returnValue + "    " + s + ": " + this.f۲۶۷a.get(s) + "\n";
        }
        return returnValue;
    }
}
