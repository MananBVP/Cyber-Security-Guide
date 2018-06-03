package in.chandniagarwal.cybersecurityguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Information extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                this.onBackPressed();
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Information");

        String aboutText = "CSAO is an initiative to make the citizens cyber secure under the ages of Digital India Initiative started by the Government of India. Our mission is to aware, guide and educate each individual about cyber frauds that are taking place around them and provide them a piece of advice from the renowned cyber experts on the expert panel. \n" +
                "CSAO is a brain child of Ms. Chandni Agarwal, Senior IT Faculty at Maharaja Agrasen Model School. She has taken this initiative to make cyber secure society and worked with her team of students taking this step forward to aware all and solve the problems related to cyber world. It is our proud privilege to have Mr. Rakshit Tandon and Mr. Kshitij Adhlakha on Dour expert panel.\n" +
                "Student Team : Dhruv Aggarwal, Akshath Singhal, Jatin Katyal, Bipin Kalra, Harsh Aggarwal";

        TextView about = findViewById(R.id.about);
        about.setText(aboutText);
    }
}
