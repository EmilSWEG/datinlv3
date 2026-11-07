package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;

public class Tekst extends Innlegg {

	private String tekst;

	public Tekst(int id, String bruker, String dato, String tekst) {
		this(id, bruker, dato, 0, tekst);
	}

	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id, bruker, dato, likes);
		this.tekst = tekst;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	String innholdSomTekst() {
		return super.toString() + tekst + "\n";
	}

	@Override
	public String toString() {
		return "TEKST\n" + innholdSomTekst();
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
