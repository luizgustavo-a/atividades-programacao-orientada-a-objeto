public class PersonagemApp {
    public static void main(String[] args) {
        Personagem personagem = new Personagem(0, "Nome", 2000);

        personagem.recebeGolpe(200);
        System.out.println("Pontos: " + personagem.getPontos());

        personagem.recebeGolpe('m', 200);
        System.out.println("Pontos: " + personagem.getPontos());

        personagem.recebeGolpe('M', 200);
        System.out.println("Pontos: " + personagem.getPontos());

        personagem.recebeGolpe('E', 200);
        System.out.println("Pontos: " + personagem.getPontos());
    }
}
