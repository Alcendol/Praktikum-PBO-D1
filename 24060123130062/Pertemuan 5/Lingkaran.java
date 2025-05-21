package pertemuan5;

public class Lingkaran extends BangunDatar implements IRezise{
    //Atribut
    private double jari;

    //konstruktor
    public Lingkaran(){
        setJmlSisi(1);
    }

    //konstruktor dengan parameter
    public Lingkaran(double diameter, String warna, String border){
        jari = (diameter / 2);
        setWarna(warna);
        setBorder(border);
        setJmlSisi(1);
    }

    //selektor jari2
    public double getJari(){
        return this.jari;
    }

    //mutator jari2
    public void setJari(double jari){
        this.jari = jari;
    }

    //selektor luas
    public double getLuas(){
        return 3.14 * Math.pow(jari, 2);
    }

    public double getDiameter(){
        return jari * 2;
    }

    //selektor keliling
    public double getKeliling(){
        return 3.14 * getDiameter();
    }

    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(Integer percent){
        jari = jari * percent/100;
    }
}
