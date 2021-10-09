/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) GDSE-56-GitExam. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package controller;

import bo.custom.CustomerBo;
import dto.CustomerDTO;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * @author : Hansani Sewwandi
 * @since 10/9/2021
 **/
public class CustomerFormController {
    public TextField txAddress;
    public TextField txCusID;
    public TextField txCustomerName;
    public TextField txProvince;
    public TextField txCustomerType;
    public TextField txCity;
    public TextField txContact;
    public Button btnSave;

    private CustomerBo bo;

    public void SaveOnAction(ActionEvent actionEvent) throws Exception {
        boolean isSaved = bo.saveCustomer(new CustomerDTO(txCusID.getText(),
                txCustomerType.getText(),
                txCustomerName.getText(),
                txAddress.getText(),
                txCity.getText(),
                txProvince.getText(),
                Integer.parseInt(txContact.getText()))
        );
        if (isSaved) {
            new Alert(Alert.AlertType.CONFIRMATION, "Success").showAndWait();

        } else {
            new Alert(Alert.AlertType.CONFIRMATION, "Unsuccess").showAndWait();
        }
        txCusID.clear();
        txCustomerType.clear();
        txCustomerName.clear();
        txAddress.clear();
        txCity.clear();
        txProvince.clear();
        txContact.clear();
    }
    }


