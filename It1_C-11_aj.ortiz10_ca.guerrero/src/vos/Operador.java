package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class Operador {

	@JsonProperty(value="cedula_NIT")
	private Long cedula_NIT;
	
	@JsonProperty(value="direccion")
	private String direccion;
	
	@JsonProperty(value="horarioApertura")
	private double horarioApertura;
	
	@JsonProperty(value="horarioCierre")
	private double horarioCierre;
	
	@JsonProperty(value="nombre")
	private String nombre;

	/**
	 * @param cedula_NIT
	 * @param direccion
	 * @param horarioApertura
	 * @param horarioCierre
	 * @param nombre
	 */
	public Operador(@JsonProperty(value="cedula_NIT") Long cedula_NIT, @JsonProperty(value="direccion") String direccion, @JsonProperty(value="horarioApertura") double horarioApertura, 
			@JsonProperty(value="horarioCierre")double horarioCierre, @JsonProperty(value="nombre")String nombre) {
		this.cedula_NIT = cedula_NIT;
		this.direccion = direccion;
		this.horarioApertura = horarioApertura;
		this.horarioCierre = horarioCierre;
		this.nombre = nombre;
	}

	/**
	 * @return the cedula_NIT
	 */
	public Long getCedula_NIT() {
		return cedula_NIT;
	}

	/**
	 * @param cedula_NIT the cedula_NIT to set
	 */
	public void setCedula_NIT(Long cedula_NIT) {
		this.cedula_NIT = cedula_NIT;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the horarioApertura
	 */
	public double getHorarioApertura() {
		return horarioApertura;
	}

	/**
	 * @param horarioApertura the horarioApertura to set
	 */
	public void setHorarioApertura(double horarioApertura) {
		this.horarioApertura = horarioApertura;
	}

	/**
	 * @return the horarioCierre
	 */
	public double getHorarioCierre() {
		return horarioCierre;
	}

	/**
	 * @param horarioCierre the horarioCierre to set
	 */
	public void setHorarioCierre(double horarioCierre) {
		this.horarioCierre = horarioCierre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
}