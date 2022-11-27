import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int month, day;
        boolean isError = false;
        String zodiag = "";
        System.out.print("Enter the month : ");
        month = input.nextInt();
        System.out.print("Enter the day : ");
        day = input.nextInt();
        if (month == 1) {
            if (day >= 22 && day <= 31) {
                zodiag = "Kova";
            } else if (day >= 1 && day <= 21) {
                zodiag = "Oglak";
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 19) {
                zodiag = "Kova";
            } else if (day >= 20 && day <= 28) {
                zodiag = "Balik";
            } else if (day>=29 && day<=31) {
                System.out.println("Please select 1-28 range ...");
                isError= true;
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 20) {
                zodiag = "Balik";
            } else if (day >= 21 && day <= 31) {
                zodiag = "Koc";
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 20) {
                zodiag = "Koc";
            } else if (day >= 21 && day <= 30) {
                zodiag = "Boga";
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 21) {
                zodiag = "Boga";
            } else if (day >= 22 && day <= 31) {
                zodiag = "Ikizler";
            } else {
                isError = true;
            }

        } else if (month == 6) {
            if (day >= 1 && day <= 22) {
                zodiag = "Ikizler";
            } else if (day >= 23 && day <= 30) {
                zodiag = "Yengec";
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 22) {
                zodiag = "Yengec";
            } else if (day >= 23 && day <= 31) {
                zodiag = "Aslan";
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if (day >= 1 && day<=22){
                zodiag = "Aslan";
            } else if (day>=23 && day<= 31) {
                zodiag = "Basak";
            }else {
                isError = true;
            }
        } else if (month==9) {
            if (day>=1 &&day<=22){
                zodiag = "Basak";
            } else if (day>=23 && day<=30) {
                zodiag = "Terazi";
            }else {
                isError = true;
            }
        } else if (month ==10) {
            if (day>=1 && day <=22){
                zodiag = "Terazi";
            } else if (day>=23 && day<=31) {
                zodiag = "Akrep";
            }else {
                isError = true;
            }
        } else if (month==11) {
            if (day>=1 && day<=21){
                zodiag = "Akrep";
            } else if (day>=22 && day<=30) {
                zodiag = "Yay";
            }else {
                isError = true;
            }
        } else if (month == 12) {
            if (day>=1 && day<=21){
                zodiag = "Yay";
            } else if (day>=22 && day<=31) {
                zodiag = "Oglak";
            }else {
                isError = true;
            }
        }else {
            isError=true;
        }

        if (isError == true) {
            System.out.println("Error, please enter correct data...\nMonth range is 1-12\nDay range is 1-31");
        } else {
            System.out.println("Your zodiag : " + zodiag);
        }


    }
}