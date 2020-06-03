package questao2;

public class Pessoa {
	private String nome;

	public void setNome(String nome) throws NomeInvalidoException 
	{
		if (nome.isEmpty()) 
		{
			throw new NomeInvalidoException("O nome fornecido não pode ser nulo ou vazio");
		}
		this.nome = nome;
	}

	public String getNomeInvertido() {
		StringBuilder builder = new StringBuilder();
		for (int i = nome.length() - 1; i >= 0; i--) {
			builder.append(nome.charAt(i));
		}
		return builder.toString();
	}
}