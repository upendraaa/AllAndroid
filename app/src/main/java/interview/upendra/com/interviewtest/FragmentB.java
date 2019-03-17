package interview.upendra.com.interviewtest;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by upendra on 09/03/19.
 */

public class FragmentB extends Fragment {


    TextView textView;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }



    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_fragmentb, container,false);

        textView = (TextView) view.findViewById(R.id.tvInput);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    public void onSubmit(String input) {
        textView.setText(input);
    }
}
