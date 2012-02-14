package com.cnxiaoma;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.ImageView;

public class MyActivity extends Activity
{
      /* 声明ImageView变量 */
      private ImageView mImageView1,mImageView2,mImageView3,mImageView4,mImageView5,mImageView6,mImageView7,mImageView8;
      private ImageView mImageView9,mImageView10,mImageView11,mImageView12,mImageView13,mImageView14,mImageView15,mImageView16;
      private ImageView mImageView17,mImageView18,mImageView19,mImageView20,mImageView21,mImageView22,mImageView23,mImageView24;
      private ImageView mImageView25,mImageView26,mImageView27,mImageView28,mImageView29,mImageView30,mImageView31,mImageView32,mImageView33;

      /* 声明存储屏幕的分辨率变量 */
      private int intScreenX, intScreenY;
      private float mX, mY;

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

        /* 初始化图片 */
        initSetImage();

        /* 初始化棋盘 */
        initView();

        /* 当点击ImageView，移动 */
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

      public void initSetImage()
      {
        mImageView1 =(ImageView) findViewById(R.id.myImageView1);
        mImageView1.setImageResource(R.drawable.diamond1);
        mImageView2 =(ImageView) findViewById(R.id.myImageView2);
        mImageView2.setImageResource(R.drawable.diamond1);
        mImageView3 =(ImageView) findViewById(R.id.myImageView3);
        mImageView3.setImageResource(R.drawable.diamond1);
        mImageView4 =(ImageView) findViewById(R.id.myImageView4);
        mImageView4.setImageResource(R.drawable.diamond1);
        mImageView5 =(ImageView) findViewById(R.id.myImageView5);
        mImageView5.setImageResource(R.drawable.diamond1);
        mImageView6 =(ImageView) findViewById(R.id.myImageView6);
        mImageView6.setImageResource(R.drawable.diamond1);
        mImageView7 =(ImageView) findViewById(R.id.myImageView7);
        mImageView7.setImageResource(R.drawable.diamond1);
        mImageView8 =(ImageView) findViewById(R.id.myImageView8);
        mImageView8.setImageResource(R.drawable.diamond1);
        mImageView9 =(ImageView) findViewById(R.id.myImageView9);
        mImageView9.setImageResource(R.drawable.diamond1);
        mImageView10 =(ImageView) findViewById(R.id.myImageView10);
        mImageView10.setImageResource(R.drawable.diamond1);
        mImageView11 =(ImageView) findViewById(R.id.myImageView11);
        mImageView11.setImageResource(R.drawable.diamond1);
        mImageView12 =(ImageView) findViewById(R.id.myImageView12);
        mImageView12.setImageResource(R.drawable.diamond1);
        mImageView13 =(ImageView) findViewById(R.id.myImageView13);
        mImageView13.setImageResource(R.drawable.diamond1);
        mImageView14 =(ImageView) findViewById(R.id.myImageView14);
        mImageView14.setImageResource(R.drawable.diamond1);
        mImageView15 =(ImageView) findViewById(R.id.myImageView15);
        mImageView15.setImageResource(R.drawable.diamond1);
        mImageView16 =(ImageView) findViewById(R.id.myImageView16);
        mImageView16.setImageResource(R.drawable.diamond1);
        mImageView17 =(ImageView) findViewById(R.id.myImageView17);
        mImageView17.setImageResource(R.drawable.dot1);
        mImageView18 =(ImageView) findViewById(R.id.myImageView18);
        mImageView18.setImageResource(R.drawable.diamond1);
        mImageView19 =(ImageView) findViewById(R.id.myImageView19);
        mImageView19.setImageResource(R.drawable.diamond1);
        mImageView20 =(ImageView) findViewById(R.id.myImageView20);
        mImageView20.setImageResource(R.drawable.diamond1);
        mImageView21 =(ImageView) findViewById(R.id.myImageView21);
        mImageView21.setImageResource(R.drawable.diamond1);
        mImageView22 =(ImageView) findViewById(R.id.myImageView22);
        mImageView22.setImageResource(R.drawable.diamond1);
        mImageView23 =(ImageView) findViewById(R.id.myImageView23);
        mImageView23.setImageResource(R.drawable.diamond1);
        mImageView24 =(ImageView) findViewById(R.id.myImageView24);
        mImageView24.setImageResource(R.drawable.diamond1);
        mImageView25 =(ImageView) findViewById(R.id.myImageView25);
        mImageView25.setImageResource(R.drawable.diamond1);
        mImageView26 =(ImageView) findViewById(R.id.myImageView26);
        mImageView26.setImageResource(R.drawable.diamond1);
        mImageView27 =(ImageView) findViewById(R.id.myImageView27);
        mImageView27.setImageResource(R.drawable.diamond1);
        mImageView28 =(ImageView) findViewById(R.id.myImageView28);
        mImageView28.setImageResource(R.drawable.diamond1);
        mImageView29 =(ImageView) findViewById(R.id.myImageView29);
        mImageView29.setImageResource(R.drawable.diamond1);
        mImageView30 =(ImageView) findViewById(R.id.myImageView30);
        mImageView30.setImageResource(R.drawable.diamond1);
        mImageView31 =(ImageView) findViewById(R.id.myImageView31);
        mImageView31.setImageResource(R.drawable.diamond1);
        mImageView32 =(ImageView) findViewById(R.id.myImageView32);
        mImageView32.setImageResource(R.drawable.diamond1);
        mImageView33 =(ImageView) findViewById(R.id.myImageView33);
        mImageView33.setImageResource(R.drawable.diamond1);
      }

      public void initView()
      {
      /* 声明相关变量作为存储图片宽高,位置使用 */
        int intWidth, intHeight, intSpace;
        int intDefaultX, intDefaultY;

        /* 设置图片的宽高 */
        intWidth = intScreenX / 8;
        intHeight = intScreenX / 8;
        intSpace = intWidth + intWidth / 7;

        /* 得到中心点坐标基准位置　*/
        intDefaultX = ((intScreenX-intWidth)/2);
        intDefaultY = ((intScreenY-intHeight)/2);

        /* 以setLayoutParams方法，重新安排Layout上的位置 */
        mImageView1.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX-intSpace,intDefaultY- 3*intSpace)
        );
        mImageView2.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX,intDefaultY- 3*intSpace)
        );
        mImageView3.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX+intSpace,intDefaultY- 3*intSpace)
        );
        mImageView4.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX-intSpace,intDefaultY- 2*intSpace)
        );
        mImageView5.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX,intDefaultY- 2*intSpace)
        );
        mImageView6.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX+intSpace,intDefaultY- 2*intSpace)
        );
        mImageView7.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX -3*intSpace,intDefaultY - intSpace)
        );
        mImageView8.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX -2*intSpace,intDefaultY - intSpace)
        );
        mImageView9.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX - intSpace,intDefaultY - intSpace)
        );
        mImageView10.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX,intDefaultY - intSpace)
        );
        mImageView11.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX + intSpace,intDefaultY - intSpace)
        );
        mImageView12.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX + 2*intSpace,intDefaultY - intSpace)
        );
        mImageView13.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX + 3*intSpace,intDefaultY - intSpace)
        );
        mImageView14.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX -3*intSpace,intDefaultY)
        );
        mImageView15.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX -2*intSpace,intDefaultY)
        );
        mImageView16.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX - intSpace,intDefaultY)
        );
        mImageView17.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX,intDefaultY)
        );
        mImageView18.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX + intSpace,intDefaultY)
        );
        mImageView19.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX +2*intSpace,intDefaultY)
        );
        mImageView20.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX +3*intSpace,intDefaultY)
        );
        mImageView21.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX -3*intSpace,intDefaultY + intSpace)
        );
        mImageView22.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX -2*intSpace,intDefaultY + intSpace)
        );
        mImageView23.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX -intSpace,intDefaultY + intSpace)
        );
        mImageView24.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX,intDefaultY + intSpace)
        );
        mImageView25.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX + intSpace,intDefaultY + intSpace)
        );
        mImageView26.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX + 2*intSpace,intDefaultY + intSpace)
        );
        mImageView27.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX + 3*intSpace,intDefaultY + intSpace)
        );
        mImageView28.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX - intSpace,intDefaultY + 2*intSpace)
        );
        mImageView29.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX,intDefaultY + 2*intSpace)
        );
        mImageView30.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX + intSpace ,intDefaultY + 2*intSpace)
        );
        mImageView31.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX - intSpace,intDefaultY + 3*intSpace)
        );
        mImageView32.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX,intDefaultY + 3*intSpace)
        );
        mImageView33.setLayoutParams
        (
          new AbsoluteLayout.LayoutParams
          (intWidth,intHeight,intDefaultX + intSpace,intDefaultY + 3*intSpace)
        );
      }
}