package bai1;

import java.util.Scanner;

public class Date {
    private String day;
    private String mon;
    private String year;

    @Override
    public String toString() {
        return "Date{" +
                "day='" + day + '\'' +
                ", mon='" + mon + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public Date(String day, String mon, String year) {
        this.day = day;
        this.mon = mon;
        this.year = year;
    }

    public Date(){
    }

    public void Innput(){
        Scanner sc= new Scanner((System.in));
        System.out.println("Nhap ngay nhap:");
        day=sc.nextLine();
        System.out.println("Nhap thang nhap:");
        mon=sc.nextLine();
        System.out.println("Nhap nam nhap:");
        year=sc.nextLine();
    }

    public void Outtput(){
        System.out.println("Ngày nhap hàng:"+day+"/"+mon+"/"+year);
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


}
