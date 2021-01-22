package com.amar.covid19telangana.Products;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.amar.covid19telangana.R;
import com.amar.covid19telangana.Services.LabourUploadServices;
import com.amar.covid19telangana.Services.ProductUploadService;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class ProductSellCard extends AppCompatActivity {

    private static final String SELLEMAIL ="sellemail" ;
    private static final String SELLTRADELISENCEDETAILS ="selltradelinsencedetails" ;
    private static final String SELLPRODUCTNAME ="sellproductname" ;
    private static final String SELLBRANDNAME = "sellbrandname";
    private static final String SELLSTOCKAVAILABILITY ="sellstockavailability" ;
    private static final String SELLPRICE = "sellprice";
    private static final String SELLPRODUCTDESCRIPTION = "sellproductdescription";
    private static final String MINTYPE ="mintype" ;
    EditText sellcompanyname,selladdress,sellcontactnumber,sellemail,selltradelisencedetails,sellproductname,sellbrandname,sellstockavailability,sellprice,sellproductdescription;
    ImageView sellimg;
    Button btnupload;
    Uri imageuri;
    public  static final String SELLCOMPANYNAME  = "sellcompanyname";
    public  static final String  SELLADDRESS = "first";
    public  static final String  SELLCONTACTNUMBER = "first";
    public  static final String  IMGURL = "imgurl";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_sell_card);

        sellcompanyname = (EditText) findViewById(R.id.sellcompanyname);
        selladdress     = (EditText) findViewById(R.id.selladdress);
        sellcontactnumber = (EditText) findViewById(R.id.sellcontactnumber);
        sellemail = (EditText) findViewById(R.id.sellemail);
        selltradelisencedetails = (EditText) findViewById(R.id.selltradelisencedetails);
        sellproductname = (EditText) findViewById(R.id.sellproductname);
        sellbrandname = (EditText) findViewById(R.id.sellbrandname);
        sellstockavailability = (EditText) findViewById(R.id.sellstockavailability);
        sellprice = (EditText) findViewById(R.id.sellprice);
        sellproductdescription = (EditText) findViewById(R.id.sellproductdescription);
        sellimg = (ImageView) findViewById(R.id.productsellimg);
        btnupload = (Button) findViewById(R.id.upload);

        sellimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGalleryForImagePicking();
            }
        });

        btnupload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String stringcompanyname = sellcompanyname.getText().toString();
                String stringaddress     = selladdress.getText().toString();
                String stringsellcontactnumber = sellcontactnumber.getText().toString();
                String stringsellemail    = sellemail.getText().toString();
                String stringtradelisencedetails = selltradelisencedetails.getText().toString();
                String stringproductname = sellproductname.getText().toString();
                String stringbrandname = sellbrandname.getText().toString();
                String stringstockavailability = sellstockavailability.getText().toString();
                String stringprice = sellprice.getText().toString();
                String stringproductdescription = sellproductdescription.getText().toString();





                if (!stringcompanyname.isEmpty() && !stringaddress.isEmpty() && !stringsellcontactnumber.isEmpty() && !stringsellemail.isEmpty() && !stringproductname.isEmpty()) {
                    String mimeType = MimeTypeMap.getSingleton()
                            .getExtensionFromMimeType(
                                    getContentResolver().getType(imageuri));
                    Intent intent =  new Intent(ProductSellCard.this, ProductUploadService.class);
                    Bundle bundle1 = new Bundle();
                    bundle1.putString(SELLCOMPANYNAME,stringcompanyname);
                    bundle1.putString(SELLADDRESS,stringaddress);
                    bundle1.putString(SELLCONTACTNUMBER,stringsellcontactnumber);
                    bundle1.putString(SELLEMAIL,stringsellemail);
                    bundle1.putString(SELLTRADELISENCEDETAILS,stringtradelisencedetails);
                    bundle1.putString(SELLPRODUCTNAME,stringproductname);
                    bundle1.putString(SELLBRANDNAME,stringbrandname);
                    bundle1.putString(SELLSTOCKAVAILABILITY,stringstockavailability);
                    bundle1.putString(SELLPRICE,stringprice);
                    bundle1.putString(SELLPRODUCTDESCRIPTION,stringproductdescription);
                    bundle1.putString(MINTYPE,mimeType);
                    bundle1.putString(IMGURL, String.valueOf(imageuri));
                    intent.putExtras(bundle1);
                    startService(intent);

                //    uploadFile(stringcompanyname,stringaddress,stringsellcontactnumber,stringsellemail,stringtradelisencedetails,stringproductname,stringbrandname,stringstockavailability,stringprice,stringproductdescription,mimeType);
                }
            }
        });




    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == 0 && data != null) {
            imageuri = data.getData();
            sellimg.setImageURI(imageuri);
        }
    }
    private void startGalleryForImagePicking() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        startActivityForResult(intent, 0);
    }
}
