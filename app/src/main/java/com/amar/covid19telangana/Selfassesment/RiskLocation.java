package com.amar.covid19telangana.Selfassesment;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import com.amar.covid19telangana.MigrantLabour.LabourPojo;
import com.amar.covid19telangana.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class RiskLocation extends FragmentActivity implements OnMapReadyCallback {



    ArrayList<String> listzone = new ArrayList<String>();
    ArrayList<String> listzonecolour = new ArrayList<String>();
    private GoogleMap mMap;
    public static final String FIRST = "first";
    public static final String SECOND = "second";
    public static final String THIRD = "third";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_risk_location);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }


    private void loadData() {
        final ArrayList<LabourPojo> labourlist = new ArrayList<>();
        final ArrayList<String> lat = new ArrayList<>();
        final ArrayList<String> lon = new ArrayList<>();
        final ArrayList<String> labourname = new ArrayList<>();
        CollectionReference db = FirebaseFirestore.getInstance().collection("labour");
        db.addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots,
                                @Nullable FirebaseFirestoreException e) {
                if (queryDocumentSnapshots != null) {
                    labourlist.clear();
                    for (DocumentSnapshot snapshot : queryDocumentSnapshots.getDocuments()) {
                        LabourPojo dbvalueData = snapshot.toObject(LabourPojo.class);

                        labourlist.add(dbvalueData);


                    }

                    for (int i = 0; i < labourlist.size(); i++) {
                        LabourPojo ld = labourlist.get(i);


                        lat.add(ld.getLatitude());
                        lon.add(ld.getLongitude());
                        labourname.add(ld.getName());

                    }
                    for (int i = 0; i < labourlist.size(); i++) {
                        Log.d("Tag", "lat" + lat.get(i));
                        Log.d("Tag", "lat" + lon.get(i));

                        setMarker(lat.get(i), lon.get(i), labourname.get(i));

                    }
                }


            }
        });


    }

    private void loadDataformap() {
        final ArrayList<RiskPerson> dbvalue = new ArrayList<>();
        final ArrayList<String> lat = new ArrayList<>();
        final ArrayList<String> lon = new ArrayList<>();
        final ArrayList<String> name = new ArrayList<>();
        CollectionReference db = FirebaseFirestore.getInstance().collection("user");
        db.addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots,
                                @Nullable FirebaseFirestoreException e) {
                if (queryDocumentSnapshots != null) {
                    dbvalue.clear();
                    for (DocumentSnapshot snapshot : queryDocumentSnapshots.getDocuments()) {
                        RiskPerson dbvalueData = snapshot.toObject(RiskPerson.class);

                        dbvalue.add(dbvalueData);

                        //         latlon(dbvalueData.getLatitude(),dbvalueData.getLongitude(),dbvalue.size());

                    }

                    for (int i = 0; i < dbvalue.size(); i++) {
                        RiskPerson ld = dbvalue.get(i);


                        lat.add(ld.getLatitude());
                        lon.add(ld.getLongitude());
                        name.add(ld.getRiskname());

                        /*Log.d("Tag","lat"+ld.getLatitude());
                        Log.d("Tag","lat"+ld.getLongitude());*/
                    }
                    for (int i = 0; i < dbvalue.size(); i++) {
                        Log.d("Tag", "lat" + lat.get(i));
                        Log.d("Tag", "lat" + lon.get(i));
                        setMarker(lat.get(i), lon.get(i), name.get(i));

                    }

                }


            }
        });


    }


    /*

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        /*
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
*/

        Bundle bundle = getIntent().getExtras();
        if (bundle.containsKey(FIRST)) {

            loadDataformap();

        }
        if (bundle.containsKey(SECOND)) {

            loadData();

        }



    }

    private void setMarker(String latitude, String longitude, String name) {

        double lat = Double.parseDouble(latitude);
        double lon = Double.parseDouble(longitude);
        LatLng myLocation = new LatLng(lat, lon);
        mMap.addMarker(new MarkerOptions().position(myLocation).title(name));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(myLocation));
        Circle circle = DrawCircle(new LatLng(lat, lon));
    }

    private Circle DrawCircle(LatLng latLng) {

        CircleOptions circleOptions = new CircleOptions()
                .center(latLng)
                .radius(100)
                .strokeWidth(0)
                .strokeColor(Color.parseColor("#22f93822"))
                .fillColor(Color.parseColor("#22f93822"));


        //.fillColor(Color.rgb(250,92,120))


        return mMap.addCircle(circleOptions);

    }

 }
