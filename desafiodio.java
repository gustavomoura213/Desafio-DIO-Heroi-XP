
import java.util.Scanner;

public class desafiodio {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite seu XP: ");
            int xp = scanner.nextInt();

            System.out.println("Olá, " + nome + "! Você tem " + xp + " de XP.");
   
    
                if ( xp <= 1000) {
                    System.out.println("o Herói de nome " +nome + " está no nível Ferro");//FERRO

                } else if (xp >= 1001 && xp <= 2000) {
                    System.out.println("o Herói de nome " +nome+ " está no nível Bronze");//BRONZE

                } else if (xp >= 2001 && xp <= 5000) {
                   System.out.println("o Herói de nome " +nome + " está no nível Prata");//PRATA

                } else if (xp >= 5001 && xp <= 7000) {
                   System.out.println("o Herói de nome " +nome + " está no nível Ouro");//OURO

                } else if (xp >= 7001 && xp <= 8000) {
                   System.out.println("o Herói de nome " +nome+ " está no nível Platina Diamante");//PLATINA DIAMANTE

                }else if (xp >= 8001 && xp <= 9000) {
                   System.out.println("o Herói de nome " +nome+ " está no nível Ascendente");//ASCENDENTE

                }else if (xp >= 9001 && xp <= 10000){
                   System.out.println("o Herói de nome " +nome+ " está no nível Imortal");//IMORTAL
                    
                }else {
                   System.out.println("o Herói de nome " +nome+ " está no nível Radiante");//RADIANTE
                }
        }
        }        
    }

    

   
