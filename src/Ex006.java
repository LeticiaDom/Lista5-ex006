import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 

        while (true) {
            System.out.println("Digite uma hora: ");
            int hora = sc.nextInt();
            System.out.println("Digite os minutos: ");
            int minutos = sc.nextInt();  
            int horarioCon = conversor(hora); 
            saida(hora, horarioCon, minutos); 
            
            System.out.println("Deseja informar um novo horario? ");
            String resp = sc.next(); 
            if (resp.equalsIgnoreCase("nao")) {
                break; 
            }
        }
        sc.close();

        
    }
    public static int conversor(int horario) {
        if (horario > 12) {
            horario -= 12;
        } else {
            return horario; 
        } 
        return horario; 
    } 
    public static void saida(int horario, int horarioCon, int minutos) {
        String a = "A.M", p = "P.M"; 

        if (horario > 12) {
            System.out.println("O horario que foi digitado é: " + horarioCon + ":" + minutos + " " + p);
        } else {
            System.out.println("O horario que foi digitado é: " + horarioCon + ":" + minutos + " " + a);
        }
    }
}
