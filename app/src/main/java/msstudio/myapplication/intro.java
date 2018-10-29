package msstudio.myapplication;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class intro extends AppCompatActivity {
   ImageView imageView;
    ArcTranslate animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro);
        imageView = (ImageView) findViewById(R.id.animated);
        animation = new ArcTranslate(3000, Animation.ABSOLUTE,300,500,Animation.ABSOLUTE,200,500);
        //ObjectAnimator translateAnimator =(ObjectAnimator) animation;
        //AnimatorSet an=  new ArcTranslate(1000, Animation.ABSOLUTE,300,500,Animation.ABSOLUTE,100,1000) ;
        Button btn = (Button) findViewById(R.id.button);
        imageView.setAnimation(animation);
        TextView textView2 = (TextView) findViewById(R.id.textView);
        Typeface myNewTypeface = Typeface.createFromAsset(intro.this.getAssets(), "font/mer.otf");
        textView2.setTypeface(myNewTypeface);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator animation = ObjectAnimator.ofFloat(imageView, "translationY", -700f);
                ObjectAnimator imageViewObjectAnimator = ObjectAnimator.ofFloat(imageView ,
                        "rotation", 0f, 360f);
                imageViewObjectAnimator.setDuration(1000); // miliseconds
                imageViewObjectAnimator.start();
                animation.setDuration(1000);
                animation.start();
                Intent mIntent = new Intent(intro.this, Main2Activity.class);
                startActivity(mIntent);


            }
        });

    }
}
