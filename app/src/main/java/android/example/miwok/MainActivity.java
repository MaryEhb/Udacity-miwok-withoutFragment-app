package android.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find views
        TextView number = (TextView) findViewById(R.id.numbers);
        TextView family = (TextView) findViewById(R.id.family);
        TextView phrases = (TextView) findViewById(R.id.phrases);
        TextView colors = (TextView) findViewById(R.id.colors);

        // set click listeners
        //number
        number.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent numberIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numberIntent);
            }
        });

        //family
        family.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        //phrases
        phrases.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

        //colors
        colors.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

    }
//
//    public void openNumberList(View view){
//        Intent intent = new Intent(this, NumbersActivity.class);
//        startActivity(intent);
//    }
//
//    public void openFamilyList(View view){
//        Intent intent = new Intent(this, FamilyActivity.class);
//        startActivity(intent);
//    }
//
//    public void openPhasesList(View view){
//        Intent intent = new Intent(this, PhrasesActivity.class);
//        startActivity(intent);
//    }
//
//    public void openColorsList(View view){
//        Intent intent = new Intent(this, ColorsActivity.class);
//        startActivity(intent);
//    }
}