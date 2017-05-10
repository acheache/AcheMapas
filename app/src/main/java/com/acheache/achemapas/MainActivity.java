package com.acheache.achemapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity  {

//    LinearLayout banco,hospital,hotel,plaza;
//    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        banco = (LinearLayout) findViewById(R.id.banco);
//        hospital = (LinearLayout) findViewById(R.id.hospital);
//        hotel = (LinearLayout) findViewById(R.id.hotel);
//        plaza = (LinearLayout) findViewById(R.id.plaza);
//
//
//
//        banco.setOnClickListener(this);
//        hospital.setOnClickListener(this);
//        hotel.setOnClickListener(this);
//        plaza.setOnClickListener(this);

    }


    public void goMap(View view)
    {
        Intent i = new Intent(this, MapsActivity.class);

        switch (view.getId())
        {
            case R.id.banco:
                i.putExtra("LUGAR", "Banco de la Nacion");
                i.putExtra("LATITUD", -9.528985309753622);
                i.putExtra("LONGITUD", -77.52899223414101);
                i.putExtra("PUNTERO", R.drawable.pbanco);
                break;

            case R.id.hospital:
                i.putExtra("LUGAR", "Hospital Victor Ramos Guardia");
                i.putExtra("LATITUD", -9.53427302326809);
                i.putExtra("LONGITUD", -77.52912232127824);
                i.putExtra("PUNTERO", R.drawable.phospital);
                break;

            case R.id.hotel:
                i.putExtra("LUGAR", "Hotel La Joya");
                i.putExtra("LATITUD", -9.533728251064273);
                i.putExtra("LONGITUD", -77.53053850613425);
                i.putExtra("PUNTERO", R.drawable.photel);
                break;

            case R.id.plaza:
                i.putExtra("LUGAR", "Plaza de Armas");
                i.putExtra("LATITUD", -9.529979903444355);
                i.putExtra("LONGITUD", -77.5288822635714);
                i.putExtra("PUNTERO", R.drawable.pplaza);
                break;
        }
        startActivity(i);

    }
}
