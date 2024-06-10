package br.com.library.test;

import br.com.library.ManagerCoupons;

public class SearchDiscount {

    public static void main(String[] args) {

        ManagerCoupons manager = new ManagerCoupons();

        Double discount = manager.validationCoupons("CUP110");

        if (discount != null) {
            System.out.println("Cupom de deconto válido!");
            System.out.println("Valor: " + discount);
        } else {
            System.out.println("OPS! Este cupom não é válido!");
        }
    }
}
