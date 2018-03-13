package com.hiweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hong on 18-3-11.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
