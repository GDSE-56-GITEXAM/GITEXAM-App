/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) GDSE-56-GitExam. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package bo.custom;

import dto.CustomerDTO;

/**
 * @author : Hansani Sewwandi
 * @since 10/9/2021
 **/
public interface CustomerBo {
    public boolean saveCustomer(CustomerDTO dto)throws Exception;
}
