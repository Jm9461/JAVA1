package p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f;

import android.content.Context;
import android.support.v7.view.menu.Cr;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuCa;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cn;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb;

/* renamed from: a.b.h.f.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cf extends ActionMode {

    /* renamed from: a, reason: contains not printable characters */
    final Context f۸۸۹۲a;

    /* renamed from: b, reason: contains not printable characters */
    final AbstractCb f۸۸۹۳b;

    public Cf(Context context, AbstractCb supportActionMode) {
        this.f۸۸۹۲a = context;
        this.f۸۸۹۳b = supportActionMode;
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f۸۸۹۳b.m۸۷۱۵f();
    }

    @Override // android.view.ActionMode
    public void setTag(Object tag) {
        this.f۸۸۹۳b.m۸۷۰۷a(tag);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence title) {
        this.f۸۸۹۳b.mo۱۱۶۵۷b(title);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence subtitle) {
        this.f۸۸۹۳b.mo۱۱۶۵۲a(subtitle);
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f۸۸۹۳b.mo۱۱۶۶۲i();
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f۸۸۹۳b.mo۱۱۶۴۸a();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return Cr.m۱۱۹۱۲a(this.f۸۸۹۲a, (InterfaceMenuCa) this.f۸۸۹۳b.mo۱۱۶۵۸c());
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f۸۸۹۳b.mo۱۱۶۶۱g();
    }

    @Override // android.view.ActionMode
    public void setTitle(int resId) {
        this.f۸۸۹۳b.mo۱۱۶۵۶b(resId);
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f۸۸۹۳b.mo۱۱۶۶۰e();
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int resId) {
        this.f۸۸۹۳b.mo۱۱۶۴۹a(resId);
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f۸۸۹۳b.mo۱۱۶۵۵b();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f۸۸۹۳b.mo۱۱۶۵۱a(view);
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f۸۸۹۳b.mo۱۱۶۵۹d();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f۸۸۹۳b.m۸۷۱۷h();
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean titleOptional) {
        this.f۸۸۹۳b.mo۱۱۶۵۳a(titleOptional);
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f۸۸۹۳b.mo۱۱۶۶۳j();
    }

    /* renamed from: a.b.h.f.f$a */
    public static class a implements AbstractCb.a {

        /* renamed from: a, reason: contains not printable characters */
        final ActionMode.Callback f۸۸۹۴a;

        /* renamed from: b, reason: contains not printable characters */
        final Context f۸۸۹۵b;

        /* renamed from: c, reason: contains not printable characters */
        final ArrayList<Cf> f۸۸۹۶c = new ArrayList<>();

        /* renamed from: d, reason: contains not printable characters */
        final Cn<Menu, Menu> f۸۸۹۷d = new Cn<>();

        public a(Context context, ActionMode.Callback supportCallback) {
            this.f۸۸۹۵b = context;
            this.f۸۸۹۴a = supportCallback;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb.a
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۱۵۳۹a(AbstractCb mode, Menu menu) {
            return this.f۸۸۹۴a.onCreateActionMode(m۸۷۵۰b(mode), m۸۷۴۶a(menu));
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb.a
        /* renamed from: b, reason: contains not printable characters */
        public boolean mo۱۱۵۴۱b(AbstractCb mode, Menu menu) {
            return this.f۸۸۹۴a.onPrepareActionMode(m۸۷۵۰b(mode), m۸۷۴۶a(menu));
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb.a
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۱۵۴۰a(AbstractCb mode, MenuItem item) {
            return this.f۸۸۹۴a.onActionItemClicked(m۸۷۵۰b(mode), Cr.m۱۱۹۱۳a(this.f۸۸۹۵b, (InterfaceMenuItemCb) item));
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۵۳۸a(AbstractCb mode) {
            this.f۸۸۹۴a.onDestroyActionMode(m۸۷۵۰b(mode));
        }

        /* renamed from: a, reason: contains not printable characters */
        private Menu m۸۷۴۶a(Menu menu) {
            Menu wrapper = this.f۸۸۹۷d.get(menu);
            if (wrapper == null) {
                Menu wrapper2 = Cr.m۱۱۹۱۲a(this.f۸۸۹۵b, (InterfaceMenuCa) menu);
                this.f۸۸۹۷d.put(menu, wrapper2);
                return wrapper2;
            }
            return wrapper;
        }

        /* renamed from: b, reason: contains not printable characters */
        public ActionMode m۸۷۵۰b(AbstractCb mode) {
            int count = this.f۸۸۹۶c.size();
            for (int i = 0; i < count; i++) {
                Cf wrapper = this.f۸۸۹۶c.get(i);
                if (wrapper != null && wrapper.f۸۸۹۳b == mode) {
                    return wrapper;
                }
            }
            Cf wrapper2 = new Cf(this.f۸۸۹۵b, mode);
            this.f۸۸۹۶c.add(wrapper2);
            return wrapper2;
        }
    }
}
