package com.lukmannudin.assosiate.mvctutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    private String name,rarity,set,image;
    private TextView tvName,tvRarity,tvSet;
    private ImageView ivImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //pengambilan data intent
        name = getIntent().getStringExtra("name");
        rarity = getIntent().getStringExtra("rarity");
        set = getIntent().getStringExtra("set");
        image = getIntent().getStringExtra("image");

        //binding view
        tvName = findViewById(R.id.nama);
        tvRarity = findViewById(R.id.rarity);
        tvSet = findViewById(R.id.set);
        ivImage = findViewById(R.id.image_card);

        //setdata untuk views
        tvName.setText(name);
        tvRarity.setText(rarity);
        tvSet.setText(set);
        Glide.with(this)
                .load(image)
                .into(ivImage);
    }

}
