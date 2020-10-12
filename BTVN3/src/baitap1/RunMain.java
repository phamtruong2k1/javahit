package baitap1;

public class RunMain {
    public static void main(String[] args) {
        Person DoanXinhGai = new Person();
        Person DiepBueDe = new Person();
        DoanXinhGai.setName("Vũ Văn Doan");
        DoanXinhGai.setDateOfBirth("01/01/2000");
        DoanXinhGai.setGender("Nam");
        DoanXinhGai.setHobby("None");
        DiepBueDe.setName("Nguyễn Đức Điệp");
        DiepBueDe.setDateOfBirth("01/01/2000");
        DiepBueDe.setGender("Nam");
        DiepBueDe.setHobby("None");
        System.out.println("Thông tin của DoanXinhGai");
        System.out.println("Tên : " + DoanXinhGai.getName());
        System.out.println("Date of birth : " + DoanXinhGai.getDateOfBirth());
        System.out.println("Giới tính : " + DoanXinhGai.getGender());
        System.out.println("Sở thích : " + DoanXinhGai.getHobby());
        System.out.println("Thông tin của DiepBueDe");
        System.out.println("Tên : " + DiepBueDe.getName());
        System.out.println("Date of birth : " + DiepBueDe.getDateOfBirth());
        System.out.println("Giới tính : " + DiepBueDe.getGender());
        System.out.println("Sở thích : " + DiepBueDe.getHobby());
    }
}
