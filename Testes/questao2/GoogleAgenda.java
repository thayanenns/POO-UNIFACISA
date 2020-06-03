package q2;


import java.util.ArrayList;
import java.util.List;

public class GoogleAgenda {
	protected Reuniao[] reunioes;
	protected int tamanho;
	List<Reuniao> reunioesLista;

	public GoogleAgenda() {
		this.reunioes = new Reuniao[10];
		this.tamanho = 0;
	}

	public void adicionarReuniao(Reuniao r) {
		if (tamanho >= reunioes.length) {
			duplicaReunioes();
		}
		this.reunioes[tamanho] = r;
		tamanho++;
	}

	public void adicionarReuniao(Data dia, List<String> participantes) {
		adicionarReuniao(new Reuniao(dia, participantes));
	}

	public void duplicaReunioes() {
		Reuniao[] reuniaoAux = new Reuniao[2 * tamanho];
		for (int i = 0; i < tamanho; i++) {
			reuniaoAux[i] = this.reunioes[i];
		}
		this.reunioes = reuniaoAux;
	}

	public int getQuantidadeReunioes() {
		return tamanho;
	}

	public List<Reuniao> getReunioesDia(Data d) {
		reunioesLista = new ArrayList<Reuniao>();
		for (int i = 0; i <= tamanho; i++) {
			if (reunioes[i] != null)
				if (reunioes[i].getData().getDia() == d.getDia() && reunioes[i].getData().getMes() == d.getMes()
						&& reunioes[i].getData().getAno() == d.getAno()) {
					reunioesLista.add(reunioes[i]);
				}
		}
		return reunioesLista;
	}

	public Reuniao getReuniaoMaisLonga() {
		Reuniao reuniaoMaisLonga = null;
		for (int i = 0; i <= tamanho; i++) {
			if (reuniaoMaisLonga == null)
				if (reunioes[i] != null)
					reuniaoMaisLonga = reunioes[i];
				else if (getDuracao(reunioes[i]) > getDuracao(reuniaoMaisLonga)) {
					reuniaoMaisLonga = reunioes[i];
				}
		}
		return reuniaoMaisLonga;
	}

	protected short getDuracao(Reuniao r) {
		return (short) (r.getData().getHoraFim() - r.getData().getHoraInicio());
	}

	public void removerParticipante(String nome) {
		for (int i = 0; i <= tamanho; i++) {
			if (reunioes[i] != null)
				if (reunioes[i].getParticipantes().contains(nome)) {
					reunioes[i].getParticipantes().remove(nome);
				}
		}

	}

	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o instanceof Data) {
			Data d = (Data) o;
			for (int i = 0; i <= tamanho; i++)
				if (reunioes[i] != null)
					if (reunioes[i].getData().getDia() == d.getDia() && reunioes[i].getData().getMes() == d.getMes()
							&& reunioes[i].getData().getAno() == d.getAno())
						return true;
		}
		return false;
	}

}