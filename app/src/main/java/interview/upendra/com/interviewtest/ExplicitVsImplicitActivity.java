package interview.upendra.com.interviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ExplicitVsImplicitActivity extends AppCompatActivity {


    //Explicit Intent invoke the android component from the Same Application
    //Implict Intent invoke the android component from the Other application via Using the Intent filter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_vs_implicit);
    }
}
