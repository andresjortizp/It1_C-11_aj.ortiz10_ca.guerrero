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
	
	@JsonProperty(value="tamaño")
	private double tamaño;
	
	@JsonProperty(value="ubicacion")
	private String ubicacion;

	/**
	 * @param capacidad
	 * @param costoDia
	 * @param costoMes
	 * @param costoSemestre
	 * @param idOfertaAlojamiento
	 * @param tamaño
	 * @param ubicacion
	 */
	public OfertaAlojamiento(@JsonProperty(value="capacidad")int capacidad, @JsonProperty(value="costoDia")double costoDia, @JsonProperty(value="costoMes")double costoMes, @JsonProperty(value="costoSemestre")double costoSemestre,
			@JsonProperty(value="idOfertaAlojamiento")Long idOfertaAlojamiento, @JsonProperty(value="tamaño")double tamaño, @JsonProperty(value="ubicacion")String ubicacion) {
		this.capacidad = capacidad;
		this.costoDia = costoDia;
		this.costoMes = costoMes;
		this.costoSemestre = costoSemestre;
		this.idOfertaAlojamiento = idOfertaAlojamiento;
		this.tamaño = tamaño;
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
	 * @return the tamaño
	 */
	public double getTamaño() {
		return tamaño;
	}

	/**
	 * @param tamaño the tamaño to set
	 */
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
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