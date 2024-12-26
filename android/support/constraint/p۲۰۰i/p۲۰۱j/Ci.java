package android.support.constraint.p۲۰۰i.p۲۰۱j;

import android.support.constraint.p۲۰۰i.Ce;
import android.support.constraint.p۲۰۰i.Cf;
import android.support.constraint.p۲۰۰i.p۲۰۱j.Ce;

/* renamed from: android.support.constraint.i.j.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ci {

    /* renamed from: a, reason: contains not printable characters */
    static boolean[] f۹۴۱۷a = new boolean[3];

    /* renamed from: a, reason: contains not printable characters */
    static void m۹۱۳۸a(Cf container, Ce system, Ce widget) {
        if (container.f۹۳۳۳B[0] != Ce.b.WRAP_CONTENT && widget.f۹۳۳۳B[0] == Ce.b.MATCH_PARENT) {
            int left = widget.f۹۳۷۸r.f۹۳۰۸e;
            int right = container.m۹۰۹۵t() - widget.f۹۳۸۰t.f۹۳۰۸e;
            Cd cd = widget.f۹۳۷۸r;
            cd.f۹۳۱۲i = system.m۸۹۶۶a(cd);
            Cd cd2 = widget.f۹۳۸۰t;
            cd2.f۹۳۱۲i = system.m۸۹۶۶a(cd2);
            system.m۸۹۷۰a(widget.f۹۳۷۸r.f۹۳۱۲i, left);
            system.m۸۹۷۰a(widget.f۹۳۸۰t.f۹۳۱۲i, right);
            widget.f۹۳۵۸a = 2;
            widget.m۹۰۳۷a(left, right);
        }
        if (container.f۹۳۳۳B[1] != Ce.b.WRAP_CONTENT && widget.f۹۳۳۳B[1] == Ce.b.MATCH_PARENT) {
            int top = widget.f۹۳۷۹s.f۹۳۰۸e;
            int bottom = container.m۹۰۷۷i() - widget.f۹۳۸۱u.f۹۳۰۸e;
            Cd cd3 = widget.f۹۳۷۹s;
            cd3.f۹۳۱۲i = system.m۸۹۶۶a(cd3);
            Cd cd4 = widget.f۹۳۸۱u;
            cd4.f۹۳۱۲i = system.m۸۹۶۶a(cd4);
            system.m۸۹۷۰a(widget.f۹۳۷۹s.f۹۳۱۲i, top);
            system.m۸۹۷۰a(widget.f۹۳۸۱u.f۹۳۱۲i, bottom);
            if (widget.f۹۳۴۵N > 0 || widget.m۹۰۹۴s() == 8) {
                Cd cd5 = widget.f۹۳۸۲v;
                cd5.f۹۳۱۲i = system.m۸۹۶۶a(cd5);
                system.m۸۹۷۰a(widget.f۹۳۸۲v.f۹۳۱۲i, widget.f۹۳۴۵N + top);
            }
            widget.f۹۳۶۰b = 2;
            widget.m۹۰۶۸d(top, bottom);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۹۱۳۹a(Ce constraintWidget, int orientation) {
        Ce.b[] bVarArr = constraintWidget.f۹۳۳۳B;
        if (bVarArr[orientation] != Ce.b.MATCH_CONSTRAINT) {
            return false;
        }
        if (constraintWidget.f۹۳۳۷F != 0.0f) {
            return bVarArr[orientation != 0 ? (char) 0 : (char) 1] == Ce.b.MATCH_CONSTRAINT ? false : false;
        }
        if (orientation == 0) {
            if (constraintWidget.f۹۳۶۵e != 0 || constraintWidget.f۹۳۶۸h != 0 || constraintWidget.f۹۳۶۹i != 0) {
                return false;
            }
        } else if (constraintWidget.f۹۳۶۶f != 0 || constraintWidget.f۹۳۷۱k != 0 || constraintWidget.f۹۳۷۲l != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a, reason: contains not printable characters */
    static void m۹۱۳۷a(int optimisationLevel, Ce widget) {
        widget.m۹۰۳۳G();
        Ck leftNode = widget.f۹۳۷۸r.m۹۰۱۸d();
        Ck topNode = widget.f۹۳۷۹s.m۹۰۱۸d();
        Ck rightNode = widget.f۹۳۸۰t.m۹۰۱۸d();
        Ck bottomNode = widget.f۹۳۸۱u.m۹۰۱۸d();
        boolean optimiseDimensions = (optimisationLevel & 8) == 8;
        boolean isOptimizableHorizontalMatch = widget.f۹۳۳۳B[0] == Ce.b.MATCH_CONSTRAINT && m۹۱۳۹a(widget, 0);
        if (leftNode.f۹۴۲۳h != 4 && rightNode.f۹۴۲۳h != 4) {
            if (widget.f۹۳۳۳B[0] == Ce.b.FIXED || (isOptimizableHorizontalMatch && widget.m۹۰۹۴s() == 8)) {
                if (widget.f۹۳۷۸r.f۹۳۰۷d == null && widget.f۹۳۸۰t.f۹۳۰۷d == null) {
                    leftNode.m۹۱۴۷b(1);
                    rightNode.m۹۱۴۷b(1);
                    if (optimiseDimensions) {
                        rightNode.m۹۱۴۶a(leftNode, 1, widget.m۹۰۸۷n());
                    } else {
                        rightNode.m۹۱۴۵a(leftNode, widget.m۹۰۹۵t());
                    }
                } else if (widget.f۹۳۷۸r.f۹۳۰۷d != null && widget.f۹۳۸۰t.f۹۳۰۷d == null) {
                    leftNode.m۹۱۴۷b(1);
                    rightNode.m۹۱۴۷b(1);
                    if (optimiseDimensions) {
                        rightNode.m۹۱۴۶a(leftNode, 1, widget.m۹۰۸۷n());
                    } else {
                        rightNode.m۹۱۴۵a(leftNode, widget.m۹۰۹۵t());
                    }
                } else if (widget.f۹۳۷۸r.f۹۳۰۷d == null && widget.f۹۳۸۰t.f۹۳۰۷d != null) {
                    leftNode.m۹۱۴۷b(1);
                    rightNode.m۹۱۴۷b(1);
                    leftNode.m۹۱۴۵a(rightNode, -widget.m۹۰۹۵t());
                    if (optimiseDimensions) {
                        leftNode.m۹۱۴۶a(rightNode, -1, widget.m۹۰۸۷n());
                    } else {
                        leftNode.m۹۱۴۵a(rightNode, -widget.m۹۰۹۵t());
                    }
                } else if (widget.f۹۳۷۸r.f۹۳۰۷d != null && widget.f۹۳۸۰t.f۹۳۰۷d != null) {
                    leftNode.m۹۱۴۷b(2);
                    rightNode.m۹۱۴۷b(2);
                    if (optimiseDimensions) {
                        widget.m۹۰۸۷n().m۹۱۵۸a(leftNode);
                        widget.m۹۰۸۷n().m۹۱۵۸a(rightNode);
                        leftNode.m۹۱۴۹b(rightNode, -1, widget.m۹۰۸۷n());
                        rightNode.m۹۱۴۹b(leftNode, 1, widget.m۹۰۸۷n());
                    } else {
                        leftNode.m۹۱۴۸b(rightNode, -widget.m۹۰۹۵t());
                        rightNode.m۹۱۴۸b(leftNode, widget.m۹۰۹۵t());
                    }
                }
            } else if (isOptimizableHorizontalMatch) {
                int width = widget.m۹۰۹۵t();
                leftNode.m۹۱۴۷b(1);
                rightNode.m۹۱۴۷b(1);
                if (widget.f۹۳۷۸r.f۹۳۰۷d == null && widget.f۹۳۸۰t.f۹۳۰۷d == null) {
                    if (optimiseDimensions) {
                        rightNode.m۹۱۴۶a(leftNode, 1, widget.m۹۰۸۷n());
                    } else {
                        rightNode.m۹۱۴۵a(leftNode, width);
                    }
                } else if (widget.f۹۳۷۸r.f۹۳۰۷d != null && widget.f۹۳۸۰t.f۹۳۰۷d == null) {
                    if (optimiseDimensions) {
                        rightNode.m۹۱۴۶a(leftNode, 1, widget.m۹۰۸۷n());
                    } else {
                        rightNode.m۹۱۴۵a(leftNode, width);
                    }
                } else if (widget.f۹۳۷۸r.f۹۳۰۷d == null && widget.f۹۳۸۰t.f۹۳۰۷d != null) {
                    if (optimiseDimensions) {
                        leftNode.m۹۱۴۶a(rightNode, -1, widget.m۹۰۸۷n());
                    } else {
                        leftNode.m۹۱۴۵a(rightNode, -width);
                    }
                } else if (widget.f۹۳۷۸r.f۹۳۰۷d != null && widget.f۹۳۸۰t.f۹۳۰۷d != null) {
                    if (optimiseDimensions) {
                        widget.m۹۰۸۷n().m۹۱۵۸a(leftNode);
                        widget.m۹۰۸۷n().m۹۱۵۸a(rightNode);
                    }
                    if (widget.f۹۳۳۷F == 0.0f) {
                        leftNode.m۹۱۴۷b(3);
                        rightNode.m۹۱۴۷b(3);
                        leftNode.m۹۱۴۸b(rightNode, 0.0f);
                        rightNode.m۹۱۴۸b(leftNode, 0.0f);
                    } else {
                        leftNode.m۹۱۴۷b(2);
                        rightNode.m۹۱۴۷b(2);
                        leftNode.m۹۱۴۸b(rightNode, -width);
                        rightNode.m۹۱۴۸b(leftNode, width);
                        widget.m۹۰۸۲k(width);
                    }
                }
            }
        }
        boolean isOptimizableVerticalMatch = widget.f۹۳۳۳B[1] == Ce.b.MATCH_CONSTRAINT && m۹۱۳۹a(widget, 1);
        if (topNode.f۹۴۲۳h != 4 && bottomNode.f۹۴۲۳h != 4) {
            if (widget.f۹۳۳۳B[1] == Ce.b.FIXED || (isOptimizableVerticalMatch && widget.m۹۰۹۴s() == 8)) {
                if (widget.f۹۳۷۹s.f۹۳۰۷d == null && widget.f۹۳۸۱u.f۹۳۰۷d == null) {
                    topNode.m۹۱۴۷b(1);
                    bottomNode.m۹۱۴۷b(1);
                    if (optimiseDimensions) {
                        bottomNode.m۹۱۴۶a(topNode, 1, widget.m۹۰۸۵m());
                    } else {
                        bottomNode.m۹۱۴۵a(topNode, widget.m۹۰۷۷i());
                    }
                    Cd cd = widget.f۹۳۸۲v;
                    if (cd.f۹۳۰۷d != null) {
                        cd.m۹۰۱۸d().m۹۱۴۷b(1);
                        topNode.m۹۱۴۲a(1, widget.f۹۳۸۲v.m۹۰۱۸d(), -widget.f۹۳۴۵N);
                        return;
                    }
                    return;
                }
                if (widget.f۹۳۷۹s.f۹۳۰۷d != null && widget.f۹۳۸۱u.f۹۳۰۷d == null) {
                    topNode.m۹۱۴۷b(1);
                    bottomNode.m۹۱۴۷b(1);
                    if (optimiseDimensions) {
                        bottomNode.m۹۱۴۶a(topNode, 1, widget.m۹۰۸۵m());
                    } else {
                        bottomNode.m۹۱۴۵a(topNode, widget.m۹۰۷۷i());
                    }
                    if (widget.f۹۳۴۵N > 0) {
                        widget.f۹۳۸۲v.m۹۰۱۸d().m۹۱۴۲a(1, topNode, widget.f۹۳۴۵N);
                        return;
                    }
                    return;
                }
                if (widget.f۹۳۷۹s.f۹۳۰۷d == null && widget.f۹۳۸۱u.f۹۳۰۷d != null) {
                    topNode.m۹۱۴۷b(1);
                    bottomNode.m۹۱۴۷b(1);
                    if (optimiseDimensions) {
                        topNode.m۹۱۴۶a(bottomNode, -1, widget.m۹۰۸۵m());
                    } else {
                        topNode.m۹۱۴۵a(bottomNode, -widget.m۹۰۷۷i());
                    }
                    if (widget.f۹۳۴۵N > 0) {
                        widget.f۹۳۸۲v.m۹۰۱۸d().m۹۱۴۲a(1, topNode, widget.f۹۳۴۵N);
                        return;
                    }
                    return;
                }
                if (widget.f۹۳۷۹s.f۹۳۰۷d != null && widget.f۹۳۸۱u.f۹۳۰۷d != null) {
                    topNode.m۹۱۴۷b(2);
                    bottomNode.m۹۱۴۷b(2);
                    if (optimiseDimensions) {
                        topNode.m۹۱۴۹b(bottomNode, -1, widget.m۹۰۸۵m());
                        bottomNode.m۹۱۴۹b(topNode, 1, widget.m۹۰۸۵m());
                        widget.m۹۰۸۵m().m۹۱۵۸a(topNode);
                        widget.m۹۰۸۷n().m۹۱۵۸a(bottomNode);
                    } else {
                        topNode.m۹۱۴۸b(bottomNode, -widget.m۹۰۷۷i());
                        bottomNode.m۹۱۴۸b(topNode, widget.m۹۰۷۷i());
                    }
                    if (widget.f۹۳۴۵N > 0) {
                        widget.f۹۳۸۲v.m۹۰۱۸d().m۹۱۴۲a(1, topNode, widget.f۹۳۴۵N);
                        return;
                    }
                    return;
                }
                return;
            }
            if (isOptimizableVerticalMatch) {
                int height = widget.m۹۰۷۷i();
                topNode.m۹۱۴۷b(1);
                bottomNode.m۹۱۴۷b(1);
                if (widget.f۹۳۷۹s.f۹۳۰۷d == null && widget.f۹۳۸۱u.f۹۳۰۷d == null) {
                    if (optimiseDimensions) {
                        bottomNode.m۹۱۴۶a(topNode, 1, widget.m۹۰۸۵m());
                        return;
                    } else {
                        bottomNode.m۹۱۴۵a(topNode, height);
                        return;
                    }
                }
                if (widget.f۹۳۷۹s.f۹۳۰۷d != null && widget.f۹۳۸۱u.f۹۳۰۷d == null) {
                    if (optimiseDimensions) {
                        bottomNode.m۹۱۴۶a(topNode, 1, widget.m۹۰۸۵m());
                        return;
                    } else {
                        bottomNode.m۹۱۴۵a(topNode, height);
                        return;
                    }
                }
                if (widget.f۹۳۷۹s.f۹۳۰۷d == null && widget.f۹۳۸۱u.f۹۳۰۷d != null) {
                    if (optimiseDimensions) {
                        topNode.m۹۱۴۶a(bottomNode, -1, widget.m۹۰۸۵m());
                        return;
                    } else {
                        topNode.m۹۱۴۵a(bottomNode, -height);
                        return;
                    }
                }
                if (widget.f۹۳۷۹s.f۹۳۰۷d != null && widget.f۹۳۸۱u.f۹۳۰۷d != null) {
                    if (optimiseDimensions) {
                        widget.m۹۰۸۵m().m۹۱۵۸a(topNode);
                        widget.m۹۰۸۷n().m۹۱۵۸a(bottomNode);
                    }
                    if (widget.f۹۳۳۷F == 0.0f) {
                        topNode.m۹۱۴۷b(3);
                        bottomNode.m۹۱۴۷b(3);
                        topNode.m۹۱۴۸b(bottomNode, 0.0f);
                        bottomNode.m۹۱۴۸b(topNode, 0.0f);
                        return;
                    }
                    topNode.m۹۱۴۷b(2);
                    bottomNode.m۹۱۴۷b(2);
                    topNode.m۹۱۴۸b(bottomNode, -height);
                    bottomNode.m۹۱۴۸b(topNode, height);
                    widget.m۹۰۶۲c(height);
                    if (widget.f۹۳۴۵N > 0) {
                        widget.f۹۳۸۲v.m۹۰۱۸d().m۹۱۴۲a(1, topNode, widget.f۹۳۴۵N);
                    }
                }
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static boolean m۹۱۴۰a(Cf container, android.support.constraint.p۲۰۰i.Ce system, int orientation, int offset, Cc chainHead) {
        boolean isChainSpread;
        boolean isChainSpreadInside;
        boolean isChainPacked;
        Ck ck;
        float distance;
        Ce widget;
        float distance2;
        float totalWeights;
        Ce firstVisibleWidget;
        float dimension;
        boolean isChainPacked2;
        float totalWeights2;
        float dimension2;
        Ce first;
        float extraMargin;
        int numMatchConstraints;
        int numMatchConstraints2;
        Ce next;
        Ce first2 = chainHead.f۹۲۸۷a;
        Ce last = chainHead.f۹۲۸۹c;
        Ce firstVisibleWidget2 = chainHead.f۹۲۸۸b;
        Ce lastVisibleWidget = chainHead.f۹۲۹۰d;
        Ce head = chainHead.f۹۲۹۱e;
        boolean done = false;
        float totalWeights3 = chainHead.f۹۲۹۷k;
        Ce firstMatchConstraintsWidget = chainHead.f۹۲۹۲f;
        Ce ce = chainHead.f۹۲۹۳g;
        boolean isWrapContent = container.f۹۳۳۳B[orientation] == Ce.b.WRAP_CONTENT;
        if (orientation == 0) {
            isChainSpread = head.f۹۳۵۶Y == 0;
            isChainSpreadInside = head.f۹۳۵۶Y == 1;
            isChainPacked = head.f۹۳۵۶Y == 2;
        } else {
            isChainSpread = head.f۹۳۵۷Z == 0;
            isChainSpreadInside = head.f۹۳۵۷Z == 1;
            isChainPacked = head.f۹۳۵۷Z == 2;
        }
        int numMatchConstraints3 = 0;
        int numVisibleWidgets = 0;
        float totalMargins = 0.0f;
        float totalSize = 0.0f;
        Ce widget2 = first2;
        while (!done) {
            boolean done2 = done;
            Ce firstMatchConstraintsWidget2 = firstMatchConstraintsWidget;
            if (widget2.m۹۰۹۴s() != 8) {
                numVisibleWidgets++;
                if (orientation == 0) {
                    totalSize += widget2.m۹۰۹۵t();
                } else {
                    totalSize += widget2.m۹۰۷۷i();
                }
                if (widget2 != firstVisibleWidget2) {
                    totalSize += widget2.f۹۳۸۶z[offset].m۹۰۱۶b();
                }
                totalMargins = totalMargins + widget2.f۹۳۸۶z[offset].m۹۰۱۶b() + widget2.f۹۳۸۶z[offset + 1].m۹۰۱۶b();
            }
            Cd cd = widget2.f۹۳۸۶z[offset];
            if (widget2.m۹۰۹۴s() != 8 && widget2.f۹۳۳۳B[orientation] == Ce.b.MATCH_CONSTRAINT) {
                numMatchConstraints3++;
                if (orientation == 0) {
                    if (widget2.f۹۳۶۵e != 0 || widget2.f۹۳۶۸h != 0 || widget2.f۹۳۶۹i != 0) {
                        return false;
                    }
                } else if (widget2.f۹۳۶۶f != 0 || widget2.f۹۳۷۱k != 0 || widget2.f۹۳۷۲l != 0) {
                    return false;
                }
            }
            Cd nextAnchor = widget2.f۹۳۸۶z[offset + 1].f۹۳۰۷d;
            if (nextAnchor != null) {
                Ce next2 = nextAnchor.f۹۳۰۵b;
                Cd[] cdArr = next2.f۹۳۸۶z;
                numMatchConstraints2 = numMatchConstraints3;
                next = (cdArr[offset].f۹۳۰۷d == null || cdArr[offset].f۹۳۰۷d.f۹۳۰۵b != widget2) ? null : next2;
            } else {
                numMatchConstraints2 = numMatchConstraints3;
                next = null;
            }
            if (next != null) {
                widget2 = next;
                done = done2;
            } else {
                done = true;
            }
            firstMatchConstraintsWidget = firstMatchConstraintsWidget2;
            numMatchConstraints3 = numMatchConstraints2;
        }
        Ck firstNode = first2.f۹۳۸۶z[offset].m۹۰۱۸d();
        Ck lastNode = last.f۹۳۸۶z[offset + 1].m۹۰۱۸d();
        Ck ck2 = firstNode.f۹۴۱۹d;
        if (ck2 != null && (ck = lastNode.f۹۴۱۹d) != null) {
            if (ck2.f۹۴۳۱b != 1 && ck.f۹۴۳۱b != 1) {
                return false;
            }
            if (numMatchConstraints3 > 0 && numMatchConstraints3 != numVisibleWidgets) {
                return false;
            }
            float extraMargin2 = 0.0f;
            if (isChainPacked || isChainSpread || isChainSpreadInside) {
                if (firstVisibleWidget2 != null) {
                    extraMargin2 = firstVisibleWidget2.f۹۳۸۶z[offset].m۹۰۱۶b();
                }
                if (lastVisibleWidget != null) {
                    extraMargin2 += lastVisibleWidget.f۹۳۸۶z[offset + 1].m۹۰۱۶b();
                }
            }
            float firstOffset = firstNode.f۹۴۱۹d.f۹۴۲۲g;
            float lastOffset = lastNode.f۹۴۱۹d.f۹۴۲۲g;
            if (firstOffset < lastOffset) {
                distance = (lastOffset - firstOffset) - totalSize;
            } else {
                float distance3 = firstOffset - lastOffset;
                distance = distance3 - totalSize;
            }
            if (numMatchConstraints3 > 0 && numMatchConstraints3 == numVisibleWidgets) {
                if (widget2.m۹۰۸۳l() != null && widget2.m۹۰۸۳l().f۹۳۳۳B[orientation] == Ce.b.WRAP_CONTENT) {
                    return false;
                }
                float distance4 = (distance + totalSize) - totalMargins;
                Ce widget3 = firstVisibleWidget2;
                float position = firstOffset;
                if (isChainSpread) {
                    distance4 -= totalMargins - extraMargin2;
                }
                if (isChainSpread) {
                    position += widget3.f۹۳۸۶z[offset + 1].m۹۰۱۶b();
                    Ce next3 = widget3.f۹۳۶۳c0[orientation];
                    if (next3 != null) {
                        position += next3.f۹۳۸۶z[offset].m۹۰۱۶b();
                    }
                }
                while (widget3 != null) {
                    Cf cf = android.support.constraint.p۲۰۰i.Ce.f۹۲۲۲q;
                    if (cf == null) {
                        first = first2;
                        extraMargin = extraMargin2;
                    } else {
                        first = first2;
                        extraMargin = extraMargin2;
                        cf.f۹۲۶۴z--;
                        cf.f۹۲۵۶r++;
                        cf.f۹۲۶۲x++;
                    }
                    Ce next4 = widget3.f۹۳۶۳c0[orientation];
                    if (next4 != null || widget3 == lastVisibleWidget) {
                        float dimension3 = distance4 / numMatchConstraints3;
                        if (totalWeights3 > 0.0f) {
                            dimension3 = (widget3.f۹۳۵۹a0[orientation] * distance4) / totalWeights3;
                        }
                        float position2 = position + widget3.f۹۳۸۶z[offset].m۹۰۱۶b();
                        widget3.f۹۳۸۶z[offset].m۹۰۱۸d().m۹۱۴۴a(firstNode.f۹۴۲۱f, position2);
                        numMatchConstraints = numMatchConstraints3;
                        widget3.f۹۳۸۶z[offset + 1].m۹۰۱۸d().m۹۱۴۴a(firstNode.f۹۴۲۱f, position2 + dimension3);
                        widget3.f۹۳۸۶z[offset].m۹۰۱۸d().m۹۱۴۳a(system);
                        widget3.f۹۳۸۶z[offset + 1].m۹۰۱۸d().m۹۱۴۳a(system);
                        position = position2 + dimension3 + widget3.f۹۳۸۶z[offset + 1].m۹۰۱۶b();
                    } else {
                        numMatchConstraints = numMatchConstraints3;
                    }
                    widget3 = next4;
                    first2 = first;
                    extraMargin2 = extraMargin;
                    numMatchConstraints3 = numMatchConstraints;
                }
                return true;
            }
            float extraMargin3 = extraMargin2;
            if (distance < totalSize) {
                return false;
            }
            if (isChainPacked) {
                Ce widget4 = firstVisibleWidget2;
                float distance5 = (first2.m۹۰۷۹j() * (distance - extraMargin3)) + firstOffset;
                while (widget4 != null) {
                    Cf cf2 = android.support.constraint.p۲۰۰i.Ce.f۹۲۲۲q;
                    if (cf2 == null) {
                        totalWeights2 = totalWeights3;
                    } else {
                        totalWeights2 = totalWeights3;
                        cf2.f۹۲۶۴z--;
                        cf2.f۹۲۵۶r++;
                        cf2.f۹۲۶۲x++;
                    }
                    Ce next5 = widget4.f۹۳۶۳c0[orientation];
                    if (next5 != null || widget4 == lastVisibleWidget) {
                        if (orientation == 0) {
                            dimension2 = widget4.m۹۰۹۵t();
                        } else {
                            dimension2 = widget4.m۹۰۷۷i();
                        }
                        float distance6 = distance5 + widget4.f۹۳۸۶z[offset].m۹۰۱۶b();
                        widget4.f۹۳۸۶z[offset].m۹۰۱۸d().m۹۱۴۴a(firstNode.f۹۴۲۱f, distance6);
                        widget4.f۹۳۸۶z[offset + 1].m۹۰۱۸d().m۹۱۴۴a(firstNode.f۹۴۲۱f, distance6 + dimension2);
                        widget4.f۹۳۸۶z[offset].m۹۰۱۸d().m۹۱۴۳a(system);
                        widget4.f۹۳۸۶z[offset + 1].m۹۰۱۸d().m۹۱۴۳a(system);
                        distance5 = distance6 + dimension2 + widget4.f۹۳۸۶z[offset + 1].m۹۰۱۶b();
                    }
                    widget4 = next5;
                    totalWeights3 = totalWeights2;
                }
                return true;
            }
            float totalWeights4 = totalWeights3;
            if (isChainSpread || isChainSpreadInside) {
                if (isChainSpread) {
                    distance -= extraMargin3;
                } else if (isChainSpreadInside) {
                    distance -= extraMargin3;
                }
                float gap = distance / (numVisibleWidgets + 1);
                if (isChainSpreadInside) {
                    if (numVisibleWidgets > 1) {
                        gap = distance / (numVisibleWidgets - 1);
                    } else {
                        gap = distance / 2.0f;
                    }
                }
                float distance7 = firstOffset + gap;
                if (isChainSpreadInside && numVisibleWidgets > 1) {
                    distance7 = firstOffset + firstVisibleWidget2.f۹۳۸۶z[offset].m۹۰۱۶b();
                }
                if (isChainSpread && firstVisibleWidget2 != null) {
                    float distance8 = distance7 + firstVisibleWidget2.f۹۳۸۶z[offset].m۹۰۱۶b();
                    widget = firstVisibleWidget2;
                    distance2 = distance8;
                } else {
                    float f2 = distance7;
                    widget = firstVisibleWidget2;
                    distance2 = f2;
                }
                while (widget != null) {
                    Cf cf3 = android.support.constraint.p۲۰۰i.Ce.f۹۲۲۲q;
                    if (cf3 == null) {
                        totalWeights = totalWeights4;
                        firstVisibleWidget = firstVisibleWidget2;
                    } else {
                        totalWeights = totalWeights4;
                        firstVisibleWidget = firstVisibleWidget2;
                        cf3.f۹۲۶۴z--;
                        cf3.f۹۲۵۶r++;
                        cf3.f۹۲۶۲x++;
                    }
                    Ce next6 = widget.f۹۳۶۳c0[orientation];
                    if (next6 != null || widget == lastVisibleWidget) {
                        if (orientation == 0) {
                            dimension = widget.m۹۰۹۵t();
                        } else {
                            dimension = widget.m۹۰۷۷i();
                        }
                        widget.f۹۳۸۶z[offset].m۹۰۱۸d().m۹۱۴۴a(firstNode.f۹۴۲۱f, distance2);
                        isChainPacked2 = isChainPacked;
                        widget.f۹۳۸۶z[offset + 1].m۹۰۱۸d().m۹۱۴۴a(firstNode.f۹۴۲۱f, distance2 + dimension);
                        widget.f۹۳۸۶z[offset].m۹۰۱۸d().m۹۱۴۳a(system);
                        widget.f۹۳۸۶z[offset + 1].m۹۰۱۸d().m۹۱۴۳a(system);
                        distance2 += dimension + gap;
                    } else {
                        isChainPacked2 = isChainPacked;
                    }
                    widget = next6;
                    firstVisibleWidget2 = firstVisibleWidget;
                    totalWeights4 = totalWeights;
                    isChainPacked = isChainPacked2;
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
