package br.com.ebix.estoque.modelo.usuario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;


public class TokenDao {

	private static Map<TokenUsuario, Usuario> USUARIOS = new LinkedHashMap<>();

	public TokenDao() {
		popularUsuariosNoMapa();
	}
	
	public boolean ehValido(TokenUsuario usuario) {
		return USUARIOS.containsKey(usuario);
	}
	
	private void popularUsuariosNoMapa() {
		USUARIOS.put(new TokenUsuario("A1A1A1", parseDate("31/3/2018")), new Usuario.Builder().comNome("Nico").comLogin("nico").comSenha("pass").build());
		USUARIOS.put(new TokenUsuario("B2B2B2", parseDate("07/2/2018")), new Usuario.Builder().comNome("Flavio").comLogin("flavio").comSenha("pass").build());
		USUARIOS.put(new TokenUsuario("C3C3C3", parseDate("11/6/2018")), new Usuario.Builder().comNome("Fabio").comLogin("fabio").comSenha("pass").build());
		USUARIOS.put(new TokenUsuario("D4D4D4", parseDate("22/12/2018")), new Usuario.Builder().comNome("Romulo").comLogin("Romulo").comSenha("pass").build());
	}


	private Date parseDate(String dataComoString) {
		try {
			return new SimpleDateFormat("dd/MM/yyyy").parse(dataComoString);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}



}
