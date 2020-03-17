package action;

import beans.Trabajador;
import mantenimientos.GestionTrabajador;

public class TrabajadorAction {

	private String txtCod;
	private String txtNom;
	private String txtApe;
	private int txtEdad;
	private int rdGen;
	private int cboDep;
	private Trabajador objTra;
	
	public String ingresar(){
		
		objTra = new Trabajador(txtCod, txtNom, txtApe, txtEdad, rdGen, cboDep);
		
		try {
			GestionTrabajador gt = new GestionTrabajador();
			
			gt.RegistrarEntradas(objTra);
			
			return "exito";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	
	public String getTxtCod() {
		return txtCod;
	}
	public void setTxtCod(String txtCod) {
		this.txtCod = txtCod;
	}
	public String getTxtNom() {
		return txtNom;
	}
	public void setTxtNom(String txtNom) {
		this.txtNom = txtNom;
	}
	public String getTxtApe() {
		return txtApe;
	}
	public void setTxtApe(String txtApe) {
		this.txtApe = txtApe;
	}
	public int getTxtEdad() {
		return txtEdad;
	}
	public void setTxtEdad(int txtEdad) {
		this.txtEdad = txtEdad;
	}
	public int getRdGen() {
		return rdGen;
	}
	public void setRdGen(int rdGen) {
		this.rdGen = rdGen;
	}
	public int getCboDep() {
		return cboDep;
	}
	public void setCboDep(int cboDep) {
		this.cboDep = cboDep;
	}

	public Trabajador getObjTra() {
		return objTra;
	}

	public void setObjTra(Trabajador objTra) {
		this.objTra = objTra;
	}
	
	
	
	
}
