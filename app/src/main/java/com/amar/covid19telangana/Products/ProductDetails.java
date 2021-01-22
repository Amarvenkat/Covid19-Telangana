package com.amar.covid19telangana.Products;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.amar.covid19telangana.R;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProductDetails extends AppCompatActivity {

    TextView buycompanyname,buyaddress,buycontactnumber,buyemail,buytradelisencedetails,buyproductname,buybrandname,buystockavailability,buyprice,buyproductdescription;
    ImageView productbuyimg;
    String stringcompanyname;
    String stringaddress;
    String stringsellcontactnumber;
    String stringsellemail;
    String stringtradelisencedetails;
    String stringproductname;
    String stringbrandname;
    String stringstockavailability;
    String stringprice;
    String stringproductdescription;
    String minetype;
    String imageuri;

    public  static final String SELLCOMPANYNAME  = "sellcompanyname";
    public  static final String  SELLADDRESS = "first";
    public  static final String  SELLCONTACTNUMBER = "first";
    public  static final String  IMGURL = "imgurl";
    private static final String SELLEMAIL ="sellemail" ;
    private static final String SELLTRADELISENCEDETAILS ="selltradelinsencedetails" ;
    private static final String SELLPRODUCTNAME ="sellproductname" ;
    private static final String SELLBRANDNAME = "sellbrandname";
    private static final String SELLSTOCKAVAILABILITY ="sellstockavailability" ;
    private static final String SELLPRICE = "sellprice";
    private static final String SELLPRODUCTDESCRIPTION = "sellproductdescription";
    private static final String MINTYPE ="mintype" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        buycompanyname = (TextView) findViewById(R.id.buycompanyname);
        buyaddress     = (TextView) findViewById(R.id.buyaddress);
        buycontactnumber = (TextView) findViewById(R.id.buycontactnumber);
        buyemail = (TextView) findViewById(R.id.buyemail);
        buytradelisencedetails = (TextView) findViewById(R.id.buytradelisencedetails);
        buyproductname = (TextView) findViewById(R.id.buyproductname);
        buybrandname = (TextView) findViewById(R.id.buybrandname);
        buystockavailability = (TextView) findViewById(R.id.buystockavailability);
        buyprice = (TextView) findViewById(R.id.buyprice);
        buyproductdescription = (TextView) findViewById(R.id.buyproductdescription);
        productbuyimg = (ImageView) findViewById(R.id.productbuyimg);
            final ArrayList<ProductsPojo> images = new ArrayList<>();
            CollectionReference db = FirebaseFirestore.getInstance().collection("product");
            db.addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots,
                                    @Nullable FirebaseFirestoreException e) {
                    if(queryDocumentSnapshots != null) {
                        images.clear();
                        for(DocumentSnapshot snapshot : queryDocumentSnapshots.getDocuments()) {
                            ProductsPojo imageData = snapshot.toObject(ProductsPojo.class);
                            images.add(imageData);
                        }
                    }
                }
            });

        Bundle bundle =getIntent().getExtras();

        if (bundle.containsKey(SELLCOMPANYNAME)){
            stringcompanyname = bundle.getString(SELLCOMPANYNAME);
        }
        if (bundle.containsKey(SELLADDRESS)){
            stringaddress     = bundle.getString(SELLADDRESS);

        }
        if (bundle.containsKey(SELLCONTACTNUMBER))
        {
            stringsellcontactnumber = bundle.getString(SELLCONTACTNUMBER);
        }
        if (bundle.containsKey(SELLEMAIL)){
            stringsellemail    = bundle.getString(SELLEMAIL);

        }if (bundle.containsKey(SELLTRADELISENCEDETAILS)){
            stringtradelisencedetails = bundle.getString(SELLTRADELISENCEDETAILS);

        }
        if (bundle.containsKey(SELLPRODUCTNAME)){
            stringproductname =  bundle.getString(SELLPRODUCTNAME);

        }
        if (bundle.containsKey(SELLBRANDNAME)){
            stringbrandname = bundle.getString(SELLBRANDNAME);

        }
        if (bundle.containsKey(SELLSTOCKAVAILABILITY)){
            stringstockavailability = bundle.getString(SELLSTOCKAVAILABILITY);

        }
        if (bundle.containsKey(SELLPRICE)){
            stringprice = bundle.getString(SELLPRICE);

        }
        if(bundle.containsKey(SELLPRODUCTDESCRIPTION)){
            stringproductdescription = bundle.getString(SELLPRODUCTDESCRIPTION);

        }
        if (bundle.containsKey(IMGURL)){
            imageuri = bundle.getString(IMGURL);
        }

         buycompanyname.setText(stringcompanyname);
        buyaddress.setText(stringaddress);
        buycontactnumber.setText(stringsellcontactnumber);
        buyemail.setText(stringsellemail);
        buytradelisencedetails.setText(stringtradelisencedetails);
        buyproductname.setText(stringproductname);
        buybrandname.setText(stringbrandname);
        buystockavailability.setText(stringstockavailability);
        buyprice.setText(stringprice);
        buyproductdescription.setText(stringproductdescription);
        Picasso.with(this).load(imageuri).fit().into(productbuyimg);


    }

}
