package com.qf.pojo;

/**
 * Created by Administrator on 2018/3/8 0008.
 */
public class CarInfo {
    private Long carId;
    private String carColor;
    private String carPinpai;
    private String carDesc;
    private CarType carTypeByCarTid;

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarPinpai() {
        return carPinpai;
    }

    public void setCarPinpai(String carPinpai) {
        this.carPinpai = carPinpai;
    }

    public String getCarDesc() {
        return carDesc;
    }

    public void setCarDesc(String carDesc) {
        this.carDesc = carDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarInfo carInfo = (CarInfo) o;

        if (carId != null ? !carId.equals(carInfo.carId) : carInfo.carId != null) return false;
        if (carColor != null ? !carColor.equals(carInfo.carColor) : carInfo.carColor != null) return false;
        if (carPinpai != null ? !carPinpai.equals(carInfo.carPinpai) : carInfo.carPinpai != null) return false;
        if (carDesc != null ? !carDesc.equals(carInfo.carDesc) : carInfo.carDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carId != null ? carId.hashCode() : 0;
        result = 31 * result + (carColor != null ? carColor.hashCode() : 0);
        result = 31 * result + (carPinpai != null ? carPinpai.hashCode() : 0);
        result = 31 * result + (carDesc != null ? carDesc.hashCode() : 0);
        return result;
    }

    public CarType getCarTypeByCarTid() {
        return carTypeByCarTid;
    }

    public void setCarTypeByCarTid(CarType carTypeByCarTid) {
        this.carTypeByCarTid = carTypeByCarTid;
    }
}
