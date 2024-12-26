package com.lawyer_smartCalendar.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.utils.Cc;
import java.io.ByteArrayOutputStream;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class ImageActivity extends ActivityCe {

    /* renamed from: r  reason: contains not printable characters */
    private String f۱۴۳۰۳r;

    /* renamed from: s  reason: contains not printable characters */
    private ImageView f۱۴۳۰۴s;

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            overridePendingTransition(17432576, 17432577);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != R.id.action_share) {
            return super.onOptionsItemSelected(item);
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    StrictMode.class.getMethod("disableDeathOnFileUriExposure", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Bitmap bmImg = BitmapFactory.decodeFile(this.f۱۴۳۰۳r);
            bmImg.compress(Bitmap.CompressFormat.JPEG, 100, new ByteArrayOutputStream());
            Uri bitmapUri = Uri.parse(MediaStore.Images.Media.insertImage(getContentResolver(), bmImg, "Title", (String) null));
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", bitmapUri);
            startActivity(Intent.createChooser(intent, "Share"));
        } catch (Exception e2) {
            Toast.makeText(this, e2.toString(), 1).show();
        }
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.share_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        setTheme(Cc.m۱۷۷۳۹b());
        super.onCreate(savedInstanceState);
        overridePendingTransition(17432576, 17432577);
        setContentView(R.layout.activity_image);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.m۱۴۹۳۱a(0, 0);
        m۱۳۴۸۱a(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_forward_white_24dp);
        toolbar.setNavigationOnClickListener(new View$OnClickListenerCa());
        this.f۱۴۳۰۳r = getIntent().getStringExtra("image");
        this.f۱۴۳۰۴s = (ImageView) findViewById(R.id.img_photo_view);
        this.f۱۴۳۰۴s.setImageBitmap(BitmapFactory.decodeFile(this.f۱۴۳۰۳r));
    }

    /* renamed from: com.lawyer_smartCalendar.activity.ImageActivity$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View view) {
            ImageActivity.this.finish();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onBackPressed() {
        super.onBackPressed();
    }
}
