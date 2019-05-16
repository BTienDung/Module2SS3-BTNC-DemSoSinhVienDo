package season_3.DemSoSinhVienDo;

import java.util.Scanner;

public class DemSoSVDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so luong sinh vien: ");
        int maxSv = sc.nextInt();
        int sinhVien[] = new int[maxSv];
        System.out.println("Nhap diem cac sinh vien");
        for (int i=0;i <maxSv; i++){
            System.out.printf("sinhVien["+(i+1)+"]: ");
            sinhVien[i] = sc.nextInt();
        }
        boolean checkPass = true;
        int cout = 0;
        for (int i=0; i<maxSv; i++){
            if (sinhVien[i] >= 5){
                checkPass = true;
                cout++;
            } else {
                checkPass = false;
            }
        }

        System.out.printf("So luong sinh vien da do la: "+cout);
    }
}
