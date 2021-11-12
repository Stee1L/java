public class main {
    public static void main(String[] args) {
        Binary a = new Binary("1001");
        System.out.println("Decimal number is: " + a.getDecimal(a.getNumber()));
        System.out.println(a.getNumber() + " + 10001 = " + a.Addition("10001"));
        System.out.println(a.getNumber() + " - 100 = " + a.Division("100"));
        a.setNumber("12314");
    }
}
