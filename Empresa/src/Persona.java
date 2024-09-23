public class Persona {
        private String persona ;
        private String dni;
        private String fechaNacimiento;

        public Persona(String persona, String dni, String fechaNacimiento) {
            this.persona = persona;
            this.dni = dni;
            this.fechaNacimiento = fechaNacimiento;
        }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
            return dni;
        }

        @Override
        public String toString() {
            return " Nome='" + persona + '\'' +
                    ", dni='" + dni + '\'' +
                    ", fechaNacimiento='" + fechaNacimiento + '\'';
        }


    }

