    package com.amar.covid19telangana.RetrofitDistricts;

    import com.google.gson.annotations.SerializedName;

    public class Medak {


        @SerializedName("active")
        private  int medakactive;
        @SerializedName("confirmed")
        private  int medakconfirmed;
        @SerializedName("deceased")
        private int medakdeceased;
        @SerializedName("recovered")
        private  int medakrecovered;

        public Medak(int medakactive, int medakconfirmed, int medakdeceased, int medakrecovered) {
            this.medakactive = medakactive;
            this.medakconfirmed = medakconfirmed;
            this.medakdeceased = medakdeceased;
            this.medakrecovered = medakrecovered;
        }

        public int getMedakactive() {
            return medakactive;
        }

        public void setMedakactive(int medakactive) {
            this.medakactive = medakactive;
        }

        public int getMedakconfirmed() {
            return medakconfirmed;
        }

        public void setMedakconfirmed(int medakconfirmed) {
            this.medakconfirmed = medakconfirmed;
        }

        public int getMedakdeceased() {
            return medakdeceased;
        }

        public void setMedakdeceased(int medakdeceased) {
            this.medakdeceased = medakdeceased;
        }

        public int getMedakrecovered() {
            return medakrecovered;
        }

        public void setMedakrecovered(int medakrecovered) {
            this.medakrecovered = medakrecovered;
        }
    }
