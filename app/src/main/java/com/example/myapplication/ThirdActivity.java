package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;

public class ThirdActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = { //nama tempat
            "Jembatan Ampera",
            "Pulau Kemaro",
            "Benteng Kuto Besak",
            "Masjid Agung Palembang",
            "Punti Kayu",
            "Jakabaring Sport Arena",
            "Bukit Siguntang",
            "Taman Purbakala Sriwijaya",
            "Amanzi WaterPark"
    };

    String mDescription[] = {
            "Jl. Lintas Sumatra, 9 Ulu, Kecamatan Seberang Ulu I, Kota Palembang, Sumatera Selatan 30111", //deskripsi tempat
            "Pulau Kemaro, Kecamatan Ilir Timur II, Kota Palembang, Sumatera Selatan", //pulao kemaro
            "Jl. Sultan Mahmud Badarudin, 19 Ilir, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan 30113", //bkb
            "Jl. Jend. Sudirman, 19 Ilir, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan 30111", //masjid agung
            "Jalan Kol. Burlian Km. 6,5, Karya Baru, Alang Alang Lebar, Karya Baru, Kec. Alang-Alang Lebar, Kota Palembang, Sumatera Selatan 30961", //Punti kayu
            "15 Ulu, Kecamatan Seberang Ulu I, Kota Palembang, Sumatera Selatan 30267", //jakabaring
            "Bukit Lama, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan 30137", //bukit siguntang
            "Jl. Syakyakirti, Karang Anyar, Kec. Gandus, Kota Palembang, Sumatera Selatan", //taman
            "Copacabana Lifestyle Center CitraGrand City, Jl. Bypass Alang-Alang Lebar No.12, RW.38, Talang Klp., Kec. Alang-Alang Lebar, Kota Palembang, Sumatera Selatan 30154" //amanzi
    };
    int images[] = {
            R.drawable.ampera1,
            R.drawable.kemaro,
            R.drawable.bkb,
            R.drawable.masjid,
            R.drawable.puntikayu,
            R.drawable.jakabaring,
            R.drawable.bukit,
            R.drawable.taman,
            R.drawable.amanzi
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
    }

    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[],String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent,false);
            ImageView images = row.findViewById(R.id.destinasi1);
            TextView myTitle = row.findViewById((R.id.textView1));
             TextView myDescription = row.findViewById(R.id.textView2);

                images.setImageResource(rImgs[position]);
                myTitle.setText(rTitle[position]);
                myDescription.setText(rDescription[position]);

            return row;
        }
    }
}
