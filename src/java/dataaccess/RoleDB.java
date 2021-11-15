/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;


import java.util.List;
import javax.persistence.EntityManager;
import models.Role;

/**
 *
 * @author WebChaiQuan
 */
public class RoleDB {
    
     public List<Role> getAll() throws Exception {
       
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        
        try {
            List<Role> role = em.createNamedQuery("Role.findAll",Role.class).getResultList();
            return role;
        } finally {
            em.close();
        }
    }

}
