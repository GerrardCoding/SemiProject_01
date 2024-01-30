package com.javalec.dto;

public class SelectInsertDTO {
	
	private String id;
    private String pronum;
    private int purqty;
    private double purprice;
    private String purdate;
    private String purcol;
    private String purbrand;

    
    public SelectInsertDTO() {
    	
    }


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPronum() {
		return pronum;
	}


	public void setPronum(String pronum) {
		this.pronum = pronum;
	}


	public int getPurqty() {
		return purqty;
	}


	public void setPurqty(int purqty) {
		this.purqty = purqty;
	}


	public double getPurprice() {
		return purprice;
	}


	public void setPurprice(double purprice) {
		this.purprice = purprice;
	}


	public String getPurdate() {
		return purdate;
	}


	public void setPurdate(String purdate) {
		this.purdate = purdate;
	}


	public String getPurcol() {
		return purcol;
	}


	public void setPurcol(String purcol) {
		this.purcol = purcol;
	}


	public String getPurbrand() {
		return purbrand;
	}


	public void setPurbrand(String purbrand) {
		this.purbrand = purbrand;
	}
    
    

}
