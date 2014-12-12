package mg.yra.lib.sample;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Yvan on 08/12/14.
 */
public class AnimatedViewPager extends ViewPager {

    public AnimatedViewPager(Context context) {
        super(context);
    }

    public AnimatedViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onPageScrolled(int position, float offset, int offsetPixels) {
        super.onPageScrolled(position, offset, offsetPixels);
        final int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            final View child = getChildAt(i);

            final LayoutParams lp = (LayoutParams) child.getLayoutParams();
            if (lp.isDecor) continue;

            AnimatedPagerAdapter adapter = (AnimatedPagerAdapter) getAdapter();
            if (adapter != null) {
                final AnimatedFragment fragment = adapter.getFragment(position, i);
                if (fragment != null) {
                    fragment.transformPage(child, i == 0 ? offset : 1 - offset);
                }
            }
        }
    }

}
