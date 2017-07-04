package com.zbartholomew.example1;

public interface Mediator {

    void saleOffer(String stock, int shares, int collCode);

    void buyOffer(String stock, int shares, int collCode);

    void addColleague(Colleague colleague);
}