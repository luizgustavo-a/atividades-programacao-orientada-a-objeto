public class ControleTelevisao {
    private int idControle;
    private String modelo;
    private int canalAtual;
    private boolean ligado;

    public ControleTelevisao(int idControle, String modelo) {
        this.idControle = idControle;
        this.modelo = modelo;
        this.canalAtual = 1;
        this.ligado = false;
    }

    public int getIdControle() {
        return idControle;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void ligarDesligar() {
        this.ligado = !this.ligado;
        if (this.ligado) {
            this.canalAtual = 1;
        }
    }

    public void avancaCanal() {
        if (this.ligado) {
            if (this.canalAtual == 5) {
                this.canalAtual = 1;
            } else {
                this.canalAtual += 1;
            }
        }
    }

    public void retornaCanal() {
        if (this.ligado) {
            if (this.canalAtual == 1) {
                this.canalAtual = 5;
            } else {
                this.canalAtual -= 1;
            }
        }
    }

    public boolean irParaCanal(int canal) {
        if (this.ligado && canal > 0 && canal <= 5){
            this.canalAtual = canal;
            return true;
        }
        return false;
    }
}
