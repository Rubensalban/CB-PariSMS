package cg.rubens_alban.majitechnologie.cb_parisms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.kosalgeek.android.caching.FileCacheManager;

import java.util.ArrayList;
import java.util.List;

import cg.rubens_alban.majitechnologie.cb_parisms.football.ParisFootActivity;

public class MainActivity extends AppCompatActivity {

    private ImageSlider imageSlider;
    private ImageButton btn_foot, btn_pmu, btn_loto;
    private boolean singleBack = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Init
        imageSlider = findViewById(R.id.slider);
        btn_foot = findViewById(R.id.btn_paris_foot);
        btn_loto = findViewById(R.id.btn_paris_loto);
        btn_pmu = findViewById(R.id.btn_paris_pmu);

        //Header Slider
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.slide_1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slide_1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slide_1, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels);

        //Fooball Animation
        btn_foot.setAlpha(0f);
        btn_foot.setTranslationY(50);
        btn_foot.animate().alpha(1f).translationYBy(-50).setDuration(1500);
        //Pmu Animation
        btn_pmu.setAlpha(0f);
        btn_pmu.setTranslationY(50);
        btn_pmu.animate().alpha(1f).translationYBy(-50).setDuration(2000);
        //Loto Animation
        btn_loto.setAlpha(0f);
        btn_loto.setTranslationY(50);
        btn_loto.animate().alpha(1f).translationYBy(-50).setDuration(2500);

        //FOOT
        btn_foot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_foot = new Intent(MainActivity.this, ParisFootActivity.class);
                startActivity(intent_foot);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        //PMU
        btn_pmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PMU en cours de developpement", Toast.LENGTH_SHORT).show();
            }
        });

        //LOTO
        btn_loto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "LOTO en cours de developpement", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (singleBack) {
            super.onBackPressed();
            return;
        }
        this.singleBack = true;
        Toast.makeText(this, getString(R.string.exit_to_app), Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                singleBack = false;
                clear_data_cache();
            }
        }, 2000);
    }

    private void clear_data_cache() {
        FileCacheManager all = new FileCacheManager(MainActivity.this);
        if(all.hasCacheFiles()){
            all.deleteAllCaches();
        }
    }
}