package com.linktic.dupis;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class SolicitudDupis implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "SOLICITUDDUPIS_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "SOLICITUDDUPIS_ID_SEQ", name = "SOLICITUDDUPIS_ID_GENERATOR")
	private java.lang.Long id;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label(value = "Solicitante")
	private com.linktic.dupis.Persona solicitante;

	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label(value = "Secundarios")
	private java.util.List<com.linktic.dupis.Persona> secundarios;

	@org.kie.api.definition.type.Label(value = "Tipo Declaratoria")
	private java.lang.String tipoDeclaratoria;

	@org.kie.api.definition.type.Label(value = "Tipo Proyecto")
	private java.lang.String tipoProyecto;

	@org.kie.api.definition.type.Label(value = "Nombre Proyecto")
	private java.lang.String nombreProyecto;

	@org.kie.api.definition.type.Label(value = "Descripción")
	private java.lang.String descripcionProyecto;

	@javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label(value = "Area de Influencia Departamentos")
	private java.util.List<java.lang.String> areaInfluenciaDpto;

	@javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label(value = "Area de Influencia Municipios")
	private java.util.List<java.lang.String> areaInfluenciaMcpio;

	@org.kie.api.definition.type.Label(value = "Expediente")
	private java.lang.String numeroExpediente;

	@org.kie.api.definition.type.Label(value = "Radicado Solicitud")
	private java.lang.String numeroRadicado;

	public SolicitudDupis() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public com.linktic.dupis.Persona getSolicitante() {
		return this.solicitante;
	}

	public void setSolicitante(com.linktic.dupis.Persona solicitante) {
		this.solicitante = solicitante;
	}

	public java.util.List<com.linktic.dupis.Persona> getSecundarios() {
		return this.secundarios;
	}

	public void setSecundarios(
			java.util.List<com.linktic.dupis.Persona> secundarios) {
		this.secundarios = secundarios;
	}

	public java.lang.String getTipoDeclaratoria() {
		return this.tipoDeclaratoria;
	}

	public void setTipoDeclaratoria(java.lang.String tipoDeclaratoria) {
		this.tipoDeclaratoria = tipoDeclaratoria;
	}

	public java.lang.String getTipoProyecto() {
		return this.tipoProyecto;
	}

	public void setTipoProyecto(java.lang.String tipoProyecto) {
		this.tipoProyecto = tipoProyecto;
	}

	public java.lang.String getNombreProyecto() {
		return this.nombreProyecto;
	}

	public void setNombreProyecto(java.lang.String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public java.lang.String getDescripcionProyecto() {
		return this.descripcionProyecto;
	}

	public void setDescripcionProyecto(java.lang.String descripcionProyecto) {
		this.descripcionProyecto = descripcionProyecto;
	}

	public java.util.List<java.lang.String> getAreaInfluenciaDpto() {
		return this.areaInfluenciaDpto;
	}

	public void setAreaInfluenciaDpto(
			java.util.List<java.lang.String> areaInfluenciaDpto) {
		this.areaInfluenciaDpto = areaInfluenciaDpto;
	}

	public java.util.List<java.lang.String> getAreaInfluenciaMcpio() {
		return this.areaInfluenciaMcpio;
	}

	public void setAreaInfluenciaMcpio(
			java.util.List<java.lang.String> areaInfluenciaMcpio) {
		this.areaInfluenciaMcpio = areaInfluenciaMcpio;
	}

	public java.lang.String getNumeroExpediente() {
		return this.numeroExpediente;
	}

	public void setNumeroExpediente(java.lang.String numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	public java.lang.String getNumeroRadicado() {
		return this.numeroRadicado;
	}

	public void setNumeroRadicado(java.lang.String numeroRadicado) {
		this.numeroRadicado = numeroRadicado;
	}

	public SolicitudDupis(java.lang.Long id,
			com.linktic.dupis.Persona solicitante,
			java.util.List<com.linktic.dupis.Persona> secundarios,
			java.lang.String tipoDeclaratoria, java.lang.String tipoProyecto,
			java.lang.String nombreProyecto,
			java.lang.String descripcionProyecto,
			java.util.List<java.lang.String> areaInfluenciaDpto,
			java.util.List<java.lang.String> areaInfluenciaMcpio,
			java.lang.String numeroExpediente, java.lang.String numeroRadicado) {
		this.id = id;
		this.solicitante = solicitante;
		this.secundarios = secundarios;
		this.tipoDeclaratoria = tipoDeclaratoria;
		this.tipoProyecto = tipoProyecto;
		this.nombreProyecto = nombreProyecto;
		this.descripcionProyecto = descripcionProyecto;
		this.areaInfluenciaDpto = areaInfluenciaDpto;
		this.areaInfluenciaMcpio = areaInfluenciaMcpio;
		this.numeroExpediente = numeroExpediente;
		this.numeroRadicado = numeroRadicado;
	}

}