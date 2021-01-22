package com.amar.covid19telangana.Products;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amar.covid19telangana.R;

import java.util.ArrayList;

public class Flipcart extends AppCompatActivity {
    ArrayList<String> flipcartimg =new ArrayList<String>();
    ArrayList<String> flipcartname =new ArrayList<String>();
    ArrayList<String> flipcartprice = new ArrayList<String>();
    ArrayList<String> flipcartlink = new ArrayList<String>();
    RecyclerView flipcartrecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipcart);

        flipcartrecycler = (RecyclerView) findViewById(R.id.flipcartrecycler);

        flipcartimg.add("https://rukminim1.flixcart.com/image/416/416/kar44280/mask-respirator/a/7/w/pharmaceutical-grade-bildos-original-imafs9g9zhknqmm3.jpeg?q=70");
        flipcartlink.add("https://www.flipkart.com/bildos-pharmaceutical-grade-surgical-mask/p/itm8372534c0c492?pid=MRPFS99SCF4CSA7W&lid=LSTMRPFS99SCF4CSA7WLGSX8M&marketplace=FLIPKART&srno=b_1_1&otracker=dynamic_omu_infinite_Health%2BCare%2BEssentials_6_1.dealCard.OMU_INFINITE_Health%2BCare%2BEssentials_02LL1KZADGXG&fm=neo%2Fmerchandising&iid=en_VISUpSLvkIbpZpXvICqmc9RoZQBoaDU4V4KNjXu7gH0v7oiRpvU6yaU49tnWqv%2F2GXBwtoBwZdu7oCqhR40oww%3D%3D&ppt=browse&ppn=browse&ssid=a4iamdewfk0000001592323490320");
        flipcartname.add("Bildos Pharmaceutical grade Surgical Mask  (free size, Pack of 100, 3 Ply)");
        flipcartprice.add("₹300");

        flipcartimg.add("https://rukminim1.flixcart.com/image/416/416/k9re3rk0/mask-respirator/z/6/c/sg-30-nhr-original-imafrhmcq4rtppt6.jpeg?q=70");
        flipcartlink.add("https://www.flipkart.com/nhr-surgical-face-mask-anti-pollution-3-ply-mask-iso-9001-2015-certification-pack-30-sg-30/p/itm8ad1be1d1bf74?pid=MRPFRYGDUYA4MZ6C&lid=LSTMRPFRYGDUYA4MZ6CXT2MXU&marketplace=FLIPKART&srno=b_1_5&otracker=dynamic_omu_infinite_Health%2BCare%2BEssentials_6_1.dealCard.OMU_INFINITE_Health%2BCare%2BEssentials_02LL1KZADGXG&fm=neo%2Fmerchandising&iid=e17b74d4-5b72-401c-8ad3-1010c2468d4f.MRPFRYGDUYA4MZ6C.SEARCH&ppt=browse&ppn=browse");
        flipcartprice.add("₹229");
        flipcartname.add("NHR Surgical Face Mask, Anti Pollution, 3 Ply Face Mask with ISO 9001:2015 Certification (Pack of 30) SG-30 Surgical Mask  (Blue, free size, Pack of 30, 3 Ply)");

        flipcartimg.add("https://rukminim1.flixcart.com/image/416/416/kaijgy80/digital-thermometer/r/m/f/candes-non-contact-infrared-thermometer-with-ir-sensor-and-color-original-imafs26chvb9dh9w.jpeg?q=70");
        flipcartname.add("Candes FD803IR Non Contact Infrared Thermometer with IR Sensor and Color Changing Display for human body and objects, US FDA approved Thermometer  (White, Blue)");
        flipcartprice.add("₹2,999");
        flipcartlink.add("https://www.flipkart.com/candes-fd803ir-non-contact-infrared-thermometer-ir-sensor-color-changing-display-human-body-objects-fda-approved/p/itm8112c16c7e05c?pid=DTHFSFM2DUVKMRMF&lid=LSTDTHFSFM2DUVKMRMFTLBQRF&marketplace=FLIPKART&srno=b_1_2&otracker=dynamic_omu_infinite_Health%2BCare%2BEssentials_6_1.dealCard.OMU_INFINITE_Health%2BCare%2BEssentials_I5V1T8AZ9Q5Y&fm=neo%2Fmerchandising&iid=en_s0rHXcT9518lpxGERYu9N5WwCgFi9kWZ9x4k3r3IHpF%2BWZv5gGfanbbAIha7a%2BAx5wh3e5AJWVhEBGW6IbSitw%3D%3D&ppt=browse&ppn=browse&ssid=632dr34rlc0000001592323812413");

        flipcartimg.add("https://rukminim1.flixcart.com/image/416/416/kb6tyfk0/digital-thermometer/h/m/f/intex-thermo-safe-infrared-digital-thermometer-original-imafshpaqjqcqghy.jpeg?q=70");
        flipcartlink.add("https://www.flipkart.com/intex-infrared-digital-thermometer-thermo-safe/p/itm68dc16da057a1?pid=DTHFS8YJ4EYYDHMF&lid=LSTDTHFS8YJ4EYYDHMFLMKWLY&marketplace=FLIPKART&srno=b_1_5&otracker=dynamic_omu_infinite_Health%2BCare%2BEssentials_6_1.dealCard.OMU_INFINITE_Health%2BCare%2BEssentials_I5V1T8AZ9Q5Y&fm=neo%2Fmerchandising&iid=ee356424-744b-468e-a72c-73d44cea5ad7.DTHFS8YJ4EYYDHMF.SEARCH&ppt=browse&ppn=browse&ssid=632dr34rlc0000001592323812413");
        flipcartprice.add("₹2,239");
        flipcartname.add("Intex Infrared Digital Thermometer Thermo Safe Thermometer  (White)#JustHere");

        flipcartimg.add("https://rukminim1.flixcart.com/image/416/416/k9k8wi80/digital-thermometer/s/w/e/dr-trust-infrared-thermometer-with-color-coded-fever-guidance-original-imafrbqytq49fyrd.jpeg?q=70");
        flipcartname.add("Dr. Trust (USA) Non Contact Forehead Temporal Artery Infrared Thermometer With Color Coded Fever Guidance Thermometer  (Silver)");
        flipcartprice.add("₹7,500");
        flipcartlink.add("https://www.flipkart.com/dr-trust-usa-non-contact-forehead-temporal-artery-infrared-thermometer-color-coded-fever-guidance/p/itmf33g2hytbnhtx?pid=DTHFR78M5QP79SWE&lid=LSTDTHFR78M5QP79SWEBKNBKD&marketplace=FLIPKART&srno=b_1_12&otracker=dynamic_omu_infinite_Health%2BCare%2BEssentials_6_1.dealCard.OMU_INFINITE_Health%2BCare%2BEssentials_I5V1T8AZ9Q5Y&fm=neo%2Fmerchandising&iid=ee356424-744b-468e-a72c-73d44cea5ad7.DTHFR78M5QP79SWE.SEARCH&ppt=browse&ppn=browse&ssid=632dr34rlc0000001592323812413");

        flipcartlink.add("https://www.flipkart.com/axtry-100-pcs-large-size-disposable-medical-latex-examination-gloves/p/itm00b935edc3992?pid=MGVFZZ9FPAMKHFG6&lid=LSTMGVFZZ9FPAMKHFG6KZEAPY&marketplace=FLIPKART&srno=b_1_1&otracker=dynamic_omu_infinite_Health%2BCare%2BEssentials_10_1.dealCard.OMU_INFINITE_Health%2BCare%2BEssentials_LI8YDBJYOU7O&fm=neo%2Fmerchandising&iid=en_DKIkXZj4%2BbYSnrVKKOKuLHgN9gFDqMkOpVV3JZmTz2ectK0Y40FEyrgh%2F6KO%2BwJRY1%2B6Ev67P2PyTXpwB1NzZw%3D%3D&ppt=browse&ppn=browse&ssid=3a3o42our40000001592324068546");
        flipcartname.add("Axtry 100 Pcs Large Size Disposable Medical Latex Examination Gloves  (Pack of 100)");
        flipcartimg.add("https://rukminim1.flixcart.com/image/416/416/k65d18w0/medical-glove/f/g/6/100-pcs-large-size-disposable-medical-axtry-original-imafzzgtynjyvdap.jpeg?q=70");
        flipcartprice.add("₹799");

        flipcartimg.add("https://rukminim1.flixcart.com/image/416/416/k9yjb0w0/medical-glove/d/e/j/plus-white-latex-examination-surgical-gloves-100-pcs-1-box-original-imafrn9yztbgp8bq.jpeg?q=70");
        flipcartprice.add("₹619");
        flipcartname.add("Emeret Plus White Latex Examination/Surgical Gloves (100 Pcs / 1 box) Latex Examination Gloves  (Pack of 100)");
        flipcartlink.add("https://www.flipkart.com/emeret-plus-white-latex-examination-surgical-gloves-100-pcs-1-box-examination/p/itm12e613439758a?pid=MGVFRHQQMZHTNDEJ&lid=LSTMGVFRHQQMZHTNDEJVZIKPF&marketplace=FLIPKART&spotlightTagId=BestsellerId_hlc%2Fmly%2Fqbi%2F8ca&srno=b_1_5&otracker=dynamic_omu_infinite_Health%2BCare%2BEssentials_10_1.dealCard.OMU_INFINITE_Health%2BCare%2BEssentials_LI8YDBJYOU7O&fm=neo%2Fmerchandising&iid=6860f118-4111-4592-bb39-df169dcdecdf.MGVFRHQQMZHTNDEJ.SEARCH&ppt=browse&ppn=browse");

        flipcartlink.add("https://www.flipkart.com/crazyink-ppe-kit-gown-hospital-scrub/p/itm976f39ed46301?pid=HTSFQXTUBTAQZSTW&lid=LSTHTSFQXTUBTAQZSTWJUJPKV&marketplace=FLIPKART&srno=b_1_1&otracker=dynamic_omu_infinite_Health%2BCare%2BEssentials_11_1.dealCard.OMU_INFINITE_Health%2BCare%2BEssentials_8BDRFJM5ILZT&fm=neo%2Fmerchandising&iid=6913382c-e8fd-4a54-a42a-b448828934c9.HTSFQXTUBTAQZSTW.SEARCH&ppt=browse&ppn=browse&ssid=31613vbrtc0000001592324289761");
        flipcartname.add("CRAZYINK PPE KIT Gown Hospital Scrub  (WHITE Free)");
        flipcartprice.add("₹399");
        flipcartimg.add("https://rukminim1.flixcart.com/image/416/416/k933ma80/hospital-scrub/s/t/w/ppe-kit-crazyink-original-imafqxvhxxhgs5w4.jpeg?q=70");

        flipcartimg.add("https://rukminim1.flixcart.com/image/416/416/k8ot7rk0/hospital-scrub/g/u/k/doctor-nurse-gown-with-cap-and-mask-agarwals-original-imafqnh6ashzujwr.jpeg?q=70");
        flipcartprice.add("₹749");
        flipcartname.add("Agarwals ™ Doctor/Nurse Gown With Cap And Mask Gown Hospital Scrub  (Green Free)");
        flipcartlink.add("https://www.flipkart.com/agarwals-doctor-nurse-gown-cap-mask-hospital-scrub/p/itm42401067e992c?pid=HTSFQNE2QN9AHGUK&lid=LSTHTSFQNE2QN9AHGUKF2AE0H&marketplace=FLIPKART&srno=b_1_3&otracker=dynamic_omu_infinite_Health%2BCare%2BEssentials_11_1.dealCard.OMU_INFINITE_Health%2BCare%2BEssentials_8BDRFJM5ILZT&fm=neo%2Fmerchandising&iid=6913382c-e8fd-4a54-a42a-b448828934c9.HTSFQNE2QN9AHGUK.SEARCH&ppt=browse&ppn=browse");

        flipcartimg.add("https://rukminim1.flixcart.com/image/416/416/kbfeljk0/hand-wash-sanitizer/x/f/v/400-instant-hand-sanitizer-instantly-kills-99-99-germs-without-original-imafsrwegjqjzzjg.jpeg?q=70");
        flipcartlink.add("https://www.flipkart.com/keepsafe-marico-instant-instantly-kills-99-99-germs-without-water-hand-sanitizer-bottle/p/itma077a238fe960?pid=HWSFRTSVKV5JYXFV&lid=LSTHWSFRTSVKV5JYXFVDNYVPT&marketplace=FLIPKART&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&fm=SEARCH&iid=en_6Udy%2BTcEPSjLhEEeBQl3E600RXvaWS%2FLbu3FwYb%2B6EPAcaQJb1kRZ2%2B5XBG%2BhsF%2Fm8GiYAhhhZqutV%2B35%2Ba4nQ%3D%3D&ppt=sp&ppn=sp&ssid=h9uluka4ow0000001592324509566&qH=dee6e162049e0c78");
        flipcartname.add("KeepSafe by Marico Instant ,Instantly Kills 99.99% Germs Without Water Hand Sanitizer Bottle  (4 x 100 ml)");
        flipcartprice.add("₹200");

        flipcartimg.add("https://rukminim1.flixcart.com/image/416/416/kamtsi80/hand-wash-sanitizer/9/h/s/500-80-alcohol-based-who-recommended-formula-bottle-saferub-original-imafs6fhgzdhnhht.jpeg?q=70");
        flipcartprice.add("₹219");
        flipcartname.add("Saferub 80% Alcohol Based WHO recommended formula Hand Sanitizer Bottle  (500 ml)");
        flipcartlink.add("https://www.flipkart.com/saferub-80-alcohol-based-recommended-formula-hand-sanitizer-bottle/p/itmff25337273361?pid=HWSFS4NJAQ8YU9HS&lid=LSTHWSFS4NJAQ8YU9HSWEDCIT&marketplace=FLIPKART&srno=s_1_11&otracker=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&fm=SEARCH&iid=f3a5424d-643e-43bd-a655-1e47df8f253d.HWSFS4NJAQ8YU9HS.SEARCH&ppt=sp&ppn=sp&qH=dee6e162049e0c78");

        flipcartimg.add("https://rukminim1.flixcart.com/image/416/416/kazor680/hand-wash-sanitizer/b/x/s/75-germ-kill-spray-bottle-lifebuoy-original-imafsfkjjx2mdzcp.jpeg?q=70");
        flipcartlink.add("https://www.flipkart.com/lifebuoy-germ-kill-sanitizer-spray-bottle/p/itm710b55f6ae825?pid=HWSFRZ5EKAAE4BXS&lid=LSTHWSFRZ5EKAAE4BXSDGQN1U&marketplace=FLIPKART&srno=s_1_5&otracker=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&fm=SEARCH&iid=f3a5424d-643e-43bd-a655-1e47df8f253d.HWSFRZ5EKAAE4BXS.SEARCH&ppt=sp&ppn=sp&qH=dee6e162049e0c78");
        flipcartname.add("Lifebuoy Germ Kill Sanitizer Spray Bottle  (75 ml)");
        flipcartprice.add("₹149");

        WebproductAdapter webproductAdapter = new WebproductAdapter(getApplicationContext(),flipcartimg,flipcartname,flipcartlink,flipcartprice);
        flipcartrecycler.setLayoutManager(new LinearLayoutManager(this));
        flipcartrecycler.setAdapter(webproductAdapter);



    }
}