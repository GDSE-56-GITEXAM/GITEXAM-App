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
import dao.custom.ItemDAO;
import entity.Item;

/**
 * @author : Hansani Sewwandi
 * @since 10/9/2021
 **/
public class ItemDAOImpl implements ItemDAO {
    @Override
    public boolean save(Item item) throws Exception {
        return CrudUtil.execute("INSERT INTO product VALUES(?,?,?,?,?,?,?,?)",item.getProductID(),item.getProductName(),item.getDescription(),item.getSpecification(),item.getDisplayName(),item.getAvaliability(),item.getActiveState(),item.getAvailableBrand());
    }
}
