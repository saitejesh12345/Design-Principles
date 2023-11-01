package org.example.singleResponsiblePrinciple;

public class DesigningConsole {

    public void Welcomeprint(){

        int borderLength = 100;
        String message = "Welcome to Pizza Hut";
        String border = repeatCharacter('*', borderLength);

        System.out.println(border);
        System.out.println(centerText(message, borderLength));
        System.out.println(border);
    }

    public void DeliveryMsgprint(){

        int borderLength = 30;
        String message = "Patner is Arriving Your Location";
        String border = repeatCharacter('*', borderLength);

        System.out.println(border);
        System.out.println(centerText(message, borderLength));
        System.out.println(border);
    }

    public void DeliverdMsgprint(){

        int borderLength = 30;
        String message = "Order has been  delivered Successfully";
        String border = repeatCharacter('*', borderLength);

        System.out.println(border);
        System.out.println(centerText(message, borderLength));
        System.out.println(border);
    }
    private static String repeatCharacter(char ch, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
    private static String centerText(String text, int length) {
        int padding = (length - text.length()) / 2;
        StringBuilder sb = new StringBuilder();
        sb.append(repeatCharacter(' ', padding));
        sb.append(text);
        sb.append(repeatCharacter(' ', padding));
        return sb.toString();
    }
}
