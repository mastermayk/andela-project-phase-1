package kingzappstudio.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //creating butons
    Button aboutAlc,myProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing the buttons
        aboutAlc=(Button)findViewById(R.id.aboutAlc);
        myProfile=(Button)findViewById(R.id.myProfile);

        //now creatin an onclick listener to listen to click events for the created buttons
        aboutAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this,AboutAlc.class);
                startActivity(intent);

            }
        });

        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this,MyProfile.class);
                startActivity(intent);

            }
        });
    }
}
