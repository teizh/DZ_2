public class Kitchen extends GeekTech{
    String name;
    Integer numberOFPlates;

    public Kitchen(String name, String location) {
        super(name, location);
        this.numberOFPlates=numberOFPlates;
    }

    public Integer getNumberOFPlates() {
        return numberOFPlates;
    }

    public void setNumberOFPlates(Integer numberOFPlates) {
        this.numberOFPlates = numberOFPlates;
    }

    @Override
    public void print() {
        super.print();
    }




}
