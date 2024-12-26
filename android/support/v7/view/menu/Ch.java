package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.content.Ca;
import android.support.v4.view.AbstractCc;
import android.support.v4.view.Cv;
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
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuCa;

/* renamed from: android.support.v7.view.menu.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ch implements InterfaceMenuCa {

    /* renamed from: A, reason: contains not printable characters */
    private static final int[] f۱۱۲۶۲A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: contains not printable characters */
    private final Context f۱۱۲۶۳a;

    /* renamed from: b, reason: contains not printable characters */
    private final Resources f۱۱۲۶۴b;

    /* renamed from: c, reason: contains not printable characters */
    private boolean f۱۱۲۶۵c;

    /* renamed from: d, reason: contains not printable characters */
    private boolean f۱۱۲۶۶d;

    /* renamed from: e, reason: contains not printable characters */
    private a f۱۱۲۶۷e;

    /* renamed from: m, reason: contains not printable characters */
    private ContextMenu.ContextMenuInfo f۱۱۲۷۵m;

    /* renamed from: n, reason: contains not printable characters */
    CharSequence f۱۱۲۷۶n;

    /* renamed from: o, reason: contains not printable characters */
    Drawable f۱۱۲۷۷o;

    /* renamed from: p, reason: contains not printable characters */
    View f۱۱۲۷۸p;

    /* renamed from: x, reason: contains not printable characters */
    private Ck f۱۱۲۸۶x;

    /* renamed from: z, reason: contains not printable characters */
    private boolean f۱۱۲۸۸z;

    /* renamed from: l, reason: contains not printable characters */
    private int f۱۱۲۷۴l = 0;

    /* renamed from: q, reason: contains not printable characters */
    private boolean f۱۱۲۷۹q = false;

    /* renamed from: r, reason: contains not printable characters */
    private boolean f۱۱۲۸۰r = false;

    /* renamed from: s, reason: contains not printable characters */
    private boolean f۱۱۲۸۱s = false;

    /* renamed from: t, reason: contains not printable characters */
    private boolean f۱۱۲۸۲t = false;

    /* renamed from: u, reason: contains not printable characters */
    private boolean f۱۱۲۸۳u = false;

    /* renamed from: v, reason: contains not printable characters */
    private ArrayList<Ck> f۱۱۲۸۴v = new ArrayList<>();

    /* renamed from: w, reason: contains not printable characters */
    private CopyOnWriteArrayList<WeakReference<InterfaceCp>> f۱۱۲۸۵w = new CopyOnWriteArrayList<>();

    /* renamed from: y, reason: contains not printable characters */
    private boolean f۱۱۲۸۷y = false;

    /* renamed from: f, reason: contains not printable characters */
    private ArrayList<Ck> f۱۱۲۶۸f = new ArrayList<>();

    /* renamed from: g, reason: contains not printable characters */
    private ArrayList<Ck> f۱۱۲۶۹g = new ArrayList<>();

    /* renamed from: h, reason: contains not printable characters */
    private boolean f۱۱۲۷۰h = true;

    /* renamed from: i, reason: contains not printable characters */
    private ArrayList<Ck> f۱۱۲۷۱i = new ArrayList<>();

    /* renamed from: j, reason: contains not printable characters */
    private ArrayList<Ck> f۱۱۲۷۲j = new ArrayList<>();

    /* renamed from: k, reason: contains not printable characters */
    private boolean f۱۱۲۷۳k = true;

    /* renamed from: android.support.v7.view.menu.h$a */
    public interface a {
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۳۵۶۵a(Ch ch);

        /* renamed from: a, reason: contains not printable characters */
        boolean mo۱۳۵۶۶a(Ch ch, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.h$b */
    public interface b {
        /* renamed from: a, reason: contains not printable characters */
        boolean mo۱۱۹۸۶a(Ck ck);
    }

    public Ch(Context context) {
        this.f۱۱۲۶۳a = context;
        this.f۱۱۲۶۴b = context.getResources();
        m۱۱۷۶۵e(true);
    }

    /* renamed from: c, reason: contains not printable characters */
    public Ch m۱۱۷۹۳c(int defaultShowAsAction) {
        this.f۱۱۲۷۴l = defaultShowAsAction;
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۷۷۸a(InterfaceCp presenter) {
        m۱۱۷۷۹a(presenter, this.f۱۱۲۶۳a);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۷۷۹a(InterfaceCp presenter, Context menuContext) {
        this.f۱۱۲۸۵w.add(new WeakReference<>(presenter));
        presenter.mo۱۲۹۴۵a(menuContext, this);
        this.f۱۱۲۷۳k = true;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۱۷۹۰b(InterfaceCp presenter) {
        Iterator<WeakReference<InterfaceCp>> it = this.f۱۱۲۸۵w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceCp> next = it.next();
            InterfaceCp item = next.get();
            if (item == null || item == presenter) {
                this.f۱۱۲۸۵w.remove(next);
            }
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۱۱۷۶۳d(boolean cleared) {
        if (this.f۱۱۲۸۵w.isEmpty()) {
            return;
        }
        m۱۱۸۱۷s();
        Iterator<WeakReference<InterfaceCp>> it = this.f۱۱۲۸۵w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceCp> next = it.next();
            InterfaceCp presenter = next.get();
            if (presenter == null) {
                this.f۱۱۲۸۵w.remove(next);
            } else {
                presenter.mo۱۲۹۵۲a(cleared);
            }
        }
        m۱۱۸۱۶r();
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۱۷۶۲a(SubMenuCv subMenu, InterfaceCp preferredPresenter) {
        if (this.f۱۱۲۸۵w.isEmpty()) {
            return false;
        }
        boolean result = false;
        if (preferredPresenter != null) {
            result = preferredPresenter.mo۱۲۹۵۴a(subMenu);
        }
        Iterator<WeakReference<InterfaceCp>> it = this.f۱۱۲۸۵w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceCp> next = it.next();
            InterfaceCp presenter = next.get();
            if (presenter == null) {
                this.f۱۱۲۸۵w.remove(next);
            } else if (!result) {
                result = presenter.mo۱۲۹۵۴a(subMenu);
            }
        }
        return result;
    }

    /* renamed from: f, reason: contains not printable characters */
    private void m۱۱۷۶۷f(Bundle outState) {
        Parcelable state;
        if (this.f۱۱۲۸۵w.isEmpty()) {
            return;
        }
        SparseArray<Parcelable> presenterStates = new SparseArray<>();
        Iterator<WeakReference<InterfaceCp>> it = this.f۱۱۲۸۵w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceCp> next = it.next();
            InterfaceCp presenter = next.get();
            if (presenter == null) {
                this.f۱۱۲۸۵w.remove(next);
            } else {
                int id = presenter.mo۱۲۸۷۷a();
                if (id > 0 && (state = presenter.mo۱۲۹۵۹c()) != null) {
                    presenterStates.put(id, state);
                }
            }
        }
        outState.putSparseParcelableArray("android:menu:presenters", presenterStates);
    }

    /* renamed from: e, reason: contains not printable characters */
    private void m۱۱۷۶۴e(Bundle state) {
        Parcelable parcel;
        SparseArray<Parcelable> presenterStates = state.getSparseParcelableArray("android:menu:presenters");
        if (presenterStates == null || this.f۱۱۲۸۵w.isEmpty()) {
            return;
        }
        Iterator<WeakReference<InterfaceCp>> it = this.f۱۱۲۸۵w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceCp> next = it.next();
            InterfaceCp presenter = next.get();
            if (presenter == null) {
                this.f۱۱۲۸۵w.remove(next);
            } else {
                int id = presenter.mo۱۲۸۷۷a();
                if (id > 0 && (parcel = presenterStates.get(id)) != null) {
                    presenter.mo۱۲۹۴۸a(parcel);
                }
            }
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۱۱۸۰۰d(Bundle outState) {
        m۱۱۷۶۷f(outState);
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۱۷۸۹b(Bundle state) {
        m۱۱۷۶۴e(state);
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۱۷۹۵c(Bundle outStates) {
        SparseArray<Parcelable> viewStates = null;
        int itemCount = size();
        for (int i = 0; i < itemCount; i++) {
            MenuItem item = getItem(i);
            View v = item.getActionView();
            if (v != null && v.getId() != -1) {
                if (viewStates == null) {
                    viewStates = new SparseArray<>();
                }
                v.saveHierarchyState(viewStates);
                if (item.isActionViewExpanded()) {
                    outStates.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                SubMenuCv subMenu = (SubMenuCv) item.getSubMenu();
                subMenu.m۱۱۷۹۵c(outStates);
            }
        }
        if (viewStates != null) {
            outStates.putSparseParcelableArray(mo۱۱۹۴۱d(), viewStates);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۷۷۶a(Bundle states) {
        MenuItem itemToExpand;
        if (states == null) {
            return;
        }
        SparseArray<Parcelable> viewStates = states.getSparseParcelableArray(mo۱۱۹۴۱d());
        int itemCount = size();
        for (int i = 0; i < itemCount; i++) {
            MenuItem item = getItem(i);
            View v = item.getActionView();
            if (v != null && v.getId() != -1) {
                v.restoreHierarchyState(viewStates);
            }
            if (item.hasSubMenu()) {
                SubMenuCv subMenu = (SubMenuCv) item.getSubMenu();
                subMenu.m۱۱۷۷۶a(states);
            }
        }
        int expandedId = states.getInt("android:menu:expandedactionview");
        if (expandedId > 0 && (itemToExpand = findItem(expandedId)) != null) {
            itemToExpand.expandActionView();
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    protected String mo۱۱۹۴۱d() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۹۳۷a(a cb) {
        this.f۱۱۲۶۷e = cb;
    }

    /* renamed from: a, reason: contains not printable characters */
    protected MenuItem m۱۱۷۷۴a(int group, int id, int categoryOrder, CharSequence title) {
        int ordering = m۱۱۷۶۶f(categoryOrder);
        Ck item = m۱۱۷۵۹a(group, id, categoryOrder, ordering, title, this.f۱۱۲۷۴l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f۱۱۲۷۵m;
        if (contextMenuInfo != null) {
            item.m۱۱۸۳۱a(contextMenuInfo);
        }
        ArrayList<Ck> arrayList = this.f۱۱۲۶۸f;
        arrayList.add(m۱۱۷۵۸a(arrayList, ordering), item);
        mo۱۱۷۹۱b(true);
        return item;
    }

    /* renamed from: a, reason: contains not printable characters */
    private Ck m۱۱۷۵۹a(int group, int id, int categoryOrder, int ordering, CharSequence title, int defaultShowAsAction) {
        return new Ck(this, group, id, categoryOrder, ordering, title, defaultShowAsAction);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence title) {
        return m۱۱۷۷۴a(0, 0, 0, title);
    }

    @Override // android.view.Menu
    public MenuItem add(int titleRes) {
        return m۱۱۷۷۴a(0, 0, 0, this.f۱۱۲۶۴b.getString(titleRes));
    }

    @Override // android.view.Menu
    public MenuItem add(int group, int id, int categoryOrder, CharSequence title) {
        return m۱۱۷۷۴a(group, id, categoryOrder, title);
    }

    @Override // android.view.Menu
    public MenuItem add(int group, int id, int categoryOrder, int title) {
        return m۱۱۷۷۴a(group, id, categoryOrder, this.f۱۱۲۶۴b.getString(title));
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
        Ck item = (Ck) m۱۱۷۷۴a(group, id, categoryOrder, title);
        SubMenuCv subMenu = new SubMenuCv(this.f۱۱۲۶۳a, this, item);
        item.m۱۱۸۳۰a(subMenu);
        return subMenu;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int group, int id, int categoryOrder, int title) {
        return addSubMenu(group, id, categoryOrder, this.f۱۱۲۶۴b.getString(title));
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean enabled) {
        this.f۱۱۲۸۷y = enabled;
    }

    /* renamed from: o, reason: contains not printable characters */
    public boolean mo۱۱۹۴۳o() {
        return this.f۱۱۲۸۷y;
    }

    @Override // android.view.Menu
    public int addIntentOptions(int group, int id, int categoryOrder, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems) {
        int i;
        PackageManager pm = this.f۱۱۲۶۳a.getPackageManager();
        List<ResolveInfo> lri = pm.queryIntentActivityOptions(caller, specifics, intent, 0);
        int N = lri != null ? lri.size() : 0;
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

    @Override // android.view.Menu
    public void removeItem(int id) {
        m۱۱۷۶۱a(m۱۱۷۸۷b(id), true);
    }

    @Override // android.view.Menu
    public void removeGroup(int group) {
        int i = m۱۱۷۶۸a(group);
        if (i >= 0) {
            int maxRemovable = this.f۱۱۲۶۸f.size() - i;
            int numRemoved = 0;
            while (true) {
                int numRemoved2 = numRemoved + 1;
                if (numRemoved >= maxRemovable || this.f۱۱۲۶۸f.get(i).getGroupId() != group) {
                    break;
                }
                m۱۱۷۶۱a(i, false);
                numRemoved = numRemoved2;
            }
            mo۱۱۷۹۱b(true);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۱۷۶۱a(int index, boolean updateChildrenOnMenuViews) {
        if (index < 0 || index >= this.f۱۱۲۶۸f.size()) {
            return;
        }
        this.f۱۱۲۶۸f.remove(index);
        if (updateChildrenOnMenuViews) {
            mo۱۱۷۹۱b(true);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        Ck ck = this.f۱۱۲۸۶x;
        if (ck != null) {
            mo۱۱۹۳۹a(ck);
        }
        this.f۱۱۲۶۸f.clear();
        mo۱۱۷۹۱b(true);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۱۷۸۰a(MenuItem item) {
        int group = item.getGroupId();
        int N = this.f۱۱۲۶۸f.size();
        m۱۱۸۱۷s();
        for (int i = 0; i < N; i++) {
            Ck curItem = this.f۱۱۲۶۸f.get(i);
            if (curItem.getGroupId() == group && curItem.m۱۱۸۴۴i() && curItem.isCheckable()) {
                curItem.m۱۱۸۳۴b(curItem == item);
            }
        }
        m۱۱۸۱۶r();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {
        int N = this.f۱۱۲۶۸f.size();
        for (int i = 0; i < N; i++) {
            Ck item = this.f۱۱۲۶۸f.get(i);
            if (item.getGroupId() == group) {
                item.m۱۱۸۳۶c(exclusive);
                item.setCheckable(checkable);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int group, boolean visible) {
        int N = this.f۱۱۲۶۸f.size();
        boolean changedAtLeastOneItem = false;
        for (int i = 0; i < N; i++) {
            Ck item = this.f۱۱۲۶۸f.get(i);
            if (item.getGroupId() == group && item.m۱۱۸۴۰e(visible)) {
                changedAtLeastOneItem = true;
            }
        }
        if (changedAtLeastOneItem) {
            mo۱۱۷۹۱b(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int group, boolean enabled) {
        int N = this.f۱۱۲۶۸f.size();
        for (int i = 0; i < N; i++) {
            Ck item = this.f۱۱۲۶۸f.get(i);
            if (item.getGroupId() == group) {
                item.setEnabled(enabled);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f۱۱۲۸۸z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            Ck item = this.f۱۱۲۶۸f.get(i);
            if (item.isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
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

    /* renamed from: b, reason: contains not printable characters */
    public int m۱۱۷۸۷b(int id) {
        int size = size();
        for (int i = 0; i < size; i++) {
            Ck item = this.f۱۱۲۶۸f.get(i);
            if (item.getItemId() == id) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۱۱۷۶۸a(int group) {
        return m۱۱۷۶۹a(group, 0);
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۱۱۷۶۹a(int group, int start) {
        int size = size();
        if (start < 0) {
            start = 0;
        }
        for (int i = start; i < size; i++) {
            Ck item = this.f۱۱۲۶۸f.get(i);
            if (item.getGroupId() == group) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public int size() {
        return this.f۱۱۲۶۸f.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int index) {
        return this.f۱۱۲۶۸f.get(index);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int keyCode, KeyEvent event) {
        return m۱۱۷۷۳a(keyCode, event) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean isQwerty) {
        this.f۱۱۲۶۵c = isQwerty;
        mo۱۱۷۹۱b(false);
    }

    /* renamed from: f, reason: contains not printable characters */
    private static int m۱۱۷۶۶f(int categoryOrder) {
        int index = ((-65536) & categoryOrder) >> 16;
        if (index >= 0) {
            int[] iArr = f۱۱۲۶۲A;
            if (index < iArr.length) {
                return (iArr[index] << 16) | (65535 & categoryOrder);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: p, reason: contains not printable characters */
    boolean mo۱۱۹۴۴p() {
        return this.f۱۱۲۶۵c;
    }

    /* renamed from: e, reason: contains not printable characters */
    private void m۱۱۷۶۵e(boolean shortcutsVisible) {
        this.f۱۱۲۶۶d = shortcutsVisible && this.f۱۱۲۶۴b.getConfiguration().keyboard != 1 && Cv.m۱۰۹۷۲d(ViewConfiguration.get(this.f۱۱۲۶۳a), this.f۱۱۲۶۳a);
    }

    /* renamed from: q, reason: contains not printable characters */
    public boolean mo۱۱۹۴۵q() {
        return this.f۱۱۲۶۶d;
    }

    /* renamed from: l, reason: contains not printable characters */
    Resources m۱۱۸۱۰l() {
        return this.f۱۱۲۶۴b;
    }

    /* renamed from: e, reason: contains not printable characters */
    public Context m۱۱۸۰۲e() {
        return this.f۱۱۲۶۳a;
    }

    /* renamed from: a, reason: contains not printable characters */
    boolean mo۱۱۹۳۸a(Ch menu, MenuItem item) {
        a aVar = this.f۱۱۲۶۷e;
        return aVar != null && aVar.mo۱۳۵۶۶a(menu, item);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۷۷۵a() {
        a aVar = this.f۱۱۲۶۷e;
        if (aVar != null) {
            aVar.mo۱۳۵۶۵a(this);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static int m۱۱۷۵۸a(ArrayList<Ck> arrayList, int ordering) {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            Ck item = arrayList.get(i);
            if (item.m۱۱۸۳۵c() <= ordering) {
                return i + 1;
            }
        }
        return 0;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
        Ck item = m۱۱۷۷۳a(keyCode, event);
        boolean handled = false;
        if (item != null) {
            handled = m۱۱۷۸۵a(item, flags);
        }
        if ((flags & 2) != 0) {
            m۱۱۷۸۲a(true);
        }
        return handled;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۱۷۸۱a(List<Ck> list, int keyCode, KeyEvent event) {
        boolean qwerty = mo۱۱۹۴۴p();
        int modifierState = event.getModifiers();
        KeyCharacterMap.KeyData possibleChars = new KeyCharacterMap.KeyData();
        boolean isKeyCodeMapped = event.getKeyData(possibleChars);
        if (!isKeyCodeMapped && keyCode != 67) {
            return;
        }
        int N = this.f۱۱۲۶۸f.size();
        for (int i = 0; i < N; i++) {
            Ck item = this.f۱۱۲۶۸f.get(i);
            if (item.hasSubMenu()) {
                ((Ch) item.getSubMenu()).m۱۱۷۸۱a(list, keyCode, event);
            }
            char shortcutChar = qwerty ? item.getAlphabeticShortcut() : item.getNumericShortcut();
            int shortcutModifiers = qwerty ? item.getAlphabeticModifiers() : item.getNumericModifiers();
            boolean isModifiersExactMatch = (modifierState & 69647) == (69647 & shortcutModifiers);
            if (isModifiersExactMatch && shortcutChar != 0) {
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

    /* renamed from: a, reason: contains not printable characters */
    Ck m۱۱۷۷۳a(int keyCode, KeyEvent event) {
        ArrayList<Ck> arrayList = this.f۱۱۲۸۴v;
        arrayList.clear();
        m۱۱۷۸۱a(arrayList, keyCode, event);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = event.getMetaState();
        KeyCharacterMap.KeyData possibleChars = new KeyCharacterMap.KeyData();
        event.getKeyData(possibleChars);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean qwerty = mo۱۱۹۴۴p();
        for (int i = 0; i < size; i++) {
            Ck item = arrayList.get(i);
            char shortcutChar = qwerty ? item.getAlphabeticShortcut() : item.getNumericShortcut();
            if ((shortcutChar == possibleChars.meta[0] && (metaState & 2) == 0) || ((shortcutChar == possibleChars.meta[2] && (metaState & 2) != 0) || (qwerty && shortcutChar == '\b' && keyCode == 67))) {
                return item;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int id, int flags) {
        return m۱۱۷۸۵a(findItem(id), flags);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۱۷۸۵a(MenuItem item, int flags) {
        return m۱۱۷۸۶a(item, (InterfaceCp) null, flags);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۱۷۸۶a(MenuItem item, InterfaceCp preferredPresenter, int flags) {
        Ck itemImpl = (Ck) item;
        if (itemImpl == null || !itemImpl.isEnabled()) {
            return false;
        }
        boolean invoked = itemImpl.m۱۱۸۴۲g();
        AbstractCc provider = itemImpl.mo۱۱۸۲۸a();
        boolean providerHasSubMenu = provider != null && provider.mo۱۱۸۵۳a();
        if (itemImpl.m۱۱۸۴۱f()) {
            invoked |= itemImpl.expandActionView();
            if (invoked) {
                m۱۱۷۸۲a(true);
            }
        } else if (itemImpl.hasSubMenu() || providerHasSubMenu) {
            if ((flags & 4) == 0) {
                m۱۱۷۸۲a(false);
            }
            if (!itemImpl.hasSubMenu()) {
                itemImpl.m۱۱۸۳۰a(new SubMenuCv(m۱۱۸۰۲e(), this, itemImpl));
            }
            SubMenuCv subMenu = (SubMenuCv) itemImpl.getSubMenu();
            if (providerHasSubMenu) {
                provider.mo۱۱۸۵۲a(subMenu);
            }
            invoked |= m۱۱۷۶۲a(subMenu, preferredPresenter);
            if (!invoked) {
                m۱۱۷۸۲a(true);
            }
        } else if ((flags & 1) == 0) {
            m۱۱۷۸۲a(true);
        }
        return invoked;
    }

    /* renamed from: a, reason: contains not printable characters */
    public final void m۱۱۷۸۲a(boolean closeAllMenus) {
        if (this.f۱۱۲۸۳u) {
            return;
        }
        this.f۱۱۲۸۳u = true;
        Iterator<WeakReference<InterfaceCp>> it = this.f۱۱۲۸۵w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceCp> next = it.next();
            InterfaceCp presenter = next.get();
            if (presenter == null) {
                this.f۱۱۲۸۵w.remove(next);
            } else {
                presenter.mo۱۲۹۴۹a(this, closeAllMenus);
            }
        }
        this.f۱۱۲۸۳u = false;
    }

    @Override // android.view.Menu
    public void close() {
        m۱۱۷۸۲a(true);
    }

    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۷۹۱b(boolean structureChanged) {
        if (!this.f۱۱۲۷۹q) {
            if (structureChanged) {
                this.f۱۱۲۷۰h = true;
                this.f۱۱۲۷۳k = true;
            }
            m۱۱۷۶۳d(structureChanged);
            return;
        }
        this.f۱۱۲۸۰r = true;
        if (structureChanged) {
            this.f۱۱۲۸۱s = true;
        }
    }

    /* renamed from: s, reason: contains not printable characters */
    public void m۱۱۸۱۷s() {
        if (!this.f۱۱۲۷۹q) {
            this.f۱۱۲۷۹q = true;
            this.f۱۱۲۸۰r = false;
            this.f۱۱۲۸۱s = false;
        }
    }

    /* renamed from: r, reason: contains not printable characters */
    public void m۱۱۸۱۶r() {
        this.f۱۱۲۷۹q = false;
        if (this.f۱۱۲۸۰r) {
            this.f۱۱۲۸۰r = false;
            mo۱۱۷۹۱b(this.f۱۱۲۸۱s);
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    void m۱۱۸۰۱d(Ck item) {
        this.f۱۱۲۷۰h = true;
        mo۱۱۷۹۱b(true);
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۱۱۷۹۶c(Ck item) {
        this.f۱۱۲۷۳k = true;
        mo۱۱۷۹۱b(true);
    }

    /* renamed from: n, reason: contains not printable characters */
    public ArrayList<Ck> m۱۱۸۱۲n() {
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

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۱۷۸۸b() {
        ArrayList<Ck> arrayList = m۱۱۸۱۲n();
        if (!this.f۱۱۲۷۳k) {
            return;
        }
        boolean flagged = false;
        Iterator<WeakReference<InterfaceCp>> it = this.f۱۱۲۸۵w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceCp> next = it.next();
            InterfaceCp presenter = next.get();
            if (presenter == null) {
                this.f۱۱۲۸۵w.remove(next);
            } else {
                flagged |= presenter.mo۱۲۹۵۸b();
            }
        }
        if (flagged) {
            this.f۱۱۲۷۱i.clear();
            this.f۱۱۲۷۲j.clear();
            int itemsSize = arrayList.size();
            for (int i = 0; i < itemsSize; i++) {
                Ck item = arrayList.get(i);
                if (item.m۱۱۸۴۳h()) {
                    this.f۱۱۲۷۱i.add(item);
                } else {
                    this.f۱۱۲۷۲j.add(item);
                }
            }
        } else {
            this.f۱۱۲۷۱i.clear();
            this.f۱۱۲۷۲j.clear();
            this.f۱۱۲۷۲j.addAll(m۱۱۸۱۲n());
        }
        this.f۱۱۲۷۳k = false;
    }

    /* renamed from: c, reason: contains not printable characters */
    public ArrayList<Ck> m۱۱۷۹۴c() {
        m۱۱۷۸۸b();
        return this.f۱۱۲۷۱i;
    }

    /* renamed from: j, reason: contains not printable characters */
    public ArrayList<Ck> m۱۱۸۰۸j() {
        m۱۱۷۸۸b();
        return this.f۱۱۲۷۲j;
    }

    public void clearHeader() {
        this.f۱۱۲۷۷o = null;
        this.f۱۱۲۷۶n = null;
        this.f۱۱۲۷۸p = null;
        mo۱۱۷۹۱b(false);
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۱۷۶۰a(int titleRes, CharSequence title, int iconRes, Drawable icon, View view) {
        Resources r = m۱۱۸۱۰l();
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
                this.f۱۱۲۷۷o = Ca.m۱۰۵۵۶c(m۱۱۸۰۲e(), iconRes);
            } else if (icon != null) {
                this.f۱۱۲۷۷o = icon;
            }
            this.f۱۱۲۷۸p = null;
        }
        mo۱۱۷۹۱b(false);
    }

    /* renamed from: a, reason: contains not printable characters */
    protected Ch m۱۱۷۷۲a(CharSequence title) {
        m۱۱۷۶۰a(0, title, 0, null, null);
        return this;
    }

    /* renamed from: e, reason: contains not printable characters */
    protected Ch m۱۱۸۰۳e(int titleRes) {
        m۱۱۷۶۰a(titleRes, null, 0, null, null);
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    protected Ch m۱۱۷۷۰a(Drawable icon) {
        m۱۱۷۶۰a(0, null, 0, icon, null);
        return this;
    }

    /* renamed from: d, reason: contains not printable characters */
    protected Ch m۱۱۷۹۸d(int iconRes) {
        m۱۱۷۶۰a(0, null, iconRes, null, null);
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    protected Ch m۱۱۷۷۱a(View view) {
        m۱۱۷۶۰a(0, null, 0, null, view);
        return this;
    }

    /* renamed from: h, reason: contains not printable characters */
    public CharSequence m۱۱۸۰۶h() {
        return this.f۱۱۲۷۶n;
    }

    /* renamed from: g, reason: contains not printable characters */
    public Drawable m۱۱۸۰۵g() {
        return this.f۱۱۲۷۷o;
    }

    /* renamed from: i, reason: contains not printable characters */
    public View m۱۱۸۰۷i() {
        return this.f۱۱۲۷۸p;
    }

    /* renamed from: m, reason: contains not printable characters */
    public Ch mo۱۱۹۴۲m() {
        return this;
    }

    /* renamed from: k, reason: contains not printable characters */
    boolean m۱۱۸۰۹k() {
        return this.f۱۱۲۸۲t;
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean mo۱۱۹۴۰b(Ck item) {
        if (this.f۱۱۲۸۵w.isEmpty()) {
            return false;
        }
        boolean expanded = false;
        m۱۱۸۱۷s();
        Iterator<WeakReference<InterfaceCp>> it = this.f۱۱۲۸۵w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceCp> next = it.next();
            InterfaceCp presenter = next.get();
            if (presenter == null) {
                this.f۱۱۲۸۵w.remove(next);
            } else {
                boolean z = presenter.mo۱۲۸۸۵b(this, item);
                expanded = z;
                if (z) {
                    break;
                }
            }
        }
        m۱۱۸۱۶r();
        if (expanded) {
            this.f۱۱۲۸۶x = item;
        }
        return expanded;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۱۹۳۹a(Ck item) {
        if (this.f۱۱۲۸۵w.isEmpty() || this.f۱۱۲۸۶x != item) {
            return false;
        }
        boolean collapsed = false;
        m۱۱۸۱۷s();
        Iterator<WeakReference<InterfaceCp>> it = this.f۱۱۲۸۵w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceCp> next = it.next();
            InterfaceCp presenter = next.get();
            if (presenter == null) {
                this.f۱۱۲۸۵w.remove(next);
            } else {
                boolean z = presenter.mo۱۲۸۸۲a(this, item);
                collapsed = z;
                if (z) {
                    break;
                }
            }
        }
        m۱۱۸۱۶r();
        if (collapsed) {
            this.f۱۱۲۸۶x = null;
        }
        return collapsed;
    }

    /* renamed from: f, reason: contains not printable characters */
    public Ck m۱۱۸۰۴f() {
        return this.f۱۱۲۸۶x;
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۱۷۹۷c(boolean override) {
        this.f۱۱۲۸۸z = override;
    }
}
