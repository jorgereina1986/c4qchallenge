package com.jorgereina.myapplication1.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Loc {

    @SerializedName("long")
    @Expose
    private Float _long;
    @SerializedName("lat")
    @Expose
    private Float lat;

    public Float getLong() {
        return _long;
    }

    public void setLong(Float _long) {
        this._long = _long;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

}
