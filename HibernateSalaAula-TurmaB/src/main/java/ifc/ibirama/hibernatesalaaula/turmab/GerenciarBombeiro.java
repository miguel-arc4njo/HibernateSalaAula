/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernatesalaaula.turmab;

import ifc.ibirama.hibernatesalaaula.turmab.entidades.Bombeiro;
import ifc.ibirama.hibernatesalaaula.turmab.util.HibernateUtil;
import java.time.LocalDate;
import java.time.Month;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author aluno
 */
public class GerenciarBombeiro {
    
    public static void main(String[] args) {
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        System.out.println("Conexão estabelecida com sucesso !!");
        
        Bombeiro bombeiro01 = new Bombeiro();
        bombeiro01.setCpf("1234567812");
        bombeiro01.setDataNascimento(LocalDate.of(1990, Month.JANUARY, 22));
        bombeiro01.setNome("Fulano da Silva");
        bombeiro01.setGuerra("Silva");
        
         Transaction transacao = null;
         
         try {
            transacao = sessao.beginTransaction();
            sessao.persist(bombeiro01);
            
            transacao.commit();
            
            System.out.println("Bombeiro 'salvo' ");
            
            sessao.close();
            
        } catch (Exception erro) {
            if (transacao != null) {
                transacao.rollback();
            }
        }
        
        HibernateUtil.shutdown();
        
        
    
//        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
//        System.out.println("Sessão estabelecida com sucesso !!");       
//        Transaction transacao = null;
//        
//        Bombeiro bombeiro = new Bombeiro();
//        bombeiro.setCpf("12345678");
//        bombeiro.setDataNascimento(LocalDate.of(1990, 2, 22));
//        bombeiro.setNome("Fulano da Silva");
//        bombeiro.setGuerra("Silva");
//        
//        try {
//            transacao = sessao.beginTransaction();
//            sessao.persist(bombeiro);
//            
//            transacao.commit();
//            
//            System.out.println("Bombeiro 'salvo' ");
//            
//            sessao.close();
//            
//        } catch (Exception e) {
//            if (transacao != null) {
//                transacao.rollback();
//            }
//            
//        }
//        
//        HibernateUtil.shutdown();
    
} 
    
}