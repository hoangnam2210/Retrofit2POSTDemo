package example.retrofit2postdemo.services;

import example.retrofit2postdemo.models.Message;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by nam on 30/03/2017.
 */

public interface ApiService {
    @Multipart
    @POST("photo")
    Call<Message> uploadFile(@Part MultipartBody.Part file, @Part("file") RequestBody name);
}
