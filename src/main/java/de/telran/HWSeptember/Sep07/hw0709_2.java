package de.telran.HWSeptember.Sep07;

public class hw0709_2 {
    public static void main(String[] args) {

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = canBuyEtwas(isReweOpen, isEdekaOpen);

        String answer = "Я могу купить еду, это " + (canBuy ? "да" : "нет");
    }
    public static boolean canBuyEtwas (boolean isEdekaOpen, boolean isReweOpen){
        return isReweOpen||isEdekaOpen;
    }
}
