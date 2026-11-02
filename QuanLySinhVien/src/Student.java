public class Student {
    private String maSV;
    private String hoTen;
    private String ngaySinh;

    public Student(String maSV, String hoTen, String ngaySinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void hienThi() {
        System.out.println("Ma SV: " + maSV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
    }
}