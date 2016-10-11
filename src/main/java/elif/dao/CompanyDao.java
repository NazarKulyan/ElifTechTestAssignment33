package elif.dao;

import elif.entities.Company;

import javax.transaction.Transactional;
import javax.validation.constraints.AssertFalse;
import java.util.List;

/**
 * Created by Nazar on 06.10.2016.
 */
@Transactional
public interface CompanyDao {
    void createNewCompany(Company company);

    List<Company> findAllCompanies();

    Company findOneCompany(int id);

    void editCompany(int id,String companyName,int companyEarnings);

    void deleteCompany(int id);

    void addChild(int ParentId,String companyName,int companyEarnings);

    List<Company> findChildren(int ParentId);
}
