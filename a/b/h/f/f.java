package a.b.h.f;

import a.b.g.g.n;
import a.b.h.f.b;
import android.content.Context;
import android.support.v7.view.menu.r;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f۴۷۳a;

    /* renamed from: b  reason: collision with root package name */
    final b f۴۷۴b;

    public f(Context context, b supportActionMode) {
        this.f۴۷۳a = context;
        this.f۴۷۴b = supportActionMode;
    }

    public Object getTag() {
        return this.f۴۷۴b.f();
    }

    public void setTag(Object tag) {
        this.f۴۷۴b.a(tag);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence title) {
        this.f۴۷۴b.b(title);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence subtitle) {
        this.f۴۷۴b.a(subtitle);
    }

    public void invalidate() {
        this.f۴۷۴b.i();
    }

    public void finish() {
        this.f۴۷۴b.a();
    }

    public Menu getMenu() {
        return r.a(this.f۴۷۳a, (a.b.g.b.a.a) this.f۴۷۴b.c());
    }

    public CharSequence getTitle() {
        return this.f۴۷۴b.g();
    }

    @Override // android.view.ActionMode
    public void setTitle(int resId) {
        this.f۴۷۴b.b(resId);
    }

    public CharSequence getSubtitle() {
        return this.f۴۷۴b.e();
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int resId) {
        this.f۴۷۴b.a(resId);
    }

    public View getCustomView() {
        return this.f۴۷۴b.b();
    }

    public void setCustomView(View view) {
        this.f۴۷۴b.a(view);
    }

    public MenuInflater getMenuInflater() {
        return this.f۴۷۴b.d();
    }

    public boolean getTitleOptionalHint() {
        return this.f۴۷۴b.h();
    }

    public void setTitleOptionalHint(boolean titleOptional) {
        this.f۴۷۴b.a(titleOptional);
    }

    public boolean isTitleOptional() {
        return this.f۴۷۴b.j();
    }

    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f۴۷۵a;

        /* renamed from: b  reason: collision with root package name */
        final Context f۴۷۶b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f۴۷۷c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final n<Menu, Menu> f۴۷۸d = new n<>();

        public a(Context context, ActionMode.Callback supportCallback) {
            this.f۴۷۶b = context;
            this.f۴۷۵a = supportCallback;
        }

        @Override // a.b.h.f.b.a
        public boolean a(b mode, Menu menu) {
            return this.f۴۷۵a.onCreateActionMode(b(mode), a(menu));
        }

        @Override // a.b.h.f.b.a
        public boolean b(b mode, Menu menu) {
            return this.f۴۷۵a.onPrepareActionMode(b(mode), a(menu));
        }

        @Override // a.b.h.f.b.a
        public boolean a(b mode, MenuItem item) {
            return this.f۴۷۵a.onActionItemClicked(b(mode), r.a(this.f۴۷۶b, (a.b.g.b.a.b) item));
        }

        @Override // a.b.h.f.b.a
        public void a(b mode) {
            this.f۴۷۵a.onDestroyActionMode(b(mode));
        }

        private Menu a(Menu menu) {
            Menu wrapper = this.f۴۷۸d.get(menu);
            if (wrapper != null) {
                return wrapper;
            }
            Menu wrapper2 = r.a(this.f۴۷۶b, (a.b.g.b.a.a) menu);
            this.f۴۷۸d.put(menu, wrapper2);
            return wrapper2;
        }

        public ActionMode b(b mode) {
            int count = this.f۴۷۷c.size();
            for (int i = 0; i < count; i++) {
                f wrapper = this.f۴۷۷c.get(i);
                if (wrapper != null && wrapper.f۴۷۴b == mode) {
                    return wrapper;
                }
            }
            f wrapper2 = new f(this.f۴۷۶b, mode);
            this.f۴۷۷c.add(wrapper2);
            return wrapper2;
        }
    }
}
