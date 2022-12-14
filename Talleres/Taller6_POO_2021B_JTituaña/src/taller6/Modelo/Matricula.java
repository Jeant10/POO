package taller6.Modelo;

public class Matricula {
    public class IdMatricula{
        private long alumno;
        private long asignatura;
        private int anio;

        public IdMatricula(long alumno, long asignatura, int anio) {
            this.alumno = alumno;
            this.asignatura = asignatura;
            this.anio = anio;
        }

        public long getAlumno() {
            return alumno;
        }

        public void setAlumno(long alumno) {
            this.alumno = alumno;
        }

        public long getAsignatura() {
            return asignatura;
        }

        public void setAsignatura(long asignatura) {
            this.asignatura = asignatura;
        }

        public int getAnio() {
            return anio;
        }

        public void setAnio(int anio) {
            this.anio = anio;
        }
    }

    private IdMatricula id;
    private Integer nota=null;

    public Matricula(IdMatricula id) {
        this.id = id;
    }

    public Matricula (long alumno, long asignatura, int anio){
        this.id= new IdMatricula(alumno,asignatura,anio);
    }

    public IdMatricula getId() {
        return id;
    }

    public void setId(IdMatricula id) {
        this.id = id;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "id=" + id +
                ", nota=" + nota +
                '}';
    }
}
