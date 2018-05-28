/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcvivyan.model.manager;

import arcvivyan.model.entities.Facultad;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 *
 * @author Anderson
 */
@Stateless
public class managerFacultad {
@PersistenceContext(unitName = "carlitosDS")
    private EntityManager em;
public List<Facultad> findFacultades(){
    Query q= em.createNamedQuery("Facultad.findAll", Facultad.class);
    return (List<Facultad>) q;
}
}
