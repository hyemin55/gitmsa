package org.example;

class ContInfo {
    String phone;
    String address;

    public ContInfo(String phone, String address) {
        this.phone = phone;
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}

public class ex05 {
    public static void main(String[] args) {

        ContInfo contInfo = new ContInfo(null, "KOREA DAEGU");

        String phone = null;
        String address = null;

        if (contInfo.getPhone() != null)
            phone = contInfo.getPhone();
        else
            phone = "EMPTY";

        if(contInfo.getAddress()!=null)
            address = contInfo.getAddress();
        else
            address = "EMPTY";

        System.out.println("phone = "+phone);
        System.out.println("address = "+address);
    }
}
