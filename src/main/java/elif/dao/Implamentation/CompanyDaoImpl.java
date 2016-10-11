package elif.dao.Implamentation;

import elif.dao.CompanyDao;
import elif.entities.Company;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.*;

/**
 * Created by Nazar on 06.10.2016.
 */
@Repository
public class CompanyDaoImpl implements CompanyDao {
    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void createNewCompany(Company company) {
        entityManager.persist(company);
    }

    @Transactional
    public void editCompany(int id,String companyName,int companyEarnings){
        Query query;
        query = entityManager.createQuery("update Company c set c.name = :name,c.earnings= :earnings where c.id=:id");
        query.setParameter("id",id);
        query.setParameter("name",companyName);
        query.setParameter("earnings",companyEarnings);
        query.executeUpdate();
    }

    @Transactional
    public void deleteCompany(int id) {
        Query query = entityManager.createQuery("delete from Company where id=:id");
        query.setParameter("id",id);
        query.executeUpdate();
    }

    @Transactional
    public List<Company> findAllCompanies(){
       return entityManager.createQuery("from Company ").getResultList();
    }

    @Transactional
    public Company findOneCompany(int id){
        return entityManager.find(Company.class,id);
    }

    @Transactional
    public void addChild(int ParentId,String companyName,int companyEarnings){
        Company company = new Company(companyName,companyEarnings,ParentId);
        entityManager.persist(company);
    }

    @Transactional
    public List<Company> findChildren(int ParentId){
        Query query;
        query = entityManager.createQuery("from Company where (ParentId = :ParentId)");
        query.setParameter("ParentId",ParentId);
        return query.getResultList();
    }
}
