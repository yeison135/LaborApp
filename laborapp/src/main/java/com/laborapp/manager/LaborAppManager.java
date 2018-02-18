package com.laborapp.manager;

import com.laboraapp.persistence.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class LaborAppManager {
    
     public List<Usuario> consultarUsuarios(EntityManager em) {
        Query consulta = em.createNamedQuery("Usuario.findAll");
        List<Usuario> Personas = consulta.getResultList();
        return Personas;
    }
//     public List<Color> consultarColores(EntityManager em) {
//        Query consulta = em.createNamedQuery("Color.findAll");
//        List<Color> colores = consulta.getResultList();
//        return colores;
//    }
//     
//     public List<Color> ochentaColores(EntityManager em) {
//        StringBuilder queryString = new StringBuilder();
//        queryString.append("SELECT C FROM Color C where C.idcolor IS NOT NULL");
//        Query query = em.createQuery(queryString.toString());
//       List<Color> colores = query.setMaxResults(80).getResultList();
//        return colores;
//    }
//     public List<Color> ochoUltimos(EntityManager em) {
//        StringBuilder queryString = new StringBuilder();
//        queryString.append("SELECT C FROM Color C ORDER BY C.idcolor DESC");
//        Query query = em.createQuery(queryString.toString());
//       List<Color> colores = query.setMaxResults(8).getResultList();
//        return colores;
//    }
//      public List<Color> consultarColoresDesmol(EntityManager em) {
//        Query consulta = em.createNamedQuery("Color.findAll");
//        List<Color> colores = consulta.getResultList();
//        List<Color> coloresDes =  new ArrayList<>();
//          for (Color colore : colores) {
//              colore.setDosificacion("0.25");
//              coloresDes.add(colore);
//          }
//        return coloresDes;
//    }
//   
//    public FacturaCotizar calcularFactura(FiltroDTO filtro, EntityManager em)
//            throws Exception {
//        FacturaCotizar factura;
//        filtro.getFiltroDosId();
//        StringBuilder queryString = new StringBuilder();
//        queryString.append("SELECT f FROM FacturaCotizar f WHERE f.idfacturacotizar = :idFactura");
//        Query query = em.createQuery(queryString.toString());
//        if (filtro.getFiltroDosId() != null) {
//            query.setParameter("idFactura", filtro.getFiltroDosId());
//        }
//        factura = (FacturaCotizar) query.getSingleResult();
//        
//        return factura;
//    }
//        public Cliente consulatarCliente(Cliente cliente, EntityManager em)
//            throws Exception {
//        Cliente clienteRetu;
//        StringBuilder queryString = new StringBuilder();
//        queryString.append("SELECT c FROM Cliente c WHERE c.idcliente = :idcliente");
//        Query query = em.createQuery(queryString.toString());
//        if (cliente.getIdcliente()!= null) {
//            query.setParameter("idcliente", cliente.getIdcliente());
//        }
//        clienteRetu = (Cliente) query.getSingleResult();
//        
//        return clienteRetu;
//    }
//    
//    
//     public FacturaCotizar calcularFacturaCoti(FiltroDTO filtro, EntityManager em)
//            throws Exception {
//        FacturaCotizar detalle = new FacturaCotizar();
//        filtro.getFiltroDosId();
//        StringBuilder queryString = new StringBuilder();
//        queryString.append("SELECT f FROM FacturaCotizar f WHERE f.idfacturaCotizar = :idfacturaCotizar");
//        Query query = em.createQuery(queryString.toString());
//        if (filtro.getFiltroDosId() != null) {
//            query.setParameter("idfacturaCotizar", filtro.getFiltroDosId());
//        }
//         try {
//             detalle = (FacturaCotizar) query.getSingleResult();
//         } catch (Exception e) {
//         }
//        return detalle;
//    }
//
//    public Integer registrarCliente(Cliente cliente, EntityManager em)
//            throws Exception {
//        Integer registro;
//        try {
//            em.getTransaction().begin();
//            em.persist(cliente);
//            em.getTransaction().commit();
//            registro = cliente.getIdcliente();
//        } catch (Exception e) {
//            registro = null;
//        }
//
//        return registro;
//    }
//
//    
//     public Integer registrarFacturaCotizar(FacturaCotizar facturaCotizar, EntityManager em)
//            throws Exception {
//        Integer registro;
//        try {
//            em.getTransaction().begin();
//            em.persist(facturaCotizar);
//            em.getTransaction().commit();
//            registro = facturaCotizar.getIdfacturaCotizar();
//        } catch (Exception e) {
//            registro = null;
//        }
//        return registro;
//    }
//
//    public Boolean registrarDetalle(List<DetalleCotizacion> detalleCotizacion, EntityManager em)
//            throws Exception {
//        Boolean registro;
//        try {
//            for (int i = 0; i < detalleCotizacion.size(); i++) {
//                em.getTransaction().begin();
//                em.persist(detalleCotizacion.get(i));
//                em.getTransaction().commit();
//            }
//            registro = true;
//        } catch (Exception e) {
//            registro = null;
//        }
//        return registro;
//    }
//     
//
//    public Persona consultarPersona(FiltroDTO filtro, EntityManager em) {
//        StringBuilder queryString = new StringBuilder();
//        queryString.append("SELECT p FROM Persona p WHERE p.nombre =:nombre");
//        Query query = em.createQuery(queryString.toString());
//        if (filtro.getFiltroUno() != null) {
//            query.setParameter("nombre", filtro.getFiltroUno());
//        }
//        Persona persona = (Persona) query.getSingleResult();
//
//        return persona;
//    }
//    
//    public Boolean consultarUsuario(FiltroDTO filtro, EntityManager em) {
//        Boolean resultado = false;
//        Usuario user = new Usuario();
//        StringBuilder queryString = new StringBuilder();
//        queryString.append("SELECT u FROM Usuario u WHERE u.usuario =:usuario"
//                + " AND u.contrasena =:contrasena");
//        Query query = em.createQuery(queryString.toString());
//        if (filtro.getFiltroUno() != null && filtro.getFiltroUno() != null) {
//            query.setParameter("usuario", filtro.getFiltroUno());
//            query.setParameter("contrasena", filtro.getFiltroDos());
//        }
//        try {
//           user = (Usuario) query.getSingleResult();
//        } catch (Exception e) {
//           resultado = false; 
//        }
//       
//        if (user.getIdusuario() != null) {
//            resultado = true;
//        }
//        return resultado;
//    }
//    
    
}
