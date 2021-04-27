package com.vokasi.simplecanvas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Canvas mCanvas;
    private Paint mPaint = new Paint();
    private Paint mPaintText = new Paint(Paint.UNDERLINE_TEXT_FLAG);
    private Bitmap mBitmap;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = findViewById(R.id.my_imageview);
        mPaint.setColor(Color.YELLOW);
        mPaintText.setColor(ResourcesCompat.getColor(getResources(), R.color.purple_200, null));
        mPaintText.setTextSize(80);
    }

    public void drawSomething(View view) {
        int vWidth = view.getWidth();
        int vHeight = view.getHeight();
        mBitmap = Bitmap.createBitmap(vWidth, vHeight, Bitmap.Config.ARGB_8888);
        mImageView.setImageBitmap(mBitmap);
        mCanvas = new Canvas(mBitmap);
        mCanvas.drawColor(getResources().getColor(R.color.blue));
        mCanvas.drawText("Muhammad Qois HO", 100, 100, mPaintText);

            // Latihan Praktikum

//         mPaint.setColor(Color.BLUE);
//         mPaint.setStrokeWidth(10);
//         mCanvas.drawLine(100,150,400,150,mPaint);
//
//         mPaint.setColor(Color.RED);
//         Rect mRect=new Rect();
//         mRect.set(100,200,600,400);
//         mCanvas.drawRect(mRect,mPaint);
//
//         mPaint.setColor(Color.CYAN);
//         mCanvas.drawCircle(250,500,100,mPaint);

//        Path path=new Path();
//        path.moveTo(100,700);
//        path.lineTo(300,800);
//        path.lineTo(500,700);
//        path.lineTo(700,800);
//        mPaint.setColor(Color.MAGENTA);
//        mCanvas.drawPath(path,mPaint);

//        mPaint.setColor(Color.GRAY);
//        RectF rectf=new RectF();
//        rectf.set(100,200,600,400);
//        mCanvas.drawOval(rectf,mPaint);

        // Tugas Praktikum
        mPaint.setColor(Color.YELLOW);
        mCanvas.drawCircle(250, 500, 100, mPaint);

        Path rumah = new Path();
        rumah.moveTo(650, 700);
        rumah.lineTo(1000, 900);
        rumah.lineTo(1000, 1200);
        rumah.lineTo(300, 1200);
        rumah.lineTo(300, 900);
        mPaint.setColor(Color.WHITE);
        mCanvas.drawPath(rumah, mPaint);

        mPaint.setColor(Color.RED);
        Path atap = new Path();
        atap.moveTo(650, 700);
        atap.lineTo(1000, 900);
        atap.lineTo(300, 900);
        mCanvas.drawPath(atap, mPaint);

        Path pintu = new Path();
        pintu.moveTo(600, 1000);
        pintu.lineTo(600, 1200);
        pintu.lineTo(500, 1200);
        pintu.lineTo(500, 1000);
        mPaint.setColor(getResources().getColor(R.color.brown));
        mCanvas.drawPath(pintu, mPaint);

        Path jendela = new Path();
        jendela.moveTo(900, 1000);
        jendela.lineTo(900, 1100);
        jendela.lineTo(750, 1100);
        jendela.lineTo(750, 1000);
        mPaint.setColor(getResources().getColor(R.color.blue));
        mCanvas.drawPath(jendela, mPaint);

        Path tanah = new Path();
        tanah.moveTo(0, 1200);
        tanah.lineTo(0, 1800);
        tanah.lineTo(1200, 1800);
        tanah.lineTo(1200, 1200);
        mPaint.setColor(getResources().getColor(R.color.browno));
        mCanvas.drawPath(tanah, mPaint);

        Path jalan = new Path();
        jalan.moveTo(0, 1250);
        jalan.lineTo(0, 1550);
        jalan.lineTo(1200, 1550);
        jalan.lineTo(1200, 1250);
        mPaint.setColor(Color.BLACK);
        mCanvas.drawPath(jalan, mPaint);

        Path marka = new Path();
        marka.moveTo(300, 1370);
        marka.lineTo(300, 1400);
        marka.lineTo(600, 1400);
        marka.lineTo(600, 1370);
        mPaint.setColor(Color.WHITE);
        mCanvas.drawPath(marka, mPaint);

        Path marka1 = new Path();
        marka1.moveTo(0, 1370);
        marka1.lineTo(0, 1400);
        marka1.lineTo(200, 1400);
        marka1.lineTo(200, 1370);
        mPaint.setColor(Color.WHITE);
        mCanvas.drawPath(marka1, mPaint);

        Path marka2 = new Path();
        marka2.moveTo(700, 1370);
        marka2.lineTo(700, 1400);
        marka2.lineTo(1200, 1400);
        marka2.lineTo(1200, 1370);
        mPaint.setColor(Color.WHITE);
        mCanvas.drawPath(marka2, mPaint);


        view.invalidate();
    }
}