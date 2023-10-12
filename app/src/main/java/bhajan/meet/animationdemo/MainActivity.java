package bhajan.meet.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView imageView;
    Animation anim_fade_in, anim_fade_out,anim_move_up,anim_move_down,anim_move_left,anim_move_right,
            anim_rotate, anim_zoom_in, anim_zoom_out, anim_slide_up, anim_slide_down, anim_slide_left, anim_slide_right,
            anim_bounce, anim_blink, anim_interpolater;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image);

        findViewById(R.id.btn_fade_in).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim_fade_in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(anim_fade_in);
            }
        });

        findViewById(R.id.btn_fade_out).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim_fade_out = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadeout);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(anim_fade_out);
            }
        });

        findViewById(R.id.btn_move_up).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim_move_up = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.moveup);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(anim_move_up);
            }
        });

        findViewById(R.id.btn_move_down).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim_move_down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.movedown);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(anim_move_down);
            }
        });

        findViewById(R.id.btn_move_left).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim_move_left = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.moveleft);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(anim_move_left);
            }
        });

        findViewById(R.id.btn_move_right).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim_move_right= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.moveright);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(anim_move_right);
            }
        });

        findViewById(R.id.btn_rotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim_rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(anim_rotate);
            }
        });

        findViewById(R.id.btn_zoom_in).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim_zoom_in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(anim_zoom_in);
            }
        });

        findViewById(R.id.btn_zoom_out).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim_zoom_out = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(anim_zoom_out);
            }
        });

        findViewById(R.id.btn_slide_up).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim_slide_up = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slideup);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(anim_slide_up);
            }
        });

        findViewById(R.id.btn_slide_down).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim_slide_down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slidedown);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(anim_slide_down);
            }
        });

        findViewById(R.id.btn_slide_right).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim_slide_right = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slideright);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(anim_slide_right);
            }
        });

        findViewById(R.id.btn_slide_left).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim_slide_left = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slideleft);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(anim_slide_left);
            }
        });

        findViewById(R.id.btn_bounce).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim_bounce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(anim_bounce);
            }
        });

        findViewById(R.id.btn_blink).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim_blink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(anim_blink);
            }
        });

        findViewById(R.id.btn_interpolater).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim_interpolater = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.interpolater);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(anim_interpolater);
            }
        });
    }
}