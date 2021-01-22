    package com.amar.covid19telangana.RetrofitClass;

    import com.google.gson.annotations.SerializedName;

    public class Articles {


        @SerializedName("source")
        private NewsSource newsSource;
        @SerializedName("author")
        private String authorname;
        @SerializedName("title")
        private  String newstitle;
        @SerializedName("description")
        private String newsdescription;
        @SerializedName("url")
        private  String newsurl;
        @SerializedName("urlToImage")
        private String newsimageurl;
        @SerializedName("publishedAt")
        private  String newspublishedat;
        @SerializedName("content")
        private String newscontent;

        public Articles(NewsSource newsSource, String authorname, String newstitle, String newsdescription, String newsurl, String newsimageurl, String newspublishedat, String newscontent) {
            this.newsSource = newsSource;
            this.authorname = authorname;
            this.newstitle = newstitle;
            this.newsdescription = newsdescription;
            this.newsurl = newsurl;
            this.newsimageurl = newsimageurl;
            this.newspublishedat = newspublishedat;
            this.newscontent = newscontent;
        }

        public NewsSource getNewsSource() {
            return newsSource;
        }

        public void setNewsSource(NewsSource newsSource) {
            this.newsSource = newsSource;
        }

        public String getAuthorname() {
            return authorname;
        }

        public void setAuthorname(String authorname) {
            this.authorname = authorname;
        }

        public String getNewstitle() {
            return newstitle;
        }

        public void setNewstitle(String newstitle) {
            this.newstitle = newstitle;
        }

        public String getNewsdescription() {
            return newsdescription;
        }

        public void setNewsdescription(String newsdescription) {
            this.newsdescription = newsdescription;
        }

        public String getNewsurl() {
            return newsurl;
        }

        public void setNewsurl(String newsurl) {
            this.newsurl = newsurl;
        }

        public String getNewsimageurl() {
            return newsimageurl;
        }

        public void setNewsimageurl(String newsimageurl) {
            this.newsimageurl = newsimageurl;
        }

        public String getNewspublishedat() {
            return newspublishedat;
        }

        public void setNewspublishedat(String newspublishedat) {
            this.newspublishedat = newspublishedat;
        }

        public String getNewscontent() {
            return newscontent;
        }

        public void setNewscontent(String newscontent) {
            this.newscontent = newscontent;
        }
    }
