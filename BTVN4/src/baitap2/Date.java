package baitap2;
import java.util.Scanner;
public class Date {
    private int day;
    private int mon;
    private int year;

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay:");
        day=sc.nextInt();
        System.out.println("Nhap thang:");
        mon=sc.nextInt();
        System.out.println("Nhap nam:");
        year=sc.nextInt();
    }

    public void Output(){
        System.out.println(day+"/"+mon+"/"+year);
    }
    public Date() {
    }

    public Date(int day, int mon, int year) {
        this.day = day;
        this.mon = mon;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMon() {
        return mon;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }
}

