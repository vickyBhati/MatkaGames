package com.dev.goldengames.api;


import com.dev.goldengames.model.BasicModel;
import com.dev.goldengames.model.BhavListModel;
import com.dev.goldengames.model.ForgotModel;
import com.dev.goldengames.model.ModelAddContact;
import com.dev.goldengames.model.ModelAllPhone;
import com.dev.goldengames.model.ModelBetHistory;
import com.dev.goldengames.model.ModelDashboard;
import com.dev.goldengames.model.ModelGetData;
import com.dev.goldengames.model.ModelPgone;
import com.dev.goldengames.model.ModelUser;
import com.dev.goldengames.model.Modelgame;
import com.dev.goldengames.model.NewLoginModel;
import com.dev.goldengames.model.ProductModel;
import com.dev.goldengames.model.SignupModel;
import com.dev.goldengames.model.TrasnscationModel;

import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {


    public static final String REGISTRATION_COMPLETE = "registrationComplete";

    public static final String PUSH_NOTIFICATION = "pushNotification";
    // id to handle the notification in the notification    tray
    public static final int NOTIFICATION_ID = 100;
    public static final int NOTIFICATION_ID_BIG_IMAGE = 101;
    public static final String SHARED_PREF = "ah_firebase";
//    String BASE_URL = "http://139.162.242.206/clients/audience/webservices/";
//    String BASE_URL = "http://dindhora.com/Api/";
    String BASE_URL = "https://navrangmatka.com/api/";


    String Game = "game.php";

    String SaveProfile = "user_profile_update.php";

    @Headers({ "Content-Type: application/json;charset=UTF-8"})
        @GET("V8/current-user")
        Call<ModelUser> getUser(@Header("Authorization") String auth);


    @FormUrlEncoded
    @POST("half-sangam")
    Call<BasicModel> halfsangam(@FieldMap Map<String, Object> partMa);


    @Headers({"Content-Type: application/json;charset=UTF-8"})
        @GET("V8/custom/module/AOS_Invoices/{AOS_Invoices}")
        Call<ProductModel> getproduct(@Header("Authorization") String auth,@Path("AOS_Invoices") String input);

        @Headers({ "Content-Type: application/json;charset=UTF-8"})
        @POST("relationships")
        Call<String> addRelastion(@Body RequestBody params,@Header("Authorization") String auth);


        @Headers({ "Content-Type: application/json;charset=UTF-8"})
        @GET("V8/custom/customer/get_option_list?filter")
        Call<ModelAllPhone> phone(@Header("Authorization") String auth, @Query(value = "[phone_mobile]=",encoded = true) String s);



        @Headers({ "Content-Type: application/json;charset=UTF-8"})
        @POST("V8/custom/sales")
        Call<String> addProduct(@Body RequestBody params, @Header("Authorization") String auth);

        @Headers({ "Content-Type: application/json;charset=UTF-8"})
        @POST("V8/module")
        Call<ModelAddContact> addCustomer(@Body RequestBody params,@Header("Authorization") String auth);


    @FormUrlEncoded
    @POST("login")
    Call<NewLoginModel> user_login(@FieldMap Map<String, Object> partMa);

    @GET("how-to-play")
    Call<String> plsy();

    @GET("getSetting")
    Call<ModelPgone> getSetting();

    @FormUrlEncoded
    @POST("change-password")
    Call<BasicModel> chnage_password(@FieldMap Map<String, Object> partMa);


    @FormUrlEncoded
    @POST(Game)
    Call<Modelgame> game(@FieldMap Map<String, Object> partMa);


    @FormUrlEncoded
    @POST("patti-betting")
    Call<BasicModel> game_add(@FieldMap Map<String, Object> partMa);


    @FormUrlEncoded
    @POST("register")
    Call<SignupModel> sign_up(@FieldMap Map<String, Object> partMa);

    @FormUrlEncoded
    @POST("otp-verification")
    Call<BasicModel> otp(@FieldMap Map<String, Object> partMa);

    @FormUrlEncoded
    @POST("reset_password")
    Call<BasicModel> reset_password(@FieldMap Map<String, Object> partMa);

    @FormUrlEncoded
    @POST("forgot-password")
    Call<ForgotModel> forgot_password(@FieldMap Map<String, Object> partMa);

    @FormUrlEncoded
    @POST("forgot-confirm-otp")
    Call<BasicModel> forgot_otp(@FieldMap Map<String, Object> partMa);
    @GET("market_lists")
    Call<ModelDashboard> dashboard();



    @FormUrlEncoded
    @POST("bet-history")
    Call<ModelBetHistory> bet_history(@FieldMap Map<String, Object> partMa);

    @FormUrlEncoded
    @POST("transaction-history")
    Call<TrasnscationModel> transction(@FieldMap Map<String, Object> partMa);

    @GET("app-sliders")
    Call<String> silder();



    @FormUrlEncoded
    @POST("profile-detail")
    Call<ModelGetData> user_profile(@FieldMap Map<String, Object> partMa);

    @FormUrlEncoded
    @POST(SaveProfile)
    Call<BasicModel> saveProfile(@FieldMap Map<String, Object> partMa);

    @GET("default-message")
    Call<String> degult();

    @GET("bhav-list")
    Call<BhavListModel> bhavlist();

}


