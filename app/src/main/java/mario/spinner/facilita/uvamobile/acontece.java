package mario.spinner.facilita.uvamobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.spinner.facilita.uvamobile.R;

public class acontece extends AppCompatActivity {


    private ImageButton acontecetijuca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acontece);


        acontecetijuca = (ImageButton) findViewById(R.id.imageButton4);


        acontecetijuca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itijuca = new Intent(acontece.this,tijuca.class);

                startActivity(itijuca);
            }
        });
    }


}

