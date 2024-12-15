class Empleado {
    private int idempleado;
    private String nombre;
    private String dninie;
    private String fechacontratacion;
    private double salario;
    private String departamento;
    private String tareasasignadas;
    private double experiencia;  

    public Empleado() {}

    public Empleado(int idempleado, String nombre, String dninie, String fechacontratacion, double salario, String departamento, String tareasasignadas, double experiencia) {
        this.idempleado = idempleado;
        this.nombre = nombre;
        this.dninie = dninie;
        this.fechacontratacion = fechacontratacion;
        this.salario = salario;
        this.departamento = departamento;
        this.tareasasignadas = tareasasignadas;
        this.experiencia = experiencia;
    }

    protected void calcularSalario() {
        System.out.println("Calculando el salario");
    }

    protected void asignarTarea() {
        System.out.println("Tarea asignada");
    }

    protected void solicitarVacaciones() {
        System.out.println("Solicitud enviada");
    }
    
    //Este metodo es únicamte para mostrar los datos de Empleado solicitado en el ejercicio
    public void mostrarDatos() {
    	System.out.println("ID Empleado: " + idempleado);
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI/NIE: " + dninie);
        System.out.println("Fecha de Contratación: " + fechacontratacion);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("Tareas Asignadas: " + tareasasignadas);
        System.out.println("Experiencia: " + experiencia + " años");
    }

    
    public void setidempleado(int idempleado) {
        this.idempleado = idempleado;
    }
    
    public int getidempleado() {
        return idempleado;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getnombre() {
        return nombre;
    }

   
}

class Administrativo {
    public String areadministracion;

    public Administrativo() {}

    public Administrativo(String areadadministracion) {
        this.areadministracion = areadadministracion;
    }

    public void solicitarDocumento() {
        System.out.println("Documento solicitado");
    }

    public void solicitarCompra() {
        System.out.println("Compra solicitada");
    }

    protected void aprobarVacaciones() {
        System.out.println("Vacaciones aprobadas");
    }

    protected void calcularNomina() {
        System.out.println("Calculando nómina...");
    }

    public void setareadadministracion(String areadministracion) {
        this.areadministracion = areadministracion;
    }

    public String getareadadministracion() {
        return areadministracion;
    }
}

class Informatico {
    public String lenguajesprogramacion;
    public String sistemasinformaticos;

    public Informatico() {}

    public Informatico(String lenguajesprogramacion, String sistemasinformaticos) {
        this.lenguajesprogramacion = lenguajesprogramacion;
        this.sistemasinformaticos = sistemasinformaticos;
    }

    protected void solucionarIncidencia() {
        System.out.println("Solucionando incidencia...");
    }

    protected void desarrolloSoftware() {
        System.out.println("Picando código...");
    }

    public void reportarIncidencia() {
        System.out.println("Incidencia reportada");
    }

    public void setlenguajesprogramacion(String lenguajesprogramacion) {
        this.lenguajesprogramacion = lenguajesprogramacion;
    }

    public String getlenguajesprogramacion() {
        return lenguajesprogramacion;
    }

    public void setsistemasinformaticos(String sistemasinformaticos) {
        this.sistemasinformaticos = sistemasinformaticos;
    }

    public String getsistemasinformaticos() {
        return sistemasinformaticos;
    }
}

class Contable {
    public String nivelusosoftware;

    public Contable() {}

    public Contable(String nivelusosoftware) {
        this.nivelusosoftware = nivelusosoftware;
    }

    protected void autorizarCompra() {
        System.out.println("Compra autorizada");
    }

    protected void informeContable() {
        System.out.println("Realizando informe...");
    }

    protected void realizarPago() {
        System.out.println("Pago realizado");
    }

    public void setnivelusosoftware(String nivelusosoftware) {
        this.nivelusosoftware = nivelusosoftware;
    }

    public String getnivelusosoftware() {
        return nivelusosoftware;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado(1, "Angel", "77183235L", "12-12-2014", 2000.00, "Programacion", "Revisar bug", 10);
        empleado.calcularSalario();
        empleado.asignarTarea();
        empleado.solicitarVacaciones();
        empleado.mostrarDatos();
        

        Administrativo administrativo = new Administrativo("Recursos Humanos");
        administrativo.solicitarDocumento();
        administrativo.solicitarCompra();
        administrativo.aprobarVacaciones();
        administrativo.calcularNomina();

        Informatico informatico = new Informatico("Java, Python", "Windows");
        informatico.solucionarIncidencia();
        informatico.desarrolloSoftware();
        informatico.reportarIncidencia();

        Contable contable = new Contable("Excel nivel avanzado");
        contable.autorizarCompra();
        contable.informeContable();
        contable.realizarPago();
    }
}

