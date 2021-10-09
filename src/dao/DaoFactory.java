/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) GDSE-56-GitExam. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package dao;

import dao.custom.impl.CustomerDAOImpl;
import dao.custom.impl.ItemDAOImpl;

/**
 * @author : Hansani Sewwandi
 * @since 10/9/2021
 **/
public class DaoFactory {
    private  static DaoFactory daoFactory;
    private DaoFactory(){
    }
    public static DaoFactory getInstance(){
        return (daoFactory==null)?(daoFactory=new DaoFactory()):(daoFactory);

    }
    public  enum  DAOType{
        CUSTOMER,ITEM
    }
    public <T> T getDao(DAOType type){
        switch (type){

            case CUSTOMER:
                return (T) new CustomerDAOImpl();
            case ITEM:
                return (T) new ItemDAOImpl();
            default:
                return  null;

        }
    }
}
