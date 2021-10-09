/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) GDSE-56-GitExam. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package bo;

import bo.custom.impl.CustomerBoImpl;
import bo.custom.impl.ItemBoImpl;

/**
 * @author : Hansani Sewwandi
 * @since 10/9/2021
 **/
public class BoFactory {
    private static BoFactory boFactory;
    private BoFactory(){

    }
    public static  BoFactory getInstance(){
        return (boFactory==null)?(boFactory=new BoFactory()):(boFactory);

    }
    public  enum BOType{
        CUSTOMER,ITEM
    }
    public <T> T getBo(BOType type){
        switch (type){

            case CUSTOMER:
                return (T)new CustomerBoImpl();
            case ITEM:
                return (T)new ItemBoImpl();
                default:
                return  null;
        }
    }
}
