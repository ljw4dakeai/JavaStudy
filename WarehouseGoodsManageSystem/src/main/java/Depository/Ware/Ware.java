package Depository.Ware;

public class Ware {
    private int No;
    private String Name;
    public  int MaxSize;
    private String Local;


    public Ware(int no, String name, int maxSize, String local) {
        No = no;
        MaxSize = maxSize;
        Name = name;
        Local = local;
    }


    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }

    public int getMaxSize() {
        return MaxSize;
    }

    public void setMaxSize(int maxSize) {
        MaxSize = maxSize;
    }
}
