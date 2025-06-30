public abstract class Os {
    private String version;
    private String architecture;

    public String getVersion(){
        return version;
    }

    public String setVersion(String version){
        this.version = version;
    }

    public String getArchitecture(){
        return architecture;
    }

    public String setArchitecture(String architecture){
        this.architecture = architecture;
    }

    public Os(String version, String architecture){
        this.version = version;
        this.architecture = architecture;
    }

    public abstract void changeDir(String dir);
    public abstract void removeDir(String dir);
}
