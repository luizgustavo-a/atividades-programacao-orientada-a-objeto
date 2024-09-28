public class Pneu {
    private int idPneu;
    private String modelo;
    private double indiceDeVida;
    private char estado;
    private int horasDeUso;
    private Fabricante fabricante;

    public Pneu(int idPneu, String modelo, double indiceDeVida, Fabricante fabricante) {
        this.idPneu = idPneu;
        this.modelo = modelo;
        this.indiceDeVida = indiceDeVida;
        this.estado = 'N';
        this.horasDeUso = 0;
        this.fabricante = fabricante;
    }

    public int getIdPneu() {
        return idPneu;
    }

    public String getModelo() {
        return modelo;
    }

    public double getIndiceDeVida() {
        return indiceDeVida;
    }

    public char getEstado() {
        return estado;
    }

    public int getHorasDeUso() {
        return horasDeUso;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean desgastar(int horaInicial, int horaFinal) {
        if (this.estado == 'N' || this.estado == 'U') {
            if (this.estado == 'N') {
                this.estado = 'U';
            }

            int horasDeUso = horaFinal - horaInicial;
            this.indiceDeVida -= horasDeUso * 60 * 0.12345;
            this.horasDeUso += horasDeUso;

            if (this.indiceDeVida <= 0) {
                this.estado = 'F';
            }
            return true;
        }
        return false;
    }
}
