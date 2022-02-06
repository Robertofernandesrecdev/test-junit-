package bda;

import sale.Sale;

import java.util.ArrayList;
import java.util.List;

public class dataBase {
    public static List<Sale> sales = new ArrayList<>();

    public static void addSale(Sale sale){
        sales.add(sale);
    };
}
