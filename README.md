Android-EasyTransformPager
==========================
Making amazing animation with ViewPager is not ever a pain!
<p>This is a library which make easier the use of page transformer in Android ViewPager. Instead of creating a custom pager transform and make all work manually, just use the EasyTransformPager with its own fragment pager adapter and its own fragment. It allows you, by overriding just one method, to make any view independent animation.</p>
<br>
<br>

! [Let's see below](/docs/easytransformpager.gif)

Usage
==========================
For a simple implementation, take a look at the "sample" directory.

1. Include the library as a local library porject or add the dependence in your build.gradle.
       
        dependencies {
            compile 'com.github.rajyvan:EasyTransformPager:1.1'
        }

2. Include the EasyTransformPager in your layout. It should replace the android support ViewPager.
      
             <mg.yra.lib.AnimatedViewPager
              android:layout_height="match_parent"
              android:layout_width="match_parent" />

3. Extend from AnimatedPagerAdapter. It's a FragmentStatePagerAdapter. You should return a AnimatedFragment type.
        
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

4. For every AnimatedFragment, override the method transformPage(View view, float offset). 
   <br>View is the main view container that you inflate inside your fragment.
   <br>Offset represents the percentage of visibility of your fragment page according to screen width. Offset equals 0 for invisible page, 1 for full visible page.

        
        @Override
        public void transformPage(View view, float offset) {
               // TODO
               // Example
              view.findViewById(R.id.textView).setAlpha(1-offset);
              view.setTranslationY((float) ((1 - offset) * 0.32 * view.getWidth()) * offset);
              view.setRotation(360 * offset);
              view.setAlpha(1-offset);
        }
              
       

Changelog
==========================
Current version : 1.1

Developed by
==========================

Yvan RAJAONARIVONY
yvan.rajaonarivony@gmail.com
