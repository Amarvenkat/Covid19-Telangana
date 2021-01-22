    package com.amar.covid19telangana.RetrofitClass;

    import com.google.gson.annotations.SerializedName;

    import java.util.List;

    public class Covid19Resources {

    @SerializedName("resources")
    private List<Resource> resources;

        public Covid19Resources(List<Resource> resources) {
            this.resources = resources;
        }

        public List<Resource> getResources() {
            return resources;
        }

        public void setResources(List<Resource> resources) {
            this.resources = resources;
        }
    }
