public class Maquina {

    double agua = 0;
    int copos200ml = 0;
    int copos300ml = 0;

    public Maquina () {
    }

    public Maquina(double agua, int copos200ml, int copos300ml) {
        this.agua = agua;
        this.copos200ml = copos200ml;
        this.copos300ml = copos300ml;
    }

    public double getagua() {
        return agua;
    }
    public void setagua(double agua) {
        this.agua = agua;
    }
    public int getCopos200ml() {
        return copos200ml;
    }
    public void setCopos200ml(int copos200ml) {
        this.copos200ml = copos200ml;
    }
    public int getCopos300ml() {
        return copos300ml;
    }
    public void setCopos300ml(int copos300ml) {
        this.copos300ml = copos300ml;
    }

    void abastecerAgua() {
        this.agua = 20000;
    }

    void abastecerCopo200() {
        this.copos200ml = 100;
    }

    void abastecerCopo300() {
        this.copos200ml = 100;
    }

    void servirCopo200() {
        if (this.copos200ml <= 0) {
            System.out.println("O sistema nao possui copos");
        } else {
            this.copos200ml = this.copos200ml - 1;
            this.agua = this.agua - 200;
        }
    }

    void servirCopo300() {
        if (this.copos300ml <= 0) {
            System.out.println("O sistema nao possui copos");
        } else {
            this.copos200ml = this.copos200ml - 1;
            this.agua = this.agua - 300;
        }
    }
}
