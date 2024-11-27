public class ProxyServicio implements Servicio {
    private ServicioReal servicioReal;
    private boolean tieneAcceso;

    public ProxyServicio(boolean tieneAcceso) {
        this.tieneAcceso = tieneAcceso;
    }

    @Override
    public void realizarOperacion() {
        if (tieneAcceso) {
            if (servicioReal == null) {
                servicioReal = new ServicioReal();
            }
            servicioReal.realizarOperacion();
        } else {
            System.out.println("Acceso denegado. No tienes permisos para realizar esta operación.");
        }
    }
}
