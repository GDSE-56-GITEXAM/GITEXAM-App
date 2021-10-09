/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) GDSE-56-GitExam. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package bo.custom.impl;

import bo.custom.CustomerBo;
import dao.DaoFactory;
import dao.custom.CustomerDAO;
import dto.CustomerDTO;
import entity.Customer;

/**
 * @author : Hansani Sewwandi
 * @since 10/9/2021
 **/
public class CustomerBoImpl implements CustomerBo {
    CustomerDAO customerDAO= DaoFactory.getInstance().getDao(DaoFactory.DAOType.CUSTOMER);

    @Override
    public boolean saveCustomer(CustomerDTO dto) throws Exception {
        return customerDAO.save(new Customer(dto.getCustomerID(),dto.getCustomeType(),dto.getCustomerName(),dto.getCustomerAddress(),dto.getCity(),dto.getProvince(),dto.getContact()));
    }
}
