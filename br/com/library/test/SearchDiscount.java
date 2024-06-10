package br.com.library.test;

import br.com.library.ManagerCoupons;

public class SearchDiscount {

    public static void main(String[] args) {

        ManagerCoupons manager = new ManagerCoupons();

        if (manager.validationCoupons("CUP110")) {
            System.out.println("Cupom de deconto válido!");
        } else {
            System.out.println("OPS! Este cupom não é válido!");
        }
    }
}
