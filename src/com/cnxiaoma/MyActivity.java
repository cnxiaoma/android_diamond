package com.cnxiaoma;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MyActivity extends Activity
{
      /* 声明ImageView变量 */
      private ImageView mImageView1,mImageView2,mImageView3,mImageView4;
      /* 声明相关变量作为存储图片宽高,位置使用 */
      private int intWidth, intHeight;
      private float mX, mY;
      /* 声明存储屏幕的分辨率变量 */
      private int intScreenX, intScreenY;

      public void onCreate(Bundle savedInstanceState)
      {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        drawBackground();

        /* 取得屏幕对象 */
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        /* 取得屏幕解析像素 */
        intScreenX = dm.widthPixels;
        intScreenY = dm.heightPixels;

        /* 设置图片的宽高 */
        intWidth = intScreenX / 8;
        intHeight = intScreenX / 8;
        /* 通过findViewById构造器创建ImageView对象 */
        mImageView1 =(ImageView) findViewById(R.id.myImageView1);
        /* 将图片从Drawable赋值给ImageView来呈现 */
        mImageView1.setImageResource(R.drawable.dot1);

        mImageView2 =(ImageView) findViewById(R.id.myImageView2);
        /* 将图片从Drawable赋值给ImageView来呈现 */
        mImageView2.setImageResource(R.drawable.diamond2);

        /* 初始化按钮位置居中 */
        initView();

        /* 当点击ImageView，还原初始位置 */
        mImageView1.setOnClickListener(new Button.OnClickListener()
        {
          public void onClick(View v)
          {
          //  RestoreButton();
          }
        });
      }

      //加载背景颜色
      public void drawBackground()
      {
           GradientDrawable grad = new GradientDrawable(
                      Orientation.TL_BR,
                      new int[] {
                                     Color.rgb(0, 0, 127),
                                     Color.rgb(0, 0, 255),
                                     Color.rgb(127, 0, 255),
                                     Color.rgb(127, 127, 255),
                                     Color.rgb(127, 255, 255),
                                     Color.rgb(255, 255, 255)
                                 }
           );
           this.getWindow().setBackgroundDrawable(grad);
      }

      /* 还原ImageView位置的事件处理 */
      public void initView()
      {
        int intDefaultX, intDefaultY;
        intDefaultX = ((intScreenX-intWidth)/2);
        intDefaultY = ((intScreenY-intHeight)/2);

        /* 以setLayoutParams方法，重新安排Layout上的位置 */
        mImageView1.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX,intDefaultY)
        );
        mImageView2.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX+50,intDefaultY+50)
        );
      }
}