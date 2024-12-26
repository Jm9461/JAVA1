package android.support.v4.widget;

import a.b.g.g.j;
import a.b.g.g.k;
import a.b.g.g.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final j<ArrayList<T>> f۱۴۴۸a = new k(10);

    /* renamed from: b  reason: collision with root package name */
    private final n<T, ArrayList<T>> f۱۴۴۹b = new n<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<T> f۱۴۵۰c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<T> f۱۴۵۱d = new HashSet<>();

    public void a(T node) {
        if (!this.f۱۴۴۹b.containsKey(node)) {
            this.f۱۴۴۹b.put(node, null);
        }
    }

    public boolean b(T node) {
        return this.f۱۴۴۹b.containsKey(node);
    }

    public void a(T node, T incomingEdge) {
        if (!this.f۱۴۴۹b.containsKey(node) || !this.f۱۴۴۹b.containsKey(incomingEdge)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> edges = this.f۱۴۴۹b.get(node);
        if (edges == null) {
            edges = c();
            this.f۱۴۴۹b.put(node, edges);
        }
        edges.add(incomingEdge);
    }

    public List c(T node) {
        return this.f۱۴۴۹b.get(node);
    }

    public List<T> d(T node) {
        ArrayList<T> result = null;
        int size = this.f۱۴۴۹b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> edges = this.f۱۴۴۹b.d(i);
            if (edges != null && edges.contains(node)) {
                if (result == null) {
                    result = new ArrayList<>();
                }
                result.add(this.f۱۴۴۹b.b(i));
            }
        }
        return result;
    }

    public boolean e(T node) {
        int size = this.f۱۴۴۹b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> edges = this.f۱۴۴۹b.d(i);
            if (edges != null && edges.contains(node)) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        int size = this.f۱۴۴۹b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> edges = this.f۱۴۴۹b.d(i);
            if (edges != null) {
                a((ArrayList) edges);
            }
        }
        this.f۱۴۴۹b.clear();
    }

    public ArrayList<T> b() {
        this.f۱۴۵۰c.clear();
        this.f۱۴۵۱d.clear();
        int size = this.f۱۴۴۹b.size();
        for (int i = 0; i < size; i++) {
            a(this.f۱۴۴۹b.b(i), this.f۱۴۵۰c, this.f۱۴۵۱d);
        }
        return this.f۱۴۵۰c;
    }

    private void a(T node, ArrayList<T> result, HashSet<T> tmpMarked) {
        if (!result.contains(node)) {
            if (!tmpMarked.contains(node)) {
                tmpMarked.add(node);
                ArrayList<T> edges = this.f۱۴۴۹b.get(node);
                if (edges != null) {
                    int size = edges.size();
                    for (int i = 0; i < size; i++) {
                        a(edges.get(i), result, tmpMarked);
                    }
                }
                tmpMarked.remove(node);
                result.add(node);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    private ArrayList<T> c() {
        ArrayList<T> list = this.f۱۴۴۸a.a();
        if (list == null) {
            return new ArrayList<>();
        }
        return list;
    }

    private void a(ArrayList<T> list) {
        list.clear();
        this.f۱۴۴۸a.a(list);
    }
}
