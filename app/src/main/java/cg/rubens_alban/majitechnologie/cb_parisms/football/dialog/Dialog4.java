package cg.rubens_alban.majitechnologie.cb_parisms.football.dialog;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.DialogFragment;

import com.kosalgeek.android.caching.FileCacher;

import java.io.IOException;

import cg.rubens_alban.majitechnologie.cb_parisms.R;
import cg.rubens_alban.majitechnologie.cb_parisms.football.ParisFootActivity;

public class Dialog4 extends DialogFragment {

    public Dialog4() {
        // Empty constructor required for DialogFragment
    }

    private RadioButton card_equipe1_but_non, card_equipe2_but_oui, card_equipe2_but_non, card_double_chance_1xnon, card_double_chance_12oui, card_double_chance_x2non, card_double_chance_x2oui,
            card_resultat_2equip_1oui, card_resultat_2equip_1non, card_resultat_2equip_xoui, card_resultat_2equip_xnon, card_resultat_2equip_2oui, card_resultat_2equip_2non,
            card_resultat_nbre2but_1_2moin, card_resultat_nbre2but_x_2moin, card_resultat_nbre2but_2_2moin, card_resultat_nbre2but_1_2plus, card_resultat_nbre2but_x_2plus,
            card_resultat_nbre2but_2_2plus, card_resultat_nbre2but_1_3moin, card_resultat_nbre2but_x_3moin, card_resultat_nbre2but_2_3moin, card_resultat_nbre2but_1_3plus;
    private RadioButton card_resultat_nbre2but_x_3plus, card_resultat_nbre2but_2_3plus, card_resultat_nbre2but_1_4moin, card_resultat_nbre2but_x_4moin, card_resultat_nbre2but_2_4moin,
            card_resultat_nbre2but_1_4plus, card_resultat_nbre2but_x_4plus, card_resultat_nbre2but_2_4plus, card_resultat_nbre2but_1_5moin, card_resultat_nbre2but_x_5moin,
            card_resultat_nbre2but_2_5moin, card_resultat_nbre2but_1_5plus, card_resultat_nbre2but_x_5plus, card_resultat_nbre2but_2_5plus, card_resultat_double_chance_1x_2moin,
            card_resultat_double_chance_12_2moin, card_resultat_double_chance_2x_2moin, card_resultat_double_chance_1x_2plus, card_resultat_double_chance_12_2plus,
            card_resultat_double_chance_x_2plus, card_resultat_double_chance_1x_3moin, card_resultat_double_chance_12_3moin, card_resultat_double_chance_x2_3moin;
    private RadioButton card_resultat_double_chance_12_4moin, card_resultat_double_chance_x2_4moin, card_resultat_double_chance_1x_4plus, card_resultat_double_chance_12_4plus,
            card_resultat_double_chance_x2_4plus, card_resultat_double_chance_1x_5moin, card_resultat_double_chance_12_5moin, card_resultat_double_chance_1x_5plus,
            card_resultat_double_chance_12_5plus, card_resultat_double_chance_x2_5plus, card_2equip_but_oui3plus, card_2equip_but_oui3moin, card_2equip_but_non3plus,
            card_2equip_but_non3moin, card_but_exact_0, card_but_exact_1, card_but_exact_2, card_but_exact_3, card_but_exact_4, card_but_exact_5, card_but_exact_6plus;
    private RadioButton card_nbre_but_0_1, card_nbre_but_2_3, card_nbre_but_4_5, card_but_exact_1_0but, card_but_exact_1_1but, card_but_exact_1_2buts, card_but_exact_1_3buts, card_but_exact_2_0but,
            card_but_exact_2_1but, card_but_exact_2_2buts, card_but_exact_2_3buts, card_but_1_impair, card_but_1_pair, card_but_2_impair, card_but_2_pair, card_gagne_1temps_oui1,
            card_gagne_1temps_non1, card_gagne_2temps_oui2, card_gagne_2temps_non2, card_marque_1temps_oui1, card_marque_1temps_non1, card_marque_xlast, card_marque_1last, card_marque_2last;
    private RadioButton card_1temps_resultat_1oui_bar, card_1temps_resultat_1non_bar, card_1temps_resultat_xoui_bar, card_1temps_resultat_xnon_bar, card_1temps_resultat_2oui_bar, card_1temps_resultat_2non_bar,
            card_double_chance_1temps_1xoui_bar, card_double_chance_1temps_1xnon_bar, card_double_chance_1temps_12oui_bar, card_double_chance_1temps_12non_bar, card_double_chance_1temps_x2oui_bar,
            card_double_chance_1temps_x2non_bar, card_1temps_double_x2oui, card_1temps_double_x2non, card_winner_1_1vbar, card_winner_1_2v, card_1temps_ecart_but_110bar, card_1temps_ecart_but_x10bar,
            card_1temps_ecart_but_210bar, card_1temps_resultat_but_2_2moin_bar, card_1temps_resultat_but_1_2plus_bar, card_1temps_resultat_but_x_2plus_bar, card_1temps_resultat_but_2_2plus_bar,
            card_1temps_nbre_but_11plusbar, card_1temps_nbre_but_11moinbar, card_1temps_nbre_but_21plusbar, card_1temps_nbre_but_21moinbar, card_1temps_nbre_but_pris_oui1bar, card_1temps_nbre_but_pris_non1bar;
    private RadioButton card_1temps_nbre_but_pris_oui2bar, card_1temps_nbre_but_pris_non2bar, card_1temps_score_exact_00bar, card_1temps_score_exact_01bar, card_1temps_score_exact_02bar,
            card_1temps_score_exact_10bar, card_1temps_score_exact_11bar, card_1temps_score_exact_12bar, card_1temps_score_exact_20bar, card_1temps_score_exact_21bar, card_1temps_score_exact_22bar,
            card_1temps_nbre_but_impair, card_1temps_nbre_but_pair, card_2temps_double_bar1x, card_2temps_double_bar12, card_2temps_double_barx2, card_2temps_winner_bar1oui, card_2temps_winner_bar1non,
            card_2temps_winner_barxoui, card_2temps_winner_barxnon, card_2temps_winner_bar2oui, card_2temps_winner_bar2non, card_double_chance_1xbar_oui, card_double_chance_1xbar_non;
    private RadioButton card_double_chance_12bar_oui, card_double_chance_12bar_non, card_double_chance_x2bar_oui, card_double_chance_x2bar_non, card_2temps_double_chance_bar1xoui, card_2temps_double_chance_bar1xnon,
            card_2temps_double_chance_bar12oui, card_2temps_double_chance_bar12non, card_2temps_double_chance_barx2oui, card_2temps_double_chance_bar2xnon, card_2temps_winner_bar1v, card_2temps_winner_bar2v,
            card_2temps_ecart_bar110, card_2temps_ecart_barx10, card_2temps_ecart_bar210, card_2temps_resultat_bar12moin, card_2temps_resultat_barx2moin, card_2temps_resultat_bar22moin,
            card_2temps_resultat_bar12plus, card_2temps_resultat_barx2plus, card_2temps_resultat_bar22plus, card_inconnue_but_barx1er, card_inconnue_but_bar11er, card_inconnue_but_bar21er,
            card_bar1_1er11, card_bar1_1er1x, card_bar1_1er12, card_bar1_1er21, card_bar1_1er2x, card_bar1_1er22, card_bar1_1er0, card_score_exact_00, card_score_exact_01, card_score_exact_02,
            card_score_exact_03, card_score_exact_04, card_score_exact_10, card_score_exact_11, card_score_exact_12, card_score_exact_13, card_score_exact_14, card_score_exact_20,card_score_exact_21,
            card_score_exact_22, card_score_exact_23, card_score_exact_24, card_score_exact_30, card_score_exact_31, card_score_exact_32, card_score_exact_33, card_score_exact_34, card_score_exact_40;
    private RadioButton card_marque_2temps_oui2, card_marque_2temps_non2, card_score_exact_41, card_score_exact_42, card_score_exact_43, card_score_exact_44, card_score_exact_autre, card_2temps_bar1, card_2temps_barx, card_2temps_bar2, card_nbre_but_11plus,
            card_nbre_but_11moin, card_nbre_but_21plus, card_nbre_but_21moin, card_nbre_corner_impair, card_nbre_corner_pair, card_carton_1c, card_carton_1x, card_carton_2c, card_resultat_fin_1bar12plus,
            card_resultat_fin_1barx2plus, card_resultat_fin_1bar22plus, card_resultat_fin_xbar12plus, card_resultat_fin_xbarx2plus, card_resultat_fin_xbar22plus, card_resultat_fin_2bar12plus,
            card_resultat_fin_2barx2plus, card_resultat_fin_2bar22plus, card_resultat_fin_1bar12moin, card_resultat_fin_xbar12moin, card_resultat_fin_xbarx2moin, card_resultat_fin_xbar22moin;
    private RadioButton card_resultat_fin_2bar22moin, card_resultat_fin_1bar13plus, card_resultat_fin_1barx3plus, card_resultat_fin_1bar23plus, card_resultat_fin_xbar13plus, card_resultat_fin_xbarx3plus,
            card_resultat_fin_xbar23plus, card_resultat_fin_2bar13plus, card_resultat_fin_2barx3plus, card_resultat_fin_2bar23plus, card_resultat_fin_1bar13moin, card_resultat_fin_1barx3moin,
            card_resultat_fin_xbar13moin, card_resultat_fin_xbarx3moin, card_resultat_fin_xbar23moin, card_resultat_fin_2bar23moin, card_resultat_fin_1bar14plus, card_resultat_fin_1barx4plus,
            card_resultat_fin_1bar24plus, card_resultat_fin_xbar14plus, card_resultat_fin_xbarx4plus, card_resultat_fin_xbar24plus, card_resultat_fin_2bar14plus, card_resultat_fin_2barx4plus,
            card_resultat_fin_1bar14moin, card_resultat_fin_1barx4moin, card_resultat_fin_1bar24moin, card_resultat_fin_xbar14moin, card_resultat_fin_xbarx4moin, card_resultat_fin_xbar24moin;
    private RadioButton card_resultat_fin_2bar14moin, card_resultat_fin_2barx4moin, card_resultat_fin_2bar24moin, card_resultat_fin_1bar15plus, card_resultat_fin_1barx5plus, card_resultat_fin_1bar25plus,
            card_resultat_fin_xbar15plus, card_resultat_fin_xbarx5plus, card_resultat_fin_xbar25plus, card_resultat_fin_2bar15plus, card_resultat_fin_2barx5plus, card_resultat_fin_2bar25plus,
            card_resultat_fin_1bar15moin, card_resultat_fin_1barx5moin, card_resultat_fin_1bar25moin, card_resultat_fin_xbar15moin, card_resultat_fin_xbarx5moin, card_resultat_fin_xbar25moin,
            card_resultat_fin_2bar15moin, card_resultat_fin_2barx5moin, card_resultat_fin_2bar25moin, card_resultat_fin_but_xbarx0, card_resultat_fin_but_1bar11, card_resultat_fin_but_xbar11;
    private RadioButton card_resultat_fin_but_xbar21, card_resultat_fin_but_2bar21, card_resultat_fin_but_1bar12, card_resultat_fin_but_1barx2, card_resultat_fin_but_xbar12, card_resultat_fin_but_xbarx2,
            card_resultat_fin_but_xbar22, card_resultat_fin_but_2barx2, card_resultat_fin_but_2bar22, card_resultat_fin_but_1bar13, card_resultat_fin_but_1bar23, card_resultat_fin_but_xbar13,
            card_resultat_fin_but_xbar23, card_resultat_fin_but_2bar13, card_resultat_fin_but_2bar23, card_resultat_fin_but_1bar14, card_resultat_fin_but_1barx4, card_resultat_fin_but_1bar24,
            card_resultat_fin_but_xbar14, card_resultat_fin_but_xbarx4, card_resultat_fin_but_xbar24, card_resultat_fin_but_2bar14, card_resultat_fin_but_2barx4, card_resultat_fin_but_2bar24,
            card_fin_mitemps_1bar1, card_fin_mitemps_xbar1, card_fin_mitemps_2bar1, card_fin_mitemps_1barx, card_fin_mitemps_xbarx, card_fin_mitemps_2barx, card_fin_mitemps_1bar2, card_fin_mitemps_xbar2,
            card_fin_mitemps_2bar2, card_1temps_double_1x, card_1temps_double_12, card_1temps_double_x2,card_1temps_resultat_but_1_2moin_bar, card_1temps_resultat_but_x_2moin_bar;
    private RadioButton card_resultat_1, card_resultat_x, card_resultat_2, card_double_chance_1x, card_double_chance_x2, card_equipe_oui, card_equipe_non,
            card_nbre_1P, card_nbre_1M, card_nbre_2P, card_nbre_2M, card_nbre_3P, card_nbre_3M, card_nbre_4P, card_nbre_4M, card_nbre_5P, card_nbre_5M, card_double_chance_1xoui,
            card_nbre_6P, card_nbre_6M, card_handicap_1_0_1, card_handicap_x_0_1, card_handicap_2_0_1, card_handicap_1_0_2, card_handicap_x_0_2, card_handicap_2_0_2,
            card_handicap_1_1_0, card_handicap_x_1_0, card_handicap_2_1_0, card_handicap_1_2_0, card_handicap_x_2_0, card_handicap_2_2_0, card_1temps_1bar,
            card_1temps_xbar, card_1temps_2bar, card_2Ekip_but_oui_bar, card_2Ekip_but_non_bar, card_1temps_but_1Plus_bar, card_1temps_but_1Moin_bar, card_double_chance_12non;
    private RadioButton card_1temps_but_2Plus_bar, card_1temps_but_2Moin_bar, card_1temps_but_3Plus_bar, card_1temps_but_3Moin_bar, card_1temps_0but_bar, card_1temps_1but_bar,
            card_1temps_2but_pLus_bar, card_temps_1, card_temps_2, card_temps_egalite, card_bar_oui, card_bar_non, card_2temps_Bar_1Plus, card_2temps_Bar_1Moin,
            card_2temps_Bar_2Plus, card_2temps_Bar_2Moin, card_2temps_Bar_3Plus, card_2temps_Bar_3Moin, card_impair_but, card_pair_but, card_equipe1_but_oui,
            card_resultat_double_chance_1x_3plus, card_resultat_double_chance_12_3plus, card_resultat_double_chance_x2_3plus, card_resultat_double_chance_1x_4moin,
            card_1temps_double_1xoui, card_1temps_double_1xnon, card_1temps_double_12oui, card_1temps_double_12non, card_resultat_fin_2bar24plus;
    private CompoundButton previousCheckedCompoundButton;
    private EditText card_butteur_name;
    private Button btn_valide;
    private AppCompatButton btn_cancel;
    private TextView card1_text;
    private EditText card_edit;
    private int Bet_ID;
    private String Bet_Get;
    private int m_1, m_2, m_3, m_4, m_5, m_8, m_9, m_10,m_11, m_12, m_13, m_14, m_15, m_16, m_17, m_18, m_19, m_20, m_21, m_22,m_23, m_24, m_25, m_26, m_27, m_28, m_29, m_30,
            m_31, m_32, m_33, m_34, m_35, m_36, m_37, m_38, m_39, m_40, m_41, m_42,m_43, m_44, m_45, m_46, m_47, m_48, m_49, m_50, m_51, m_52, m_53, m_54, m_55, m_56, m_57,
            m_58, m_59, m_60, m_61, m_62,m_63, m_64, m_65, m_66, m_67, m_68, m_69, m_70, m_71, m_72, m_73, m_74, m_75, m_76, m_77, m_78, m_79, m_80, m_81, m_82, m_83, m_84,
            m_85, m_86, m_87, m_88, m_89, m_90, m_91, m_92, m_93, m_94, m_95, m_96, m_97, m_98, m_99, m_100, m_101, m_102, m_103, m_104, m_105, m_106, m_107, m_109, m_110,
            m_111, m_112, m_113, m_114, m_115, m_116, m_117, m_118, m_119, m_120;
    private int m_121, m_122, m_123, m_124, m_125, m_126, m_127, m_128, m_129, m_130, m_131, m_132, m_133, m_134, m_135, m_136, m_137, m_138, m_139, m_140, m_141, m_142, m_143,
            m_144, m_145, m_146, m_147, m_148, m_149, m_150, m_151, m_152, m_153, m_154, m_155, m_156, m_157, m_158, m_159, m_160, m_161, m_162, m_163, m_164, m_165, m_166, m_167,
            m_168, m_169, m_170, m_171, m_172, m_173, m_174;
    private int m_175, m_176, m_177, m_178, m_179, m_180, m_181, m_182, m_183, m_184, m_185, m_186, m_187, m_188, m_189, m_190, m_191, m_192,
            m_193, m_194, m_195, m_196, m_197, m_198, m_199, m_200, m_201, m_202, m_203, m_204, m_205, m_206, m_207, m_208, m_209, m_210,
            m_211, m_212, m_213, m_214, m_215, m_216, m_217, m_218, m_219, m_220, m_221, m_222, m_223, m_224, m_225, m_226, m_227, m_228, m_229,
            m_230, m_231, m_232, m_233, m_234, m_235, m_236, m_237, m_238, m_239, m_240, m_241, m_242, m_243, m_245, m_246;
    private int m_247, m_248, m_249, m_250, m_251, m_252, m_253, m_254, m_255, m_256, m_257, m_258, m_259, m_260, m_261, m_262, m_263, m_264,
            m_265, m_266, m_267, m_268, m_269, m_270, m_271, m_272, m_273, m_274, m_275, m_276, m_277, m_278, m_279, m_280, m_281, m_282,
            m_283, m_284, m_285, m_286, m_287, m_288, m_289, m_290, m_291, m_292, m_293, m_294, m_295, m_296, m_297, m_298, m_299, m_300,
            m_301, m_302, m_303, m_304, m_305, m_306, m_307, m_308, m_309, m_310, m_311, m_312, m_313, m_314, m_315, m_316, m_317, m_318;
    private int m_319, m_320, m_321, m_322, m_323, m_324, m_325, m_326, m_327, m_328, m_329, m_330, m_331, m_332, m_333, m_334, m_335, m_336,
            m_337, m_338, m_339, m_340, m_341, m_342, m_343, m_344, m_345, m_346, m_347, m_348, m_349, m_350, m_351, m_352, m_353, m_354,
            m_355, m_356, m_357, m_358, m_359, m_360, m_361, m_362, m_363, m_364, m_365, m_366, m_367, m_368, m_369, m_370, m_371, m_372,
            m_373, m_374, m_375, m_376, m_377, m_378, m_379, m_380, m_381, m_382, m_383, m_384, m_385, m_386, m_387, m_388, m_389, m_390,
            m_391, m_392, m_393, m_394, m_395;
    private ProgressDialog progressDialog;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_foot_card, null);

        FileCacher<String> match_4 = new FileCacher<>(getContext(), "data4.txt");
        FileCacher<String> set_true_match_4 = new FileCacher<>(getContext(), "true4.txt");

        btn_valide = view.findViewById(R.id.bt_accept);
        btn_cancel = view.findViewById(R.id.bt_declined);
        card_edit = view.findViewById(R.id.card1_code);

        // ID RADIOBUTTON
        card_1temps_double_12non =view.findViewById(R.id.card_1temps_double_12non);
        card_1temps_double_12oui =view.findViewById(R.id.card_1temps_double_12oui);
        card_1temps_double_1xnon =view.findViewById(R.id.card_1temps_double_1xnon);
        card_1temps_double_1xoui =view.findViewById(R.id.card_1temps_double_1xoui);
        card_marque_2temps_oui2 =view.findViewById(R.id.card_marque_2temps_oui2);
        card_marque_2temps_non2 =view.findViewById(R.id.card_marque_2temps_non2);
        card_score_exact_02 =view.findViewById(R.id.card_score_exact_02);
        card_score_exact_01 =view.findViewById(R.id.card_score_exact_01);
        card_score_exact_00 =view.findViewById(R.id.card_score_exact_00);
        card_bar1_1er0 =view.findViewById(R.id.card_bar1_1er0);
        card_inconnue_but_bar21er =view.findViewById(R.id.card_inconnue_but_bar21er);
        card_score_exact_40 =view.findViewById(R.id.card_score_exact_40);
        card_score_exact_21 =view.findViewById(R.id.card_score_exact_21);
        card_score_exact_34 =view.findViewById(R.id.card_score_exact_34);
        card_score_exact_20 =view.findViewById(R.id.card_score_exact_20);
        card_score_exact_33 =view.findViewById(R.id.card_score_exact_33);
        card_score_exact_14 =view.findViewById(R.id.card_score_exact_14);
        card_score_exact_32 =view.findViewById(R.id.card_score_exact_32);
        card_score_exact_13 =view.findViewById(R.id.card_score_exact_13);
        card_score_exact_31 =view.findViewById(R.id.card_score_exact_31);
        card_score_exact_12 =view.findViewById(R.id.card_score_exact_12);
        card_bar1_1er22 =view.findViewById(R.id.card_bar1_1er22);
        card_bar1_1er2x =view.findViewById(R.id.card_bar1_1er2x);
        card_bar1_1er21 =view.findViewById(R.id.card_bar1_1er21);
        card_inconnue_but_bar11er =view.findViewById(R.id.card_inconnue_but_bar11er);
        card_inconnue_but_barx1er =view.findViewById(R.id.card_inconnue_but_barx1er);
        card_2temps_resultat_bar22plus =view.findViewById(R.id.card_2temps_resultat_bar22plus);
        card_2temps_resultat_bar22moin =view.findViewById(R.id.card_2temps_resultat_bar22moin);
        card_2temps_resultat_barx2moin =view.findViewById(R.id.card_2temps_resultat_barx2moin);
        card_2temps_resultat_bar12moin =view.findViewById(R.id.card_2temps_resultat_bar12moin);
        card_2temps_winner_bar2v =view.findViewById(R.id.card_2temps_winner_bar2v);
        card_2temps_winner_bar1v =view.findViewById(R.id.card_2temps_winner_bar1v);
        card_2temps_double_chance_bar2xnon =view.findViewById(R.id.card_2temps_double_chance_bar2xnon);
        card_bar1_1er12 =view.findViewById(R.id.card_bar1_1er12);
        card_2temps_resultat_barx2plus =view.findViewById(R.id.card_2temps_resultat_barx2plus);
        card_2temps_double_chance_barx2oui =view.findViewById(R.id.card_2temps_double_chance_barx2oui);
        card_2temps_ecart_bar210=view.findViewById(R.id.card_2temps_ecart_bar210);
        card_2temps_ecart_barx10 =view.findViewById(R.id.card_2temps_ecart_barx10);
        card_score_exact_30 =view.findViewById(R.id.card_score_exact_30);
        card_score_exact_11 =view.findViewById(R.id.card_score_exact_11);
        card_score_exact_24 =view.findViewById(R.id.card_score_exact_24);
        card_score_exact_10 =view.findViewById(R.id.card_score_exact_10);
        card_score_exact_23 =view.findViewById(R.id.card_score_exact_23);
        card_score_exact_04 =view.findViewById(R.id.card_score_exact_04);
        card_score_exact_22 =view.findViewById(R.id.card_score_exact_22);
        card_score_exact_03 =view.findViewById(R.id.card_score_exact_03);
        card_bar1_1er11 =view.findViewById(R.id.card_bar1_1er11);
        card_bar1_1er1x =view.findViewById(R.id.card_bar1_1er1x);
        card_2temps_resultat_bar12plus =view.findViewById(R.id.card_2temps_resultat_bar12plus);
        card_2temps_ecart_bar110 =view.findViewById(R.id.card_2temps_ecart_bar110);
        card_2temps_double_chance_bar12non =view.findViewById(R.id.card_2temps_double_chance_bar12non);
        card_2temps_double_chance_bar12oui =view.findViewById(R.id.card_2temps_double_chance_bar12oui);
        card_2temps_double_chance_bar1xnon =view.findViewById(R.id.card_2temps_double_chance_bar1xnon);
        card_2temps_double_chance_bar1xoui =view.findViewById(R.id.card_2temps_double_chance_bar1xoui);
        card_double_chance_x2bar_non =view.findViewById(R.id.card_double_chance_x2bar_non);
        card_double_chance_x2bar_oui =view.findViewById(R.id.card_double_chance_x2bar_oui);
        card_double_chance_12bar_non =view.findViewById(R.id.card_double_chance_12bar_non);
        card_double_chance_12bar_oui =view.findViewById(R.id.card_double_chance_12bar_oui);
        card_double_chance_1xbar_non =view.findViewById(R.id.card_double_chance_1xbar_non);
        card_double_chance_1xbar_oui =view.findViewById(R.id.card_double_chance_1xbar_oui);
        card_2temps_winner_bar2non =view.findViewById(R.id.card_2temps_winner_bar2non);
        card_2temps_winner_bar2oui =view.findViewById(R.id.card_2temps_winner_bar2oui);
        card_2temps_winner_barxnon =view.findViewById(R.id.card_2temps_winner_barxnon);
        card_2temps_winner_barxoui =view.findViewById(R.id.card_2temps_winner_barxoui);
        card_2temps_winner_bar1non =view.findViewById(R.id.card_2temps_winner_bar1non);
        card_2temps_winner_bar1oui =view.findViewById(R.id.card_2temps_winner_bar1oui);
        card_2temps_double_barx2 =view.findViewById(R.id.card_2temps_double_barx2);
        card_2temps_double_bar12 =view.findViewById(R.id.card_2temps_double_bar12);
        card_2temps_double_bar1x =view.findViewById(R.id.card_2temps_double_bar1x);
        card_1temps_nbre_but_pair =view.findViewById(R.id.card_1temps_nbre_but_pair);
        card_1temps_nbre_but_impair =view.findViewById(R.id.card_1temps_nbre_but_impair);
        card_1temps_score_exact_22bar =view.findViewById(R.id.card_1temps_score_exact_22bar);
        card_1temps_score_exact_21bar =view.findViewById(R.id.card_1temps_score_exact_21bar);
        card_1temps_score_exact_20bar =view.findViewById(R.id.card_1temps_score_exact_20bar);
        card_1temps_score_exact_12bar =view.findViewById(R.id.card_1temps_score_exact_12bar);
        card_1temps_score_exact_11bar =view.findViewById(R.id.card_1temps_score_exact_11bar);
        card_1temps_score_exact_10bar =view.findViewById(R.id.card_1temps_score_exact_10bar);
        card_1temps_score_exact_02bar =view.findViewById(R.id.card_1temps_score_exact_02bar);
        card_1temps_score_exact_01bar =view.findViewById(R.id.card_1temps_score_exact_01bar);
        card_1temps_score_exact_00bar =view.findViewById(R.id.card_1temps_score_exact_00bar);
        card_1temps_nbre_but_pris_non2bar =view.findViewById(R.id.card_1temps_nbre_but_pris_non2bar);
        card_1temps_nbre_but_pris_oui2bar =view.findViewById(R.id.card_1temps_nbre_but_pris_oui2bar);
        card_1temps_nbre_but_pris_non1bar =view.findViewById(R.id.card_1temps_nbre_but_pris_non1bar);
        card_1temps_nbre_but_pris_oui1bar =view.findViewById(R.id.card_1temps_nbre_but_pris_oui1bar);
        card_1temps_nbre_but_21moinbar =view.findViewById(R.id.card_1temps_nbre_but_21moinbar);
        card_1temps_nbre_but_21plusbar =view.findViewById(R.id.card_1temps_nbre_but_21plusbar);
        card_1temps_nbre_but_11moinbar =view.findViewById(R.id.card_1temps_nbre_but_11moinbar);
        card_1temps_nbre_but_11plusbar =view.findViewById(R.id.card_1temps_nbre_but_11plusbar);
        card_1temps_resultat_but_2_2plus_bar =view.findViewById(R.id.card_1temps_resultat_but_2_2plus_bar);
        card_1temps_resultat_but_x_2plus_bar =view.findViewById(R.id.card_1temps_resultat_but_x_2plus_bar);
        card_1temps_resultat_but_1_2plus_bar =view.findViewById(R.id.card_1temps_resultat_but_1_2plus_bar);
        card_1temps_resultat_but_2_2moin_bar =view.findViewById(R.id.card_1temps_resultat_but_2_2moin_bar);
        card_1temps_ecart_but_210bar =view.findViewById(R.id.card_1temps_ecart_but_210bar);
        card_1temps_ecart_but_x10bar =view.findViewById(R.id.card_1temps_ecart_but_x10bar);
        card_1temps_ecart_but_110bar =view.findViewById(R.id.card_1temps_ecart_but_110bar);
        card_winner_1_2v =view.findViewById(R.id.card_winner_1_2v);
        card_winner_1_1vbar =view.findViewById(R.id.card_winner_1_1vbar);
        card_1temps_double_x2non =view.findViewById(R.id.card_1temps_double_x2non);
        card_1temps_double_x2oui =view.findViewById(R.id.card_1temps_double_x2oui);
        card_double_chance_1temps_x2non_bar =view.findViewById(R.id.card_double_chance_1temps_x2non_bar);
        card_double_chance_1temps_x2oui_bar =view.findViewById(R.id.card_double_chance_1temps_x2oui_bar);
        card_double_chance_1temps_12non_bar =view.findViewById(R.id.card_double_chance_1temps_12non_bar);
        card_double_chance_1temps_12oui_bar =view.findViewById(R.id.card_double_chance_1temps_12oui_bar);
        card_double_chance_1temps_1xnon_bar =view.findViewById(R.id.card_double_chance_1temps_1xnon_bar);
        card_double_chance_1temps_1xoui_bar =view.findViewById(R.id.card_double_chance_1temps_1xoui_bar);
        card_double_chance_1temps_1xoui_bar =view.findViewById(R.id.card_double_chance_1temps_1xoui_bar);
        card_1temps_resultat_2non_bar =view.findViewById(R.id.card_1temps_resultat_2non_bar);
        card_1temps_resultat_2oui_bar =view.findViewById(R.id.card_1temps_resultat_2oui_bar);
        card_1temps_resultat_xnon_bar =view.findViewById(R.id.card_1temps_resultat_xnon_bar);
        card_1temps_resultat_xoui_bar =view.findViewById(R.id.card_1temps_resultat_xoui_bar);
        card_1temps_resultat_1non_bar =view.findViewById(R.id.card_1temps_resultat_1non_bar);
        card_1temps_resultat_1oui_bar =view.findViewById(R.id.card_1temps_resultat_1oui_bar);
        card_marque_2last =view.findViewById(R.id.card_marque_2last);
        card_marque_1last =view.findViewById(R.id.card_marque_1last);
        card_marque_xlast =view.findViewById(R.id.card_marque_xlast);
        card_marque_1temps_non1 =view.findViewById(R.id.card_marque_1temps_non1);
        card_marque_1temps_oui1 =view.findViewById(R.id.card_marque_1temps_oui1);
        card_gagne_2temps_non2 =view.findViewById(R.id.card_gagne_2temps_non2);
        card_gagne_2temps_oui2 =view.findViewById(R.id.card_gagne_2temps_oui2);
        card_gagne_1temps_non1 =view.findViewById(R.id.card_gagne_1temps_non1);
        card_gagne_1temps_oui1 =view.findViewById(R.id.card_gagne_1temps_oui1);
        card_but_2_pair =view.findViewById(R.id.card_but_2_pair);
        card_but_2_impair =view.findViewById(R.id.card_but_2_impair);
        card_but_1_pair =view.findViewById(R.id.card_but_1_pair);
        card_but_1_impair =view.findViewById(R.id.card_but_1_impair);
        card_but_exact_2_3buts =view.findViewById(R.id.card_but_exact_2_3buts);
        card_but_exact_2_2buts =view.findViewById(R.id.card_but_exact_2_2buts);
        card_but_exact_2_1but =view.findViewById(R.id.card_but_exact_2_1but);
        card_but_exact_2_0but =view.findViewById(R.id.card_but_exact_2_0but);
        card_but_exact_1_3buts =view.findViewById(R.id.card_but_exact_1_3buts);
        card_but_exact_1_2buts =view.findViewById(R.id.card_but_exact_1_2buts);
        card_but_exact_1_1but =view.findViewById(R.id.card_but_exact_1_1but);
        card_but_exact_1_0but =view.findViewById(R.id.card_but_exact_1_0but);
        card_nbre_but_4_5 =view.findViewById(R.id.card_nbre_but_4_5);
        card_nbre_but_2_3 =view.findViewById(R.id.card_nbre_but_2_3);
        card_nbre_but_0_1 =view.findViewById(R.id.card_nbre_but_0_1);
        card_resultat_fin_xbar22moin =view.findViewById(R.id.card_resultat_fin_xbar22moin);
        card_resultat_fin_2bar12plus =view.findViewById(R.id.card_resultat_fin_2bar12plus);
        card_resultat_fin_1bar12plus =view.findViewById(R.id.card_resultat_fin_1bar12plus);
        card_carton_2c =view.findViewById(R.id.card_carton_2c);
        card_resultat_fin_xbarx2moin =view.findViewById(R.id.card_resultat_fin_xbarx2moin);
        card_resultat_fin_xbar22plus =view.findViewById(R.id.card_resultat_fin_xbar22plus);
        card_carton_1x =view.findViewById(R.id.card_carton_1x);
        card_carton_1c =view.findViewById(R.id.card_carton_1c);
        card_resultat_fin_xbar12moin =view.findViewById(R.id.card_resultat_fin_xbar12moin);
        card_resultat_fin_xbarx2plus =view.findViewById(R.id.card_resultat_fin_xbarx2plus);
        card_nbre_corner_pair =view.findViewById(R.id.card_nbre_corner_pair);
        card_nbre_corner_impair =view.findViewById(R.id.card_nbre_corner_impair);
        card_resultat_fin_1bar12moin =view.findViewById(R.id.card_resultat_fin_1bar12moin);
        card_resultat_fin_xbar12plus =view.findViewById(R.id.card_resultat_fin_xbar12plus);
        card_nbre_but_21moin =view.findViewById(R.id.card_nbre_but_21moin);
        card_nbre_but_11plus =view.findViewById(R.id.card_nbre_but_11plus);
        card_2temps_bar2 =view.findViewById(R.id.card_2temps_bar2);
        card_2temps_barx =view.findViewById(R.id.card_2temps_barx);
        card_2temps_bar1 =view.findViewById(R.id.card_2temps_bar1);
        card_score_exact_autre =view.findViewById(R.id.card_score_exact_autre);
        card_score_exact_44 =view.findViewById(R.id.card_score_exact_44);
        card_score_exact_43 =view.findViewById(R.id.card_score_exact_43);
        card_resultat_fin_2bar22plus =view.findViewById(R.id.card_resultat_fin_2bar22plus);
        card_resultat_fin_1bar22plus =view.findViewById(R.id.card_resultat_fin_1bar22plus);
        card_nbre_but_21plus =view.findViewById(R.id.card_nbre_but_21plus);
        card_resultat_fin_2barx2plus =view.findViewById(R.id.card_resultat_fin_2barx2plus);
        card_resultat_fin_1barx2plus =view.findViewById(R.id.card_resultat_fin_1barx2plus);
        card_nbre_but_11moin =view.findViewById(R.id.card_nbre_but_11moin);
        card_score_exact_42 =view.findViewById(R.id.card_score_exact_42);
        card_score_exact_41 =view.findViewById(R.id.card_score_exact_41);
        card_resultat_fin_xbar24moin =view.findViewById(R.id.card_resultat_fin_xbar24moin);
        card_resultat_fin_2barx4plus =view.findViewById(R.id.card_resultat_fin_2barx4plus);
        card_resultat_fin_1barx4plus =view.findViewById(R.id.card_resultat_fin_1barx4plus);
        card_resultat_fin_xbarx4moin =view.findViewById(R.id.card_resultat_fin_xbarx4moin);
        card_resultat_fin_2bar14plus =view.findViewById(R.id.card_resultat_fin_2bar14plus);
        card_resultat_fin_1bar14plus =view.findViewById(R.id.card_resultat_fin_1bar14plus);
        card_resultat_fin_xbar14moin =view.findViewById(R.id.card_resultat_fin_xbar14moin);
        card_resultat_fin_xbar24plus =view.findViewById(R.id.card_resultat_fin_xbar24plus);
        card_resultat_fin_2bar23moin =view.findViewById(R.id.card_resultat_fin_2bar23moin);
        card_resultat_fin_1bar24moin =view.findViewById(R.id.card_resultat_fin_1bar24moin);
        card_resultat_fin_xbarx4plus =view.findViewById(R.id.card_resultat_fin_xbarx4plus);
        card_resultat_fin_xbar23moin =view.findViewById(R.id.card_resultat_fin_xbar23moin);
        card_resultat_fin_1barx4moin =view.findViewById(R.id.card_resultat_fin_1barx4moin);
        card_resultat_fin_xbar14plus =view.findViewById(R.id.card_resultat_fin_xbar14plus);
        card_resultat_fin_xbarx3moin =view.findViewById(R.id.card_resultat_fin_xbarx3moin);
        card_resultat_fin_1bar14moin =view.findViewById(R.id.card_resultat_fin_1bar14moin);
        card_resultat_fin_1bar24plus =view.findViewById(R.id.card_resultat_fin_1bar24plus);
        card_resultat_fin_xbar13moin =view.findViewById(R.id.card_resultat_fin_xbar13moin);
        card_resultat_fin_1barx3moin =view.findViewById(R.id.card_resultat_fin_1barx3moin);
        card_resultat_fin_1bar13moin =view.findViewById(R.id.card_resultat_fin_1bar13moin);
        card_resultat_fin_2bar23plus =view.findViewById(R.id.card_resultat_fin_2bar23plus);
        card_resultat_fin_2barx3plus =view.findViewById(R.id.card_resultat_fin_2barx3plus);
        card_resultat_fin_2bar13plus =view.findViewById(R.id.card_resultat_fin_2bar13plus);
        card_resultat_fin_xbar23plus =view.findViewById(R.id.card_resultat_fin_xbar23plus);
        card_resultat_fin_xbarx3plus =view.findViewById(R.id.card_resultat_fin_xbarx3plus);
        card_resultat_fin_xbar13plus =view.findViewById(R.id.card_resultat_fin_xbar13plus);
        card_resultat_fin_1bar23plus =view.findViewById(R.id.card_resultat_fin_1bar23plus);
        card_resultat_fin_1barx3plus =view.findViewById(R.id.card_resultat_fin_1barx3plus);
        card_resultat_fin_1bar13plus =view.findViewById(R.id.card_resultat_fin_1bar13plus);
        card_resultat_fin_2bar22moin =view.findViewById(R.id.card_resultat_fin_2bar22moin);
        card_resultat_fin_but_xbar11 =view.findViewById(R.id.card_resultat_fin_but_xbar11);
        card_resultat_fin_but_1bar11 =view.findViewById(R.id.card_resultat_fin_but_1bar11);
        card_resultat_fin_but_xbarx0 =view.findViewById(R.id.card_resultat_fin_but_xbarx0);
        card_resultat_fin_2bar25moin =view.findViewById(R.id.card_resultat_fin_2bar25moin);
        card_resultat_fin_2barx5moin =view.findViewById(R.id.card_resultat_fin_2barx5moin);
        card_resultat_fin_2bar15moin =view.findViewById(R.id.card_resultat_fin_2bar15moin);
        card_resultat_fin_xbar25moin =view.findViewById(R.id.card_resultat_fin_xbar25moin);
        card_resultat_fin_xbarx5moin =view.findViewById(R.id.card_resultat_fin_xbarx5moin);
        card_resultat_fin_xbar15moin =view.findViewById(R.id.card_resultat_fin_xbar15moin);
        card_resultat_fin_1bar25moin =view.findViewById(R.id.card_resultat_fin_1bar25moin);
        card_resultat_fin_1barx5moin =view.findViewById(R.id.card_resultat_fin_1barx5moin);
        card_resultat_fin_1bar15moin =view.findViewById(R.id.card_resultat_fin_1bar15moin);
        card_resultat_fin_2bar25plus =view.findViewById(R.id.card_resultat_fin_2bar25plus);
        card_resultat_fin_2barx5plus =view.findViewById(R.id.card_resultat_fin_2barx5plus);
        card_resultat_fin_2bar15plus =view.findViewById(R.id.card_resultat_fin_2bar15plus);
        card_resultat_fin_xbar25plus =view.findViewById(R.id.card_resultat_fin_xbar25plus);
        card_resultat_fin_xbarx5plus =view.findViewById(R.id.card_resultat_fin_xbarx5plus);
        card_resultat_fin_xbar15plus =view.findViewById(R.id.card_resultat_fin_xbar15plus);
        card_resultat_fin_1bar25plus =view.findViewById(R.id.card_resultat_fin_1bar25plus);
        card_resultat_fin_1barx5plus =view.findViewById(R.id.card_resultat_fin_1barx5plus);
        card_resultat_fin_1bar15plus =view.findViewById(R.id.card_resultat_fin_1bar15plus);
        card_resultat_fin_2bar24moin =view.findViewById(R.id.card_resultat_fin_2bar24moin);
        card_resultat_fin_2barx4moin =view.findViewById(R.id.card_resultat_fin_2barx4moin);
        card_resultat_fin_2bar14moin =view.findViewById(R.id.card_resultat_fin_2bar14moin);
        card_but_exact_6plus =view.findViewById(R.id.card_but_exact_6plus);
        card_but_exact_5 =view.findViewById(R.id.card_but_exact_5);
        card_but_exact_4 =view.findViewById(R.id.card_but_exact_4);
        card_but_exact_3 =view.findViewById(R.id.card_but_exact_3);
        card_but_exact_1 =view.findViewById(R.id.card_but_exact_1);
        card_but_exact_0 =view.findViewById(R.id.card_but_exact_0);
        card_but_exact_2 =view.findViewById(R.id.card_but_exact_2);
        card_2equip_but_non3moin =view.findViewById(R.id.card_2equip_but_non3moin);
        card_2equip_but_non3plus =view.findViewById(R.id.card_2equip_but_non3plus);
        card_2equip_but_oui3moin =view.findViewById(R.id.card_2equip_but_oui3moin);
        card_2equip_but_oui3plus =view.findViewById(R.id.card_2equip_but_oui3plus);
        card_resultat_double_chance_x2_5plus =view.findViewById(R.id.card_resultat_double_chance_x2_5plus);
        card_resultat_double_chance_12_5plus =view.findViewById(R.id.card_resultat_double_chance_12_5plus);
        card_resultat_double_chance_12_5moin =view.findViewById(R.id.card_resultat_double_chance_12_5moin);
        card_resultat_double_chance_1x_5moin =view.findViewById(R.id.card_resultat_double_chance_1x_5moin);
        card_1temps_resultat_but_x_2moin_bar =view.findViewById(R.id.card_1temps_resultat_but_x_2moin_bar);
        card_1temps_resultat_but_1_2moin_bar =view.findViewById(R.id.card_1temps_resultat_but_1_2moin_bar);
        card_1temps_double_x2 =view.findViewById(R.id.card_1temps_double_x2);
        card_resultat_double_chance_1x_5plus =view.findViewById(R.id.card_resultat_double_chance_1x_5plus);
        card_1temps_double_12 =view.findViewById(R.id.card_1temps_double_12);
        card_1temps_double_1x =view.findViewById(R.id.card_1temps_double_1x);
        card_fin_mitemps_2bar2 =view.findViewById(R.id.card_fin_mitemps_2bar2);
        card_fin_mitemps_xbar2 =view.findViewById(R.id.card_fin_mitemps_xbar2);
        card_fin_mitemps_1bar2 =view.findViewById(R.id.card_fin_mitemps_1bar2);
        card_fin_mitemps_2barx =view.findViewById(R.id.card_fin_mitemps_2barx);
        card_fin_mitemps_xbarx =view.findViewById(R.id.card_fin_mitemps_xbarx);
        card_fin_mitemps_1barx =view.findViewById(R.id.card_fin_mitemps_1barx);
        card_fin_mitemps_2bar1 =view.findViewById(R.id.card_fin_mitemps_2bar1);
        card_fin_mitemps_xbar1 =view.findViewById(R.id.card_fin_mitemps_xbar1);
        card_fin_mitemps_1bar1 =view.findViewById(R.id.card_fin_mitemps_1bar1);
        card_resultat_fin_but_2bar24 =view.findViewById(R.id.card_resultat_fin_but_2bar24);
        card_resultat_fin_but_2barx4 =view.findViewById(R.id.card_resultat_fin_but_2barx4);
        card_resultat_fin_but_2bar14 =view.findViewById(R.id.card_resultat_fin_but_2bar14);
        card_resultat_fin_but_xbar24 =view.findViewById(R.id.card_resultat_fin_but_xbar24);
        card_resultat_fin_but_xbarx4 =view.findViewById(R.id.card_resultat_fin_but_xbarx4);
        card_resultat_fin_but_xbar14 =view.findViewById(R.id.card_resultat_fin_but_xbar14);
        card_resultat_fin_but_1bar24 =view.findViewById(R.id.card_resultat_fin_but_1bar24);
        card_resultat_fin_but_1bar24 =view.findViewById(R.id.card_resultat_fin_but_1bar24);
        card_resultat_fin_but_1barx4 =view.findViewById(R.id.card_resultat_fin_but_1barx4);
        card_resultat_fin_but_1bar14 =view.findViewById(R.id.card_resultat_fin_but_1bar14);
        card_resultat_fin_but_2bar23 =view.findViewById(R.id.card_resultat_fin_but_2bar23);
        card_resultat_fin_but_2bar13 =view.findViewById(R.id.card_resultat_fin_but_2bar13);
        card_resultat_fin_but_xbar23 =view.findViewById(R.id.card_resultat_fin_but_xbar23);
        card_resultat_fin_but_xbar13 =view.findViewById(R.id.card_resultat_fin_but_xbar13);
        card_resultat_fin_but_1bar23 =view.findViewById(R.id.card_resultat_fin_but_1bar23);
        card_resultat_fin_but_1bar13 =view.findViewById(R.id.card_resultat_fin_but_1bar13);
        card_resultat_fin_but_2bar22 =view.findViewById(R.id.card_resultat_fin_but_2bar22);
        card_resultat_fin_but_2barx2 =view.findViewById(R.id.card_resultat_fin_but_2barx2);
        card_resultat_fin_but_xbar22 =view.findViewById(R.id.card_resultat_fin_but_xbar22);
        card_1temps_1bar =view.findViewById(R.id.card_1temps_1bar);
        card_1temps_xbar =view.findViewById(R.id.card_1temps_xbar);
        card_1temps_2bar =view.findViewById(R.id.card_1temps_2bar);
        card_double_chance_12non =view.findViewById(R.id.card_double_chance_12non);
        card_1temps_but_1Moin_bar =view.findViewById(R.id.card_1temps_but_1Moin_bar);
        card_1temps_but_1Plus_bar =view.findViewById(R.id.card_1temps_but_1Plus_bar);
        card_2Ekip_but_non_bar =view.findViewById(R.id.card_2Ekip_but_non_bar);
        card_2Ekip_but_oui_bar =view.findViewById(R.id.card_2Ekip_but_oui_bar);
        card_resultat_fin_but_xbar21 =view.findViewById(R.id.card_resultat_fin_but_xbar21);
        card_resultat_fin_but_2bar21 =view.findViewById(R.id.card_resultat_fin_but_2bar21);
        card_resultat_fin_but_1bar12 =view.findViewById(R.id.card_resultat_fin_but_1bar12);
        card_resultat_fin_but_1barx2 =view.findViewById(R.id.card_resultat_fin_but_1barx2);
        card_resultat_fin_but_xbar12 =view.findViewById(R.id.card_resultat_fin_but_xbar12);
        card_resultat_fin_but_xbarx2 =view.findViewById(R.id.card_resultat_fin_but_xbarx2);
        card_handicap_2_2_0 =view.findViewById(R.id.card_handicap_2_2_0);
        card_handicap_x_2_0 =view.findViewById(R.id.card_handicap_x_2_0);
        card_handicap_1_2_0 =view.findViewById(R.id.card_handicap_1_2_0);
        card_handicap_2_1_0 =view.findViewById(R.id.card_handicap_2_1_0);
        card_handicap_x_1_0 =view.findViewById(R.id.card_handicap_x_1_0);
        card_handicap_1_1_0 =view.findViewById(R.id.card_handicap_1_1_0);
        card_handicap_2_0_2 =view.findViewById(R.id.card_handicap_2_0_2);
        card_handicap_x_0_2 =view.findViewById(R.id.card_handicap_x_0_2);
        card_handicap_1_0_2 =view.findViewById(R.id.card_handicap_1_0_2);
        card_handicap_2_0_1 =view.findViewById(R.id.card_handicap_2_0_1);
        card_handicap_x_0_1 =view.findViewById(R.id.card_handicap_x_0_1);
        card_handicap_1_0_1 =view.findViewById(R.id.card_handicap_1_0_1);
        card_nbre_6M =view.findViewById(R.id.card_nbre_6M);
        card_nbre_6P =view.findViewById(R.id.card_nbre_6P);
        card_double_chance_1xoui =view.findViewById(R.id.card_double_chance_1xoui);
        card_nbre_5M =view.findViewById(R.id.card_nbre_5M);
        card_nbre_5P =view.findViewById(R.id.card_nbre_5P);
        card_nbre_4M =view.findViewById(R.id.card_nbre_4M);
        card_nbre_4P =view.findViewById(R.id.card_nbre_4P);
        card_nbre_3M =view.findViewById(R.id.card_nbre_3M);
        card_nbre_3P =view.findViewById(R.id.card_nbre_3P);
        card_nbre_2P =view.findViewById(R.id.card_nbre_2P);
        card_nbre_1M =view.findViewById(R.id.card_nbre_1M);
        card_nbre_1P =view.findViewById(R.id.card_nbre_1P);
        card_nbre_2M =view.findViewById(R.id.card_nbre_2M);
        card_equipe_non =view.findViewById(R.id.card_equipe_non);
        card_equipe_oui =view.findViewById(R.id.card_equipe_oui);
        card_double_chance_x2 =view.findViewById(R.id.card_double_chance_x2);
        card_resultat_1 =view.findViewById(R.id.card_resultat_1);
        card_resultat_x =view.findViewById(R.id.card_resultat_x);
        card_resultat_2 =view.findViewById(R.id.card_resultat_2);
        card_double_chance_1x =view.findViewById(R.id.card_double_chance_1x);
        card_resultat_double_chance_1x_4moin =view.findViewById(R.id.card_resultat_double_chance_1x_4moin);
        card_resultat_double_chance_x2_3plus =view.findViewById(R.id.card_resultat_double_chance_x2_3plus);
        card_resultat_double_chance_12_3plus =view.findViewById(R.id.card_resultat_double_chance_12_3plus);
        card_resultat_double_chance_1x_3plus =view.findViewById(R.id.card_resultat_double_chance_1x_3plus);
        card_equipe1_but_oui =view.findViewById(R.id.card_equipe1_but_oui);
        card_pair_but =view.findViewById(R.id.card_pair_but);
        card_impair_but =view.findViewById(R.id.card_impair_but);
        card_2temps_Bar_3Moin =view.findViewById(R.id.card_2temps_Bar_3Moin);
        card_2temps_Bar_3Plus =view.findViewById(R.id.card_2temps_Bar_3Plus);
        card_2temps_Bar_2Moin =view.findViewById(R.id.card_2temps_Bar_2Moin);
        card_2temps_Bar_2Plus =view.findViewById(R.id.card_2temps_Bar_2Plus);
        card_2temps_Bar_1Moin =view.findViewById(R.id.card_2temps_Bar_1Moin);
        card_2temps_Bar_1Plus =view.findViewById(R.id.card_2temps_Bar_1Plus);
        card_bar_non =view.findViewById(R.id.card_bar_non);
        card_bar_oui =view.findViewById(R.id.card_bar_oui);
        card_temps_egalite =view.findViewById(R.id.card_temps_egalite);
        card_temps_2 =view.findViewById(R.id.card_temps_2);
        card_temps_1 =view.findViewById(R.id.card_temps_1);
        card_1temps_2but_pLus_bar =view.findViewById(R.id.card_1temps_2but_pLus_bar);
        card_1temps_1but_bar =view.findViewById(R.id.card_1temps_1but_bar);
        card_1temps_0but_bar =view.findViewById(R.id.card_1temps_0but_bar);
        card_1temps_but_3Moin_bar =view.findViewById(R.id.card_1temps_but_3Moin_bar);
        card_1temps_but_3Plus_bar =view.findViewById(R.id.card_1temps_but_3Plus_bar);
        card_1temps_but_2Moin_bar =view.findViewById(R.id.card_1temps_but_2Moin_bar);
        card_1temps_but_2Plus_bar =view.findViewById(R.id.card_1temps_but_2Plus_bar);
        card_resultat_double_chance_x2_4plus =view.findViewById(R.id.card_resultat_double_chance_x2_4plus);
        card_resultat_double_chance_12_4plus =view.findViewById(R.id.card_resultat_double_chance_12_4plus);
        card_resultat_double_chance_1x_4plus =view.findViewById(R.id.card_resultat_double_chance_1x_4plus);
        card_resultat_double_chance_x2_4moin =view.findViewById(R.id.card_resultat_double_chance_x2_4moin);
        card_resultat_double_chance_12_4moin =view.findViewById(R.id.card_resultat_double_chance_12_4moin);
        card_resultat_double_chance_x2_3moin =view.findViewById(R.id.card_resultat_double_chance_x2_3moin);
        card_resultat_double_chance_12_3moin =view.findViewById(R.id.card_resultat_double_chance_12_3moin);
        card_resultat_double_chance_1x_3moin =view.findViewById(R.id.card_resultat_double_chance_1x_3moin);
        card_resultat_double_chance_x_2plus =view.findViewById(R.id.card_resultat_double_chance_x_2plus);
        card_resultat_double_chance_12_2plus =view.findViewById(R.id.card_resultat_double_chance_12_2plus);
        card_resultat_double_chance_1x_2plus =view.findViewById(R.id.card_resultat_double_chance_1x_2plus);
        card_equipe1_but_non =view.findViewById(R.id.card_equipe1_but_non);
        card_equipe2_but_oui =view.findViewById(R.id.card_equipe2_but_oui);
        card_equipe2_but_non =view.findViewById(R.id.card_equipe2_but_non);
        card_double_chance_1xnon =view.findViewById(R.id.card_double_chance_1xnon);
        card_double_chance_12oui =view.findViewById(R.id.card_double_chance_12oui);
        card_double_chance_x2non =view.findViewById(R.id.card_double_chance_x2non);
        card_double_chance_x2oui =view.findViewById(R.id.card_double_chance_x2oui);
        card_resultat_2equip_1oui =view.findViewById(R.id.card_resultat_2equip_1oui);
        card_resultat_2equip_1non =view.findViewById(R.id.card_resultat_2equip_1non);
        card_resultat_2equip_xoui =view.findViewById(R.id.card_resultat_2equip_xoui);
        card_resultat_2equip_xnon =view.findViewById(R.id.card_resultat_2equip_xnon);
        card_resultat_2equip_2oui =view.findViewById(R.id.card_resultat_2equip_2oui);
        card_resultat_2equip_2non =view.findViewById(R.id.card_resultat_2equip_2non);
        card_resultat_nbre2but_1_2moin =view.findViewById(R.id.card_resultat_nbre2but_1_2moin);
        card_resultat_nbre2but_x_2moin =view.findViewById(R.id.card_resultat_nbre2but_x_2moin);
        card_resultat_nbre2but_2_2moin =view.findViewById(R.id.card_resultat_nbre2but_2_2moin);
        card_resultat_nbre2but_1_2plus =view.findViewById(R.id.card_resultat_nbre2but_1_2plus);
        card_resultat_nbre2but_x_2plus =view.findViewById(R.id.card_resultat_nbre2but_x_2plus);
        card_resultat_nbre2but_2_2plus =view.findViewById(R.id.card_resultat_nbre2but_2_2plus);
        card_resultat_nbre2but_1_3moin =view.findViewById(R.id.card_resultat_nbre2but_1_3moin);
        card_resultat_nbre2but_x_3moin =view.findViewById(R.id.card_resultat_nbre2but_x_3moin);
        card_resultat_nbre2but_2_3moin =view.findViewById(R.id.card_resultat_nbre2but_2_3moin);
        card_resultat_nbre2but_1_3plus =view.findViewById(R.id.card_resultat_nbre2but_1_3plus);
        card_resultat_nbre2but_x_3plus =view.findViewById(R.id.card_resultat_nbre2but_x_3plus);
        card_resultat_nbre2but_2_3plus =view.findViewById(R.id.card_resultat_nbre2but_2_3plus);
        card_resultat_nbre2but_1_4moin =view.findViewById(R.id.card_resultat_nbre2but_1_4moin);
        card_resultat_nbre2but_x_4moin =view.findViewById(R.id.card_resultat_nbre2but_x_4moin);
        card_resultat_nbre2but_2_4moin =view.findViewById(R.id.card_resultat_nbre2but_2_4moin);
        card_resultat_nbre2but_1_4plus =view.findViewById(R.id.card_resultat_nbre2but_1_4plus);
        card_resultat_nbre2but_x_4plus =view.findViewById(R.id.card_resultat_nbre2but_x_4plus);
        card_resultat_nbre2but_2_4plus =view.findViewById(R.id.card_resultat_nbre2but_2_4plus);
        card_resultat_nbre2but_1_5moin =view.findViewById(R.id.card_resultat_nbre2but_1_5moin);
        card_resultat_nbre2but_x_5moin =view.findViewById(R.id.card_resultat_nbre2but_x_5moin);
        card_resultat_nbre2but_2_5moin =view.findViewById(R.id.card_resultat_nbre2but_2_5moin);
        card_resultat_nbre2but_1_5plus =view.findViewById(R.id.card_resultat_nbre2but_1_5plus);
        card_resultat_nbre2but_x_5plus =view.findViewById(R.id.card_resultat_nbre2but_x_5plus);
        card_resultat_nbre2but_2_5plus =view.findViewById(R.id.card_resultat_nbre2but_2_5plus);
        card_resultat_double_chance_1x_2moin =view.findViewById(R.id.card_resultat_double_chance_1x_2moin);
        card_resultat_double_chance_12_2moin =view.findViewById(R.id.card_resultat_double_chance_12_2moin);
        card_resultat_double_chance_2x_2moin =view.findViewById(R.id.card_resultat_double_chance_2x_2moin);
        card_butteur_name =view.findViewById(R.id.card_butteur_name);
        card_resultat_fin_2bar24plus = view.findViewById(R.id.card_resultat_fin_2bar24plus);

        CompoundButton.OnCheckedChangeListener onRadioButtonCheckedListener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked) return;
                if (previousCheckedCompoundButton != null) {
                    previousCheckedCompoundButton.setChecked(false);
                    previousCheckedCompoundButton = buttonView;
                } else {
                    previousCheckedCompoundButton = buttonView;
                }

                int selectedRadioBtnId = buttonView.getId();
                if (selectedRadioBtnId != -1) {
                    previousCheckedCompoundButton = view.findViewById(selectedRadioBtnId);
                    Bet_ID = selectedRadioBtnId;
                }
            }
        };

        card_1temps_double_12non.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_double_12oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_double_1xnon.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_double_1xoui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_marque_2temps_oui2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_marque_2temps_non2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_02.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_01.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_00.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_bar1_1er0.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_inconnue_but_bar21er.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_40.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_21.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_34.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_20.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_33.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_14.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_32.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_13.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_31.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_12.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_bar1_1er22.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_bar1_1er2x.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_bar1_1er21.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_inconnue_but_bar11er.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_inconnue_but_barx1er.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_resultat_bar22plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_resultat_bar22moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_resultat_barx2moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_resultat_bar12moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_winner_bar2v.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_winner_bar1v.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_double_chance_bar2xnon.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_bar1_1er12.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_resultat_barx2plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_double_chance_barx2oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_ecart_bar210.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_ecart_barx10.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_30.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_11.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_24.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_10.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_23.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_04.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_22.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_03.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_bar1_1er11.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_bar1_1er1x.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_resultat_bar12plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_ecart_bar110.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_double_chance_bar12non.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_double_chance_bar12oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_double_chance_bar1xnon.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_double_chance_bar1xoui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_x2bar_non.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_x2bar_oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_12bar_non.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_12bar_oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_1xbar_non.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_1xbar_oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_winner_bar2non.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_winner_bar2oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_winner_barxnon.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_winner_barxoui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_winner_bar1non.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_winner_bar1oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_double_barx2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_double_bar12.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_double_bar1x.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_nbre_but_pair.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_nbre_but_impair.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_score_exact_22bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_score_exact_21bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_score_exact_20bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_score_exact_12bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_score_exact_11bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_score_exact_10bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_score_exact_02bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_score_exact_01bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_score_exact_00bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_nbre_but_pris_non2bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_nbre_but_pris_oui2bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_nbre_but_pris_non1bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_nbre_but_pris_oui1bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_nbre_but_21moinbar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_nbre_but_21plusbar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_nbre_but_11moinbar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_nbre_but_11plusbar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_resultat_but_2_2plus_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_resultat_but_x_2plus_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_resultat_but_1_2plus_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_resultat_but_2_2moin_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_ecart_but_210bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_ecart_but_x10bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_ecart_but_110bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_winner_1_2v.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_winner_1_1vbar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_double_x2non.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_double_x2oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_1temps_x2non_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_1temps_x2oui_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_1temps_12non_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_1temps_12oui_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_1temps_1xnon_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_1temps_1xoui_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_1temps_1xoui_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_resultat_2non_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_resultat_2oui_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_resultat_xnon_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_resultat_xoui_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_resultat_1non_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_resultat_1oui_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_marque_2last.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_marque_1last.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_marque_xlast.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_marque_1temps_non1.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_marque_1temps_oui1.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_gagne_2temps_non2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_gagne_2temps_oui2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_gagne_1temps_non1.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_gagne_1temps_oui1.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_2_pair.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_2_impair.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_1_pair.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_1_impair.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_exact_2_3buts.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_exact_2_2buts.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_exact_2_1but.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_exact_2_0but.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_exact_1_3buts.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_exact_1_2buts.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_exact_1_1but.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_exact_1_0but.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_but_4_5.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_but_2_3.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_but_0_1.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbar22moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2bar12plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1bar12plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_carton_2c.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbarx2moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbar22plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_carton_1x.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_carton_1c.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbar12moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbarx2plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_corner_pair.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_corner_impair.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1bar12moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbar12plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_but_21moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_but_11plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_bar2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_barx.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_bar1.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_autre.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_44.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_43.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2bar22plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1bar22plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_but_21plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2barx2plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1barx2plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_but_11moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_42.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_score_exact_41.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbar24moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2barx4plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1barx4plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbarx4moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2bar14plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1bar14plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbar14moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbar24plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2bar23moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1bar24moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbarx4plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbar23moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1barx4moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbar14plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbarx3moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1bar14moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1bar24plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbar13moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1barx3moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1bar13moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2bar23plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2barx3plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2bar13plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbar23plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbarx3plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbar13plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1bar23plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1barx3plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1bar13plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2bar22moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_xbar11.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_1bar11.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_xbarx0.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2bar25moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2barx5moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2bar15moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbar25moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbarx5moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbar15moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1bar25moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1barx5moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1bar15moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2bar25plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2barx5plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2bar15plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbar25plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbarx5plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_xbar15plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1bar25plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1barx5plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_1bar15plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2bar24moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2barx4moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2bar14moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_exact_6plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_exact_5.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_exact_4.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_exact_3.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_exact_1.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_exact_0.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_but_exact_2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2equip_but_non3moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2equip_but_non3plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2equip_but_oui3moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2equip_but_oui3plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_x2_5plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_12_5plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_12_5moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_1x_5moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_resultat_but_x_2moin_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_resultat_but_1_2moin_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_double_x2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_1x_5plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_double_12.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_double_1x.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_fin_mitemps_2bar2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_fin_mitemps_xbar2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_fin_mitemps_1bar2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_fin_mitemps_2barx.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_fin_mitemps_xbarx.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_fin_mitemps_1barx.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_fin_mitemps_2bar1.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_fin_mitemps_xbar1.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_fin_mitemps_1bar1.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_2bar24.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_2barx4.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_2bar14.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_xbar24.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_xbarx4.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_xbar14.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_1bar24.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_1bar24.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_1barx4.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_1bar14.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_2bar23.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_2bar13.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_xbar23.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_xbar13.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_1bar23.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_1bar13.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_2bar22.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_2barx2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_xbar22.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_1bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_xbar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_2bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_12non.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_but_1Moin_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_but_1Plus_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2Ekip_but_non_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2Ekip_but_oui_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_xbar21.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_2bar21.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_1bar12.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_1barx2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_xbar12.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_but_xbarx2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_handicap_2_2_0.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_handicap_x_2_0.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_handicap_1_2_0.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_handicap_2_1_0.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_handicap_x_1_0.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_handicap_1_1_0.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_handicap_2_0_2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_handicap_x_0_2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_handicap_1_0_2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_handicap_2_0_1.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_handicap_x_0_1.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_handicap_1_0_1.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_6M.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_6P.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_1xoui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_5M.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_5P.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_4M.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_4P.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_3M.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_3P.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_2P.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_1M.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_1P.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_nbre_2M.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_equipe_non.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_equipe_oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_x2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_1.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_x.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_1x.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_1x_4moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_x2_3plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_12_3plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_1x_3plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_equipe1_but_oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_pair_but.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_impair_but.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_Bar_3Moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_Bar_3Plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_Bar_2Moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_Bar_2Plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_Bar_1Moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_2temps_Bar_1Plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_bar_non.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_bar_oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_temps_egalite.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_temps_2.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_temps_1.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_2but_pLus_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_1but_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_0but_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_but_3Moin_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_but_3Plus_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_but_2Moin_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_1temps_but_2Plus_bar.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_x2_4plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_12_4plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_1x_4plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_x2_4moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_12_4moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_x2_3moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_12_3moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_1x_3moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_x_2plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_12_2plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_1x_2plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_equipe1_but_non.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_equipe2_but_oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_equipe2_but_non.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_1xnon.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_12oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_x2non.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_double_chance_x2oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_2equip_1oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_2equip_1non.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_2equip_xoui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_2equip_xnon.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_2equip_2oui.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_2equip_2non.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_1_2moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_x_2moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_2_2moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_1_2plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_x_2plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_2_2plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_1_3moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_x_3moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_2_3moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_1_3plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_x_3plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_2_3plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_1_4moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_x_4moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_2_4moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_1_4plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_x_4plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_2_4plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_1_5moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_x_5moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_2_5moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_1_5plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_x_5plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_nbre2but_2_5plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_1x_2moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_12_2moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_double_chance_2x_2moin.setOnCheckedChangeListener(onRadioButtonCheckedListener);
        card_resultat_fin_2bar24plus.setOnCheckedChangeListener(onRadioButtonCheckedListener);

        m_1 = card_1temps_double_12non.getId();
        m_2 = card_1temps_double_12oui.getId();
        m_3 = card_1temps_double_1xnon.getId();
        m_4 = card_1temps_double_1xoui.getId();
        m_5 = card_marque_2temps_oui2.getId();
        m_8 = card_marque_2temps_non2.getId();
        m_9 = card_score_exact_02.getId();
        m_10 = card_score_exact_01.getId();
        m_11 = card_score_exact_00.getId();
        m_12 = card_bar1_1er0.getId();
        m_13 = card_inconnue_but_bar21er.getId();
        m_14 = card_score_exact_40.getId();
        m_15 = card_score_exact_21.getId();
        m_16 = card_score_exact_34.getId();
        m_17 = card_score_exact_20.getId();
        m_18 = card_score_exact_33.getId();
        m_19 = card_score_exact_14.getId();
        m_20 = card_score_exact_32.getId();
        m_21 = card_score_exact_13.getId();
        m_22 = card_score_exact_31.getId();
        m_23 = card_score_exact_12.getId();
        m_24 = card_bar1_1er22.getId();
        m_25 = card_bar1_1er2x.getId();
        m_26 = card_bar1_1er21.getId();
        m_27 = card_inconnue_but_bar11er.getId();
        m_28 = card_inconnue_but_barx1er.getId();
        m_29 = card_2temps_resultat_bar22plus.getId();
        m_30 = card_2temps_resultat_bar22moin.getId();
        m_31 = card_2temps_resultat_barx2moin.getId();
        m_32 = card_2temps_resultat_bar12moin.getId();
        m_33 = card_2temps_winner_bar2v.getId();
        m_34 = card_2temps_winner_bar1v.getId();
        m_35 = card_2temps_double_chance_bar2xnon.getId();
        m_36 = card_bar1_1er12.getId();
        m_37 = card_2temps_resultat_barx2plus.getId();
        m_38 = card_2temps_double_chance_barx2oui.getId();
        m_39 = card_2temps_ecart_bar210.getId();
        m_40 = card_2temps_ecart_barx10.getId();
        m_41 = card_score_exact_30.getId();
        m_42 = card_score_exact_11.getId();
        m_43 = card_score_exact_24.getId();
        m_44 = card_score_exact_10.getId();
        m_45 = card_score_exact_23.getId();
        m_46 = card_score_exact_04.getId();
        m_47 = card_score_exact_22.getId();
        m_48 = card_score_exact_03.getId();
        m_49 = card_bar1_1er11.getId();
        m_50 = card_bar1_1er1x.getId();
        m_51 = card_2temps_resultat_bar12plus.getId();
        m_52 = card_2temps_ecart_bar110.getId();
        m_53 = card_2temps_double_chance_bar12non.getId();
        m_54 = card_2temps_double_chance_bar12oui.getId();
        m_55 = card_2temps_double_chance_bar1xnon.getId();
        m_56 = card_2temps_double_chance_bar1xoui.getId();
        m_57 = card_double_chance_x2bar_non.getId();
        m_58 = card_double_chance_x2bar_oui.getId();
        m_59 = card_double_chance_12bar_non.getId();
        m_60 = card_double_chance_12bar_oui.getId();
        m_61 = card_double_chance_1xbar_non.getId();
        m_62 = card_double_chance_1xbar_oui.getId();
        m_63 = card_2temps_winner_bar2non.getId();
        m_64 = card_2temps_winner_bar2oui.getId();
        m_65 = card_2temps_winner_barxnon.getId();
        m_66 = card_2temps_winner_barxoui.getId();
        m_67 = card_2temps_winner_bar1non.getId();
        m_68 = card_2temps_winner_bar1oui.getId();
        m_69 = card_2temps_double_barx2.getId();
        m_70 = card_2temps_double_bar12.getId();
        m_71 = card_2temps_double_bar1x.getId();
        m_72 = card_1temps_nbre_but_pair.getId();
        m_73 = card_1temps_nbre_but_impair.getId();
        m_74 = card_1temps_score_exact_22bar.getId();
        m_75 = card_1temps_score_exact_21bar.getId();
        m_76 = card_1temps_score_exact_20bar.getId();
        m_77 = card_1temps_score_exact_12bar.getId();
        m_78 = card_1temps_score_exact_11bar.getId();
        m_79 = card_1temps_score_exact_10bar.getId();
        m_80 = card_1temps_score_exact_02bar.getId();
        m_81 = card_1temps_score_exact_01bar.getId();
        m_82 = card_1temps_score_exact_00bar.getId();
        m_83 = card_1temps_nbre_but_pris_non2bar.getId();
        m_84 = card_1temps_nbre_but_pris_oui2bar.getId();
        m_85 = card_1temps_nbre_but_pris_non1bar.getId();
        m_86 = card_1temps_nbre_but_pris_oui1bar.getId();
        m_87 = card_1temps_nbre_but_21moinbar.getId();
        m_88 = card_1temps_nbre_but_21plusbar.getId();
        m_89 = card_1temps_nbre_but_11moinbar.getId();
        m_90 = card_1temps_nbre_but_11plusbar.getId();
        m_91 = card_1temps_resultat_but_2_2plus_bar.getId();
        m_92 = card_1temps_resultat_but_x_2plus_bar.getId();
        m_93 = card_1temps_resultat_but_1_2plus_bar.getId();
        m_94 = card_1temps_resultat_but_2_2moin_bar.getId();
        m_95 = card_1temps_ecart_but_210bar.getId();
        m_96 = card_1temps_ecart_but_x10bar.getId();
        m_97 =card_1temps_ecart_but_110bar.getId();
        m_98 = card_winner_1_2v.getId();
        m_99 = card_winner_1_1vbar.getId();
        m_100 = card_1temps_double_x2non.getId();
        m_101 = card_1temps_double_x2oui.getId();
        m_102 = card_double_chance_1temps_x2non_bar.getId();
        m_103 = card_double_chance_1temps_x2oui_bar.getId();
        m_104 = card_double_chance_1temps_12non_bar.getId();
        m_105 = card_double_chance_1temps_12oui_bar.getId();
        m_106 = card_double_chance_1temps_1xnon_bar.getId();
        m_107 = card_double_chance_1temps_1xoui_bar.getId();
        m_109 = card_1temps_resultat_2non_bar.getId();
        m_110 = card_1temps_resultat_2oui_bar.getId();
        m_111 = card_1temps_resultat_xnon_bar.getId();
        m_112 = card_1temps_resultat_xoui_bar.getId();
        m_113 = card_1temps_resultat_1non_bar.getId();
        m_114 = card_1temps_resultat_1oui_bar.getId();
        m_115 = card_marque_2last.getId();
        m_116 = card_marque_1last.getId();
        m_117 = card_marque_xlast.getId();
        m_118 = card_marque_1temps_non1.getId();
        m_119 = card_marque_1temps_oui1.getId();
        m_120 = card_gagne_2temps_non2.getId();
        m_121 = card_gagne_2temps_oui2.getId();
        m_122 = card_gagne_1temps_non1.getId();
        m_123 = card_gagne_1temps_oui1.getId();
        m_124 = card_but_2_pair.getId();
        m_125 = card_but_2_impair.getId();
        m_126 = card_but_1_pair.getId();
        m_127 = card_but_1_impair.getId();
        m_128 = card_but_exact_2_3buts.getId();
        m_129 = card_but_exact_2_2buts.getId();
        m_130 = card_but_exact_2_1but.getId();
        m_131 = card_but_exact_2_0but.getId();
        m_132 = card_but_exact_1_3buts.getId();
        m_133 = card_but_exact_1_2buts.getId();
        m_134 = card_but_exact_1_1but.getId();
        m_135 = card_but_exact_1_0but.getId();
        m_136 = card_nbre_but_4_5.getId();
        m_137 = card_nbre_but_2_3.getId();
        m_138 = card_nbre_but_0_1.getId();
        m_139 = card_resultat_fin_xbar22moin.getId();
        m_140 = card_resultat_fin_2bar12plus.getId();
        m_141 = card_resultat_fin_1bar12plus.getId();
        m_142 = card_carton_2c.getId();
        m_143 = card_resultat_fin_xbarx2moin.getId();
        m_144 = card_resultat_fin_xbar22plus.getId();
        m_145 = card_carton_1x.getId();
        m_146 = card_carton_1c.getId();
        m_147 = card_resultat_fin_xbar12moin.getId();
        m_148 = card_resultat_fin_xbarx2plus.getId();
        m_149 = card_nbre_corner_pair.getId();
        m_150 = card_nbre_corner_impair.getId();
        m_151 = card_resultat_fin_1bar12moin.getId();
        m_152 = card_resultat_fin_xbar12plus.getId();
        m_153 = card_nbre_but_21moin.getId();
        m_154 = card_nbre_but_11plus.getId();
        m_155 = card_2temps_bar2.getId();
        m_156 = card_2temps_barx.getId();
        m_157 = card_2temps_bar1.getId();
        m_158 = card_score_exact_autre.getId();
        m_159 = card_score_exact_44.getId();
        m_160 = card_score_exact_43.getId();
        m_161 = card_resultat_fin_2bar22plus.getId();
        m_162 = card_resultat_fin_1bar22plus.getId();
        m_163 = card_nbre_but_21plus.getId();
        m_164 = card_resultat_fin_2barx2plus.getId();
        m_165 = card_resultat_fin_1barx2plus.getId();
        m_166 = card_nbre_but_11moin.getId();
        m_167 = card_score_exact_42.getId();
        m_168 = card_score_exact_41.getId();
        m_169 = card_resultat_fin_xbar24moin.getId();
        m_170 = card_resultat_fin_2barx4plus.getId();
        m_171 = card_resultat_fin_1barx4plus.getId();
        m_172 = card_resultat_fin_xbarx4moin.getId();
        m_173 = card_resultat_fin_2bar14plus.getId();
        m_174 = card_resultat_fin_1bar14plus.getId();
        m_175 = card_resultat_fin_xbar14moin.getId();
        m_176 = card_resultat_fin_xbar24plus.getId();
        m_177 = card_resultat_fin_2bar23moin.getId();
        m_178 = card_resultat_fin_1bar24moin.getId();
        m_179 = card_resultat_fin_xbarx4plus.getId();
        m_180 = card_resultat_fin_xbar23moin.getId();
        m_181 = card_resultat_fin_1barx4moin.getId();
        m_182 = card_resultat_fin_xbar14plus.getId();
        m_183 = card_resultat_fin_xbarx3moin.getId();
        m_184 = card_resultat_fin_1bar14moin.getId();
        m_185 = card_resultat_fin_1bar24plus.getId();
        m_186 = card_resultat_fin_xbar13moin.getId();
        m_187 = card_resultat_fin_1barx3moin.getId();
        m_188 = card_resultat_fin_1bar13moin.getId();
        m_189 = card_resultat_fin_2bar23plus.getId();
        m_190 = card_resultat_fin_2barx3plus.getId();
        m_191 = card_resultat_fin_2bar13plus.getId();
        m_192 = card_resultat_fin_xbar23plus.getId();
        m_193 = card_resultat_fin_xbarx3plus.getId();
        m_194 = card_resultat_fin_xbar13plus.getId();
        m_195 = card_resultat_fin_1bar23plus.getId();
        m_196 = card_resultat_fin_1barx3plus.getId();
        m_197 = card_resultat_fin_1bar13plus.getId();
        m_198 = card_resultat_fin_2bar22moin.getId();
        m_199 = card_resultat_fin_but_xbar11.getId();
        m_200 = card_resultat_fin_but_1bar11.getId();
        m_201 = card_resultat_fin_but_xbarx0.getId();
        m_202 = card_resultat_fin_2bar25moin.getId();
        m_203 = card_resultat_fin_2barx5moin.getId();
        m_204 = card_resultat_fin_2bar15moin.getId();
        m_205 = card_resultat_fin_xbar25moin.getId();
        m_206 = card_resultat_fin_xbarx5moin.getId();
        m_207 = card_resultat_fin_xbar15moin.getId();
        m_208 = card_resultat_fin_1bar25moin.getId();
        m_209 = card_resultat_fin_1barx5moin.getId();
        m_210 = card_resultat_fin_1bar15moin.getId();
        m_211 = card_resultat_fin_2bar25plus.getId();
        m_212 = card_resultat_fin_2barx5plus.getId();
        m_213 = card_resultat_fin_2bar15plus.getId();
        m_214 = card_resultat_fin_xbar25plus.getId();
        m_215 = card_resultat_fin_xbarx5plus.getId();
        m_216 = card_resultat_fin_xbar15plus.getId();
        m_217 = card_resultat_fin_1bar25plus.getId();
        m_218 = card_resultat_fin_1barx5plus.getId();
        m_219 = card_resultat_fin_1bar15plus.getId();
        m_220 = card_resultat_fin_2bar24moin.getId();
        m_221 = card_resultat_fin_2barx4moin.getId();
        m_222 = card_resultat_fin_2bar14moin.getId();
        m_223 = card_but_exact_6plus.getId();
        m_224 = card_but_exact_5.getId();
        m_225 = card_but_exact_4.getId();
        m_226 = card_but_exact_3.getId();
        m_227 = card_but_exact_1.getId();
        m_228 = card_but_exact_0.getId();
        m_229 = card_but_exact_2.getId();
        m_230 = card_2equip_but_non3moin.getId();
        m_231 = card_2equip_but_non3plus.getId();
        m_232 = card_2equip_but_oui3moin.getId();
        m_233 = card_2equip_but_oui3plus.getId();
        m_234 = card_resultat_double_chance_x2_5plus.getId();
        m_235 = card_resultat_double_chance_12_5plus.getId();
        m_236 = card_resultat_double_chance_12_5moin.getId();
        m_237 = card_resultat_double_chance_1x_5moin.getId();
        m_238 = card_1temps_resultat_but_x_2moin_bar.getId();
        m_239 = card_1temps_resultat_but_1_2moin_bar.getId();
        m_240 = card_1temps_double_x2.getId();
        m_241 = card_resultat_double_chance_1x_5plus.getId();
        m_242 = card_1temps_double_12.getId();
        m_243 = card_1temps_double_1x.getId();
        m_245 = card_fin_mitemps_2bar2.getId();
        m_246 = card_fin_mitemps_xbar2.getId();
        m_247 = card_fin_mitemps_1bar2.getId();
        m_248 = card_fin_mitemps_2barx.getId();
        m_249 = card_fin_mitemps_xbarx.getId();
        m_250 = card_fin_mitemps_1barx.getId();
        m_251 = card_fin_mitemps_2bar1.getId();
        m_252 = card_fin_mitemps_xbar1.getId();
        m_253 = card_fin_mitemps_1bar1.getId();
        m_254 = card_resultat_fin_but_2bar24.getId();
        m_255 = card_resultat_fin_but_2barx4.getId();
        m_256 = card_resultat_fin_but_2bar14.getId();
        m_257 = card_resultat_fin_but_xbar24.getId();
        m_258 = card_resultat_fin_but_xbarx4.getId();
        m_259 = card_resultat_fin_but_xbar14.getId();
        m_260 = card_resultat_fin_but_1bar24.getId();
        m_262 = card_resultat_fin_but_1barx4.getId();
        m_263 = card_resultat_fin_but_1bar14.getId();
        m_264 = card_resultat_fin_but_2bar23.getId();
        m_265 = card_resultat_fin_but_2bar13.getId();
        m_266 = card_resultat_fin_but_xbar23.getId();
        m_267 = card_resultat_fin_but_xbar13.getId();
        m_268 = card_resultat_fin_but_1bar23.getId();
        m_269 = card_resultat_fin_but_1bar13.getId();
        m_270 = card_resultat_fin_but_2bar22.getId();
        m_271 = card_resultat_fin_but_2barx2.getId();
        m_272 = card_resultat_fin_but_xbar22.getId();
        m_273 = card_1temps_1bar.getId();
        m_274 = card_1temps_xbar.getId();
        m_275 = card_1temps_2bar.getId();
        m_276 = card_double_chance_12non.getId();
        m_277 = card_1temps_but_1Moin_bar.getId();
        m_278 = card_1temps_but_1Plus_bar.getId();
        m_279 = card_2Ekip_but_non_bar.getId();
        m_280 = card_2Ekip_but_oui_bar.getId();
        m_281 = card_resultat_fin_but_xbar21.getId();
        m_282 = card_resultat_fin_but_2bar21.getId();
        m_283 = card_resultat_fin_but_1bar12.getId();
        m_284 = card_resultat_fin_but_1barx2.getId();
        m_285 = card_resultat_fin_but_xbar12.getId();
        m_286 = card_resultat_fin_but_xbarx2.getId();
        m_287 = card_handicap_2_2_0.getId();
        m_288 = card_handicap_x_2_0.getId();
        m_289 = card_handicap_1_2_0.getId();
        m_290 = card_handicap_2_1_0.getId();
        m_291 = card_handicap_x_1_0.getId();
        m_292 = card_handicap_1_1_0.getId();
        m_293 = card_handicap_2_0_2.getId();
        m_294 = card_handicap_x_0_2.getId();
        m_295 = card_handicap_1_0_2.getId();
        m_296 = card_handicap_2_0_1.getId();
        m_297 = card_handicap_x_0_1.getId();
        m_298 = card_handicap_1_0_1.getId();
        m_299 = card_nbre_6M.getId();
        m_300 = card_nbre_6P.getId();
        m_301 = card_double_chance_1xoui.getId();
        m_302 = card_nbre_5M.getId();
        m_303 = card_nbre_5P.getId();
        m_304 = card_nbre_4M.getId();
        m_305 = card_nbre_4P.getId();
        m_306 = card_nbre_3M.getId();
        m_307 = card_nbre_3P.getId();
        m_308 = card_nbre_2P.getId();
        m_309 = card_nbre_1M.getId();
        m_310 = card_nbre_1P.getId();
        m_311 = card_nbre_2M.getId();
        m_312 = card_equipe_non.getId();
        m_313 = card_equipe_oui.getId();
        m_314 = card_double_chance_x2.getId();
        m_315 = card_resultat_1.getId();
        m_316 = card_resultat_x.getId();
        m_317 = card_resultat_2.getId();
        m_318 = card_double_chance_1x.getId();
        m_319 = card_resultat_double_chance_1x_4moin.getId();
        m_320 = card_resultat_double_chance_x2_3plus.getId();
        m_321 = card_resultat_double_chance_12_3plus.getId();
        m_322 = card_resultat_double_chance_1x_3plus.getId();
        m_323 = card_equipe1_but_oui.getId();
        m_324 = card_pair_but.getId();
        m_325 = card_impair_but.getId();
        m_326 = card_2temps_Bar_3Moin.getId();
        m_327 = card_2temps_Bar_3Plus.getId();
        m_328 = card_2temps_Bar_2Moin.getId();
        m_329 = card_2temps_Bar_2Plus.getId();
        m_330 = card_2temps_Bar_1Moin.getId();
        m_331 = card_2temps_Bar_1Plus.getId();
        m_332 = card_bar_non.getId();
        m_333 = card_bar_oui.getId();
        m_334 = card_temps_egalite.getId();
        m_335 = card_temps_2.getId();
        m_336 = card_temps_1.getId();
        m_337 = card_1temps_2but_pLus_bar.getId();
        m_338 = card_1temps_1but_bar.getId();
        m_339 = card_1temps_0but_bar.getId();
        m_340 = card_1temps_but_3Moin_bar.getId();
        m_341 = card_1temps_but_3Plus_bar.getId();
        m_342 = card_1temps_but_2Moin_bar.getId();
        m_343 = card_1temps_but_2Plus_bar.getId();
        m_344 = card_resultat_double_chance_x2_4plus.getId();
        m_345 = card_resultat_double_chance_12_4plus.getId();
        m_346 = card_resultat_double_chance_1x_4plus.getId();
        m_347 = card_resultat_double_chance_x2_4moin.getId();
        m_348 = card_resultat_double_chance_12_4moin.getId();
        m_349 = card_resultat_double_chance_x2_3moin.getId();
        m_350 = card_resultat_double_chance_12_3moin.getId();
        m_351 = card_resultat_double_chance_1x_3moin.getId();
        m_352 = card_resultat_double_chance_x_2plus.getId();
        m_353 = card_resultat_double_chance_12_2plus.getId();
        m_354 = card_resultat_double_chance_1x_2plus.getId();
        m_355 = card_equipe1_but_non.getId();
        m_356 = card_equipe2_but_oui.getId();
        m_357 = card_equipe2_but_non.getId();
        m_358 = card_double_chance_1xnon.getId();
        m_359 = card_double_chance_12oui.getId();
        m_360 = card_double_chance_x2non.getId();
        m_361 = card_double_chance_x2oui.getId();
        m_362 = card_resultat_2equip_1oui.getId();
        m_363 = card_resultat_2equip_1non.getId();
        m_364 = card_resultat_2equip_xoui.getId();
        m_365 = card_resultat_2equip_xnon.getId();
        m_366 = card_resultat_2equip_2oui.getId();
        m_367 = card_resultat_2equip_2non.getId();
        m_368 = card_resultat_nbre2but_1_2moin.getId();
        m_369 = card_resultat_nbre2but_x_2moin.getId();
        m_370 = card_resultat_nbre2but_2_2moin.getId();
        m_371 = card_resultat_nbre2but_1_2plus.getId();
        m_372 = card_resultat_nbre2but_x_2plus.getId();
        m_373 = card_resultat_nbre2but_2_2plus.getId();
        m_374 = card_resultat_nbre2but_1_3moin.getId();
        m_375 = card_resultat_nbre2but_x_3moin.getId();
        m_376 = card_resultat_nbre2but_2_3moin.getId();
        m_377 = card_resultat_nbre2but_1_3plus.getId();
        m_378 = card_resultat_nbre2but_x_3plus.getId();
        m_379 = card_resultat_nbre2but_2_3plus.getId();
        m_380 = card_resultat_nbre2but_1_4moin.getId();
        m_381 = card_resultat_nbre2but_x_4moin.getId();
        m_382 = card_resultat_nbre2but_2_4moin.getId();
        m_383 = card_resultat_nbre2but_1_4plus.getId();
        m_384 = card_resultat_nbre2but_x_4plus.getId();
        m_385 = card_resultat_nbre2but_2_4plus.getId();
        m_386 = card_resultat_nbre2but_1_5moin.getId();
        m_387 = card_resultat_nbre2but_x_5moin.getId();
        m_388 = card_resultat_nbre2but_2_5moin.getId();
        m_389 = card_resultat_nbre2but_1_5plus.getId();
        m_390 = card_resultat_nbre2but_x_5plus.getId();
        m_391 = card_resultat_nbre2but_2_5plus.getId();
        m_392 = card_resultat_double_chance_1x_2moin.getId();
        m_393 = card_resultat_double_chance_12_2moin.getId();
        m_394 = card_resultat_double_chance_2x_2moin.getId();
        m_395 = card_resultat_fin_2bar24plus.getId();

        progressDialog = new ProgressDialog(getContext());

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.dismiss();
                getDialog().dismiss();
            }
        });

        btn_valide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String io = card_butteur_name.getText().toString();
                if ((io.isEmpty())  && (Bet_ID == 0)){
                    Toast.makeText(getContext(), getString(R.string.please_select_bet), Toast.LENGTH_SHORT).show();
                }else if ((!io.isEmpty())  && (Bet_ID == 0)){
                    try {
                        match_4.writeCache(io);
                        set_true_match_4.writeCache(io);
                        Intent i = new Intent(getActivity(), ParisFootActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(i);
                        getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else if ((io.isEmpty())  && (Bet_ID != 0)) {
                    if (Bet_ID == m_273) {
                        try {
                            set_true_match_4.writeCache("1/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_274) {
                        try {
                            set_true_match_4.writeCache("x/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_275) {
                        try {
                            set_true_match_4.writeCache("2/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_280) {
                        try {
                            set_true_match_4.writeCache("oui/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_279) {
                        try {
                            set_true_match_4.writeCache("non/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_278) {
                        try {
                            set_true_match_4.writeCache("1+/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_277) {
                        try {
                            set_true_match_4.writeCache("1-/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_343) {
                        try {
                            set_true_match_4.writeCache("2+/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_342) {
                        try {
                            set_true_match_4.writeCache("2-/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_341) {
                        try {
                            set_true_match_4.writeCache("3+/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_340) {
                        try {
                            set_true_match_4.writeCache("3-/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_339) {
                        try {
                            set_true_match_4.writeCache("0but/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_338) {
                        try {
                            set_true_match_4.writeCache("1but/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_337) {
                        try {
                            set_true_match_4.writeCache("2+but/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_336) {
                        try {
                            set_true_match_4.writeCache("1er");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_335) {
                        try {
                            set_true_match_4.writeCache("2e");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_334) {
                        try {
                            set_true_match_4.writeCache("egalite");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_333) {
                        try {
                            set_true_match_4.writeCache("/oui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_332) {
                        try {
                            set_true_match_4.writeCache("/non");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_332) {
                        try {
                            set_true_match_4.writeCache("/non");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_331) {
                        try {
                            set_true_match_4.writeCache("/1+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_330) {
                        try {
                            set_true_match_4.writeCache("/1-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_329) {
                        try {
                            set_true_match_4.writeCache("/2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_328) {
                        try {
                            set_true_match_4.writeCache("/2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_327) {
                        try {
                            set_true_match_4.writeCache("/3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_326) {
                        try {
                            set_true_match_4.writeCache("/3-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_323) {
                        try {
                            set_true_match_4.writeCache("oui1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_355) {
                        try {
                            set_true_match_4.writeCache("non1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_356) {
                        try {
                            set_true_match_4.writeCache("oui2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_357) {
                        try {
                            set_true_match_4.writeCache("non2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_357) {
                        try {
                            set_true_match_4.writeCache("non2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_301) {
                        try {
                            set_true_match_4.writeCache("1xoui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_276) {
                        try {
                            set_true_match_4.writeCache("12non");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_361) {
                        try {
                            set_true_match_4.writeCache("x2oui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_358) {
                        try {
                            set_true_match_4.writeCache("1xnon");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_359) {
                        try {
                            set_true_match_4.writeCache("12oui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_360) {
                        try {
                            set_true_match_4.writeCache("x2non");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_362) {
                        try {
                            set_true_match_4.writeCache("1oui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_363) {
                        try {
                            set_true_match_4.writeCache("1non");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_364) {
                        try {
                            set_true_match_4.writeCache("xoui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_365) {
                        try {
                            set_true_match_4.writeCache("xnon");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_366) {
                        try {
                            set_true_match_4.writeCache("2oui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_367) {
                        try {
                            set_true_match_4.writeCache("2non");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_368) {
                        try {
                            set_true_match_4.writeCache("1_2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_369) {
                        try {
                            set_true_match_4.writeCache("x_2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_370) {
                        try {
                            set_true_match_4.writeCache("2_2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_371) {
                        try {
                            set_true_match_4.writeCache("1_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_372) {
                        try {
                            set_true_match_4.writeCache("x_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_373) {
                        try {
                            set_true_match_4.writeCache("2_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_374) {
                        try {
                            set_true_match_4.writeCache("1_3-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_375) {
                        try {
                            set_true_match_4.writeCache("x_3-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_376) {
                        try {
                            set_true_match_4.writeCache("2_3-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_377) {
                        try {
                            set_true_match_4.writeCache("1_3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_378) {
                        try {
                            set_true_match_4.writeCache("x_3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_379) {
                        try {
                            set_true_match_4.writeCache("2_3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_380) {
                        try {
                            set_true_match_4.writeCache("1_4-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_381) {
                        try {
                            set_true_match_4.writeCache("x_4-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_382) {
                        try {
                            set_true_match_4.writeCache("2_4-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_383) {
                        try {
                            set_true_match_4.writeCache("1_4+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_384) {
                        try {
                            set_true_match_4.writeCache("x_4+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_385) {
                        try {
                            set_true_match_4.writeCache("2_4+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_386) {
                        try {
                            set_true_match_4.writeCache("1_5-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_387) {
                        try {
                            set_true_match_4.writeCache("x_5-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_388) {
                        try {
                            set_true_match_4.writeCache("2_5-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_389) {
                        try {
                            set_true_match_4.writeCache("1_5+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_390) {
                        try {
                            set_true_match_4.writeCache("x_5+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_391) {
                        try {
                            set_true_match_4.writeCache("2_5+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_392) {
                        try {
                            set_true_match_4.writeCache("1x_2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_393) {
                        try {
                            set_true_match_4.writeCache("12_2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_394) {
                        try {
                            set_true_match_4.writeCache("x2_2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_353) {
                        try {
                            set_true_match_4.writeCache("12_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_352) {
                        try {
                            set_true_match_4.writeCache("x2_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_351) {
                        try {
                            set_true_match_4.writeCache("1x_3-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_350) {
                        try {
                            set_true_match_4.writeCache("12_3-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_349) {
                        try {
                            set_true_match_4.writeCache("x2_3-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_322) {
                        try {
                            set_true_match_4.writeCache("1x_3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_321) {
                        try {
                            set_true_match_4.writeCache("12_3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_320) {
                        try {
                            set_true_match_4.writeCache("x2_3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_319) {
                        try {
                            set_true_match_4.writeCache("1x_4-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_348) {
                        try {
                            set_true_match_4.writeCache("12_4-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_347) {
                        try {
                            set_true_match_4.writeCache("x2_4-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_346) {
                        try {
                            set_true_match_4.writeCache("1x_4+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_345) {
                        try {
                            set_true_match_4.writeCache("12_4+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_344) {
                        try {
                            set_true_match_4.writeCache("x2_4+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_237) {
                        try {
                            set_true_match_4.writeCache("1x_5-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_236) {
                        try {
                            set_true_match_4.writeCache("12_5-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_241) {
                        try {
                            set_true_match_4.writeCache("1x_5+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_235) {
                        try {
                            set_true_match_4.writeCache("12_5+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_234) {
                        try {
                            set_true_match_4.writeCache("x2_5+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_233) {
                        try {
                            set_true_match_4.writeCache("oui3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_232) {
                        try {
                            set_true_match_4.writeCache("oui3-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_231) {
                        try {
                            set_true_match_4.writeCache("non3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_230) {
                        try {
                            set_true_match_4.writeCache("non3-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_228) {
                        try {
                            set_true_match_4.writeCache("0but");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_227) {
                        try {
                            set_true_match_4.writeCache("1but");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_229) {
                        try {
                            set_true_match_4.writeCache("2buts");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_226) {
                        try {
                            set_true_match_4.writeCache("3buts");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_225) {
                        try {
                            set_true_match_4.writeCache("4buts");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_224) {
                        try {
                            set_true_match_4.writeCache("5buts");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_223) {
                        try {
                            set_true_match_4.writeCache("6+buts");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_135) {
                        try {
                            set_true_match_4.writeCache("1_0but");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_134) {
                        try {
                            set_true_match_4.writeCache("1_1but");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_133) {
                        try {
                            set_true_match_4.writeCache("1_2buts");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_132) {
                        try {
                            set_true_match_4.writeCache("1_3+buts");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_131) {
                        try {
                            set_true_match_4.writeCache("2_0but");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_130) {
                        try {
                            set_true_match_4.writeCache("2_1but");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_129) {
                        try {
                            set_true_match_4.writeCache("2_2buts");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_128) {
                        try {
                            set_true_match_4.writeCache("2_3+buts");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_127) {
                        try {
                            set_true_match_4.writeCache("1impair");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_126) {
                        try {
                            set_true_match_4.writeCache("1pair");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_125) {
                        try {
                            set_true_match_4.writeCache("2impair");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_124) {
                        try {
                            set_true_match_4.writeCache("2pair");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_123) {
                        try {
                            set_true_match_4.writeCache("oui1/1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_122) {
                        try {
                            set_true_match_4.writeCache("non1/1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_121) {
                        try {
                            set_true_match_4.writeCache("oui2/2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_120) {
                        try {
                            set_true_match_4.writeCache("non2/2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_119) {
                        try {
                            set_true_match_4.writeCache("oui1/oui1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_118) {
                        try {
                            set_true_match_4.writeCache("non1/non1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_5) {
                        try {
                            set_true_match_4.writeCache("oui2/oui2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_8) {
                        try {
                            set_true_match_4.writeCache("non2/non2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_117) {
                        try {
                            set_true_match_4.writeCache("xlast");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_116) {
                        try {
                            set_true_match_4.writeCache("1last");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_115) {
                        try {
                            set_true_match_4.writeCache("2last");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_243) {
                        try {
                            set_true_match_4.writeCache("1x/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_242) {
                        try {
                            set_true_match_4.writeCache("12/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_240) {
                        try {
                            set_true_match_4.writeCache("x2/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_114) {
                        try {
                            set_true_match_4.writeCache("1oui/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_113) {
                        try {
                            set_true_match_4.writeCache("1non/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_112) {
                        try {
                            set_true_match_4.writeCache("xoui/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_111) {
                        try {
                            set_true_match_4.writeCache("xnon/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_110) {
                        try {
                            set_true_match_4.writeCache("2oui/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_109) {
                        try {
                            set_true_match_4.writeCache("2non/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_107) {
                        try {
                            set_true_match_4.writeCache("1x_oui/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_106) {
                        try {
                            set_true_match_4.writeCache("1x_non/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_105) {
                        try {
                            set_true_match_4.writeCache("12_oui/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_104) {
                        try {
                            set_true_match_4.writeCache("12_non/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_103) {
                        try {
                            set_true_match_4.writeCache("x2_oui/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_102) {
                        try {
                            set_true_match_4.writeCache("x2_non/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_4) {
                        try {
                            set_true_match_4.writeCache("1xoui/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_3) {
                        try {
                            set_true_match_4.writeCache("1xnon/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_2) {
                        try {
                            set_true_match_4.writeCache("12oui/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_1) {
                        try {
                            set_true_match_4.writeCache("12non/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_101) {
                        try {
                            set_true_match_4.writeCache("x2oui/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_100) {
                        try {
                            set_true_match_4.writeCache("x2non/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_100) {
                        try {
                            set_true_match_4.writeCache("x2non/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_99) {
                        try {
                            set_true_match_4.writeCache("1v/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_98) {
                        try {
                            set_true_match_4.writeCache("2v/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_97) {
                        try {
                            set_true_match_4.writeCache("1(1:0)/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_96) {
                        try {
                            set_true_match_4.writeCache("x(1:0)/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_95) {
                        try {
                            set_true_match_4.writeCache("2(1:0)/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_239) {
                        try {
                            set_true_match_4.writeCache("1_2-/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_238) {
                        try {
                            set_true_match_4.writeCache("x_2-/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_94) {
                        try {
                            set_true_match_4.writeCache("2_2-/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_93) {
                        try {
                            set_true_match_4.writeCache("1_2+/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_92) {
                        try {
                            set_true_match_4.writeCache("x_2+/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_91) {
                        try {
                            set_true_match_4.writeCache("2_2+/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_90) {
                        try {
                            set_true_match_4.writeCache("1_1+but/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_89) {
                        try {
                            set_true_match_4.writeCache("1_1-but/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_88) {
                        try {
                            set_true_match_4.writeCache("2_1+but/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_87) {
                        try {
                            set_true_match_4.writeCache("2_1-but/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_86) {
                        try {
                            set_true_match_4.writeCache("oui1/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_85) {
                        try {
                            set_true_match_4.writeCache("non1/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_84) {
                        try {
                            set_true_match_4.writeCache("oui2/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_83) {
                        try {
                            set_true_match_4.writeCache("non2/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_82) {
                        try {
                            set_true_match_4.writeCache("0:0/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_81) {
                        try {
                            set_true_match_4.writeCache("0:1/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_80) {
                        try {
                            set_true_match_4.writeCache("0:2/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_79) {
                        try {
                            set_true_match_4.writeCache("1:0/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_78) {
                        try {
                            set_true_match_4.writeCache("1:1/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_77) {
                        try {
                            set_true_match_4.writeCache("1:2/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_76) {
                        try {
                            set_true_match_4.writeCache("2:0/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_75) {
                        try {
                            set_true_match_4.writeCache("2:1/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_74) {
                        try {
                            set_true_match_4.writeCache("2:2/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_73) {
                        try {
                            set_true_match_4.writeCache("impair/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_72) {
                        try {
                            set_true_match_4.writeCache("pair/");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_71) {
                        try {
                            set_true_match_4.writeCache("/1x");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_70) {
                        try {
                            set_true_match_4.writeCache("/12");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_69) {
                        try {
                            set_true_match_4.writeCache("/x2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_68) {
                        try {
                            set_true_match_4.writeCache("/1oui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_67) {
                        try {
                            set_true_match_4.writeCache("/1non");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_66) {
                        try {
                            set_true_match_4.writeCache("/xoui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_65) {
                        try {
                            set_true_match_4.writeCache("/xnon");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_64) {
                        try {
                            set_true_match_4.writeCache("/2oui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_63) {
                        try {
                            set_true_match_4.writeCache("/2non");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_62) {
                        try {
                            set_true_match_4.writeCache("1x_/oui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_61) {
                        try {
                            set_true_match_4.writeCache("1x_/non");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_60) {
                        try {
                            set_true_match_4.writeCache("12_/oui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_59) {
                        try {
                            set_true_match_4.writeCache("12_/non");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_58) {
                        try {
                            set_true_match_4.writeCache("x2_/oui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_57) {
                        try {
                            set_true_match_4.writeCache("x2_/non");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_56) {
                        try {
                            set_true_match_4.writeCache("/1xoui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_55) {
                        try {
                            set_true_match_4.writeCache("/1xnon");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_54) {
                        try {
                            set_true_match_4.writeCache("/12oui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_53) {
                        try {
                            set_true_match_4.writeCache("/12non");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_38) {
                        try {
                            set_true_match_4.writeCache("/x2oui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_35) {
                        try {
                            set_true_match_4.writeCache("/x2non");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_34) {
                        try {
                            set_true_match_4.writeCache("/1v");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_33) {
                        try {
                            set_true_match_4.writeCache("/2v");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_52) {
                        try {
                            set_true_match_4.writeCache("/1(1:0)");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_40) {
                        try {
                            set_true_match_4.writeCache("/x(1:0)");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_39) {
                        try {
                            set_true_match_4.writeCache("/2(1:0)");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_32) {
                        try {
                            set_true_match_4.writeCache("/1_2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_31) {
                        try {
                            set_true_match_4.writeCache("/x_2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_30) {
                        try {
                            set_true_match_4.writeCache("/2_2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_51) {
                        try {
                            set_true_match_4.writeCache("/1_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_37) {
                        try {
                            set_true_match_4.writeCache("/x_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_29) {
                        try {
                            set_true_match_4.writeCache("/2_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_28) {
                        try {
                            set_true_match_4.writeCache("x_1erbut");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_27) {
                        try {
                            set_true_match_4.writeCache("1_1erbut");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_13) {
                        try {
                            set_true_match_4.writeCache("2_1erbut");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_49) {
                        try {
                            set_true_match_4.writeCache("1erbut_1/1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_50) {
                        try {
                            set_true_match_4.writeCache("1erbut_1/x");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_36) {
                        try {
                            set_true_match_4.writeCache("1erbut_1/2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_26) {
                        try {
                            set_true_match_4.writeCache("1erbut_2/1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_25) {
                        try {
                            set_true_match_4.writeCache("1erbut_2/x");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_24) {
                        try {
                            set_true_match_4.writeCache("1erbut_2/2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_12) {
                        try {
                            set_true_match_4.writeCache("1erbut_0");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_157) {
                        try {
                            set_true_match_4.writeCache("/1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_156) {
                        try {
                            set_true_match_4.writeCache("/x");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_155) {
                        try {
                            set_true_match_4.writeCache("/2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_154) {
                        try {
                            set_true_match_4.writeCache("1_1+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_166) {
                        try {
                            set_true_match_4.writeCache("1_1-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_163) {
                        try {
                            set_true_match_4.writeCache("2_1+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_153) {
                        try {
                            set_true_match_4.writeCache("2_1-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_150) {
                        try {
                            set_true_match_4.writeCache("c_impair");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_149) {
                        try {
                            set_true_match_4.writeCache("c_pair");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_146) {
                        try {
                            set_true_match_4.writeCache("1c");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_145) {
                        try {
                            set_true_match_4.writeCache("xc");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_142) {
                        try {
                            set_true_match_4.writeCache("2c");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_141) {
                        try {
                            set_true_match_4.writeCache("1/1_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_165) {
                        try {
                            set_true_match_4.writeCache("1/x_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_162) {
                        try {
                            set_true_match_4.writeCache("1/2_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_152) {
                        try {
                            set_true_match_4.writeCache("x/1_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_148) {
                        try {
                            set_true_match_4.writeCache("x/x_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_144) {
                        try {
                            set_true_match_4.writeCache("x/2_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_140) {
                        try {
                            set_true_match_4.writeCache("2/1_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_164) {
                        try {
                            set_true_match_4.writeCache("2/x_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_161) {
                        try {
                            set_true_match_4.writeCache("2/2_2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_151) {
                        try {
                            set_true_match_4.writeCache("1/1_2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_151) {
                        try {
                            set_true_match_4.writeCache("1/1_2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_147) {
                        try {
                            set_true_match_4.writeCache("x/1_2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_143) {
                        try {
                            set_true_match_4.writeCache("x/x_2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_139) {
                        try {
                            set_true_match_4.writeCache("x/2_2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_198) {
                        try {
                            set_true_match_4.writeCache("2/2_2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_197) {
                        try {
                            set_true_match_4.writeCache("1/1_3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_196) {
                        try {
                            set_true_match_4.writeCache("1/x_3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_195) {
                        try {
                            set_true_match_4.writeCache("1/2_3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_194) {
                        try {
                            set_true_match_4.writeCache("x/1_3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_193) {
                        try {
                            set_true_match_4.writeCache("x/x_3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_192) {
                        try {
                            set_true_match_4.writeCache("x/2_3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_191) {
                        try {
                            set_true_match_4.writeCache("2/1_3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_190) {
                        try {
                            set_true_match_4.writeCache("2/x_3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_189) {
                        try {
                            set_true_match_4.writeCache("2/2_3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_188) {
                        try {
                            set_true_match_4.writeCache("1/1_3-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_187) {
                        try {
                            set_true_match_4.writeCache("1/x_3-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_186) {
                        try {
                            set_true_match_4.writeCache("x/1_3-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_183) {
                        try {
                            set_true_match_4.writeCache("x/x_3-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_180) {
                        try {
                            set_true_match_4.writeCache("x/2_3-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_177) {
                        try {
                            set_true_match_4.writeCache("2/2_3-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_174) {
                        try {
                            set_true_match_4.writeCache("1/1_4+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_171) {
                        try {
                            set_true_match_4.writeCache("1/x_4+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_185) {
                        try {
                            set_true_match_4.writeCache("1/2_4+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_182) {
                        try {
                            set_true_match_4.writeCache("x/1_4+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_179) {
                        try {
                            set_true_match_4.writeCache("x/x_4+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_176) {
                        try {
                            set_true_match_4.writeCache("x/2_4+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_173) {
                        try {
                            set_true_match_4.writeCache("2/1_4+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_170) {
                        try {
                            set_true_match_4.writeCache("2/x_4+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_395) {
                        try {
                            set_true_match_4.writeCache("2/2_4+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_184) {
                        try {
                            set_true_match_4.writeCache("1/1_4-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_181) {
                        try {
                            set_true_match_4.writeCache("1/x_4-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_178) {
                        try {
                            set_true_match_4.writeCache("1/2_4-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_175) {
                        try {
                            set_true_match_4.writeCache("x/1_4-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_172) {
                        try {
                            set_true_match_4.writeCache("x/x_4-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_169) {
                        try {
                            set_true_match_4.writeCache("x/2_4-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_222) {
                        try {
                            set_true_match_4.writeCache("2/1_4-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_221) {
                        try {
                            set_true_match_4.writeCache("2/x_4-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_220) {
                        try {
                            set_true_match_4.writeCache("2/2_4-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_219) {
                        try {
                            set_true_match_4.writeCache("1/1_5+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_218) {
                        try {
                            set_true_match_4.writeCache("1/x_5+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_217) {
                        try {
                            set_true_match_4.writeCache("1/2_5+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_216) {
                        try {
                            set_true_match_4.writeCache("x/1_5+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_215) {
                        try {
                            set_true_match_4.writeCache("x/x_5+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_214) {
                        try {
                            set_true_match_4.writeCache("x/2_5+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_213) {
                        try {
                            set_true_match_4.writeCache("2/1_5+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_212) {
                        try {
                            set_true_match_4.writeCache("2/x_5+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_211) {
                        try {
                            set_true_match_4.writeCache("2/2_5+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_210) {
                        try {
                            set_true_match_4.writeCache("1/1_5-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_209) {
                        try {
                            set_true_match_4.writeCache("1/x_5-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_208) {
                        try {
                            set_true_match_4.writeCache("1/2_5-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_207) {
                        try {
                            set_true_match_4.writeCache("x/1_5-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_206) {
                        try {
                            set_true_match_4.writeCache("x/x_5-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_205) {
                        try {
                            set_true_match_4.writeCache("x/2_5-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_204) {
                        try {
                            set_true_match_4.writeCache("2/1_5-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_203) {
                        try {
                            set_true_match_4.writeCache("2/x_5-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_202) {
                        try {
                            set_true_match_4.writeCache("2/2_5-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_201) {
                        try {
                            set_true_match_4.writeCache("x/x_0");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_200) {
                        try {
                            set_true_match_4.writeCache("1/1_1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_199) {
                        try {
                            set_true_match_4.writeCache("x/1_1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_281) {
                        try {
                            set_true_match_4.writeCache("x/2_1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_282) {
                        try {
                            set_true_match_4.writeCache("2/2_1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_283) {
                        try {
                            set_true_match_4.writeCache("1/1_2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_284) {
                        try {
                            set_true_match_4.writeCache("1/x_2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_285) {
                        try {
                            set_true_match_4.writeCache("x/1_2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_286) {
                        try {
                            set_true_match_4.writeCache("x/x_2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_272) {
                        try {
                            set_true_match_4.writeCache("x/2_2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_271) {
                        try {
                            set_true_match_4.writeCache("2/x_2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_270) {
                        try {
                            set_true_match_4.writeCache("2/2_2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_269) {
                        try {
                            set_true_match_4.writeCache("1/1_3");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_268) {
                        try {
                            set_true_match_4.writeCache("1/2_3");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_267) {
                        try {
                            set_true_match_4.writeCache("x/1_3");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_266) {
                        try {
                            set_true_match_4.writeCache("x/2_3");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_265) {
                        try {
                            set_true_match_4.writeCache("2/1_3");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_264) {
                        try {
                            set_true_match_4.writeCache("2/2_3");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_263) {
                        try {
                            set_true_match_4.writeCache("1/1_4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_262) {
                        try {
                            set_true_match_4.writeCache("1/x_4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_260) {
                        try {
                            set_true_match_4.writeCache("1/2_4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_259) {
                        try {
                            set_true_match_4.writeCache("x/1_4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_258) {
                        try {
                            set_true_match_4.writeCache("x/x_4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_257) {
                        try {
                            set_true_match_4.writeCache("x/2_4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_256) {
                        try {
                            set_true_match_4.writeCache("2/1_4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_255) {
                        try {
                            set_true_match_4.writeCache("2/x_4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_254) {
                        try {
                            set_true_match_4.writeCache("2/2_4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    //ADD
                    if (Bet_ID == m_315) {
                        try {
                            set_true_match_4.writeCache("1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_316) {
                        try {
                            set_true_match_4.writeCache("x");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_317) {
                        try {
                            set_true_match_4.writeCache("2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_318) {
                        try {
                            set_true_match_4.writeCache("1x");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_314) {
                        try {
                            set_true_match_4.writeCache("x2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_313) {
                        try {
                            set_true_match_4.writeCache("oui");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_312) {
                        try {
                            set_true_match_4.writeCache("non");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_310) {
                        try {
                            set_true_match_4.writeCache("1+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_309) {
                        try {
                            set_true_match_4.writeCache("1-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_308) {
                        try {
                            set_true_match_4.writeCache("2+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_311) {
                        try {
                            set_true_match_4.writeCache("2-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_307) {
                        try {
                            set_true_match_4.writeCache("3+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_306) {
                        try {
                            set_true_match_4.writeCache("3-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_305) {
                        try {
                            set_true_match_4.writeCache("4+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_304) {
                        try {
                            set_true_match_4.writeCache("4-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_303) {
                        try {
                            set_true_match_4.writeCache("5+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_302) {
                        try {
                            set_true_match_4.writeCache("5-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_300) {
                        try {
                            set_true_match_4.writeCache("6+");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_299) {
                        try {
                            set_true_match_4.writeCache("6-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_298) {
                        try {
                            set_true_match_4.writeCache("1(0:1)");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_297) {
                        try {
                            set_true_match_4.writeCache("x(0:1)");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_296) {
                        try {
                            set_true_match_4.writeCache("2(0:1)");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_295) {
                        try {
                            set_true_match_4.writeCache("1(0:2)");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_294) {
                        try {
                            set_true_match_4.writeCache("x(0:2)");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_293) {
                        try {
                            set_true_match_4.writeCache("2(0:2)");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_292) {
                        try {
                            set_true_match_4.writeCache("1(1:0)");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_291) {
                        try {
                            set_true_match_4.writeCache("x(1:0)");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_290) {
                        try {
                            set_true_match_4.writeCache("2(1:0)");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_289) {
                        try {
                            set_true_match_4.writeCache("1(2:0)");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_288) {
                        try {
                            set_true_match_4.writeCache("x(2:0)");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_287) {
                        try {
                            set_true_match_4.writeCache("2(2:0)");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_325) {
                        try {
                            set_true_match_4.writeCache("impair");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_324) {
                        try {
                            set_true_match_4.writeCache("pair");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_253) {
                        try {
                            set_true_match_4.writeCache("1/1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_252) {
                        try {
                            set_true_match_4.writeCache("x/1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_251) {
                        try {
                            set_true_match_4.writeCache("2/1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_250) {
                        try {
                            set_true_match_4.writeCache("1/x");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_249) {
                        try {
                            set_true_match_4.writeCache("x/x");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_248) {
                        try {
                            set_true_match_4.writeCache("2/x");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_247) {
                        try {
                            set_true_match_4.writeCache("1/2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_246) {
                        try {
                            set_true_match_4.writeCache("x/2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_245) {
                        try {
                            set_true_match_4.writeCache("2/2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_138) {
                        try {
                            set_true_match_4.writeCache("0-1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_137) {
                        try {
                            set_true_match_4.writeCache("2-3");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_136) {
                        try {
                            set_true_match_4.writeCache("4-5");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_11) {
                        try {
                            set_true_match_4.writeCache("0:0");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_10) {
                        try {
                            set_true_match_4.writeCache("0:1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_10) {
                        try {
                            set_true_match_4.writeCache("0:2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_48) {
                        try {
                            set_true_match_4.writeCache("0:3");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_46) {
                        try {
                            set_true_match_4.writeCache("0:4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_44) {
                        try {
                            set_true_match_4.writeCache("1:0");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_42) {
                        try {
                            set_true_match_4.writeCache("1:1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_23) {
                        try {
                            set_true_match_4.writeCache("1:2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_21) {
                        try {
                            set_true_match_4.writeCache("1:3");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_19) {
                        try {
                            set_true_match_4.writeCache("1:4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_17) {
                        try {
                            set_true_match_4.writeCache("2:0");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_15) {
                        try {
                            set_true_match_4.writeCache("2:1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_47) {
                        try {
                            set_true_match_4.writeCache("2:2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_45) {
                        try {
                            set_true_match_4.writeCache("2:3");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_43) {
                        try {
                            set_true_match_4.writeCache("2:4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_41) {
                        try {
                            set_true_match_4.writeCache("3:0");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_22) {
                        try {
                            set_true_match_4.writeCache("3:1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_20) {
                        try {
                            set_true_match_4.writeCache("3:2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_18) {
                        try {
                            set_true_match_4.writeCache("3:3");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_16) {
                        try {
                            set_true_match_4.writeCache("3:4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_14) {
                        try {
                            set_true_match_4.writeCache("4:0");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_168) {
                        try {
                            set_true_match_4.writeCache("4:1");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_167) {
                        try {
                            set_true_match_4.writeCache("4:2");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_160) {
                        try {
                            set_true_match_4.writeCache("4:3");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_159) {
                        try {
                            set_true_match_4.writeCache("4:4");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Bet_ID == m_158) {
                        try {
                            set_true_match_4.writeCache("autre");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        String result = previousCheckedCompoundButton.getText().toString();
                        match_4.writeCache(result);
                        Intent i = new Intent(getActivity(), ParisFootActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(i);
                        getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(getContext(), getString(R.string.please_select_bet), Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;


    }
}