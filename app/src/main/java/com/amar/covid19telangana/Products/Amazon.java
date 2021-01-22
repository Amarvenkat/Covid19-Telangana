package com.amar.covid19telangana.Products;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.R;

import java.util.ArrayList;

public class Amazon extends AppCompatActivity {

    ArrayList<String> amazoneimg =new ArrayList<String>();
    ArrayList<String> amazonename =new ArrayList<String>();
    ArrayList<String> amazoneparice = new ArrayList<String>();
    ArrayList<String> amazonelink = new ArrayList<String>();
    RecyclerView amazonrecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazon);

        amazonrecycler = (RecyclerView) findViewById(R.id.amazonrecycler);
        amazoneimg.add("https://m.media-amazon.com/images/I/8184HsOUVGL._AC_UY327_QL65_.jpg");
        amazoneimg.add("https://m.media-amazon.com/images/I/51-ub5sVIEL._AC_UY327_QL65_.jpg");
        amazoneimg.add("https://m.media-amazon.com/images/I/61LjiKwHn5L._AC_UY327_QL65_.jpg");
        amazoneimg.add("https://m.media-amazon.com/images/I/61VGb3rox+L._AC_UY327_QL65_.jpg");
        amazoneimg.add("https://m.media-amazon.com/images/I/61kNqFtJyCL._AC_UY327_QL65_.jpg");
        amazoneimg.add("https://m.media-amazon.com/images/I/61pI7dNSG7L._AC_UY327_QL65_.jpg");
        amazoneimg.add("https://m.media-amazon.com/images/I/61nE5FAA8rL._AC_UY327_QL65_.jpg");
        amazoneimg.add("https://m.media-amazon.com/images/I/51t60GI5arL._AC_UY327_QL65_.jpg");
        amazoneimg.add("https://m.media-amazon.com/images/I/61g6SdZCjlL._AC_UY327_QL65_.jpg");
        amazoneimg.add("https://m.media-amazon.com/images/I/619y2QJInNL._AC_UY327_QL65_.jpg");
        amazoneimg.add("https://m.media-amazon.com/images/I/61RK9UToUuL._AC_UY327_QL65_.jpg");
        amazoneimg.add("https://m.media-amazon.com/images/I/41Tc1kL-iPL._AC_UY327_QL65_.jpg");

        amazonename.add("BodyGuard Reusable Anti Pollution Face Mask with Activated Carbon, N95 + PM2.5 for kids - Small (Black)");
        amazonename.add("URBAN HAAT Jaipuri Disposable Latex Medical Examination Gloves, Medium -Set of 100 Pieces");
        amazonename.add("Mediweave Face Shield Safety Mask Polypropylene(PP) White Color (Pack of 5)");
        amazonename.add("ORILEY Instant Hand Sanitizer 70% Isopropyl Alcohol Spray-based Liquid Rinse-free Germ Protection Palm Handrub (1000ml)");
        amazonename.add("Xtore® N95 Ultra Comfortable Anti Pollution Mask | Breathing Valve | Premium Quality - (Pack of 1 mask, 2 filters)");
        amazonename.add("BodyGuard Multipurpose Alcohol Based Disinfectant Spray - 500 ml");
        amazonename.add("Buildskill Digital Infrared Non Contact Forehead Thermometer Gun for Fever, Body Temperature. Best for Baby, Kids, Adults. CE, ROHS, Certified");
        amazonename.add("VOUCH Blue Medical PPE KIT with Disposable Hooded Full Body Coverall, Latex Gloves, Shoe Cover, Face Mask, Face Shield");
        amazonename.add("Oriley Waterless Advanced Hand Sanitizer 70% Isopropyl Alcohol Gel Based Instant Germ Protection Sanitizing Gel Rinse-free Palm Cleaner Handrub (50ml)");
        amazonename.add("I95 Pack of 3 Black 4-Layer Airmesh Washable Reusable Anti-Pollution Outdoor Masks");
        amazonename.add("Control D Face Shield (Pack Of 5)");
        amazonename.add("LANDWIND LW FT118 Non-Contact Digital Infrared Thermometer - Accurate 1 Second Fast Reading And Recording Body Thermometer For Baby, Kid, Adult - NMPA FCC CE Approved");

        amazoneparice.add("₹199");
        amazoneparice.add("₹659");
        amazoneparice.add("₹399");
        amazoneparice.add("₹445");
        amazoneparice.add("₹389");
        amazoneparice.add("₹449");
        amazoneparice.add("₹3,499");
        amazoneparice.add("₹399");
        amazoneparice.add("₹25");
        amazoneparice.add("₹269");
        amazoneparice.add("₹599");
        amazoneparice.add("₹2,399");

        amazonelink.add("https://www.amazon.in/Bodyguard-Anti-Pollution-Face-Mask/dp/B075XN3KML/ref=sr_1_3?dchild=1&pf_rd_p=f314da58-1028-4733-8472-dc4535ca4c95&pf_rd_r=NAM2N7CJZJX71ZHGVTX9&qid=1592321481&sr=8-3&srs=21433333031");
        amazonelink.add("https://www.amazon.in/Jaipuri-Premium-Disposable-Medical-Examination/dp/B075R4XM3P/ref=sr_1_4?dchild=1&pf_rd_p=f314da58-1028-4733-8472-dc4535ca4c95&pf_rd_r=NAM2N7CJZJX71ZHGVTX9&qid=1592321481&sr=8-4&srs=21433333031");
        amazonelink.add("https://www.amazon.in/Mediweave-Shield-Safety-Polypropylene-White/dp/B087N9LQG9/ref=sr_1_13?dchild=1&pf_rd_p=f314da58-1028-4733-8472-dc4535ca4c95&pf_rd_r=NAM2N7CJZJX71ZHGVTX9&qid=1592321481&sr=8-13&srs=21433333031");
        amazonelink.add("https://www.amazon.in/ORILEY-Sanitizer-Spray-based-Rinse-free-Protection/dp/B086RKDKR8/ref=sr_1_8?dchild=1&pf_rd_p=f314da58-1028-4733-8472-dc4535ca4c95&pf_rd_r=NAM2N7CJZJX71ZHGVTX9&qid=1592321481&sr=8-8&srs=21433333031");
        amazonelink.add("https://www.amazon.in/Xtore-Comfortable-Pollution-Breathing-Perticulate/dp/B07LDVP7DV/ref=sr_1_17?dchild=1&pf_rd_p=f314da58-1028-4733-8472-dc4535ca4c95&pf_rd_r=NAM2N7CJZJX71ZHGVTX9&qid=1592321563&sr=8-17&srs=21433333031");
        amazonelink.add("https://www.amazon.in/BodyGuard-Multipurpose-Alcohol-Based-Disinfectant/dp/B087C872PX/ref=sr_1_19?dchild=1&pf_rd_p=f314da58-1028-4733-8472-dc4535ca4c95&pf_rd_r=NAM2N7CJZJX71ZHGVTX9&qid=1592321563&sr=8-19&srs=21433333031");
        amazonelink.add("https://www.amazon.in/Buildskill-Infrared-Thermometer-Temperature-Certified/dp/B0876B6LK6/ref=sr_1_22?dchild=1&pf_rd_p=f314da58-1028-4733-8472-dc4535ca4c95&pf_rd_r=NAM2N7CJZJX71ZHGVTX9&qid=1592321563&sr=8-22&srs=21433333031");
        amazonelink.add("https://www.amazon.in/VOUCH-Medical-Disposable-Hooded-Coverall/dp/B088667XGF/ref=sr_1_27?dchild=1&pf_rd_p=f314da58-1028-4733-8472-dc4535ca4c95&pf_rd_r=NAM2N7CJZJX71ZHGVTX9&qid=1592321563&sr=8-27&srs=21433333031");
        amazonelink.add("https://www.amazon.in/Waterless-Sanitizer-Protection-Sanitizing-Rinse-free/dp/B085VGJXYF/ref=sr_1_34?dchild=1&pf_rd_p=f314da58-1028-4733-8472-dc4535ca4c95&pf_rd_r=NAM2N7CJZJX71ZHGVTX9&qid=1592321669&sr=8-34&srs=21433333031");
        amazonelink.add("https://www.amazon.in/I95-4-Layer-Washable-Reusable-Anti-Pollution/dp/B08774751G/ref=sr_1_35?dchild=1&pf_rd_p=f314da58-1028-4733-8472-dc4535ca4c95&pf_rd_r=NAM2N7CJZJX71ZHGVTX9&qid=1592321669&sr=8-35&srs=21433333031");
        amazonelink.add("https://www.amazon.in/Control-Face-Shield-Pack/dp/B087ZD83WG/ref=sr_1_37?dchild=1&pf_rd_p=f314da58-1028-4733-8472-dc4535ca4c95&pf_rd_r=NAM2N7CJZJX71ZHGVTX9&qid=1592321669&sr=8-37&srs=21433333031");
        amazonelink.add("https://www.amazon.in/LANDWIND-LW-FT118-Non-Contact-Thermometer/dp/B08676ZNNQ/ref=sr_1_40?dchild=1&pf_rd_p=f314da58-1028-4733-8472-dc4535ca4c95&pf_rd_r=NAM2N7CJZJX71ZHGVTX9&qid=1592321669&sr=8-40&srs=21433333031");

        WebproductAdapter webproductAdapter = new WebproductAdapter(getApplicationContext(),amazoneimg,amazonename,amazonelink,amazoneparice);
        amazonrecycler.setLayoutManager(new LinearLayoutManager(this));
        amazonrecycler.setAdapter(webproductAdapter);


    }
}