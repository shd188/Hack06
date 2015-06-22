package com.aimer.shd188.hack06;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mListView= (ListView) findViewById(R.id.listView);
        String[] arr=new String[20];
        for (int i=0;i<arr.length;i++){
           arr[i]="test:"+(i+1);
        }
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr);
        mListView.setAdapter(adapter);
        //创建默认动画集合对象
        AnimationSet set=new AnimationSet(true);
        //创建透明度渐变动画
        Animation animation=new AlphaAnimation(0.0f,1.0f);
        animation.setDuration(500);
        set.addAnimation(animation);
        //创建位移动画
        animation=new TranslateAnimation(Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,-1.0f,Animation.RELATIVE_TO_SELF,0.0f);
        animation.setDuration(1000);
        set.addAnimation(animation);
        //创建LayoutAnimationConntroller对象并设置子视图动画效果持续时间
        LayoutAnimationController controller=new LayoutAnimationController(set,0.5f);
        mListView.setLayoutAnimation(controller);
    }


}
