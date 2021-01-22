    package com.amar.covid19telangana.CollectionFood;

    import com.amar.covid19telangana.Services.CollectionFoodService;

    public class CollectionFoodPojo {

        public String name,phoneno,gender,address,foodavailable,quantity;
        public CollectionFoodPojo(){

        }
        public CollectionFoodPojo(String name, String phoneno, String gender, String address, String foodavailable, String quantity) {

            this.name = name;
            this.phoneno = phoneno;
            this.gender = gender;
            this.address = address;
            this.foodavailable = foodavailable;
            this.quantity = quantity;


        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneno() {
            return phoneno;
        }

        public void setPhoneno(String phoneno) {
            this.phoneno = phoneno;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getFoodavailable() {
            return foodavailable;
        }

        public void setFoodavailable(String foodavailable) {
            this.foodavailable = foodavailable;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }
    }
