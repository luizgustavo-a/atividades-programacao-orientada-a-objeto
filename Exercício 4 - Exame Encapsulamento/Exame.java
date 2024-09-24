package aula05;

public class Exame {
	private int idExame;
    private int nivelGlicose;
    private String diagnostico;

    public Exame(int idExame, int nivelGlicose) {
		this.idExame = idExame;
		this.nivelGlicose = nivelGlicose;
		obterDiagnostico();
	}

	public int getIdExame() {
		return idExame;
	}

	public int getNivelGlicose() {
		return nivelGlicose;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void alteraNivelGlicose(int nivelGlicose) {
    	this.nivelGlicose = nivelGlicose;
    	obterDiagnostico();
    }
   
    
    private void obterDiagnostico() {
        if(nivelGlicose<=99){
            diagnostico = "Normal";
        }else if (nivelGlicose<=125){
        	diagnostico = "Pré-diabetes";
        }else{
        	diagnostico = "Diabetes";
        }
    }
}
