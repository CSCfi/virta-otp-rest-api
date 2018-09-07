package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tavoiteajassasuoritettututkinto")
@JsonPropertyOrder(alphabetic = true)
public class Tavoiteajassasuoritettututkinto  {
    
    @Id
    private Long id; 
	private Date alkamispvm;	
	private Integer aloitusvuosi = 0;
	private Integer ika = 0;
	private Integer kaytetytlukukaudet ;
	private String  kk = "";
	private Integer onaiempitutkinto = 0;
	private String opintosuoritusavain = "";
	private String opiskelijaavain = "";
	private String opiskeluoikeusavain = "";
	private String oppilaitosnro = "";
	private Integer paivia = 0;
	private Integer sukupuoli = 0;
	private Integer tavoiteajassavalmistunut = 0;
	private Integer tavoitelukukaudet = 0;
	private Date  tutkinnonsuorituspvm;
	private String tutkintokoodi = "";
	private Integer tutkintovuosi = 0;
	private Integer vaadittuop = 0;
	private double  vuosia = 0.0;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }
	
	
	public Date getAlkamispvm() {
        return alkamispvm;
    }

    public void setAlkamispvm(Date alkamispvm) {
        this.alkamispvm = alkamispvm;
    }   
      		
	public Integer getAloitusvuosi() {
        return aloitusvuosi;
    }

    public void setAloitusvuosi(Integer aloitusvuosi) {
        this.aloitusvuosi = aloitusvuosi;
    }
	
		
    public Integer getIka() {
        return ika;
    }

    public void setIka(Integer ika) {
        this.ika = ika;
    }   
   
    public Integer getKaytetytlukukaudet() {
        return kaytetytlukukaudet;
    }

    public void setKaytetytlukukaudet(Integer kaytetytlukukaudet) {
        this.kaytetytlukukaudet = kaytetytlukukaudet;
    }
		
    public Integer getOnaiempitutkinto() {
        return onaiempitutkinto;
    }

    public void setOnaiempitutkinto(Integer onaiempitutkinto) {
        this.onaiempitutkinto = onaiempitutkinto;
    }
	
	public String getKk() {
        return kk;
    }

    public void setKk(String kk) {
        this.kk = kk;
    }
	
	public String getOpintosuoritusavain() {
        return opintosuoritusavain;
    }

    public void setOpintosuoritusavain(String opintosuoritusavain) {
        this.opintosuoritusavain = opintosuoritusavain;
    }
	
	public String getOpiskelijaavain() {
        return opiskelijaavain;
    }

    public void setOpiskelijaavain(String opiskelijaavain) {
        this.opiskelijaavain = opiskelijaavain;
    }
	
	public String getOpiskeluoikeusavain() {
        return opiskeluoikeusavain;
    }

    public void setOpiskeluoikeusavain(String opiskeluoikeusavain) {
        this.opiskeluoikeusavain = opiskeluoikeusavain;
    }
	
	public String getOppilaitosnro() {
        return oppilaitosnro;
    }

    public void setOppilaitosnro(String oppilaitosnro) {
        this.kk = oppilaitosnro;
    }	
	
	public Integer getPaivia() {
        return  paivia;
    }

    public void setPaivia(Integer paivia) {
        this.paivia = paivia;
    }		
		
    public Integer getSukupuoli() {
        return sukupuoli;
    }

    public void setSukupuoli(Integer sukupuoli) {
        this.sukupuoli = sukupuoli;
    }   

    public Integer getTavoiteajassavalmistunut() {
        return tavoiteajassavalmistunut;
    }

    public void setTavoiteajassavalmistunut(Integer tavoiteajassavalmistunut) {
        this.tavoiteajassavalmistunut = tavoiteajassavalmistunut;
    }     
	
    public Integer getTavoitelukukaudet() {
        return tavoitelukukaudet;
    }

    public void setTavoitelukukaudet(Integer tavoitelukukaudet) {
        this.tavoitelukukaudet = tavoitelukukaudet;
    }  	
	

    public Date getTutkinnonsuorituspvm() {
        return tutkinnonsuorituspvm;
    }

    public void setTutkinnonsuorituspvm(Date tutkinnonsuorituspvm) {
        this.tutkinnonsuorituspvm = tutkinnonsuorituspvm;
    }      		

	public String getTutkintokoodi() {
        return tutkintokoodi;
    }

    public void setTutkintokoodi(String tutkintokoodi) {
        this.tutkintokoodi = tutkintokoodi;
    }		

	
    public Integer getTutkintovuosi() {
        return tutkintovuosi;
    }

    public void setTutkintovuosi(Integer tutkintovuosi) {
        this.tutkintovuosi = tutkintovuosi;
    }   
   	
	
    public Integer getVaadittuop() {
        return vaadittuop;
    }

    public void setVaadittuop(Integer vaadittuop) {
        this.vaadittuop = vaadittuop;
    }   
   	
	
    public double  getVuosia() {
        return vuosia;
    }

    public void setVuosia(double  vuosia) {
        this.vuosia = vuosia;
    }   
	
}