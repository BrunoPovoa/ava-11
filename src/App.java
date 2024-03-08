
public class App {
    public static void main(String[] args) {

        Maquina maq = new Maquina();

        System.out.println(maq.agua);
        System.out.println(maq.copos200ml);
        System.out.println(maq.copos300ml);

        maq.abastecerAgua(); // inicializa 20000mL
        System.out.println(maq.agua); // mL

        maq.abastecerAgua(); // mantém consistente
        System.out.println(maq.agua); // mL

        maq.servirCopo200(); // não efetua, sem copo
        System.out.println(maq.agua); // mL
    }
}