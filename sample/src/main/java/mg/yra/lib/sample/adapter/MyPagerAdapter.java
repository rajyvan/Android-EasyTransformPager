package mg.yra.lib.sample.adapter;

import android.support.v4.app.FragmentManager;

import mg.yra.lib.sample.AnimatedFragment;
import mg.yra.lib.sample.AnimatedPagerAdapter;
import mg.yra.lib.sample.fragment.ImpairFragment;
import mg.yra.lib.sample.fragment.PairFragment;

/**
 * Created by Yvan on 09/12/14.
 */
public class MyPagerAdapter extends AnimatedPagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public AnimatedFragment getItem(int position) {
        if (position % 2 == 0)
            return new PairFragment();
        else
            return new ImpairFragment();
    }

    @Override
    public int getCount() {
        return 10;
    }
}
