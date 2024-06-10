package br.com.library;

import java.util.*;

public class ManagerCoupons {

    private Map<String, Double> coupons;

    public ManagerCoupons() {
        this.coupons = new HashMap<>();

        coupons.put("CUP100", 20.00);
        coupons.put("CUP250", 22.00);
        coupons.put("CUP110", 16.00);
        coupons.put("CUP17", 14.00);
    }

    public Double validationCoupons(String coupons) {
        return this.coupons.get(coupons);
    }
}
