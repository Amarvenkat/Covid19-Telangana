package com.amar.covid19telangana.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.amar.covid19telangana.ApiInterface.ApiDistrictData;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.DistricRecycler;
import com.amar.covid19telangana.R;
import com.amar.covid19telangana.RetrofitClass.Telangana;
import com.amar.covid19telangana.RetrofitClass.TelanganaStateWise;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TelanganaDistrictData extends AppCompatActivity {

    ProgressBar progressBar;
    RecyclerView recyclerView;
    ArrayList<Integer>  districname      = new ArrayList<Integer>();
    ArrayList<Integer> districactive    = new ArrayList<Integer>();
    ArrayList<Integer> districconfirmed = new ArrayList<Integer>();
    ArrayList<Integer> districdeceased  = new ArrayList<Integer>();
    ArrayList<Integer> districrecovered = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telangana_district_data);

        recyclerView = (RecyclerView) findViewById(R.id.district_recycler);

        progressBar = (ProgressBar) findViewById(R.id.progressbardistrict);


        progressBar.setVisibility(View.INVISIBLE);

        ApiDistrictData apiService =
                ApiClient.getClient().create(ApiDistrictData.class);

        progressBar.setVisibility(View.VISIBLE);

        Call<TelanganaStateWise> call = apiService.getDistrictData();

        call.enqueue(new Callback<TelanganaStateWise>() {
            @Override
            public void onResponse(Response<TelanganaStateWise> response) {

                Telangana result = response.body().getTelangana();

                result.getDistricData();

                Integer adilabadactive =result.getDistricData().getAdilabad().getAdilabadactive();
                Integer bhadradriKothagudemactive =result.getDistricData().getBhadradriKothagudem().getBhadradriKothagudemactive();
                Integer hyderabadactive =result.getDistricData().getHyderabad().getHyderabadactive();
                Integer jagtialactive =result.getDistricData().getJagtial().getJagtialactive();
                Integer  jangaonactive =result.getDistricData().getJangaon().getJangaonactive();
                Integer  jayashankarBhupalapallyactive =result.getDistricData().getJayashankarBhupalapally().getJayashankarBhupalapallyactive();
                Integer  jogulambaGadwalactive =result.getDistricData().getJogulambaGadwal().getJogulambaGadwalactive();
                Integer  kamareddyactive =result.getDistricData().getKamareddy().getKamareddyactive();
                Integer  karimnagaractive =result.getDistricData().getKarimnagar().getKarimnagaractive();
                Integer  khammamactive =result.getDistricData().getKhammam().getKhammamactive();
                Integer komaramBheemactive =result.getDistricData().getKomaramBheem().getKomaramBheemactive();
                Integer mahabubabadactive =result.getDistricData().getMahabubabad().getMahabubabadactive();
                Integer mahabubnagaractive =result.getDistricData().getMahabubnagar().getMahabubnagaractive();
                Integer mancherialactive =result.getDistricData().getMancherial().getMancherialactive();
                Integer medakactive =result.getDistricData().getMedak().getMedakactive();
                Integer medchalMalkajgiriactive =result.getDistricData().getMedchalMalkajgiri().getMedchalMalkajgiriactive();
                Integer muluguactive =result.getDistricData().getMulugu().getMuluguactive();
                Integer nagarkurnoolactive =result.getDistricData().getNagarkurnool().getNagarkurnoolactive();
                Integer nalgondaactive =result.getDistricData().getNalgonda().getNalgondaactive();
                Integer narayanpetactive =result.getDistricData().getNarayanpet().getNarayanpetactive();
                Integer nirmalactive =result.getDistricData().getNirmal().getNirmalactive();
                Integer nizamabadactive =result.getDistricData().getNizamabad().getNizamabadactive();
                Integer peddapalliactive =result.getDistricData().getPeddapalli().getPeddapalliactive();
                Integer rajannaSircillaactive =result.getDistricData().getRajannaSircilla().getRajannaSircillaactive();
                Integer rangaReddyactive =result.getDistricData().getRangaReddy().getRangaReddyactive();
                Integer sangareddyactive =result.getDistricData().getSangareddy().getSangareddyactive();
                Integer siddipetactive =result.getDistricData().getSiddipet().getSiddipetactive();
                Integer suryapetactive =result.getDistricData().getSuryapet().getSuryapetactive();
                Integer vikarabadactive =result.getDistricData().getVikarabad().getVikarabadactive();
                Integer warangalUrbanactive =result.getDistricData().getWarangalUrban().getWarangalUrbanactive();
                Integer unknownactive =result.getDistricData().getUnknown().getUnknownactive();



                Integer adilabadconfirmed =result.getDistricData().getAdilabad().getAdilabadconfirmed();
                Integer bhadradriKothagudemconfirmed =result.getDistricData().getBhadradriKothagudem().getBhadradriKothagudemconfirmed();
                Integer hyderabadconfirmed =result.getDistricData().getHyderabad().getHyderabadconfirmed();
                Integer jagtialconfirmed =result.getDistricData().getJagtial().getJagtialconfirmed();
                Integer  jangaonconfirmed =result.getDistricData().getJangaon().getJangaonconfirmed();
                Integer  jayashankarBhupalapallyconfirmed =result.getDistricData().getJayashankarBhupalapally().getJayashankarBhupalapallyconfirmed();
                Integer  jogulambaGadwalconfirmed =result.getDistricData().getJogulambaGadwal().getJogulambaGadwalconfirmed();
                Integer  kamareddyconfirmed =result.getDistricData().getKamareddy().getKamareddyconfirmed();
                Integer  karimnagarconfirmed =result.getDistricData().getKarimnagar().getKarimnagarconfirmed();
                Integer  khammamconfirmed =result.getDistricData().getKhammam().getKhammamconfirmed();
                Integer komaramBheemconfirmed =result.getDistricData().getKomaramBheem().getKomaramBheemconfirmed();
                Integer mahabubabadconfirmed =result.getDistricData().getMahabubabad().getMahabubabadconfirmed();
                Integer mahabubnagarconfirmed =result.getDistricData().getMahabubnagar().getMahabubnagarconfirmed();
                Integer mancherialconfirmed =result.getDistricData().getMancherial().getMancherialconfirmed();
                Integer medakconfirmed =result.getDistricData().getMedak().getMedakconfirmed();
                Integer medchalMalkajgiriconfirmed =result.getDistricData().getMedchalMalkajgiri().getMedchalMalkajgiriconfirmed();
                Integer muluguconfirmed =result.getDistricData().getMulugu().getMuluguconfirmed();
                Integer nagarkurnoolconfirmed =result.getDistricData().getNagarkurnool().getNagarkurnoolconfirmed();
                Integer nalgondaconfirmed =result.getDistricData().getNalgonda().getNalgondaconfirmed();
                Integer narayanpetconfirmed =result.getDistricData().getNarayanpet().getNarayanpetconfirmed();
                Integer nirmalconfirmed =result.getDistricData().getNirmal().getNirmalconfirmed();
                Integer nizamabadconfirmed=result.getDistricData().getNizamabad().getNizamabadconfirmed();
                Integer peddapalliconfirmed =result.getDistricData().getPeddapalli().getPeddapalliconfirmed();
                Integer rajannaSircillaconfirmed =result.getDistricData().getRajannaSircilla().getRajannaSircillaconfirmed();
                Integer rangaReddyconfirmed =result.getDistricData().getRangaReddy().getRangaReddyconfirmed();
                Integer sangareddyconfirmed =result.getDistricData().getSangareddy().getSangareddyconfirmed();
                Integer siddipetconfirmed =result.getDistricData().getSiddipet().getSiddipetconfirmed();
                Integer suryapetconfirmed =result.getDistricData().getSuryapet().getSuryapetconfirmed();
                Integer vikarabadconfirmed =result.getDistricData().getVikarabad().getVikarabadconfirmed();
                Integer warangalUrbanconfirmed =result.getDistricData().getWarangalUrban().getWarangalUrbanconfirmed();
                Integer unknownconfirmed =result.getDistricData().getUnknown().getUnknownconfirmed();

                Integer adilabaddeceased =result.getDistricData().getAdilabad().getAdilabaddeceased();
                Integer bhadradriKothagudemdeceased =result.getDistricData().getBhadradriKothagudem().getBhadradriKothagudemdeceased();
                Integer hyderabaddeceased =result.getDistricData().getHyderabad().getHyderabaddeceased();
                Integer jagtialdeceased =result.getDistricData().getJagtial().getJagtialdeceased();
                Integer  jangaondeceased =result.getDistricData().getJangaon().getJangaondeceased();
                Integer  jayashankarBhupalapallydeceased =result.getDistricData().getJayashankarBhupalapally().getJayashankarBhupalapallydeceased();
                Integer  jogulambaGadwaldeceased =result.getDistricData().getJogulambaGadwal().getJogulambaGadwaldeceased();
                Integer  kamareddydeceased =result.getDistricData().getKamareddy().getKamareddydeceased();
                Integer  karimnagardeceased =result.getDistricData().getKarimnagar().getKarimnagardeceased();
                Integer  khammamdeceased =result.getDistricData().getKhammam().getKhammamdeceased();
                Integer komaramBheemdeceased =result.getDistricData().getKomaramBheem().getKomaramBheemdeceased();
                Integer mahabubabaddeceased =result.getDistricData().getMahabubabad().getMahabubabaddeceased();
                Integer mahabubnagardeceased =result.getDistricData().getMahabubnagar().getMahabubnagardeceased();
                Integer mancherialdeceased =result.getDistricData().getMancherial().getMancherialdeceased();
                Integer medakdeceased =result.getDistricData().getMedak().getMedakdeceased();
                Integer medchalMalkajgirideceased =result.getDistricData().getMedchalMalkajgiri().getMedchalMalkajgirideceased();
                Integer mulugudeceased =result.getDistricData().getMulugu().getMulugudeceased();
                Integer nagarkurnooldeceased =result.getDistricData().getNagarkurnool().getNagarkurnooldeceased();
                Integer nalgondadeceased =result.getDistricData().getNalgonda().getNalgondadeceased();
                Integer narayanpetdeceased =result.getDistricData().getNarayanpet().getNarayanpetdeceased();
                Integer nirmaldeceased =result.getDistricData().getNirmal().getNirmaldeceased();
                Integer nizamabaddeceased =result.getDistricData().getNizamabad().getNizamabaddeceased();
                Integer peddapallideceased =result.getDistricData().getPeddapalli().getPeddapallideceased();
                Integer rajannaSircilladeceased =result.getDistricData().getRajannaSircilla().getRajannaSircilladeceased();
                Integer rangaReddydeceased =result.getDistricData().getRangaReddy().getRangaReddydeceased();
                Integer sangareddydeceased =result.getDistricData().getSangareddy().getSangareddydeceased();
                Integer siddipetdeceased =result.getDistricData().getSiddipet().getSiddipetdeceased();
                Integer suryapetdeceased =result.getDistricData().getSuryapet().getSuryapetdeceased();
                Integer vikarabaddeceased =result.getDistricData().getVikarabad().getVikarabaddeceased();
                Integer warangalUrbandeceased =result.getDistricData().getWarangalUrban().getWarangalUrbandeceased();
                Integer unknowndeceased =result.getDistricData().getUnknown().getUnknowndeceased();

                Integer adilabadrecovered =result.getDistricData().getAdilabad().getAdilabadrecovered();
                Integer bhadradriKothagudemrecovered =result.getDistricData().getBhadradriKothagudem().getBhadradriKothagudemrecovered();
                Integer hyderabadrecovered =result.getDistricData().getHyderabad().getHyderabadrecovered();
                Integer jagtialrecovered =result.getDistricData().getJagtial().getJagtialrecovered();
                Integer  jangaonrecovered =result.getDistricData().getJangaon().getJangaonrecovered();
                Integer  jayashankarBhupalapallyrecovered =result.getDistricData().getJayashankarBhupalapally().getJayashankarBhupalapallyrecovered();
                Integer  jogulambaGadwalrecovered =result.getDistricData().getJogulambaGadwal().getJogulambaGadwalrecovered();
                Integer  kamareddyrecovered =result.getDistricData().getKamareddy().getKamareddyrecovered();
                Integer  karimnagarrecovered =result.getDistricData().getKarimnagar().getKarimnagarrecovered();
                Integer  khammamrecovered =result.getDistricData().getKhammam().getKhammamrecovered();
                Integer komaramBheemrecovered =result.getDistricData().getKomaramBheem().getKomaramBheemrecovered();
                Integer mahabubabadrecovered =result.getDistricData().getMahabubabad().getMahabubabadrecovered();
                Integer mahabubnagarrecovered =result.getDistricData().getMahabubnagar().getMahabubnagarrecovered();
                Integer mancherialrecovered =result.getDistricData().getMancherial().getMancherialrecovered();
                Integer medakrecovered =result.getDistricData().getMedak().getMedakrecovered();
                Integer medchalMalkajgirirecovered =result.getDistricData().getMedchalMalkajgiri().getMedchalMalkajgirirecovered();
                Integer mulugurecovered =result.getDistricData().getMulugu().getMulugurecovered();
                Integer nagarkurnoolrecovered =result.getDistricData().getNagarkurnool().getNagarkurnoolrecovered();
                Integer nalgondarecovered =result.getDistricData().getNalgonda().getNalgondarecovered();
                Integer narayanpetrecovered =result.getDistricData().getNarayanpet().getNarayanpetrecovered();
                Integer nirmalrecovered =result.getDistricData().getNirmal().getNirmalrecovered();
                Integer nizamabadrecovered =result.getDistricData().getNizamabad().getNizamabadrecovered();
                Integer peddapallirecovered =result.getDistricData().getPeddapalli().getPeddapallirecovered();
                Integer rajannaSircillarecovered =result.getDistricData().getRajannaSircilla().getRajannaSircillarecovered();
                Integer rangaReddyrecovered =result.getDistricData().getRangaReddy().getRangaReddyrecovered();
                Integer sangareddyrecovered =result.getDistricData().getSangareddy().getSangareddyrecovered();
                Integer siddipetrecovered =result.getDistricData().getSiddipet().getSiddipetrecovered();
                Integer suryapetrecovered =result.getDistricData().getSuryapet().getSuryapetrecovered();
                Integer vikarabadrecovered =result.getDistricData().getVikarabad().getVikarabadrecovered();
                Integer warangalUrbanrecovered =result.getDistricData().getWarangalUrban().getWarangalUrbanrecovered();
                Integer unknownrecovered =result.getDistricData().getUnknown().getUnknownrecovered();

                districname.add(R.string.adilabad);
                districname.add(R.string.bhadradriKothagudem);
                districname.add(R.string.hyderabad);
                districname.add(R.string.jagtial);
                districname.add(R.string.jangaon);
                districname.add(R.string.jayashankarBhupalapally);
                districname.add(R.string.jogulambaGadwal);
                districname.add(R.string.kamareddy);
                districname.add(R.string.karimnagar);
                districname.add(R.string.khammam);
                districname.add(R.string.komaramBheem);
                districname.add(R.string.mahabubabad);
                districname.add(R.string.mahabubnagar);
                districname.add(R.string.mancherial);
                districname.add(R.string.medak);
                districname.add(R.string.medchalMalkajgiri);
                districname.add(R.string.mulugu);
                districname.add(R.string.nagarkurnool);
                districname.add(R.string.nalgonda);
                districname.add(R.string.narayanpet);
                districname.add(R.string.nirmal);
                districname.add(R.string.nizamabad);
                districname.add(R.string.peddapalli);
                districname.add(R.string.rajannaSircilla);
                districname.add(R.string.rangaReddy);
                districname.add(R.string.sangareddy);
                districname.add(R.string.siddipet);
                districname.add(R.string.suryapet);
                districname.add(R.string.vikarabad);
                districname.add(R.string.warangalUrban);
                districname.add(R.string.unknown);


                districactive.add(adilabadactive);
                districactive.add(bhadradriKothagudemactive);
                districactive.add(hyderabadactive);
                districactive.add(jagtialactive);
                districactive.add(jangaonactive);
                districactive.add(jayashankarBhupalapallyactive);
                districactive.add(jogulambaGadwalactive);
                districactive.add(kamareddyactive);
                districactive.add(karimnagaractive);
                districactive.add(khammamactive);
                districactive.add(komaramBheemactive);
                districactive.add(mahabubabadactive);
                districactive.add(mahabubnagaractive);
                districactive.add(mancherialactive);
                districactive.add(medakactive);
                districactive.add(medchalMalkajgiriactive);
                districactive.add(muluguactive);
                districactive.add(nagarkurnoolactive);
                districactive.add(nalgondaactive);
                districactive.add(narayanpetactive);
                districactive.add(nirmalactive);
                districactive.add(nizamabadactive);
                districactive.add(peddapalliactive);
                districactive.add(rajannaSircillaactive);
                districactive.add(rangaReddyactive);
                districactive.add(sangareddyactive);
                districactive.add(siddipetactive);
                districactive.add(suryapetactive);
                districactive.add(vikarabadactive);
                districactive.add(warangalUrbanactive);
                districactive.add(unknownactive);



                districconfirmed.add(adilabadconfirmed);
                districconfirmed.add(bhadradriKothagudemconfirmed);
                districconfirmed.add(hyderabadconfirmed);
                districconfirmed.add(jagtialconfirmed);
                districconfirmed.add(jangaonconfirmed);
                districconfirmed.add(jayashankarBhupalapallyconfirmed);
                districconfirmed.add(jogulambaGadwalconfirmed);
                districconfirmed.add(kamareddyconfirmed);
                districconfirmed.add(karimnagarconfirmed);
                districconfirmed.add(khammamconfirmed);
                districconfirmed.add(komaramBheemconfirmed);
                districconfirmed.add(mahabubabadconfirmed);
                districconfirmed.add(mahabubnagarconfirmed);
                districconfirmed.add(mancherialconfirmed);
                districconfirmed.add(medakconfirmed);
                districconfirmed.add(medchalMalkajgiriconfirmed);
                districconfirmed.add(muluguconfirmed);
                districconfirmed.add(nagarkurnoolconfirmed);
                districconfirmed.add(nalgondaconfirmed);
                districconfirmed.add(narayanpetconfirmed);
                districconfirmed.add(nirmalconfirmed);
                districconfirmed.add(nizamabadconfirmed);
                districconfirmed.add(peddapalliconfirmed);
                districconfirmed.add(rajannaSircillaconfirmed);
                districconfirmed.add(rangaReddyconfirmed);
                districconfirmed.add(sangareddyconfirmed);
                districconfirmed.add(siddipetconfirmed);
                districconfirmed.add(suryapetconfirmed);
                districconfirmed.add(vikarabadconfirmed);
                districconfirmed.add(warangalUrbanconfirmed);
                districconfirmed.add(unknownconfirmed);


                districdeceased.add(adilabaddeceased);
                districdeceased.add(bhadradriKothagudemdeceased);
                districdeceased.add(hyderabaddeceased);
                districdeceased.add(jagtialdeceased);
                districdeceased.add(jangaondeceased);
                districdeceased.add(jayashankarBhupalapallydeceased);
                districdeceased.add(jogulambaGadwaldeceased);
                districdeceased.add(kamareddydeceased);
                districdeceased.add(karimnagardeceased);
                districdeceased.add(khammamdeceased);
                districdeceased.add(komaramBheemdeceased);
                districdeceased.add(mahabubabaddeceased);
                districdeceased.add(mahabubnagardeceased);
                districdeceased.add(mancherialdeceased);
                districdeceased.add(medakdeceased);
                districdeceased.add(medchalMalkajgirideceased);
                districdeceased.add(mulugudeceased);
                districdeceased.add(nagarkurnooldeceased);
                districdeceased.add(nalgondadeceased);
                districdeceased.add(narayanpetdeceased);
                districdeceased.add(nirmaldeceased);
                districdeceased.add(nizamabaddeceased);
                districdeceased.add(peddapallideceased);
                districdeceased.add(rajannaSircilladeceased);
                districdeceased.add(rangaReddydeceased);
                districdeceased.add(sangareddydeceased);
                districdeceased.add(siddipetdeceased);
                districdeceased.add(suryapetdeceased);
                districdeceased.add(vikarabaddeceased);
                districdeceased.add(warangalUrbandeceased);
                districdeceased.add(unknowndeceased);

                districrecovered.add(adilabadrecovered);
                districrecovered.add(bhadradriKothagudemrecovered);
                districrecovered.add(hyderabadrecovered);
                districrecovered.add(jagtialrecovered);
                districrecovered.add(jangaonrecovered);
                districrecovered.add(jayashankarBhupalapallyrecovered);
                districrecovered.add(jogulambaGadwalrecovered);
                districrecovered.add(kamareddyrecovered);
                districrecovered.add(karimnagarrecovered);
                districrecovered.add(khammamrecovered);
                districrecovered.add(komaramBheemrecovered);
                districrecovered.add(mahabubabadrecovered);
                districrecovered.add(mahabubnagarrecovered);
                districrecovered.add(mancherialrecovered);
                districrecovered.add(medakrecovered);
                districrecovered.add(medchalMalkajgirirecovered);
                districrecovered.add(mulugurecovered);
                districrecovered.add(nagarkurnoolrecovered);
                districrecovered.add(nalgondarecovered);
                districrecovered.add(narayanpetrecovered);
                districrecovered.add(nirmalrecovered);
                districrecovered.add(nizamabadrecovered);
                districrecovered.add(peddapallirecovered);
                districrecovered.add(rajannaSircillarecovered);
                districrecovered.add(rangaReddyrecovered);
                districrecovered.add(sangareddyrecovered);
                districrecovered.add(siddipetrecovered);
                districrecovered.add(suryapetrecovered);
                districrecovered.add(vikarabadrecovered);
                districrecovered.add(warangalUrbanrecovered);
                districrecovered.add(unknownrecovered);

                DistricRecycler districRecycler = new DistricRecycler(getApplicationContext(),districname,districactive,districconfirmed,districdeceased,districrecovered);

                recyclerView.setAdapter(districRecycler);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                progressBar.setVisibility(View.INVISIBLE);


            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }
}
