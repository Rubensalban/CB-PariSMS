package cg.rubens_alban.majitechnologie.cb_parisms.football;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.kosalgeek.android.caching.FileCacheManager;
import com.kosalgeek.android.caching.FileCacher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import cg.rubens_alban.majitechnologie.cb_parisms.MainActivity;
import cg.rubens_alban.majitechnologie.cb_parisms.R;
import cg.rubens_alban.majitechnologie.cb_parisms.football.dialog.Dialog1;
import cg.rubens_alban.majitechnologie.cb_parisms.football.dialog.Dialog10;
import cg.rubens_alban.majitechnologie.cb_parisms.football.dialog.Dialog2;
import cg.rubens_alban.majitechnologie.cb_parisms.football.dialog.Dialog3;
import cg.rubens_alban.majitechnologie.cb_parisms.football.dialog.Dialog4;
import cg.rubens_alban.majitechnologie.cb_parisms.football.dialog.Dialog5;
import cg.rubens_alban.majitechnologie.cb_parisms.football.dialog.Dialog6;
import cg.rubens_alban.majitechnologie.cb_parisms.football.dialog.Dialog7;
import cg.rubens_alban.majitechnologie.cb_parisms.football.dialog.Dialog8;
import cg.rubens_alban.majitechnologie.cb_parisms.football.dialog.Dialog9;
import customfonts.EditText_Regular;

public class ParisFootActivity extends AppCompatActivity {

    private static String EXTRA_NETWORK;
    private EditText_Regular card1_edit, card2_edit, card3_edit, card4_edit, card5_edit, card6_edit, card7_edit, card8_edit, card9_edit, card10_edit;
    private TextView card1_text, card2_text, card3_text, card4_text, card5_text, card6_text, card7_text, card8_text, card9_text, card10_text;
    private ImageButton card1_btn, card2_btn, card3_btn, card4_btn, card5_btn, card6_btn, card7_btn, card8_btn, card9_btn, card10_btn;
    private AppCompatButton btn_send_sms, btn_cancel_sms, btn_network, btn_cancel;
    private String my_1, my_2, my_3, my_4, my_5, my_6, my_7;
    private String my_8, my_9, my_10;
    private EditText ma_mise;
    private int checkedItem;
    private ProgressBar progressBar;
    private ProgressDialog progressDialog;
    private Toolbar toolbar;
    private CardView cardView_1, cardView_2, cardView_3, cardView_4, cardView_5, cardView_6, cardView_7, cardView_8, cardView_9,
            cardView_10;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paris_foot);

        // BTN
        btn_send_sms = findViewById(R.id.btn_bet_validate_sms);
        btn_cancel_sms = findViewById(R.id.btn_bet_cancel_sms);
        ma_mise = findViewById(R.id.match_mise);
        btn_network = findViewById(R.id.btn_network_choice);
        //ID CARD EDIT
        toolbar = findViewById(R.id.toolbar_foot);
        card1_edit = findViewById(R.id.card1_code);
        card2_edit = findViewById(R.id.card2_code);
        card3_edit = findViewById(R.id.card3_code);
        card4_edit = findViewById(R.id.card4_code);
        card5_edit = findViewById(R.id.card5_code);
        card6_edit = findViewById(R.id.card6_code);
        card7_edit = findViewById(R.id.card7_code);
        card8_edit = findViewById(R.id.card8_code);
        card9_edit = findViewById(R.id.card9_code);
        card10_edit = findViewById(R.id.card10_code);
        // ID CARD TEXT
        card1_text = findViewById(R.id.card1_text);
        card2_text = findViewById(R.id.card2_text);
        card3_text = findViewById(R.id.card3_text);
        card4_text = findViewById(R.id.card4_text);
        card5_text = findViewById(R.id.card5_text);
        card6_text = findViewById(R.id.card6_text);
        card7_text = findViewById(R.id.card7_text);
        card8_text = findViewById(R.id.card8_text);
        card9_text = findViewById(R.id.card9_text);
        card10_text = findViewById(R.id.card10_text);
        // ID CARD BTN
        card1_btn = findViewById(R.id.card1_btn);
        card2_btn = findViewById(R.id.card2_btn);
        card3_btn = findViewById(R.id.card3_btn);
        card4_btn = findViewById(R.id.card4_btn);
        card5_btn = findViewById(R.id.card5_btn);
        card6_btn = findViewById(R.id.card6_btn);
        card7_btn = findViewById(R.id.card7_btn);
        card8_btn = findViewById(R.id.card8_btn);
        card9_btn = findViewById(R.id.card9_btn);
        card10_btn = findViewById(R.id.card10_btn);

        //Card Init
        cardView_1 = findViewById(R.id.card_1);
        cardView_2 = findViewById(R.id.card_2);
        cardView_3 = findViewById(R.id.card_3);
        cardView_4 = findViewById(R.id.card_4);
        cardView_5 = findViewById(R.id.card_5);
        cardView_6 = findViewById(R.id.card_6);
        cardView_7 = findViewById(R.id.card_7);
        cardView_8 = findViewById(R.id.card_8);
        cardView_9 = findViewById(R.id.card_9);
        cardView_10 = findViewById(R.id.card_10);

        // Toolbar
        setSupportActionBar(toolbar);
        setTitle(getString(R.string.app_name));
        //Linearlayout Animation
        linearLayout = findViewById(R.id.linearLayout2);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.linear_in);
        linearLayout.startAnimation(animation);
        // Card Animation
        cardView_1.setAlpha(0f);
        cardView_1.setTranslationY(50);
        cardView_1.animate().alpha(1f).translationYBy(-50).setDuration(1000);
        cardView_2.setAlpha(0f);
        cardView_2.setTranslationY(50);
        cardView_2.animate().alpha(1f).translationYBy(-50).setDuration(1500);
        cardView_3.setAlpha(0f);
        cardView_3.setTranslationY(50);
        cardView_3.animate().alpha(1f).translationYBy(-50).setDuration(2000);
        cardView_4.setAlpha(0f);
        cardView_4.setTranslationY(50);
        cardView_4.animate().alpha(1f).translationYBy(-50).setDuration(2500);
        cardView_5.setAlpha(0f);
        cardView_5.setTranslationY(50);
        cardView_5.animate().alpha(1f).translationYBy(-50).setDuration(3000);
        cardView_6.setAlpha(0f);
        cardView_6.setTranslationY(50);
        cardView_6.animate().alpha(1f).translationYBy(-50).setDuration(3500);
        cardView_7.setAlpha(0f);
        cardView_7.setTranslationY(50);
        cardView_7.animate().alpha(1f).translationYBy(-50).setDuration(4000);
        cardView_8.setAlpha(0f);
        cardView_8.setTranslationY(50);
        cardView_8.animate().alpha(1f).translationYBy(-50).setDuration(4500);
        cardView_9.setAlpha(0f);
        cardView_9.setTranslationY(50);
        cardView_9.animate().alpha(1f).translationYBy(-50).setDuration(5000);
        cardView_10.setAlpha(0f);
        cardView_10.setTranslationY(50);
        cardView_10.animate().alpha(1f).translationYBy(-50).setDuration(5500);

        // ProgressDialog
        progressDialog = new ProgressDialog(this);

        // SIM NETWORK
        btn_network.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(ParisFootActivity.this);
                String[] items = {getString(R.string.mtn),getString(R.string.airtel)};
                String my_net = btn_network.getText().toString();
                if (my_net.equals("MTN")){
                    checkedItem = 0;
                }
                if (my_net.equals("AIRTEL")){
                    checkedItem = 1;
                }
                alertDialog.setSingleChoiceItems(items, checkedItem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:
                                btn_network.setText(getString(R.string.mtn));
                                dialog.dismiss();
                                EXTRA_NETWORK = "MTN";
                                break;
                            case 1:
                                btn_network.setText(getString(R.string.airtel));
                                EXTRA_NETWORK = "AIRTEL";
                                dialog.dismiss();
                                break;
                        }
                    }
                });
                AlertDialog alert = alertDialog.create();
                alert.setCanceledOnTouchOutside(false);
                alert.show();
            }
        });

        btn_cancel_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear_caches();
            }
        });

        // Dialog Card 1
        card1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String equipe_1 = card1_edit.getText().toString().trim();
                if ((!equipe_1.isEmpty()) && (equipe_1.length() > 2)){
                    FileCacher<String> getCode_1 = new FileCacher<>(ParisFootActivity.this, "code1.txt");
                    try {
                        progressDialog.setMessage(getString(R.string.loading));
                        progressDialog.setCancelable(false);
                        progressDialog.show();
                        getCode_1.writeCache(equipe_1);
                        new Thread(new Runnable() {
                            public void run() {
                                try {
                                    Thread.sleep(5000);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                progressDialog.dismiss();
                            }
                        }).start();
                        Dialog1 dialog1 = new Dialog1();
                        dialog1.show(getSupportFragmentManager(), "Dialog1");
                        //new SomeTask1(0).execute();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(ParisFootActivity.this, getString(R.string.please_insert_code_match), Toast.LENGTH_SHORT).show();
                }
            }
        });
        // Dialog Card 2
        card2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String equipe_2 = card2_edit.getText().toString().trim();
                if ((!equipe_2.isEmpty()) && (equipe_2.length() > 2)){
                    FileCacher<String> getCode_2 = new FileCacher<>(ParisFootActivity.this, "code2.txt");
                    try {
                        progressDialog.setMessage(getString(R.string.loading));
                        progressDialog.setCancelable(false);
                        progressDialog.show();
                        getCode_2.writeCache(equipe_2);
                        new Thread(new Runnable() {
                            public void run() {
                                try {
                                    Thread.sleep(5000);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                progressDialog.dismiss();
                            }
                        }).start();
                        Dialog2 dialog = new Dialog2();
                        dialog.show(getSupportFragmentManager(), "Dialog2");
                        //new SomeTask2(0).execute();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(ParisFootActivity.this, getString(R.string.please_insert_code_match), Toast.LENGTH_SHORT).show();
                }
            }
        });
        // Dialog Card 3
        card3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String equipe_3 = card3_edit.getText().toString().trim();
                if ((!equipe_3.isEmpty()) && (equipe_3.length() > 2)){
                    FileCacher<String> getCode_3 = new FileCacher<>(ParisFootActivity.this, "code3.txt");
                    try {
                        progressDialog.setMessage(getString(R.string.loading));
                        progressDialog.setCancelable(false);
                        progressDialog.show();
                        getCode_3.writeCache(equipe_3);
                        new Thread(new Runnable() {
                            public void run() {
                                try {
                                    Thread.sleep(5000);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                progressDialog.dismiss();
                            }
                        }).start();
                        Dialog3 dialog = new Dialog3();
                        dialog.show(getSupportFragmentManager(), "Dialog3");
                        //new SomeTask3(0).execute();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(ParisFootActivity.this, getString(R.string.please_insert_code_match), Toast.LENGTH_SHORT).show();
                }
            }
        });
        // Dialog Card 4
        card4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String equipe_4 = card4_edit.getText().toString().trim();
                if ((!equipe_4.isEmpty()) && (equipe_4.length() > 2)){
                    FileCacher<String> getCode_4 = new FileCacher<>(ParisFootActivity.this, "code4.txt");
                    try {
                        progressDialog.setMessage(getString(R.string.loading));
                        progressDialog.setCancelable(false);
                        progressDialog.show();
                        getCode_4.writeCache(equipe_4);
                        new Thread(new Runnable() {
                            public void run() {
                                try {
                                    Thread.sleep(5000);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                progressDialog.dismiss();
                            }
                        }).start();
                        Dialog4 dialog = new Dialog4();
                        dialog.show(getSupportFragmentManager(), "Dialog4");
                        //new SomeTask4(0).execute();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(ParisFootActivity.this, getString(R.string.please_insert_code_match), Toast.LENGTH_SHORT).show();
                }
            }
        });
        // Dialog Card 5
        card5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String equipe_5 = card5_edit.getText().toString().trim();
                if ((!equipe_5.isEmpty()) && (equipe_5.length() > 2)){
                    FileCacher<String> getCode_5 = new FileCacher<>(ParisFootActivity.this, "code5.txt");
                    try {
                        progressDialog.setMessage(getString(R.string.loading));
                        progressDialog.setCancelable(false);
                        progressDialog.show();
                        getCode_5.writeCache(equipe_5);
                        new Thread(new Runnable() {
                            public void run() {
                                try {
                                    Thread.sleep(5000);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                progressDialog.dismiss();
                            }
                        }).start();
                        Dialog5 dialog = new Dialog5();
                        dialog.show(getSupportFragmentManager(), "Dialog5");
                        //new SomeTask5(0).execute();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(ParisFootActivity.this, getString(R.string.please_insert_code_match), Toast.LENGTH_SHORT).show();
                }
            }
        });
        // Dialog Card 6
        card6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String equipe_6 = card6_edit.getText().toString().trim();
                if ((!equipe_6.isEmpty()) && (equipe_6.length() > 2)){
                    FileCacher<String> getCode_6 = new FileCacher<>(ParisFootActivity.this, "code6.txt");
                    try {
                        progressDialog.setMessage(getString(R.string.loading));
                        progressDialog.setCancelable(false);
                        progressDialog.show();
                        getCode_6.writeCache(equipe_6);
                        //new SomeTask6(0).execute();
                        new Thread(new Runnable() {
                            public void run() {
                                try {
                                    Thread.sleep(5000);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                progressDialog.dismiss();
                            }
                        }).start();
                        Dialog6 dialog = new Dialog6();
                        dialog.show(getSupportFragmentManager(), "Dialog6");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(ParisFootActivity.this, getString(R.string.please_insert_code_match), Toast.LENGTH_SHORT).show();
                }
            }
        });
        // Dialog Card 7
        card7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String equipe_7 = card7_edit.getText().toString().trim();
                if ((!equipe_7.isEmpty()) && (equipe_7.length() > 2)){
                    FileCacher<String> getCode_7 = new FileCacher<>(ParisFootActivity.this, "code7.txt");
                    try {
                        progressDialog.setMessage(getString(R.string.loading));
                        progressDialog.setCancelable(false);
                        progressDialog.show();
                        getCode_7.writeCache(equipe_7);
                        new Thread(new Runnable() {
                            public void run() {
                                try {
                                    Thread.sleep(5000);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                progressDialog.dismiss();
                            }
                        }).start();
                        Dialog7 dialog = new Dialog7();
                        dialog.show(getSupportFragmentManager(), "Dialog7");
                        //new SomeTask7(0).execute();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(ParisFootActivity.this, getString(R.string.please_insert_code_match), Toast.LENGTH_SHORT).show();
                }
            }
        });
        // Dialog Card 8
        card8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String equipe_8 = card8_edit.getText().toString().trim();
                if ((!equipe_8.isEmpty()) && (equipe_8.length() > 2)){
                    FileCacher<String> getCode_8 = new FileCacher<>(ParisFootActivity.this, "code8.txt");
                    try {
                        progressDialog.setMessage(getString(R.string.loading));
                        progressDialog.setCancelable(false);
                        progressDialog.show();
                        getCode_8.writeCache(equipe_8);
                        //new SomeTask8(0).execute();
                        new Thread(new Runnable() {
                            public void run() {
                                try {
                                    Thread.sleep(5000);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                progressDialog.dismiss();
                            }
                        }).start();
                        Dialog8 dialog = new Dialog8();
                        dialog.show(getSupportFragmentManager(), "Dialog8");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(ParisFootActivity.this, getString(R.string.please_insert_code_match), Toast.LENGTH_SHORT).show();
                }
            }
        });
        // Dialog Card 9
        card9_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String equipe_9 = card9_edit.getText().toString().trim();
                if ((!equipe_9.isEmpty()) && (equipe_9.length() > 2)){
                    FileCacher<String> getCode_9 = new FileCacher<>(ParisFootActivity.this, "code9.txt");
                    try {
                        progressDialog.setMessage(getString(R.string.loading));
                        progressDialog.setCancelable(false);
                        progressDialog.show();
                        getCode_9.writeCache(equipe_9);
                        //new SomeTask9(0).execute();
                        new Thread(new Runnable() {
                            public void run() {
                                try {
                                    Thread.sleep(5000);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                progressDialog.dismiss();
                            }
                        }).start();
                        Dialog9 dialog = new Dialog9();
                        dialog.show(getSupportFragmentManager(), "Dialog9");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(ParisFootActivity.this, getString(R.string.please_insert_code_match), Toast.LENGTH_SHORT).show();
                }
            }
        });
        // Dialog Card 10
        card10_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String equipe_10 = card10_edit.getText().toString().trim();
                if ((!equipe_10.isEmpty()) && (equipe_10.length() > 2)){
                    FileCacher<String> getCode_10 = new FileCacher<>(ParisFootActivity.this, "code10.txt");
                    try {
                        progressDialog.setMessage(getString(R.string.loading));
                        progressDialog.setCancelable(false);
                        progressDialog.show();
                        getCode_10.writeCache(equipe_10);
                        //new SomeTask10(0).execute();
                        new Thread(new Runnable() {
                            public void run() {
                                try {
                                    Thread.sleep(5000);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                progressDialog.dismiss();
                            }
                        }).start();
                        Dialog10 dialog = new Dialog10();
                        dialog.show(getSupportFragmentManager(), "Dialog10");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(ParisFootActivity.this, getString(R.string.please_insert_code_match), Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_send_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // MISE 1
                FileCacher<String> get_true_match_1 = new FileCacher<>(ParisFootActivity.this, "true.txt");
                FileCacher<String> code_1 = new FileCacher<>(ParisFootActivity.this, "code1.txt");
                if (get_true_match_1.hasCache() && code_1.hasCache()){
                    try {
                        String get_true1 = get_true_match_1.readCache();
                        String cd_1 = card1_edit.getText().toString();
                        my_1 = cd_1 + " " + get_true1 + "*";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                // MISE 2
                FileCacher<String> get_true_match_2 = new FileCacher<>(ParisFootActivity.this, "true2.txt");
                FileCacher<String> code_2 = new FileCacher<>(ParisFootActivity.this, "code2.txt");
                if (get_true_match_2.hasCache() && code_2.hasCache()){
                    try {
                        String get_true2 = get_true_match_2.readCache();
                        String cd_2 = card2_edit.getText().toString();
                        my_2 = cd_2 + " " + get_true2 + "*";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                // MISE 3
                FileCacher<String> get_true_match_3 = new FileCacher<>(ParisFootActivity.this, "true3.txt");
                FileCacher<String> code_3 = new FileCacher<>(ParisFootActivity.this, "code3.txt");
                if (get_true_match_3.hasCache() && code_3.hasCache()){
                    try {
                        String get_true3 = get_true_match_3.readCache();
                        String cd_3 = card3_edit.getText().toString();
                        my_3 = cd_3 + " " + get_true3 + "*";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                // MISE 4
                FileCacher<String> get_true_match_4 = new FileCacher<>(ParisFootActivity.this, "true4.txt");
                FileCacher<String> code_4 = new FileCacher<>(ParisFootActivity.this, "code4.txt");
                if (get_true_match_4.hasCache() && code_4.hasCache()){
                    try {
                        String get_true4 = get_true_match_4.readCache();
                        String cd_4 = card4_edit.getText().toString();
                        my_4 = cd_4 + " " + get_true4 + "*";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                // MISE 5
                FileCacher<String> get_true_match_5 = new FileCacher<>(ParisFootActivity.this, "true5.txt");
                FileCacher<String> code_5 = new FileCacher<>(ParisFootActivity.this, "code5.txt");
                if (get_true_match_5.hasCache() && code_5.hasCache()){
                    try {
                        String get_true5 = get_true_match_5.readCache();
                        String cd_5 = card5_edit.getText().toString();
                        my_5 = cd_5 + " " + get_true5 + "*";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                // MISE 6
                FileCacher<String> get_true_match_6 = new FileCacher<>(ParisFootActivity.this, "true6.txt");
                FileCacher<String> code_6 = new FileCacher<>(ParisFootActivity.this, "code6.txt");
                if (get_true_match_6.hasCache() && code_6.hasCache()){
                    try {
                        String get_true6 = get_true_match_6.readCache();
                        String cd_6 = card6_edit.getText().toString();
                        my_6 = cd_6 + " " + get_true6 + "*";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                // MISE 7
                FileCacher<String> get_true_match_7 = new FileCacher<>(ParisFootActivity.this, "true7.txt");
                FileCacher<String> code_7 = new FileCacher<>(ParisFootActivity.this, "code7.txt");
                if (get_true_match_7.hasCache() && code_7.hasCache()){
                    try {
                        String get_true7 = get_true_match_7.readCache();
                        String cd_7 = card7_edit.getText().toString();
                        my_7 = cd_7 + " " + get_true7 + "*";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                // MISE 8
                FileCacher<String> get_true_match_8 = new FileCacher<>(ParisFootActivity.this, "true8.txt");
                FileCacher<String> code_8 = new FileCacher<>(ParisFootActivity.this, "code8.txt");
                if (get_true_match_8.hasCache() && code_8.hasCache()){
                    try {
                        String get_true8 = get_true_match_8.readCache();
                        String cd_8 = card8_edit.getText().toString();
                        my_8 = cd_8 + " " + get_true8 + "*";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                // MISE 9
                FileCacher<String> get_true_match_9 = new FileCacher<>(ParisFootActivity.this, "true9.txt");
                FileCacher<String> code_9 = new FileCacher<>(ParisFootActivity.this, "code9.txt");
                if (get_true_match_9.hasCache() && code_9.hasCache()){
                    try {
                        String get_true9 = get_true_match_9.readCache();
                        String cd_9 = card9_edit.getText().toString();
                        my_9 = cd_9 + " " + get_true9 + "*";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                // MISE 10
                FileCacher<String> get_true_match_10 = new FileCacher<>(ParisFootActivity.this, "true10.txt");
                FileCacher<String> code_10 = new FileCacher<>(ParisFootActivity.this, "code10.txt");
                if (get_true_match_10.hasCache() && code_10.hasCache()){
                    try {
                        String get_true10 = get_true_match_10.readCache();
                        String cd_10 = card10_edit.getText().toString();
                        my_10 = cd_10 + " " + get_true10 + "*";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                send_sms_to_app(my_1, my_2, my_3, my_4, my_5, my_6, my_7, my_8, my_9, my_10);
            }
        });

    }

    private void clear_caches() {
        FileCacheManager all = new FileCacheManager(ParisFootActivity.this);
        if(all.hasCacheFiles()){
            card1_text.setText(getString(R.string.s_lection_du_pari));
            card2_text.setText(getString(R.string.s_lection_du_pari));
            card3_text.setText(getString(R.string.s_lection_du_pari));
            card4_text.setText(getString(R.string.s_lection_du_pari));
            card5_text.setText(getString(R.string.s_lection_du_pari));
            card6_text.setText(getString(R.string.s_lection_du_pari));
            card7_text.setText(getString(R.string.s_lection_du_pari));
            card8_text.setText(getString(R.string.s_lection_du_pari));
            card9_text.setText(getString(R.string.s_lection_du_pari));
            card10_text.setText(getString(R.string.s_lection_du_pari));
            card1_edit.setText("");
            card2_edit.setText("");
            card3_edit.setText("");
            card4_edit.setText("");
            card5_edit.setText("");
            card6_edit.setText("");
            card7_edit.setText("");
            card8_edit.setText("");
            card9_edit.setText("");
            card10_edit.setText("");
            ma_mise.setText("");
            all.deleteAllCaches();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        store_code_match();
        store_paris();
    }

    private void store_code_match() {
        // CODE MATCH 1
        FileCacher<String> code_1 = new FileCacher<>(ParisFootActivity.this, "code1.txt");
        if (code_1.hasCache()){
            try {
                String result_code_1 = code_1.readCache();
                card1_edit.setText(result_code_1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // CODE MATCH 2
        FileCacher<String> code_2 = new FileCacher<>(ParisFootActivity.this, "code2.txt");
        if (code_2.hasCache()){
            try {
                String result_code_2 = code_2.readCache();
                card2_edit.setText(result_code_2);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // CODE MATCH 3
        FileCacher<String> code_3 = new FileCacher<>(ParisFootActivity.this, "code3.txt");
        if (code_3.hasCache()){
            try {
                String result_code_3 = code_3.readCache();
                card3_edit.setText(result_code_3);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // CODE MATCH 4
        FileCacher<String> code_4 = new FileCacher<>(ParisFootActivity.this, "code4.txt");
        if (code_4.hasCache()){
            try {
                String result_code_4 = code_4.readCache();
                card4_edit.setText(result_code_4);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // CODE MATCH 5
        FileCacher<String> code_5 = new FileCacher<>(ParisFootActivity.this, "code5.txt");
        if (code_5.hasCache()){
            try {
                String result_code_5 = code_5.readCache();
                card5_edit.setText(result_code_5);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // CODE MATCH 6
        FileCacher<String> code_6 = new FileCacher<>(ParisFootActivity.this, "code6.txt");
        if (code_6.hasCache()){
            try {
                String result_code_6 = code_6.readCache();
                card6_edit.setText(result_code_6);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // CODE MATCH 7
        FileCacher<String> code_7 = new FileCacher<>(ParisFootActivity.this, "code7.txt");
        if (code_7.hasCache()){
            try {
                String result_code_7 = code_7.readCache();
                card7_edit.setText(result_code_7);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // CODE MATCH 8
        FileCacher<String> code_8 = new FileCacher<>(ParisFootActivity.this, "code8.txt");
        if (code_8.hasCache()){
            try {
                String result_code_8 = code_8.readCache();
                card8_edit.setText(result_code_8);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // CODE MATCH 9
        FileCacher<String> code_9 = new FileCacher<>(ParisFootActivity.this, "code9.txt");
        if (code_9.hasCache()){
            try {
                String result_code_9 = code_9.readCache();
                card9_edit.setText(result_code_9);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // CODE MATCH 10
        FileCacher<String> code_10 = new FileCacher<>(ParisFootActivity.this, "code10.txt");
        if (code_10.hasCache()){
            try {
                String result_code_10 = code_10.readCache();
                card10_edit.setText(result_code_10);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void store_paris() {
        // MISE MATCH 1
        FileCacher<String> match_1 = new FileCacher<>(ParisFootActivity.this, "data.txt");
        if (match_1.hasCache()){
            try {
                String result_match_1 = match_1.readCache();
                card1_text.setText(result_match_1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // MISE MATCH 2
        FileCacher<String> match_2 = new FileCacher<>(ParisFootActivity.this, "data2.txt");
        if (match_2.hasCache()){
            try {
                String result_match_2 = match_2.readCache();
                card2_text.setText(result_match_2);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // MISE MATCH 3
        FileCacher<String> match_3 = new FileCacher<>(ParisFootActivity.this, "data3.txt");
        if (match_3.hasCache()){
            try {
                String result_match_3 = match_3.readCache();
                card3_text.setText(result_match_3);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // MISE MATCH 4
        FileCacher<String> match_4 = new FileCacher<>(ParisFootActivity.this, "data4.txt");
        if (match_4.hasCache()){
            try {
                String result_match_4 = match_4.readCache();
                card4_text.setText(result_match_4);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // MISE MATCH 5
        FileCacher<String> match_5 = new FileCacher<>(ParisFootActivity.this, "data5.txt");
        if (match_5.hasCache()){
            try {
                String result_match_5 = match_5.readCache();
                card5_text.setText(result_match_5);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // MISE MATCH 6
        FileCacher<String> match_6 = new FileCacher<>(ParisFootActivity.this, "data6.txt");
        if (match_6.hasCache()){
            try {
                String result_match_6 = match_6.readCache();
                card6_text.setText(result_match_6);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // MISE MATCH 7
        FileCacher<String> match_7 = new FileCacher<>(ParisFootActivity.this, "data7.txt");
        if (match_7.hasCache()){
            try {
                String result_match_7 = match_7.readCache();
                card7_text.setText(result_match_7);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // MISE MATCH 8
        FileCacher<String> match_8 = new FileCacher<>(ParisFootActivity.this, "data8.txt");
        if (match_8.hasCache()){
            try {
                String result_match_8 = match_8.readCache();
                card8_text.setText(result_match_8);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // MISE MATCH 9
        FileCacher<String> match_9 = new FileCacher<>(ParisFootActivity.this, "data9.txt");
        if (match_9.hasCache()){
            try {
                String result_match_9 = match_9.readCache();
                card9_text.setText(result_match_9);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // MISE MATCH 10
        FileCacher<String> match_10 = new FileCacher<>(ParisFootActivity.this, "data10.txt");
        if (match_10.hasCache()){
            try {
                String result_match_10 = match_10.readCache();
                card10_text.setText(result_match_10);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void send_sms_to_app(String my_1, String my_2, String my_3, String my_4, String my_5, String my_6, String my_7,
                                 String my_8, String my_9, String my_10) {
        String no = ma_mise.getText().toString();
        String code_1 = card1_edit.getText().toString();
        String code_2 = card2_edit.getText().toString();
        String code_3 = card3_edit.getText().toString();
        String code_4 = card4_edit.getText().toString();
        String code_5 = card5_edit.getText().toString();
        String code_6 = card6_edit.getText().toString();
        String code_7 = card7_edit.getText().toString();
        String code_8 = card8_edit.getText().toString();
        String code_9 = card9_edit.getText().toString();
        String code_10 = card10_edit.getText().toString();
        List<String> strings = Arrays.asList((code_1.isEmpty() ? null : code_1), (code_2.isEmpty() ? null : code_2), (code_3.isEmpty() ? null : code_3), (code_4.isEmpty() ? null : code_4),
                (code_5.isEmpty() ? null : code_5), (code_6.isEmpty() ? null : code_6), (code_7.isEmpty() ? null : code_7), (code_8.isEmpty() ? null : code_8), (code_9.isEmpty() ? null : code_9),
                (code_10.isEmpty() ? null : code_10));
        List<String> rslt = new ArrayList<String>();
        for (String str : strings) {
            if (str != null && !str.isEmpty()) {
                rslt.add(str);
            }
        }
        boolean hasDuplicate = new HashSet<>(rslt).size() < rslt.size();
        if (!hasDuplicate) {
            if (!no.isEmpty()) {
                int no2 = Integer.parseInt(no);
                if (no2 > 249) {
                    String result = (my_1 == null ? "" : my_1) + (my_2 == null ? "" : my_2) + (my_3 == null ? "" : my_3) + (my_4 == null ? "" : my_4) + (my_5 == null ? "" : my_5)
                            + (my_6 == null ? "" : my_6) + (my_7 == null ? "" : my_7) + (my_8 == null ? "" : my_8) + (my_9 == null ? "" : my_9) + (my_10 == null ? "" : my_10);
                    String my_network = btn_network.getText().toString();
                    if (!result.isEmpty()){
                        if (my_network.equals("MTN")) {
                            Uri uriSms =  Uri.parse("smsto:" + getString(R.string.mtn_number));
                            Intent sms_intent = new Intent(Intent.ACTION_SENDTO, uriSms);
                            sms_intent.putExtra("sms_body", result + no2);
                            startActivity(sms_intent);
                        } else {
                            Uri uriSms =  Uri.parse("smsto:" + getString(R.string.airtel_number));
                            Intent sms_intent = new Intent(Intent.ACTION_SENDTO, uriSms);
                            sms_intent.putExtra("sms_body", result + no2);
                            startActivity(sms_intent);
                        }
                    } else { Toast.makeText(this, getString(R.string.please_select), Toast.LENGTH_SHORT).show(); }
                } else { Toast.makeText(this, getString(R.string.mise_autorise), Toast.LENGTH_SHORT).show(); }
            } else { Toast.makeText(this, getString(R.string.please_select), Toast.LENGTH_SHORT).show(); }
        } else { Toast.makeText(this, getString(R.string.identik), Toast.LENGTH_SHORT).show(); }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(ParisFootActivity.this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

}