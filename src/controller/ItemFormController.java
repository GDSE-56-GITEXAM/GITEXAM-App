/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) GDSE-56-GitExam. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package controller;

import bo.custom.ItemBo;
import dto.ItemDTO;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * @author : Hansani Sewwandi
 * @since 10/9/2021
 **/
public class ItemFormController {
    public TextField txtProductName;
    public TextField txtDescription;
    public TextField txtProductID;
    public TextField txtSpecification;
    public TextField txtDisplayName;
    public TextField txtAvaliability;
    public TextField txtActiveState;
    public TextField txtAvailableBrands;
    public Button btnsave;

    private ItemBo bo;

    public void saveOnAction(ActionEvent actionEvent) throws Exception {
        boolean isSaved = bo.saveItem(
                new ItemDTO(txtProductID.getText(),txtProductName.getText(),txtDescription.getText(),txtSpecification.getText(),txtDisplayName.getText(),Boolean.parseBoolean(txtAvaliability.getText()),Boolean.parseBoolean(txtActiveState.getText()),txtAvailableBrands.getText()
                ));
        if (isSaved){
            new Alert(Alert.AlertType.CONFIRMATION,"Success").showAndWait();

        }else {
            new Alert(Alert.AlertType.CONFIRMATION,"Unsuccess").showAndWait();
        }
        txtProductID.clear();
        txtProductName.clear();
        txtDescription.clear();
        txtSpecification.clear();
        txtDisplayName.clear();
        txtAvaliability.clear();
        txtActiveState.clear();
        txtAvailableBrands.clear();
    }
}
