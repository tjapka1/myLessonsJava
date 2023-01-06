import java.text.DecimalFormat;

public  class Accounts {

    private String iBAN;
    public double balance;
    private boolean secure;
    private static boolean secureAll1=false;

    public Accounts(String iBAN, double balance, boolean secure) {
        this.iBAN = iBAN;
        this.balance = balance;
        this.secure=secure;
    }

    public boolean isSecure() {
        return secure;
    }

    public boolean isSecureAll1() {
        return secureAll1;
    }

    public static void setSecureAll1(boolean secureAll) {
        if (secureAll) secureAll1 = true;
        else secureAll1 = false;
            }

    public void setSecure(boolean secure) {
        this.secure = secure;
    }

    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String ibanForm(String iBAN) {
        char x = '-';

        String ib1 = iBAN.substring(0, 04).toUpperCase();
        String ib2 = iBAN.substring(4);

        return ib1 + x + ib2;
    }

    public String secureToString1(String iBAN) {
        char x = '*';
        String ib1 = "";
        for (int i = 0; i < iBAN.length(); i++) {
            if (i < 9 || i >= iBAN.length() - 4) {
                ib1 += iBAN.charAt(i);
            } else {
                ib1 += x;
            }
        }
        return ib1;
    }

    public String secureToString2(String iBAN) {
        char x = '*';
        String ib1 = "";
        char[] ibanArrey = iBAN.toCharArray();
        for (int i = 8; i < ibanArrey.length - 4; i++) {
            ibanArrey[i] = x;
            }
        ib1 = new String(ibanArrey);
        return ib1;
    }
    public String secureToString3(String iBAN) {
        String x = "*";
        String ib1 = "";
        if (iBAN.length()>6) {
            ib1 = iBAN.substring(0, 9) + x.repeat(iBAN.length() - 6) + iBAN.substring(iBAN.length() - 4);
        }
        else {
            ib1=iBAN;
        }

        return ib1;
    }

    public String ibanToStringSecure( String iBAN){
        if (secure==true && secureAll1==true){return secureToString3(ibanForm(iBAN));}
        if (secure==false && secureAll1==false){return ibanForm(iBAN);}
        if (secure==false && secureAll1==true){return ibanForm(iBAN);}
       if (secure==true && secureAll1==false){return ibanForm(iBAN);}
        return null;
    }

    DecimalFormat df = new DecimalFormat(".00");

    public String toString() {
     return "|   " +  ibanToStringSecure(iBAN)+
                "               " + " balance " + df.format(balance);
    }
}