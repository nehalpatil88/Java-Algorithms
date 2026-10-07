public class LeapYear {
    static void main() {
        int year=2024;
      boolean isLeap=(year %4==0 && year %400!=0)|| (year %400==0);
        System.out.println(isLeap);
    }
}
