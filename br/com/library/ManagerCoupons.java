package br.com.library;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class ManagerCoupons {

    private Set<String> coupons;

    public ManagerCoupons() {
        this.coupons = new HashSet<String>();

        coupons.addAll(Arrays.asList("CUP100, CUP250, CUP110, CUP170, CUP20, CUP10"));
    }

    public boolean validationCoupons(String coupons) {
        return this.coupons.contains(coupons);
    }
}
