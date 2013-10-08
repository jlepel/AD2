package aufgabe2_1;

public class Pair {
    private Integer column;
    private Float element;
    
    public Pair(Integer column, Float element){
        this.column = column;
        this.element = element;
    }
    
    public Integer getColumn(){ return column; }
    
    public Float getElement(){ return element; }
    
    public void setColum(Integer column){ this.column = column; }
    
    public void setElement(Float element){ this.element = element; }

}