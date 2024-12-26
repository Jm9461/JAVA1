package android.support.p۰۴۷v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p۰۴۳v4.content.Ca;
import android.support.p۰۴۳v4.view.AbstractCc;
import android.support.p۰۴۳v4.view.Cv;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuCa;

/* renamed from: android.support.v7.view.menu.h  reason: invalid class name */
public class Ch implements AbstractMenuCa {

    /* renamed from: A  reason: contains not printable characters */
    private static final int[] f۱۱۲۶۲A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: contains not printable characters */
    private final Context f۱۱۲۶۳a;

    /* renamed from: b  reason: contains not printable characters */
    private final Resources f۱۱۲۶۴b;

    /* renamed from: c  reason: contains not printable characters */
    private boolean f۱۱۲۶۵c;

    /* renamed from: d  reason: contains not printable characters */
    private boolean f۱۱۲۶۶d;

    /* renamed from: e  reason: contains not printable characters */
    private AbstractCa f۱۱۲۶۷e;

    /* renamed from: f  reason: contains not printable characters */
    private ArrayList<Ck> f۱۱۲۶۸f;

    /* renamed from: g  reason: contains not printable characters */
    private ArrayList<Ck> f۱۱۲۶۹g;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۱۱۲۷۰h;

    /* renamed from: i  reason: contains not printable characters */
    private ArrayList<Ck> f۱۱۲۷۱i;

    /* renamed from: j  reason: contains not printable characters */
    private ArrayList<Ck> f۱۱۲۷۲j;

    /* renamed from: k  reason: contains not printable characters */
    private boolean f۱۱۲۷۳k;

    /* renamed from: l  reason: contains not printable characters */
    private int f۱۱۲۷۴l = 0;

    /* renamed from: m  reason: contains not printable characters */
    private ContextMenu.ContextMenuInfo f۱۱۲۷۵m;

    /* renamed from: n  reason: contains not printable characters */
    CharSequence f۱۱۲۷۶n;

    /* renamed from: o  reason: contains not printable characters */
    Drawable f۱۱۲۷۷o;

    /* renamed from: p  reason: contains not printable characters */
    View f۱۱۲۷۸p;

    /* renamed from: q  reason: contains not printable characters */
    private boolean f۱۱۲۷۹q = false;

    /* renamed from: r  reason: contains not printable characters */
    private boolean f۱۱۲۸۰r = false;

    /* renamed from: s  reason: contains not printable characters */
    private boolean f۱۱۲۸۱s = false;

    /* renamed from: t  reason: contains not printable characters */
    private boolean f۱۱۲۸۲t = false;

    /* renamed from: u  reason: contains not printable characters */
    private boolean f۱۱۲۸۳u = false;

    /* renamed from: v  reason: contains not printable characters */
    private ArrayList<Ck> f۱۱۲۸۴v = new ArrayList<>();

    /* renamed from: w  reason: contains not printable characters */
    private CopyOnWriteArrayList<WeakReference<AbstractCp>> f۱۱۲۸۵w = new CopyOnWriteArrayList<>();

    /* renamed from: x  reason: contains not printable characters */
    private Ck f۱۱۲۸۶x;

    /* renamed from: y  reason: contains not printable characters */
    private boolean f۱۱۲۸۷y = false;

    /* renamed from: z  reason: contains not printable characters */
    private boolean f۱۱۲۸۸z;

    /* renamed from: android.support.v7.view.menu.h$a  reason: invalid class name */
    public interface AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۳۸۸۸a(Ch hVar);

        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۳۸۸۹a(Ch hVar, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.h$b  reason: invalid class name */
    public interface AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۳۸۹۰a(Ck kVar);
    }

    public Ch(Context context) {
        this.f۱۱۲۶۳a = context;
        this.f۱۱۲۶۴b = context.getResources();
        this.f۱۱۲۶۸f = new ArrayList<>();
        this.f۱۱۲۶۹g = new ArrayList<>();
        this.f۱۱۲۷۰h = true;
        this.f۱۱۲۷۱i = new ArrayList<>();
        this.f۱۱۲۷۲j = new ArrayList<>();
        this.f۱۱۲۷۳k = true;
        m۱۳۸۳۵e(true);
    }

    /* renamed from: c  reason: contains not printable characters */
    public Ch m۱۳۸۶۳c(int defaultShowAsAction) {
        this.f۱۱۲۷۴l = defaultShowAsAction;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۴۸a(AbstractCp presenter) {
        m۱۳۸۴۹a(presenter, this.f۱۱۲۶۳a);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۴۹a(AbstractCp presenter, Context menuContext) {
        this.f۱۱۲۸۵w.add(new WeakReference<>(presenter));
        presenter.m۱۳۹۶۷a(menuContext, this);
        this.f۱۱۲۷۳k = true;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۸۶۰b(AbstractCp presenter) {
        Iterator<WeakReference<AbstractCp>> it = this.f۱۱۲۸۵w.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            AbstractCp item = (AbstractCp) ref.get();
            if (item == null || item == presenter) {
                this.f۱۱۲۸۵w.remove(ref);
            }
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۳۸۳۳d(boolean cleared) {
        if (!this.f۱۱۲۸۵w.isEmpty()) {
            m۱۳۸۸۷s();
            Iterator<WeakReference<AbstractCp>> it = this.f۱۱۲۸۵w.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                AbstractCp presenter = (AbstractCp) ref.get();
                if (presenter == null) {
                    this.f۱۱۲۸۵w.remove(ref);
                } else {
                    presenter.m۱۳۹۷۱a(cleared);
                }
            }
            m۱۳۸۸۶r();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۳۸۳۲a(SubMenuCv subMenu, AbstractCp preferredPresenter) {
        if (this.f۱۱۲۸۵w.isEmpty()) {
            return false;
        }
        boolean result = false;
        if (preferredPresenter != null) {
            result = preferredPresenter.m۱۳۹۷۳a(subMenu);
        }
        Iterator<WeakReference<AbstractCp>> it = this.f۱۱۲۸۵w.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            AbstractCp presenter = (AbstractCp) ref.get();
            if (presenter == null) {
                this.f۱۱۲۸۵w.remove(ref);
            } else if (!result) {
                result = presenter.m۱۳۹۷۳a(subMenu);
            }
        }
        return result;
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۳۸۳۷f(Bundle outState) {
        Parcelable state;
        if (!this.f۱۱۲۸۵w.isEmpty()) {
            SparseArray<Parcelable> presenterStates = new SparseArray<>();
            Iterator<WeakReference<AbstractCp>> it = this.f۱۱۲۸۵w.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                AbstractCp presenter = (AbstractCp) ref.get();
                if (presenter == null) {
                    this.f۱۱۲۸۵w.remove(ref);
                } else {
                    int id = presenter.m۱۳۹۶۶a();
                    if (id > 0 && (state = presenter.m۱۳۹۷۶c()) != null) {
                        presenterStates.put(id, state);
                    }
                }
            }
            outState.putSparseParcelableArray("android:menu:presenters", presenterStates);
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۳۸۳۴e(Bundle state) {
        Parcelable parcel;
        SparseArray<Parcelable> presenterStates = state.getSparseParcelableArray("android:menu:presenters");
        if (presenterStates != null && !this.f۱۱۲۸۵w.isEmpty()) {
            Iterator<WeakReference<AbstractCp>> it = this.f۱۱۲۸۵w.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                AbstractCp presenter = (AbstractCp) ref.get();
                if (presenter == null) {
                    this.f۱۱۲۸۵w.remove(ref);
                } else {
                    int id = presenter.m۱۳۹۶۶a();
                    if (id > 0 && (parcel = presenterStates.get(id)) != null) {
                        presenter.m۱۳۹۶۸a(parcel);
                    }
                }
            }
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۳۸۷۰d(Bundle outState) {
        m۱۳۸۳۷f(outState);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۸۵۹b(Bundle state) {
        m۱۳۸۳۴e(state);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۸۶۵c(Bundle outStates) {
        SparseArray<Parcelable> viewStates = null;
        int itemCount = size();
        for (int i = 0; i < itemCount; i++) {
            MenuItem item = getItem(i);
            View v = item.getActionView();
            if (!(v == null || v.getId() == -1)) {
                if (viewStates == null) {
                    viewStates = new SparseArray<>();
                }
                v.saveHierarchyState(viewStates);
                if (item.isActionViewExpanded()) {
                    outStates.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuCv) item.getSubMenu()).m۱۳۸۶۵c(outStates);
            }
        }
        if (viewStates != null) {
            outStates.putSparseParcelableArray(m۱۳۸۶۹d(), viewStates);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۴۶a(Bundle states) {
        MenuItem itemToExpand;
        if (states != null) {
            SparseArray<Parcelable> viewStates = states.getSparseParcelableArray(m۱۳۸۶۹d());
            int itemCount = size();
            for (int i = 0; i < itemCount; i++) {
                MenuItem item = getItem(i);
                View v = item.getActionView();
                if (!(v == null || v.getId() == -1)) {
                    v.restoreHierarchyState(viewStates);
                }
                if (item.hasSubMenu()) {
                    ((SubMenuCv) item.getSubMenu()).m۱۳۸۴۶a(states);
                }
            }
            int expandedId = states.getInt("android:menu:expandedactionview");
            if (expandedId > 0 && (itemToExpand = findItem(expandedId)) != null) {
                itemToExpand.expandActionView();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d  reason: contains not printable characters */
    public String m۱۳۸۶۹d() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۴۷a(AbstractCa cb) {
        this.f۱۱۲۶۷e = cb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public MenuItem m۱۳۸۴۴a(int group, int id, int categoryOrder, CharSequence title) {
        int ordering = m۱۳۸۳۶f(categoryOrder);
        Ck item = m۱۳۸۲۹a(group, id, categoryOrder, ordering, title, this.f۱۱۲۷۴l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f۱۱۲۷۵m;
        if (contextMenuInfo != null) {
            item.m۱۳۹۰۱a(contextMenuInfo);
        }
        ArrayList<Ck> arrayList = this.f۱۱۲۶۸f;
        arrayList.add(m۱۳۸۲۸a(arrayList, ordering), item);
        m۱۳۸۶۱b(true);
        return item;
    }

    /* renamed from: a  reason: contains not printable characters */
    private Ck m۱۳۸۲۹a(int group, int id, int categoryOrder, int ordering, CharSequence title, int defaultShowAsAction) {
        return new Ck(this, group, id, categoryOrder, ordering, title, defaultShowAsAction);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence title) {
        return m۱۳۸۴۴a(0, 0, 0, title);
    }

    @Override // android.view.Menu
    public MenuItem add(int titleRes) {
        return m۱۳۸۴۴a(0, 0, 0, this.f۱۱۲۶۴b.getString(titleRes));
    }

    @Override // android.view.Menu
    public MenuItem add(int group, int id, int categoryOrder, CharSequence title) {
        return m۱۳۸۴۴a(group, id, categoryOrder, title);
    }

    @Override // android.view.Menu
    public MenuItem add(int group, int id, int categoryOrder, int title) {
        return m۱۳۸۴۴a(group, id, categoryOrder, this.f۱۱۲۶۴b.getString(title));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence title) {
        return addSubMenu(0, 0, 0, title);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int titleRes) {
        return addSubMenu(0, 0, 0, this.f۱۱۲۶۴b.getString(titleRes));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int group, int id, int categoryOrder, CharSequence title) {
        Ck item = (Ck) m۱۳۸۴۴a(group, id, categoryOrder, title);
        SubMenuCv subMenu = new SubMenuCv(this.f۱۱۲۶۳a, this, item);
        item.m۱۳۹۰۰a(subMenu);
        return subMenu;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int group, int id, int categoryOrder, int title) {
        return addSubMenu(group, id, categoryOrder, this.f۱۱۲۶۴b.getString(title));
    }

    public void setGroupDividerEnabled(boolean enabled) {
        this.f۱۱۲۸۷y = enabled;
    }

    /* renamed from: o  reason: contains not printable characters */
    public boolean m۱۳۸۸۳o() {
        return this.f۱۱۲۸۷y;
    }

    public int addIntentOptions(int group, int id, int categoryOrder, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems) {
        int i;
        PackageManager pm = this.f۱۱۲۶۳a.getPackageManager();
        int N = 0;
        List<ResolveInfo> lri = pm.queryIntentActivityOptions(caller, specifics, intent, 0);
        if (lri != null) {
            N = lri.size();
        }
        if ((flags & 1) == 0) {
            removeGroup(group);
        }
        for (int i2 = 0; i2 < N; i2++) {
            ResolveInfo ri = lri.get(i2);
            int i3 = ri.specificIndex;
            Intent rintent = new Intent(i3 < 0 ? intent : specifics[i3]);
            rintent.setComponent(new ComponentName(ri.activityInfo.applicationInfo.packageName, ri.activityInfo.name));
            MenuItem item = add(group, id, categoryOrder, ri.loadLabel(pm)).setIcon(ri.loadIcon(pm)).setIntent(rintent);
            if (outSpecificItems != null && (i = ri.specificIndex) >= 0) {
                outSpecificItems[i] = item;
            }
        }
        return N;
    }

    public void removeItem(int id) {
        m۱۳۸۳۱a(m۱۳۸۵۷b(id), true);
    }

    public void removeGroup(int group) {
        int i = m۱۳۸۳۸a(group);
        if (i >= 0) {
            int maxRemovable = this.f۱۱۲۶۸f.size() - i;
            int numRemoved = 0;
            while (true) {
                int numRemoved2 = numRemoved + 1;
                if (numRemoved >= maxRemovable || this.f۱۱۲۶۸f.get(i).getGroupId() != group) {
                    m۱۳۸۶۱b(true);
                } else {
                    m۱۳۸۳۱a(i, false);
                    numRemoved = numRemoved2;
                }
            }
            m۱۳۸۶۱b(true);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۸۳۱a(int index, boolean updateChildrenOnMenuViews) {
        if (index >= 0 && index < this.f۱۱۲۶۸f.size()) {
            this.f۱۱۲۶۸f.remove(index);
            if (updateChildrenOnMenuViews) {
                m۱۳۸۶۱b(true);
            }
        }
    }

    public void clear() {
        Ck kVar = this.f۱۱۲۸۶x;
        if (kVar != null) {
            m۱۳۸۵۴a(kVar);
        }
        this.f۱۱۲۶۸f.clear();
        m۱۳۸۶۱b(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۵۰a(MenuItem item) {
        int group = item.getGroupId();
        int N = this.f۱۱۲۶۸f.size();
        m۱۳۸۸۷s();
        for (int i = 0; i < N; i++) {
            Ck curItem = this.f۱۱۲۶۸f.get(i);
            if (curItem.getGroupId() == group && curItem.m۱۳۹۱۴i() && curItem.isCheckable()) {
                curItem.m۱۳۹۰۴b(curItem == item);
            }
        }
        m۱۳۸۸۶r();
    }

    public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {
        int N = this.f۱۱۲۶۸f.size();
        for (int i = 0; i < N; i++) {
            Ck item = this.f۱۱۲۶۸f.get(i);
            if (item.getGroupId() == group) {
                item.m۱۳۹۰۶c(exclusive);
                item.setCheckable(checkable);
            }
        }
    }

    public void setGroupVisible(int group, boolean visible) {
        int N = this.f۱۱۲۶۸f.size();
        boolean changedAtLeastOneItem = false;
        for (int i = 0; i < N; i++) {
            Ck item = this.f۱۱۲۶۸f.get(i);
            if (item.getGroupId() == group && item.m۱۳۹۱۰e(visible)) {
                changedAtLeastOneItem = true;
            }
        }
        if (changedAtLeastOneItem) {
            m۱۳۸۶۱b(true);
        }
    }

    public void setGroupEnabled(int group, boolean enabled) {
        int N = this.f۱۱۲۶۸f.size();
        for (int i = 0; i < N; i++) {
            Ck item = this.f۱۱۲۶۸f.get(i);
            if (item.getGroupId() == group) {
                item.setEnabled(enabled);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.f۱۱۲۸۸z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f۱۱۲۶۸f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int id) {
        MenuItem possibleItem;
        int size = size();
        for (int i = 0; i < size; i++) {
            Ck item = this.f۱۱۲۶۸f.get(i);
            if (item.getItemId() == id) {
                return item;
            }
            if (item.hasSubMenu() && (possibleItem = item.getSubMenu().findItem(id)) != null) {
                return possibleItem;
            }
        }
        return null;
    }

    /* renamed from: b  reason: contains not printable characters */
    public int m۱۳۸۵۷b(int id) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f۱۱۲۶۸f.get(i).getItemId() == id) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۳۸۳۸a(int group) {
        return m۱۳۸۳۹a(group, 0);
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۳۸۳۹a(int group, int start) {
        int size = size();
        if (start < 0) {
            start = 0;
        }
        for (int i = start; i < size; i++) {
            if (this.f۱۱۲۶۸f.get(i).getGroupId() == group) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return this.f۱۱۲۶۸f.size();
    }

    public MenuItem getItem(int index) {
        return this.f۱۱۲۶۸f.get(index);
    }

    public boolean isShortcutKey(int keyCode, KeyEvent event) {
        return m۱۳۸۴۳a(keyCode, event) != null;
    }

    public void setQwertyMode(boolean isQwerty) {
        this.f۱۱۲۶۵c = isQwerty;
        m۱۳۸۶۱b(false);
    }

    /* renamed from: f  reason: contains not printable characters */
    private static int m۱۳۸۳۶f(int categoryOrder) {
        int index = (-65536 & categoryOrder) >> 16;
        if (index >= 0) {
            int[] iArr = f۱۱۲۶۲A;
            if (index < iArr.length) {
                return (iArr[index] << 16) | (65535 & categoryOrder);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p  reason: contains not printable characters */
    public boolean m۱۳۸۸۴p() {
        return this.f۱۱۲۶۵c;
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۳۸۳۵e(boolean shortcutsVisible) {
        boolean z = true;
        if (!shortcutsVisible || this.f۱۱۲۶۴b.getConfiguration().keyboard == 1 || !Cv.m۱۳۰۴۲d(ViewConfiguration.get(this.f۱۱۲۶۳a), this.f۱۱۲۶۳a)) {
            z = false;
        }
        this.f۱۱۲۶۶d = z;
    }

    /* renamed from: q  reason: contains not printable characters */
    public boolean m۱۳۸۸۵q() {
        return this.f۱۱۲۶۶d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l  reason: contains not printable characters */
    public Resources m۱۳۸۸۰l() {
        return this.f۱۱۲۶۴b;
    }

    /* renamed from: e  reason: contains not printable characters */
    public Context m۱۳۸۷۲e() {
        return this.f۱۱۲۶۳a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۸۵۳a(Ch menu, MenuItem item) {
        AbstractCa aVar = this.f۱۱۲۶۷e;
        return aVar != null && aVar.m۱۳۸۸۹a(menu, item);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۴۵a() {
        AbstractCa aVar = this.f۱۱۲۶۷e;
        if (aVar != null) {
            aVar.m۱۳۸۸۸a(this);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۳۸۲۸a(ArrayList<Ck> arrayList, int ordering) {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            if (arrayList.get(i).m۱۳۹۰۵c() <= ordering) {
                return i + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
        Ck item = m۱۳۸۴۳a(keyCode, event);
        boolean handled = false;
        if (item != null) {
            handled = m۱۳۸۵۵a(item, flags);
        }
        if ((flags & 2) != 0) {
            m۱۳۸۵۲a(true);
        }
        return handled;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۵۱a(List<Ck> list, int keyCode, KeyEvent event) {
        boolean qwerty = m۱۳۸۸۴p();
        int modifierState = event.getModifiers();
        KeyCharacterMap.KeyData possibleChars = new KeyCharacterMap.KeyData();
        if (event.getKeyData(possibleChars) || keyCode == 67) {
            int N = this.f۱۱۲۶۸f.size();
            for (int i = 0; i < N; i++) {
                Ck item = this.f۱۱۲۶۸f.get(i);
                if (item.hasSubMenu()) {
                    ((Ch) item.getSubMenu()).m۱۳۸۵۱a(list, keyCode, event);
                }
                char shortcutChar = qwerty ? item.getAlphabeticShortcut() : item.getNumericShortcut();
                if (((modifierState & 69647) == (69647 & (qwerty ? item.getAlphabeticModifiers() : item.getNumericModifiers()))) && shortcutChar != 0) {
                    char[] cArr = possibleChars.meta;
                    if (shortcutChar != cArr[0] && shortcutChar != cArr[2]) {
                        if (qwerty && shortcutChar == '\b') {
                            if (keyCode != 67) {
                            }
                        }
                    }
                    if (item.isEnabled()) {
                        list.add(item);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Ck m۱۳۸۴۳a(int keyCode, KeyEvent event) {
        char shortcutChar;
        ArrayList<MenuItemImpl> items = this.f۱۱۲۸۴v;
        items.clear();
        m۱۳۸۵۱a(items, keyCode, event);
        if (items.isEmpty()) {
            return null;
        }
        int metaState = event.getMetaState();
        KeyCharacterMap.KeyData possibleChars = new KeyCharacterMap.KeyData();
        event.getKeyData(possibleChars);
        int size = items.size();
        if (size == 1) {
            return (Ck) items.get(0);
        }
        boolean qwerty = m۱۳۸۸۴p();
        for (int i = 0; i < size; i++) {
            Ck item = (Ck) items.get(i);
            if (qwerty) {
                shortcutChar = item.getAlphabeticShortcut();
            } else {
                shortcutChar = item.getNumericShortcut();
            }
            if ((shortcutChar == possibleChars.meta[0] && (metaState & 2) == 0) || ((shortcutChar == possibleChars.meta[2] && (metaState & 2) != 0) || (qwerty && shortcutChar == '\b' && keyCode == 67))) {
                return item;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int id, int flags) {
        return m۱۳۸۵۵a(findItem(id), flags);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۸۵۵a(MenuItem item, int flags) {
        return m۱۳۸۵۶a(item, (AbstractCp) null, flags);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۸۵۶a(MenuItem item, AbstractCp preferredPresenter, int flags) {
        Ck itemImpl = (Ck) item;
        if (itemImpl == null || !itemImpl.isEnabled()) {
            return false;
        }
        boolean invoked = itemImpl.m۱۳۹۱۲g();
        AbstractCc provider = itemImpl.m۱۳۸۹۸a();
        boolean providerHasSubMenu = provider != null && provider.m۱۲۸۰۹a();
        if (itemImpl.m۱۳۹۱۱f()) {
            invoked |= itemImpl.expandActionView();
            if (invoked) {
                m۱۳۸۵۲a(true);
            }
        } else if (itemImpl.hasSubMenu() || providerHasSubMenu) {
            if ((flags & 4) == 0) {
                m۱۳۸۵۲a(false);
            }
            if (!itemImpl.hasSubMenu()) {
                itemImpl.m۱۳۹۰۰a(new SubMenuCv(m۱۳۸۷۲e(), this, itemImpl));
            }
            SubMenuCv subMenu = (SubMenuCv) itemImpl.getSubMenu();
            if (providerHasSubMenu) {
                provider.m۱۲۸۰۸a(subMenu);
            }
            invoked |= m۱۳۸۳۲a(subMenu, preferredPresenter);
            if (!invoked) {
                m۱۳۸۵۲a(true);
            }
        } else if ((flags & 1) == 0) {
            m۱۳۸۵۲a(true);
        }
        return invoked;
    }

    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۳۸۵۲a(boolean closeAllMenus) {
        if (!this.f۱۱۲۸۳u) {
            this.f۱۱۲۸۳u = true;
            Iterator<WeakReference<AbstractCp>> it = this.f۱۱۲۸۵w.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                AbstractCp presenter = (AbstractCp) ref.get();
                if (presenter == null) {
                    this.f۱۱۲۸۵w.remove(ref);
                } else {
                    presenter.m۱۳۹۶۹a(this, closeAllMenus);
                }
            }
            this.f۱۱۲۸۳u = false;
        }
    }

    public void close() {
        m۱۳۸۵۲a(true);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۸۶۱b(boolean structureChanged) {
        if (!this.f۱۱۲۷۹q) {
            if (structureChanged) {
                this.f۱۱۲۷۰h = true;
                this.f۱۱۲۷۳k = true;
            }
            m۱۳۸۳۳d(structureChanged);
            return;
        }
        this.f۱۱۲۸۰r = true;
        if (structureChanged) {
            this.f۱۱۲۸۱s = true;
        }
    }

    /* renamed from: s  reason: contains not printable characters */
    public void m۱۳۸۸۷s() {
        if (!this.f۱۱۲۷۹q) {
            this.f۱۱۲۷۹q = true;
            this.f۱۱۲۸۰r = false;
            this.f۱۱۲۸۱s = false;
        }
    }

    /* renamed from: r  reason: contains not printable characters */
    public void m۱۳۸۸۶r() {
        this.f۱۱۲۷۹q = false;
        if (this.f۱۱۲۸۰r) {
            this.f۱۱۲۸۰r = false;
            m۱۳۸۶۱b(this.f۱۱۲۸۱s);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۳۸۷۱d(Ck item) {
        this.f۱۱۲۷۰h = true;
        m۱۳۸۶۱b(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۸۶۶c(Ck item) {
        this.f۱۱۲۷۳k = true;
        m۱۳۸۶۱b(true);
    }

    /* renamed from: n  reason: contains not printable characters */
    public ArrayList<Ck> m۱۳۸۸۲n() {
        if (!this.f۱۱۲۷۰h) {
            return this.f۱۱۲۶۹g;
        }
        this.f۱۱۲۶۹g.clear();
        int itemsSize = this.f۱۱۲۶۸f.size();
        for (int i = 0; i < itemsSize; i++) {
            Ck item = this.f۱۱۲۶۸f.get(i);
            if (item.isVisible()) {
                this.f۱۱۲۶۹g.add(item);
            }
        }
        this.f۱۱۲۷۰h = false;
        this.f۱۱۲۷۳k = true;
        return this.f۱۱۲۶۹g;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۸۵۸b() {
        ArrayList<MenuItemImpl> visibleItems = m۱۳۸۸۲n();
        if (this.f۱۱۲۷۳k) {
            boolean flagged = false;
            Iterator<WeakReference<AbstractCp>> it = this.f۱۱۲۸۵w.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                AbstractCp presenter = (AbstractCp) ref.get();
                if (presenter == null) {
                    this.f۱۱۲۸۵w.remove(ref);
                } else {
                    flagged |= presenter.m۱۳۹۷۴b();
                }
            }
            if (flagged) {
                this.f۱۱۲۷۱i.clear();
                this.f۱۱۲۷۲j.clear();
                int itemsSize = visibleItems.size();
                for (int i = 0; i < itemsSize; i++) {
                    Ck item = (Ck) visibleItems.get(i);
                    if (item.m۱۳۹۱۳h()) {
                        this.f۱۱۲۷۱i.add(item);
                    } else {
                        this.f۱۱۲۷۲j.add(item);
                    }
                }
            } else {
                this.f۱۱۲۷۱i.clear();
                this.f۱۱۲۷۲j.clear();
                this.f۱۱۲۷۲j.addAll(m۱۳۸۸۲n());
            }
            this.f۱۱۲۷۳k = false;
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public ArrayList<Ck> m۱۳۸۶۴c() {
        m۱۳۸۵۸b();
        return this.f۱۱۲۷۱i;
    }

    /* renamed from: j  reason: contains not printable characters */
    public ArrayList<Ck> m۱۳۸۷۸j() {
        m۱۳۸۵۸b();
        return this.f۱۱۲۷۲j;
    }

    public void clearHeader() {
        this.f۱۱۲۷۷o = null;
        this.f۱۱۲۷۶n = null;
        this.f۱۱۲۷۸p = null;
        m۱۳۸۶۱b(false);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۸۳۰a(int titleRes, CharSequence title, int iconRes, Drawable icon, View view) {
        Resources r = m۱۳۸۸۰l();
        if (view != null) {
            this.f۱۱۲۷۸p = view;
            this.f۱۱۲۷۶n = null;
            this.f۱۱۲۷۷o = null;
        } else {
            if (titleRes > 0) {
                this.f۱۱۲۷۶n = r.getText(titleRes);
            } else if (title != null) {
                this.f۱۱۲۷۶n = title;
            }
            if (iconRes > 0) {
                this.f۱۱۲۷۷o = Ca.m۱۲۶۲۶c(m۱۳۸۷۲e(), iconRes);
            } else if (icon != null) {
                this.f۱۱۲۷۷o = icon;
            }
            this.f۱۱۲۷۸p = null;
        }
        m۱۳۸۶۱b(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public Ch m۱۳۸۴۲a(CharSequence title) {
        m۱۳۸۳۰a(0, title, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e  reason: contains not printable characters */
    public Ch m۱۳۸۷۳e(int titleRes) {
        m۱۳۸۳۰a(titleRes, null, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public Ch m۱۳۸۴۰a(Drawable icon) {
        m۱۳۸۳۰a(0, null, 0, icon, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d  reason: contains not printable characters */
    public Ch m۱۳۸۶۸d(int iconRes) {
        m۱۳۸۳۰a(0, null, iconRes, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public Ch m۱۳۸۴۱a(View view) {
        m۱۳۸۳۰a(0, null, 0, null, view);
        return this;
    }

    /* renamed from: h  reason: contains not printable characters */
    public CharSequence m۱۳۸۷۶h() {
        return this.f۱۱۲۷۶n;
    }

    /* renamed from: g  reason: contains not printable characters */
    public Drawable m۱۳۸۷۵g() {
        return this.f۱۱۲۷۷o;
    }

    /* renamed from: i  reason: contains not printable characters */
    public View m۱۳۸۷۷i() {
        return this.f۱۱۲۷۸p;
    }

    /* renamed from: m  reason: contains not printable characters */
    public Ch m۱۳۸۸۱m() {
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k  reason: contains not printable characters */
    public boolean m۱۳۸۷۹k() {
        return this.f۱۱۲۸۲t;
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۸۶۲b(Ck item) {
        if (this.f۱۱۲۸۵w.isEmpty()) {
            return false;
        }
        boolean expanded = false;
        m۱۳۸۸۷s();
        Iterator<WeakReference<AbstractCp>> it = this.f۱۱۲۸۵w.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            AbstractCp presenter = (AbstractCp) ref.get();
            if (presenter == null) {
                this.f۱۱۲۸۵w.remove(ref);
            } else {
                boolean b = presenter.m۱۳۹۷۵b(this, item);
                expanded = b;
                if (b) {
                    break;
                }
            }
        }
        m۱۳۸۸۶r();
        if (expanded) {
            this.f۱۱۲۸۶x = item;
        }
        return expanded;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۸۵۴a(Ck item) {
        if (this.f۱۱۲۸۵w.isEmpty() || this.f۱۱۲۸۶x != item) {
            return false;
        }
        boolean collapsed = false;
        m۱۳۸۸۷s();
        Iterator<WeakReference<AbstractCp>> it = this.f۱۱۲۸۵w.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            AbstractCp presenter = (AbstractCp) ref.get();
            if (presenter == null) {
                this.f۱۱۲۸۵w.remove(ref);
            } else {
                boolean a = presenter.m۱۳۹۷۲a(this, item);
                collapsed = a;
                if (a) {
                    break;
                }
            }
        }
        m۱۳۸۸۶r();
        if (collapsed) {
            this.f۱۱۲۸۶x = null;
        }
        return collapsed;
    }

    /* renamed from: f  reason: contains not printable characters */
    public Ck m۱۳۸۷۴f() {
        return this.f۱۱۲۸۶x;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۸۶۷c(boolean override) {
        this.f۱۱۲۸۸z = override;
    }
}
