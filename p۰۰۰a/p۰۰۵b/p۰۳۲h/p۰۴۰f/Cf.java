package p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f;

import android.content.Context;
import android.support.p۰۴۷v7.view.menu.Cr;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuCa;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cn;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb;

/* renamed from: a.b.h.f.f  reason: invalid class name */
public class Cf extends ActionMode {

    /* renamed from: a  reason: contains not printable characters */
    final Context f۸۸۹۲a;

    /* renamed from: b  reason: contains not printable characters */
    final AbstractCb f۸۸۹۳b;

    public Cf(Context context, AbstractCb supportActionMode) {
        this.f۸۸۹۲a = context;
        this.f۸۸۹۳b = supportActionMode;
    }

    public Object getTag() {
        return this.f۸۸۹۳b.m۱۰۷۸۴f();
    }

    public void setTag(Object tag) {
        this.f۸۸۹۳b.m۱۰۷۷۶a(tag);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence title) {
        this.f۸۸۹۳b.m۱۰۷۸۰b(title);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence subtitle) {
        this.f۸۸۹۳b.m۱۰۷۷۵a(subtitle);
    }

    public void invalidate() {
        this.f۸۸۹۳b.m۱۰۷۸۷i();
    }

    public void finish() {
        this.f۸۸۹۳b.m۱۰۷۷۲a();
    }

    public Menu getMenu() {
        return Cr.m۱۳۹۸۲a(this.f۸۸۹۲a, (AbstractMenuCa) this.f۸۸۹۳b.m۱۰۷۸۱c());
    }

    public CharSequence getTitle() {
        return this.f۸۸۹۳b.m۱۰۷۸۵g();
    }

    @Override // android.view.ActionMode
    public void setTitle(int resId) {
        this.f۸۸۹۳b.m۱۰۷۷۹b(resId);
    }

    public CharSequence getSubtitle() {
        return this.f۸۸۹۳b.m۱۰۷۸۳e();
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int resId) {
        this.f۸۸۹۳b.m۱۰۷۷۳a(resId);
    }

    public View getCustomView() {
        return this.f۸۸۹۳b.m۱۰۷۷۸b();
    }

    public void setCustomView(View view) {
        this.f۸۸۹۳b.m۱۰۷۷۴a(view);
    }

    public MenuInflater getMenuInflater() {
        return this.f۸۸۹۳b.m۱۰۷۸۲d();
    }

    public boolean getTitleOptionalHint() {
        return this.f۸۸۹۳b.m۱۰۷۸۶h();
    }

    public void setTitleOptionalHint(boolean titleOptional) {
        this.f۸۸۹۳b.m۱۰۷۷۷a(titleOptional);
    }

    public boolean isTitleOptional() {
        return this.f۸۸۹۳b.m۱۰۷۸۸j();
    }

    /* renamed from: a.b.h.f.f$a  reason: invalid class name */
    public static class Ca implements AbstractCb.AbstractCa {

        /* renamed from: a  reason: contains not printable characters */
        final ActionMode.Callback f۸۸۹۴a;

        /* renamed from: b  reason: contains not printable characters */
        final Context f۸۸۹۵b;

        /* renamed from: c  reason: contains not printable characters */
        final ArrayList<Cf> f۸۸۹۶c = new ArrayList<>();

        /* renamed from: d  reason: contains not printable characters */
        final Cn<Menu, Menu> f۸۸۹۷d = new Cn<>();

        public Ca(Context context, ActionMode.Callback supportCallback) {
            this.f۸۸۹۵b = context;
            this.f۸۸۹۴a = supportCallback;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۸۱۷a(AbstractCb mode, Menu menu) {
            return this.f۸۸۹۴a.onCreateActionMode(m۱۰۸۱۹b(mode), m۱۰۸۱۵a(menu));
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb.AbstractCa
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۰۸۲۰b(AbstractCb mode, Menu menu) {
            return this.f۸۸۹۴a.onPrepareActionMode(m۱۰۸۱۹b(mode), m۱۰۸۱۵a(menu));
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۸۱۸a(AbstractCb mode, MenuItem item) {
            return this.f۸۸۹۴a.onActionItemClicked(m۱۰۸۱۹b(mode), Cr.m۱۳۹۸۳a(this.f۸۸۹۵b, (AbstractMenuItemCb) item));
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۸۱۶a(AbstractCb mode) {
            this.f۸۸۹۴a.onDestroyActionMode(m۱۰۸۱۹b(mode));
        }

        /* renamed from: a  reason: contains not printable characters */
        private Menu m۱۰۸۱۵a(Menu menu) {
            Menu wrapper = this.f۸۸۹۷d.get(menu);
            if (wrapper != null) {
                return wrapper;
            }
            Menu wrapper2 = Cr.m۱۳۹۸۲a(this.f۸۸۹۵b, (AbstractMenuCa) menu);
            this.f۸۸۹۷d.put(menu, wrapper2);
            return wrapper2;
        }

        /* renamed from: b  reason: contains not printable characters */
        public ActionMode m۱۰۸۱۹b(AbstractCb mode) {
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
