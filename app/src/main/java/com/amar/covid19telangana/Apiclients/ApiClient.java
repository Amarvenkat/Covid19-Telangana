package com.amar.covid19telangana.Apiclients;


import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;


public class ApiClient {
    private static Retrofit retrofit = null;

    public static final String BASE_URL = "https://api.covid19india.org/";
   /* private  static HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
    private static Interceptor logging = interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);

    private static Retrofit retrofit = null;

    private  static OkHttpClient httpClient =new OkHttpClient.Builder()
            .readTimeout(1000, TimeUnit.MILLISECONDS)
            .addInterceptor(logging)
            .build();
*/
    //public static <S> S createService(Class<S> ServiceClass)


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
