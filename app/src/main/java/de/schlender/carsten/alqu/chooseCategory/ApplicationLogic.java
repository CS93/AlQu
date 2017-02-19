package de.schlender.carsten.alqu.chooseCategory;

/**
 * Created by Carsten on 18.02.2017.
 */

public class ApplicationLogic {
    private Data mData;
    private Gui mGui;
    //private DataInterface mDataInterface;

    public ApplicationLogic(Data data, Gui gui) {
        mData = data;
        mGui = gui;
        applyDataToGui();
        //mDataInterface = new DataInterface(mData.getActivity());
    }

    private void applyDataToGui(){
        //Daten zu Gui zuweisen
    }

    /*private void onXxClicked(xx){

    }*/
}
