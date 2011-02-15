/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.googlecode.jdbcproc.daofactory.it.testdao.dao;

import com.googlecode.jdbcproc.daofactory.annotation.AMetaLoginInfo;
import com.googlecode.jdbcproc.daofactory.annotation.AStoredProcedure;
import com.googlecode.jdbcproc.daofactory.it.testdao.domain.Company;

import java.util.List;

public interface ICompanyMetaLoginDao {
  
    /**
     * Creates company with secured info
     * @param aCompany company
     */
    @AStoredProcedure(name = "create_company_secured")
    @AMetaLoginInfo        
    void createCompanySecured(Company aCompany);
  
    /**
     * Creates company secured
     *
     * @param aName company name
     * @return company id
     */
    @AStoredProcedure(name = "create_company_secured")
    @AMetaLoginInfo
    long createCompanySecured(String aName);
  
    /**
     * Gets companies' names
     *
     * @return companies's names
     */
    @AStoredProcedure(name = "get_companies_names_secured")
    @AMetaLoginInfo List<String> getCompaniesNamesSecured();
}
