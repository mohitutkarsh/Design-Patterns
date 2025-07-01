public class Application {
    private Button button;
    private CheckBox checkbox;

    public Application(UIFactory factory){
        button = factory.createButton();
        checkbox = (CheckBox) factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkbox.tick();
    }
}
