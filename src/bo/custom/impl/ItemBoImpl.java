/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) GDSE-56-GitExam. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package bo.custom.impl;

import bo.custom.ItemBo;
import dao.DaoFactory;
import dao.custom.ItemDAO;
import dto.ItemDTO;
import entity.Item;

/**
 * @author : Hansani Sewwandi
 * @since 10/9/2021
 **/
public class ItemBoImpl implements ItemBo {
    ItemDAO itemDAO = DaoFactory.getInstance().getDao(DaoFactory.DAOType.ITEM);

    @Override
    public boolean saveItem(ItemDTO dto) throws Exception {
        return itemDAO.save(new Item(dto.getProductID(), dto.getProductName(),dto.getDescription(),dto.getSpecification(),dto.getDisplayName(),dto.getAvaliability(),dto.getActiveState(),dto.getAvailableBrand()));
    }
}
