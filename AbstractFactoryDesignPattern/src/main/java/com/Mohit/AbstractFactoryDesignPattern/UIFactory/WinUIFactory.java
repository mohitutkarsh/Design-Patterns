public class WinUIFactory implements UIFactory{

    @Override
    public Button createButton(){
        return new WinButton();
    }

    @Override
    public CheckBox creatCheckBox(){
        return new WinCheckBox();
    }
}
