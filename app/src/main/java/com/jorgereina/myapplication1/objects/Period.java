package com.jorgereina.myapplication1.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Period {

    @SerializedName("timestamp")
    @Expose
    private long timestamp;
    @SerializedName("validTime")
    @Expose
    private String validTime;
    @SerializedName("dateTimeISO")
    @Expose
    private String dateTimeISO;
    @SerializedName("maxTempC")
    @Expose
    private Integer maxTempC;
    @SerializedName("maxTempF")
    @Expose
    private Integer maxTempF;
    @SerializedName("minTempC")
    @Expose
    private Integer minTempC;
    @SerializedName("minTempF")
    @Expose
    private Integer minTempF;
    @SerializedName("avgTempC")
    @Expose
    private Integer avgTempC;
    @SerializedName("avgTempF")
    @Expose
    private Integer avgTempF;
    @SerializedName("tempC")
    @Expose
    private Object tempC;
    @SerializedName("tempF")
    @Expose
    private Object tempF;
    @SerializedName("pop")
    @Expose
    private Integer pop;
    @SerializedName("precipMM")
    @Expose
    private double precipMM;
    @SerializedName("precipIN")
    @Expose
    private double precipIN;
    @SerializedName("iceaccum")
    @Expose
    private Object iceaccum;
    @SerializedName("maxHumidity")
    @Expose
    private Integer maxHumidity;
    @SerializedName("minHumidity")
    @Expose
    private Integer minHumidity;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
    @SerializedName("uvi")
    @Expose
    private Object uvi;
    @SerializedName("pressureMB")
    @Expose
    private Integer pressureMB;
    @SerializedName("pressureIN")
    @Expose
    private Float pressureIN;
    @SerializedName("sky")
    @Expose
    private Integer sky;
    @SerializedName("snowCM")
    @Expose
    private Integer snowCM;
    @SerializedName("snowIN")
    @Expose
    private Integer snowIN;
    @SerializedName("feelslikeC")
    @Expose
    private Integer feelslikeC;
    @SerializedName("feelslikeF")
    @Expose
    private Integer feelslikeF;
    @SerializedName("minFeelslikeC")
    @Expose
    private Integer minFeelslikeC;
    @SerializedName("minFeelslikeF")
    @Expose
    private Integer minFeelslikeF;
    @SerializedName("maxFeelslikeC")
    @Expose
    private Integer maxFeelslikeC;
    @SerializedName("maxFeelslikeF")
    @Expose
    private Integer maxFeelslikeF;
    @SerializedName("avgFeelslikeC")
    @Expose
    private Integer avgFeelslikeC;
    @SerializedName("avgFeelslikeF")
    @Expose
    private Integer avgFeelslikeF;
    @SerializedName("dewpointC")
    @Expose
    private Integer dewpointC;
    @SerializedName("dewpointF")
    @Expose
    private Integer dewpointF;
    @SerializedName("maxDewpointC")
    @Expose
    private Integer maxDewpointC;
    @SerializedName("maxDewpointF")
    @Expose
    private Integer maxDewpointF;
    @SerializedName("minDewpointC")
    @Expose
    private Integer minDewpointC;
    @SerializedName("minDewpointF")
    @Expose
    private Integer minDewpointF;
    @SerializedName("avgDewpointC")
    @Expose
    private Integer avgDewpointC;
    @SerializedName("avgDewpointF")
    @Expose
    private Integer avgDewpointF;
    @SerializedName("windDirDEG")
    @Expose
    private Integer windDirDEG;
    @SerializedName("windDir")
    @Expose
    private String windDir;
    @SerializedName("windDirMaxDEG")
    @Expose
    private Integer windDirMaxDEG;
    @SerializedName("windDirMax")
    @Expose
    private String windDirMax;
    @SerializedName("windDirMinDEG")
    @Expose
    private Integer windDirMinDEG;
    @SerializedName("windDirMin")
    @Expose
    private String windDirMin;
    @SerializedName("windGustKTS")
    @Expose
    private Integer windGustKTS;
    @SerializedName("windGustKPH")
    @Expose
    private Integer windGustKPH;
    @SerializedName("windGustMPH")
    @Expose
    private Integer windGustMPH;
    @SerializedName("windSpeedKTS")
    @Expose
    private Integer windSpeedKTS;
    @SerializedName("windSpeedKPH")
    @Expose
    private Integer windSpeedKPH;
    @SerializedName("windSpeedMPH")
    @Expose
    private Integer windSpeedMPH;
    @SerializedName("windSpeedMaxKTS")
    @Expose
    private Integer windSpeedMaxKTS;
    @SerializedName("windSpeedMaxKPH")
    @Expose
    private Integer windSpeedMaxKPH;
    @SerializedName("windSpeedMaxMPH")
    @Expose
    private Integer windSpeedMaxMPH;
    @SerializedName("windSpeedMinKTS")
    @Expose
    private Integer windSpeedMinKTS;
    @SerializedName("windSpeedMinKPH")
    @Expose
    private Integer windSpeedMinKPH;
    @SerializedName("windSpeedMinMPH")
    @Expose
    private Integer windSpeedMinMPH;
    @SerializedName("windDir80mDEG")
    @Expose
    private Integer windDir80mDEG;
    @SerializedName("windDir80m")
    @Expose
    private String windDir80m;
    @SerializedName("windDirMax80mDEG")
    @Expose
    private Integer windDirMax80mDEG;
    @SerializedName("windDirMax80m")
    @Expose
    private String windDirMax80m;
    @SerializedName("windDirMin80mDEG")
    @Expose
    private Integer windDirMin80mDEG;
    @SerializedName("windDirMin80m")
    @Expose
    private String windDirMin80m;
    @SerializedName("windGust80mKTS")
    @Expose
    private Integer windGust80mKTS;
    @SerializedName("windGust80mKPH")
    @Expose
    private Integer windGust80mKPH;
    @SerializedName("windGust80mMPH")
    @Expose
    private Integer windGust80mMPH;
    @SerializedName("windSpeed80mKTS")
    @Expose
    private Integer windSpeed80mKTS;
    @SerializedName("windSpeed80mKPH")
    @Expose
    private Integer windSpeed80mKPH;
    @SerializedName("windSpeed80mMPH")
    @Expose
    private Integer windSpeed80mMPH;
    @SerializedName("windSpeedMax80mKTS")
    @Expose
    private Integer windSpeedMax80mKTS;
    @SerializedName("windSpeedMax80mKPH")
    @Expose
    private Integer windSpeedMax80mKPH;
    @SerializedName("windSpeedMax80mMPH")
    @Expose
    private Integer windSpeedMax80mMPH;
    @SerializedName("windSpeedMin80mKTS")
    @Expose
    private Integer windSpeedMin80mKTS;
    @SerializedName("windSpeedMin80mKPH")
    @Expose
    private Integer windSpeedMin80mKPH;
    @SerializedName("windSpeedMin80mMPH")
    @Expose
    private Integer windSpeedMin80mMPH;
    @SerializedName("weather")
    @Expose
    private String weather;
    @SerializedName("weatherCoded")
    @Expose
    private List<WeatherCoded> weatherCoded = null;
    @SerializedName("weatherPrimary")
    @Expose
    private String weatherPrimary;
    @SerializedName("weatherPrimaryCoded")
    @Expose
    private String weatherPrimaryCoded;
    @SerializedName("cloudsCoded")
    @Expose
    private String cloudsCoded;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("isDay")
    @Expose
    private Boolean isDay;
    @SerializedName("sunrise")
    @Expose
    private Integer sunrise;
    @SerializedName("sunriseISO")
    @Expose
    private String sunriseISO;
    @SerializedName("sunset")
    @Expose
    private Integer sunset;
    @SerializedName("sunsetISO")
    @Expose
    private String sunsetISO;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public String getDateTimeISO() {
        return dateTimeISO;
    }

    public void setDateTimeISO(String dateTimeISO) {
        this.dateTimeISO = dateTimeISO;
    }

    public Integer getMaxTempC() {
        return maxTempC;
    }

    public void setMaxTempC(Integer maxTempC) {
        this.maxTempC = maxTempC;
    }

    public Integer getMaxTempF() {
        return maxTempF;
    }

    public void setMaxTempF(Integer maxTempF) {
        this.maxTempF = maxTempF;
    }

    public Integer getMinTempC() {
        return minTempC;
    }

    public void setMinTempC(Integer minTempC) {
        this.minTempC = minTempC;
    }

    public Integer getMinTempF() {
        return minTempF;
    }

    public void setMinTempF(Integer minTempF) {
        this.minTempF = minTempF;
    }

    public Integer getAvgTempC() {
        return avgTempC;
    }

    public void setAvgTempC(Integer avgTempC) {
        this.avgTempC = avgTempC;
    }

    public Integer getAvgTempF() {
        return avgTempF;
    }

    public void setAvgTempF(Integer avgTempF) {
        this.avgTempF = avgTempF;
    }

    public Object getTempC() {
        return tempC;
    }

    public void setTempC(Object tempC) {
        this.tempC = tempC;
    }

    public Object getTempF() {
        return tempF;
    }

    public void setTempF(Object tempF) {
        this.tempF = tempF;
    }

    public Integer getPop() {
        return pop;
    }

    public void setPop(Integer pop) {
        this.pop = pop;
    }

    public double getPrecipMM() {
        return precipMM;
    }

    public void setPrecipMM(Float precipMM) {
        this.precipMM = precipMM;
    }

    public double getPrecipIN() {
        return precipIN;
    }

    public void setPrecipIN(double precipIN) {
        this.precipIN = precipIN;
    }

    public Object getIceaccum() {
        return iceaccum;
    }

    public void setIceaccum(Object iceaccum) {
        this.iceaccum = iceaccum;
    }

    public Integer getMaxHumidity() {
        return maxHumidity;
    }

    public void setMaxHumidity(Integer maxHumidity) {
        this.maxHumidity = maxHumidity;
    }

    public Integer getMinHumidity() {
        return minHumidity;
    }

    public void setMinHumidity(Integer minHumidity) {
        this.minHumidity = minHumidity;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Object getUvi() {
        return uvi;
    }

    public void setUvi(Object uvi) {
        this.uvi = uvi;
    }

    public Integer getPressureMB() {
        return pressureMB;
    }

    public void setPressureMB(Integer pressureMB) {
        this.pressureMB = pressureMB;
    }

    public Float getPressureIN() {
        return pressureIN;
    }

    public void setPressureIN(Float pressureIN) {
        this.pressureIN = pressureIN;
    }

    public Integer getSky() {
        return sky;
    }

    public void setSky(Integer sky) {
        this.sky = sky;
    }

    public Integer getSnowCM() {
        return snowCM;
    }

    public void setSnowCM(Integer snowCM) {
        this.snowCM = snowCM;
    }

    public Integer getSnowIN() {
        return snowIN;
    }

    public void setSnowIN(Integer snowIN) {
        this.snowIN = snowIN;
    }

    public Integer getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(Integer feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public Integer getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(Integer feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public Integer getMinFeelslikeC() {
        return minFeelslikeC;
    }

    public void setMinFeelslikeC(Integer minFeelslikeC) {
        this.minFeelslikeC = minFeelslikeC;
    }

    public Integer getMinFeelslikeF() {
        return minFeelslikeF;
    }

    public void setMinFeelslikeF(Integer minFeelslikeF) {
        this.minFeelslikeF = minFeelslikeF;
    }

    public Integer getMaxFeelslikeC() {
        return maxFeelslikeC;
    }

    public void setMaxFeelslikeC(Integer maxFeelslikeC) {
        this.maxFeelslikeC = maxFeelslikeC;
    }

    public Integer getMaxFeelslikeF() {
        return maxFeelslikeF;
    }

    public void setMaxFeelslikeF(Integer maxFeelslikeF) {
        this.maxFeelslikeF = maxFeelslikeF;
    }

    public Integer getAvgFeelslikeC() {
        return avgFeelslikeC;
    }

    public void setAvgFeelslikeC(Integer avgFeelslikeC) {
        this.avgFeelslikeC = avgFeelslikeC;
    }

    public Integer getAvgFeelslikeF() {
        return avgFeelslikeF;
    }

    public void setAvgFeelslikeF(Integer avgFeelslikeF) {
        this.avgFeelslikeF = avgFeelslikeF;
    }

    public Integer getDewpointC() {
        return dewpointC;
    }

    public void setDewpointC(Integer dewpointC) {
        this.dewpointC = dewpointC;
    }

    public Integer getDewpointF() {
        return dewpointF;
    }

    public void setDewpointF(Integer dewpointF) {
        this.dewpointF = dewpointF;
    }

    public Integer getMaxDewpointC() {
        return maxDewpointC;
    }

    public void setMaxDewpointC(Integer maxDewpointC) {
        this.maxDewpointC = maxDewpointC;
    }

    public Integer getMaxDewpointF() {
        return maxDewpointF;
    }

    public void setMaxDewpointF(Integer maxDewpointF) {
        this.maxDewpointF = maxDewpointF;
    }

    public Integer getMinDewpointC() {
        return minDewpointC;
    }

    public void setMinDewpointC(Integer minDewpointC) {
        this.minDewpointC = minDewpointC;
    }

    public Integer getMinDewpointF() {
        return minDewpointF;
    }

    public void setMinDewpointF(Integer minDewpointF) {
        this.minDewpointF = minDewpointF;
    }

    public Integer getAvgDewpointC() {
        return avgDewpointC;
    }

    public void setAvgDewpointC(Integer avgDewpointC) {
        this.avgDewpointC = avgDewpointC;
    }

    public Integer getAvgDewpointF() {
        return avgDewpointF;
    }

    public void setAvgDewpointF(Integer avgDewpointF) {
        this.avgDewpointF = avgDewpointF;
    }

    public Integer getWindDirDEG() {
        return windDirDEG;
    }

    public void setWindDirDEG(Integer windDirDEG) {
        this.windDirDEG = windDirDEG;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Integer getWindDirMaxDEG() {
        return windDirMaxDEG;
    }

    public void setWindDirMaxDEG(Integer windDirMaxDEG) {
        this.windDirMaxDEG = windDirMaxDEG;
    }

    public String getWindDirMax() {
        return windDirMax;
    }

    public void setWindDirMax(String windDirMax) {
        this.windDirMax = windDirMax;
    }

    public Integer getWindDirMinDEG() {
        return windDirMinDEG;
    }

    public void setWindDirMinDEG(Integer windDirMinDEG) {
        this.windDirMinDEG = windDirMinDEG;
    }

    public String getWindDirMin() {
        return windDirMin;
    }

    public void setWindDirMin(String windDirMin) {
        this.windDirMin = windDirMin;
    }

    public Integer getWindGustKTS() {
        return windGustKTS;
    }

    public void setWindGustKTS(Integer windGustKTS) {
        this.windGustKTS = windGustKTS;
    }

    public Integer getWindGustKPH() {
        return windGustKPH;
    }

    public void setWindGustKPH(Integer windGustKPH) {
        this.windGustKPH = windGustKPH;
    }

    public Integer getWindGustMPH() {
        return windGustMPH;
    }

    public void setWindGustMPH(Integer windGustMPH) {
        this.windGustMPH = windGustMPH;
    }

    public Integer getWindSpeedKTS() {
        return windSpeedKTS;
    }

    public void setWindSpeedKTS(Integer windSpeedKTS) {
        this.windSpeedKTS = windSpeedKTS;
    }

    public Integer getWindSpeedKPH() {
        return windSpeedKPH;
    }

    public void setWindSpeedKPH(Integer windSpeedKPH) {
        this.windSpeedKPH = windSpeedKPH;
    }

    public Integer getWindSpeedMPH() {
        return windSpeedMPH;
    }

    public void setWindSpeedMPH(Integer windSpeedMPH) {
        this.windSpeedMPH = windSpeedMPH;
    }

    public Integer getWindSpeedMaxKTS() {
        return windSpeedMaxKTS;
    }

    public void setWindSpeedMaxKTS(Integer windSpeedMaxKTS) {
        this.windSpeedMaxKTS = windSpeedMaxKTS;
    }

    public Integer getWindSpeedMaxKPH() {
        return windSpeedMaxKPH;
    }

    public void setWindSpeedMaxKPH(Integer windSpeedMaxKPH) {
        this.windSpeedMaxKPH = windSpeedMaxKPH;
    }

    public Integer getWindSpeedMaxMPH() {
        return windSpeedMaxMPH;
    }

    public void setWindSpeedMaxMPH(Integer windSpeedMaxMPH) {
        this.windSpeedMaxMPH = windSpeedMaxMPH;
    }

    public Integer getWindSpeedMinKTS() {
        return windSpeedMinKTS;
    }

    public void setWindSpeedMinKTS(Integer windSpeedMinKTS) {
        this.windSpeedMinKTS = windSpeedMinKTS;
    }

    public Integer getWindSpeedMinKPH() {
        return windSpeedMinKPH;
    }

    public void setWindSpeedMinKPH(Integer windSpeedMinKPH) {
        this.windSpeedMinKPH = windSpeedMinKPH;
    }

    public Integer getWindSpeedMinMPH() {
        return windSpeedMinMPH;
    }

    public void setWindSpeedMinMPH(Integer windSpeedMinMPH) {
        this.windSpeedMinMPH = windSpeedMinMPH;
    }

    public Integer getWindDir80mDEG() {
        return windDir80mDEG;
    }

    public void setWindDir80mDEG(Integer windDir80mDEG) {
        this.windDir80mDEG = windDir80mDEG;
    }

    public String getWindDir80m() {
        return windDir80m;
    }

    public void setWindDir80m(String windDir80m) {
        this.windDir80m = windDir80m;
    }

    public Integer getWindDirMax80mDEG() {
        return windDirMax80mDEG;
    }

    public void setWindDirMax80mDEG(Integer windDirMax80mDEG) {
        this.windDirMax80mDEG = windDirMax80mDEG;
    }

    public String getWindDirMax80m() {
        return windDirMax80m;
    }

    public void setWindDirMax80m(String windDirMax80m) {
        this.windDirMax80m = windDirMax80m;
    }

    public Integer getWindDirMin80mDEG() {
        return windDirMin80mDEG;
    }

    public void setWindDirMin80mDEG(Integer windDirMin80mDEG) {
        this.windDirMin80mDEG = windDirMin80mDEG;
    }

    public String getWindDirMin80m() {
        return windDirMin80m;
    }

    public void setWindDirMin80m(String windDirMin80m) {
        this.windDirMin80m = windDirMin80m;
    }

    public Integer getWindGust80mKTS() {
        return windGust80mKTS;
    }

    public void setWindGust80mKTS(Integer windGust80mKTS) {
        this.windGust80mKTS = windGust80mKTS;
    }

    public Integer getWindGust80mKPH() {
        return windGust80mKPH;
    }

    public void setWindGust80mKPH(Integer windGust80mKPH) {
        this.windGust80mKPH = windGust80mKPH;
    }

    public Integer getWindGust80mMPH() {
        return windGust80mMPH;
    }

    public void setWindGust80mMPH(Integer windGust80mMPH) {
        this.windGust80mMPH = windGust80mMPH;
    }

    public Integer getWindSpeed80mKTS() {
        return windSpeed80mKTS;
    }

    public void setWindSpeed80mKTS(Integer windSpeed80mKTS) {
        this.windSpeed80mKTS = windSpeed80mKTS;
    }

    public Integer getWindSpeed80mKPH() {
        return windSpeed80mKPH;
    }

    public void setWindSpeed80mKPH(Integer windSpeed80mKPH) {
        this.windSpeed80mKPH = windSpeed80mKPH;
    }

    public Integer getWindSpeed80mMPH() {
        return windSpeed80mMPH;
    }

    public void setWindSpeed80mMPH(Integer windSpeed80mMPH) {
        this.windSpeed80mMPH = windSpeed80mMPH;
    }

    public Integer getWindSpeedMax80mKTS() {
        return windSpeedMax80mKTS;
    }

    public void setWindSpeedMax80mKTS(Integer windSpeedMax80mKTS) {
        this.windSpeedMax80mKTS = windSpeedMax80mKTS;
    }

    public Integer getWindSpeedMax80mKPH() {
        return windSpeedMax80mKPH;
    }

    public void setWindSpeedMax80mKPH(Integer windSpeedMax80mKPH) {
        this.windSpeedMax80mKPH = windSpeedMax80mKPH;
    }

    public Integer getWindSpeedMax80mMPH() {
        return windSpeedMax80mMPH;
    }

    public void setWindSpeedMax80mMPH(Integer windSpeedMax80mMPH) {
        this.windSpeedMax80mMPH = windSpeedMax80mMPH;
    }

    public Integer getWindSpeedMin80mKTS() {
        return windSpeedMin80mKTS;
    }

    public void setWindSpeedMin80mKTS(Integer windSpeedMin80mKTS) {
        this.windSpeedMin80mKTS = windSpeedMin80mKTS;
    }

    public Integer getWindSpeedMin80mKPH() {
        return windSpeedMin80mKPH;
    }

    public void setWindSpeedMin80mKPH(Integer windSpeedMin80mKPH) {
        this.windSpeedMin80mKPH = windSpeedMin80mKPH;
    }

    public Integer getWindSpeedMin80mMPH() {
        return windSpeedMin80mMPH;
    }

    public void setWindSpeedMin80mMPH(Integer windSpeedMin80mMPH) {
        this.windSpeedMin80mMPH = windSpeedMin80mMPH;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public List<WeatherCoded> getWeatherCoded() {
        return weatherCoded;
    }

    public void setWeatherCoded(List<WeatherCoded> weatherCoded) {
        this.weatherCoded = weatherCoded;
    }

    public String getWeatherPrimary() {
        return weatherPrimary;
    }

    public void setWeatherPrimary(String weatherPrimary) {
        this.weatherPrimary = weatherPrimary;
    }

    public String getWeatherPrimaryCoded() {
        return weatherPrimaryCoded;
    }

    public void setWeatherPrimaryCoded(String weatherPrimaryCoded) {
        this.weatherPrimaryCoded = weatherPrimaryCoded;
    }

    public String getCloudsCoded() {
        return cloudsCoded;
    }

    public void setCloudsCoded(String cloudsCoded) {
        this.cloudsCoded = cloudsCoded;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getIsDay() {
        return isDay;
    }

    public void setIsDay(Boolean isDay) {
        this.isDay = isDay;
    }

    public Integer getSunrise() {
        return sunrise;
    }

    public void setSunrise(Integer sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunriseISO() {
        return sunriseISO;
    }

    public void setSunriseISO(String sunriseISO) {
        this.sunriseISO = sunriseISO;
    }

    public Integer getSunset() {
        return sunset;
    }

    public void setSunset(Integer sunset) {
        this.sunset = sunset;
    }

    public String getSunsetISO() {
        return sunsetISO;
    }

    public void setSunsetISO(String sunsetISO) {
        this.sunsetISO = sunsetISO;
    }

}
