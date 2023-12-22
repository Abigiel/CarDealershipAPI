package com.pluralsight.models;


import java.sql.Date;

public class LeaseContract {

    protected int  leaseId, vehicleId, salespersonId;
    protected String lesseeName, paymentStatus;
    protected Date leaseStartDate, leaseEndDate, paymentDueDate;
    protected double monthlyPayment;

    public LeaseContract(int leaseId, int vehicleId, int salespersonId, String lesseeName, String paymentStatus, Date leaseStartDate, Date leaseEndDate, Date paymentDueDate, double monthlyPayment) {
        this.leaseId = leaseId;
        this.vehicleId = vehicleId;
        this.salespersonId = salespersonId;
        this.lesseeName = lesseeName;
        this.paymentStatus = paymentStatus;
        this.leaseStartDate = leaseStartDate;
        this.leaseEndDate = leaseEndDate;
        this.paymentDueDate = paymentDueDate;
        this.monthlyPayment = monthlyPayment;
    }

}