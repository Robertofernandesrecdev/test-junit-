package models;


import client.Client;
import register.Register;
import seller.Seller;

public class ModelRegister {

    public static Register.RegisterBuilder buildScenery(){
        return Register.builder()
                .seller(new Seller(1, "Robert"))
                .client(new Client("Ana"));
    }
}
