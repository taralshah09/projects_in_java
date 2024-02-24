import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("************* Welcome to the currency converter *************");
        System.out.println();
        System.out.println();
        System.out.println("Select your currencies from the options below : ");
        System.out.println(" 1. Indian Rupees(INR)");
        System.out.println(" 2. United States Dollar(USD)");
        System.out.println(" 3. Euro(EUR)");
        System.out.println(" 4. British Pound(GBP)");
        System.out.println(" 5. Canadian Dollar(CAD)");
        System.out.println(" 6. Australian Dollar(AUD)");
        System.out.println(" 7. Japanese Yen(JPY)");
        System.out.println(" 8. Chinese Yuan(CNY)");
        System.out.println(" 9. Swiss Franc(CHF)");
        System.out.println("10. Singapore Dollar(SGD)");
        System.out.println("11. United Arab Emirates(AED)");

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your choice : ");
        int choice1 = scanner.nextInt();

        float inr;
        float usd;
        float eur;
        float gbp;
        float cad;
        float aud;
        float jpy;
        float cny;
        float chf;
        float sgd;
        float aed;
        float answer = 0;
        switch (choice1) {

            case 1:
                System.out.print("Enter the currency you want it to be converted : ");
                int choice2 = scanner.nextInt();
                System.out.println();
                System.out.print("INR : ");
                inr = scanner.nextInt();

                if (choice2 == 2) {
                    usd = inr / 83;
                    System.out.printf("USD : %.2f", usd);
                }
                else if (choice2 == 3) {
                    eur = inr / 90;
                    System.out.printf("EUR : %.2f", eur);
                }
                else if (choice2 == 4) {
                    gbp = inr / 105;
                    System.out.printf("GBP : %.2f",gbp);
                }
                else if (choice2 == 5) {
                    cad = inr / 61;
                    System.out.printf("CAD : %.2f", cad);
                }
                else if (choice2 == 6) {
                    aud = inr / 54;
                    System.out.printf("AUD : %.2f", aud);
                }
                else if (choice2 == 7) {
                    jpy = (float) (inr / 0.55);
                    System.out.printf("JPY : %.2f", jpy);
                }
                else if (choice2 == 8) {
                    cny = (float) (inr / 11.5);
                    System.out.printf("CNY : %.2f", cny);
                }
                else if (choice2 == 9) {
                    chf = inr / 91;
                    System.out.printf("CHF : %.2f", chf);
                }
                else if (choice2 == 10) {
                    sgd = inr / 62;
                    System.out.printf("SGD : %.2f", sgd);
                }
                else if (choice2 == 11) {
                    aed = (float) (inr / 22.5);
                    System.out.printf("AED : %.2f", aed);
                }
                else{
                    System.out.println("Oh no! You entered same currencies at both the options!");
                }
            break;

            case 2:
                System.out.print("Enter the currency you want it to be converted : ");
                choice2 = scanner.nextInt();
                System.out.println();
                System.out.print("USD : ");
                usd = scanner.nextInt();

                if (choice2 == 1) {
                    inr = usd*83;
                    System.out.printf("INR : %.2f", inr);
                }
                else if (choice2 == 3) {
                    eur = (float) (usd /1.08);
                    System.out.printf("EUR : %.2f", eur);
                }
                else if (choice2 == 4) {
                    gbp = (float) (usd / 1.27);
                    System.out.printf("GBP : %.2f",gbp);
                }
                else if (choice2 == 5) {
                    cad = (float) (usd / 0.74);
                    System.out.printf("CAD : %.2f", cad);
                }
                else if (choice2 == 6) {
                    aud = (float) (usd / 0.66);
                    System.out.printf("AUD : %.2f", aud);
                }
                else if (choice2 == 7) {
                    jpy = (float) (usd / 0.0066);
                    System.out.printf("JPY : %.2f", jpy);
                }
                else if (choice2 == 8) {
                    cny = (float) (usd / 0.14);
                    System.out.printf("CNY : %.2f", cny);
                }
                else if (choice2 == 9) {
                    chf = (float) (usd / 1.14);
                    System.out.printf("CHF : %.2f", chf);
                }
                else if (choice2 == 10) {
                    sgd = (float) (usd / 0.74);
                    System.out.printf("SGD : %.2f", sgd);
                }
                else if (choice2 == 11) {
                    aed = (float) (usd / 0.27);
                    System.out.printf("AED : %.2f", aed);
                }
                else{
                    System.out.println("Oh no! You entered same currencies at both the options!");
                }
                break;

            case 3:
                System.out.print("Enter the currency you want it to be converted : ");
                choice2 = scanner.nextInt();
                System.out.println();
                System.out.print("EUR : ");
                eur = scanner.nextInt();

                if (choice2 == 1) {
                    inr = eur * 90;
                    System.out.printf("INR : %.2f", inr);
                }
                else if (choice2 == 2) {
                    usd = (float) (eur /1.08);
                    System.out.printf("USD : %.2f", usd);
                }
                else if (choice2 == 4) {
                    gbp = (float) (eur * 0.85);
                    System.out.printf("GBP : %.2f",gbp);
                }
                else if (choice2 == 5) {
                    cad = (float) (eur * 1.46);
                    System.out.printf("CAD : %.2f", cad);
                }
                else if (choice2 == 6) {
                    aud = (float) (eur * 1.65);
                    System.out.printf("AUD : %.2f", aud);
                }
                else if (choice2 == 7) {
                    jpy = (float) (eur * 163.07);
                    System.out.printf("JPY : %.2f", jpy);
                }
                else if (choice2 == 8) {
                    cny = (float) (eur * 7.8);
                    System.out.printf("CNY : %.2f", cny);
                }
                else if (choice2 == 9) {
                    chf = (float) (eur * 0.95);
                    System.out.printf("CHF : %.2f", chf);
                }
                else if (choice2 == 10) {
                    sgd = (float) (eur * 1.45);
                    System.out.printf("SGD : %.2f", sgd);
                }
                else if (choice2 == 11) {
                    aed = (float) (eur * 3.98);
                    System.out.printf("AED : %.2f", aed);
                }
                else{
                    System.out.println("Oh no! You entered same currencies at both the options!");
                }
                break;


            case 4:
                System.out.print("Enter the currency you want it to be converted : ");
                choice2 = scanner.nextInt();
                System.out.println();
                System.out.print("GBP : ");
                gbp = scanner.nextInt();

                if (choice2 == 1) {
                    inr = gbp / 83;
                    System.out.printf("USD : %.2f", inr);
                }
                else if (choice2 == 2) {
                    usd =(float) (gbp * 1.27);
                    System.out.printf("USD : %.2f", usd);
                }
                else if (choice2 == 3) {
                    eur =(float) (gbp * 1.17);
                    System.out.printf("EUR : %.2f", eur);
                }
                else if (choice2 == 5) {
                    cad = (float) (gbp * 1.71);
                    System.out.printf("CAD : %.2f", cad);
                }
                else if (choice2 == 6) {
                    aud = (float) (gbp * 1.93);
                    System.out.printf("AUD : %.2f", aud);
                }
                else if (choice2 == 7) {
                    jpy = (float) (gbp * 190.81);
                    System.out.printf("JPY : %.2f", jpy);
                }
                else if (choice2 == 8) {
                    cny = (float) (gbp * 9.12);
                    System.out.printf("CNY : %.2f", cny);
                }
                else if (choice2 == 9) {
                    chf = (float) (gbp * 1.12);
                    System.out.printf("CHF : %.2f", chf);
                }
                else if (choice2 == 10) {
                    sgd = (float) (gbp * 1.7);
                    System.out.printf("SGD : %.2f", sgd);
                }
                else if (choice2 == 11) {
                    aed = (float) (gbp * 4.66);
                    System.out.printf("AED : %.2f", aed);
                }
                else{
                    System.out.println("Oh no! You entered same currencies at both the options!");
                }
                break;

            case 5:
                System.out.print("Enter the currency you want it to be converted : ");
                choice2 = scanner.nextInt();
                System.out.println();
                System.out.print("INR : ");
                inr = scanner.nextInt();

                if (choice2 == 2) {
                    usd = inr / 83;
                    System.out.printf("USD : %.2f", usd);
                }
                else if (choice2 == 3) {
                    eur = inr / 90;
                    System.out.printf("EUR : %.2f", eur);
                }
                else if (choice2 == 4) {
                    gbp = inr / 105;
                    System.out.printf("GBP : %.2f",gbp);
                }
                else if (choice2 == 5) {
                    cad = inr / 61;
                    System.out.printf("CAD : %.2f", cad);
                }
                else if (choice2 == 6) {
                    aud = inr / 54;
                    System.out.printf("AUD : %.2f", aud);
                }
                else if (choice2 == 7) {
                    jpy = (float) (inr / 0.55);
                    System.out.printf("JPY : %.2f", jpy);
                }
                else if (choice2 == 8) {
                    cny = (float) (inr / 11.5);
                    System.out.printf("CNY : %.2f", cny);
                }
                else if (choice2 == 9) {
                    chf = inr / 91;
                    System.out.printf("CHF : %.2f", chf);
                }
                else if (choice2 == 10) {
                    sgd = inr / 62;
                    System.out.printf("SGD : %.2f", sgd);
                }
                else if (choice2 == 11) {
                    aed = (float) (inr / 22.5);
                    System.out.printf("AED : %.2f", aed);
                }
                else{
                    System.out.println("Oh no! You entered same currencies at both the options!");
                }
                break;

            case 6:
                System.out.print("Enter the currency you want it to be converted : ");
                choice2 = scanner.nextInt();
                System.out.println();
                System.out.print("INR : ");
                inr = scanner.nextInt();

                if (choice2 == 2) {
                    usd = inr / 83;
                    System.out.printf("USD : %.2f", usd);
                }
                else if (choice2 == 3) {
                    eur = inr / 90;
                    System.out.printf("EUR : %.2f", eur);
                }
                else if (choice2 == 4) {
                    gbp = inr / 105;
                    System.out.printf("GBP : %.2f",gbp);
                }
                else if (choice2 == 5) {
                    cad = inr / 61;
                    System.out.printf("CAD : %.2f", cad);
                }
                else if (choice2 == 6) {
                    aud = inr / 54;
                    System.out.printf("AUD : %.2f", aud);
                }
                else if (choice2 == 7) {
                    jpy = (float) (inr / 0.55);
                    System.out.printf("JPY : %.2f", jpy);
                }
                else if (choice2 == 8) {
                    cny = (float) (inr / 11.5);
                    System.out.printf("CNY : %.2f", cny);
                }
                else if (choice2 == 9) {
                    chf = inr / 91;
                    System.out.printf("CHF : %.2f", chf);
                }
                else if (choice2 == 10) {
                    sgd = inr / 62;
                    System.out.printf("SGD : %.2f", sgd);
                }
                else if (choice2 == 11) {
                    aed = (float) (inr / 22.5);
                    System.out.printf("AED : %.2f", aed);
                }
                else{
                    System.out.println("Oh no! You entered same currencies at both the options!");
                }
                break;

            case 7:
                System.out.print("Enter the currency you want it to be converted : ");
                choice2 = scanner.nextInt();
                System.out.println();
                System.out.print("INR : ");
                inr = scanner.nextInt();

                if (choice2 == 2) {
                    usd = inr / 83;
                    System.out.printf("USD : %.2f", usd);
                }
                else if (choice2 == 3) {
                    eur = inr / 90;
                    System.out.printf("EUR : %.2f", eur);
                }
                else if (choice2 == 4) {
                    gbp = inr / 105;
                    System.out.printf("GBP : %.2f",gbp);
                }
                else if (choice2 == 5) {
                    cad = inr / 61;
                    System.out.printf("CAD : %.2f", cad);
                }
                else if (choice2 == 6) {
                    aud = inr / 54;
                    System.out.printf("AUD : %.2f", aud);
                }
                else if (choice2 == 7) {
                    jpy = (float) (inr / 0.55);
                    System.out.printf("JPY : %.2f", jpy);
                }
                else if (choice2 == 8) {
                    cny = (float) (inr / 11.5);
                    System.out.printf("CNY : %.2f", cny);
                }
                else if (choice2 == 9) {
                    chf = inr / 91;
                    System.out.printf("CHF : %.2f", chf);
                }
                else if (choice2 == 10) {
                    sgd = inr / 62;
                    System.out.printf("SGD : %.2f", sgd);
                }
                else if (choice2 == 11) {
                    aed = (float) (inr / 22.5);
                    System.out.printf("AED : %.2f", aed);
                }
                else{
                    System.out.println("Oh no! You entered same currencies at both the options!");
                }
                break;

            case 8:
                System.out.print("Enter the currency you want it to be converted : ");
                choice2 = scanner.nextInt();
                System.out.println();
                System.out.print("INR : ");
                inr = scanner.nextInt();

                if (choice2 == 2) {
                    usd = inr / 83;
                    System.out.printf("USD : %.2f", usd);
                }
                else if (choice2 == 3) {
                    eur = inr / 90;
                    System.out.printf("EUR : %.2f", eur);
                }
                else if (choice2 == 4) {
                    gbp = inr / 105;
                    System.out.printf("GBP : %.2f",gbp);
                }
                else if (choice2 == 5) {
                    cad = inr / 61;
                    System.out.printf("CAD : %.2f", cad);
                }
                else if (choice2 == 6) {
                    aud = inr / 54;
                    System.out.printf("AUD : %.2f", aud);
                }
                else if (choice2 == 7) {
                    jpy = (float) (inr / 0.55);
                    System.out.printf("JPY : %.2f", jpy);
                }
                else if (choice2 == 8) {
                    cny = (float) (inr / 11.5);
                    System.out.printf("CNY : %.2f", cny);
                }
                else if (choice2 == 9) {
                    chf = inr / 91;
                    System.out.printf("CHF : %.2f", chf);
                }
                else if (choice2 == 10) {
                    sgd = inr / 62;
                    System.out.printf("SGD : %.2f", sgd);
                }
                else if (choice2 == 11) {
                    aed = (float) (inr / 22.5);
                    System.out.printf("AED : %.2f", aed);
                }
                else{
                    System.out.println("Oh no! You entered same currencies at both the options!");
                }
                break;


            case 9:
                System.out.print("Enter the currency you want it to be converted : ");
                choice2 = scanner.nextInt();
                System.out.println();
                System.out.print("INR : ");
                inr = scanner.nextInt();

                if (choice2 == 2) {
                    usd = inr / 83;
                    System.out.printf("USD : %.2f", usd);
                }
                else if (choice2 == 3) {
                    eur = inr / 90;
                    System.out.printf("EUR : %.2f", eur);
                }
                else if (choice2 == 4) {
                    gbp = inr / 105;
                    System.out.printf("GBP : %.2f",gbp);
                }
                else if (choice2 == 5) {
                    cad = inr / 61;
                    System.out.printf("CAD : %.2f", cad);
                }
                else if (choice2 == 6) {
                    aud = inr / 54;
                    System.out.printf("AUD : %.2f", aud);
                }
                else if (choice2 == 7) {
                    jpy = (float) (inr / 0.55);
                    System.out.printf("JPY : %.2f", jpy);
                }
                else if (choice2 == 8) {
                    cny = (float) (inr / 11.5);
                    System.out.printf("CNY : %.2f", cny);
                }
                else if (choice2 == 9) {
                    chf = inr / 91;
                    System.out.printf("CHF : %.2f", chf);
                }
                else if (choice2 == 10) {
                    sgd = inr / 62;
                    System.out.printf("SGD : %.2f", sgd);
                }
                else if (choice2 == 11) {
                    aed = (float) (inr / 22.5);
                    System.out.printf("AED : %.2f", aed);
                }
                else{
                    System.out.println("Oh no! You entered same currencies at both the options!");
                }
                break;

            case 10:
                System.out.print("Enter the currency you want it to be converted : ");
                choice2 = scanner.nextInt();
                System.out.println();
                System.out.print("INR : ");
                inr = scanner.nextInt();

                if (choice2 == 2) {
                    usd = inr / 83;
                    System.out.printf("USD : %.2f", usd);
                }
                else if (choice2 == 3) {
                    eur = inr / 90;
                    System.out.printf("EUR : %.2f", eur);
                }
                else if (choice2 == 4) {
                    gbp = inr / 105;
                    System.out.printf("GBP : %.2f",gbp);
                }
                else if (choice2 == 5) {
                    cad = inr / 61;
                    System.out.printf("CAD : %.2f", cad);
                }
                else if (choice2 == 6) {
                    aud = inr / 54;
                    System.out.printf("AUD : %.2f", aud);
                }
                else if (choice2 == 7) {
                    jpy = (float) (inr / 0.55);
                    System.out.printf("JPY : %.2f", jpy);
                }
                else if (choice2 == 8) {
                    cny = (float) (inr / 11.5);
                    System.out.printf("CNY : %.2f", cny);
                }
                else if (choice2 == 9) {
                    chf = inr / 91;
                    System.out.printf("CHF : %.2f", chf);
                }
                else if (choice2 == 10) {
                    sgd = inr / 62;
                    System.out.printf("SGD : %.2f", sgd);
                }
                else if (choice2 == 11) {
                    aed = (float) (inr / 22.5);
                    System.out.printf("AED : %.2f", aed);
                }
                else{
                    System.out.println("Oh no! You entered same currencies at both the options!");
                }
                break;

            case 11:
                System.out.print("Enter the currency you want it to be converted : ");
                choice2 = scanner.nextInt();
                System.out.println();
                System.out.print("INR : ");
                inr = scanner.nextInt();

                if (choice2 == 2) {
                    usd = inr / 83;
                    System.out.printf("USD : %.2f", usd);
                }
                else if (choice2 == 3) {
                    eur = inr / 90;
                    System.out.printf("EUR : %.2f", eur);
                }
                else if (choice2 == 4) {
                    gbp = inr / 105;
                    System.out.printf("GBP : %.2f",gbp);
                }
                else if (choice2 == 5) {
                    cad = inr / 61;
                    System.out.printf("CAD : %.2f", cad);
                }
                else if (choice2 == 6) {
                    aud = inr / 54;
                    System.out.printf("AUD : %.2f", aud);
                }
                else if (choice2 == 7) {
                    jpy = (float) (inr / 0.55);
                    System.out.printf("JPY : %.2f", jpy);
                }
                else if (choice2 == 8) {
                    cny = (float) (inr / 11.5);
                    System.out.printf("CNY : %.2f", cny);
                }
                else if (choice2 == 9) {
                    chf = inr / 91;
                    System.out.printf("CHF : %.2f", chf);
                }
                else if (choice2 == 10) {
                    sgd = inr / 62;
                    System.out.printf("SGD : %.2f", sgd);
                }
                else if (choice2 == 11) {
                    aed = (float) (inr / 22.5);
                    System.out.printf("AED : %.2f", aed);
                }
                else{
                    System.out.println("Oh no! You entered same currencies at both the options!");
                }
                break;
        }

    }
}