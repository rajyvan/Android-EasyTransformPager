package mg.yra.lib.sample;

import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by Yvan on 10/12/14.
 */

public abstract class AnimatedFragment extends Fragment {

    public abstract void transformPage(View view, float offset);

}
