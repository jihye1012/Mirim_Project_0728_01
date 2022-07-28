package kr.hs.emirim.s2127.mirim_project_0728_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {
    Button btninc, btndec;
    RatingBar rb1, rb2, rb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btninc = findViewById(R.id.btn_inc);
        btndec = findViewById(R.id.btn_dec);
        rb1 = findViewById(R.id.rating_small);
        rb2 = findViewById(R.id.rating_medium);
        rb3 = findViewById(R.id.rating_basic);
        btninc.setOnClickListener(btnListener);
        btndec.setOnClickListener(btnListener);

    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_inc:
                    rb1.setRating(rb1.getRating()+rb1.getStepSize());
                    rb2.setRating(rb2.getRating()+rb2.getStepSize());
                    rb3.setRating(rb3.getRating()+rb3.getStepSize());
                    break;

                case R.id.btn_dec:
                    rb1.setRating(rb1.getRating()-rb1.getStepSize());
                    rb2.setRating(rb2.getRating()-rb2.getStepSize());
                    rb3.setRating(rb3.getRating()-rb3.getStepSize());
                    break;

            }
        }
    };
}
