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

public class FifthActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = { //nama tempat
            "Gunung Dempo",
            "Lematang Indah Air Terjun",
            "Green Paradise",
            "Curup Embun",
            "Tebat Gheban",
            "Tugu Rimau",
            "Villa Dempo",
            "Mushola tangga 2001",
    };

    String mDescription[] = {
            "Ketinggian: 3.173 m, Letak: Sumatra, Indonesia", //dempo
            "Prahu Dipo, Dempo Sel., Kota Pagar Alam, Sumatera Selatan 31521", //lematang
            "Bumi Agung, Dempo Utara, Kota Pagar Alam, Sumatera Selatan 31581", //green
            "Dempio Makmur, Pagar Alam Utara, Kota Pagar Alam, Sumatera Selatan 31581", //curup
            "Alun Dua, Pagar Alam Utara, Kota Pagar Alam, Sumatera Selatan 31518", //tebat
            "Gn. Dempo, Pagar Alam Sel., Kota Pagar Alam, Sumatera Selatan 31581", //rimau
            "Gn. Dempo, Pagar Alam Sel., Kota Pagar Alam, Sumatera Selatan 31581",
            "Gn. Dempo, Pagar Alam Sel., Kota Pagar Alam, Sumatera Selatan 31581",
    };
    int images[] = {
            R.drawable.dempo,
            R.drawable.lematang,
            R.drawable.green,
            R.drawable.curup,
            R.drawable.tebat,
            R.drawable.rimau,
            R.drawable.villa,
            R.drawable.musholla
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

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
