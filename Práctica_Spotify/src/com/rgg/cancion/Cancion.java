package com.rgg.cancion;

/**
 * @author rgg
 *
 */
public class Cancion {
	
	private String titulo;
	private String artista;
	private String usuario;
	
	/**
	 * @param titulo
	 * @param artista
	 * @param usuario
	 */
	public Cancion(String titulo, String artista, String usuario) {
		this.titulo = titulo;
		this.artista = artista;
		this.usuario = usuario;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the artista
	 */
	public String getArtista() {
		return artista;
	}

	/**
	 * @param artista the artista to set
	 */
	public void setArtista(String artista) {
		this.artista = artista;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
}
