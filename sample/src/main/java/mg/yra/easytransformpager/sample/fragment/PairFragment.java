package mg.yra.easytransformpager.sample.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import mg.yra.lib.AnimatedFragment;
import mg.yra.easytransformpager.sample.R;

/**
 * Created by Yvan on 09/12/14.
 */
public class PairFragment extends AnimatedFragment {

    private TextView textView;
    private TextView textView1;
    private TextView textView2;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pair, container, false);
        textView = (TextView) view.findViewById(R.id.textView);
        textView1 = (TextView) view.findViewById(R.id.textView1);
        textView2 = (TextView) view.findViewById(R.id.textView2);
        return view;
    }

    @Override
    public void transformPage(View view, float offset) {

        textView.setRotation(360 * (1 - offset));
        textView1.setTranslationX(-getView().getWidth() * offset * 0.25f);
        textView2.setAlpha(1 - offset);
        textView2.setTranslationX(getView().getWidth() * offset * 0.20f);

    }

}
