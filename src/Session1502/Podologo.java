package Session1502;

import Session1602.Paciente;

public class Podologo {
    private String hospital;
    private int planta;

    public Podologo(String hospital, int planta) {
        this.hospital = hospital;
        this.planta = planta;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public boolean trabaja (String hospi){
        boolean trabaja=false;
        if (hospi.toLowerCase().equals(hospital.toLowerCase())){
            trabaja = true;
        }

        return trabaja;
    }

    public void pacientes (Paciente [] Paciente){
        for (int i = 0; i< Paciente.length; i++){
            System.out.println(Paciente[i].toString());
        }
    }
}
