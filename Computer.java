public class Computer{
    private String marca;
    private String processore;
    private int ram; // GB
    
    //getter&setter

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getProcessore() {
        return processore;
    }
    public void setProcessore(String processore) {
        this.processore = processore;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public void toString(){
        System.out.println("Marca: " + marca + ", Processore: " + processore + ", RAM: " + ram + "GB");
    }

    public int compareTo(Computer altroComputer){
        if (this.getRam < altroComputer.getRam()){
            return -1
        }
        else if (this.getRam > altroComputer.getRam()){
            return 1
        }
        else {
            return 0
        }
    }

        //cost

        public Computer(String marca, String processore, int ram){
                this.marca = marca;
                this.processore = processore;
                this.ram = ram;
        }

    }
    
}