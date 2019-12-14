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
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;

public class FourthActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = { //nama tempat
            "Air Terjun Tangga Manik",
            "Wahana Alam WaterBoom",
            "Jembatan Benteng",
    };

    String mDescription[] = {
            "Wisata Tangge manik, Tj. Payang, Kec. Lahat, Kabupaten Lahat, Sumatera Selatan 31461", //deskripsi tempat
            "Tj. Payang, Kec. Lahat, Kabupaten Lahat, Sumatera Selatan 31461", //pulao kemaro
            "Jl. Jembatan Sungai Lematang, Tj. Payang, Kec. Lahat, Kabupaten Lahat, Sumatera Selatan 31461", //bkb

    };
    int images[] = {
            R.drawable.manik,
            R.drawable.waterboom,
            R.drawable.benteng,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

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
