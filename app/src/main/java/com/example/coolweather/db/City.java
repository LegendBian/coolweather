package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by mayn on 2018/6/21.
 */

public class City extends DataSupport {

    private int id;
    private String cityname;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public String getCityname() {
        return cityname;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}//END
