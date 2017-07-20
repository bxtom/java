package com.gsm.main;

import com.gsm.smatfon.Komputer;
import com.gsm.smatfon.Smartfon;
import com.gsm.smatfon.Telefon;

public class Main {
    public static void main(String[] args) {
        Smartfon s8 = new Smartfon("Samsung", "Galaxy S8");
        s8.dzwonDo("997");
        s8.otwurzStroneWWW("wp.pl");
        s8.smsDo("123 456 789",  "Hej co slychac?");

        Telefon alcatel = new Smartfon("Alcatel", "OneTouch");
        Komputer htc = new Smartfon("HTC", "One");


    }
}
