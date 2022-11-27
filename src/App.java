import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        
        int loop = 1;

        while(loop==1){

        System.out.print("\n>Conversor de 24 para 12 hrs<\n\n");
        
        System.out.print("Informe a hora: ");
        int hora=sc.nextInt();
        System.out.print("\nInforme o(s) minuto(s): ");
        int minuto=sc.nextInt();

        int horaConvert=conversor(hora);
        amPm(horaConvert, minuto, hora);
        System.out.println("\nDeseja converter novamente? (1 - Sim) / (2 - Não)");
        loop=sc.nextInt();
        }
        System.out.print("\nFim do programa!");
        sc.close();
    }

    static int conversor(int hora){
        if(hora==0){
            hora=12;
        }else if(hora>=13){
            hora=hora-12;
        }
        return hora;
    }

    static void amPm(int horaConvert, int minuto, int hora){
        if(hora>=0&&hora<12){
            System.out.println("\nHora convertida: "+horaConvert+":"+minuto+" A.M.");
        }else{
            System.out.println("\nHora convertida: "+horaConvert+":"+minuto+" P.M.");
        }
    }
}
