package com.example.pityu.cinemaarta;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

        final TextView tx = (TextView) findViewById(R.id.marqueText);
        tx.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        tx.setSelected(true);
        tx.setSingleLine(true);
        tx.setText(R.string.marqueTextData);

        TextView customTextView1 = (TextView) findViewById(R.id.openingHours);
        Typeface myCustomFont1 = Typeface.createFromAsset(getAssets(), "fonts/for1.ttf");
        customTextView1.setTypeface(myCustomFont1);

        TextView customTextView2 = (TextView) findViewById(R.id.address);
        customTextView2.setTypeface(myCustomFont1);

        ImageView makeCall = (ImageView) findViewById(R.id.callicon);
        makeCall.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse("tel:0787526102")));

            }
        });

        ImageView imgReservation = (ImageView)findViewById(R.id.makereservation);
        imgReservation.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.arta.cityplex.ro")));
            }
        });

        ImageView imgGooglePlus = (ImageView)findViewById(R.id.googleplus);
        imgGooglePlus .setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com")));
            }
        });

        ImageView imgFacebook = (ImageView)findViewById(R.id.facebookpage);
        imgFacebook .setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ArtaMuvesz")));
            }
        });

        ImageView imgTwitter = (ImageView)findViewById(R.id.twitterpage);
        imgTwitter .setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com")));
            }
        });

    }
}

