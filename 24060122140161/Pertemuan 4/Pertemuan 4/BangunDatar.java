public  class BangunDatar {
    protected int jmlsisi;
    protected String warna;
    protected String border;

    public BangunDatar(){
        jmlsisi = 0;
        warna = "";
        border="";
        }

    public BangunDatar(int jmlsisi,String warna,String border) {
        this.jmlsisi = jmlsisi;
        this.warna = warna;
        this.border = border;
    }

    public int getJmlSisi(){
        return jmlsisi;
    }

    public void setJmlSisi(int jmlsisi){
        this.jmlsisi=jmlsisi;
    }

    public String getWarna(){
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }
    
    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo(){
        System.out.println("jumlah sisi " + jmlsisi);
        System.out.println("warna " + warna);
        System.out.println("border " + border);
    }

}
