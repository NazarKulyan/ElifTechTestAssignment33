package elif.services;

import elif.entities.Company;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Nazar on 06.10.2016.
 */
@Service
public interface CompanyService {
    void createCompany(String companyName,int companyEarnings);

    List<Company> findAllCompanies();

    Company findOneCompany(int id);

    void CompanyEdit(int id,String companyName,int companyEarnings);

    void deleteCompany(int id);

    void addChild(int ParentId,String companyName,int companyEarnings);

    List<Company> findChildren(int ParentId);
}
