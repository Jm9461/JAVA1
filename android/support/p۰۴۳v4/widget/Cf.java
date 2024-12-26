package android.support.p۰۴۳v4.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCj;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ck;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cn;

/* renamed from: android.support.v4.widget.f  reason: invalid class name */
public final class Cf<T> {

    /* renamed from: a  reason: contains not printable characters */
    private final AbstractCj<ArrayList<T>> f۱۰۷۷۷a = new Ck(10);

    /* renamed from: b  reason: contains not printable characters */
    private final Cn<T, ArrayList<T>> f۱۰۷۷۸b = new Cn<>();

    /* renamed from: c  reason: contains not printable characters */
    private final ArrayList<T> f۱۰۷۷۹c = new ArrayList<>();

    /* renamed from: d  reason: contains not printable characters */
    private final HashSet<T> f۱۰۷۸۰d = new HashSet<>();

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۲۴۲a(T node) {
        if (!this.f۱۰۷۷۸b.containsKey(node)) {
            this.f۱۰۷۷۸b.put(node, null);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۲۴۵b(T node) {
        return this.f۱۰۷۷۸b.containsKey(node);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۲۴۳a(T node, T incomingEdge) {
        if (!this.f۱۰۷۷۸b.containsKey(node) || !this.f۱۰۷۷۸b.containsKey(incomingEdge)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> edges = this.f۱۰۷۷۸b.get(node);
        if (edges == null) {
            edges = m۱۳۲۴۰c();
            this.f۱۰۷۷۸b.put(node, edges);
        }
        edges.add(incomingEdge);
    }

    /* renamed from: c  reason: contains not printable characters */
    public List m۱۳۲۴۶c(T node) {
        return this.f۱۰۷۷۸b.get(node);
    }

    /* renamed from: d  reason: contains not printable characters */
    public List<T> m۱۳۲۴۷d(T node) {
        ArrayList<T> result = null;
        int size = this.f۱۰۷۷۸b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> edges = this.f۱۰۷۷۸b.m۱۰۶۵۶d(i);
            if (edges != null && edges.contains(node)) {
                if (result == null) {
                    result = new ArrayList<>();
                }
                result.add(this.f۱۰۷۷۸b.m۱۰۶۵۴b(i));
            }
        }
        return result;
    }

    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۳۲۴۸e(T node) {
        int size = this.f۱۰۷۷۸b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> edges = this.f۱۰۷۷۸b.m۱۰۶۵۶d(i);
            if (edges != null && edges.contains(node)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۲۴۱a() {
        int size = this.f۱۰۷۷۸b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> edges = this.f۱۰۷۷۸b.m۱۰۶۵۶d(i);
            if (edges != null) {
                m۱۳۲۳۹a((ArrayList) edges);
            }
        }
        this.f۱۰۷۷۸b.clear();
    }

    /* renamed from: b  reason: contains not printable characters */
    public ArrayList<T> m۱۳۲۴۴b() {
        this.f۱۰۷۷۹c.clear();
        this.f۱۰۷۸۰d.clear();
        int size = this.f۱۰۷۷۸b.size();
        for (int i = 0; i < size; i++) {
            m۱۳۲۳۸a(this.f۱۰۷۷۸b.m۱۰۶۵۴b(i), this.f۱۰۷۷۹c, this.f۱۰۷۸۰d);
        }
        return this.f۱۰۷۷۹c;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۲۳۸a(T node, ArrayList<T> result, HashSet<T> tmpMarked) {
        if (!result.contains(node)) {
            if (!tmpMarked.contains(node)) {
                tmpMarked.add(node);
                ArrayList<T> edges = this.f۱۰۷۷۸b.get(node);
                if (edges != null) {
                    int size = edges.size();
                    for (int i = 0; i < size; i++) {
                        m۱۳۲۳۸a(edges.get(i), result, tmpMarked);
                    }
                }
                tmpMarked.remove(node);
                result.add(node);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private ArrayList<T> m۱۳۲۴۰c() {
        ArrayList<T> list = this.f۱۰۷۷۷a.m۱۰۶۳۴a();
        if (list == null) {
            return new ArrayList<>();
        }
        return list;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۲۳۹a(ArrayList<T> list) {
        list.clear();
        this.f۱۰۷۷۷a.m۱۰۶۳۵a(list);
    }
}
