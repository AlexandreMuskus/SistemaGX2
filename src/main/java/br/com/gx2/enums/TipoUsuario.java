package br.com.gx2.enums;

public enum TipoUsuario {
	ATIVO(1, "Ativo"), INATIVO(2, "Inativo"), BLOQUEADO(3, "Bloqueado");
	
	private Integer cod;
	private String descricao;
	
	
	private TipoUsuario(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}


	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoUsuario toEnum(Integer cod) {
		if(cod == null )
			return null;
		for(TipoUsuario x : TipoUsuario.values()) {
			if(cod.equals(x.getCod()))
				return x;
		}
		return null;
	}
	
}
