package interview.upendra.com.interviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ImplicitActivity extends AppCompatActivity {


    //This Activity contain the Intent filter in android manifest file
    //"interview.upendra.com.interviewtest.ImplicitActivity"
    //On call of above intent filter Other application can Invoke this activity

    //To call this activity from the other application
    // Intent intent = new Intent(Intent filter name)
    // startActivity(intent)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);



    }
}
