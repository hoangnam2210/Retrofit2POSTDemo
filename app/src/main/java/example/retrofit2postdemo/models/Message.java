package example.retrofit2postdemo.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nam on 30/03/2017.
 */

public class Message {
    @SerializedName("Message")
    String message;

    public String getMessage() {
        return message;
    }
}
