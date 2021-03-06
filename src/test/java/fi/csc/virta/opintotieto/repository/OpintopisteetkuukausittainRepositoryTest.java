package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Opintopisteetkuukausittain;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class OpintopisteetkuukausittainRepositoryTest extends BaseRepositoryTest<Opintopisteetkuukausittain> {

    @Autowired
    private OpintopisteetkuukausittainRepository repository;

    @Test
    public void testStreamAll() throws Exception {       
          assertStreamResults(Arrays.asList(						
                        createEntity(  1L, "10045ARCADA","ARCADA",12,5,1,"AA","BB","CC","02535", 1, new Date(),2011),
                        createEntity(  2L, "10051ARCADA","ARCADA",11,5,1,"AA","BB","CC","02535", 1, new Date(),2011),
						createEntity(  3L, "10053ARCADA","ARCADA",8,12,2,"AA","BB","CC","02535", 1, new Date(),2011)
						),						
						repository.streamAll()
										);
    }

    private Opintopisteetkuukausittain createEntity(    long id
                                                      , String hkoodi
                                                      , String kk
                                                      , int kuukausi
                                                      , double laajuus
                                                      , int ohjausalakoodi
                                                      , String opintosuoritusavain 
                                                      , String opiskelijaavain
                                                      , String opiskeluoikeusavain
                                                      , String oppilaitos
                                                      , int osluokittelukoodi
                                                      , Date suorituspaivamaara
                                                      , int vuosi ) {
        		
		Opintopisteetkuukausittain entity = new Opintopisteetkuukausittain();
		
		entity.setId(id);
		entity.setHkoodi(hkoodi);
		entity.setKk(kk);	
        entity.setKuukausi(kuukausi);
		entity.setLaajuus(laajuus);
        entity.setOhjausalakoodi(ohjausalakoodi);  
		
        entity.setOpintosuoritusavain(opintosuoritusavain);         
        entity.setOpiskelijaavain(opiskelijaavain);	
        entity.setOpiskeluoikeusavain(opiskeluoikeusavain); 
        
        entity.setOppilaitos(oppilaitos);       
        entity.setOsluokittelukoodi(osluokittelukoodi);     
        entity.setSuorituspaivamaara(suorituspaivamaara);
		entity.setVuosi(vuosi);			
 		
        em.persist(entity);		
        return entity;
    }
}