package android.support.p۰۴۳v4.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* renamed from: android.support.v4.app.CoreComponentFactory */
public class CoreComponentFactory extends AppComponentFactory {

    /* renamed from: android.support.v4.app.CoreComponentFactory$a  reason: invalid class name */
    public interface AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        Object m۱۲۰۴۴a();
    }

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader cl, String className, Intent intent) {
        return (Activity) m۱۲۰۴۳a(super.instantiateActivity(cl, className, intent));
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader cl, String className) {
        return (Application) m۱۲۰۴۳a(super.instantiateApplication(cl, className));
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader cl, String className, Intent intent) {
        return (BroadcastReceiver) m۱۲۰۴۳a(super.instantiateReceiver(cl, className, intent));
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader cl, String className) {
        return (ContentProvider) m۱۲۰۴۳a(super.instantiateProvider(cl, className));
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader cl, String className, Intent intent) {
        return (Service) m۱۲۰۴۳a(super.instantiateService(cl, className, intent));
    }

    /* renamed from: a  reason: contains not printable characters */
    static <T> T m۱۲۰۴۳a(T obj) {
        T wrapper;
        if (!(obj instanceof AbstractCa) || (wrapper = (T) obj.m۱۲۰۴۴a()) == null) {
            return obj;
        }
        return wrapper;
    }
}
