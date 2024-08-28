package org.example;

import java.util.Optional;

class ContInfo2{
    String phone;
    String addres;

    public String getPhone(){return phone;}
    public String getAddres(){return addres;}

    public ContInfo2(String phone, String addres) {
        this.phone = phone;
        this.addres = addres;
    }
}

public class ex05_2 {
    public static void main(String[] args) {

        Optional<ContInfo2> contInfo =
                Optional.of(new ContInfo2(null, "KOREA DAEGU"));

        String phone = contInfo.map(contInfo1 -> contInfo1.getPhone())
                .orElse("no phone number");
        System.out.println(phone);

        String adress = contInfo.map(contInfo1 -> contInfo1.getAddres())
                .orElse("nononoo adress");
        System.out.println(adress);


//        String phone = null;
//        String adress = null;

//        if(contInfo.getPhone() !=null)
//            phone=contInfo.getPhone();
//        else
//            phone = "EMPTY";

//        if(contInfo.getAddres() !=null)
//            adress=contInfo.getAddres();
//        else
//            adress = "EMPTY";




    }
}






