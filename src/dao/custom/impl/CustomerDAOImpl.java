/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) GDSE-56-GitExam. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.CustomerDAO;
import entity.Customer;

/**
 * @author : Hansani Sewwandi
 * @since 10/9/2021
 **/
public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public boolean save(Customer customer) throws Exception {
        return CrudUtil.execute("INSERT INTO Customer VALUES(?,?,?,?,?,?,?)",customer.getCustomerID(),customer.getCustomeType(),customer.getCustomerName(),customer.getCustomerAddress(),customer.getCity(),customer.getProvince(),customer.getContact());
    }
}
