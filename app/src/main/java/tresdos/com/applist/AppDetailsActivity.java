package tresdos.com.applist;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AppDetailsActivity extends AppCompatActivity {

    private TextView name, icon, nameApp;
    private ImageView iconA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_details);
        name = (TextView)findViewById(R.id.name);
//        icon = (TextView) findViewById(R.id.nam2);
        iconA = (ImageView) findViewById(R.id.icono);
        nameApp = (TextView)findViewById(R.id.nameApp);
        name.setText(getIntent().getExtras().getString("name"));
//        icon.setText(getIntent().getExtras().getString("icon"));
        nameApp.setText(getIntent().getExtras().getString("nameApp"));
        Bitmap bitmap = (Bitmap)this.getIntent().getParcelableExtra("bitmap");
        iconA.setImageBitmap(bitmap);
//        int resId =  getResources().getIdentifier(getIntent().getExtras().getString("icon"),"drawable",AppDetailsActivity.this.getPackageName());
//        Drawable d = AppDetailsActivity.this.getResources().getDrawable(resId);
//        iconA.setImageDrawable(d);
    }
}
