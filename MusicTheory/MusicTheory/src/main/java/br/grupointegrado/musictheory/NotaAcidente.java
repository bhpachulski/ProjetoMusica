package br.grupointegrado.musictheory;

/**
 *
 * @author bhpachulski
 */
public class NotaAcidente {

    private Nota nota;
    private Acidente acidente;

    public NotaAcidente(Nota nota, Acidente acidente) {
        this.nota = nota;
        this.acidente = acidente;
    }

    public Nota getNota() {
        return nota;
    }

    public Acidente getAcidente() {
        return acidente;
    }

    @Override
    public String toString() {
        return this.getNota() + this.getAcidente().getRepresentação();
    }
    
}
