package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class OfertaAlojamiento {

	@JsonProperty(value="capacidad")
	private int capacidad;
	
	@JsonProperty(value="costoDia")
	private double costoDia;
	
	@JsonProperty(value="costoMes")
	private double costoMes;

	@JsonProperty(value="costoSemestre")
	private double costoSemestre;
	
	@JsonProperty(value="idOfertaAlojamiento")
	private Long idOfertaAlojamiento;
	
	@JsonProperty(value="tama�o")
	private double tama�o;
	
	@JsonProperty(value="ubicacion")
	private String ubicacion;

	/**
	 * @param capacidad
	 * @param costoDia
	 * @param costoMes
	 * @param costoSemestre
	 * @param idOfertaAlojamiento
	 * @param tama�o
	 * @param ubicacion
	 */
	public OfertaAlojamiento(@JsonProperty(value="capacidad")int capacidad, @JsonProperty(value="costoDia")double costoDia, @JsonProperty(value="costoMes")double costoMes, @JsonProperty(value="costoSemestre")double costoSemestre,
			@JsonProperty(value="idOfertaAlojamiento")Long idOfertaAlojamiento, @JsonProperty(value="tama�o")double tama�o, @JsonProperty(value="ubicacion")String ubicacion) {
		this.capacidad = capacidad;
		this.costoDia = costoDia;
		this.costoMes = costoMes;
		this.costoSemestre = costoSemestre;
		this.idOfertaAlojamiento = idOfertaAlojamiento;
		this.tama�o = tama�o;
		this.ubicacion = ubicacion;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the costoDia
	 */
	public double getCostoDia() {
		return costoDia;
	}

	/**
	 * @param costoDia the costoDia to set
	 */
	public void setCostoDia(double costoDia) {
		this.costoDia = costoDia;
	}

	/**
	 * @return the costoMes
	 */
	public double getCostoMes() {
		return costoMes;
	}

	/**
	 * @param costoMes the costoMes to set
	 */
	public void setCostoMes(double costoMes) {
		this.costoMes = costoMes;
	}

	/**
	 * @return the costoSemestre
	 */
	public double getCostoSemestre() {
		return costoSemestre;
	}

	/**
	 * @param costoSemestre the costoSemestre to set
	 */
	public void setCostoSemestre(double costoSemestre) {
		this.costoSemestre = costoSemestre;
	}

	/**
	 * @return the idOfertaAlojamiento
	 */
	public Long getIdOfertaAlojamiento() {
		return idOfertaAlojamiento;
	}

	/**
	 * @param idOfertaAlojamiento the idOfertaAlojamiento to set
	 */
	public void setIdOfertaAlojamiento(Long idOfertaAlojamiento) {
		this.idOfertaAlojamiento = idOfertaAlojamiento;
	}

	/**
	 * @return the tama�o
	 */
	public double getTama�o() {
		return tama�o;
	}

	/**
	 * @param tama�o the tama�o to set
	 */
	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	/**
	 * @return the ubicacion
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * @param ubicacion the ubicacion to set
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}	
}