import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> danhSach = new ArrayList<>();

        danhSach.add(new Student("SV001", "Nguyen Van A", "01/01/2005"));
        danhSach.add(new Student("SV002", "Tran Thi B", "02/02/2005"));
        danhSach.add(new Student("SV003", "Le Van C", "03/03/2005"));

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sinh vien can tim: ");
        String maCanTim = sc.nextLine();

        boolean timThay = false;

        for (Student sv : danhSach) {
            if (sv.getMaSV().equalsIgnoreCase(maCanTim)) {
                System.out.println("Tim thay sinh vien:");
                sv.hienThi();
                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay sinh vien!");
        }

        sc.close();
    }
}