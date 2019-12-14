package com.example.myapplication;

        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;

        import androidx.appcompat.app.AppCompatActivity;

public class MapsActivity extends AppCompatActivity {
    private Intent googleMapIntent;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymaps);

        this.initialize();
    }

    private void initialize() {
        googleMapIntent = new Intent(Intent.ACTION_VIEW);
        googleMapIntent.setData(Uri.parse("geo:0,0?q= Kota Palembang, Sumatera Selatan" ));
        this.startActivity(googleMapIntent);
    }

}
