package com.dev.goldengames.extra;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;

import androidx.annotation.Nullable;

import com.dev.goldengames.ModelLogin;
import com.dev.goldengames.model.NewLoginModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class AppPreference {
    private static AppPreference appPreference;
    private SharedPreferences sharedPreferences;
    private SharedPreferences sharedPreferencesClear;
    private  static Context context;

    public static AppPreference getInstance(Context context) {
        if (appPreference == null) {
            appPreference = new AppPreference(context);
            context = context;
        }
        return appPreference;
    }

    public static String getAndroidId(Context mContext) {
        @SuppressLint("HardwareIds")
        String android_id = Settings.Secure.getString(mContext.getContentResolver(), Settings.Secure.ANDROID_ID);
        return android_id;
    }


    private AppPreference(Context context) {
        sharedPreferences = context.getSharedPreferences("AppPreference", Context.MODE_PRIVATE);
        sharedPreferencesClear= context.getSharedPreferences("AppPreferenceClear", Context.MODE_PRIVATE);

    }

    public static void saveUserInfoo(@Nullable Context applicationContext, NewLoginModel response) {
        Gson gson = new Gson();
        String json = gson.toJson(response);
        getInstance(applicationContext).sharedPreferences.edit().putString("userInfo", json).apply();
    }

    public static  void  wallet(Context context,String user_name){
        SharedPreferences.Editor editor = getInstance(context).sharedPreferences.edit();
        editor.putString("wallet", user_name);
        editor.apply();

    }

    public static String getString(Context context, String key) {

        return getInstance(context).sharedPreferences.getString(key, "");
    }
    public static void saveLogin(@Nullable Context applicationContext, ModelLogin response) {
        Gson gson = new Gson();
        String json = gson.toJson(response);
        getInstance(applicationContext).sharedPreferences.edit().putString("user", json).apply();
    }



    public static NewLoginModel  getUserInfo(Context context){
        Gson gson = new Gson();
        String json = getInstance(context).sharedPreferences.getString("userInfo", null);
        if (json != null) {
        }
        Type type = new TypeToken<NewLoginModel >() {
        }.getType();
        return gson.fromJson(json, type);
    }

    public static ModelLogin  getUser(Context context){
        Gson gson = new Gson();
        String json = getInstance(context).sharedPreferences.getString("user", null);
        if (json != null) {
        }
        Type type = new TypeToken<ModelLogin >() {
        }.getType();
        return gson.fromJson(json, type);
    }
    public static void idLogout(Context context) {
        @SuppressLint("CommitPrefEdits")
        SharedPreferences.Editor editor = getInstance(context).sharedPreferences.edit();
        editor.remove("userInfo");
        editor.apply();
    }


}
