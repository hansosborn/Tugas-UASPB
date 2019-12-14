package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class SixthActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = { //nama tempat
            "Air Terjun Temam",
            "Kampung Warna Warni",
            "Masjid Agung As-Salam",
            "Wisata Tepian Kelingi Bukit Sulap",
    };

    String mDescription[] = {
            "Air Teman, Lubuk Linggau Sel. I, Kota Lubuklinggau, Sumatera Selatan 31600", //deskripsi tempat
            "Jl. Depati Said, Lubaklinggau Ulu, Lubuk Linggau Bar. II, Kota Lubuklinggau, Sumatera Selatan 31613", //pulao kemaro
            "Jl. Garuda, Ps. Permiri, Lubuk Linggau Bar. II, Kota Lubuklinggau, Sumatera Selatan 31613", //bkb
            "Ulak Surung, Lubuk Linggau Utara II, Kota Lubuklinggau, Sumatera Selatan 31613", //masjid agung
    };
    int images[] = {
            R.drawable.temam,
            R.drawable.warna,
            R.drawable.masjid2,
            R.drawable.tepian
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

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
