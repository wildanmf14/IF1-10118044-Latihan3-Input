package latihan.input;
import java.util.Scanner;
/*
Nama        : Wildan Muhammad Fikri
Kelas       : IF1
NIM         : 10118044
Deskripsi   : Memasukkan nilai dari keyboard
 */
public class Input {
	
	
	public static void main(String[] args) {
        System.out.print("Masukkan nama anda : ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Nama anda adalah " + name);
    }
}
