package interview.upendra.com.interviewtest;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

/**
 * Created by upendra on 09/03/19.
 */

public class FragmentA extends Fragment {


    OnButtonSubmit onButtonSubmit;

    AutoCompleteTextView autoCompleteTextView;
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }



    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_fragmenta, container,false);

        autoCompleteTextView = (AutoCompleteTextView) view.findViewById(R.id.etInput);
        button = (Button) view.findViewById(R.id.btnSubmit);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonSubmit.onSubmit(autoCompleteTextView.getText().toString());
            }
        });

        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        onButtonSubmit = (OnButtonSubmit) getActivity();
    }
}
