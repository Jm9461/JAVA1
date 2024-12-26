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
import android.support.v4.view.c;
import android.support.v4.view.v;
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

public class h implements a.b.g.b.a.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    private final Context f۱۷۰۰a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f۱۷۰۱b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f۱۷۰۲c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f۱۷۰۳d;

    /* renamed from: e  reason: collision with root package name */
    private a f۱۷۰۴e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<k> f۱۷۰۵f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<k> f۱۷۰۶g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f۱۷۰۷h;
    private ArrayList<k> i;
    private ArrayList<k> j;
    private boolean k;
    private int l = 0;
    private ContextMenu.ContextMenuInfo m;
    CharSequence n;
    Drawable o;
    View p;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private ArrayList<k> v = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<p>> w = new CopyOnWriteArrayList<>();
    private k x;
    private boolean y = false;
    private boolean z;

    public interface a {
        void a(h hVar);

        boolean a(h hVar, MenuItem menuItem);
    }

    public interface b {
        boolean a(k kVar);
    }

    public h(Context context) {
        this.f۱۷۰۰a = context;
        this.f۱۷۰۱b = context.getResources();
        this.f۱۷۰۵f = new ArrayList<>();
        this.f۱۷۰۶g = new ArrayList<>();
        this.f۱۷۰۷h = true;
        this.i = new ArrayList<>();
        this.j = new ArrayList<>();
        this.k = true;
        e(true);
    }

    public h c(int defaultShowAsAction) {
        this.l = defaultShowAsAction;
        return this;
    }

    public void a(p presenter) {
        a(presenter, this.f۱۷۰۰a);
    }

    public void a(p presenter, Context menuContext) {
        this.w.add(new WeakReference<>(presenter));
        presenter.a(menuContext, this);
        this.k = true;
    }

    public void b(p presenter) {
        Iterator<WeakReference<p>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            p item = (p) ref.get();
            if (item == null || item == presenter) {
                this.w.remove(ref);
            }
        }
    }

    private void d(boolean cleared) {
        if (!this.w.isEmpty()) {
            s();
            Iterator<WeakReference<p>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                p presenter = (p) ref.get();
                if (presenter == null) {
                    this.w.remove(ref);
                } else {
                    presenter.a(cleared);
                }
            }
            r();
        }
    }

    private boolean a(v subMenu, p preferredPresenter) {
        if (this.w.isEmpty()) {
            return false;
        }
        boolean result = false;
        if (preferredPresenter != null) {
            result = preferredPresenter.a(subMenu);
        }
        Iterator<WeakReference<p>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            p presenter = (p) ref.get();
            if (presenter == null) {
                this.w.remove(ref);
            } else if (!result) {
                result = presenter.a(subMenu);
            }
        }
        return result;
    }

    private void f(Bundle outState) {
        Parcelable state;
        if (!this.w.isEmpty()) {
            SparseArray<Parcelable> presenterStates = new SparseArray<>();
            Iterator<WeakReference<p>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                p presenter = (p) ref.get();
                if (presenter == null) {
                    this.w.remove(ref);
                } else {
                    int id = presenter.a();
                    if (id > 0 && (state = presenter.c()) != null) {
                        presenterStates.put(id, state);
                    }
                }
            }
            outState.putSparseParcelableArray("android:menu:presenters", presenterStates);
        }
    }

    private void e(Bundle state) {
        Parcelable parcel;
        SparseArray<Parcelable> presenterStates = state.getSparseParcelableArray("android:menu:presenters");
        if (presenterStates != null && !this.w.isEmpty()) {
            Iterator<WeakReference<p>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                p presenter = (p) ref.get();
                if (presenter == null) {
                    this.w.remove(ref);
                } else {
                    int id = presenter.a();
                    if (id > 0 && (parcel = presenterStates.get(id)) != null) {
                        presenter.a(parcel);
                    }
                }
            }
        }
    }

    public void d(Bundle outState) {
        f(outState);
    }

    public void b(Bundle state) {
        e(state);
    }

    public void c(Bundle outStates) {
        SparseArray<Parcelable> viewStates = null;
        int itemCount = size();
        for (int i2 = 0; i2 < itemCount; i2++) {
            MenuItem item = getItem(i2);
            View v2 = item.getActionView();
            if (!(v2 == null || v2.getId() == -1)) {
                if (viewStates == null) {
                    viewStates = new SparseArray<>();
                }
                v2.saveHierarchyState(viewStates);
                if (item.isActionViewExpanded()) {
                    outStates.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((v) item.getSubMenu()).c(outStates);
            }
        }
        if (viewStates != null) {
            outStates.putSparseParcelableArray(d(), viewStates);
        }
    }

    public void a(Bundle states) {
        MenuItem itemToExpand;
        if (states != null) {
            SparseArray<Parcelable> viewStates = states.getSparseParcelableArray(d());
            int itemCount = size();
            for (int i2 = 0; i2 < itemCount; i2++) {
                MenuItem item = getItem(i2);
                View v2 = item.getActionView();
                if (!(v2 == null || v2.getId() == -1)) {
                    v2.restoreHierarchyState(viewStates);
                }
                if (item.hasSubMenu()) {
                    ((v) item.getSubMenu()).a(states);
                }
            }
            int expandedId = states.getInt("android:menu:expandedactionview");
            if (expandedId > 0 && (itemToExpand = findItem(expandedId)) != null) {
                itemToExpand.expandActionView();
            }
        }
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "android:menu:actionviewstates";
    }

    public void a(a cb) {
        this.f۱۷۰۴e = cb;
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int group, int id, int categoryOrder, CharSequence title) {
        int ordering = f(categoryOrder);
        k item = a(group, id, categoryOrder, ordering, title, this.l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.m;
        if (contextMenuInfo != null) {
            item.a(contextMenuInfo);
        }
        ArrayList<k> arrayList = this.f۱۷۰۵f;
        arrayList.add(a(arrayList, ordering), item);
        b(true);
        return item;
    }

    private k a(int group, int id, int categoryOrder, int ordering, CharSequence title, int defaultShowAsAction) {
        return new k(this, group, id, categoryOrder, ordering, title, defaultShowAsAction);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence title) {
        return a(0, 0, 0, title);
    }

    @Override // android.view.Menu
    public MenuItem add(int titleRes) {
        return a(0, 0, 0, this.f۱۷۰۱b.getString(titleRes));
    }

    @Override // android.view.Menu
    public MenuItem add(int group, int id, int categoryOrder, CharSequence title) {
        return a(group, id, categoryOrder, title);
    }

    @Override // android.view.Menu
    public MenuItem add(int group, int id, int categoryOrder, int title) {
        return a(group, id, categoryOrder, this.f۱۷۰۱b.getString(title));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence title) {
        return addSubMenu(0, 0, 0, title);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int titleRes) {
        return addSubMenu(0, 0, 0, this.f۱۷۰۱b.getString(titleRes));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int group, int id, int categoryOrder, CharSequence title) {
        k item = (k) a(group, id, categoryOrder, title);
        v subMenu = new v(this.f۱۷۰۰a, this, item);
        item.a(subMenu);
        return subMenu;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int group, int id, int categoryOrder, int title) {
        return addSubMenu(group, id, categoryOrder, this.f۱۷۰۱b.getString(title));
    }

    public void setGroupDividerEnabled(boolean enabled) {
        this.y = enabled;
    }

    public boolean o() {
        return this.y;
    }

    public int addIntentOptions(int group, int id, int categoryOrder, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems) {
        int i2;
        PackageManager pm = this.f۱۷۰۰a.getPackageManager();
        int N = 0;
        List<ResolveInfo> lri = pm.queryIntentActivityOptions(caller, specifics, intent, 0);
        if (lri != null) {
            N = lri.size();
        }
        if ((flags & 1) == 0) {
            removeGroup(group);
        }
        for (int i3 = 0; i3 < N; i3++) {
            ResolveInfo ri = lri.get(i3);
            int i4 = ri.specificIndex;
            Intent rintent = new Intent(i4 < 0 ? intent : specifics[i4]);
            rintent.setComponent(new ComponentName(ri.activityInfo.applicationInfo.packageName, ri.activityInfo.name));
            MenuItem item = add(group, id, categoryOrder, ri.loadLabel(pm)).setIcon(ri.loadIcon(pm)).setIntent(rintent);
            if (outSpecificItems != null && (i2 = ri.specificIndex) >= 0) {
                outSpecificItems[i2] = item;
            }
        }
        return N;
    }

    public void removeItem(int id) {
        a(b(id), true);
    }

    public void removeGroup(int group) {
        int i2 = a(group);
        if (i2 >= 0) {
            int maxRemovable = this.f۱۷۰۵f.size() - i2;
            int numRemoved = 0;
            while (true) {
                int numRemoved2 = numRemoved + 1;
                if (numRemoved >= maxRemovable || this.f۱۷۰۵f.get(i2).getGroupId() != group) {
                    b(true);
                } else {
                    a(i2, false);
                    numRemoved = numRemoved2;
                }
            }
            b(true);
        }
    }

    private void a(int index, boolean updateChildrenOnMenuViews) {
        if (index >= 0 && index < this.f۱۷۰۵f.size()) {
            this.f۱۷۰۵f.remove(index);
            if (updateChildrenOnMenuViews) {
                b(true);
            }
        }
    }

    public void clear() {
        k kVar = this.x;
        if (kVar != null) {
            a(kVar);
        }
        this.f۱۷۰۵f.clear();
        b(true);
    }

    /* access modifiers changed from: package-private */
    public void a(MenuItem item) {
        int group = item.getGroupId();
        int N = this.f۱۷۰۵f.size();
        s();
        for (int i2 = 0; i2 < N; i2++) {
            k curItem = this.f۱۷۰۵f.get(i2);
            if (curItem.getGroupId() == group && curItem.i() && curItem.isCheckable()) {
                curItem.b(curItem == item);
            }
        }
        r();
    }

    public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {
        int N = this.f۱۷۰۵f.size();
        for (int i2 = 0; i2 < N; i2++) {
            k item = this.f۱۷۰۵f.get(i2);
            if (item.getGroupId() == group) {
                item.c(exclusive);
                item.setCheckable(checkable);
            }
        }
    }

    public void setGroupVisible(int group, boolean visible) {
        int N = this.f۱۷۰۵f.size();
        boolean changedAtLeastOneItem = false;
        for (int i2 = 0; i2 < N; i2++) {
            k item = this.f۱۷۰۵f.get(i2);
            if (item.getGroupId() == group && item.e(visible)) {
                changedAtLeastOneItem = true;
            }
        }
        if (changedAtLeastOneItem) {
            b(true);
        }
    }

    public void setGroupEnabled(int group, boolean enabled) {
        int N = this.f۱۷۰۵f.size();
        for (int i2 = 0; i2 < N; i2++) {
            k item = this.f۱۷۰۵f.get(i2);
            if (item.getGroupId() == group) {
                item.setEnabled(enabled);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f۱۷۰۵f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int id) {
        MenuItem possibleItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            k item = this.f۱۷۰۵f.get(i2);
            if (item.getItemId() == id) {
                return item;
            }
            if (item.hasSubMenu() && (possibleItem = item.getSubMenu().findItem(id)) != null) {
                return possibleItem;
            }
        }
        return null;
    }

    public int b(int id) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f۱۷۰۵f.get(i2).getItemId() == id) {
                return i2;
            }
        }
        return -1;
    }

    public int a(int group) {
        return a(group, 0);
    }

    public int a(int group, int start) {
        int size = size();
        if (start < 0) {
            start = 0;
        }
        for (int i2 = start; i2 < size; i2++) {
            if (this.f۱۷۰۵f.get(i2).getGroupId() == group) {
                return i2;
            }
        }
        return -1;
    }

    public int size() {
        return this.f۱۷۰۵f.size();
    }

    public MenuItem getItem(int index) {
        return this.f۱۷۰۵f.get(index);
    }

    public boolean isShortcutKey(int keyCode, KeyEvent event) {
        return a(keyCode, event) != null;
    }

    public void setQwertyMode(boolean isQwerty) {
        this.f۱۷۰۲c = isQwerty;
        b(false);
    }

    private static int f(int categoryOrder) {
        int index = (-65536 & categoryOrder) >> 16;
        if (index >= 0) {
            int[] iArr = A;
            if (index < iArr.length) {
                return (iArr[index] << 16) | (65535 & categoryOrder);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f۱۷۰۲c;
    }

    private void e(boolean shortcutsVisible) {
        boolean z2 = true;
        if (!shortcutsVisible || this.f۱۷۰۱b.getConfiguration().keyboard == 1 || !v.d(ViewConfiguration.get(this.f۱۷۰۰a), this.f۱۷۰۰a)) {
            z2 = false;
        }
        this.f۱۷۰۳d = z2;
    }

    public boolean q() {
        return this.f۱۷۰۳d;
    }

    /* access modifiers changed from: package-private */
    public Resources l() {
        return this.f۱۷۰۱b;
    }

    public Context e() {
        return this.f۱۷۰۰a;
    }

    /* access modifiers changed from: package-private */
    public boolean a(h menu, MenuItem item) {
        a aVar = this.f۱۷۰۴e;
        return aVar != null && aVar.a(menu, item);
    }

    public void a() {
        a aVar = this.f۱۷۰۴e;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    private static int a(ArrayList<k> arrayList, int ordering) {
        for (int i2 = arrayList.size() - 1; i2 >= 0; i2--) {
            if (arrayList.get(i2).c() <= ordering) {
                return i2 + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
        k item = a(keyCode, event);
        boolean handled = false;
        if (item != null) {
            handled = a(item, flags);
        }
        if ((flags & 2) != 0) {
            a(true);
        }
        return handled;
    }

    /* access modifiers changed from: package-private */
    public void a(List<k> list, int keyCode, KeyEvent event) {
        boolean qwerty = p();
        int modifierState = event.getModifiers();
        KeyCharacterMap.KeyData possibleChars = new KeyCharacterMap.KeyData();
        if (event.getKeyData(possibleChars) || keyCode == 67) {
            int N = this.f۱۷۰۵f.size();
            for (int i2 = 0; i2 < N; i2++) {
                k item = this.f۱۷۰۵f.get(i2);
                if (item.hasSubMenu()) {
                    ((h) item.getSubMenu()).a(list, keyCode, event);
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
    public k a(int keyCode, KeyEvent event) {
        char shortcutChar;
        ArrayList<MenuItemImpl> items = this.v;
        items.clear();
        a(items, keyCode, event);
        if (items.isEmpty()) {
            return null;
        }
        int metaState = event.getMetaState();
        KeyCharacterMap.KeyData possibleChars = new KeyCharacterMap.KeyData();
        event.getKeyData(possibleChars);
        int size = items.size();
        if (size == 1) {
            return (k) items.get(0);
        }
        boolean qwerty = p();
        for (int i2 = 0; i2 < size; i2++) {
            k item = (k) items.get(i2);
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
        return a(findItem(id), flags);
    }

    public boolean a(MenuItem item, int flags) {
        return a(item, (p) null, flags);
    }

    public boolean a(MenuItem item, p preferredPresenter, int flags) {
        k itemImpl = (k) item;
        if (itemImpl == null || !itemImpl.isEnabled()) {
            return false;
        }
        boolean invoked = itemImpl.g();
        c provider = itemImpl.a();
        boolean providerHasSubMenu = provider != null && provider.a();
        if (itemImpl.f()) {
            invoked |= itemImpl.expandActionView();
            if (invoked) {
                a(true);
            }
        } else if (itemImpl.hasSubMenu() || providerHasSubMenu) {
            if ((flags & 4) == 0) {
                a(false);
            }
            if (!itemImpl.hasSubMenu()) {
                itemImpl.a(new v(e(), this, itemImpl));
            }
            v subMenu = (v) itemImpl.getSubMenu();
            if (providerHasSubMenu) {
                provider.a(subMenu);
            }
            invoked |= a(subMenu, preferredPresenter);
            if (!invoked) {
                a(true);
            }
        } else if ((flags & 1) == 0) {
            a(true);
        }
        return invoked;
    }

    public final void a(boolean closeAllMenus) {
        if (!this.u) {
            this.u = true;
            Iterator<WeakReference<p>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                p presenter = (p) ref.get();
                if (presenter == null) {
                    this.w.remove(ref);
                } else {
                    presenter.a(this, closeAllMenus);
                }
            }
            this.u = false;
        }
    }

    public void close() {
        a(true);
    }

    public void b(boolean structureChanged) {
        if (!this.q) {
            if (structureChanged) {
                this.f۱۷۰۷h = true;
                this.k = true;
            }
            d(structureChanged);
            return;
        }
        this.r = true;
        if (structureChanged) {
            this.s = true;
        }
    }

    public void s() {
        if (!this.q) {
            this.q = true;
            this.r = false;
            this.s = false;
        }
    }

    public void r() {
        this.q = false;
        if (this.r) {
            this.r = false;
            b(this.s);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(k item) {
        this.f۱۷۰۷h = true;
        b(true);
    }

    /* access modifiers changed from: package-private */
    public void c(k item) {
        this.k = true;
        b(true);
    }

    public ArrayList<k> n() {
        if (!this.f۱۷۰۷h) {
            return this.f۱۷۰۶g;
        }
        this.f۱۷۰۶g.clear();
        int itemsSize = this.f۱۷۰۵f.size();
        for (int i2 = 0; i2 < itemsSize; i2++) {
            k item = this.f۱۷۰۵f.get(i2);
            if (item.isVisible()) {
                this.f۱۷۰۶g.add(item);
            }
        }
        this.f۱۷۰۷h = false;
        this.k = true;
        return this.f۱۷۰۶g;
    }

    public void b() {
        ArrayList<MenuItemImpl> visibleItems = n();
        if (this.k) {
            boolean flagged = false;
            Iterator<WeakReference<p>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                p presenter = (p) ref.get();
                if (presenter == null) {
                    this.w.remove(ref);
                } else {
                    flagged |= presenter.b();
                }
            }
            if (flagged) {
                this.i.clear();
                this.j.clear();
                int itemsSize = visibleItems.size();
                for (int i2 = 0; i2 < itemsSize; i2++) {
                    k item = (k) visibleItems.get(i2);
                    if (item.h()) {
                        this.i.add(item);
                    } else {
                        this.j.add(item);
                    }
                }
            } else {
                this.i.clear();
                this.j.clear();
                this.j.addAll(n());
            }
            this.k = false;
        }
    }

    public ArrayList<k> c() {
        b();
        return this.i;
    }

    public ArrayList<k> j() {
        b();
        return this.j;
    }

    public void clearHeader() {
        this.o = null;
        this.n = null;
        this.p = null;
        b(false);
    }

    private void a(int titleRes, CharSequence title, int iconRes, Drawable icon, View view) {
        Resources r2 = l();
        if (view != null) {
            this.p = view;
            this.n = null;
            this.o = null;
        } else {
            if (titleRes > 0) {
                this.n = r2.getText(titleRes);
            } else if (title != null) {
                this.n = title;
            }
            if (iconRes > 0) {
                this.o = android.support.v4.content.a.c(e(), iconRes);
            } else if (icon != null) {
                this.o = icon;
            }
            this.p = null;
        }
        b(false);
    }

    /* access modifiers changed from: protected */
    public h a(CharSequence title) {
        a(0, title, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    public h e(int titleRes) {
        a(titleRes, null, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    public h a(Drawable icon) {
        a(0, null, 0, icon, null);
        return this;
    }

    /* access modifiers changed from: protected */
    public h d(int iconRes) {
        a(0, null, iconRes, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    public h a(View view) {
        a(0, null, 0, null, view);
        return this;
    }

    public CharSequence h() {
        return this.n;
    }

    public Drawable g() {
        return this.o;
    }

    public View i() {
        return this.p;
    }

    public h m() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.t;
    }

    public boolean b(k item) {
        if (this.w.isEmpty()) {
            return false;
        }
        boolean expanded = false;
        s();
        Iterator<WeakReference<p>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            p presenter = (p) ref.get();
            if (presenter == null) {
                this.w.remove(ref);
            } else {
                boolean b2 = presenter.b(this, item);
                expanded = b2;
                if (b2) {
                    break;
                }
            }
        }
        r();
        if (expanded) {
            this.x = item;
        }
        return expanded;
    }

    public boolean a(k item) {
        if (this.w.isEmpty() || this.x != item) {
            return false;
        }
        boolean collapsed = false;
        s();
        Iterator<WeakReference<p>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            p presenter = (p) ref.get();
            if (presenter == null) {
                this.w.remove(ref);
            } else {
                boolean a2 = presenter.a(this, item);
                collapsed = a2;
                if (a2) {
                    break;
                }
            }
        }
        r();
        if (collapsed) {
            this.x = null;
        }
        return collapsed;
    }

    public k f() {
        return this.x;
    }

    public void c(boolean override) {
        this.z = override;
    }
}
