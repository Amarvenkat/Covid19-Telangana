package com.amar.covid19telangana.Dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import com.amar.covid19telangana.ApiInterface.ApiCovid19;
import com.amar.covid19telangana.Apiclients.ApiClient;
import com.amar.covid19telangana.R;
import com.amar.covid19telangana.RetrofitClass.Covid19Main;
import com.amar.covid19telangana.RetrofitClass.StateWise;
import com.amar.covid19telangana.RetrofitClass.TelanganaDistrictData;
import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.chart.common.listener.Event;
import com.anychart.chart.common.listener.ListenersInterface;
import com.anychart.charts.Cartesian;
import com.anychart.charts.Pie;
import com.anychart.core.cartesian.series.Column;
import com.anychart.enums.Align;
import com.anychart.enums.Anchor;
import com.anychart.enums.HoverMode;
import com.anychart.enums.LegendLayout;
import com.anychart.enums.Position;
import com.anychart.enums.TooltipPositionMode;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StateMap extends AppCompatActivity {
    List<StateWise> state;
    WebView view;
    Button knowmore,telustate,zone;
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<Number> num = new ArrayList<Number>();

    @SuppressLint("SetJavaScriptEnabled")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_map);

        telustate = (Button) findViewById(R.id.telustate);
        knowmore = (Button) findViewById(R.id.knowmore);
        view = (WebView) findViewById(R.id.webview);
        zone = (Button) findViewById(R.id.btnzone);

       // final AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        final AnyChartView anyChartbar = findViewById(R.id.any_chart_bar);
        //final AnyChartView anyChartbartotal = findViewById(R.id.any_chart_bartotal);
        view.getSettings().setJavaScriptEnabled(true);
        view.addJavascriptInterface(new JavaScriptInterface(this), "AndroidNativeCode");

        final Cartesian cartesian = AnyChart.column();

//        final Pie pie = AnyChart.pie();
//        pie.setOnClickListener(new ListenersInterface.OnClickListener(new String[]{"x", "value"}) {
//            @Override
//            public void onClick(Event event) {
//                // Toast.makeText(StateMap.this, event.getData().get("x") + ":" + event.getData().get("value"), Toast.LENGTH_SHORT).show();
//            }
//        });

        view.loadUrl("file:///android_asset/map.html");


        final List<DataEntry> data = new ArrayList<>();
        ApiCovid19 apiService =
                ApiClient.getClient().create(ApiCovid19.class);


        Call<Covid19Main> call = apiService.getReport();
        call.enqueue(new Callback<Covid19Main>() {
            @Override
            public void onResponse(Response<Covid19Main> response) {

                state = response.body().getState();

                for (int i = 0; i < state.size(); i++){
                    String checkcata = state.get(i).getState();
                Number checkstate = state.get(i).getActive();

                name.add(checkcata);
                num.add(checkstate);


           }
                //dis(anyChartView,pie,data);
                disbar(anyChartbar, cartesian, data);
               // disbar(anyChartbartotal,cartesian,data);
            }




            @Override
            public void onFailure(Throwable t) {

            }
        });


//                    String checkcata = state.get(0).getState();
//                    int checkstate = state.get(0).getActive();


               //     data.add(new ValueDataEntry("tn", 5));



        knowmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StateMap.this, LiveReport.class);
                startActivity(intent);


            }
        });

        telustate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StateMap.this, TelanganaDistrictData.class);
                startActivity(intent);

            }
        });
        zone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*Bundle bundle = new Bundle();
                bundle.putString(THIRD,"third");
                */Intent intent = new Intent(StateMap.this, ZoneState.class);
                /*intent.putExtras(bundle);
                */startActivity(intent);
            }
        });
    }


    public class JavaScriptInterface {
        Context mContext;


        JavaScriptInterface(Context c) {
            mContext = c;
        }


        // method to send JsonArray to HTML
        @JavascriptInterface
        public void getValueJson() throws JSONException {
            final JSONArray jArray = new JSONArray();


            JSONObject jObject = new JSONObject();

            for (int position = 1; position < state.size(); position++) {

                jObject = new JSONObject();
                jObject.put("State", state.get(position).getState());
                jObject.put("Total", state.get(position).getConfirmed());
                jObject.put("Active", state.get(position).getActive());
                jObject.put("Dead", state.get(position).getDeaths());
                jObject.put("Recovered", state.get(position).getRecovered());

                jArray.put(jObject);

            }


            System.out.println(jArray.toString());
            // send value from java class to html javascript function
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    view.loadUrl("javascript:setJson(" + jArray + ")");
                }
            });

        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        view = (WebView) findViewById(R.id.webview);

        view.getSettings().setJavaScriptEnabled(true);
        // this function is used to access javascript from html page
        view.addJavascriptInterface(new JavaScriptInterface(this), "AndroidNativeCode");
        // load file from assets folder

        view.loadUrl("file:///android_asset/map.html");


        ApiCovid19 apiService =
                ApiClient.getClient().create(ApiCovid19.class);

        Call<Covid19Main> call = apiService.getReport();
        call.enqueue(new Callback<Covid19Main>() {
            @Override
            public void onResponse(Response<Covid19Main> response) {

                state = response.body().getState();
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }

    private void dis(AnyChartView anyChartView, Pie pie, List<DataEntry> data) {
        for (int i = 1;i<name.size();i++) {
            data.add(new ValueDataEntry(name.get(i), num.get(i)));
        }
        pie.data(data);

        pie.title("Active Cases");

        pie.labels().position("outside");

        pie.legend().title().enabled(true);
        pie.legend().title()
                .text("Pie char to show active cases in india")
                .padding(0d, 0d, 10d, 0d);

        pie.legend()
                .position("center-bottom")
                .itemsLayout(LegendLayout.HORIZONTAL)
                .align(Align.CENTER);

        anyChartView.setChart(pie);
    }

    private  void disbar(AnyChartView anyChartView, Cartesian cartesian, List<DataEntry> data){

        for (int i = 1;i<name.size();i++) {
            data.add(new ValueDataEntry(name.get(i), num.get(i)));
        }
        Column column = cartesian.column(data);

        column.tooltip()
                .titleFormat("{%X}")
                .position(Position.CENTER_BOTTOM)
                .anchor(Anchor.CENTER_BOTTOM)
                .offsetX(0d)
                .offsetY(5d)
                .format("{%Value}{groupsSeparator: }");

        cartesian.animation(true);
        cartesian.title("Active cases in India");

        cartesian.yScale().minimum(0d);

        cartesian.yAxis(0).labels().format("{%Value}{groupsSeparator: }");

        cartesian.tooltip().positionMode(TooltipPositionMode.POINT);
        cartesian.interactivity().hoverMode(HoverMode.BY_X);

        cartesian.xAxis(0).title("States");
        cartesian.yAxis(0).title("Active Cases");

        anyChartView.setChart(cartesian);
    }
}
