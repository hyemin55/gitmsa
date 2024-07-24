package org.example.exam;

public class HybridWaterCar extends HybridCar{
     int waterGauge;

    public void showCurrentGauge(int a1, int b1, int c1){
        gasolineGauge = a1;
        electricGauge = b1;
        waterGauge = c1;

        System.out.println("잔여 가솔린 "+gasolineGauge);
        System.out.println("잔여 전기량 "+electricGauge);
        System.out.println("잔여 워터량 "+waterGauge);
    }
}
