public class OsFactory {

    private OsFactory(){

    }

    public static Os getInstance(String type, String version, String architecture){
        switch(type){
            case "WINDOWS" : 
                return new WindowsOs(version, architecture);
            case "Linux" : 
                return new LinuxOs(version, architecture);
            default:
                new String("OS not found");
        }
    }
}
