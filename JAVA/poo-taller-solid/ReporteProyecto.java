public class Proyecto {
    public void agregarTarea(Tarea t) { ... }
    public void calcularAvance() { ... }
    public void listarTareas() { ... }
}

public class ReporteProyecto {
    public void enviarEmailReporte(Proyecto p, String email) { ... }
}

public class RepositorioProyecto {
    public void guardarEnArchivo(Proyecto p, String ruta) { ... }
    public void conectarseABaseDeDatos() { ... }
}