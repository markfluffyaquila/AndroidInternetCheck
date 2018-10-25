package in.blogspot.fadedib.networkcheck;

import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtCheck = findViewById(R.id.check);

        ConnectionCheck connectionCheck = new ConnectionCheck(this);


        if (connectionCheck.isOnline()){
            txtCheck.setText(R.string.connected);
        }else{
            txtCheck.setText(R.string.not_connected);
        }
    }
}
