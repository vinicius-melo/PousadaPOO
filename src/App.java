import java.util.Scanner;
import classes.Pousada;

public class App {

    public static void main(String[] args, int j) {
        Scanner sc = new Scanner(System.in);
        Pousada[] pousada = new Pousada[10];
        System.out.println("Ola , deseja fazer uma reserva S/N");
        char resp = sc.next().charAt(0);

        switch (resp) {
            case 'S':

            case 's':
                System.out.println("Ola , vamos la :\n");
                System.out.println("Quantos estudante desejam reservar quartos?");
                int tot = sc.nextInt();

                if (tot <= 10 && tot > 0) {

                    for (int i = 0; i < tot; i++) {
                        System.out.println("escolha os quartos entre 1 - 10");
                        System.out.println("Escolha o quarto desejado pelo estudante: " + i);
                        int quarto = sc.nextInt();

                        if (quarto <= 10 && quarto >= 1) {
                            if (!pousada[quarto].getVaga()) {
                                System.out.println("Informe seu nome:");
                                String nome = sc.next();
                                System.out.println("Innforme seu E-mail para a reserva:");
                                String email = sc.next();
                                pousada[quarto] = new Pousada(nome, email);
                            } else {
                                System.out.println("Você escolheu um quarto q esta ocupado");
                                System.out.println("por gentileza selecione outro");
                                i -= 1;
                            }

                        } else {
                            System.out.println("Você escolheu um quarto inexistente");
                            System.out.println("Por gentileza selecione outro");

                            i -= 1;
                        }
                    }

                }

                System.out.println("--------------Suas Reservas sao ------------");
                System.out.println("--------------------------------------");
                for (int i = 0; i <= 10; i++) {
                    if (pousada[i].getVaga()) {
                        System.out.printf("Quarto: %d\n", i + 1);
                        System.out.println("Nome: " + pousada[i].getNome());
                        System.out.println("Email: " + pousada[i].getEmail());
                        System.out.println("--------------------------------------");
                    }
                }

                break;
            case 'N':

            case 'n':
                System.out.println("OK, obrigado!");
                break;
        }

    }

}
