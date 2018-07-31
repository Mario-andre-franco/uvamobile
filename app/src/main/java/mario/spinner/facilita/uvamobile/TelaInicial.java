package mario.spinner.facilita.uvamobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.spinner.facilita.uvamobile.R;

public class TelaInicial extends AppCompatActivity {


    ImageButton presencial,presencial2,acontece;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);



        presencial = (ImageButton) findViewById(R.id.imageButton);

        presencial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(TelaInicial.this,janeiropresencial.class);
                startActivity(it);
    }
});


        presencial2 = (ImageButton) findViewById(R.id.imageButton2);

        presencial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(TelaInicial.this,ead.class);
                startActivity(it);
            }
        });


    acontece = (ImageButton) findViewById(R.id.imageButton3);

       acontece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(TelaInicial.this,tijuca.class);
                startActivity(it);}});}}

