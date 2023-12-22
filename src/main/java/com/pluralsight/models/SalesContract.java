package com.pluralsight.models;

import java.sql.Date;

public class SalesContract {

    protected int contractId;
    protected int vehicleId;
    protected String buyerName;
    protected String sellerName;
    protected double salePrice;
    protected String paymentMethod;
    protected Date paymentDueDate,  saleDate;
    protected String paymentStatus;
    protected int salespersonId;

    public SalesContract(int contractId, int vehicleId, String buyerName, String sellerName, double salePrice, String paymentMethod, Date paymentDueDate, Date saleDate, String paymentStatus, int salespersonId) {
        this.contractId = contractId;
        this.vehicleId = vehicleId;
        this.buyerName = buyerName;
        this.sellerName = sellerName;
        this.salePrice = salePrice;
        this.paymentMethod = paymentMethod;
        this.paymentDueDate = paymentDueDate;
        this.saleDate = saleDate;
        this.paymentStatus = paymentStatus;
        this.salespersonId = salespersonId;
    }
}
