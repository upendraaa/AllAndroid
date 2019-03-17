package interview.upendra.com.interviewtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by upendra on 09/03/19.
 *
 * To create the fragment dynamically FragmentA and FragmentB
 * 1) In activity layout create two frame for Fragments
 * 2) FragmentA layout contain EditText and a button
 * 3) FragmentB contain text view
 * 4) Both the fragment USER can see on the mobile at same time
 * 5) Enter input on FragmentA, on click on button data should display on FragmentB
 *
 *
 * https://medium.com/@bherbst/managing-the-fragment-back-stack-373e87e4ff62
 */




public class FragmentActivity extends AppCompatActivity implements OnButtonSubmit {


    FragmentA fragmentA;
    FragmentB fragmentB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmentlayout);

        fragmentA = new FragmentA();
        fragmentB = new FragmentB();

        FragmentTransaction transaction =
                getSupportFragmentManager().beginTransaction();

        transaction.add(R.id.fragmentA, fragmentA);
        transaction.add(R.id.fragmentB, fragmentB);

        transaction.commit();

    }

    @Override
    public void onSubmit(String input) {

        fragmentB.onSubmit(input);

    }
}
