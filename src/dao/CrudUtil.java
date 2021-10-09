/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) GDSE-56-GitExam. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static db.DBConnection.getInstance;

/**
 * @author : Hansani Sewwandi
 * @since 10/9/2021
 **/
public class CrudUtil {
    public  static <T> T execute(String sql,Object...args)throws SQLException,ClassNotFoundException {
        PreparedStatement stm = getInstance().getConnection().prepareStatement(sql);
        for (int i = 0; i < args.length; i++) {
            stm.setObject((i + 1), args[i]);
        }
        if (sql.startsWith("SELECT")) {
            return (T) stm.executeQuery();
        }
        return ((T) (Boolean) (stm.executeUpdate()>0));
    }
}
