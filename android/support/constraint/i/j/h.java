package android.support.constraint.i.j;

import java.util.Arrays;

public class h extends e {
    protected e[] e0 = new e[4];
    protected int f0 = 0;

    public void b(e widget) {
        int i = this.f0 + 1;
        e[] eVarArr = this.e0;
        if (i > eVarArr.length) {
            this.e0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.e0;
        int i2 = this.f0;
        eVarArr2[i2] = widget;
        this.f0 = i2 + 1;
    }

    public void H() {
        this.f0 = 0;
    }
}
