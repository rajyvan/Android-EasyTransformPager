Android-EasyTransformPager
==========================
Making amazing animation with ViewPager is not ever a pain!
<p>This is a library which make easier the use of page transformer in Android ViewPager. Instead of creating a custom pager transform and make all work manually, just use the EasyTransformPager with its own fragment pager adapter and its own fragment. It allows you, by overriding just one method, to make any view independent animation.</p>
<br>
<br>
![Let's see below](/docs/easytransformpager.gif?raw=true "Optional Title")

Usage
==========================
For a simple implementation, take a look at the "sample" directory.

1. Include the library as a local library porject or add the dependence in your build.gradle.
       
        dependencies {
            compile 'com.github.rajyvan:EasyTransformPager:1.0'
        }

2. Include the EasyTransformPager in your layout. It should replace the android support ViewPager.
       <mg.yra.lib.sample.AnimatedViewPager
            android:id="@+id/titles"
            android:layout_height="wrap_content"
            android:layout_width="fill_parent" />

3. Extend from AnimatedPagerAdapter.

        
        public class MyPagerAdapter extends AnimatedPagerAdapter {
              public MyPagerAdapter(FragmentManager fm) {
                     super(fm);
              }
        
              @Override
              public AnimatedFragment getItem(int position) {
                     // TODO
                     return null;
              }
        
              @Override
              public int getCount() {
                     return 10;
              }
        }
