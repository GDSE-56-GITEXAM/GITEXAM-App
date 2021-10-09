/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) GDSE-56-GitExam. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package dao;

import entity.SuperEntity;

/**
 * @author : Hansani Sewwandi
 * @since 10/9/2021
 **/
public interface CrudDAO<T extends SuperEntity,CustomerID> extends SuperDAO {
    public  boolean save(T t)throws Exception;
}
