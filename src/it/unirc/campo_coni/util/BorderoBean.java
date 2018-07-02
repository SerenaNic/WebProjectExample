package it.unirc.campo_coni.util;

public class BorderoBean {

	private String codice_ivr;
	private int periodo;
	private int num_record;
	private String stringa;
	
	
	
	public BorderoBean(String codice_ivr, int periodo, int num_record, String stringa) {
		super();
		this.codice_ivr = codice_ivr;
		this.periodo = periodo;
		this.num_record = num_record;
		this.stringa = stringa;
	}
	public BorderoBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public String getCodice_ivr() {
		return codice_ivr;
	}
	public void setCodice_ivr(String codice_ivr) {
		this.codice_ivr = codice_ivr;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public int getNum_record() {
		return num_record;
	}
	public void setNum_record(int num_record) {
		this.num_record = num_record;
	}
	public String getStringa() {
		return stringa;
	}
	public void setStringa(String stringa) {
		this.stringa = stringa;
	}
	@Override
	public String toString() {
		return "BorderoBean [codice_ivr=" + codice_ivr + ", periodo=" + periodo + ", num_record=" + num_record
				+ ", stringa=" + stringa + "]";
	}
	
	
}
