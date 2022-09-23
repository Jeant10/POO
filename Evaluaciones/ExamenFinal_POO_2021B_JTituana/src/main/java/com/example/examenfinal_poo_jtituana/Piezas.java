package com.example.examenfinal_poo_jtituana;

public enum Piezas {

    reynegro("reynegro","imag/reynegro.jpg"),
    reinanegro("reinanegro","imag/reinanegro.jpg"),
    alfilnegro("alfilnegro","imag/alfilnegro.jpg"),
    caballonegro("caballonegro","imag/caballonegro.jpg"),
    peonnegro("peonnegro","imag/peonnegro.jpg"),
    torrenegro("torrenegro","imag/torrenegro.jpg"),


    reyblanco("reyblanco","imag/reyblanco.jpg"),
    reinablanco("reinablanco","imag/reinablanca.jpg"),
    alfilblanco("alfilblanco","imag/alfilblanco.jpg"),
    caballoblanco("caballoblanco","imag/caballoblanco.jpg"),
    peonblanco("peonblanco","imag/peonblanco.jpg"),
    torreblanco("torreblanco","imag/torreblanca.jpg");

    private String desc;

    private Piezas(String desc,String url ){
        this.desc = desc;
        this.url = url;
    }

    private String url;


    public String getDesc(){
        return desc;
    }

    public String getUrl() {
        return url;
    }
}