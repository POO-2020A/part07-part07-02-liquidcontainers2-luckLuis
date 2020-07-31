
public class Container {
    
    private int contenido;
    
    public Container(){
        
    }
    
    public int contains(){
        return this.contenido;
    }
    
    public void add(int amount){
        if(amount > 0 && this.contenido + amount <= 100){
            this.contenido += amount;
        } else {
            this.contenido = 100;
        }
    }
    
    public void remove(int amount){
        if(this.contenido - amount > 0){
            this.contenido -= amount;
        } else {
            this.contenido = 0;
        }
    }
    
    public String toString(){
        return this.contenido + "/100";
    }
}
