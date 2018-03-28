package com.qf.pojo;

import java.util.Date;

public class Order {
    private Long orderId;

    private Date orderTime;

    private Double orderTotalprice;

    private Integer orderStatus;

    private Long orderRoom;

    private Long orderType;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Double getOrderTotalprice() {
        return orderTotalprice;
    }

    public void setOrderTotalprice(Double orderTotalprice) {
        this.orderTotalprice = orderTotalprice;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getOrderRoom() {
        return orderRoom;
    }

    public void setOrderRoom(Long orderRoom) {
        this.orderRoom = orderRoom;
    }

    public Long getOrderType() {
        return orderType;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }
}