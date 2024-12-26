package com.lawyer_smartCalendar.activity;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.utils.Ce;
import com.lawyer_smartCalendar.utils.Ch;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۰۵۲b.p۰۵۷b.p۰۶۰b.p۰۶۱a.AbstractCa;
import p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class PayActivity extends ActivityCe {

    /* renamed from: A  reason: contains not printable characters */
    ServiceConnection f۱۴۳۷۴A = new ServiceConnectionCa();

    /* renamed from: r  reason: contains not printable characters */
    TextView f۱۴۳۷۵r;

    /* renamed from: s  reason: contains not printable characters */
    TextView f۱۴۳۷۶s;

    /* renamed from: t  reason: contains not printable characters */
    TextView f۱۴۳۷۷t;

    /* renamed from: u  reason: contains not printable characters */
    private Button f۱۴۳۷۸u;

    /* renamed from: v  reason: contains not printable characters */
    private Button f۱۴۳۷۹v;

    /* renamed from: w  reason: contains not printable characters */
    String f۱۴۳۸۰w;

    /* renamed from: x  reason: contains not printable characters */
    String f۱۴۳۸۱x;

    /* renamed from: y  reason: contains not printable characters */
    String f۱۴۳۸۲y;

    /* renamed from: z  reason: contains not printable characters */
    AbstractCa f۱۴۳۸۳z;

    /* renamed from: com.lawyer_smartCalendar.activity.PayActivity$a  reason: invalid class name */
    class ServiceConnectionCa implements ServiceConnection {
        ServiceConnectionCa() {
        }

        public void onServiceDisconnected(ComponentName name) {
            PayActivity.this.f۱۴۳۸۳z = null;
        }

        public void onServiceConnected(ComponentName name, IBinder service) {
            PayActivity.this.f۱۴۳۸۳z = AbstractCa.AbstractBinderCa.m۱۵۹۱۴a(service);
        }
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onBackPressed() {
        finish();
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۷v7.app.ActivityCe
    public void onDestroy() {
        super.onDestroy();
        ServiceConnection serviceConnection = this.f۱۴۳۷۴A;
        if (serviceConnection != null) {
            unbindService(serviceConnection);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1002) {
            try {
                int responseCode = data.getIntExtra("RESPONSE_CODE", 0);
                Toast.makeText(getApplicationContext(), "response code : " + responseCode, 1).show();
            } catch (Exception e) {
                return;
            }
        }
        if (requestCode == 1001) {
            int responseCode2 = data.getIntExtra("RESPONSE_CODE", 0);
            String purchaseData = data.getStringExtra("INAPP_PURCHASE_DATA");
            String message = "";
            if (resultCode == -1) {
                try {
                    JSONObject jo = new JSONObject(purchaseData);
                    String productId = jo.getString("productId");
                    String purchaseToken = jo.getString("purchaseToken");
                    Ca.m۱۶۴۱۸b("app_version", "full");
                    View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(this);
                    dVar.m۱۵۸۵۱a("IRANSansMobile_Medium.ttf", "IRANSansMobile_Medium.ttf");
                    dVar.m۱۵۸۶۸d(EnumCe.CENTER);
                    dVar.m۱۵۸۵۸b(EnumCe.CENTER);
                    dVar.m۱۵۸۷۱e("تبریک : خرید با موفقیت انجام شد");
                    dVar.m۱۵۸۴۷a(EnumCe.END);
                    dVar.m۱۵۸۵۰a(("شناسه محصول : " + productId + "\n") + "توکن خرید : " + purchaseToken + "\n");
                    dVar.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                    dVar.m۱۵۸۷۲f(R.color.accent);
                    dVar.m۱۵۸۶۹d("باشه");
                    dVar.m۱۵۸۶۴c(new Cb());
                    dVar.m۱۵۸۶۶c();
                    try {
                        Ce.f۱۴۷۸۲a.invalidateOptionsMenu();
                    } catch (Exception e2) {
                    }
                } catch (JSONException e3) {
                    try {
                        Toast.makeText(this, e3.getMessage(), 1).show();
                    } catch (Exception e4) {
                        return;
                    }
                }
                return;
            }
            switch (responseCode2) {
                case 1:
                    message = "خرید توسط شما لغو شد";
                    break;
                case 3:
                    message = "API‌ برای درخواست ارسال شده پشتیبانی نمی‌شود";
                    break;
                case 4:
                    message = "این محصول برای فروش موجود نیست";
                    break;
                case 5:
                    message = "پارامترهای ارسالی به API معتبر نیستند. این خطا همچنین می‌تواند بیانگر این موارد باشد:برنامه به درستی امضا نشده است، تغییرات مورد نیاز در مانیفست ایجاد نشده است، برنامه در پنل پرداخت بازار ثبت نشده یا مجوزهای لازم برای استفاده از پرداخت را کسب نکرده است.";
                    break;
                case 6:
                    message = "خطا در هنگام انجام عملیات پرداخت";
                    break;
                case 7:
                    message = "این محصول در حال حاضر در مالکیت شما است";
                    break;
                case 8:
                    message = "خطا در مصرف، زیرا این محصول تحت «مالکیت» کاربر نیست";
                    break;
            }
            View$OnClickListenerCf.Cd dVar2 = new View$OnClickListenerCf.Cd(this);
            dVar2.m۱۵۸۵۱a("IRANSansMobile_Medium.ttf", "IRANSansMobile_Medium.ttf");
            dVar2.m۱۵۸۶۸d(EnumCe.CENTER);
            dVar2.m۱۵۸۵۸b(EnumCe.CENTER);
            dVar2.m۱۵۸۷۱e("خطا :");
            dVar2.m۱۵۸۴۷a(EnumCe.END);
            dVar2.m۱۵۸۵۰a(message);
            dVar2.m۱۵۸۷۶j(R.color.colorPrimaryDark);
            dVar2.m۱۵۸۷۲f(R.color.accent);
            dVar2.m۱۵۸۶۹d("باشه");
            dVar2.m۱۵۸۶۴c(new Cc(this));
            dVar2.m۱۵۸۶۶c();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.PayActivity$b  reason: invalid class name */
    class Cb implements View$OnClickListenerCf.AbstractCm {
        Cb() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۴۶a(p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
            PayActivity.this.finish();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.PayActivity$c  reason: invalid class name */
    class Cc implements View$OnClickListenerCf.AbstractCm {
        Cc(PayActivity this$0) {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۴۷a(p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf dialog, EnumCb which) {
            dialog.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("CURRENT_TIME", this.f۱۴۳۸۱x);
        outState.putString("IMEI_CODE", this.f۱۴۳۸۰w);
        outState.putString("ORDER_ID", this.f۱۴۳۸۲y);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0190 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x019d  */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
        // Method dump skipped, instructions count: 430
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.activity.PayActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: com.lawyer_smartCalendar.activity.PayActivity$d  reason: invalid class name */
    class View$OnClickListenerCd implements View.OnClickListener {
        View$OnClickListenerCd() {
        }

        public void onClick(View view) {
            try {
                AbstractCa aVar = PayActivity.this.f۱۴۳۸۳z;
                String packageName = PayActivity.this.getPackageName();
                Integer num = 0;
                Integer num2 = 0;
                Integer num3 = 0;
                PayActivity.this.startIntentSenderForResult(((PendingIntent) aVar.m۱۵۹۱۳a(3, packageName, "lawyer.smartCalendar_full_version", "inapp", PayActivity.this.f۱۴۳۸۲y.hashCode() + "").getParcelable("BUY_INTENT")).getIntentSender(), 1001, new Intent(), num.intValue(), num2.intValue(), num3.intValue());
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.PayActivity$e  reason: invalid class name */
    class View$OnClickListenerCe implements View.OnClickListener {
        View$OnClickListenerCe() {
        }

        public void onClick(View view) {
            try {
                Bundle ownedItems = PayActivity.this.f۱۴۳۸۳z.m۱۵۹۱۲a(3, PayActivity.this.getPackageName(), "inapp", null);
                if (ownedItems.getInt("RESPONSE_CODE") == 0) {
                    ownedItems.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList purchaseDataList = ownedItems.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ownedItems.getStringArrayList("INAPP_DATA_SIGNATURE");
                    ownedItems.getString("INAPP_CONTINUATION_TOKEN");
                    for (int i = 0; i < purchaseDataList.size(); i++) {
                        JSONObject purchaseDataObject = new JSONObject(purchaseDataList.get(i).toString());
                        if (purchaseDataObject.getString("productId").equals("lawyer.smartCalendar_full_version")) {
                            p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۸b("app_version", "full");
                            View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(PayActivity.this);
                            dVar.m۱۵۸۵۱a("IRANSansMobile_Medium.ttf", "IRANSansMobile_Medium.ttf");
                            dVar.m۱۵۸۶۸d(EnumCe.CENTER);
                            dVar.m۱۵۸۵۸b(EnumCe.CENTER);
                            dVar.m۱۵۸۷۱e("تبریک : خرید شما بازیابی شد");
                            dVar.m۱۵۸۴۷a(EnumCe.END);
                            dVar.m۱۵۸۵۰a("شناسه محصول : " + purchaseDataObject.getString("productId") + "\n");
                            dVar.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                            dVar.m۱۵۸۷۲f(R.color.accent);
                            dVar.m۱۵۸۶۹d("باشه");
                            dVar.m۱۵۸۶۴c(new Ca());
                            dVar.m۱۵۸۶۶c();
                            try {
                                Ce.f۱۴۷۸۲a.invalidateOptionsMenu();
                            } catch (Exception e) {
                            }
                        }
                    }
                    return;
                }
                new Ch().m۱۷۷۵۳a(PayActivity.this, "error", "اطلاعات خرید یافت نشد.");
            } catch (Exception ex) {
                Toast.makeText(PayActivity.this.getApplicationContext(), ex.getMessage(), 1).show();
            }
        }

        /* renamed from: com.lawyer_smartCalendar.activity.PayActivity$e$a  reason: invalid class name */
        class Ca implements View$OnClickListenerCf.AbstractCm {
            Ca() {
            }

            @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
            /* renamed from: a  reason: contains not printable characters */
            public void m۱۷۴۴۸a(p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf dialog, EnumCb which) {
                dialog.dismiss();
                PayActivity.this.finish();
            }
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.PayActivity$f  reason: invalid class name */
    class View$OnClickListenerCf implements View.OnClickListener {
        View$OnClickListenerCf() {
        }

        public void onClick(View view) {
            PayActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://cafebazaar.ir/help/?l=fa")));
        }
    }
}
