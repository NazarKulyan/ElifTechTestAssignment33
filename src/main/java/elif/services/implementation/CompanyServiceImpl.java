package elif.services.implementation;

import elif.dao.CompanyDao;
import elif.entities.Company;
import elif.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Nazar on 06.10.2016.
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    public CompanyDao companyDao;

    public void createCompany(String companyName, int companyEarnings) {
        Company company = new Company();
        company.setName(companyName);
        company.setEarnings(companyEarnings);
        companyDao.createNewCompany(company);
    }

    public List<Company> findAllCompanies(){
        return companyDao.findAllCompanies();
    }

    public Company findOneCompany(int id){
        return companyDao.findOneCompany(id);
    }

    public void CompanyEdit(int id, String companyName, int companyEarnings) {
        companyDao.editCompany(id,companyName,companyEarnings);
    }

    public void deleteCompany(int id){
        companyDao.deleteCompany(id);
    }


    public void addChild(int ParentId, String companyName, int companyEarnings) {
        companyDao.addChild(ParentId, companyName, companyEarnings);
    }

    public void addChild(int ParentId){

    }

    public List<Company> findChildren(int ParentId) {
        return companyDao.findChildren(ParentId);
    }
}
